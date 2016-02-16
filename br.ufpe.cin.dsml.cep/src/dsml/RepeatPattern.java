/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.RepeatPattern#getRepeatPattern <em>Repeat Pattern</em>}</li>
 *   <li>{@link dsml.RepeatPattern#getTypePatternTimer <em>Type Pattern Timer</em>}</li>
 *   <li>{@link dsml.RepeatPattern#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getRepeatPattern()
 * @model annotation="gmf.node label='repeatPattern' figure='rectangle'"
 * @generated
 */
public interface RepeatPattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Repeat Pattern</b></em>' attribute.
	 * The default value is <code>"RepeatPattern"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Pattern</em>' attribute.
	 * @see dsml.DsmlPackage#getRepeatPattern_RepeatPattern()
	 * @model default="RepeatPattern" changeable="false"
	 * @generated
	 */
	String getRepeatPattern();

	/**
	 * Returns the value of the '<em><b>Type Pattern Timer</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypeRepeatPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Pattern Timer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Pattern Timer</em>' attribute.
	 * @see dsml.TypeRepeatPattern
	 * @see #setTypePatternTimer(TypeRepeatPattern)
	 * @see dsml.DsmlPackage#getRepeatPattern_TypePatternTimer()
	 * @model
	 * @generated
	 */
	TypeRepeatPattern getTypePatternTimer();

	/**
	 * Sets the value of the '{@link dsml.RepeatPattern#getTypePatternTimer <em>Type Pattern Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Pattern Timer</em>' attribute.
	 * @see dsml.TypeRepeatPattern
	 * @see #getTypePatternTimer()
	 * @generated
	 */
	void setTypePatternTimer(TypeRepeatPattern value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dsml.DsmlPackage#getRepeatPattern_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsml.RepeatPattern#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // RepeatPattern
