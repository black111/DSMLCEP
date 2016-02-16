/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Arithmetic#getArithmetic <em>Arithmetic</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getArithmetic()
 * @model annotation="gmf.link label='arithmetic' source='source' target='target' target.decoration='arrow' incoming='true' color='0,0,0' width='1' tool.description='Operations: [+, /, %, *, -]'"
 * @generated
 */
public interface Arithmetic extends Link {
	/**
	 * Returns the value of the '<em><b>Arithmetic</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypeArithmetic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arithmetic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithmetic</em>' attribute.
	 * @see dsml.TypeArithmetic
	 * @see #setArithmetic(TypeArithmetic)
	 * @see dsml.DsmlPackage#getArithmetic_Arithmetic()
	 * @model
	 * @generated
	 */
	TypeArithmetic getArithmetic();

	/**
	 * Sets the value of the '{@link dsml.Arithmetic#getArithmetic <em>Arithmetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithmetic</em>' attribute.
	 * @see dsml.TypeArithmetic
	 * @see #getArithmetic()
	 * @generated
	 */
	void setArithmetic(TypeArithmetic value);

} // Arithmetic
