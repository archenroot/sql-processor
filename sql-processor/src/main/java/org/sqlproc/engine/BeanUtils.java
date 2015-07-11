package org.sqlproc.engine;

import java.beans.BeanInfo;
import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bean utilities.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class BeanUtils {

    private static ConcurrentHashMap<String, Constructor<?>> constructors = new ConcurrentHashMap<String, Constructor<?>>();
    private static ConcurrentHashMap<String, PropertyDescriptor[]> descriptors = new ConcurrentHashMap<String, PropertyDescriptor[]>();
    private static ConcurrentHashMap<String, Class<?>> types = new ConcurrentHashMap<String, Class<?>>();
    private static ConcurrentHashMap<String, Method> getters = new ConcurrentHashMap<String, Method>();
    private static ConcurrentHashMap<String, GetterType> typeGetters = new ConcurrentHashMap<String, GetterType>();
    private static ConcurrentHashMap<String, Method> setters = new ConcurrentHashMap<String, Method>();
    private static ConcurrentHashMap<String, Method> methods = new ConcurrentHashMap<String, Method>();

    /**
     * The internal slf4j logger.
     */
    static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    // instances

    private static Constructor<?> getInstanceConstructor(SqlRuntimeContext runtimeCtx, Class<?> clazz) {
        String keyName = clazz.getName();
        Constructor<?> ctor = constructors.get(keyName);
        if (ctor != null)
            return ctor;

        if ((clazz.getModifiers() & 0x0400) != 0) {
            logger.warn("getInstance: " + clazz + " is abstract");
            return null;
        }
        try {
            ctor = clazz.getConstructor();
            try {
                ctor.setAccessible(true);
            } catch (SecurityException se) {
                logger.warn("getInstance: " + clazz + " " + se.getMessage());
            }
        } catch (NoSuchMethodException e) {
            logger.warn("getInstance: " + clazz + " " + e.getMessage());
        } catch (SecurityException e) {
            logger.warn("getInstance: " + clazz + " " + e.getMessage());
        }
        if (ctor == null) {
            Constructor<?>[] ctors = clazz.getConstructors();
            for (int i = 0, size = ctors.length; i < size; i++) {
                Class<?>[] ctorParams = ctors[i].getParameterTypes();
                if (ctorParams.length == 0) {
                    if (Modifier.isPublic(ctor.getModifiers())) {
                        Class<?> _clazz = ctor.getDeclaringClass();
                        if (Modifier.isPublic(_clazz.getModifiers()))
                            ctor = ctors[i];
                    }
                    if (ctor != null) {
                        try {
                            ctor.setAccessible(true);
                        } catch (SecurityException se) {
                            logger.warn("getInstance: " + clazz + " " + se.getMessage());
                        }
                    }
                }
            }
        }
        if (ctor == null)
            return null;

        Constructor<?> ctorPrev = constructors.putIfAbsent(keyName, ctor);
        if (ctorPrev != null)
            return ctorPrev;
        return ctor;
    }

    public static Object getInstance(SqlRuntimeContext runtimeCtx, Class<?> clazz) {
        Constructor<?> ctor = getInstanceConstructor(runtimeCtx, clazz);
        if (ctor == null) {
            logger.warn("getInstance: " + clazz + " can't get constructor");
        }

        try {
            return ctor.newInstance();
        } catch (InstantiationException e) {
            logger.error("getInstance: " + clazz, e);
            return null;
        } catch (IllegalAccessException e) {
            logger.error("getInstance: " + clazz, e);
            return null;
        } catch (IllegalArgumentException e) {
            logger.error("getInstance: " + clazz, e);
            return null;
        } catch (InvocationTargetException e) {
            logger.error("getInstance: " + clazz, e);
            return null;
        }
    }

    private static PropertyDescriptor[] getDescriptors(Class<?> clazz) {
        String keyName = clazz.getName();
        PropertyDescriptor[] _descriptors = descriptors.get(keyName);
        if (_descriptors != null)
            return _descriptors;

        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(clazz);
        } catch (IntrospectionException e) {
            logger.error("getDescriptors: " + clazz, e);
            return null;
        }

        _descriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor pd : _descriptors) {
            if (pd instanceof IndexedPropertyDescriptor) {
                logger.warn("getDescriptors: " + clazz + " unsupported IndexedPropertyDescriptor "
                        + pd.getDisplayName());
            }
        }

        PropertyDescriptor[] _descriptorsPrev = descriptors.putIfAbsent(keyName, _descriptors);
        if (_descriptorsPrev != null)
            return _descriptorsPrev;
        return _descriptors;
    }

    private static PropertyDescriptor getAttributeDescriptor(Class<?> clazz, String attrName) {
        PropertyDescriptor descriptor = null;
        PropertyDescriptor[] descriptors = getDescriptors(clazz);
        if (descriptors != null) {
            for (PropertyDescriptor _descriptor : descriptors) {
                if (_descriptor.getName().equalsIgnoreCase(attrName)) {
                    descriptor = _descriptor;
                    break;
                }
            }
        }
        return descriptor;
    }

    // attributes

    public static Class<?> getAttributeType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        Class<?> attrType = types.get(keyName);
        if (attrType != null)
            return attrType;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null) {
            logger.error("getAttributeType: there's no attribute " + attrName + " in " + clazz.getName());
            return null;
        }

        attrType = descriptor.getPropertyType();
        Class<?> attrTypePrev = types.putIfAbsent(keyName, attrType);
        if (attrTypePrev != null)
            return attrTypePrev;
        return attrType;
    }

    // getters

    private static Method getGetter(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName, boolean onlyCheck) {
        String keyName = clazz.getName() + "." + attrName;
        Method getter = getters.get(keyName);
        if (getter != null)
            return getter;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null) {
            if (!onlyCheck)
                logger.error("getGetter: there's no attribute " + attrName + " in " + clazz.getName());
            return null;
        }

        getter = getMethod(clazz, descriptor.getReadMethod(), onlyCheck);
        if (getter == null)
            return null;

        Method getterPrev = getters.putIfAbsent(keyName, getter);
        if (getterPrev != null)
            return getterPrev;
        return getter;
    }

    public static class GetterType {
        public Class<?> type;
        public Type genericType;
        public Class<?> typeClass;
        public String methodName;

        public GetterType(Method m) {
            methodName = m.getName();
            type = m.getReturnType();
            genericType = m.getGenericReturnType();
            if (genericType != null && genericType instanceof ParameterizedType)
                typeClass = (Class<?>) ((ParameterizedType) genericType).getActualTypeArguments()[0];
        }
    }

    public static GetterType getGetterType(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName) {
        String keyName = clazz.getName() + "." + attrName;
        GetterType getterType = typeGetters.get(keyName);
        if (getterType != null)
            return getterType;

        Method m = getGetter(runtimeCtx, clazz, attrName, false);
        if (m == null)
            return null;

        getterType = new GetterType(m);
        GetterType getterTypePrev = typeGetters.putIfAbsent(keyName, getterType);
        if (getterTypePrev != null)
            return getterTypePrev;
        return getterType;
    }

    public static GetterType getGetterType(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        return getGetterType(runtimeCtx, bean.getClass(), attrName);
    }

    public static boolean checkAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        return getGetter(runtimeCtx, bean.getClass(), attrName, true) != null;
    }

    public static Object getAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName) {
        Method getter = getGetter(runtimeCtx, bean.getClass(), attrName, true);
        if (getter == null)
            throw new SqlRuntimeException("getAttribute(NoSuchMethodException): there's no getter for '" + attrName
                    + "' in " + bean.getClass());
        return invokeMethod(runtimeCtx, bean, getter);
    }

    // setters

    private static Method getSetter(SqlRuntimeContext runtimeCtx, Class<?> clazz, String attrName, boolean onlyCheck,
            Class<?>... attrTypes) {
        String keyName = clazz.getName() + "." + attrName + attrTypes2String(attrTypes);
        Method _setter = setters.get(keyName);
        if (_setter != null)
            return _setter;

        PropertyDescriptor descriptor = getAttributeDescriptor(clazz, attrName);
        if (descriptor == null) {
            if (!onlyCheck)
                logger.error("getSetter: there's no attribute " + attrName + " in " + clazz.getName());
        }

        _setter = getMethod(clazz, descriptor.getWriteMethod(), onlyCheck);
        if (_setter == null)
            return null;
        if (_setter.getParameterTypes() == null || _setter.getParameterTypes().length != 1) {
            if (!onlyCheck)
                logger.error("getSetter: there's no setter " + attrName + " in " + clazz.getName());
            return null;
        }

        Method setter = null;
        if (attrTypes == null || attrTypes.length == 0) {
            setter = _setter;
        } else {
            Class<?> setterType = _setter.getParameterTypes()[0];
            for (Class<?> _clazz : attrTypes) {
                if (_clazz.isAssignableFrom(setterType))
                    setter = _setter;
            }
        }
        if (setter == null) {
            if (!onlyCheck)
                logger.error("getSetter: there's no setter " + attrName + " in " + clazz.getName());
            return null;
        }

        Method setterPrev = setters.putIfAbsent(keyName, setter);
        if (setterPrev != null)
            return setterPrev;
        return setter;
    }

    private static Method getSetter(SqlRuntimeContext runtimeCtx, Object bean, String attrName, boolean onlyCheck,
            Class<?>... attrTypes) {
        return getSetter(runtimeCtx, bean.getClass(), attrName, onlyCheck, attrTypes);
    }

    public static boolean simpleSetAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName,
            Object attrValue, Class<?>... attrTypes) {
        Method setter = getSetter(runtimeCtx, bean, attrName, true, attrTypes);
        if (setter != null) {
            invokeMethod(runtimeCtx, bean, setter, attrValue);
            return true;
        } else {
            return false;
        }
    }

    public static void setAttribute(SqlRuntimeContext runtimeCtx, Object bean, String attrName, Object attrValue) {
        Method setter = getSetter(runtimeCtx, bean, attrName, true);
        if (setter == null)
            throw new SqlRuntimeException("setAttribute(NoSuchMethodException): there's no setter for '" + attrName
                    + "' in " + bean.getClass());
        invokeMethod(runtimeCtx, bean, setter, attrValue);
    }

    // methods invocation

    private static Method getMethod(Class<?> clazz, Method method, boolean onlyCheck) {

        if (method == null)
            return null;

        if (!Modifier.isPublic(method.getModifiers())) {
            if (!onlyCheck)
                logger.error("getMethod: " + method.toString() + " in " + clazz.getName() + " is not public");
            return null;
        }

        boolean sameClass = true;
        if (clazz == null) {
            clazz = method.getDeclaringClass();
        } else {
            sameClass = clazz.equals(method.getDeclaringClass());
            if (!method.getDeclaringClass().isAssignableFrom(clazz)) {
                if (!onlyCheck)
                    logger.error("getMethod: " + clazz.getName() + " is not assignable from "
                            + method.getDeclaringClass().getName());
                return null;
            }
        }

        if (Modifier.isPublic(clazz.getModifiers())) {
            if (!sameClass && !Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                try {
                    method.setAccessible(true);
                } catch (SecurityException se) {
                    logger.warn("getMethod: " + method.toString() + " in " + clazz + " " + se.getMessage());
                }
            }
            return method;
        }

        String methodName = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method _method = getInterfaceMethod(clazz, methodName, parameterTypes);
        if (_method == null)
            _method = getSuperclassMethod(clazz, methodName, parameterTypes);
        if (_method == null)
            if (!onlyCheck)
                logger.error("getMethod: there's no method " + method.toString() + " in " + clazz.getName());
        return _method;
    }

    private static Method getInterfaceMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {

        Method method = null;

        for (; clazz != null; clazz = clazz.getSuperclass()) {

            Class<?>[] interfaces = clazz.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!Modifier.isPublic(interfaces[i].getModifiers())) {
                    continue;
                }
                try {
                    method = interfaces[i].getDeclaredMethod(methodName, parameterTypes);
                } catch (NoSuchMethodException e) {
                }
                if (method != null) {
                    return method;
                }
                method = getInterfaceMethod(interfaces[i], methodName, parameterTypes);
                if (method != null) {
                    return method;
                }
            }
        }
        return null;
    }

    private static Method getSuperclassMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {

        Class<?> parentClazz = clazz.getSuperclass();
        while (parentClazz != null) {
            if (Modifier.isPublic(parentClazz.getModifiers())) {
                try {
                    return parentClazz.getMethod(methodName, parameterTypes);
                } catch (NoSuchMethodException e) {
                    return null;
                }
            }
            parentClazz = parentClazz.getSuperclass();
        }
        return null;
    }

    private static Method getMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes, boolean onlyCheck) {

        String keyName = clazz.getName() + "." + methodName + attrTypes2String(parameterTypes);
        Method method = methods.get(keyName);
        if (method != null)
            return method;

        try {
            method = clazz.getMethod(methodName, parameterTypes);
            try {
                method.setAccessible(true);
            } catch (SecurityException se) {
                logger.warn("getMethod: not accessible method " + method.toString() + " in " + clazz.getName() + ": "
                        + se.getMessage());
            }
            return method;
        } catch (NoSuchMethodException e) {
            if (!onlyCheck)
                logger.warn("getMethod: there's no method " + methodName + " in " + clazz.getName());
        }

        for (Method _method : clazz.getMethods()) {
            if (_method.getName().equals(methodName)) {
                Class<?>[] methodsParams = _method.getParameterTypes();
                int methodParamSize = methodsParams.length;
                if (methodParamSize == parameterTypes.length) {
                    boolean match = true;
                    for (int n = 0; n < methodParamSize; n++) {
                        if (!areTheSameParameters(methodsParams[n], parameterTypes[n])) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        method = getMethod(clazz, _method, onlyCheck);
                        if (method != null)
                            break;
                    }
                }
            }
        }

        if (method == null) {
            if (!onlyCheck)
                logger.error("getMethod: there's no method " + methodName + " in " + clazz.getName());
        } else {
            Method methodPrev = methods.putIfAbsent(keyName, method);
            if (methodPrev != null)
                return methodPrev;
        }
        return method;
    }

    private static final boolean areTheSameParameters(Class<?> methodParameterType, Class<?> parameterType) {
        if (methodParameterType.isAssignableFrom(parameterType)) {
            return true;
        }
        if (methodParameterType.isPrimitive()) {
            Class<?> parameterWrapperClazz = getPrimitiveWrapper(methodParameterType);
            if (parameterWrapperClazz != null) {
                return parameterWrapperClazz.equals(parameterType);
            }
        }
        return false;
    }

    private static Class<?> getPrimitiveWrapper(Class<?> primitiveType) {
        if (boolean.class.equals(primitiveType)) {
            return Boolean.class;
        } else if (float.class.equals(primitiveType)) {
            return Float.class;
        } else if (long.class.equals(primitiveType)) {
            return Long.class;
        } else if (int.class.equals(primitiveType)) {
            return Integer.class;
        } else if (short.class.equals(primitiveType)) {
            return Short.class;
        } else if (byte.class.equals(primitiveType)) {
            return Byte.class;
        } else if (double.class.equals(primitiveType)) {
            return Double.class;
        } else if (char.class.equals(primitiveType)) {
            return Character.class;
        } else {

            return null;
        }
    }

    public static class MethodResult {
        Object result;
        boolean noSuchMethod;
        RuntimeException exception;

        public MethodResult(Object result) {
            this.result = result;
            noSuchMethod = false;
        }

        public MethodResult() {
            this.result = null;
            noSuchMethod = true;
        }
    }

    private static Object invokeMethod(SqlRuntimeContext runtimeCtx, Object bean, Method method, Object... args) {
        try {
            if (!method.isAccessible())
                try {
                    method.setAccessible(true);
                } catch (SecurityException se) {
                    logger.warn("invokeMethod: " + bean.getClass() + " " + se.getMessage());
                }
            return method.invoke(bean, args);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        } catch (IllegalArgumentException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        }
    }

    public static boolean checkMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, String methodName, Object... args) {
        Class<?>[] parameterTypes = toParameterTypes(args);
        return getMethod(clazz, methodName, parameterTypes, true) != null;
    }

    public static boolean checkMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object... args) {
        return checkMethod(runtimeCtx, bean.getClass(), methodName, args);
    }

    public static Object invokeMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, String methodName, Object... args) {
        return invokeMethod(runtimeCtx, clazz, null, methodName, args);
    }

    public static Object invokeMethod(SqlRuntimeContext runtimeCtx, Object bean, String methodName, Object... args) {
        return invokeMethod(runtimeCtx, bean.getClass(), bean, methodName, args);
    }

    private static Object invokeMethod(SqlRuntimeContext runtimeCtx, Class<?> clazz, Object bean, String methodName,
            Object... args) {
        Class<?>[] parameterTypes = toParameterTypes(args);
        Method method = getMethod(clazz, methodName, parameterTypes, true);
        if (method == null) {
            throw new SqlRuntimeException(debugInfo("invokeMethod(NoSuchMethodException)", bean, method, args));
        }

        try {
            return method.invoke(bean, args);
        } catch (IllegalAccessException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        } catch (IllegalArgumentException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        } catch (InvocationTargetException e) {
            throw new SqlRuntimeException(debugInfo("invokeMethod", bean, method, args), e);
        }
    }

    // enums

    public static Object getEnumToValue(SqlRuntimeContext runtimeCtx, Object bean) {
        if (bean == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            if (checkMethod(runtimeCtx, bean, methodName))
                return invokeMethod(runtimeCtx, bean, methodName);
        }
        return null;
    }

    public static Class<?> getEnumToClass(SqlRuntimeContext runtimeCtx, Class<?> clazz) {
        if (clazz == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_IN)) {
            Method method = getMethod(clazz, methodName, new Class[] {}, true);
            if (method != null)
                return method.getReturnType();
        }
        return null;
    }

    public static Object getValueToEnum(SqlRuntimeContext runtimeCtx, Class<?> objClass, Object val) {
        if (val == null)
            return null;
        for (String methodName : runtimeCtx.getFeatures(SqlFeature.METHODS_ENUM_OUT)) {
            if (checkMethod(runtimeCtx, objClass, methodName, val))
                return invokeMethod(runtimeCtx, objClass, methodName, val);
        }
        return null;
    }

    // misc

    private static String attrTypes2String(Class<?>... attrTypes) {
        if (attrTypes == null || attrTypes.length == 0)
            return "";
        StringBuilder sb = new StringBuilder(".");
        boolean first = true;
        for (Class<?> attrType : attrTypes) {
            if (first)
                first = false;
            else
                sb.append(",");
            sb.append(attrType.getName());
        }
        return sb.toString();
    }

    private static Object[] toArray(Object arg) {
        Object[] args = null;
        if (arg != null) {
            args = new Object[] { arg };
        }
        return args;
    }

    private static Class<?>[] toParameterTypes(Object[] args) {
        if (args == null)
            return new Class[0];
        Class<?>[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }
        return parameterTypes;
    }

    private static String debugInfo(String msg, Object bean, Method method, Object... args) {
        StringBuilder sb = new StringBuilder(msg);
        sb.append(": bean=").append((bean != null) ? bean.getClass() : "null");
        sb.append(", method=").append((method != null) ? method.toString() : "null");
        if (args != null) {
            Class<?>[] parameterTypes = toParameterTypes(args);
            sb.append(", args=").append(attrTypes2String(parameterTypes));
        }
        sb.append(", method params=").append(
                (method.getParameterTypes() != null) ? Arrays.asList(method.getParameterTypes()) : "empty");
        return sb.toString();
    }
}
