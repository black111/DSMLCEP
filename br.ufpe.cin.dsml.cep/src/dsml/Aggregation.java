/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Aggregation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link dsml.Aggregation#getTypeAggregation <em>Type Aggregation</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getAggregation()
 * @model annotation="gmf.node label='typeAggregation' figure='rectangle'"
 * @generated
 */
public interface Aggregation extends Query {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see dsml.DsmlPackage#getAggregation_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link dsml.Aggregation#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Type Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypeAggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Aggregation</em>' attribute.
	 * @see dsml.TypeAggregation
	 * @see #setTypeAggregation(TypeAggregation)
	 * @see dsml.DsmlPackage#getAggregation_TypeAggregation()
	 * @model
	 * @generated
	 */
	TypeAggregation getTypeAggregation();

	/**
	 * Sets the value of the '{@link dsml.Aggregation#getTypeAggregation <em>Type Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Aggregation</em>' attribute.
	 * @see dsml.TypeAggregation
	 * @see #getTypeAggregation()
	 * @generated
	 */
	void setTypeAggregation(TypeAggregation value);

} // Aggregation
