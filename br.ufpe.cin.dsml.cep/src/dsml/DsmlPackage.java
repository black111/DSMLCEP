/**
 */
package dsml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsml.DsmlFactory
 * @model kind="package"
 * @generated
 */
public interface DsmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsmlPackage eINSTANCE = dsml.impl.DsmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsml.impl.DrawingAreaImpl <em>Drawing Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.DrawingAreaImpl
	 * @see dsml.impl.DsmlPackageImpl#getDrawingArea()
	 * @generated
	 */
	int DRAWING_AREA = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__RULE = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__PATTERNS = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__WINDOWS = 4;

	/**
	 * The feature id for the '<em><b>Target Groupby</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__TARGET_GROUPBY = 5;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__LINKS = 6;

	/**
	 * The feature id for the '<em><b>Link Pattern Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__LINK_PATTERN_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Link Taget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA__LINK_TAGET = 8;

	/**
	 * The number of structural features of the '<em>Drawing Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_AREA_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link dsml.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.ComponentImpl
	 * @see dsml.impl.DsmlPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsml.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.RuleImpl
	 * @see dsml.impl.DsmlPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_NAME = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__QUERIES = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.impl.EventOutputImpl <em>Event Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.EventOutputImpl
	 * @see dsml.impl.DsmlPackageImpl#getEventOutput()
	 * @generated
	 */
	int EVENT_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OUTPUT__OUTPUT_NAME = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OUTPUT__QUERIES = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OUTPUT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.impl.EventPatternImpl <em>Event Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.EventPatternImpl
	 * @see dsml.impl.DsmlPackageImpl#getEventPattern()
	 * @generated
	 */
	int EVENT_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Event Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN__EVENT_PATTERN = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN__NODE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.WindowImpl
	 * @see dsml.impl.DsmlPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 5;

	/**
	 * The feature id for the '<em><b>Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WINDOW = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TYPE_WINDOW = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VALUE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsml.impl.TargetGroupbyImpl <em>Target Groupby</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.TargetGroupbyImpl
	 * @see dsml.impl.DsmlPackageImpl#getTargetGroupby()
	 * @generated
	 */
	int TARGET_GROUPBY = 6;

	/**
	 * The feature id for the '<em><b>Target Groupby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUPBY__TARGET_GROUPBY = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUPBY__ATTRIBUTES = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Groupby</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUPBY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.EventImpl
	 * @see dsml.impl.DsmlPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_NAME = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ATTRIBUTES = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.AttributeImpl
	 * @see dsml.impl.DsmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsml.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.QueryImpl
	 * @see dsml.impl.DsmlPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 9;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__INCOMING = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__OUTGOING = 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsml.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.AggregationImpl
	 * @see dsml.impl.DsmlPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 10;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__INCOMING = QUERY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__OUTGOING = QUERY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__ATTRIBUTE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TYPE_AGGREGATION = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.impl.ConditionGroupImpl <em>Condition Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.ConditionGroupImpl
	 * @see dsml.impl.DsmlPackageImpl#getConditionGroup()
	 * @generated
	 */
	int CONDITION_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_GROUP__INCOMING = QUERY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_GROUP__OUTGOING = QUERY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Condition Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_GROUP__CONDITION_GROUP = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_GROUP__OPERATION_TYPES = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Condition Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_GROUP_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.impl.GroupbyConditionImpl <em>Groupby Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.GroupbyConditionImpl
	 * @see dsml.impl.DsmlPackageImpl#getGroupbyCondition()
	 * @generated
	 */
	int GROUPBY_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPBY_CONDITION__INCOMING = QUERY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPBY_CONDITION__OUTGOING = QUERY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Groupby Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPBY_CONDITION__GROUPBY_CONDITION = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPBY_CONDITION__ATTRIBUTES = QUERY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPBY_CONDITION__OPERATION_TYPES = QUERY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Groupby Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPBY_CONDITION_FEATURE_COUNT = QUERY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsml.impl.BringGroupImpl <em>Bring Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.BringGroupImpl
	 * @see dsml.impl.DsmlPackageImpl#getBringGroup()
	 * @generated
	 */
	int BRING_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRING_GROUP__INCOMING = QUERY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRING_GROUP__OUTGOING = QUERY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Bring Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRING_GROUP__BRING_GROUP = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bring All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRING_GROUP__BRING_ALL = QUERY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRING_GROUP__ATTRIBUTES = QUERY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRING_GROUP__OPERATION_TYPES = QUERY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bring Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRING_GROUP_FEATURE_COUNT = QUERY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsml.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.PatternImpl
	 * @see dsml.impl.DsmlPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 18;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__INCOMING = QUERY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__OUTGOING = QUERY__OUTGOING;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = QUERY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsml.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.TargetImpl
	 * @see dsml.impl.DsmlPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 14;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__INCOMING = PATTERN__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__OUTGOING = PATTERN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Target Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TARGET_ALIAS = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__OPERATION_TYPES = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__INCOMING_TARGET = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__OUTGOING_TARGET = PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsml.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.NotImpl
	 * @see dsml.impl.DsmlPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 15;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__INCOMING = QUERY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OUTGOING = QUERY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__DESCRIPTION = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.OperatorImpl
	 * @see dsml.impl.DsmlPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 16;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__INCOMING = QUERY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OUTGOING = QUERY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERATOR = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ATTRIBUTE = QUERY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERATOR_ALIAS = QUERY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = QUERY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsml.impl.ValueOperatorImpl <em>Value Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.ValueOperatorImpl
	 * @see dsml.impl.DsmlPackageImpl#getValueOperator()
	 * @generated
	 */
	int VALUE_OPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATOR__INCOMING = QUERY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATOR__OUTGOING = QUERY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Value Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATOR__VALUE_OPERATOR = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATOR_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.impl.UnaryPatternImpl <em>Unary Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.UnaryPatternImpl
	 * @see dsml.impl.DsmlPackageImpl#getUnaryPattern()
	 * @generated
	 */
	int UNARY_PATTERN = 19;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN__INCOMING = PATTERN__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN__OUTGOING = PATTERN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN__NAME = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Unary Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN__TYPE_UNARY_PATTERN = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsml.impl.PatternTimerImpl <em>Pattern Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.PatternTimerImpl
	 * @see dsml.impl.DsmlPackageImpl#getPatternTimer()
	 * @generated
	 */
	int PATTERN_TIMER = 20;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TIMER__INCOMING = PATTERN__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TIMER__OUTGOING = PATTERN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Pattern Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TIMER__PATTERN_TIMER = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Pattern Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TIMER__TYPE_PATTERN_TIMER = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TIMER__VALUE = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pattern Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TIMER_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsml.impl.RepeatPatternImpl <em>Repeat Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.RepeatPatternImpl
	 * @see dsml.impl.DsmlPackageImpl#getRepeatPattern()
	 * @generated
	 */
	int REPEAT_PATTERN = 21;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_PATTERN__INCOMING = PATTERN__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_PATTERN__OUTGOING = PATTERN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Repeat Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_PATTERN__REPEAT_PATTERN = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Pattern Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_PATTERN__TYPE_PATTERN_TIMER = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_PATTERN__VALUE = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repeat Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsml.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.LinkImpl
	 * @see dsml.impl.DsmlPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsml.impl.LinkTargetImpl <em>Link Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.LinkTargetImpl
	 * @see dsml.impl.DsmlPackageImpl#getLinkTarget()
	 * @generated
	 */
	int LINK_TARGET = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TARGET__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TARGET__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Link Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TARGET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsml.impl.LinkPatternTargetImpl <em>Link Pattern Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.LinkPatternTargetImpl
	 * @see dsml.impl.DsmlPackageImpl#getLinkPatternTarget()
	 * @generated
	 */
	int LINK_PATTERN_TARGET = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PATTERN_TARGET__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PATTERN_TARGET__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Comparison Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PATTERN_TARGET__COMPARISON_TARGET = 2;

	/**
	 * The number of structural features of the '<em>Link Pattern Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PATTERN_TARGET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dsml.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.ComparisonImpl
	 * @see dsml.impl.DsmlPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__SOURCE = LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__TARGET = LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMPARISON = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.impl.ArithmeticImpl <em>Arithmetic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.ArithmeticImpl
	 * @see dsml.impl.DsmlPackageImpl#getArithmetic()
	 * @generated
	 */
	int ARITHMETIC = 26;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC__SOURCE = LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC__TARGET = LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Arithmetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC__ARITHMETIC = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.impl.LogicalConnectorImpl <em>Logical Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.impl.LogicalConnectorImpl
	 * @see dsml.impl.DsmlPackageImpl#getLogicalConnector()
	 * @generated
	 */
	int LOGICAL_CONNECTOR = 27;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__SOURCE = LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__TARGET = LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Type Logical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR__TYPE_LOGICAL = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_CONNECTOR_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsml.TypeRule <em>Type Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeRule
	 * @see dsml.impl.DsmlPackageImpl#getTypeRule()
	 * @generated
	 */
	int TYPE_RULE = 28;

	/**
	 * The meta object id for the '{@link dsml.TypeWindow <em>Type Window</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeWindow
	 * @see dsml.impl.DsmlPackageImpl#getTypeWindow()
	 * @generated
	 */
	int TYPE_WINDOW = 29;

	/**
	 * The meta object id for the '{@link dsml.TypeUnaryPattern <em>Type Unary Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeUnaryPattern
	 * @see dsml.impl.DsmlPackageImpl#getTypeUnaryPattern()
	 * @generated
	 */
	int TYPE_UNARY_PATTERN = 30;

	/**
	 * The meta object id for the '{@link dsml.TypeRepeatPattern <em>Type Repeat Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeRepeatPattern
	 * @see dsml.impl.DsmlPackageImpl#getTypeRepeatPattern()
	 * @generated
	 */
	int TYPE_REPEAT_PATTERN = 31;

	/**
	 * The meta object id for the '{@link dsml.TypeTargetComparison <em>Type Target Comparison</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeTargetComparison
	 * @see dsml.impl.DsmlPackageImpl#getTypeTargetComparison()
	 * @generated
	 */
	int TYPE_TARGET_COMPARISON = 32;

	/**
	 * The meta object id for the '{@link dsml.TypeLogical <em>Type Logical</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeLogical
	 * @see dsml.impl.DsmlPackageImpl#getTypeLogical()
	 * @generated
	 */
	int TYPE_LOGICAL = 33;

	/**
	 * The meta object id for the '{@link dsml.TypeComparison <em>Type Comparison</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeComparison
	 * @see dsml.impl.DsmlPackageImpl#getTypeComparison()
	 * @generated
	 */
	int TYPE_COMPARISON = 34;

	/**
	 * The meta object id for the '{@link dsml.TypeArithmetic <em>Type Arithmetic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeArithmetic
	 * @see dsml.impl.DsmlPackageImpl#getTypeArithmetic()
	 * @generated
	 */
	int TYPE_ARITHMETIC = 35;

	/**
	 * The meta object id for the '{@link dsml.TypeAggregation <em>Type Aggregation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypeAggregation
	 * @see dsml.impl.DsmlPackageImpl#getTypeAggregation()
	 * @generated
	 */
	int TYPE_AGGREGATION = 36;

	/**
	 * The meta object id for the '{@link dsml.TypePatternTimer <em>Type Pattern Timer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsml.TypePatternTimer
	 * @see dsml.impl.DsmlPackageImpl#getTypePatternTimer()
	 * @generated
	 */
	int TYPE_PATTERN_TIMER = 37;


	/**
	 * Returns the meta object for class '{@link dsml.DrawingArea <em>Drawing Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawing Area</em>'.
	 * @see dsml.DrawingArea
	 * @generated
	 */
	EClass getDrawingArea();

	/**
	 * Returns the meta object for the containment reference '{@link dsml.DrawingArea#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see dsml.DrawingArea#getRule()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.DrawingArea#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see dsml.DrawingArea#getEvents()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_Events();

	/**
	 * Returns the meta object for the containment reference '{@link dsml.DrawingArea#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patterns</em>'.
	 * @see dsml.DrawingArea#getPatterns()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_Patterns();

	/**
	 * Returns the meta object for the containment reference '{@link dsml.DrawingArea#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see dsml.DrawingArea#getOutput()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.DrawingArea#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see dsml.DrawingArea#getWindows()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_Windows();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.DrawingArea#getTargetGroupby <em>Target Groupby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Groupby</em>'.
	 * @see dsml.DrawingArea#getTargetGroupby()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_TargetGroupby();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.DrawingArea#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dsml.DrawingArea#getLinks()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.DrawingArea#getLinkPatternTarget <em>Link Pattern Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Pattern Target</em>'.
	 * @see dsml.DrawingArea#getLinkPatternTarget()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_LinkPatternTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.DrawingArea#getLinkTaget <em>Link Taget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Taget</em>'.
	 * @see dsml.DrawingArea#getLinkTaget()
	 * @see #getDrawingArea()
	 * @generated
	 */
	EReference getDrawingArea_LinkTaget();

	/**
	 * Returns the meta object for class '{@link dsml.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see dsml.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link dsml.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see dsml.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Rule#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Name</em>'.
	 * @see dsml.Rule#getRuleName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_RuleName();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.Rule#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see dsml.Rule#getQueries()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Queries();

	/**
	 * Returns the meta object for class '{@link dsml.EventOutput <em>Event Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Output</em>'.
	 * @see dsml.EventOutput
	 * @generated
	 */
	EClass getEventOutput();

	/**
	 * Returns the meta object for the attribute '{@link dsml.EventOutput#getOutputName <em>Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Name</em>'.
	 * @see dsml.EventOutput#getOutputName()
	 * @see #getEventOutput()
	 * @generated
	 */
	EAttribute getEventOutput_OutputName();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.EventOutput#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see dsml.EventOutput#getQueries()
	 * @see #getEventOutput()
	 * @generated
	 */
	EReference getEventOutput_Queries();

	/**
	 * Returns the meta object for class '{@link dsml.EventPattern <em>Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Pattern</em>'.
	 * @see dsml.EventPattern
	 * @generated
	 */
	EClass getEventPattern();

	/**
	 * Returns the meta object for the attribute '{@link dsml.EventPattern#getEventPattern <em>Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Pattern</em>'.
	 * @see dsml.EventPattern#getEventPattern()
	 * @see #getEventPattern()
	 * @generated
	 */
	EAttribute getEventPattern_EventPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.EventPattern#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see dsml.EventPattern#getNode()
	 * @see #getEventPattern()
	 * @generated
	 */
	EReference getEventPattern_Node();

	/**
	 * Returns the meta object for class '{@link dsml.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see dsml.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Window#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window</em>'.
	 * @see dsml.Window#getWindow()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Window();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Window#getTypeWindow <em>Type Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Window</em>'.
	 * @see dsml.Window#getTypeWindow()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_TypeWindow();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Window#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.Window#getValue()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Value();

	/**
	 * Returns the meta object for class '{@link dsml.TargetGroupby <em>Target Groupby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Groupby</em>'.
	 * @see dsml.TargetGroupby
	 * @generated
	 */
	EClass getTargetGroupby();

	/**
	 * Returns the meta object for the attribute '{@link dsml.TargetGroupby#getTargetGroupby <em>Target Groupby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Groupby</em>'.
	 * @see dsml.TargetGroupby#getTargetGroupby()
	 * @see #getTargetGroupby()
	 * @generated
	 */
	EAttribute getTargetGroupby_TargetGroupby();

	/**
	 * Returns the meta object for the reference list '{@link dsml.TargetGroupby#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see dsml.TargetGroupby#getAttributes()
	 * @see #getTargetGroupby()
	 * @generated
	 */
	EReference getTargetGroupby_Attributes();

	/**
	 * Returns the meta object for class '{@link dsml.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see dsml.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Event#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see dsml.Event#getEventName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventName();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.Event#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see dsml.Event#getAttributes()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Attributes();

	/**
	 * Returns the meta object for class '{@link dsml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see dsml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsml.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsml.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link dsml.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see dsml.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link dsml.Query#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see dsml.Query#getIncoming()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Incoming();

	/**
	 * Returns the meta object for the reference '{@link dsml.Query#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see dsml.Query#getOutgoing()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Outgoing();

	/**
	 * Returns the meta object for class '{@link dsml.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see dsml.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for the reference '{@link dsml.Aggregation#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see dsml.Aggregation#getAttribute()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Aggregation#getTypeAggregation <em>Type Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Aggregation</em>'.
	 * @see dsml.Aggregation#getTypeAggregation()
	 * @see #getAggregation()
	 * @generated
	 */
	EAttribute getAggregation_TypeAggregation();

	/**
	 * Returns the meta object for class '{@link dsml.ConditionGroup <em>Condition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Group</em>'.
	 * @see dsml.ConditionGroup
	 * @generated
	 */
	EClass getConditionGroup();

	/**
	 * Returns the meta object for the attribute '{@link dsml.ConditionGroup#getConditionGroup <em>Condition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Group</em>'.
	 * @see dsml.ConditionGroup#getConditionGroup()
	 * @see #getConditionGroup()
	 * @generated
	 */
	EAttribute getConditionGroup_ConditionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.ConditionGroup#getOperationTypes <em>Operation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Types</em>'.
	 * @see dsml.ConditionGroup#getOperationTypes()
	 * @see #getConditionGroup()
	 * @generated
	 */
	EReference getConditionGroup_OperationTypes();

	/**
	 * Returns the meta object for class '{@link dsml.GroupbyCondition <em>Groupby Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Groupby Condition</em>'.
	 * @see dsml.GroupbyCondition
	 * @generated
	 */
	EClass getGroupbyCondition();

	/**
	 * Returns the meta object for the attribute '{@link dsml.GroupbyCondition#getGroupbyCondition <em>Groupby Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groupby Condition</em>'.
	 * @see dsml.GroupbyCondition#getGroupbyCondition()
	 * @see #getGroupbyCondition()
	 * @generated
	 */
	EAttribute getGroupbyCondition_GroupbyCondition();

	/**
	 * Returns the meta object for the reference list '{@link dsml.GroupbyCondition#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see dsml.GroupbyCondition#getAttributes()
	 * @see #getGroupbyCondition()
	 * @generated
	 */
	EReference getGroupbyCondition_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.GroupbyCondition#getOperationTypes <em>Operation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Types</em>'.
	 * @see dsml.GroupbyCondition#getOperationTypes()
	 * @see #getGroupbyCondition()
	 * @generated
	 */
	EReference getGroupbyCondition_OperationTypes();

	/**
	 * Returns the meta object for class '{@link dsml.BringGroup <em>Bring Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bring Group</em>'.
	 * @see dsml.BringGroup
	 * @generated
	 */
	EClass getBringGroup();

	/**
	 * Returns the meta object for the attribute '{@link dsml.BringGroup#getBringGroup <em>Bring Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bring Group</em>'.
	 * @see dsml.BringGroup#getBringGroup()
	 * @see #getBringGroup()
	 * @generated
	 */
	EAttribute getBringGroup_BringGroup();

	/**
	 * Returns the meta object for the attribute '{@link dsml.BringGroup#isBringAll <em>Bring All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bring All</em>'.
	 * @see dsml.BringGroup#isBringAll()
	 * @see #getBringGroup()
	 * @generated
	 */
	EAttribute getBringGroup_BringAll();

	/**
	 * Returns the meta object for the reference list '{@link dsml.BringGroup#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see dsml.BringGroup#getAttributes()
	 * @see #getBringGroup()
	 * @generated
	 */
	EReference getBringGroup_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.BringGroup#getOperationTypes <em>Operation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Types</em>'.
	 * @see dsml.BringGroup#getOperationTypes()
	 * @see #getBringGroup()
	 * @generated
	 */
	EReference getBringGroup_OperationTypes();

	/**
	 * Returns the meta object for class '{@link dsml.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see dsml.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Target#getTargetAlias <em>Target Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Alias</em>'.
	 * @see dsml.Target#getTargetAlias()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_TargetAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link dsml.Target#getOperationTypes <em>Operation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Types</em>'.
	 * @see dsml.Target#getOperationTypes()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_OperationTypes();

	/**
	 * Returns the meta object for the reference '{@link dsml.Target#getIncomingTarget <em>Incoming Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming Target</em>'.
	 * @see dsml.Target#getIncomingTarget()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_IncomingTarget();

	/**
	 * Returns the meta object for the reference '{@link dsml.Target#getOutgoingTarget <em>Outgoing Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing Target</em>'.
	 * @see dsml.Target#getOutgoingTarget()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_OutgoingTarget();

	/**
	 * Returns the meta object for class '{@link dsml.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see dsml.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Not#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsml.Not#getDescription()
	 * @see #getNot()
	 * @generated
	 */
	EAttribute getNot_Description();

	/**
	 * Returns the meta object for class '{@link dsml.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see dsml.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Operator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see dsml.Operator#getOperator()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Operator();

	/**
	 * Returns the meta object for the reference '{@link dsml.Operator#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see dsml.Operator#getAttribute()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Operator#getOperatorAlias <em>Operator Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Alias</em>'.
	 * @see dsml.Operator#getOperatorAlias()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_OperatorAlias();

	/**
	 * Returns the meta object for class '{@link dsml.ValueOperator <em>Value Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Operator</em>'.
	 * @see dsml.ValueOperator
	 * @generated
	 */
	EClass getValueOperator();

	/**
	 * Returns the meta object for the attribute '{@link dsml.ValueOperator#getValueOperator <em>Value Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Operator</em>'.
	 * @see dsml.ValueOperator#getValueOperator()
	 * @see #getValueOperator()
	 * @generated
	 */
	EAttribute getValueOperator_ValueOperator();

	/**
	 * Returns the meta object for class '{@link dsml.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see dsml.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for class '{@link dsml.UnaryPattern <em>Unary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Pattern</em>'.
	 * @see dsml.UnaryPattern
	 * @generated
	 */
	EClass getUnaryPattern();

	/**
	 * Returns the meta object for the attribute '{@link dsml.UnaryPattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsml.UnaryPattern#getName()
	 * @see #getUnaryPattern()
	 * @generated
	 */
	EAttribute getUnaryPattern_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsml.UnaryPattern#getTypeUnaryPattern <em>Type Unary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Unary Pattern</em>'.
	 * @see dsml.UnaryPattern#getTypeUnaryPattern()
	 * @see #getUnaryPattern()
	 * @generated
	 */
	EAttribute getUnaryPattern_TypeUnaryPattern();

	/**
	 * Returns the meta object for class '{@link dsml.PatternTimer <em>Pattern Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Timer</em>'.
	 * @see dsml.PatternTimer
	 * @generated
	 */
	EClass getPatternTimer();

	/**
	 * Returns the meta object for the attribute '{@link dsml.PatternTimer#getPatternTimer <em>Pattern Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Timer</em>'.
	 * @see dsml.PatternTimer#getPatternTimer()
	 * @see #getPatternTimer()
	 * @generated
	 */
	EAttribute getPatternTimer_PatternTimer();

	/**
	 * Returns the meta object for the attribute '{@link dsml.PatternTimer#getTypePatternTimer <em>Type Pattern Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Pattern Timer</em>'.
	 * @see dsml.PatternTimer#getTypePatternTimer()
	 * @see #getPatternTimer()
	 * @generated
	 */
	EAttribute getPatternTimer_TypePatternTimer();

	/**
	 * Returns the meta object for the attribute '{@link dsml.PatternTimer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.PatternTimer#getValue()
	 * @see #getPatternTimer()
	 * @generated
	 */
	EAttribute getPatternTimer_Value();

	/**
	 * Returns the meta object for class '{@link dsml.RepeatPattern <em>Repeat Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Pattern</em>'.
	 * @see dsml.RepeatPattern
	 * @generated
	 */
	EClass getRepeatPattern();

	/**
	 * Returns the meta object for the attribute '{@link dsml.RepeatPattern#getRepeatPattern <em>Repeat Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Pattern</em>'.
	 * @see dsml.RepeatPattern#getRepeatPattern()
	 * @see #getRepeatPattern()
	 * @generated
	 */
	EAttribute getRepeatPattern_RepeatPattern();

	/**
	 * Returns the meta object for the attribute '{@link dsml.RepeatPattern#getTypePatternTimer <em>Type Pattern Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Pattern Timer</em>'.
	 * @see dsml.RepeatPattern#getTypePatternTimer()
	 * @see #getRepeatPattern()
	 * @generated
	 */
	EAttribute getRepeatPattern_TypePatternTimer();

	/**
	 * Returns the meta object for the attribute '{@link dsml.RepeatPattern#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsml.RepeatPattern#getValue()
	 * @see #getRepeatPattern()
	 * @generated
	 */
	EAttribute getRepeatPattern_Value();

	/**
	 * Returns the meta object for class '{@link dsml.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see dsml.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link dsml.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsml.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link dsml.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dsml.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for class '{@link dsml.LinkTarget <em>Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Target</em>'.
	 * @see dsml.LinkTarget
	 * @generated
	 */
	EClass getLinkTarget();

	/**
	 * Returns the meta object for the reference '{@link dsml.LinkTarget#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsml.LinkTarget#getSource()
	 * @see #getLinkTarget()
	 * @generated
	 */
	EReference getLinkTarget_Source();

	/**
	 * Returns the meta object for the reference list '{@link dsml.LinkTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see dsml.LinkTarget#getTarget()
	 * @see #getLinkTarget()
	 * @generated
	 */
	EReference getLinkTarget_Target();

	/**
	 * Returns the meta object for class '{@link dsml.LinkPatternTarget <em>Link Pattern Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Pattern Target</em>'.
	 * @see dsml.LinkPatternTarget
	 * @generated
	 */
	EClass getLinkPatternTarget();

	/**
	 * Returns the meta object for the reference '{@link dsml.LinkPatternTarget#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsml.LinkPatternTarget#getSource()
	 * @see #getLinkPatternTarget()
	 * @generated
	 */
	EReference getLinkPatternTarget_Source();

	/**
	 * Returns the meta object for the reference '{@link dsml.LinkPatternTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dsml.LinkPatternTarget#getTarget()
	 * @see #getLinkPatternTarget()
	 * @generated
	 */
	EReference getLinkPatternTarget_Target();

	/**
	 * Returns the meta object for the attribute '{@link dsml.LinkPatternTarget#getComparisonTarget <em>Comparison Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Target</em>'.
	 * @see dsml.LinkPatternTarget#getComparisonTarget()
	 * @see #getLinkPatternTarget()
	 * @generated
	 */
	EAttribute getLinkPatternTarget_ComparisonTarget();

	/**
	 * Returns the meta object for class '{@link dsml.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see dsml.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Comparison#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison</em>'.
	 * @see dsml.Comparison#getComparison()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Comparison();

	/**
	 * Returns the meta object for class '{@link dsml.Arithmetic <em>Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic</em>'.
	 * @see dsml.Arithmetic
	 * @generated
	 */
	EClass getArithmetic();

	/**
	 * Returns the meta object for the attribute '{@link dsml.Arithmetic#getArithmetic <em>Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arithmetic</em>'.
	 * @see dsml.Arithmetic#getArithmetic()
	 * @see #getArithmetic()
	 * @generated
	 */
	EAttribute getArithmetic_Arithmetic();

	/**
	 * Returns the meta object for class '{@link dsml.LogicalConnector <em>Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Connector</em>'.
	 * @see dsml.LogicalConnector
	 * @generated
	 */
	EClass getLogicalConnector();

	/**
	 * Returns the meta object for the attribute '{@link dsml.LogicalConnector#getTypeLogical <em>Type Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Logical</em>'.
	 * @see dsml.LogicalConnector#getTypeLogical()
	 * @see #getLogicalConnector()
	 * @generated
	 */
	EAttribute getLogicalConnector_TypeLogical();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeRule <em>Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Rule</em>'.
	 * @see dsml.TypeRule
	 * @generated
	 */
	EEnum getTypeRule();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeWindow <em>Type Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Window</em>'.
	 * @see dsml.TypeWindow
	 * @generated
	 */
	EEnum getTypeWindow();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeUnaryPattern <em>Type Unary Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Unary Pattern</em>'.
	 * @see dsml.TypeUnaryPattern
	 * @generated
	 */
	EEnum getTypeUnaryPattern();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeRepeatPattern <em>Type Repeat Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Repeat Pattern</em>'.
	 * @see dsml.TypeRepeatPattern
	 * @generated
	 */
	EEnum getTypeRepeatPattern();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeTargetComparison <em>Type Target Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Target Comparison</em>'.
	 * @see dsml.TypeTargetComparison
	 * @generated
	 */
	EEnum getTypeTargetComparison();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeLogical <em>Type Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Logical</em>'.
	 * @see dsml.TypeLogical
	 * @generated
	 */
	EEnum getTypeLogical();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeComparison <em>Type Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Comparison</em>'.
	 * @see dsml.TypeComparison
	 * @generated
	 */
	EEnum getTypeComparison();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeArithmetic <em>Type Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Arithmetic</em>'.
	 * @see dsml.TypeArithmetic
	 * @generated
	 */
	EEnum getTypeArithmetic();

	/**
	 * Returns the meta object for enum '{@link dsml.TypeAggregation <em>Type Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Aggregation</em>'.
	 * @see dsml.TypeAggregation
	 * @generated
	 */
	EEnum getTypeAggregation();

	/**
	 * Returns the meta object for enum '{@link dsml.TypePatternTimer <em>Type Pattern Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Pattern Timer</em>'.
	 * @see dsml.TypePatternTimer
	 * @generated
	 */
	EEnum getTypePatternTimer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DsmlFactory getDsmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsml.impl.DrawingAreaImpl <em>Drawing Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.DrawingAreaImpl
		 * @see dsml.impl.DsmlPackageImpl#getDrawingArea()
		 * @generated
		 */
		EClass DRAWING_AREA = eINSTANCE.getDrawingArea();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__RULE = eINSTANCE.getDrawingArea_Rule();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__EVENTS = eINSTANCE.getDrawingArea_Events();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__PATTERNS = eINSTANCE.getDrawingArea_Patterns();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__OUTPUT = eINSTANCE.getDrawingArea_Output();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__WINDOWS = eINSTANCE.getDrawingArea_Windows();

		/**
		 * The meta object literal for the '<em><b>Target Groupby</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__TARGET_GROUPBY = eINSTANCE.getDrawingArea_TargetGroupby();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__LINKS = eINSTANCE.getDrawingArea_Links();

		/**
		 * The meta object literal for the '<em><b>Link Pattern Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__LINK_PATTERN_TARGET = eINSTANCE.getDrawingArea_LinkPatternTarget();

		/**
		 * The meta object literal for the '<em><b>Link Taget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING_AREA__LINK_TAGET = eINSTANCE.getDrawingArea_LinkTaget();

		/**
		 * The meta object literal for the '{@link dsml.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.ComponentImpl
		 * @see dsml.impl.DsmlPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link dsml.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.RuleImpl
		 * @see dsml.impl.DsmlPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RULE_NAME = eINSTANCE.getRule_RuleName();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__QUERIES = eINSTANCE.getRule_Queries();

		/**
		 * The meta object literal for the '{@link dsml.impl.EventOutputImpl <em>Event Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.EventOutputImpl
		 * @see dsml.impl.DsmlPackageImpl#getEventOutput()
		 * @generated
		 */
		EClass EVENT_OUTPUT = eINSTANCE.getEventOutput();

		/**
		 * The meta object literal for the '<em><b>Output Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_OUTPUT__OUTPUT_NAME = eINSTANCE.getEventOutput_OutputName();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_OUTPUT__QUERIES = eINSTANCE.getEventOutput_Queries();

		/**
		 * The meta object literal for the '{@link dsml.impl.EventPatternImpl <em>Event Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.EventPatternImpl
		 * @see dsml.impl.DsmlPackageImpl#getEventPattern()
		 * @generated
		 */
		EClass EVENT_PATTERN = eINSTANCE.getEventPattern();

		/**
		 * The meta object literal for the '<em><b>Event Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PATTERN__EVENT_PATTERN = eINSTANCE.getEventPattern_EventPattern();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PATTERN__NODE = eINSTANCE.getEventPattern_Node();

		/**
		 * The meta object literal for the '{@link dsml.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.WindowImpl
		 * @see dsml.impl.DsmlPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__WINDOW = eINSTANCE.getWindow_Window();

		/**
		 * The meta object literal for the '<em><b>Type Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__TYPE_WINDOW = eINSTANCE.getWindow_TypeWindow();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__VALUE = eINSTANCE.getWindow_Value();

		/**
		 * The meta object literal for the '{@link dsml.impl.TargetGroupbyImpl <em>Target Groupby</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.TargetGroupbyImpl
		 * @see dsml.impl.DsmlPackageImpl#getTargetGroupby()
		 * @generated
		 */
		EClass TARGET_GROUPBY = eINSTANCE.getTargetGroupby();

		/**
		 * The meta object literal for the '<em><b>Target Groupby</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_GROUPBY__TARGET_GROUPBY = eINSTANCE.getTargetGroupby_TargetGroupby();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_GROUPBY__ATTRIBUTES = eINSTANCE.getTargetGroupby_Attributes();

		/**
		 * The meta object literal for the '{@link dsml.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.EventImpl
		 * @see dsml.impl.DsmlPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_NAME = eINSTANCE.getEvent_EventName();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ATTRIBUTES = eINSTANCE.getEvent_Attributes();

		/**
		 * The meta object literal for the '{@link dsml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.AttributeImpl
		 * @see dsml.impl.DsmlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link dsml.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.QueryImpl
		 * @see dsml.impl.DsmlPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__INCOMING = eINSTANCE.getQuery_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__OUTGOING = eINSTANCE.getQuery_Outgoing();

		/**
		 * The meta object literal for the '{@link dsml.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.AggregationImpl
		 * @see dsml.impl.DsmlPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__ATTRIBUTE = eINSTANCE.getAggregation_Attribute();

		/**
		 * The meta object literal for the '<em><b>Type Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION__TYPE_AGGREGATION = eINSTANCE.getAggregation_TypeAggregation();

		/**
		 * The meta object literal for the '{@link dsml.impl.ConditionGroupImpl <em>Condition Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.ConditionGroupImpl
		 * @see dsml.impl.DsmlPackageImpl#getConditionGroup()
		 * @generated
		 */
		EClass CONDITION_GROUP = eINSTANCE.getConditionGroup();

		/**
		 * The meta object literal for the '<em><b>Condition Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_GROUP__CONDITION_GROUP = eINSTANCE.getConditionGroup_ConditionGroup();

		/**
		 * The meta object literal for the '<em><b>Operation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_GROUP__OPERATION_TYPES = eINSTANCE.getConditionGroup_OperationTypes();

		/**
		 * The meta object literal for the '{@link dsml.impl.GroupbyConditionImpl <em>Groupby Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.GroupbyConditionImpl
		 * @see dsml.impl.DsmlPackageImpl#getGroupbyCondition()
		 * @generated
		 */
		EClass GROUPBY_CONDITION = eINSTANCE.getGroupbyCondition();

		/**
		 * The meta object literal for the '<em><b>Groupby Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPBY_CONDITION__GROUPBY_CONDITION = eINSTANCE.getGroupbyCondition_GroupbyCondition();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPBY_CONDITION__ATTRIBUTES = eINSTANCE.getGroupbyCondition_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPBY_CONDITION__OPERATION_TYPES = eINSTANCE.getGroupbyCondition_OperationTypes();

		/**
		 * The meta object literal for the '{@link dsml.impl.BringGroupImpl <em>Bring Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.BringGroupImpl
		 * @see dsml.impl.DsmlPackageImpl#getBringGroup()
		 * @generated
		 */
		EClass BRING_GROUP = eINSTANCE.getBringGroup();

		/**
		 * The meta object literal for the '<em><b>Bring Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRING_GROUP__BRING_GROUP = eINSTANCE.getBringGroup_BringGroup();

		/**
		 * The meta object literal for the '<em><b>Bring All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRING_GROUP__BRING_ALL = eINSTANCE.getBringGroup_BringAll();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRING_GROUP__ATTRIBUTES = eINSTANCE.getBringGroup_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRING_GROUP__OPERATION_TYPES = eINSTANCE.getBringGroup_OperationTypes();

		/**
		 * The meta object literal for the '{@link dsml.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.TargetImpl
		 * @see dsml.impl.DsmlPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Target Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__TARGET_ALIAS = eINSTANCE.getTarget_TargetAlias();

		/**
		 * The meta object literal for the '<em><b>Operation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__OPERATION_TYPES = eINSTANCE.getTarget_OperationTypes();

		/**
		 * The meta object literal for the '<em><b>Incoming Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__INCOMING_TARGET = eINSTANCE.getTarget_IncomingTarget();

		/**
		 * The meta object literal for the '<em><b>Outgoing Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__OUTGOING_TARGET = eINSTANCE.getTarget_OutgoingTarget();

		/**
		 * The meta object literal for the '{@link dsml.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.NotImpl
		 * @see dsml.impl.DsmlPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT__DESCRIPTION = eINSTANCE.getNot_Description();

		/**
		 * The meta object literal for the '{@link dsml.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.OperatorImpl
		 * @see dsml.impl.DsmlPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__OPERATOR = eINSTANCE.getOperator_Operator();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__ATTRIBUTE = eINSTANCE.getOperator_Attribute();

		/**
		 * The meta object literal for the '<em><b>Operator Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__OPERATOR_ALIAS = eINSTANCE.getOperator_OperatorAlias();

		/**
		 * The meta object literal for the '{@link dsml.impl.ValueOperatorImpl <em>Value Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.ValueOperatorImpl
		 * @see dsml.impl.DsmlPackageImpl#getValueOperator()
		 * @generated
		 */
		EClass VALUE_OPERATOR = eINSTANCE.getValueOperator();

		/**
		 * The meta object literal for the '<em><b>Value Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OPERATOR__VALUE_OPERATOR = eINSTANCE.getValueOperator_ValueOperator();

		/**
		 * The meta object literal for the '{@link dsml.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.PatternImpl
		 * @see dsml.impl.DsmlPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link dsml.impl.UnaryPatternImpl <em>Unary Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.UnaryPatternImpl
		 * @see dsml.impl.DsmlPackageImpl#getUnaryPattern()
		 * @generated
		 */
		EClass UNARY_PATTERN = eINSTANCE.getUnaryPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_PATTERN__NAME = eINSTANCE.getUnaryPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Type Unary Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_PATTERN__TYPE_UNARY_PATTERN = eINSTANCE.getUnaryPattern_TypeUnaryPattern();

		/**
		 * The meta object literal for the '{@link dsml.impl.PatternTimerImpl <em>Pattern Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.PatternTimerImpl
		 * @see dsml.impl.DsmlPackageImpl#getPatternTimer()
		 * @generated
		 */
		EClass PATTERN_TIMER = eINSTANCE.getPatternTimer();

		/**
		 * The meta object literal for the '<em><b>Pattern Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TIMER__PATTERN_TIMER = eINSTANCE.getPatternTimer_PatternTimer();

		/**
		 * The meta object literal for the '<em><b>Type Pattern Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TIMER__TYPE_PATTERN_TIMER = eINSTANCE.getPatternTimer_TypePatternTimer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TIMER__VALUE = eINSTANCE.getPatternTimer_Value();

		/**
		 * The meta object literal for the '{@link dsml.impl.RepeatPatternImpl <em>Repeat Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.RepeatPatternImpl
		 * @see dsml.impl.DsmlPackageImpl#getRepeatPattern()
		 * @generated
		 */
		EClass REPEAT_PATTERN = eINSTANCE.getRepeatPattern();

		/**
		 * The meta object literal for the '<em><b>Repeat Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_PATTERN__REPEAT_PATTERN = eINSTANCE.getRepeatPattern_RepeatPattern();

		/**
		 * The meta object literal for the '<em><b>Type Pattern Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_PATTERN__TYPE_PATTERN_TIMER = eINSTANCE.getRepeatPattern_TypePatternTimer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_PATTERN__VALUE = eINSTANCE.getRepeatPattern_Value();

		/**
		 * The meta object literal for the '{@link dsml.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.LinkImpl
		 * @see dsml.impl.DsmlPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '{@link dsml.impl.LinkTargetImpl <em>Link Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.LinkTargetImpl
		 * @see dsml.impl.DsmlPackageImpl#getLinkTarget()
		 * @generated
		 */
		EClass LINK_TARGET = eINSTANCE.getLinkTarget();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TARGET__SOURCE = eINSTANCE.getLinkTarget_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TARGET__TARGET = eINSTANCE.getLinkTarget_Target();

		/**
		 * The meta object literal for the '{@link dsml.impl.LinkPatternTargetImpl <em>Link Pattern Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.LinkPatternTargetImpl
		 * @see dsml.impl.DsmlPackageImpl#getLinkPatternTarget()
		 * @generated
		 */
		EClass LINK_PATTERN_TARGET = eINSTANCE.getLinkPatternTarget();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PATTERN_TARGET__SOURCE = eINSTANCE.getLinkPatternTarget_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_PATTERN_TARGET__TARGET = eINSTANCE.getLinkPatternTarget_Target();

		/**
		 * The meta object literal for the '<em><b>Comparison Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_PATTERN_TARGET__COMPARISON_TARGET = eINSTANCE.getLinkPatternTarget_ComparisonTarget();

		/**
		 * The meta object literal for the '{@link dsml.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.ComparisonImpl
		 * @see dsml.impl.DsmlPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__COMPARISON = eINSTANCE.getComparison_Comparison();

		/**
		 * The meta object literal for the '{@link dsml.impl.ArithmeticImpl <em>Arithmetic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.ArithmeticImpl
		 * @see dsml.impl.DsmlPackageImpl#getArithmetic()
		 * @generated
		 */
		EClass ARITHMETIC = eINSTANCE.getArithmetic();

		/**
		 * The meta object literal for the '<em><b>Arithmetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC__ARITHMETIC = eINSTANCE.getArithmetic_Arithmetic();

		/**
		 * The meta object literal for the '{@link dsml.impl.LogicalConnectorImpl <em>Logical Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.impl.LogicalConnectorImpl
		 * @see dsml.impl.DsmlPackageImpl#getLogicalConnector()
		 * @generated
		 */
		EClass LOGICAL_CONNECTOR = eINSTANCE.getLogicalConnector();

		/**
		 * The meta object literal for the '<em><b>Type Logical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_CONNECTOR__TYPE_LOGICAL = eINSTANCE.getLogicalConnector_TypeLogical();

		/**
		 * The meta object literal for the '{@link dsml.TypeRule <em>Type Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeRule
		 * @see dsml.impl.DsmlPackageImpl#getTypeRule()
		 * @generated
		 */
		EEnum TYPE_RULE = eINSTANCE.getTypeRule();

		/**
		 * The meta object literal for the '{@link dsml.TypeWindow <em>Type Window</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeWindow
		 * @see dsml.impl.DsmlPackageImpl#getTypeWindow()
		 * @generated
		 */
		EEnum TYPE_WINDOW = eINSTANCE.getTypeWindow();

		/**
		 * The meta object literal for the '{@link dsml.TypeUnaryPattern <em>Type Unary Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeUnaryPattern
		 * @see dsml.impl.DsmlPackageImpl#getTypeUnaryPattern()
		 * @generated
		 */
		EEnum TYPE_UNARY_PATTERN = eINSTANCE.getTypeUnaryPattern();

		/**
		 * The meta object literal for the '{@link dsml.TypeRepeatPattern <em>Type Repeat Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeRepeatPattern
		 * @see dsml.impl.DsmlPackageImpl#getTypeRepeatPattern()
		 * @generated
		 */
		EEnum TYPE_REPEAT_PATTERN = eINSTANCE.getTypeRepeatPattern();

		/**
		 * The meta object literal for the '{@link dsml.TypeTargetComparison <em>Type Target Comparison</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeTargetComparison
		 * @see dsml.impl.DsmlPackageImpl#getTypeTargetComparison()
		 * @generated
		 */
		EEnum TYPE_TARGET_COMPARISON = eINSTANCE.getTypeTargetComparison();

		/**
		 * The meta object literal for the '{@link dsml.TypeLogical <em>Type Logical</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeLogical
		 * @see dsml.impl.DsmlPackageImpl#getTypeLogical()
		 * @generated
		 */
		EEnum TYPE_LOGICAL = eINSTANCE.getTypeLogical();

		/**
		 * The meta object literal for the '{@link dsml.TypeComparison <em>Type Comparison</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeComparison
		 * @see dsml.impl.DsmlPackageImpl#getTypeComparison()
		 * @generated
		 */
		EEnum TYPE_COMPARISON = eINSTANCE.getTypeComparison();

		/**
		 * The meta object literal for the '{@link dsml.TypeArithmetic <em>Type Arithmetic</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeArithmetic
		 * @see dsml.impl.DsmlPackageImpl#getTypeArithmetic()
		 * @generated
		 */
		EEnum TYPE_ARITHMETIC = eINSTANCE.getTypeArithmetic();

		/**
		 * The meta object literal for the '{@link dsml.TypeAggregation <em>Type Aggregation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypeAggregation
		 * @see dsml.impl.DsmlPackageImpl#getTypeAggregation()
		 * @generated
		 */
		EEnum TYPE_AGGREGATION = eINSTANCE.getTypeAggregation();

		/**
		 * The meta object literal for the '{@link dsml.TypePatternTimer <em>Type Pattern Timer</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsml.TypePatternTimer
		 * @see dsml.impl.DsmlPackageImpl#getTypePatternTimer()
		 * @generated
		 */
		EEnum TYPE_PATTERN_TIMER = eINSTANCE.getTypePatternTimer();

	}

} //DsmlPackage
