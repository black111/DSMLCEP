/**
 */
package dsml.impl;

import dsml.Attribute;
import dsml.DsmlPackage;
import dsml.GroupbyCondition;
import dsml.Query;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Groupby Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.GroupbyConditionImpl#getGroupbyCondition <em>Groupby Condition</em>}</li>
 *   <li>{@link dsml.impl.GroupbyConditionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dsml.impl.GroupbyConditionImpl#getOperationTypes <em>Operation Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupbyConditionImpl extends QueryImpl implements GroupbyCondition {
	/**
	 * The default value of the '{@link #getGroupbyCondition() <em>Groupby Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupbyCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUPBY_CONDITION_EDEFAULT = "groupbyCondition";

	/**
	 * The cached value of the '{@link #getGroupbyCondition() <em>Groupby Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupbyCondition()
	 * @generated
	 * @ordered
	 */
	protected String groupbyCondition = GROUPBY_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	protected GroupbyConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.GROUPBY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupbyCondition() {
		return groupbyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, DsmlPackage.GROUPBY_CONDITION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getOperationTypes() {
		if (operationTypes == null) {
			operationTypes = new EObjectContainmentEList<Query>(Query.class, this, DsmlPackage.GROUPBY_CONDITION__OPERATION_TYPES);
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
			case DsmlPackage.GROUPBY_CONDITION__OPERATION_TYPES:
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
			case DsmlPackage.GROUPBY_CONDITION__GROUPBY_CONDITION:
				return getGroupbyCondition();
			case DsmlPackage.GROUPBY_CONDITION__ATTRIBUTES:
				return getAttributes();
			case DsmlPackage.GROUPBY_CONDITION__OPERATION_TYPES:
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
			case DsmlPackage.GROUPBY_CONDITION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case DsmlPackage.GROUPBY_CONDITION__OPERATION_TYPES:
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
			case DsmlPackage.GROUPBY_CONDITION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case DsmlPackage.GROUPBY_CONDITION__OPERATION_TYPES:
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
			case DsmlPackage.GROUPBY_CONDITION__GROUPBY_CONDITION:
				return GROUPBY_CONDITION_EDEFAULT == null ? groupbyCondition != null : !GROUPBY_CONDITION_EDEFAULT.equals(groupbyCondition);
			case DsmlPackage.GROUPBY_CONDITION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case DsmlPackage.GROUPBY_CONDITION__OPERATION_TYPES:
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
		result.append(" (groupbyCondition: ");
		result.append(groupbyCondition);
		result.append(')');
		return result.toString();
	}

} //GroupbyConditionImpl
