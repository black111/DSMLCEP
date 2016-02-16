/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Target#getTargetAlias <em>Target Alias</em>}</li>
 *   <li>{@link dsml.Target#getOperationTypes <em>Operation Types</em>}</li>
 *   <li>{@link dsml.Target#getIncomingTarget <em>Incoming Target</em>}</li>
 *   <li>{@link dsml.Target#getOutgoingTarget <em>Outgoing Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getTarget()
 * @model annotation="gmf.node label='targetAlias' figure='rectangle' border.color='255,0,0'"
 * @generated
 */
public interface Target extends Pattern, Query {
	/**
	 * Returns the value of the '<em><b>Target Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Alias</em>' attribute.
	 * @see #setTargetAlias(String)
	 * @see dsml.DsmlPackage#getTarget_TargetAlias()
	 * @model
	 * @generated
	 */
	String getTargetAlias();

	/**
	 * Sets the value of the '{@link dsml.Target#getTargetAlias <em>Target Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Alias</em>' attribute.
	 * @see #getTargetAlias()
	 * @generated
	 */
	void setTargetAlias(String value);

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
	 * @see dsml.DsmlPackage#getTarget_OperationTypes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<Query> getOperationTypes();

	/**
	 * Returns the value of the '<em><b>Incoming Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsml.LinkPatternTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Target</em>' reference.
	 * @see #setIncomingTarget(LinkPatternTarget)
	 * @see dsml.DsmlPackage#getTarget_IncomingTarget()
	 * @see dsml.LinkPatternTarget#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	LinkPatternTarget getIncomingTarget();

	/**
	 * Sets the value of the '{@link dsml.Target#getIncomingTarget <em>Incoming Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Target</em>' reference.
	 * @see #getIncomingTarget()
	 * @generated
	 */
	void setIncomingTarget(LinkPatternTarget value);

	/**
	 * Returns the value of the '<em><b>Outgoing Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsml.LinkPatternTarget#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Target</em>' reference.
	 * @see #setOutgoingTarget(LinkPatternTarget)
	 * @see dsml.DsmlPackage#getTarget_OutgoingTarget()
	 * @see dsml.LinkPatternTarget#getSource
	 * @model opposite="source"
	 * @generated
	 */
	LinkPatternTarget getOutgoingTarget();

	/**
	 * Sets the value of the '{@link dsml.Target#getOutgoingTarget <em>Outgoing Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Target</em>' reference.
	 * @see #getOutgoingTarget()
	 * @generated
	 */
	void setOutgoingTarget(LinkPatternTarget value);

} // Target
