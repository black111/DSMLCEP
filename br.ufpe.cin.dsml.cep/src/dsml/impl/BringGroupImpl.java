/**
 */
package dsml.impl;

import dsml.Attribute;
import dsml.BringGroup;
import dsml.DsmlPackage;
import dsml.Query;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bring Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.BringGroupImpl#getBringGroup <em>Bring Group</em>}</li>
 *   <li>{@link dsml.impl.BringGroupImpl#isBringAll <em>Bring All</em>}</li>
 *   <li>{@link dsml.impl.BringGroupImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dsml.impl.BringGroupImpl#getOperationTypes <em>Operation Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BringGroupImpl extends QueryImpl implements BringGroup {
	/**
	 * The default value of the '{@link #getBringGroup() <em>Bring Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBringGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String BRING_GROUP_EDEFAULT = "BringGroup";

	/**
	 * The cached value of the '{@link #getBringGroup() <em>Bring Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBringGroup()
	 * @generated
	 * @ordered
	 */
	protected String bringGroup = BRING_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #isBringAll() <em>Bring All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBringAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRING_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBringAll() <em>Bring All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBringAll()
	 * @generated
	 * @ordered
	 */
	protected boolean bringAll = BRING_ALL_EDEFAULT;

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
	protected BringGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.BRING_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBringGroup() {
		return bringGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBringAll() {
		return bringAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBringAll(boolean newBringAll) {
		boolean oldBringAll = bringAll;
		bringAll = newBringAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.BRING_GROUP__BRING_ALL, oldBringAll, bringAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, DsmlPackage.BRING_GROUP__ATTRIBUTES);
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
			operationTypes = new EObjectContainmentEList<Query>(Query.class, this, DsmlPackage.BRING_GROUP__OPERATION_TYPES);
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
			case DsmlPackage.BRING_GROUP__OPERATION_TYPES:
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
			case DsmlPackage.BRING_GROUP__BRING_GROUP:
				return getBringGroup();
			case DsmlPackage.BRING_GROUP__BRING_ALL:
				return isBringAll();
			case DsmlPackage.BRING_GROUP__ATTRIBUTES:
				return getAttributes();
			case DsmlPackage.BRING_GROUP__OPERATION_TYPES:
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
			case DsmlPackage.BRING_GROUP__BRING_ALL:
				setBringAll((Boolean)newValue);
				return;
			case DsmlPackage.BRING_GROUP__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case DsmlPackage.BRING_GROUP__OPERATION_TYPES:
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
			case DsmlPackage.BRING_GROUP__BRING_ALL:
				setBringAll(BRING_ALL_EDEFAULT);
				return;
			case DsmlPackage.BRING_GROUP__ATTRIBUTES:
				getAttributes().clear();
				return;
			case DsmlPackage.BRING_GROUP__OPERATION_TYPES:
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
			case DsmlPackage.BRING_GROUP__BRING_GROUP:
				return BRING_GROUP_EDEFAULT == null ? bringGroup != null : !BRING_GROUP_EDEFAULT.equals(bringGroup);
			case DsmlPackage.BRING_GROUP__BRING_ALL:
				return bringAll != BRING_ALL_EDEFAULT;
			case DsmlPackage.BRING_GROUP__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case DsmlPackage.BRING_GROUP__OPERATION_TYPES:
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
		result.append(" (bringGroup: ");
		result.append(bringGroup);
		result.append(", bringAll: ");
		result.append(bringAll);
		result.append(')');
		return result.toString();
	}

} //BringGroupImpl
