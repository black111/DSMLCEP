/**
 */
package dsml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.Window#getWindow <em>Window</em>}</li>
 *   <li>{@link dsml.Window#getTypeWindow <em>Type Window</em>}</li>
 *   <li>{@link dsml.Window#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getWindow()
 * @model annotation="gmf.node label='window' figure='rectangle'"
 * @generated
 */
public interface Window extends Component {
	/**
	 * Returns the value of the '<em><b>Window</b></em>' attribute.
	 * The default value is <code>"Window"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' attribute.
	 * @see dsml.DsmlPackage#getWindow_Window()
	 * @model default="Window" changeable="false"
	 * @generated
	 */
	String getWindow();

	/**
	 * Returns the value of the '<em><b>Type Window</b></em>' attribute.
	 * The literals are from the enumeration {@link dsml.TypeWindow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Window</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Window</em>' attribute.
	 * @see dsml.TypeWindow
	 * @see #setTypeWindow(TypeWindow)
	 * @see dsml.DsmlPackage#getWindow_TypeWindow()
	 * @model
	 * @generated
	 */
	TypeWindow getTypeWindow();

	/**
	 * Sets the value of the '{@link dsml.Window#getTypeWindow <em>Type Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Window</em>' attribute.
	 * @see dsml.TypeWindow
	 * @see #getTypeWindow()
	 * @generated
	 */
	void setTypeWindow(TypeWindow value);

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
	 * @see dsml.DsmlPackage#getWindow_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsml.Window#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Window
