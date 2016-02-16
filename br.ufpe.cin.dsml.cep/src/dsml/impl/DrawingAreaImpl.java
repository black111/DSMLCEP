/**
 */
package dsml.impl;

import dsml.DrawingArea;
import dsml.DsmlPackage;
import dsml.Event;
import dsml.EventOutput;
import dsml.EventPattern;
import dsml.Link;
import dsml.LinkPatternTarget;
import dsml.LinkTarget;
import dsml.Rule;
import dsml.TargetGroupby;
import dsml.Window;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drawing Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getTargetGroupby <em>Target Groupby</em>}</li>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getLinkPatternTarget <em>Link Pattern Target</em>}</li>
 *   <li>{@link dsml.impl.DrawingAreaImpl#getLinkTaget <em>Link Taget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrawingAreaImpl extends EObjectImpl implements DrawingArea {
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EventPattern patterns;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EventOutput output;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> windows;

	/**
	 * The cached value of the '{@link #getTargetGroupby() <em>Target Groupby</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGroupby()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetGroupby> targetGroupby;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getLinkPatternTarget() <em>Link Pattern Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkPatternTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkPatternTarget> linkPatternTarget;

	/**
	 * The cached value of the '{@link #getLinkTaget() <em>Link Taget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTaget()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkTarget> linkTaget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrawingAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.DRAWING_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsmlPackage.DRAWING_AREA__RULE, oldRule, newRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsmlPackage.DRAWING_AREA__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsmlPackage.DRAWING_AREA__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.DRAWING_AREA__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, DsmlPackage.DRAWING_AREA__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPattern getPatterns() {
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatterns(EventPattern newPatterns, NotificationChain msgs) {
		EventPattern oldPatterns = patterns;
		patterns = newPatterns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsmlPackage.DRAWING_AREA__PATTERNS, oldPatterns, newPatterns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatterns(EventPattern newPatterns) {
		if (newPatterns != patterns) {
			NotificationChain msgs = null;
			if (patterns != null)
				msgs = ((InternalEObject)patterns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsmlPackage.DRAWING_AREA__PATTERNS, null, msgs);
			if (newPatterns != null)
				msgs = ((InternalEObject)newPatterns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsmlPackage.DRAWING_AREA__PATTERNS, null, msgs);
			msgs = basicSetPatterns(newPatterns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.DRAWING_AREA__PATTERNS, newPatterns, newPatterns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOutput getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(EventOutput newOutput, NotificationChain msgs) {
		EventOutput oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsmlPackage.DRAWING_AREA__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(EventOutput newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsmlPackage.DRAWING_AREA__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsmlPackage.DRAWING_AREA__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.DRAWING_AREA__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindows() {
		if (windows == null) {
			windows = new EObjectContainmentEList<Window>(Window.class, this, DsmlPackage.DRAWING_AREA__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetGroupby> getTargetGroupby() {
		if (targetGroupby == null) {
			targetGroupby = new EObjectContainmentEList<TargetGroupby>(TargetGroupby.class, this, DsmlPackage.DRAWING_AREA__TARGET_GROUPBY);
		}
		return targetGroupby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, DsmlPackage.DRAWING_AREA__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkPatternTarget> getLinkPatternTarget() {
		if (linkPatternTarget == null) {
			linkPatternTarget = new EObjectContainmentEList<LinkPatternTarget>(LinkPatternTarget.class, this, DsmlPackage.DRAWING_AREA__LINK_PATTERN_TARGET);
		}
		return linkPatternTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkTarget> getLinkTaget() {
		if (linkTaget == null) {
			linkTaget = new EObjectContainmentEList<LinkTarget>(LinkTarget.class, this, DsmlPackage.DRAWING_AREA__LINK_TAGET);
		}
		return linkTaget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsmlPackage.DRAWING_AREA__RULE:
				return basicSetRule(null, msgs);
			case DsmlPackage.DRAWING_AREA__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case DsmlPackage.DRAWING_AREA__PATTERNS:
				return basicSetPatterns(null, msgs);
			case DsmlPackage.DRAWING_AREA__OUTPUT:
				return basicSetOutput(null, msgs);
			case DsmlPackage.DRAWING_AREA__WINDOWS:
				return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
			case DsmlPackage.DRAWING_AREA__TARGET_GROUPBY:
				return ((InternalEList<?>)getTargetGroupby()).basicRemove(otherEnd, msgs);
			case DsmlPackage.DRAWING_AREA__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case DsmlPackage.DRAWING_AREA__LINK_PATTERN_TARGET:
				return ((InternalEList<?>)getLinkPatternTarget()).basicRemove(otherEnd, msgs);
			case DsmlPackage.DRAWING_AREA__LINK_TAGET:
				return ((InternalEList<?>)getLinkTaget()).basicRemove(otherEnd, msgs);
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
			case DsmlPackage.DRAWING_AREA__RULE:
				return getRule();
			case DsmlPackage.DRAWING_AREA__EVENTS:
				return getEvents();
			case DsmlPackage.DRAWING_AREA__PATTERNS:
				return getPatterns();
			case DsmlPackage.DRAWING_AREA__OUTPUT:
				return getOutput();
			case DsmlPackage.DRAWING_AREA__WINDOWS:
				return getWindows();
			case DsmlPackage.DRAWING_AREA__TARGET_GROUPBY:
				return getTargetGroupby();
			case DsmlPackage.DRAWING_AREA__LINKS:
				return getLinks();
			case DsmlPackage.DRAWING_AREA__LINK_PATTERN_TARGET:
				return getLinkPatternTarget();
			case DsmlPackage.DRAWING_AREA__LINK_TAGET:
				return getLinkTaget();
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
			case DsmlPackage.DRAWING_AREA__RULE:
				setRule((Rule)newValue);
				return;
			case DsmlPackage.DRAWING_AREA__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case DsmlPackage.DRAWING_AREA__PATTERNS:
				setPatterns((EventPattern)newValue);
				return;
			case DsmlPackage.DRAWING_AREA__OUTPUT:
				setOutput((EventOutput)newValue);
				return;
			case DsmlPackage.DRAWING_AREA__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends Window>)newValue);
				return;
			case DsmlPackage.DRAWING_AREA__TARGET_GROUPBY:
				getTargetGroupby().clear();
				getTargetGroupby().addAll((Collection<? extends TargetGroupby>)newValue);
				return;
			case DsmlPackage.DRAWING_AREA__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case DsmlPackage.DRAWING_AREA__LINK_PATTERN_TARGET:
				getLinkPatternTarget().clear();
				getLinkPatternTarget().addAll((Collection<? extends LinkPatternTarget>)newValue);
				return;
			case DsmlPackage.DRAWING_AREA__LINK_TAGET:
				getLinkTaget().clear();
				getLinkTaget().addAll((Collection<? extends LinkTarget>)newValue);
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
			case DsmlPackage.DRAWING_AREA__RULE:
				setRule((Rule)null);
				return;
			case DsmlPackage.DRAWING_AREA__EVENTS:
				getEvents().clear();
				return;
			case DsmlPackage.DRAWING_AREA__PATTERNS:
				setPatterns((EventPattern)null);
				return;
			case DsmlPackage.DRAWING_AREA__OUTPUT:
				setOutput((EventOutput)null);
				return;
			case DsmlPackage.DRAWING_AREA__WINDOWS:
				getWindows().clear();
				return;
			case DsmlPackage.DRAWING_AREA__TARGET_GROUPBY:
				getTargetGroupby().clear();
				return;
			case DsmlPackage.DRAWING_AREA__LINKS:
				getLinks().clear();
				return;
			case DsmlPackage.DRAWING_AREA__LINK_PATTERN_TARGET:
				getLinkPatternTarget().clear();
				return;
			case DsmlPackage.DRAWING_AREA__LINK_TAGET:
				getLinkTaget().clear();
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
			case DsmlPackage.DRAWING_AREA__RULE:
				return rule != null;
			case DsmlPackage.DRAWING_AREA__EVENTS:
				return events != null && !events.isEmpty();
			case DsmlPackage.DRAWING_AREA__PATTERNS:
				return patterns != null;
			case DsmlPackage.DRAWING_AREA__OUTPUT:
				return output != null;
			case DsmlPackage.DRAWING_AREA__WINDOWS:
				return windows != null && !windows.isEmpty();
			case DsmlPackage.DRAWING_AREA__TARGET_GROUPBY:
				return targetGroupby != null && !targetGroupby.isEmpty();
			case DsmlPackage.DRAWING_AREA__LINKS:
				return links != null && !links.isEmpty();
			case DsmlPackage.DRAWING_AREA__LINK_PATTERN_TARGET:
				return linkPatternTarget != null && !linkPatternTarget.isEmpty();
			case DsmlPackage.DRAWING_AREA__LINK_TAGET:
				return linkTaget != null && !linkTaget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DrawingAreaImpl
