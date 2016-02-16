/**
 */
package dsml.impl;

import dsml.DsmlPackage;
import dsml.EventOutput;
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
 * An implementation of the model object '<em><b>Event Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsml.impl.EventOutputImpl#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link dsml.impl.EventOutputImpl#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventOutputImpl extends ComponentImpl implements EventOutput {
	/**
	 * The default value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_NAME_EDEFAULT = "OutputEvent";

	/**
	 * The cached value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected String outputName = OUTPUT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> queries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsmlPackage.Literals.EVENT_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputName() {
		return outputName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQueries() {
		if (queries == null) {
			queries = new EObjectContainmentEList<Query>(Query.class, this, DsmlPackage.EVENT_OUTPUT__QUERIES);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsmlPackage.EVENT_OUTPUT__QUERIES:
				return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
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
			case DsmlPackage.EVENT_OUTPUT__OUTPUT_NAME:
				return getOutputName();
			case DsmlPackage.EVENT_OUTPUT__QUERIES:
				return getQueries();
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
			case DsmlPackage.EVENT_OUTPUT__QUERIES:
				getQueries().clear();
				getQueries().addAll((Collection<? extends Query>)newValue);
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
			case DsmlPackage.EVENT_OUTPUT__QUERIES:
				getQueries().clear();
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
			case DsmlPackage.EVENT_OUTPUT__OUTPUT_NAME:
				return OUTPUT_NAME_EDEFAULT == null ? outputName != null : !OUTPUT_NAME_EDEFAULT.equals(outputName);
			case DsmlPackage.EVENT_OUTPUT__QUERIES:
				return queries != null && !queries.isEmpty();
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
		result.append(" (outputName: ");
		result.append(outputName);
		result.append(')');
		return result.toString();
	}

} //EventOutputImpl
