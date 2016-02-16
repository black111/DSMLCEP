/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bring Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.BringGroup#getBringGroup <em>Bring Group</em>}</li>
 *   <li>{@link dsml.BringGroup#isBringAll <em>Bring All</em>}</li>
 *   <li>{@link dsml.BringGroup#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dsml.BringGroup#getOperationTypes <em>Operation Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getBringGroup()
 * @model annotation="gmf.node label='bringGroup' figure='rectangle' border.color='0,153,255'"
 * @generated
 */
public interface BringGroup extends Query {
	/**
	 * Returns the value of the '<em><b>Bring Group</b></em>' attribute.
	 * The default value is <code>"BringGroup"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bring Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bring Group</em>' attribute.
	 * @see dsml.DsmlPackage#getBringGroup_BringGroup()
	 * @model default="BringGroup" changeable="false"
	 * @generated
	 */
	String getBringGroup();

	/**
	 * Returns the value of the '<em><b>Bring All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bring All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bring All</em>' attribute.
	 * @see #setBringAll(boolean)
	 * @see dsml.DsmlPackage#getBringGroup_BringAll()
	 * @model default="false"
	 * @generated
	 */
	boolean isBringAll();

	/**
	 * Sets the value of the '{@link dsml.BringGroup#isBringAll <em>Bring All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bring All</em>' attribute.
	 * @see #isBringAll()
	 * @generated
	 */
	void setBringAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link dsml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see dsml.DsmlPackage#getBringGroup_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Operation Types</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Types</em>' containment reference list.
	 * @see dsml.DsmlPackage#getBringGroup_OperationTypes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<Query> getOperationTypes();

} // BringGroup