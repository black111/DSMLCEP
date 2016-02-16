/**
 */
package dsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drawing Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsml.DrawingArea#getRule <em>Rule</em>}</li>
 *   <li>{@link dsml.DrawingArea#getEvents <em>Events</em>}</li>
 *   <li>{@link dsml.DrawingArea#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link dsml.DrawingArea#getOutput <em>Output</em>}</li>
 *   <li>{@link dsml.DrawingArea#getWindows <em>Windows</em>}</li>
 *   <li>{@link dsml.DrawingArea#getTargetGroupby <em>Target Groupby</em>}</li>
 *   <li>{@link dsml.DrawingArea#getLinks <em>Links</em>}</li>
 *   <li>{@link dsml.DrawingArea#getLinkPatternTarget <em>Link Pattern Target</em>}</li>
 *   <li>{@link dsml.DrawingArea#getLinkTaget <em>Link Taget</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsml.DsmlPackage#getDrawingArea()
 * @model annotation="gmf.diagram foo='bar' rcp='false' onefile='true' diagram.extension='dsml'"
 * @generated
 */
public interface DrawingArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Rule)
	 * @see dsml.DsmlPackage#getDrawingArea_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link dsml.DrawingArea#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see dsml.DsmlPackage#getDrawingArea_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference.
	 * @see #setPatterns(EventPattern)
	 * @see dsml.DsmlPackage#getDrawingArea_Patterns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventPattern getPatterns();

	/**
	 * Sets the value of the '{@link dsml.DrawingArea#getPatterns <em>Patterns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patterns</em>' containment reference.
	 * @see #getPatterns()
	 * @generated
	 */
	void setPatterns(EventPattern value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(EventOutput)
	 * @see dsml.DsmlPackage#getDrawingArea_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventOutput getOutput();

	/**
	 * Sets the value of the '{@link dsml.DrawingArea#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(EventOutput value);

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see dsml.DsmlPackage#getDrawingArea_Windows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Window> getWindows();

	/**
	 * Returns the value of the '<em><b>Target Groupby</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.TargetGroupby}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Groupby</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Groupby</em>' containment reference list.
	 * @see dsml.DsmlPackage#getDrawingArea_TargetGroupby()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetGroupby> getTargetGroupby();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dsml.DsmlPackage#getDrawingArea_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Link Pattern Target</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.LinkPatternTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Pattern Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Pattern Target</em>' containment reference list.
	 * @see dsml.DsmlPackage#getDrawingArea_LinkPatternTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkPatternTarget> getLinkPatternTarget();

	/**
	 * Returns the value of the '<em><b>Link Taget</b></em>' containment reference list.
	 * The list contents are of type {@link dsml.LinkTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Taget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Taget</em>' containment reference list.
	 * @see dsml.DsmlPackage#getDrawingArea_LinkTaget()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkTarget> getLinkTaget();

} // DrawingArea
