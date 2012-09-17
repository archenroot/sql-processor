package org.sqlproc.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoProperty;

@SuppressWarnings("all")
public class ProcessorDslGenerator implements IGenerator {
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<PojoEntity> _filter = Iterables.<PojoEntity>filter(_iterable, PojoEntity.class);
    for (final PojoEntity e : _filter) {
      EObject _eContainer = e.eContainer();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
      String _string = _fullyQualifiedName.toString("/");
      String _plus = (_string + "/");
      QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _plus_1 = (_plus + _fullyQualifiedName_1);
      String _plus_2 = (_plus_1 + ".java");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus_2, _compile);
    }
  }
  
  public CharSequence compile(final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    final CharSequence classBody = this.compile(e, importManager);
    _builder.newLineIfNotEmpty();
    {
      EObject _eContainer = e.eContainer();
      boolean _notEquals = (!Objects.equal(_eContainer, null));
      if (_notEquals) {
        _builder.append("package ");
        EObject _eContainer_1 = e.eContainer();
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_1);
        _builder.append(_fullyQualifiedName, "");
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      List<String> _imports = importManager.getImports();
      boolean _isEmpty = _imports.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("  ");
        _builder.newLine();
        {
          List<String> _imports_1 = importManager.getImports();
          for(final String i : _imports_1) {
            _builder.append("import ");
            _builder.append(i, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append(classBody, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final PojoEntity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    {
      boolean _isAbstract = e.isAbstract();
      if (_isAbstract) {
        _builder.append("abstract ");
      }
    }
    _builder.append("class ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    {
      PojoEntity _superType = e.getSuperType();
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _builder.append("extends ");
        PojoEntity _superType_1 = e.getSuperType();
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_superType_1);
        _builder.append(_fullyQualifiedName, "");
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "  ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    {
      ArrayList<PojoProperty> _requiredFeatures = this.requiredFeatures(e);
      boolean _isEmpty = _requiredFeatures.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("  ");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("public ");
        String _name_2 = e.getName();
        _builder.append(_name_2, "  ");
        _builder.append("(");
        {
          ArrayList<PojoProperty> _requiredFeatures_1 = this.requiredFeatures(e);
          boolean _hasElements = false;
          for(final PojoProperty f : _requiredFeatures_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "  ");
            }
            CharSequence _compileType = this.compileType(f, importManager);
            _builder.append(_compileType, "  ");
            _builder.append(" ");
            String _name_3 = f.getName();
            _builder.append(_name_3, "  ");
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        {
          ArrayList<PojoProperty> _requiredSuperFeatures = this.requiredSuperFeatures(e);
          boolean _hasElements_1 = false;
          for(final PojoProperty f_1 : _requiredSuperFeatures) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder.append("  super(", "  ");
            } else {
              _builder.appendImmediate(", ", "  ");
            }
            String _name_4 = f_1.getName();
            _builder.append(_name_4, "  ");
          }
          if (_hasElements_1) {
            _builder.append(");", "  ");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        {
          List<PojoProperty> _requiredFeatures1 = this.requiredFeatures1(e);
          boolean _hasElements_2 = false;
          for(final PojoProperty f_2 : _requiredFeatures1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate("\n", "  ");
            }
            _builder.append("  this.");
            String _name_5 = f_2.getName();
            _builder.append(_name_5, "  ");
            _builder.append(" = ");
            String _name_6 = f_2.getName();
            _builder.append(_name_6, "  ");
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      EList<PojoProperty> _features = e.getFeatures();
      final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
          public Boolean apply(final PojoProperty x) {
            boolean _isAttribute = ProcessorDslGenerator.this.isAttribute(x);
            return Boolean.valueOf(_isAttribute);
          }
        };
      Iterable<PojoProperty> _filter = IterableExtensions.<PojoProperty>filter(_features, _function);
      for(final PojoProperty f_3 : _filter) {
        _builder.append("  ");
        CharSequence _compile = this.compile(f_3, importManager, e);
        _builder.append(_compile, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    {
      EList<PojoProperty> _features_1 = e.getFeatures();
      final Function1<PojoProperty,Boolean> _function_1 = new Function1<PojoProperty,Boolean>() {
          public Boolean apply(final PojoProperty x) {
            String _name = x.getName();
            boolean _equalsIgnoreCase = _name.equalsIgnoreCase("toString");
            return Boolean.valueOf(_equalsIgnoreCase);
          }
        };
      boolean _exists = IterableExtensions.<PojoProperty>exists(_features_1, _function_1);
      if (_exists) {
        CharSequence _compileToString = this.compileToString(importManager, e);
        _builder.append(_compileToString, "  ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final PojoProperty f, final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("private ");
    CharSequence _compileType = this.compileType(f, importManager);
    _builder.append(_compileType, "");
    _builder.append(" ");
    String _name = f.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("public ");
    CharSequence _compileType_1 = this.compileType(f, importManager);
    _builder.append(_compileType_1, "");
    _builder.append(" get");
    String _name_1 = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_2 = f.getName();
    _builder.append(_name_2, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("public void set");
    String _name_3 = f.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_1, "");
    _builder.append("(");
    CharSequence _compileType_2 = this.compileType(f, importManager);
    _builder.append(_compileType_2, "");
    _builder.append(" ");
    String _name_4 = f.getName();
    _builder.append(_name_4, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("this.");
    String _name_5 = f.getName();
    _builder.append(_name_5, "  ");
    _builder.append(" = ");
    String _name_6 = f.getName();
    _builder.append(_name_6, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("public ");
    String _name_7 = e.getName();
    _builder.append(_name_7, "");
    _builder.append(" _set");
    String _name_8 = f.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_8);
    _builder.append(_firstUpper_2, "");
    _builder.append("(");
    CharSequence _compileType_3 = this.compileType(f, importManager);
    _builder.append(_compileType_3, "");
    _builder.append(" ");
    String _name_9 = f.getName();
    _builder.append(_name_9, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("this.");
    String _name_10 = f.getName();
    _builder.append(_name_10, "  ");
    _builder.append(" = ");
    String _name_11 = f.getName();
    _builder.append(_name_11, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return this;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileToString(final ImportManager importManager, final PojoEntity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return \"");
    String _name = e.getName();
    _builder.append(_name, "    ");
    _builder.append(" [");
    {
      EList<PojoProperty> _features = e.getFeatures();
      final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
          public Boolean apply(final PojoProperty x) {
            boolean _isAttribute = ProcessorDslGenerator.this.isAttribute(x);
            return Boolean.valueOf(_isAttribute);
          }
        };
      Iterable<PojoProperty> _filter = IterableExtensions.<PojoProperty>filter(_features, _function);
      boolean _hasElements = false;
      for(final PojoProperty f2 : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" + \", ", "    ");
        }
        String _name_1 = f2.getName();
        _builder.append(_name_1, "    ");
        _builder.append("=\" + ");
        String _name_2 = f2.getName();
        _builder.append(_name_2, "    ");
      }
    }
    {
      PojoEntity _superType = e.getSuperType();
      boolean _notEquals = (!Objects.equal(_superType, null));
      if (_notEquals) {
        _builder.append(" + super.toString()");
      }
    }
    _builder.append(" + \"]\";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileType(final PojoProperty f, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _native = f.getNative();
      boolean _notEquals = (!Objects.equal(_native, null));
      if (_notEquals) {
        String _native_1 = f.getNative();
        String _substring = _native_1.substring(1);
        _builder.append(_substring, "");
      } else {
        PojoEntity _ref = f.getRef();
        boolean _notEquals_1 = (!Objects.equal(_ref, null));
        if (_notEquals_1) {
          PojoEntity _ref_1 = f.getRef();
          QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_ref_1);
          _builder.append(_fullyQualifiedName, "");
        } else {
          JvmType _type = f.getType();
          boolean _notEquals_2 = (!Objects.equal(_type, null));
          if (_notEquals_2) {
            JvmType _type_1 = f.getType();
            CharSequence _serialize = importManager.serialize(_type_1);
            _builder.append(_serialize, "");
          }
        }
      }
    }
    {
      JvmType _gtype = f.getGtype();
      boolean _notEquals_3 = (!Objects.equal(_gtype, null));
      if (_notEquals_3) {
        _builder.append("<");
        JvmType _gtype_1 = f.getGtype();
        CharSequence _serialize_1 = importManager.serialize(_gtype_1);
        _builder.append(_serialize_1, "");
        _builder.append(">");
      }
    }
    {
      PojoEntity _gref = f.getGref();
      boolean _notEquals_4 = (!Objects.equal(_gref, null));
      if (_notEquals_4) {
        _builder.append("<");
        PojoEntity _gref_1 = f.getGref();
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(_gref_1);
        _builder.append(_fullyQualifiedName_1, "");
        _builder.append(">");
      }
    }
    {
      boolean _isArray = f.isArray();
      if (_isArray) {
        _builder.append("[]");
      }
    }
    return _builder;
  }
  
  public ArrayList<PojoProperty> requiredFeatures(final PojoEntity e) {
    ArrayList<PojoProperty> _arrayList = new ArrayList<PojoProperty>();
    final ArrayList<PojoProperty> list = _arrayList;
    PojoEntity _superType = e.getSuperType();
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      PojoEntity _superType_1 = e.getSuperType();
      ArrayList<PojoProperty> _requiredFeatures = this.requiredFeatures(_superType_1);
      list.addAll(_requiredFeatures);
    }
    List<PojoProperty> _requiredFeatures1 = this.requiredFeatures1(e);
    list.addAll(_requiredFeatures1);
    return list;
  }
  
  public ArrayList<PojoProperty> requiredSuperFeatures(final PojoEntity e) {
    ArrayList<PojoProperty> _arrayList = new ArrayList<PojoProperty>();
    final ArrayList<PojoProperty> list = _arrayList;
    PojoEntity _superType = e.getSuperType();
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      PojoEntity _superType_1 = e.getSuperType();
      ArrayList<PojoProperty> _requiredFeatures = this.requiredFeatures(_superType_1);
      list.addAll(_requiredFeatures);
    }
    return list;
  }
  
  public List<PojoProperty> requiredFeatures1(final PojoEntity e) {
    EList<PojoProperty> _features = e.getFeatures();
    final Function1<PojoProperty,Boolean> _function = new Function1<PojoProperty,Boolean>() {
        public Boolean apply(final PojoProperty f) {
          boolean _isRequired = f.isRequired();
          return Boolean.valueOf(_isRequired);
        }
      };
    Iterable<PojoProperty> _filter = IterableExtensions.<PojoProperty>filter(_features, _function);
    return IterableExtensions.<PojoProperty>toList(_filter);
  }
  
  public boolean isAttribute(final PojoProperty f) {
    boolean _or = false;
    boolean _or_1 = false;
    String _native = f.getNative();
    boolean _notEquals = (!Objects.equal(_native, null));
    if (_notEquals) {
      _or_1 = true;
    } else {
      PojoEntity _ref = f.getRef();
      boolean _notEquals_1 = (!Objects.equal(_ref, null));
      _or_1 = (_notEquals || _notEquals_1);
    }
    if (_or_1) {
      _or = true;
    } else {
      JvmType _type = f.getType();
      boolean _notEquals_2 = (!Objects.equal(_type, null));
      _or = (_or_1 || _notEquals_2);
    }
    return _or;
  }
}
