/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.UnaryPattern#getName <em>Name</em>}</li>
 *   <li>{@link dsml.UnaryPattern#getTypeUnaryPattern <em>Type Unary Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getUnaryPattern()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface UnaryPattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UnaryPattern"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see dsml.DsmlPackage#getUnaryPattern_Name()
	 * @model default="UnaryPattern" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Type Unary Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypeUnaryPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Unary Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Unary Pattern</em>' attribute.
	 * @see dsml.TypeUnaryPattern
	 * @see #setTypeUnaryPattern(TypeUnaryPattern)
	 * @see dsml.DsmlPackage#getUnaryPattern_TypeUnaryPattern()
	 * @model
	 * @generated
	 */
	TypeUnaryPattern getTypeUnaryPattern();

	/**
	 * Sets the value of the '{@link dsml.UnaryPattern#getTypeUnaryPattern <em>Type Unary Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Unary Pattern</em>' attribute.
	 * @see dsml.TypeUnaryPattern
	 * @see #getTypeUnaryPattern()
	 * @generated
	 */
	void setTypeUnaryPattern(TypeUnaryPattern value);

} // UnaryPattern
