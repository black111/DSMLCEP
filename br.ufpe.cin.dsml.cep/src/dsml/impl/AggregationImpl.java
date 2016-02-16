/**
 */
package dsml.impl;

import dsml.Aggregation;
import dsml.Attribute;
import dsml.DsmlPackage;
import dsml.TypeAggregation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.AggregationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link dsml.impl.AggregationImpl#getTypeAggregation <em>Type Aggregation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregationImpl extends QueryImpl implements Aggregation {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * The default value of the '{@link #getTypeAggregation() <em>Type Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAggregation TYPE_AGGREGATION_EDEFAULT = TypeAggregation.AVG;

	/**
	 * The cached value of the '{@link #getTypeAggregation() <em>Type Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAggregation()
	 * @generated
	 * @ordered
	 */
	protected TypeAggregation typeAggregation = TYPE_AGGREGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsmlPackage.AGGREGATION__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.AGGREGATION__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAggregation getTypeAggregation() {
		return typeAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAggregation(TypeAggregation newTypeAggregation) {
		TypeAggregation oldTypeAggregation = typeAggregation;
		typeAggregation = newTypeAggregation == null ? TYPE_AGGREGATION_EDEFAULT : newTypeAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.AGGREGATION__TYPE_AGGREGATION, oldTypeAggregation, typeAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.AGGREGATION__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case DsmlPackage.AGGREGATION__TYPE_AGGREGATION:
				return getTypeAggregation();
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
			case DsmlPackage.AGGREGATION__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case DsmlPackage.AGGREGATION__TYPE_AGGREGATION:
				setTypeAggregation((TypeAggregation)newValue);
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
			case DsmlPackage.AGGREGATION__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case DsmlPackage.AGGREGATION__TYPE_AGGREGATION:
				setTypeAggregation(TYPE_AGGREGATION_EDEFAULT);
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
			case DsmlPackage.AGGREGATION__ATTRIBUTE:
				return attribute != null;
			case DsmlPackage.AGGREGATION__TYPE_AGGREGATION:
				return typeAggregation != TYPE_AGGREGATION_EDEFAULT;
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
		result.append(" (typeAggregation: ");
		result.append(typeAggregation);
		result.append(')');
		return result.toString();
	}

} //AggregationImpl
