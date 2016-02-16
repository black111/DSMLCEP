/**
 */
package dsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Query#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link dsml.Query#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getQuery()
 * @model abstract="true"
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsml.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Link)
	 * @see dsml.DsmlPackage#getQuery_Incoming()
	 * @see dsml.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Link getIncoming();

	/**
	 * Sets the value of the '{@link dsml.Query#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Link value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsml.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(Link)
	 * @see dsml.DsmlPackage#getQuery_Outgoing()
	 * @see dsml.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Link getOutgoing();

	/**
	 * Sets the value of the '{@link dsml.Query#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(Link value);

} // Query
