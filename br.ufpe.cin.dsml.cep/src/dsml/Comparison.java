/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Comparison#getComparison <em>Comparison</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getComparison()
 * @model annotation="gmf.link label='comparison' source='source' target='target' target.decoration='arrow' incoming='true' color='0,0,0' width='1' tool.description='Operations: [=, >=, >, <=, <, <>]'"
 * @generated
 */
public interface Comparison extends Link {
	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypeComparison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see dsml.TypeComparison
	 * @see #setComparison(TypeComparison)
	 * @see dsml.DsmlPackage#getComparison_Comparison()
	 * @model
	 * @generated
	 */
	TypeComparison getComparison();

	/**
	 * Sets the value of the '{@link dsml.Comparison#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see dsml.TypeComparison
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(TypeComparison value);

} // Comparison
