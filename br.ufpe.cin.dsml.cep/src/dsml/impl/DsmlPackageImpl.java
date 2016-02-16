/**
 */
package dsml.impl;

import dsml.Aggregation;
import dsml.Arithmetic;
import dsml.Attribute;
import dsml.BringGroup;
import dsml.Comparison;
import dsml.Component;
import dsml.ConditionGroup;
import dsml.DrawingArea;
import dsml.DsmlFactory;
import dsml.DsmlPackage;
import dsml.Event;
import dsml.EventOutput;
import dsml.EventPattern;
import dsml.GroupbyCondition;
import dsml.Link;
import dsml.LinkPatternTarget;
import dsml.LinkTarget;
import dsml.LogicalConnector;
import dsml.Not;
import dsml.Operator;
import dsml.Pattern;
import dsml.PatternTimer;
import dsml.Query;
import dsml.RepeatPattern;
import dsml.Rule;
import dsml.Target;
import dsml.TargetGroupby;
import dsml.TypeAggregation;
import dsml.TypeArithmetic;
import dsml.TypeComparison;
import dsml.TypeLogical;
import dsml.TypePatternTimer;
import dsml.TypeRepeatPattern;
import dsml.TypeRule;
import dsml.TypeTargetComparison;
import dsml.TypeUnaryPattern;
import dsml.TypeWindow;
import dsml.UnaryPattern;
import dsml.ValueOperator;
import dsml.Window;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsmlPackageImpl extends EPackageImpl implements DsmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawingAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetGroupbyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupbyConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bringGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPatternTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeWindowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeUnaryPatternEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRepeatPatternEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTargetComparisonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeLogicalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeComparisonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeArithmeticEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAggregationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typePatternTimerEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dsml.DsmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DsmlPackageImpl() {
		super(eNS_URI, DsmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DsmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DsmlPackage init() {
		if (isInited) return (DsmlPackage)EPackage.Registry.INSTANCE.getEPackage(DsmlPackage.eNS_URI);

		// Obtain or create and register package
		DsmlPackageImpl theDsmlPackage = (DsmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DsmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DsmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDsmlPackage.createPackageContents();

		// Initialize created meta-data
		theDsmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDsmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DsmlPackage.eNS_URI, theDsmlPackage);
		return theDsmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawingArea() {
		return drawingAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_Rule() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_Events() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_Patterns() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_Output() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_Windows() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_TargetGroupby() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_Links() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_LinkPatternTarget() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingArea_LinkTaget() {
		return (EReference)drawingAreaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_RuleName() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Queries() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventOutput() {
		return eventOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventOutput_OutputName() {
		return (EAttribute)eventOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventOutput_Queries() {
		return (EReference)eventOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventPattern() {
		return eventPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventPattern_EventPattern() {
		return (EAttribute)eventPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventPattern_Node() {
		return (EReference)eventPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Window() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_TypeWindow() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Value() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetGroupby() {
		return targetGroupbyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetGroupby_TargetGroupby() {
		return (EAttribute)targetGroupbyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetGroupby_Attributes() {
		return (EReference)targetGroupbyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_EventName() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Attributes() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Incoming() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Outgoing() {
		return (EReference)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregation_Attribute() {
		return (EReference)aggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregation_TypeAggregation() {
		return (EAttribute)aggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionGroup() {
		return conditionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionGroup_ConditionGroup() {
		return (EAttribute)conditionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionGroup_OperationTypes() {
		return (EReference)conditionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupbyCondition() {
		return groupbyConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupbyCondition_GroupbyCondition() {
		return (EAttribute)groupbyConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupbyCondition_Attributes() {
		return (EReference)groupbyConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupbyCondition_OperationTypes() {
		return (EReference)groupbyConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBringGroup() {
		return bringGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBringGroup_BringGroup() {
		return (EAttribute)bringGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBringGroup_BringAll() {
		return (EAttribute)bringGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBringGroup_Attributes() {
		return (EReference)bringGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBringGroup_OperationTypes() {
		return (EReference)bringGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_TargetAlias() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_OperationTypes() {
		return (EReference)targetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_IncomingTarget() {
		return (EReference)targetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_OutgoingTarget() {
		return (EReference)targetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNot_Description() {
		return (EAttribute)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperator_Operator() {
		return (EAttribute)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Attribute() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperator_OperatorAlias() {
		return (EAttribute)operatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueOperator() {
		return valueOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueOperator_ValueOperator() {
		return (EAttribute)valueOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryPattern() {
		return unaryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryPattern_Name() {
		return (EAttribute)unaryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryPattern_TypeUnaryPattern() {
		return (EAttribute)unaryPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternTimer() {
		return patternTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternTimer_PatternTimer() {
		return (EAttribute)patternTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternTimer_TypePatternTimer() {
		return (EAttribute)patternTimerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternTimer_Value() {
		return (EAttribute)patternTimerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatPattern() {
		return repeatPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatPattern_RepeatPattern() {
		return (EAttribute)repeatPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatPattern_TypePatternTimer() {
		return (EAttribute)repeatPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatPattern_Value() {
		return (EAttribute)repeatPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Source() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Target() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkTarget() {
		return linkTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkTarget_Source() {
		return (EReference)linkTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkTarget_Target() {
		return (EReference)linkTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkPatternTarget() {
		return linkPatternTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkPatternTarget_Source() {
		return (EReference)linkPatternTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkPatternTarget_Target() {
		return (EReference)linkPatternTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkPatternTarget_ComparisonTarget() {
		return (EAttribute)linkPatternTargetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparison_Comparison() {
		return (EAttribute)comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmetic() {
		return arithmeticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArithmetic_Arithmetic() {
		return (EAttribute)arithmeticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalConnector() {
		return logicalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalConnector_TypeLogical() {
		return (EAttribute)logicalConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRule() {
		return typeRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeWindow() {
		return typeWindowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeUnaryPattern() {
		return typeUnaryPatternEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRepeatPattern() {
		return typeRepeatPatternEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeTargetComparison() {
		return typeTargetComparisonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeLogical() {
		return typeLogicalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeComparison() {
		return typeComparisonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeArithmetic() {
		return typeArithmeticEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeAggregation() {
		return typeAggregationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypePatternTimer() {
		return typePatternTimerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsmlFactory getDsmlFactory() {
		return (DsmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		drawingAreaEClass = createEClass(DRAWING_AREA);
		createEReference(drawingAreaEClass, DRAWING_AREA__RULE);
		createEReference(drawingAreaEClass, DRAWING_AREA__EVENTS);
		createEReference(drawingAreaEClass, DRAWING_AREA__PATTERNS);
		createEReference(drawingAreaEClass, DRAWING_AREA__OUTPUT);
		createEReference(drawingAreaEClass, DRAWING_AREA__WINDOWS);
		createEReference(drawingAreaEClass, DRAWING_AREA__TARGET_GROUPBY);
		createEReference(drawingAreaEClass, DRAWING_AREA__LINKS);
		createEReference(drawingAreaEClass, DRAWING_AREA__LINK_PATTERN_TARGET);
		createEReference(drawingAreaEClass, DRAWING_AREA__LINK_TAGET);

		componentEClass = createEClass(COMPONENT);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__RULE_NAME);
		createEReference(ruleEClass, RULE__QUERIES);

		eventOutputEClass = createEClass(EVENT_OUTPUT);
		createEAttribute(eventOutputEClass, EVENT_OUTPUT__OUTPUT_NAME);
		createEReference(eventOutputEClass, EVENT_OUTPUT__QUERIES);

		eventPatternEClass = createEClass(EVENT_PATTERN);
		createEAttribute(eventPatternEClass, EVENT_PATTERN__EVENT_PATTERN);
		createEReference(eventPatternEClass, EVENT_PATTERN__NODE);

		windowEClass = createEClass(WINDOW);
		createEAttribute(windowEClass, WINDOW__WINDOW);
		createEAttribute(windowEClass, WINDOW__TYPE_WINDOW);
		createEAttribute(windowEClass, WINDOW__VALUE);

		targetGroupbyEClass = createEClass(TARGET_GROUPBY);
		createEAttribute(targetGroupbyEClass, TARGET_GROUPBY__TARGET_GROUPBY);
		createEReference(targetGroupbyEClass, TARGET_GROUPBY__ATTRIBUTES);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__EVENT_NAME);
		createEReference(eventEClass, EVENT__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__INCOMING);
		createEReference(queryEClass, QUERY__OUTGOING);

		aggregationEClass = createEClass(AGGREGATION);
		createEReference(aggregationEClass, AGGREGATION__ATTRIBUTE);
		createEAttribute(aggregationEClass, AGGREGATION__TYPE_AGGREGATION);

		conditionGroupEClass = createEClass(CONDITION_GROUP);
		createEAttribute(conditionGroupEClass, CONDITION_GROUP__CONDITION_GROUP);
		createEReference(conditionGroupEClass, CONDITION_GROUP__OPERATION_TYPES);

		groupbyConditionEClass = createEClass(GROUPBY_CONDITION);
		createEAttribute(groupbyConditionEClass, GROUPBY_CONDITION__GROUPBY_CONDITION);
		createEReference(groupbyConditionEClass, GROUPBY_CONDITION__ATTRIBUTES);
		createEReference(groupbyConditionEClass, GROUPBY_CONDITION__OPERATION_TYPES);

		bringGroupEClass = createEClass(BRING_GROUP);
		createEAttribute(bringGroupEClass, BRING_GROUP__BRING_GROUP);
		createEAttribute(bringGroupEClass, BRING_GROUP__BRING_ALL);
		createEReference(bringGroupEClass, BRING_GROUP__ATTRIBUTES);
		createEReference(bringGroupEClass, BRING_GROUP__OPERATION_TYPES);

		targetEClass = createEClass(TARGET);
		createEAttribute(targetEClass, TARGET__TARGET_ALIAS);
		createEReference(targetEClass, TARGET__OPERATION_TYPES);
		createEReference(targetEClass, TARGET__INCOMING_TARGET);
		createEReference(targetEClass, TARGET__OUTGOING_TARGET);

		notEClass = createEClass(NOT);
		createEAttribute(notEClass, NOT__DESCRIPTION);

		operatorEClass = createEClass(OPERATOR);
		createEAttribute(operatorEClass, OPERATOR__OPERATOR);
		createEReference(operatorEClass, OPERATOR__ATTRIBUTE);
		createEAttribute(operatorEClass, OPERATOR__OPERATOR_ALIAS);

		valueOperatorEClass = createEClass(VALUE_OPERATOR);
		createEAttribute(valueOperatorEClass, VALUE_OPERATOR__VALUE_OPERATOR);

		patternEClass = createEClass(PATTERN);

		unaryPatternEClass = createEClass(UNARY_PATTERN);
		createEAttribute(unaryPatternEClass, UNARY_PATTERN__NAME);
		createEAttribute(unaryPatternEClass, UNARY_PATTERN__TYPE_UNARY_PATTERN);

		patternTimerEClass = createEClass(PATTERN_TIMER);
		createEAttribute(patternTimerEClass, PATTERN_TIMER__PATTERN_TIMER);
		createEAttribute(patternTimerEClass, PATTERN_TIMER__TYPE_PATTERN_TIMER);
		createEAttribute(patternTimerEClass, PATTERN_TIMER__VALUE);

		repeatPatternEClass = createEClass(REPEAT_PATTERN);
		createEAttribute(repeatPatternEClass, REPEAT_PATTERN__REPEAT_PATTERN);
		createEAttribute(repeatPatternEClass, REPEAT_PATTERN__TYPE_PATTERN_TIMER);
		createEAttribute(repeatPatternEClass, REPEAT_PATTERN__VALUE);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__SOURCE);
		createEReference(linkEClass, LINK__TARGET);

		linkTargetEClass = createEClass(LINK_TARGET);
		createEReference(linkTargetEClass, LINK_TARGET__SOURCE);
		createEReference(linkTargetEClass, LINK_TARGET__TARGET);

		linkPatternTargetEClass = createEClass(LINK_PATTERN_TARGET);
		createEReference(linkPatternTargetEClass, LINK_PATTERN_TARGET__SOURCE);
		createEReference(linkPatternTargetEClass, LINK_PATTERN_TARGET__TARGET);
		createEAttribute(linkPatternTargetEClass, LINK_PATTERN_TARGET__COMPARISON_TARGET);

		comparisonEClass = createEClass(COMPARISON);
		createEAttribute(comparisonEClass, COMPARISON__COMPARISON);

		arithmeticEClass = createEClass(ARITHMETIC);
		createEAttribute(arithmeticEClass, ARITHMETIC__ARITHMETIC);

		logicalConnectorEClass = createEClass(LOGICAL_CONNECTOR);
		createEAttribute(logicalConnectorEClass, LOGICAL_CONNECTOR__TYPE_LOGICAL);

		// Create enums
		typeRuleEEnum = createEEnum(TYPE_RULE);
		typeWindowEEnum = createEEnum(TYPE_WINDOW);
		typeUnaryPatternEEnum = createEEnum(TYPE_UNARY_PATTERN);
		typeRepeatPatternEEnum = createEEnum(TYPE_REPEAT_PATTERN);
		typeTargetComparisonEEnum = createEEnum(TYPE_TARGET_COMPARISON);
		typeLogicalEEnum = createEEnum(TYPE_LOGICAL);
		typeComparisonEEnum = createEEnum(TYPE_COMPARISON);
		typeArithmeticEEnum = createEEnum(TYPE_ARITHMETIC);
		typeAggregationEEnum = createEEnum(TYPE_AGGREGATION);
		typePatternTimerEEnum = createEEnum(TYPE_PATTERN_TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ruleEClass.getESuperTypes().add(this.getComponent());
		eventOutputEClass.getESuperTypes().add(this.getComponent());
		eventPatternEClass.getESuperTypes().add(this.getComponent());
		windowEClass.getESuperTypes().add(this.getComponent());
		targetGroupbyEClass.getESuperTypes().add(this.getComponent());
		eventEClass.getESuperTypes().add(this.getComponent());
		aggregationEClass.getESuperTypes().add(this.getQuery());
		conditionGroupEClass.getESuperTypes().add(this.getQuery());
		groupbyConditionEClass.getESuperTypes().add(this.getQuery());
		bringGroupEClass.getESuperTypes().add(this.getQuery());
		targetEClass.getESuperTypes().add(this.getPattern());
		targetEClass.getESuperTypes().add(this.getQuery());
		notEClass.getESuperTypes().add(this.getQuery());
		notEClass.getESuperTypes().add(this.getPattern());
		operatorEClass.getESuperTypes().add(this.getQuery());
		valueOperatorEClass.getESuperTypes().add(this.getQuery());
		patternEClass.getESuperTypes().add(this.getQuery());
		unaryPatternEClass.getESuperTypes().add(this.getPattern());
		patternTimerEClass.getESuperTypes().add(this.getPattern());
		repeatPatternEClass.getESuperTypes().add(this.getPattern());
		comparisonEClass.getESuperTypes().add(this.getLink());
		arithmeticEClass.getESuperTypes().add(this.getLink());
		logicalConnectorEClass.getESuperTypes().add(this.getLink());

		// Initialize classes and features; add operations and parameters
		initEClass(drawingAreaEClass, DrawingArea.class, "DrawingArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrawingArea_Rule(), this.getRule(), null, "rule", null, 1, 1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingArea_Events(), this.getEvent(), null, "events", null, 0, -1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingArea_Patterns(), this.getEventPattern(), null, "patterns", null, 1, 1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingArea_Output(), this.getEventOutput(), null, "output", null, 1, 1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingArea_Windows(), this.getWindow(), null, "windows", null, 0, -1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingArea_TargetGroupby(), this.getTargetGroupby(), null, "targetGroupby", null, 0, -1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingArea_Links(), this.getLink(), null, "links", null, 0, -1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingArea_LinkPatternTarget(), this.getLinkPatternTarget(), null, "linkPatternTarget", null, 0, -1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingArea_LinkTaget(), this.getLinkTarget(), null, "linkTaget", null, 0, -1, DrawingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_RuleName(), ecorePackage.getEString(), "ruleName", "Rule", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Queries(), this.getQuery(), null, "queries", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventOutputEClass, EventOutput.class, "EventOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventOutput_OutputName(), ecorePackage.getEString(), "outputName", "OutputEvent", 0, 1, EventOutput.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventOutput_Queries(), this.getQuery(), null, "queries", null, 0, -1, EventOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventPatternEClass, EventPattern.class, "EventPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventPattern_EventPattern(), ecorePackage.getEString(), "eventPattern", "EventPattern", 0, 1, EventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventPattern_Node(), this.getPattern(), null, "node", null, 0, -1, EventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindow_Window(), ecorePackage.getEString(), "window", "Window", 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_TypeWindow(), this.getTypeWindow(), "typeWindow", null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindow_Value(), ecorePackage.getEString(), "value", null, 0, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetGroupbyEClass, TargetGroupby.class, "TargetGroupby", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetGroupby_TargetGroupby(), ecorePackage.getEString(), "targetGroupby", "TargetGroupby", 0, 1, TargetGroupby.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetGroupby_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, TargetGroupby.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_EventName(), ecorePackage.getEString(), "eventName", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Incoming(), this.getLink(), this.getLink_Target(), "incoming", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Outgoing(), this.getLink(), this.getLink_Source(), "outgoing", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregation_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, Aggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregation_TypeAggregation(), this.getTypeAggregation(), "typeAggregation", null, 0, 1, Aggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionGroupEClass, ConditionGroup.class, "ConditionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionGroup_ConditionGroup(), ecorePackage.getEString(), "conditionGroup", "ConditionGroup", 0, 1, ConditionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionGroup_OperationTypes(), this.getQuery(), null, "operationTypes", null, 0, -1, ConditionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupbyConditionEClass, GroupbyCondition.class, "GroupbyCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupbyCondition_GroupbyCondition(), ecorePackage.getEString(), "groupbyCondition", "groupbyCondition", 0, 1, GroupbyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupbyCondition_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, GroupbyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupbyCondition_OperationTypes(), this.getQuery(), null, "operationTypes", null, 0, -1, GroupbyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bringGroupEClass, BringGroup.class, "BringGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBringGroup_BringGroup(), ecorePackage.getEString(), "bringGroup", "BringGroup", 0, 1, BringGroup.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBringGroup_BringAll(), ecorePackage.getEBoolean(), "bringAll", "false", 0, 1, BringGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBringGroup_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, BringGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBringGroup_OperationTypes(), this.getQuery(), null, "operationTypes", null, 0, -1, BringGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarget_TargetAlias(), ecorePackage.getEString(), "targetAlias", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_OperationTypes(), this.getQuery(), null, "operationTypes", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_IncomingTarget(), this.getLinkPatternTarget(), this.getLinkPatternTarget_Target(), "incomingTarget", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_OutgoingTarget(), this.getLinkPatternTarget(), this.getLinkPatternTarget_Source(), "outgoingTarget", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNot_Description(), ecorePackage.getEString(), "description", "NOT", 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperator_Operator(), ecorePackage.getEString(), "operator", "Operator", 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperator_OperatorAlias(), ecorePackage.getEString(), "operatorAlias", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueOperatorEClass, ValueOperator.class, "ValueOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueOperator_ValueOperator(), ecorePackage.getEString(), "valueOperator", null, 0, 1, ValueOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryPatternEClass, UnaryPattern.class, "UnaryPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryPattern_Name(), ecorePackage.getEString(), "name", "UnaryPattern", 0, 1, UnaryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryPattern_TypeUnaryPattern(), this.getTypeUnaryPattern(), "typeUnaryPattern", null, 0, 1, UnaryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternTimerEClass, PatternTimer.class, "PatternTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternTimer_PatternTimer(), ecorePackage.getEString(), "patternTimer", "PatternTimer", 0, 1, PatternTimer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternTimer_TypePatternTimer(), this.getTypePatternTimer(), "typePatternTimer", null, 0, 1, PatternTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternTimer_Value(), ecorePackage.getEString(), "value", null, 0, 1, PatternTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatPatternEClass, RepeatPattern.class, "RepeatPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeatPattern_RepeatPattern(), ecorePackage.getEString(), "repeatPattern", "RepeatPattern", 0, 1, RepeatPattern.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepeatPattern_TypePatternTimer(), this.getTypeRepeatPattern(), "typePatternTimer", null, 0, 1, RepeatPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepeatPattern_Value(), ecorePackage.getEString(), "value", null, 0, 1, RepeatPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Source(), this.getQuery(), this.getQuery_Outgoing(), "source", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Target(), this.getQuery(), this.getQuery_Incoming(), "target", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTargetEClass, LinkTarget.class, "LinkTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkTarget_Source(), this.getComponent(), null, "source", null, 1, 1, LinkTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkTarget_Target(), this.getTarget(), null, "target", null, 0, -1, LinkTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkPatternTargetEClass, LinkPatternTarget.class, "LinkPatternTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkPatternTarget_Source(), this.getTarget(), this.getTarget_OutgoingTarget(), "source", null, 1, 1, LinkPatternTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkPatternTarget_Target(), this.getTarget(), this.getTarget_IncomingTarget(), "target", null, 1, 1, LinkPatternTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkPatternTarget_ComparisonTarget(), this.getTypeTargetComparison(), "comparisonTarget", null, 0, 1, LinkPatternTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparison_Comparison(), this.getTypeComparison(), "comparison", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arithmeticEClass, Arithmetic.class, "Arithmetic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArithmetic_Arithmetic(), this.getTypeArithmetic(), "arithmetic", null, 0, 1, Arithmetic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalConnectorEClass, LogicalConnector.class, "LogicalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalConnector_TypeLogical(), this.getTypeLogical(), "typeLogical", null, 0, 1, LogicalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeRuleEEnum, TypeRule.class, "TypeRule");
		addEEnumLiteral(typeRuleEEnum, TypeRule.QUERY);
		addEEnumLiteral(typeRuleEEnum, TypeRule.PATTERN);

		initEEnum(typeWindowEEnum, TypeWindow.class, "TypeWindow");
		addEEnumLiteral(typeWindowEEnum, TypeWindow.LENGTH);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.LENGTH_BATCH);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.TIME);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.EXT_TIMED);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.TIME_BATCH);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.EXT_TIMED_BATCH);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.TIME_LENGTH_BATCH);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.TIME_SEC);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.TIME_ACCUM);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.KEEPALL);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.FIRSTLENGTH);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.FIRSTTIME);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.EXPR);
		addEEnumLiteral(typeWindowEEnum, TypeWindow.EXPR_BATCH);

		initEEnum(typeUnaryPatternEEnum, TypeUnaryPattern.class, "TypeUnaryPattern");
		addEEnumLiteral(typeUnaryPatternEEnum, TypeUnaryPattern.EVERY);
		addEEnumLiteral(typeUnaryPatternEEnum, TypeUnaryPattern.EVERY_DISTINCT);

		initEEnum(typeRepeatPatternEEnum, TypeRepeatPattern.class, "TypeRepeatPattern");
		addEEnumLiteral(typeRepeatPatternEEnum, TypeRepeatPattern.RANGE);
		addEEnumLiteral(typeRepeatPatternEEnum, TypeRepeatPattern.REPEAT);

		initEEnum(typeTargetComparisonEEnum, TypeTargetComparison.class, "TypeTargetComparison");
		addEEnumLiteral(typeTargetComparisonEEnum, TypeTargetComparison.FOLLOWEDBY);
		addEEnumLiteral(typeTargetComparisonEEnum, TypeTargetComparison.AND);
		addEEnumLiteral(typeTargetComparisonEEnum, TypeTargetComparison.OR);
		addEEnumLiteral(typeTargetComparisonEEnum, TypeTargetComparison.UNTIL);
		addEEnumLiteral(typeTargetComparisonEEnum, TypeTargetComparison.WHILE);

		initEEnum(typeLogicalEEnum, TypeLogical.class, "TypeLogical");
		addEEnumLiteral(typeLogicalEEnum, TypeLogical.AND);
		addEEnumLiteral(typeLogicalEEnum, TypeLogical.OR);

		initEEnum(typeComparisonEEnum, TypeComparison.class, "TypeComparison");
		addEEnumLiteral(typeComparisonEEnum, TypeComparison.EQUAL);
		addEEnumLiteral(typeComparisonEEnum, TypeComparison.GREATER_EQUAL);
		addEEnumLiteral(typeComparisonEEnum, TypeComparison.GREATER_THAN);
		addEEnumLiteral(typeComparisonEEnum, TypeComparison.LESS_EQUAL);
		addEEnumLiteral(typeComparisonEEnum, TypeComparison.LESS_THAN);
		addEEnumLiteral(typeComparisonEEnum, TypeComparison.NOT_EQUAL);

		initEEnum(typeArithmeticEEnum, TypeArithmetic.class, "TypeArithmetic");
		addEEnumLiteral(typeArithmeticEEnum, TypeArithmetic.ADDITION);
		addEEnumLiteral(typeArithmeticEEnum, TypeArithmetic.DIVISION);
		addEEnumLiteral(typeArithmeticEEnum, TypeArithmetic.MODULUS);
		addEEnumLiteral(typeArithmeticEEnum, TypeArithmetic.MULTIPLICATION);
		addEEnumLiteral(typeArithmeticEEnum, TypeArithmetic.SUBTRACTION);

		initEEnum(typeAggregationEEnum, TypeAggregation.class, "TypeAggregation");
		addEEnumLiteral(typeAggregationEEnum, TypeAggregation.AVG);
		addEEnumLiteral(typeAggregationEEnum, TypeAggregation.COUNT);
		addEEnumLiteral(typeAggregationEEnum, TypeAggregation.MAX);
		addEEnumLiteral(typeAggregationEEnum, TypeAggregation.MIN);
		addEEnumLiteral(typeAggregationEEnum, TypeAggregation.SUM);

		initEEnum(typePatternTimerEEnum, TypePatternTimer.class, "TypePatternTimer");
		addEEnumLiteral(typePatternTimerEEnum, TypePatternTimer.WITHIN_TIMER);
		addEEnumLiteral(typePatternTimerEEnum, TypePatternTimer.WITHIN_MAX_TIMER);
		addEEnumLiteral(typePatternTimerEEnum, TypePatternTimer.INTERVAL);
		addEEnumLiteral(typePatternTimerEEnum, TypePatternTimer.AT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (drawingAreaEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "rcp", "false",
			 "onefile", "true",
			 "diagram.extension", "dsml"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (ruleEClass, 
		   source, 
		   new String[] {
			 "label", "ruleName",
			 "figure", "rounded",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (eventOutputEClass, 
		   source, 
		   new String[] {
			 "label", "outputName",
			 "figure", "rounded",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (eventPatternEClass, 
		   source, 
		   new String[] {
			 "label", "eventPattern",
			 "figure", "rounded",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (windowEClass, 
		   source, 
		   new String[] {
			 "label", "window",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (targetGroupbyEClass, 
		   source, 
		   new String[] {
			 "label", "targetGroupby",
			 "figure", "rounded",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (eventEClass, 
		   source, 
		   new String[] {
			 "label", "eventName",
			 "figure", "rounded",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "label", "name,type",
			 "figure", "rectangle",
			 "label.icon", "false",
			 "label.pattern", "{0}:{1}"
		   });	
		addAnnotation
		  (aggregationEClass, 
		   source, 
		   new String[] {
			 "label", "typeAggregation",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (conditionGroupEClass, 
		   source, 
		   new String[] {
			 "label", "conditionGroup",
			 "figure", "rectangle",
			 "border.color", "255,204,0"
		   });	
		addAnnotation
		  (groupbyConditionEClass, 
		   source, 
		   new String[] {
			 "label", "groupbyCondition",
			 "figure", "rectangle",
			 "border.color", "76,217,100"
		   });	
		addAnnotation
		  (bringGroupEClass, 
		   source, 
		   new String[] {
			 "label", "bringGroup",
			 "figure", "rectangle",
			 "border.color", "0,153,255"
		   });	
		addAnnotation
		  (targetEClass, 
		   source, 
		   new String[] {
			 "label", "targetAlias",
			 "figure", "rectangle",
			 "border.color", "255,0,0"
		   });	
		addAnnotation
		  (notEClass, 
		   source, 
		   new String[] {
			 "label", "description",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (operatorEClass, 
		   source, 
		   new String[] {
			 "label", "operator",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (valueOperatorEClass, 
		   source, 
		   new String[] {
			 "label", "valueOperator",
			 "figure", "ellipse",
			 "border.color", "0,0,0"
		   });	
		addAnnotation
		  (unaryPatternEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (patternTimerEClass, 
		   source, 
		   new String[] {
			 "label", "patternTimer",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (repeatPatternEClass, 
		   source, 
		   new String[] {
			 "label", "repeatPattern",
			 "figure", "rectangle"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getRule_Queries(), 
		   source, 
		   new String[] {
			 "collapsible", "true",
			 "layout", "free"
		   });	
		addAnnotation
		  (getEventOutput_Queries(), 
		   source, 
		   new String[] {
			 "collapsible", "true",
			 "layout", "free"
		   });	
		addAnnotation
		  (getEventPattern_Node(), 
		   source, 
		   new String[] {
			 "collapsible", "true",
			 "layout", "free"
		   });	
		addAnnotation
		  (getEvent_Attributes(), 
		   source, 
		   new String[] {
			 "layout", "list",
			 "collapsible", "false"
		   });	
		addAnnotation
		  (getConditionGroup_OperationTypes(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getGroupbyCondition_OperationTypes(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getBringGroup_OperationTypes(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "true"
		   });	
		addAnnotation
		  (getTarget_OperationTypes(), 
		   source, 
		   new String[] {
			 "layout", "free",
			 "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (linkTargetEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "incoming", "true",
			 "color", "0,0,0",
			 "width", "1"
		   });	
		addAnnotation
		  (linkPatternTargetEClass, 
		   source, 
		   new String[] {
			 "label", "comparisonTarget",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "incoming", "true",
			 "color", "0,0,0",
			 "width", "1",
			 "tool.description", "Operations: [FOLLOWEDBY, OR, AND, OR, UNTIL, WHILE]"
		   });	
		addAnnotation
		  (comparisonEClass, 
		   source, 
		   new String[] {
			 "label", "comparison",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "incoming", "true",
			 "color", "0,0,0",
			 "width", "1",
			 "tool.description", "Operations: [=, >=, >, <=, <, <>]"
		   });	
		addAnnotation
		  (arithmeticEClass, 
		   source, 
		   new String[] {
			 "label", "arithmetic",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "incoming", "true",
			 "color", "0,0,0",
			 "width", "1",
			 "tool.description", "Operations: [+, /, %, *, -]"
		   });	
		addAnnotation
		  (logicalConnectorEClass, 
		   source, 
		   new String[] {
			 "label", "typeLogical",
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "incoming", "true",
			 "color", "0,153,255",
			 "width", "2",
			 "tool.description", "Operations: [and, or]"
		   });
	}

} //DsmlPackageImpl
