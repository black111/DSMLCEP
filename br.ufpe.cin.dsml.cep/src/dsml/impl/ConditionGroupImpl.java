/**
 */
package dsml.impl;

import dsml.ConditionGroup;
import dsml.DsmlPackage;
import dsml.Query;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.ConditionGroupImpl#getConditionGroup <em>Condition Group</em>}</li>
 *   <li>{@link dsml.impl.ConditionGroupImpl#getOperationTypes <em>Operation Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionGroupImpl extends QueryImpl implements ConditionGroup {
	/**
	 * The default value of the '{@link #getConditionGroup() <em>Condition Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_GROUP_EDEFAULT = "ConditionGroup";

	/**
	 * The cached value of the '{@link #getConditionGroup() <em>Condition Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionGroup()
	 * @generated
	 * @ordered
	 */
	protected String conditionGroup = CONDITION_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationTypes() <em>Operation Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> operationTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.CONDITION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionGroup() {
		return conditionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getOperationTypes() {
		if (operationTypes == null) {
			operationTypes = new EObjectContainmentEList<Query>(Query.class, this, DsmlPackage.CONDITION_GROUP__OPERATION_TYPES);
		}
		return operationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsmlPackage.CONDITION_GROUP__OPERATION_TYPES:
				return ((InternalEList<?>)getOperationTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.CONDITION_GROUP__CONDITION_GROUP:
				return getConditionGroup();
			case DsmlPackage.CONDITION_GROUP__OPERATION_TYPES:
				return getOperationTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsmlPackage.CONDITION_GROUP__OPERATION_TYPES:
				getOperationTypes().clear();
				getOperationTypes().addAll((Collection<? extends Query>)newValue);
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
			case DsmlPackage.CONDITION_GROUP__OPERATION_TYPES:
				getOperationTypes().clear();
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
			case DsmlPackage.CONDITION_GROUP__CONDITION_GROUP:
				return CONDITION_GROUP_EDEFAULT == null ? conditionGroup != null : !CONDITION_GROUP_EDEFAULT.equals(conditionGroup);
			case DsmlPackage.CONDITION_GROUP__OPERATION_TYPES:
				return operationTypes != null && !operationTypes.isEmpty();
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
		result.append(" (conditionGroup: ");
		result.append(conditionGroup);
		result.append(')');
		return result.toString();
	}

} //ConditionGroupImpl