/**
 */
package dsml.impl;

import dsml.DsmlPackage;
import dsml.ValueOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.ValueOperatorImpl#getValueOperator <em>Value Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueOperatorImpl extends QueryImpl implements ValueOperator {
	/**
	 * The default value of the '{@link #getValueOperator() <em>Value Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueOperator() <em>Value Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOperator()
	 * @generated
	 * @ordered
	 */
	protected String valueOperator = VALUE_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.VALUE_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueOperator() {
		return valueOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOperator(String newValueOperator) {
		String oldValueOperator = valueOperator;
		valueOperator = newValueOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.VALUE_OPERATOR__VALUE_OPERATOR, oldValueOperator, valueOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.VALUE_OPERATOR__VALUE_OPERATOR:
				return getValueOperator();
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
			case DsmlPackage.VALUE_OPERATOR__VALUE_OPERATOR:
				setValueOperator((String)newValue);
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
			case DsmlPackage.VALUE_OPERATOR__VALUE_OPERATOR:
				setValueOperator(VALUE_OPERATOR_EDEFAULT);
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
			case DsmlPackage.VALUE_OPERATOR__VALUE_OPERATOR:
				return VALUE_OPERATOR_EDEFAULT == null ? valueOperator != null : !VALUE_OPERATOR_EDEFAULT.equals(valueOperator);
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
		result.append(" (valueOperator: ");
		result.append(valueOperator);
		result.append(')');
		return result.toString();
	}

} //ValueOperatorImpl
