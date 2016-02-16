/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.LinkTarget#getSource <em>Source</em>}</li>
 *   <li>{@link dsml.LinkTarget#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getLinkTarget()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' incoming='true' color='0,0,0' width='1'"
 * @generated
 */
public interface LinkTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Component)
	 * @see dsml.DsmlPackage#getLinkTarget_Source()
	 * @model required="true"
	 * @generated
	 */
	Component getSource();

	/**
	 * Sets the value of the '{@link dsml.LinkTarget#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Component value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link dsml.Target}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see dsml.DsmlPackage#getLinkTarget_Target()
	 * @model
	 * @generated
	 */
	EList<Target> getTarget();

} // LinkTarget
