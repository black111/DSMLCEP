/**
 */
package dsml.impl;

import dsml.DsmlPackage;
import dsml.LinkPatternTarget;
import dsml.Query;
import dsml.Target;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.TargetImpl#getTargetAlias <em>Target Alias</em>}</li>
 *   <li>{@link dsml.impl.TargetImpl#getOperationTypes <em>Operation Types</em>}</li>
 *   <li>{@link dsml.impl.TargetImpl#getIncomingTarget <em>Incoming Target</em>}</li>
 *   <li>{@link dsml.impl.TargetImpl#getOutgoingTarget <em>Outgoing Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetImpl extends PatternImpl implements Target {
	/**
	 * The default value of the '{@link #getTargetAlias() <em>Target Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetAlias() <em>Target Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAlias()
	 * @generated
	 * @ordered
	 */
	protected String targetAlias = TARGET_ALIAS_EDEFAULT;

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
	 * The cached value of the '{@link #getIncomingTarget() <em>Incoming Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTarget()
	 * @generated
	 * @ordered
	 */
	protected LinkPatternTarget incomingTarget;

	/**
	 * The cached value of the '{@link #getOutgoingTarget() <em>Outgoing Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTarget()
	 * @generated
	 * @ordered
	 */
	protected LinkPatternTarget outgoingTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetAlias() {
		return targetAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAlias(String newTargetAlias) {
		String oldTargetAlias = targetAlias;
		targetAlias = newTargetAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.TARGET__TARGET_ALIAS, oldTargetAlias, targetAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getOperationTypes() {
		if (operationTypes == null) {
			operationTypes = new EObjectContainmentEList<Query>(Query.class, this, DsmlPackage.TARGET__OPERATION_TYPES);
		}
		return operationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPatternTarget getIncomingTarget() {
		if (incomingTarget != null && incomingTarget.eIsProxy()) {
			InternalEObject oldIncomingTarget = (InternalEObject)incomingTarget;
			incomingTarget = (LinkPatternTarget)eResolveProxy(oldIncomingTarget);
			if (incomingTarget != oldIncomingTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsmlPackage.TARGET__INCOMING_TARGET, oldIncomingTarget, incomingTarget));
			}
		}
		return incomingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPatternTarget basicGetIncomingTarget() {
		return incomingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingTarget(LinkPatternTarget newIncomingTarget, NotificationChain msgs) {
		LinkPatternTarget oldIncomingTarget = incomingTarget;
		incomingTarget = newIncomingTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsmlPackage.TARGET__INCOMING_TARGET, oldIncomingTarget, newIncomingTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingTarget(LinkPatternTarget newIncomingTarget) {
		if (newIncomingTarget != incomingTarget) {
			NotificationChain msgs = null;
			if (incomingTarget != null)
				msgs = ((InternalEObject)incomingTarget).eInverseRemove(this, DsmlPackage.LINK_PATTERN_TARGET__TARGET, LinkPatternTarget.class, msgs);
			if (newIncomingTarget != null)
				msgs = ((InternalEObject)newIncomingTarget).eInverseAdd(this, DsmlPackage.LINK_PATTERN_TARGET__TARGET, LinkPatternTarget.class, msgs);
			msgs = basicSetIncomingTarget(newIncomingTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.TARGET__INCOMING_TARGET, newIncomingTarget, newIncomingTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPatternTarget getOutgoingTarget() {
		if (outgoingTarget != null && outgoingTarget.eIsProxy()) {
			InternalEObject oldOutgoingTarget = (InternalEObject)outgoingTarget;
			outgoingTarget = (LinkPatternTarget)eResolveProxy(oldOutgoingTarget);
			if (outgoingTarget != oldOutgoingTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsmlPackage.TARGET__OUTGOING_TARGET, oldOutgoingTarget, outgoingTarget));
			}
		}
		return outgoingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPatternTarget basicGetOutgoingTarget() {
		return outgoingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingTarget(LinkPatternTarget newOutgoingTarget, NotificationChain msgs) {
		LinkPatternTarget oldOutgoingTarget = outgoingTarget;
		outgoingTarget = newOutgoingTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsmlPackage.TARGET__OUTGOING_TARGET, oldOutgoingTarget, newOutgoingTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingTarget(LinkPatternTarget newOutgoingTarget) {
		if (newOutgoingTarget != outgoingTarget) {
			NotificationChain msgs = null;
			if (outgoingTarget != null)
				msgs = ((InternalEObject)outgoingTarget).eInverseRemove(this, DsmlPackage.LINK_PATTERN_TARGET__SOURCE, LinkPatternTarget.class, msgs);
			if (newOutgoingTarget != null)
				msgs = ((InternalEObject)newOutgoingTarget).eInverseAdd(this, DsmlPackage.LINK_PATTERN_TARGET__SOURCE, LinkPatternTarget.class, msgs);
			msgs = basicSetOutgoingTarget(newOutgoingTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.TARGET__OUTGOING_TARGET, newOutgoingTarget, newOutgoingTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsmlPackage.TARGET__INCOMING_TARGET:
				if (incomingTarget != null)
					msgs = ((InternalEObject)incomingTarget).eInverseRemove(this, DsmlPackage.LINK_PATTERN_TARGET__TARGET, LinkPatternTarget.class, msgs);
				return basicSetIncomingTarget((LinkPatternTarget)otherEnd, msgs);
			case DsmlPackage.TARGET__OUTGOING_TARGET:
				if (outgoingTarget != null)
					msgs = ((InternalEObject)outgoingTarget).eInverseRemove(this, DsmlPackage.LINK_PATTERN_TARGET__SOURCE, LinkPatternTarget.class, msgs);
				return basicSetOutgoingTarget((LinkPatternTarget)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsmlPackage.TARGET__OPERATION_TYPES:
				return ((InternalEList<?>)getOperationTypes()).basicRemove(otherEnd, msgs);
			case DsmlPackage.TARGET__INCOMING_TARGET:
				return basicSetIncomingTarget(null, msgs);
			case DsmlPackage.TARGET__OUTGOING_TARGET:
				return basicSetOutgoingTarget(null, msgs);
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
			case DsmlPackage.TARGET__TARGET_ALIAS:
				return getTargetAlias();
			case DsmlPackage.TARGET__OPERATION_TYPES:
				return getOperationTypes();
			case DsmlPackage.TARGET__INCOMING_TARGET:
				if (resolve) return getIncomingTarget();
				return basicGetIncomingTarget();
			case DsmlPackage.TARGET__OUTGOING_TARGET:
				if (resolve) return getOutgoingTarget();
				return basicGetOutgoingTarget();
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
			case DsmlPackage.TARGET__TARGET_ALIAS:
				setTargetAlias((String)newValue);
				return;
			case DsmlPackage.TARGET__OPERATION_TYPES:
				getOperationTypes().clear();
				getOperationTypes().addAll((Collection<? extends Query>)newValue);
				return;
			case DsmlPackage.TARGET__INCOMING_TARGET:
				setIncomingTarget((LinkPatternTarget)newValue);
				return;
			case DsmlPackage.TARGET__OUTGOING_TARGET:
				setOutgoingTarget((LinkPatternTarget)newValue);
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
			case DsmlPackage.TARGET__TARGET_ALIAS:
				setTargetAlias(TARGET_ALIAS_EDEFAULT);
				return;
			case DsmlPackage.TARGET__OPERATION_TYPES:
				getOperationTypes().clear();
				return;
			case DsmlPackage.TARGET__INCOMING_TARGET:
				setIncomingTarget((LinkPatternTarget)null);
				return;
			case DsmlPackage.TARGET__OUTGOING_TARGET:
				setOutgoingTarget((LinkPatternTarget)null);
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
			case DsmlPackage.TARGET__TARGET_ALIAS:
				return TARGET_ALIAS_EDEFAULT == null ? targetAlias != null : !TARGET_ALIAS_EDEFAULT.equals(targetAlias);
			case DsmlPackage.TARGET__OPERATION_TYPES:
				return operationTypes != null && !operationTypes.isEmpty();
			case DsmlPackage.TARGET__INCOMING_TARGET:
				return incomingTarget != null;
			case DsmlPackage.TARGET__OUTGOING_TARGET:
				return outgoingTarget != null;
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
		result.append(" (targetAlias: ");
		result.append(targetAlias);
		result.append(')');
		return result.toString();
	}

} //TargetImpl
