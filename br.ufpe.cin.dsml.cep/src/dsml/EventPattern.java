/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.EventPattern#getEventPattern <em>Event Pattern</em>}</li>
 *   <li>{@link dsml.EventPattern#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getEventPattern()
 * @model annotation="gmf.node label='eventPattern' figure='rounded' border.color='0,0,0'"
 * @generated
 */
public interface EventPattern extends Component {
	/**
	 * Returns the value of the '<em><b>Event Pattern</b></em>' attribute.
	 * The default value is <code>"EventPattern"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Pattern</em>' attribute.
	 * @see dsml.DsmlPackage#getEventPattern_EventPattern()
	 * @model default="EventPattern" changeable="false"
	 * @generated
	 */
	String getEventPattern();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see dsml.DsmlPackage#getEventPattern_Node()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 * @generated
	 */
	EList<Pattern> getNode();

} // EventPattern
