/**
 */
package dsml.impl;

import dsml.DsmlPackage;
import dsml.TypeWindow;
import dsml.Window;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.WindowImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link dsml.impl.WindowImpl#getTypeWindow <em>Type Window</em>}</li>
 *   <li>{@link dsml.impl.WindowImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImpl extends ComponentImpl implements Window {
	/**
	 * The default value of the '{@link #getWindow() <em>Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOW_EDEFAULT = "Window";

	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected String window = WINDOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeWindow() <em>Type Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeWindow()
	 * @generated
	 * @ordered
	 */
	protected static final TypeWindow TYPE_WINDOW_EDEFAULT = TypeWindow.LENGTH;

	/**
	 * The cached value of the '{@link #getTypeWindow() <em>Type Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeWindow()
	 * @generated
	 * @ordered
	 */
	protected TypeWindow typeWindow = TYPE_WINDOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindow() {
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeWindow getTypeWindow() {
		return typeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeWindow(TypeWindow newTypeWindow) {
		TypeWindow oldTypeWindow = typeWindow;
		typeWindow = newTypeWindow == null ? TYPE_WINDOW_EDEFAULT : newTypeWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.WINDOW__TYPE_WINDOW, oldTypeWindow, typeWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.WINDOW__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.WINDOW__WINDOW:
				return getWindow();
			case DsmlPackage.WINDOW__TYPE_WINDOW:
				return getTypeWindow();
			case DsmlPackage.WINDOW__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsmlPackage.WINDOW__TYPE_WINDOW:
				setTypeWindow((TypeWindow)newValue);
				return;
			case DsmlPackage.WINDOW__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DsmlPackage.WINDOW__TYPE_WINDOW:
				setTypeWindow(TYPE_WINDOW_EDEFAULT);
				return;
			case DsmlPackage.WINDOW__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DsmlPackage.WINDOW__WINDOW:
				return WINDOW_EDEFAULT == null ? window != null : !WINDOW_EDEFAULT.equals(window);
			case DsmlPackage.WINDOW__TYPE_WINDOW:
				return typeWindow != TYPE_WINDOW_EDEFAULT;
			case DsmlPackage.WINDOW__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (window: ");
		result.append(window);
		result.append(", typeWindow: ");
		result.append(typeWindow);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //WindowImpl