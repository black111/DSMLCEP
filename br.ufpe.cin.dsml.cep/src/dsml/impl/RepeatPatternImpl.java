/**
 */
package dsml.impl;

import dsml.DsmlPackage;
import dsml.RepeatPattern;
import dsml.TypeRepeatPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.RepeatPatternImpl#getRepeatPattern <em>Repeat Pattern</em>}</li>
 *   <li>{@link dsml.impl.RepeatPatternImpl#getTypePatternTimer <em>Type Pattern Timer</em>}</li>
 *   <li>{@link dsml.impl.RepeatPatternImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatPatternImpl extends PatternImpl implements RepeatPattern {
	/**
	 * The default value of the '{@link #getRepeatPattern() <em>Repeat Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEAT_PATTERN_EDEFAULT = "RepeatPattern";

	/**
	 * The cached value of the '{@link #getRepeatPattern() <em>Repeat Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatPattern()
	 * @generated
	 * @ordered
	 */
	protected String repeatPattern = REPEAT_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypePatternTimer() <em>Type Pattern Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePatternTimer()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRepeatPattern TYPE_PATTERN_TIMER_EDEFAULT = TypeRepeatPattern.RANGE;

	/**
	 * The cached value of the '{@link #getTypePatternTimer() <em>Type Pattern Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePatternTimer()
	 * @generated
	 * @ordered
	 */
	protected TypeRepeatPattern typePatternTimer = TYPE_PATTERN_TIMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.REPEAT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeatPattern() {
		return repeatPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRepeatPattern getTypePatternTimer() {
		return typePatternTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePatternTimer(TypeRepeatPattern newTypePatternTimer) {
		TypeRepeatPattern oldTypePatternTimer = typePatternTimer;
		typePatternTimer = newTypePatternTimer == null ? TYPE_PATTERN_TIMER_EDEFAULT : newTypePatternTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.REPEAT_PATTERN__TYPE_PATTERN_TIMER, oldTypePatternTimer, typePatternTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.REPEAT_PATTERN__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.REPEAT_PATTERN__REPEAT_PATTERN:
				return getRepeatPattern();
			case DsmlPackage.REPEAT_PATTERN__TYPE_PATTERN_TIMER:
				return getTypePatternTimer();
			case DsmlPackage.REPEAT_PATTERN__VALUE:
				return getValue();
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
			case DsmlPackage.REPEAT_PATTERN__TYPE_PATTERN_TIMER:
				setTypePatternTimer((TypeRepeatPattern)newValue);
				return;
			case DsmlPackage.REPEAT_PATTERN__VALUE:
				setValue((String)newValue);
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
			case DsmlPackage.REPEAT_PATTERN__TYPE_PATTERN_TIMER:
				setTypePatternTimer(TYPE_PATTERN_TIMER_EDEFAULT);
				return;
			case DsmlPackage.REPEAT_PATTERN__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case DsmlPackage.REPEAT_PATTERN__REPEAT_PATTERN:
				return REPEAT_PATTERN_EDEFAULT == null ? repeatPattern != null : !REPEAT_PATTERN_EDEFAULT.equals(repeatPattern);
			case DsmlPackage.REPEAT_PATTERN__TYPE_PATTERN_TIMER:
				return typePatternTimer != TYPE_PATTERN_TIMER_EDEFAULT;
			case DsmlPackage.REPEAT_PATTERN__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (repeatPattern: ");
		result.append(repeatPattern);
		result.append(", typePatternTimer: ");
		result.append(typePatternTimer);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //RepeatPatternImpl
