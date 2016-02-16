/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Rule#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link dsml.Rule#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getRule()
 * @model annotation="gmf.node label='ruleName' figure='rounded' border.color='0,0,0'"
 * @generated
 */
public interface Rule extends Component {
	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
	 * The default value is <code>"Rule"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Name</em>' attribute.
	 * @see #setRuleName(String)
	 * @see dsml.DsmlPackage#getRule_RuleName()
	 * @model default="Rule"
	 * @generated
	 */
	String getRuleName();

	/**
	 * Sets the value of the '{@link dsml.Rule#getRuleName <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' attribute.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(String value);

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see dsml.DsmlPackage#getRule_Queries()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 * @generated
	 */
	EList<Query> getQueries();

} // Rule
