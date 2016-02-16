/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.PatternTimer#getPatternTimer <em>Pattern Timer</em>}</li>
 *   <li>{@link dsml.PatternTimer#getTypePatternTimer <em>Type Pattern Timer</em>}</li>
 *   <li>{@link dsml.PatternTimer#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getPatternTimer()
 * @model annotation="gmf.node label='patternTimer' figure='rectangle'"
 * @generated
 */
public interface PatternTimer extends Pattern {
	/**
	 * Returns the value of the '<em><b>Pattern Timer</b></em>' attribute.
	 * The default value is <code>"PatternTimer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Timer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Timer</em>' attribute.
	 * @see dsml.DsmlPackage#getPatternTimer_PatternTimer()
	 * @model default="PatternTimer" changeable="false"
	 * @generated
	 */
	String getPatternTimer();

	/**
	 * Returns the value of the '<em><b>Type Pattern Timer</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypePatternTimer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Pattern Timer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Pattern Timer</em>' attribute.
	 * @see dsml.TypePatternTimer
	 * @see #setTypePatternTimer(TypePatternTimer)
	 * @see dsml.DsmlPackage#getPatternTimer_TypePatternTimer()
	 * @model
	 * @generated
	 */
	TypePatternTimer getTypePatternTimer();

	/**
	 * Sets the value of the '{@link dsml.PatternTimer#getTypePatternTimer <em>Type Pattern Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Pattern Timer</em>' attribute.
	 * @see dsml.TypePatternTimer
	 * @see #getTypePatternTimer()
	 * @generated
	 */
	void setTypePatternTimer(TypePatternTimer value);

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
	 * @see dsml.DsmlPackage#getPatternTimer_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsml.PatternTimer#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // PatternTimer
