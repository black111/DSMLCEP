/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.ValueOperator#getValueOperator <em>Value Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getValueOperator()
 * @model annotation="gmf.node label='valueOperator' figure='ellipse' border.color='0,0,0'"
 * @generated
 */
public interface ValueOperator extends Query {
	/**
	 * Returns the value of the '<em><b>Value Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Operator</em>' attribute.
	 * @see #setValueOperator(String)
	 * @see dsml.DsmlPackage#getValueOperator_ValueOperator()
	 * @model
	 * @generated
	 */
	String getValueOperator();

	/**
	 * Sets the value of the '{@link dsml.ValueOperator#getValueOperator <em>Value Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Operator</em>' attribute.
	 * @see #getValueOperator()
	 * @generated
	 */
	void setValueOperator(String value);

} // ValueOperator
