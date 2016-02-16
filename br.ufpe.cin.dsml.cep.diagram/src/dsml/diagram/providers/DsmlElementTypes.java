/*
 * 
 */
package dsml.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import dsml.DsmlPackage;
import dsml.diagram.edit.parts.Aggregation2EditPart;
import dsml.diagram.edit.parts.Aggregation3EditPart;
import dsml.diagram.edit.parts.Aggregation4EditPart;
import dsml.diagram.edit.parts.Aggregation5EditPart;
import dsml.diagram.edit.parts.Aggregation6EditPart;
import dsml.diagram.edit.parts.AggregationEditPart;
import dsml.diagram.edit.parts.ArithmeticEditPart;
import dsml.diagram.edit.parts.AttributeEditPart;
import dsml.diagram.edit.parts.BringGroup2EditPart;
import dsml.diagram.edit.parts.BringGroup3EditPart;
import dsml.diagram.edit.parts.BringGroup4EditPart;
import dsml.diagram.edit.parts.BringGroup5EditPart;
import dsml.diagram.edit.parts.BringGroup6EditPart;
import dsml.diagram.edit.parts.BringGroupEditPart;
import dsml.diagram.edit.parts.ComparisonEditPart;
import dsml.diagram.edit.parts.ConditionGroup2EditPart;
import dsml.diagram.edit.parts.ConditionGroup3EditPart;
import dsml.diagram.edit.parts.ConditionGroup4EditPart;
import dsml.diagram.edit.parts.ConditionGroup5EditPart;
import dsml.diagram.edit.parts.ConditionGroup6EditPart;
import dsml.diagram.edit.parts.ConditionGroupEditPart;
import dsml.diagram.edit.parts.DrawingAreaEditPart;
import dsml.diagram.edit.parts.EventEditPart;
import dsml.diagram.edit.parts.EventOutputEditPart;
import dsml.diagram.edit.parts.EventPatternEditPart;
import dsml.diagram.edit.parts.GroupbyCondition2EditPart;
import dsml.diagram.edit.parts.GroupbyCondition3EditPart;
import dsml.diagram.edit.parts.GroupbyCondition4EditPart;
import dsml.diagram.edit.parts.GroupbyCondition5EditPart;
import dsml.diagram.edit.parts.GroupbyCondition6EditPart;
import dsml.diagram.edit.parts.GroupbyConditionEditPart;
import dsml.diagram.edit.parts.LinkPatternTargetEditPart;
import dsml.diagram.edit.parts.LinkTargetEditPart;
import dsml.diagram.edit.parts.LogicalConnectorEditPart;
import dsml.diagram.edit.parts.Not2EditPart;
import dsml.diagram.edit.parts.Not3EditPart;
import dsml.diagram.edit.parts.Not4EditPart;
import dsml.diagram.edit.parts.Not5EditPart;
import dsml.diagram.edit.parts.Not6EditPart;
import dsml.diagram.edit.parts.Not7EditPart;
import dsml.diagram.edit.parts.NotEditPart;
import dsml.diagram.edit.parts.Operator2EditPart;
import dsml.diagram.edit.parts.Operator3EditPart;
import dsml.diagram.edit.parts.Operator4EditPart;
import dsml.diagram.edit.parts.Operator5EditPart;
import dsml.diagram.edit.parts.Operator6EditPart;
import dsml.diagram.edit.parts.OperatorEditPart;
import dsml.diagram.edit.parts.PatternTimer2EditPart;
import dsml.diagram.edit.parts.PatternTimer3EditPart;
import dsml.diagram.edit.parts.PatternTimer4EditPart;
import dsml.diagram.edit.parts.PatternTimer5EditPart;
import dsml.diagram.edit.parts.PatternTimer6EditPart;
import dsml.diagram.edit.parts.PatternTimer7EditPart;
import dsml.diagram.edit.parts.PatternTimerEditPart;
import dsml.diagram.edit.parts.RepeatPattern2EditPart;
import dsml.diagram.edit.parts.RepeatPattern3EditPart;
import dsml.diagram.edit.parts.RepeatPattern4EditPart;
import dsml.diagram.edit.parts.RepeatPattern5EditPart;
import dsml.diagram.edit.parts.RepeatPattern6EditPart;
import dsml.diagram.edit.parts.RepeatPattern7EditPart;
import dsml.diagram.edit.parts.RepeatPatternEditPart;
import dsml.diagram.edit.parts.RuleEditPart;
import dsml.diagram.edit.parts.Target2EditPart;
import dsml.diagram.edit.parts.Target3EditPart;
import dsml.diagram.edit.parts.Target4EditPart;
import dsml.diagram.edit.parts.Target5EditPart;
import dsml.diagram.edit.parts.Target6EditPart;
import dsml.diagram.edit.parts.Target7EditPart;
import dsml.diagram.edit.parts.TargetEditPart;
import dsml.diagram.edit.parts.TargetGroupbyEditPart;
import dsml.diagram.edit.parts.UnaryPattern2EditPart;
import dsml.diagram.edit.parts.UnaryPattern3EditPart;
import dsml.diagram.edit.parts.UnaryPattern4EditPart;
import dsml.diagram.edit.parts.UnaryPattern5EditPart;
import dsml.diagram.edit.parts.UnaryPattern6EditPart;
import dsml.diagram.edit.parts.UnaryPattern7EditPart;
import dsml.diagram.edit.parts.UnaryPatternEditPart;
import dsml.diagram.edit.parts.ValueOperator2EditPart;
import dsml.diagram.edit.parts.ValueOperator3EditPart;
import dsml.diagram.edit.parts.ValueOperator4EditPart;
import dsml.diagram.edit.parts.ValueOperator5EditPart;
import dsml.diagram.edit.parts.ValueOperator6EditPart;
import dsml.diagram.edit.parts.ValueOperatorEditPart;
import dsml.diagram.edit.parts.WindowEditPart;
import dsml.diagram.part.DsmlDiagramEditorPlugin;

