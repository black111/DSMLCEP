/**
 */
package dsml.impl;

import dsml.DsmlPackage;
import dsml.LinkPatternTarget;
import dsml.Target;
import dsml.TypeTargetComparison;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Pattern Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.LinkPatternTargetImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dsml.impl.LinkPatternTargetImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dsml.impl.LinkPatternTargetImpl#getComparisonTarget <em>Comparison Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkPatternTargetImpl extends EObjectImpl implements LinkPatternTarget {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Target source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Target target;

	/**
	 * The default value of the '{@link #getComparisonTarget() <em>Comparison Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonTarget()
	 * @generated
	 * @ordered
	 */
	protected static final TypeTargetComparison COMPARISON_TARGET_EDEFAULT = TypeTargetComparison.FOLLOWEDBY;

	/**
	 * The cached value of the '{@link #getComparisonTarget() <em>Comparison Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonTarget()
	 * @generated
	 * @ordered
	 */
	protected TypeTargetComparison comparisonTarget = COMPARISON_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkPatternTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.LINK_PATTERN_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Target)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsmlPackage.LINK_PATTERN_TARGET__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Target newSource, NotificationChain msgs) {
		Target oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsmlPackage.LINK_PATTERN_TARGET__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Target newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, DsmlPackage.TARGET__OUTGOING_TARGET, Target.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, DsmlPackage.TARGET__OUTGOING_TARGET, Target.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.LINK_PATTERN_TARGET__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Target)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsmlPackage.LINK_PATTERN_TARGET__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Target newTarget, NotificationChain msgs) {
		Target oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsmlPackage.LINK_PATTERN_TARGET__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Target newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, DsmlPackage.TARGET__INCOMING_TARGET, Target.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, DsmlPackage.TARGET__INCOMING_TARGET, Target.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.LINK_PATTERN_TARGET__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTargetComparison getComparisonTarget() {
		return comparisonTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonTarget(TypeTargetComparison newComparisonTarget) {
		TypeTargetComparison oldComparisonTarget = comparisonTarget;
		comparisonTarget = newComparisonTarget == null ? COMPARISON_TARGET_EDEFAULT : newComparisonTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.LINK_PATTERN_TARGET__COMPARISON_TARGET, oldComparisonTarget, comparisonTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsmlPackage.LINK_PATTERN_TARGET__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, DsmlPackage.TARGET__OUTGOING_TARGET, Target.class, msgs);
				return basicSetSource((Target)otherEnd, msgs);
			case DsmlPackage.LINK_PATTERN_TARGET__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, DsmlPackage.TARGET__INCOMING_TARGET, Target.class, msgs);
				return basicSetTarget((Target)otherEnd, msgs);
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
			case DsmlPackage.LINK_PATTERN_TARGET__SOURCE:
				return basicSetSource(null, msgs);
			case DsmlPackage.LINK_PATTERN_TARGET__TARGET:
				return basicSetTarget(null, msgs);
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
			case DsmlPackage.LINK_PATTERN_TARGET__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DsmlPackage.LINK_PATTERN_TARGET__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DsmlPackage.LINK_PATTERN_TARGET__COMPARISON_TARGET:
				return getComparisonTarget();
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
			case DsmlPackage.LINK_PATTERN_TARGET__SOURCE:
				setSource((Target)newValue);
				return;
			case DsmlPackage.LINK_PATTERN_TARGET__TARGET:
				setTarget((Target)newValue);
				return;
			case DsmlPackage.LINK_PATTERN_TARGET__COMPARISON_TARGET:
				setComparisonTarget((TypeTargetComparison)newValue);
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
			case DsmlPackage.LINK_PATTERN_TARGET__SOURCE:
				setSource((Target)null);
				return;
			case DsmlPackage.LINK_PATTERN_TARGET__TARGET:
				setTarget((Target)null);
				return;
			case DsmlPackage.LINK_PATTERN_TARGET__COMPARISON_TARGET:
				setComparisonTarget(COMPARISON_TARGET_EDEFAULT);
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
			case DsmlPackage.LINK_PATTERN_TARGET__SOURCE:
				return source != null;
			case DsmlPackage.LINK_PATTERN_TARGET__TARGET:
				return target != null;
			case DsmlPackage.LINK_PATTERN_TARGET__COMPARISON_TARGET:
				return comparisonTarget != COMPARISON_TARGET_EDEFAULT;
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
		result.append(" (comparisonTarget: ");
		result.append(comparisonTarget);
		result.append(')');
		return result.toString();
	}

} //LinkPatternTargetImpl
