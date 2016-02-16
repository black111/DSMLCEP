/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.EventOutput#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link dsml.EventOutput#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getEventOutput()
 * @model annotation="gmf.node label='outputName' figure='rounded' border.color='0,0,0'"
 * @generated
 */
public interface EventOutput extends Component {
	/**
	 * Returns the value of the '<em><b>Output Name</b></em>' attribute.
	 * The default value is <code>"OutputEvent"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Name</em>' attribute.
	 * @see dsml.DsmlPackage#getEventOutput_OutputName()
	 * @model default="OutputEvent" changeable="false"
	 * @generated
	 */
	String getOutputName();

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
	 * @see dsml.DsmlPackage#getEventOutput_Queries()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 * @generated
	 */
	EList<Query> getQueries();

} // EventOutput