/**
 * @generated
 */
public class DsmlElementTypes {

	/**
	 * @generated
	 */
	private DsmlElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DsmlDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType DrawingArea_1000 = getElementType("br.ufpe.cin.dsml.cep.diagram.DrawingArea_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rule_2001 = getElementType("br.ufpe.cin.dsml.cep.diagram.Rule_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2002 = getElementType("br.ufpe.cin.dsml.cep.diagram.Event_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventPattern_2003 = getElementType("br.ufpe.cin.dsml.cep.diagram.EventPattern_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventOutput_2004 = getElementType("br.ufpe.cin.dsml.cep.diagram.EventOutput_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Window_2005 = getElementType("br.ufpe.cin.dsml.cep.diagram.Window_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TargetGroupby_2006 = getElementType("br.ufpe.cin.dsml.cep.diagram.TargetGroupby_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Target_3001 = getElementType("br.ufpe.cin.dsml.cep.diagram.Target_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Target_3002 = getElementType("br.ufpe.cin.dsml.cep.diagram.Target_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3003 = getElementType("br.ufpe.cin.dsml.cep.diagram.Not_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnaryPattern_3004 = getElementType("br.ufpe.cin.dsml.cep.diagram.UnaryPattern_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PatternTimer_3005 = getElementType("br.ufpe.cin.dsml.cep.diagram.PatternTimer_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatPattern_3006 = getElementType("br.ufpe.cin.dsml.cep.diagram.RepeatPattern_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_3007 = getElementType("br.ufpe.cin.dsml.cep.diagram.Aggregation_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionGroup_3008 = getElementType("br.ufpe.cin.dsml.cep.diagram.ConditionGroup_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Target_3009 = getElementType("br.ufpe.cin.dsml.cep.diagram.Target_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupbyCondition_3010 = getElementType("br.ufpe.cin.dsml.cep.diagram.GroupbyCondition_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Target_3011 = getElementType("br.ufpe.cin.dsml.cep.diagram.Target_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BringGroup_3012 = getElementType("br.ufpe.cin.dsml.cep.diagram.BringGroup_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Target_3013 = getElementType("br.ufpe.cin.dsml.cep.diagram.Target_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operator_3014 = getElementType("br.ufpe.cin.dsml.cep.diagram.Operator_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueOperator_3015 = getElementType("br.ufpe.cin.dsml.cep.diagram.ValueOperator_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3016 = getElementType("br.ufpe.cin.dsml.cep.diagram.Not_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnaryPattern_3017 = getElementType("br.ufpe.cin.dsml.cep.diagram.UnaryPattern_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PatternTimer_3018 = getElementType("br.ufpe.cin.dsml.cep.diagram.PatternTimer_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatPattern_3019 = getElementType("br.ufpe.cin.dsml.cep.diagram.RepeatPattern_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_3020 = getElementType("br.ufpe.cin.dsml.cep.diagram.Aggregation_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionGroup_3021 = getElementType("br.ufpe.cin.dsml.cep.diagram.ConditionGroup_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3022 = getElementType("br.ufpe.cin.dsml.cep.diagram.Not_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnaryPattern_3023 = getElementType("br.ufpe.cin.dsml.cep.diagram.UnaryPattern_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PatternTimer_3024 = getElementType("br.ufpe.cin.dsml.cep.diagram.PatternTimer_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatPattern_3025 = getElementType("br.ufpe.cin.dsml.cep.diagram.RepeatPattern_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_3026 = getElementType("br.ufpe.cin.dsml.cep.diagram.Aggregation_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionGroup_3027 = getElementType("br.ufpe.cin.dsml.cep.diagram.ConditionGroup_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupbyCondition_3028 = getElementType("br.ufpe.cin.dsml.cep.diagram.GroupbyCondition_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3029 = getElementType("br.ufpe.cin.dsml.cep.diagram.Not_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnaryPattern_3030 = getElementType("br.ufpe.cin.dsml.cep.diagram.UnaryPattern_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PatternTimer_3031 = getElementType("br.ufpe.cin.dsml.cep.diagram.PatternTimer_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatPattern_3032 = getElementType("br.ufpe.cin.dsml.cep.diagram.RepeatPattern_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_3033 = getElementType("br.ufpe.cin.dsml.cep.diagram.Aggregation_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionGroup_3034 = getElementType("br.ufpe.cin.dsml.cep.diagram.ConditionGroup_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BringGroup_3035 = getElementType("br.ufpe.cin.dsml.cep.diagram.BringGroup_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupbyCondition_3036 = getElementType("br.ufpe.cin.dsml.cep.diagram.GroupbyCondition_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupbyCondition_3037 = getElementType("br.ufpe.cin.dsml.cep.diagram.GroupbyCondition_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BringGroup_3038 = getElementType("br.ufpe.cin.dsml.cep.diagram.BringGroup_3038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BringGroup_3039 = getElementType("br.ufpe.cin.dsml.cep.diagram.BringGroup_3039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operator_3040 = getElementType("br.ufpe.cin.dsml.cep.diagram.Operator_3040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueOperator_3041 = getElementType("br.ufpe.cin.dsml.cep.diagram.ValueOperator_3041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operator_3042 = getElementType("br.ufpe.cin.dsml.cep.diagram.Operator_3042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueOperator_3043 = getElementType("br.ufpe.cin.dsml.cep.diagram.ValueOperator_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operator_3044 = getElementType("br.ufpe.cin.dsml.cep.diagram.Operator_3044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueOperator_3045 = getElementType("br.ufpe.cin.dsml.cep.diagram.ValueOperator_3045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3046 = getElementType("br.ufpe.cin.dsml.cep.diagram.Not_3046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnaryPattern_3047 = getElementType("br.ufpe.cin.dsml.cep.diagram.UnaryPattern_3047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PatternTimer_3048 = getElementType("br.ufpe.cin.dsml.cep.diagram.PatternTimer_3048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatPattern_3049 = getElementType("br.ufpe.cin.dsml.cep.diagram.RepeatPattern_3049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_3050 = getElementType("br.ufpe.cin.dsml.cep.diagram.Aggregation_3050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionGroup_3051 = getElementType("br.ufpe.cin.dsml.cep.diagram.ConditionGroup_3051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupbyCondition_3052 = getElementType("br.ufpe.cin.dsml.cep.diagram.GroupbyCondition_3052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BringGroup_3053 = getElementType("br.ufpe.cin.dsml.cep.diagram.BringGroup_3053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operator_3054 = getElementType("br.ufpe.cin.dsml.cep.diagram.Operator_3054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueOperator_3055 = getElementType("br.ufpe.cin.dsml.cep.diagram.ValueOperator_3055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3056 = getElementType("br.ufpe.cin.dsml.cep.diagram.Attribute_3056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Target_3057 = getElementType("br.ufpe.cin.dsml.cep.diagram.Target_3057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3058 = getElementType("br.ufpe.cin.dsml.cep.diagram.Not_3058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnaryPattern_3059 = getElementType("br.ufpe.cin.dsml.cep.diagram.UnaryPattern_3059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PatternTimer_3060 = getElementType("br.ufpe.cin.dsml.cep.diagram.PatternTimer_3060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatPattern_3061 = getElementType("br.ufpe.cin.dsml.cep.diagram.RepeatPattern_3061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Target_3062 = getElementType("br.ufpe.cin.dsml.cep.diagram.Target_3062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Not_3063 = getElementType("br.ufpe.cin.dsml.cep.diagram.Not_3063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnaryPattern_3064 = getElementType("br.ufpe.cin.dsml.cep.diagram.UnaryPattern_3064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PatternTimer_3065 = getElementType("br.ufpe.cin.dsml.cep.diagram.PatternTimer_3065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RepeatPattern_3066 = getElementType("br.ufpe.cin.dsml.cep.diagram.RepeatPattern_3066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_3067 = getElementType("br.ufpe.cin.dsml.cep.diagram.Aggregation_3067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionGroup_3068 = getElementType("br.ufpe.cin.dsml.cep.diagram.ConditionGroup_3068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GroupbyCondition_3069 = getElementType("br.ufpe.cin.dsml.cep.diagram.GroupbyCondition_3069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BringGroup_3070 = getElementType("br.ufpe.cin.dsml.cep.diagram.BringGroup_3070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operator_3071 = getElementType("br.ufpe.cin.dsml.cep.diagram.Operator_3071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ValueOperator_3072 = getElementType("br.ufpe.cin.dsml.cep.diagram.ValueOperator_3072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comparison_4001 = getElementType("br.ufpe.cin.dsml.cep.diagram.Comparison_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Arithmetic_4002 = getElementType("br.ufpe.cin.dsml.cep.diagram.Arithmetic_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogicalConnector_4003 = getElementType("br.ufpe.cin.dsml.cep.diagram.LogicalConnector_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkTarget_4004 = getElementType("br.ufpe.cin.dsml.cep.diagram.LinkTarget_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkPatternTarget_4005 = getElementType("br.ufpe.cin.dsml.cep.diagram.LinkPatternTarget_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DrawingArea_1000,
					DsmlPackage.eINSTANCE.getDrawingArea());

			elements.put(Rule_2001, DsmlPackage.eINSTANCE.getRule());

			elements.put(Event_2002, DsmlPackage.eINSTANCE.getEvent());

			elements.put(EventPattern_2003,
					DsmlPackage.eINSTANCE.getEventPattern());

			elements.put(EventOutput_2004,
					DsmlPackage.eINSTANCE.getEventOutput());

			elements.put(Window_2005, DsmlPackage.eINSTANCE.getWindow());

			elements.put(TargetGroupby_2006,
					DsmlPackage.eINSTANCE.getTargetGroupby());

			elements.put(Target_3001, DsmlPackage.eINSTANCE.getTarget());

			elements.put(Target_3002, DsmlPackage.eINSTANCE.getTarget());

			elements.put(Not_3003, DsmlPackage.eINSTANCE.getNot());

			elements.put(UnaryPattern_3004,
					DsmlPackage.eINSTANCE.getUnaryPattern());

			elements.put(PatternTimer_3005,
					DsmlPackage.eINSTANCE.getPatternTimer());

			elements.put(RepeatPattern_3006,
					DsmlPackage.eINSTANCE.getRepeatPattern());

			elements.put(Aggregation_3007,
					DsmlPackage.eINSTANCE.getAggregation());

			elements.put(ConditionGroup_3008,
					DsmlPackage.eINSTANCE.getConditionGroup());

			elements.put(Target_3009, DsmlPackage.eINSTANCE.getTarget());

			elements.put(GroupbyCondition_3010,
					DsmlPackage.eINSTANCE.getGroupbyCondition());

			elements.put(Target_3011, DsmlPackage.eINSTANCE.getTarget());

			elements.put(BringGroup_3012, DsmlPackage.eINSTANCE.getBringGroup());

			elements.put(Target_3013, DsmlPackage.eINSTANCE.getTarget());

			elements.put(Operator_3014, DsmlPackage.eINSTANCE.getOperator());

			elements.put(ValueOperator_3015,
					DsmlPackage.eINSTANCE.getValueOperator());

			elements.put(Not_3016, DsmlPackage.eINSTANCE.getNot());

			elements.put(UnaryPattern_3017,
					DsmlPackage.eINSTANCE.getUnaryPattern());

			elements.put(PatternTimer_3018,
					DsmlPackage.eINSTANCE.getPatternTimer());

			elements.put(RepeatPattern_3019,
					DsmlPackage.eINSTANCE.getRepeatPattern());

			elements.put(Aggregation_3020,
					DsmlPackage.eINSTANCE.getAggregation());

			elements.put(ConditionGroup_3021,
					DsmlPackage.eINSTANCE.getConditionGroup());

			elements.put(Not_3022, DsmlPackage.eINSTANCE.getNot());

			elements.put(UnaryPattern_3023,
					DsmlPackage.eINSTANCE.getUnaryPattern());

			elements.put(PatternTimer_3024,
					DsmlPackage.eINSTANCE.getPatternTimer());

			elements.put(RepeatPattern_3025,
					DsmlPackage.eINSTANCE.getRepeatPattern());

			elements.put(Aggregation_3026,
					DsmlPackage.eINSTANCE.getAggregation());

			elements.put(ConditionGroup_3027,
					DsmlPackage.eINSTANCE.getConditionGroup());

			elements.put(GroupbyCondition_3028,
					DsmlPackage.eINSTANCE.getGroupbyCondition());

			elements.put(Not_3029, DsmlPackage.eINSTANCE.getNot());

			elements.put(UnaryPattern_3030,
					DsmlPackage.eINSTANCE.getUnaryPattern());

			elements.put(PatternTimer_3031,
					DsmlPackage.eINSTANCE.getPatternTimer());

			elements.put(RepeatPattern_3032,
					DsmlPackage.eINSTANCE.getRepeatPattern());

			elements.put(Aggregation_3033,
					DsmlPackage.eINSTANCE.getAggregation());

			elements.put(ConditionGroup_3034,
					DsmlPackage.eINSTANCE.getConditionGroup());

			elements.put(BringGroup_3035, DsmlPackage.eINSTANCE.getBringGroup());

			elements.put(GroupbyCondition_3036,
					DsmlPackage.eINSTANCE.getGroupbyCondition());

			elements.put(GroupbyCondition_3037,
					DsmlPackage.eINSTANCE.getGroupbyCondition());

			elements.put(BringGroup_3038, DsmlPackage.eINSTANCE.getBringGroup());

			elements.put(BringGroup_3039, DsmlPackage.eINSTANCE.getBringGroup());

			elements.put(Operator_3040, DsmlPackage.eINSTANCE.getOperator());

			elements.put(ValueOperator_3041,
					DsmlPackage.eINSTANCE.getValueOperator());

			elements.put(Operator_3042, DsmlPackage.eINSTANCE.getOperator());

			elements.put(ValueOperator_3043,
					DsmlPackage.eINSTANCE.getValueOperator());

			elements.put(Operator_3044, DsmlPackage.eINSTANCE.getOperator());

			elements.put(ValueOperator_3045,
					DsmlPackage.eINSTANCE.getValueOperator());

			elements.put(Not_3046, DsmlPackage.eINSTANCE.getNot());

			elements.put(UnaryPattern_3047,
					DsmlPackage.eINSTANCE.getUnaryPattern());

			elements.put(PatternTimer_3048,
					DsmlPackage.eINSTANCE.getPatternTimer());

			elements.put(RepeatPattern_3049,
					DsmlPackage.eINSTANCE.getRepeatPattern());

			elements.put(Aggregation_3050,
					DsmlPackage.eINSTANCE.getAggregation());

			elements.put(ConditionGroup_3051,
					DsmlPackage.eINSTANCE.getConditionGroup());

			elements.put(GroupbyCondition_3052,
					DsmlPackage.eINSTANCE.getGroupbyCondition());

			elements.put(BringGroup_3053, DsmlPackage.eINSTANCE.getBringGroup());

			elements.put(Operator_3054, DsmlPackage.eINSTANCE.getOperator());

			elements.put(ValueOperator_3055,
					DsmlPackage.eINSTANCE.getValueOperator());

			elements.put(Attribute_3056, DsmlPackage.eINSTANCE.getAttribute());

			elements.put(Target_3057, DsmlPackage.eINSTANCE.getTarget());

			elements.put(Not_3058, DsmlPackage.eINSTANCE.getNot());

			elements.put(UnaryPattern_3059,
					DsmlPackage.eINSTANCE.getUnaryPattern());

			elements.put(PatternTimer_3060,
					DsmlPackage.eINSTANCE.getPatternTimer());

			elements.put(RepeatPattern_3061,
					DsmlPackage.eINSTANCE.getRepeatPattern());

			elements.put(Target_3062, DsmlPackage.eINSTANCE.getTarget());

			elements.put(Not_3063, DsmlPackage.eINSTANCE.getNot());

			elements.put(UnaryPattern_3064,
					DsmlPackage.eINSTANCE.getUnaryPattern());

			elements.put(PatternTimer_3065,
					DsmlPackage.eINSTANCE.getPatternTimer());

			elements.put(RepeatPattern_3066,
					DsmlPackage.eINSTANCE.getRepeatPattern());

			elements.put(Aggregation_3067,
					DsmlPackage.eINSTANCE.getAggregation());

			elements.put(ConditionGroup_3068,
					DsmlPackage.eINSTANCE.getConditionGroup());

			elements.put(GroupbyCondition_3069,
					DsmlPackage.eINSTANCE.getGroupbyCondition());

			elements.put(BringGroup_3070, DsmlPackage.eINSTANCE.getBringGroup());

			elements.put(Operator_3071, DsmlPackage.eINSTANCE.getOperator());

			elements.put(ValueOperator_3072,
					DsmlPackage.eINSTANCE.getValueOperator());

			elements.put(Comparison_4001, DsmlPackage.eINSTANCE.getComparison());

			elements.put(Arithmetic_4002, DsmlPackage.eINSTANCE.getArithmetic());

			elements.put(LogicalConnector_4003,
					DsmlPackage.eINSTANCE.getLogicalConnector());

			elements.put(LinkTarget_4004, DsmlPackage.eINSTANCE.getLinkTarget());

			elements.put(LinkPatternTarget_4005,
					DsmlPackage.eINSTANCE.getLinkPatternTarget());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DrawingArea_1000);
			KNOWN_ELEMENT_TYPES.add(Rule_2001);
			KNOWN_ELEMENT_TYPES.add(Event_2002);
			KNOWN_ELEMENT_TYPES.add(EventPattern_2003);
			KNOWN_ELEMENT_TYPES.add(EventOutput_2004);
			KNOWN_ELEMENT_TYPES.add(Window_2005);
			KNOWN_ELEMENT_TYPES.add(TargetGroupby_2006);
			KNOWN_ELEMENT_TYPES.add(Target_3001);
			KNOWN_ELEMENT_TYPES.add(Target_3002);
			KNOWN_ELEMENT_TYPES.add(Not_3003);
			KNOWN_ELEMENT_TYPES.add(UnaryPattern_3004);
			KNOWN_ELEMENT_TYPES.add(PatternTimer_3005);
			KNOWN_ELEMENT_TYPES.add(RepeatPattern_3006);
			KNOWN_ELEMENT_TYPES.add(Aggregation_3007);
			KNOWN_ELEMENT_TYPES.add(ConditionGroup_3008);
			KNOWN_ELEMENT_TYPES.add(Target_3009);
			KNOWN_ELEMENT_TYPES.add(GroupbyCondition_3010);
			KNOWN_ELEMENT_TYPES.add(Target_3011);
			KNOWN_ELEMENT_TYPES.add(BringGroup_3012);
			KNOWN_ELEMENT_TYPES.add(Target_3013);
			KNOWN_ELEMENT_TYPES.add(Operator_3014);
			KNOWN_ELEMENT_TYPES.add(ValueOperator_3015);
			KNOWN_ELEMENT_TYPES.add(Not_3016);
			KNOWN_ELEMENT_TYPES.add(UnaryPattern_3017);
			KNOWN_ELEMENT_TYPES.add(PatternTimer_3018);
			KNOWN_ELEMENT_TYPES.add(RepeatPattern_3019);
			KNOWN_ELEMENT_TYPES.add(Aggregation_3020);
			KNOWN_ELEMENT_TYPES.add(ConditionGroup_3021);
			KNOWN_ELEMENT_TYPES.add(Not_3022);
			KNOWN_ELEMENT_TYPES.add(UnaryPattern_3023);
			KNOWN_ELEMENT_TYPES.add(PatternTimer_3024);
			KNOWN_ELEMENT_TYPES.add(RepeatPattern_3025);
			KNOWN_ELEMENT_TYPES.add(Aggregation_3026);
			KNOWN_ELEMENT_TYPES.add(ConditionGroup_3027);
			KNOWN_ELEMENT_TYPES.add(GroupbyCondition_3028);
			KNOWN_ELEMENT_TYPES.add(Not_3029);
			KNOWN_ELEMENT_TYPES.add(UnaryPattern_3030);
			KNOWN_ELEMENT_TYPES.add(PatternTimer_3031);
			KNOWN_ELEMENT_TYPES.add(RepeatPattern_3032);
			KNOWN_ELEMENT_TYPES.add(Aggregation_3033);
			KNOWN_ELEMENT_TYPES.add(ConditionGroup_3034);
			KNOWN_ELEMENT_TYPES.add(BringGroup_3035);
			KNOWN_ELEMENT_TYPES.add(GroupbyCondition_3036);
			KNOWN_ELEMENT_TYPES.add(GroupbyCondition_3037);
			KNOWN_ELEMENT_TYPES.add(BringGroup_3038);
			KNOWN_ELEMENT_TYPES.add(BringGroup_3039);
			KNOWN_ELEMENT_TYPES.add(Operator_3040);
			KNOWN_ELEMENT_TYPES.add(ValueOperator_3041);
			KNOWN_ELEMENT_TYPES.add(Operator_3042);
			KNOWN_ELEMENT_TYPES.add(ValueOperator_3043);
			KNOWN_ELEMENT_TYPES.add(Operator_3044);
			KNOWN_ELEMENT_TYPES.add(ValueOperator_3045);
			KNOWN_ELEMENT_TYPES.add(Not_3046);
			KNOWN_ELEMENT_TYPES.add(UnaryPattern_3047);
			KNOWN_ELEMENT_TYPES.add(PatternTimer_3048);
			KNOWN_ELEMENT_TYPES.add(RepeatPattern_3049);
			KNOWN_ELEMENT_TYPES.add(Aggregation_3050);
			KNOWN_ELEMENT_TYPES.add(ConditionGroup_3051);
			KNOWN_ELEMENT_TYPES.add(GroupbyCondition_3052);
			KNOWN_ELEMENT_TYPES.add(BringGroup_3053);
			KNOWN_ELEMENT_TYPES.add(Operator_3054);
			KNOWN_ELEMENT_TYPES.add(ValueOperator_3055);
			KNOWN_ELEMENT_TYPES.add(Attribute_3056);
			KNOWN_ELEMENT_TYPES.add(Target_3057);
			KNOWN_ELEMENT_TYPES.add(Not_3058);
			KNOWN_ELEMENT_TYPES.add(UnaryPattern_3059);
			KNOWN_ELEMENT_TYPES.add(PatternTimer_3060);
			KNOWN_ELEMENT_TYPES.add(RepeatPattern_3061);
			KNOWN_ELEMENT_TYPES.add(Target_3062);
			KNOWN_ELEMENT_TYPES.add(Not_3063);
			KNOWN_ELEMENT_TYPES.add(UnaryPattern_3064);
			KNOWN_ELEMENT_TYPES.add(PatternTimer_3065);
			KNOWN_ELEMENT_TYPES.add(RepeatPattern_3066);
			KNOWN_ELEMENT_TYPES.add(Aggregation_3067);
			KNOWN_ELEMENT_TYPES.add(ConditionGroup_3068);
			KNOWN_ELEMENT_TYPES.add(GroupbyCondition_3069);
			KNOWN_ELEMENT_TYPES.add(BringGroup_3070);
			KNOWN_ELEMENT_TYPES.add(Operator_3071);
			KNOWN_ELEMENT_TYPES.add(ValueOperator_3072);
			KNOWN_ELEMENT_TYPES.add(Comparison_4001);
			KNOWN_ELEMENT_TYPES.add(Arithmetic_4002);
			KNOWN_ELEMENT_TYPES.add(LogicalConnector_4003);
			KNOWN_ELEMENT_TYPES.add(LinkTarget_4004);
			KNOWN_ELEMENT_TYPES.add(LinkPatternTarget_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DrawingAreaEditPart.VISUAL_ID:
			return DrawingArea_1000;
		case RuleEditPart.VISUAL_ID:
			return Rule_2001;
		case EventEditPart.VISUAL_ID:
			return Event_2002;
		case EventPatternEditPart.VISUAL_ID:
			return EventPattern_2003;
		case EventOutputEditPart.VISUAL_ID:
			return EventOutput_2004;
		case WindowEditPart.VISUAL_ID:
			return Window_2005;
		case TargetGroupbyEditPart.VISUAL_ID:
			return TargetGroupby_2006;
		case TargetEditPart.VISUAL_ID:
			return Target_3001;
		case Target2EditPart.VISUAL_ID:
			return Target_3002;
		case NotEditPart.VISUAL_ID:
			return Not_3003;
		case UnaryPatternEditPart.VISUAL_ID:
			return UnaryPattern_3004;
		case PatternTimerEditPart.VISUAL_ID:
			return PatternTimer_3005;
		case RepeatPatternEditPart.VISUAL_ID:
			return RepeatPattern_3006;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_3007;
		case ConditionGroupEditPart.VISUAL_ID:
			return ConditionGroup_3008;
		case Target3EditPart.VISUAL_ID:
			return Target_3009;
		case GroupbyConditionEditPart.VISUAL_ID:
			return GroupbyCondition_3010;
		case Target4EditPart.VISUAL_ID:
			return Target_3011;
		case BringGroupEditPart.VISUAL_ID:
			return BringGroup_3012;
		case Target5EditPart.VISUAL_ID:
			return Target_3013;
		case OperatorEditPart.VISUAL_ID:
			return Operator_3014;
		case ValueOperatorEditPart.VISUAL_ID:
			return ValueOperator_3015;
		case Not2EditPart.VISUAL_ID:
			return Not_3016;
		case UnaryPattern2EditPart.VISUAL_ID:
			return UnaryPattern_3017;
		case PatternTimer2EditPart.VISUAL_ID:
			return PatternTimer_3018;
		case RepeatPattern2EditPart.VISUAL_ID:
			return RepeatPattern_3019;
		case Aggregation2EditPart.VISUAL_ID:
			return Aggregation_3020;
		case ConditionGroup2EditPart.VISUAL_ID:
			return ConditionGroup_3021;
		case Not3EditPart.VISUAL_ID:
			return Not_3022;
		case UnaryPattern3EditPart.VISUAL_ID:
			return UnaryPattern_3023;
		case PatternTimer3EditPart.VISUAL_ID:
			return PatternTimer_3024;
		case RepeatPattern3EditPart.VISUAL_ID:
			return RepeatPattern_3025;
		case Aggregation3EditPart.VISUAL_ID:
			return Aggregation_3026;
		case ConditionGroup3EditPart.VISUAL_ID:
			return ConditionGroup_3027;
		case GroupbyCondition2EditPart.VISUAL_ID:
			return GroupbyCondition_3028;
		case Not4EditPart.VISUAL_ID:
			return Not_3029;
		case UnaryPattern4EditPart.VISUAL_ID:
			return UnaryPattern_3030;
		case PatternTimer4EditPart.VISUAL_ID:
			return PatternTimer_3031;
		case RepeatPattern4EditPart.VISUAL_ID:
			return RepeatPattern_3032;
		case Aggregation4EditPart.VISUAL_ID:
			return Aggregation_3033;
		case ConditionGroup4EditPart.VISUAL_ID:
			return ConditionGroup_3034;
		case BringGroup2EditPart.VISUAL_ID:
			return BringGroup_3035;
		case GroupbyCondition3EditPart.VISUAL_ID:
			return GroupbyCondition_3036;
		case GroupbyCondition4EditPart.VISUAL_ID:
			return GroupbyCondition_3037;
		case BringGroup3EditPart.VISUAL_ID:
			return BringGroup_3038;
		case BringGroup4EditPart.VISUAL_ID:
			return BringGroup_3039;
		case Operator2EditPart.VISUAL_ID:
			return Operator_3040;
		case ValueOperator2EditPart.VISUAL_ID:
			return ValueOperator_3041;
		case Operator3EditPart.VISUAL_ID:
			return Operator_3042;
		case ValueOperator3EditPart.VISUAL_ID:
			return ValueOperator_3043;
		case Operator4EditPart.VISUAL_ID:
			return Operator_3044;
		case ValueOperator4EditPart.VISUAL_ID:
			return ValueOperator_3045;
		case Not5EditPart.VISUAL_ID:
			return Not_3046;
		case UnaryPattern5EditPart.VISUAL_ID:
			return UnaryPattern_3047;
		case PatternTimer5EditPart.VISUAL_ID:
			return PatternTimer_3048;
		case RepeatPattern5EditPart.VISUAL_ID:
			return RepeatPattern_3049;
		case Aggregation5EditPart.VISUAL_ID:
			return Aggregation_3050;
		case ConditionGroup5EditPart.VISUAL_ID:
			return ConditionGroup_3051;
		case GroupbyCondition5EditPart.VISUAL_ID:
			return GroupbyCondition_3052;
		case BringGroup5EditPart.VISUAL_ID:
			return BringGroup_3053;
		case Operator5EditPart.VISUAL_ID:
			return Operator_3054;
		case ValueOperator5EditPart.VISUAL_ID:
			return ValueOperator_3055;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3056;
		case Target6EditPart.VISUAL_ID:
			return Target_3057;
		case Not6EditPart.VISUAL_ID:
			return Not_3058;
		case UnaryPattern6EditPart.VISUAL_ID:
			return UnaryPattern_3059;
		case PatternTimer6EditPart.VISUAL_ID:
			return PatternTimer_3060;
		case RepeatPattern6EditPart.VISUAL_ID:
			return RepeatPattern_3061;
		case Target7EditPart.VISUAL_ID:
			return Target_3062;
		case Not7EditPart.VISUAL_ID:
			return Not_3063;
		case UnaryPattern7EditPart.VISUAL_ID:
			return UnaryPattern_3064;
		case PatternTimer7EditPart.VISUAL_ID:
			return PatternTimer_3065;
		case RepeatPattern7EditPart.VISUAL_ID:
			return RepeatPattern_3066;
		case Aggregation6EditPart.VISUAL_ID:
			return Aggregation_3067;
		case ConditionGroup6EditPart.VISUAL_ID:
			return ConditionGroup_3068;
		case GroupbyCondition6EditPart.VISUAL_ID:
			return GroupbyCondition_3069;
		case BringGroup6EditPart.VISUAL_ID:
			return BringGroup_3070;
		case Operator6EditPart.VISUAL_ID:
			return Operator_3071;
		case ValueOperator6EditPart.VISUAL_ID:
			return ValueOperator_3072;
		case ComparisonEditPart.VISUAL_ID:
			return Comparison_4001;
		case ArithmeticEditPart.VISUAL_ID:
			return Arithmetic_4002;
		case LogicalConnectorEditPart.VISUAL_ID:
			return LogicalConnector_4003;
		case LinkTargetEditPart.VISUAL_ID:
			return LinkTarget_4004;
		case LinkPatternTargetEditPart.VISUAL_ID:
			return LinkPatternTarget_4005;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return dsml.diagram.providers.DsmlElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return dsml.diagram.providers.DsmlElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return dsml.diagram.providers.DsmlElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
