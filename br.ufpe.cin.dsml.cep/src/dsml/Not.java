/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Not#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getNot()
 * @model annotation="gmf.node label='description' figure='rectangle'"
 * @generated
 */
public interface Not extends Query, Pattern {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"NOT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see dsml.DsmlPackage#getNot_Description()
	 * @model default="NOT" changeable="false"
	 * @generated
	 */
	String getDescription();

} // Not
