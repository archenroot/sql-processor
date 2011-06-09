/**
 * <copyright>
 * </copyright>
 *
 */
package org.sqlproc.dsl.processorDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaStatement#getType <em>Type</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaStatement#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.sqlproc.dsl.processorDsl.MetaStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaStatement()
 * @model
 * @generated
 */
public interface MetaStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaStatement_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaStatement#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.sqlproc.dsl.processorDsl.STATEMEN_TYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.sqlproc.dsl.processorDsl.STATEMEN_TYPE
   * @see #setType(STATEMEN_TYPE)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaStatement_Type()
   * @model
   * @generated
   */
  STATEMEN_TYPE getType();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaStatement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.sqlproc.dsl.processorDsl.STATEMEN_TYPE
   * @see #getType()
   * @generated
   */
  void setType(STATEMEN_TYPE value);

  /**
   * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.dsl.processorDsl.Filter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filters</em>' containment reference list.
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaStatement_Filters()
   * @model containment="true"
   * @generated
   */
  EList<Filter> getFilters();

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Sql)
   * @see org.sqlproc.dsl.processorDsl.ProcessorDslPackage#getMetaStatement_Statement()
   * @model containment="true"
   * @generated
   */
  Sql getStatement();

  /**
   * Sets the value of the '{@link org.sqlproc.dsl.processorDsl.MetaStatement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Sql value);

} // MetaStatement