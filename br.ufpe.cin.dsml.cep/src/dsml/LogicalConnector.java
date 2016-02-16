/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.LogicalConnector#getTypeLogical <em>Type Logical</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getLogicalConnector()
 * @model annotation="gmf.link label='typeLogical' source='source' target='target' target.decoration='arrow' incoming='true' color='0,153,255' width='2' tool.description='Operations: [and, or]'"
 * @generated
 */
public interface LogicalConnector extends Link {
	/**
	 * Returns the value of the '<em><b>Type Logical</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypeLogical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Logical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Logical</em>' attribute.
	 * @see dsml.TypeLogical
	 * @see #setTypeLogical(TypeLogical)
	 * @see dsml.DsmlPackage#getLogicalConnector_TypeLogical()
	 * @model
	 * @generated
	 */
	TypeLogical getTypeLogical();

	/**
	 * Sets the value of the '{@link dsml.LogicalConnector#getTypeLogical <em>Type Logical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Logical</em>' attribute.
	 * @see dsml.TypeLogical
	 * @see #getTypeLogical()
	 * @generated
	 */
	void setTypeLogical(TypeLogical value);

} // LogicalConnector
