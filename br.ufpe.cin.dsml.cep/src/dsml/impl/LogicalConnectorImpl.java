/**
 */
package dsml.impl;

import dsml.DsmlPackage;
import dsml.LogicalConnector;
import dsml.TypeLogical;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.LogicalConnectorImpl#getTypeLogical <em>Type Logical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalConnectorImpl extends LinkImpl implements LogicalConnector {
	/**
	 * The default value of the '{@link #getTypeLogical() <em>Type Logical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLogical()
	 * @generated
	 * @ordered
	 */
	protected static final TypeLogical TYPE_LOGICAL_EDEFAULT = TypeLogical.AND;

	/**
	 * The cached value of the '{@link #getTypeLogical() <em>Type Logical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLogical()
	 * @generated
	 * @ordered
	 */
	protected TypeLogical typeLogical = TYPE_LOGICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.LOGICAL_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLogical getTypeLogical() {
		return typeLogical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLogical(TypeLogical newTypeLogical) {
		TypeLogical oldTypeLogical = typeLogical;
		typeLogical = newTypeLogical == null ? TYPE_LOGICAL_EDEFAULT : newTypeLogical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.LOGICAL_CONNECTOR__TYPE_LOGICAL, oldTypeLogical, typeLogical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.LOGICAL_CONNECTOR__TYPE_LOGICAL:
				return getTypeLogical();
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
			case DsmlPackage.LOGICAL_CONNECTOR__TYPE_LOGICAL:
				setTypeLogical((TypeLogical)newValue);
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
			case DsmlPackage.LOGICAL_CONNECTOR__TYPE_LOGICAL:
				setTypeLogical(TYPE_LOGICAL_EDEFAULT);
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
			case DsmlPackage.LOGICAL_CONNECTOR__TYPE_LOGICAL:
				return typeLogical != TYPE_LOGICAL_EDEFAULT;
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
		result.append(" (typeLogical: ");
		result.append(typeLogical);
		result.append(')');
		return result.toString();
	}

} //LogicalConnectorImpl
