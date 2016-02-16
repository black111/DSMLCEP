/**
 */
package dsml.impl;

import dsml.Comparison;
import dsml.DsmlPackage;
import dsml.TypeComparison;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.ComparisonImpl#getComparison <em>Comparison</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonImpl extends LinkImpl implements Comparison {
	/**
	 * The default value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected static final TypeComparison COMPARISON_EDEFAULT = TypeComparison.EQUAL;

	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected TypeComparison comparison = COMPARISON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeComparison getComparison() {
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparison(TypeComparison newComparison) {
		TypeComparison oldComparison = comparison;
		comparison = newComparison == null ? COMPARISON_EDEFAULT : newComparison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.COMPARISON__COMPARISON, oldComparison, comparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.COMPARISON__COMPARISON:
				return getComparison();
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
			case DsmlPackage.COMPARISON__COMPARISON:
				setComparison((TypeComparison)newValue);
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
			case DsmlPackage.COMPARISON__COMPARISON:
				setComparison(COMPARISON_EDEFAULT);
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
			case DsmlPackage.COMPARISON__COMPARISON:
				return comparison != COMPARISON_EDEFAULT;
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
		result.append(" (comparison: ");
		result.append(comparison);
		result.append(')');
		return result.toString();
	}

} //ComparisonImpl
