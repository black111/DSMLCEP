/**
 */
package dsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Pattern Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.LinkPatternTarget#getSource <em>Source</em>}</li>
 *   <li>{@link dsml.LinkPatternTarget#getTarget <em>Target</em>}</li>
 *   <li>{@link dsml.LinkPatternTarget#getComparisonTarget <em>Comparison Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getLinkPatternTarget()
 * @model annotation="gmf.link label='comparisonTarget' source='source' target='target' target.decoration='arrow' incoming='true' color='0,0,0' width='1' tool.description='Operations: [FOLLOWEDBY, OR, AND, OR, UNTIL, WHILE]'"
 * @generated
 */
public interface LinkPatternTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsml.Target#getOutgoingTarget <em>Outgoing Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Target)
	 * @see dsml.DsmlPackage#getLinkPatternTarget_Source()
	 * @see dsml.Target#getOutgoingTarget
	 * @model opposite="outgoingTarget" required="true"
	 * @generated
	 */
	Target getSource();

	/**
	 * Sets the value of the '{@link dsml.LinkPatternTarget#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Target value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsml.Target#getIncomingTarget <em>Incoming Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Target)
	 * @see dsml.DsmlPackage#getLinkPatternTarget_Target()
	 * @see dsml.Target#getIncomingTarget
	 * @model opposite="incomingTarget" required="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link dsml.LinkPatternTarget#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Comparison Target</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypeTargetComparison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Target</em>' attribute.
	 * @see dsml.TypeTargetComparison
	 * @see #setComparisonTarget(TypeTargetComparison)
	 * @see dsml.DsmlPackage#getLinkPatternTarget_ComparisonTarget()
	 * @model
	 * @generated
	 */
	TypeTargetComparison getComparisonTarget();

	/**
	 * Sets the value of the '{@link dsml.LinkPatternTarget#getComparisonTarget <em>Comparison Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Target</em>' attribute.
	 * @see dsml.TypeTargetComparison
	 * @see #getComparisonTarget()
	 * @generated
	 */
	void setComparisonTarget(TypeTargetComparison value);

} // LinkPatternTarget
