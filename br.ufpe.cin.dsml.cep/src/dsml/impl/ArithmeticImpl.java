/**
 */
package dsml.impl;

import dsml.Arithmetic;
import dsml.DsmlPackage;
import dsml.TypeArithmetic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.ArithmeticImpl#getArithmetic <em>Arithmetic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArithmeticImpl extends LinkImpl implements Arithmetic {
	/**
	 * The default value of the '{@link #getArithmetic() <em>Arithmetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmetic()
	 * @generated
	 * @ordered
	 */
	protected static final TypeArithmetic ARITHMETIC_EDEFAULT = TypeArithmetic.ADDITION;

	/**
	 * The cached value of the '{@link #getArithmetic() <em>Arithmetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArithmetic()
	 * @generated
	 * @ordered
	 */
	protected TypeArithmetic arithmetic = ARITHMETIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.ARITHMETIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeArithmetic getArithmetic() {
		return arithmetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArithmetic(TypeArithmetic newArithmetic) {
		TypeArithmetic oldArithmetic = arithmetic;
		arithmetic = newArithmetic == null ? ARITHMETIC_EDEFAULT : newArithmetic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.ARITHMETIC__ARITHMETIC, oldArithmetic, arithmetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.ARITHMETIC__ARITHMETIC:
				return getArithmetic();
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
			case DsmlPackage.ARITHMETIC__ARITHMETIC:
				setArithmetic((TypeArithmetic)newValue);
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
			case DsmlPackage.ARITHMETIC__ARITHMETIC:
				setArithmetic(ARITHMETIC_EDEFAULT);
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
			case DsmlPackage.ARITHMETIC__ARITHMETIC:
				return arithmetic != ARITHMETIC_EDEFAULT;
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
		result.append(" (arithmetic: ");
		result.append(arithmetic);
		result.append(')');
		return result.toString();
	}

} //ArithmeticImpl
