/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Groupby Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.GroupbyCondition#getGroupbyCondition <em>Groupby Condition</em>}</li>
 *   <li>{@link dsml.GroupbyCondition#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dsml.GroupbyCondition#getOperationTypes <em>Operation Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getGroupbyCondition()
 * @model annotation="gmf.node label='groupbyCondition' figure='rectangle' border.color='76,217,100'"
 * @generated
 */
public interface GroupbyCondition extends Query {
	/**
	 * Returns the value of the '<em><b>Groupby Condition</b></em>' attribute.
	 * The default value is <code>"groupbyCondition"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupby Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupby Condition</em>' attribute.
	 * @see dsml.DsmlPackage#getGroupbyCondition_GroupbyCondition()
	 * @model default="groupbyCondition" changeable="false"
	 * @generated
	 */
	String getGroupbyCondition();

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
	 * @see dsml.DsmlPackage#getGroupbyCondition_Attributes()
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
	 * @see dsml.DsmlPackage#getGroupbyCondition_OperationTypes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<Query> getOperationTypes();

} // GroupbyCondition
