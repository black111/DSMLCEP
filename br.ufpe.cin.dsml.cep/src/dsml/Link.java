/**
 */
package dsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Link#getSource <em>Source</em>}</li>
 *   <li>{@link dsml.Link#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getLink()
 * @model abstract="true"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsml.Query#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Query)
	 * @see dsml.DsmlPackage#getLink_Source()
	 * @see dsml.Query#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Query getSource();

	/**
	 * Sets the value of the '{@link dsml.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Query value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsml.Query#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Query)
	 * @see dsml.DsmlPackage#getLink_Target()
	 * @see dsml.Query#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Query getTarget();

	/**
	 * Sets the value of the '{@link dsml.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Query value);

} // Link
