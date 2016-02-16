/**
 */
package dsml.impl;

import dsml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsmlFactoryImpl extends EFactoryImpl implements DsmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsmlFactory init() {
		try {
			DsmlFactory theDsmlFactory = (DsmlFactory)EPackage.Registry.INSTANCE.getEFactory(DsmlPackage.eNS_URI);
			if (theDsmlFactory != null) {
				return theDsmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DsmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DsmlPackage.DRAWING_AREA: return createDrawingArea();
			case DsmlPackage.RULE: return createRule();
			case DsmlPackage.EVENT_OUTPUT: return createEventOutput();
			case DsmlPackage.EVENT_PATTERN: return createEventPattern();
			case DsmlPackage.WINDOW: return createWindow();
			case DsmlPackage.TARGET_GROUPBY: return createTargetGroupby();
			case DsmlPackage.EVENT: return createEvent();
			case DsmlPackage.ATTRIBUTE: return createAttribute();
			case DsmlPackage.AGGREGATION: return createAggregation();
			case DsmlPackage.CONDITION_GROUP: return createConditionGroup();
			case DsmlPackage.GROUPBY_CONDITION: return createGroupbyCondition();
			case DsmlPackage.BRING_GROUP: return createBringGroup();
			case DsmlPackage.TARGET: return createTarget();
			case DsmlPackage.NOT: return createNot();
			case DsmlPackage.OPERATOR: return createOperator();
			case DsmlPackage.VALUE_OPERATOR: return createValueOperator();
			case DsmlPackage.UNARY_PATTERN: return createUnaryPattern();
			case DsmlPackage.PATTERN_TIMER: return createPatternTimer();
			case DsmlPackage.REPEAT_PATTERN: return createRepeatPattern();
			case DsmlPackage.LINK_TARGET: return createLinkTarget();
			case DsmlPackage.LINK_PATTERN_TARGET: return createLinkPatternTarget();
			case DsmlPackage.COMPARISON: return createComparison();
			case DsmlPackage.ARITHMETIC: return createArithmetic();
			case DsmlPackage.LOGICAL_CONNECTOR: return createLogicalConnector();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DsmlPackage.TYPE_RULE:
				return createTypeRuleFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_WINDOW:
				return createTypeWindowFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_UNARY_PATTERN:
				return createTypeUnaryPatternFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_REPEAT_PATTERN:
				return createTypeRepeatPatternFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_TARGET_COMPARISON:
				return createTypeTargetComparisonFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_LOGICAL:
				return createTypeLogicalFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_COMPARISON:
				return createTypeComparisonFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_ARITHMETIC:
				return createTypeArithmeticFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_AGGREGATION:
				return createTypeAggregationFromString(eDataType, initialValue);
			case DsmlPackage.TYPE_PATTERN_TIMER:
				return createTypePatternTimerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DsmlPackage.TYPE_RULE:
				return convertTypeRuleToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_WINDOW:
				return convertTypeWindowToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_UNARY_PATTERN:
				return convertTypeUnaryPatternToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_REPEAT_PATTERN:
				return convertTypeRepeatPatternToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_TARGET_COMPARISON:
				return convertTypeTargetComparisonToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_LOGICAL:
				return convertTypeLogicalToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_COMPARISON:
				return convertTypeComparisonToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_ARITHMETIC:
				return convertTypeArithmeticToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_AGGREGATION:
				return convertTypeAggregationToString(eDataType, instanceValue);
			case DsmlPackage.TYPE_PATTERN_TIMER:
				return convertTypePatternTimerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingArea createDrawingArea() {
		DrawingAreaImpl drawingArea = new DrawingAreaImpl();
		return drawingArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOutput createEventOutput() {
		EventOutputImpl eventOutput = new EventOutputImpl();
		return eventOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPattern createEventPattern() {
		EventPatternImpl eventPattern = new EventPatternImpl();
		return eventPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroupby createTargetGroupby() {
		TargetGroupbyImpl targetGroupby = new TargetGroupbyImpl();
		return targetGroupby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionGroup createConditionGroup() {
		ConditionGroupImpl conditionGroup = new ConditionGroupImpl();
		return conditionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupbyCondition createGroupbyCondition() {
		GroupbyConditionImpl groupbyCondition = new GroupbyConditionImpl();
		return groupbyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BringGroup createBringGroup() {
		BringGroupImpl bringGroup = new BringGroupImpl();
		return bringGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueOperator createValueOperator() {
		ValueOperatorImpl valueOperator = new ValueOperatorImpl();
		return valueOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryPattern createUnaryPattern() {
		UnaryPatternImpl unaryPattern = new UnaryPatternImpl();
		return unaryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternTimer createPatternTimer() {
		PatternTimerImpl patternTimer = new PatternTimerImpl();
		return patternTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatPattern createRepeatPattern() {
		RepeatPatternImpl repeatPattern = new RepeatPatternImpl();
		return repeatPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTarget createLinkTarget() {
		LinkTargetImpl linkTarget = new LinkTargetImpl();
		return linkTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkPatternTarget createLinkPatternTarget() {
		LinkPatternTargetImpl linkPatternTarget = new LinkPatternTargetImpl();
		return linkPatternTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arithmetic createArithmetic() {
		ArithmeticImpl arithmetic = new ArithmeticImpl();
		return arithmetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalConnector createLogicalConnector() {
		LogicalConnectorImpl logicalConnector = new LogicalConnectorImpl();
		return logicalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRule createTypeRuleFromString(EDataType eDataType, String initialValue) {
		TypeRule result = TypeRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeWindow createTypeWindowFromString(EDataType eDataType, String initialValue) {
		TypeWindow result = TypeWindow.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeWindowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUnaryPattern createTypeUnaryPatternFromString(EDataType eDataType, String initialValue) {
		TypeUnaryPattern result = TypeUnaryPattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeUnaryPatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRepeatPattern createTypeRepeatPatternFromString(EDataType eDataType, String initialValue) {
		TypeRepeatPattern result = TypeRepeatPattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRepeatPatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTargetComparison createTypeTargetComparisonFromString(EDataType eDataType, String initialValue) {
		TypeTargetComparison result = TypeTargetComparison.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTargetComparisonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLogical createTypeLogicalFromString(EDataType eDataType, String initialValue) {
		TypeLogical result = TypeLogical.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeLogicalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeComparison createTypeComparisonFromString(EDataType eDataType, String initialValue) {
		TypeComparison result = TypeComparison.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeComparisonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeArithmetic createTypeArithmeticFromString(EDataType eDataType, String initialValue) {
		TypeArithmetic result = TypeArithmetic.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeArithmeticToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAggregation createTypeAggregationFromString(EDataType eDataType, String initialValue) {
		TypeAggregation result = TypeAggregation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAggregationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePatternTimer createTypePatternTimerFromString(EDataType eDataType, String initialValue) {
		TypePatternTimer result = TypePatternTimer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypePatternTimerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsmlPackage getDsmlPackage() {
		return (DsmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DsmlPackage getPackage() {
		return DsmlPackage.eINSTANCE;
	}

} //DsmlFactoryImpl
