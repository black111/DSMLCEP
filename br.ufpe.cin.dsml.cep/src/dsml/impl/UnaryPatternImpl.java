/**
 */
package dsml.impl;

import dsml.DsmlPackage;
import dsml.TypeUnaryPattern;
import dsml.UnaryPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.UnaryPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsml.impl.UnaryPatternImpl#getTypeUnaryPattern <em>Type Unary Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryPatternImpl extends PatternImpl implements UnaryPattern {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UnaryPattern";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeUnaryPattern() <em>Type Unary Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeUnaryPattern()
	 * @generated
	 * @ordered
	 */
	protected static final TypeUnaryPattern TYPE_UNARY_PATTERN_EDEFAULT = TypeUnaryPattern.EVERY;

	/**
	 * The cached value of the '{@link #getTypeUnaryPattern() <em>Type Unary Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeUnaryPattern()
	 * @generated
	 * @ordered
	 */
	protected TypeUnaryPattern typeUnaryPattern = TYPE_UNARY_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.UNARY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUnaryPattern getTypeUnaryPattern() {
		return typeUnaryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeUnaryPattern(TypeUnaryPattern newTypeUnaryPattern) {
		TypeUnaryPattern oldTypeUnaryPattern = typeUnaryPattern;
		typeUnaryPattern = newTypeUnaryPattern == null ? TYPE_UNARY_PATTERN_EDEFAULT : newTypeUnaryPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsmlPackage.UNARY_PATTERN__TYPE_UNARY_PATTERN, oldTypeUnaryPattern, typeUnaryPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsmlPackage.UNARY_PATTERN__NAME:
				return getName();
			case DsmlPackage.UNARY_PATTERN__TYPE_UNARY_PATTERN:
				return getTypeUnaryPattern();
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
			case DsmlPackage.UNARY_PATTERN__TYPE_UNARY_PATTERN:
				setTypeUnaryPattern((TypeUnaryPattern)newValue);
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
			case DsmlPackage.UNARY_PATTERN__TYPE_UNARY_PATTERN:
				setTypeUnaryPattern(TYPE_UNARY_PATTERN_EDEFAULT);
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
			case DsmlPackage.UNARY_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DsmlPackage.UNARY_PATTERN__TYPE_UNARY_PATTERN:
				return typeUnaryPattern != TYPE_UNARY_PATTERN_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", typeUnaryPattern: ");
		result.append(typeUnaryPattern);
		result.append(')');
		return result.toString();
	}

} //UnaryPatternImpl
