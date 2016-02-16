/*
 * 
 */
package dsml.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import dsml.diagram.part.DsmlVisualIDRegistry;

/**
 * @generated
 */
public class DsmlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DsmlVisualIDRegistry.getVisualID(view)) {

			case DrawingAreaEditPart.VISUAL_ID:
				return new DrawingAreaEditPart(view);

			case RuleEditPart.VISUAL_ID:
				return new RuleEditPart(view);

			case RuleRuleNameEditPart.VISUAL_ID:
				return new RuleRuleNameEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case EventEventNameEditPart.VISUAL_ID:
				return new EventEventNameEditPart(view);

			case EventPatternEditPart.VISUAL_ID:
				return new EventPatternEditPart(view);

			case EventPatternEventPatternEditPart.VISUAL_ID:
				return new EventPatternEventPatternEditPart(view);

			case EventOutputEditPart.VISUAL_ID:
				return new EventOutputEditPart(view);

			case EventOutputOutputNameEditPart.VISUAL_ID:
				return new EventOutputOutputNameEditPart(view);

			case WindowEditPart.VISUAL_ID:
				return new WindowEditPart(view);

			case WindowWindowEditPart.VISUAL_ID:
				return new WindowWindowEditPart(view);

			case TargetGroupbyEditPart.VISUAL_ID:
				return new TargetGroupbyEditPart(view);

			case TargetGroupbyTargetGroupbyEditPart.VISUAL_ID:
				return new TargetGroupbyTargetGroupbyEditPart(view);

			case TargetEditPart.VISUAL_ID:
				return new TargetEditPart(view);

			case TargetTargetAliasEditPart.VISUAL_ID:
				return new TargetTargetAliasEditPart(view);

			case Target2EditPart.VISUAL_ID:
				return new Target2EditPart(view);

			case TargetTargetAlias2EditPart.VISUAL_ID:
				return new TargetTargetAlias2EditPart(view);

			case NotEditPart.VISUAL_ID:
				return new NotEditPart(view);

			case NotDescriptionEditPart.VISUAL_ID:
				return new NotDescriptionEditPart(view);

			case UnaryPatternEditPart.VISUAL_ID:
				return new UnaryPatternEditPart(view);

			case UnaryPatternNameEditPart.VISUAL_ID:
				return new UnaryPatternNameEditPart(view);

			case PatternTimerEditPart.VISUAL_ID:
				return new PatternTimerEditPart(view);

			case PatternTimerPatternTimerEditPart.VISUAL_ID:
				return new PatternTimerPatternTimerEditPart(view);

			case RepeatPatternEditPart.VISUAL_ID:
				return new RepeatPatternEditPart(view);

			case RepeatPatternRepeatPatternEditPart.VISUAL_ID:
				return new RepeatPatternRepeatPatternEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case AggregationTypeAggregationEditPart.VISUAL_ID:
				return new AggregationTypeAggregationEditPart(view);

			case ConditionGroupEditPart.VISUAL_ID:
				return new ConditionGroupEditPart(view);

			case ConditionGroupConditionGroupEditPart.VISUAL_ID:
				return new ConditionGroupConditionGroupEditPart(view);

			case Target3EditPart.VISUAL_ID:
				return new Target3EditPart(view);

			case TargetTargetAlias3EditPart.VISUAL_ID:
				return new TargetTargetAlias3EditPart(view);

			case GroupbyConditionEditPart.VISUAL_ID:
				return new GroupbyConditionEditPart(view);

			case GroupbyConditionGroupbyConditionEditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyConditionEditPart(view);

			case Target4EditPart.VISUAL_ID:
				return new Target4EditPart(view);

			case TargetTargetAlias4EditPart.VISUAL_ID:
				return new TargetTargetAlias4EditPart(view);

			case BringGroupEditPart.VISUAL_ID:
				return new BringGroupEditPart(view);

			case BringGroupBringGroupEditPart.VISUAL_ID:
				return new BringGroupBringGroupEditPart(view);

			case Target5EditPart.VISUAL_ID:
				return new Target5EditPart(view);

			case TargetTargetAlias5EditPart.VISUAL_ID:
				return new TargetTargetAlias5EditPart(view);

			case OperatorEditPart.VISUAL_ID:
				return new OperatorEditPart(view);

			case OperatorOperatorEditPart.VISUAL_ID:
				return new OperatorOperatorEditPart(view);

			case ValueOperatorEditPart.VISUAL_ID:
				return new ValueOperatorEditPart(view);

			case ValueOperatorValueOperatorEditPart.VISUAL_ID:
				return new ValueOperatorValueOperatorEditPart(view);

			case Not2EditPart.VISUAL_ID:
				return new Not2EditPart(view);

			case NotDescription2EditPart.VISUAL_ID:
				return new NotDescription2EditPart(view);

			case UnaryPattern2EditPart.VISUAL_ID:
				return new UnaryPattern2EditPart(view);

			case UnaryPatternName2EditPart.VISUAL_ID:
				return new UnaryPatternName2EditPart(view);

			case PatternTimer2EditPart.VISUAL_ID:
				return new PatternTimer2EditPart(view);

			case PatternTimerPatternTimer2EditPart.VISUAL_ID:
				return new PatternTimerPatternTimer2EditPart(view);

			case RepeatPattern2EditPart.VISUAL_ID:
				return new RepeatPattern2EditPart(view);

			case RepeatPatternRepeatPattern2EditPart.VISUAL_ID:
				return new RepeatPatternRepeatPattern2EditPart(view);

			case Aggregation2EditPart.VISUAL_ID:
				return new Aggregation2EditPart(view);

			case AggregationTypeAggregation2EditPart.VISUAL_ID:
				return new AggregationTypeAggregation2EditPart(view);

			case ConditionGroup2EditPart.VISUAL_ID:
				return new ConditionGroup2EditPart(view);

			case ConditionGroupConditionGroup2EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroup2EditPart(view);

			case Not3EditPart.VISUAL_ID:
				return new Not3EditPart(view);

			case NotDescription3EditPart.VISUAL_ID:
				return new NotDescription3EditPart(view);

			case UnaryPattern3EditPart.VISUAL_ID:
				return new UnaryPattern3EditPart(view);

			case UnaryPatternName3EditPart.VISUAL_ID:
				return new UnaryPatternName3EditPart(view);

			case PatternTimer3EditPart.VISUAL_ID:
				return new PatternTimer3EditPart(view);

			case PatternTimerPatternTimer3EditPart.VISUAL_ID:
				return new PatternTimerPatternTimer3EditPart(view);

			case RepeatPattern3EditPart.VISUAL_ID:
				return new RepeatPattern3EditPart(view);

			case RepeatPatternRepeatPattern3EditPart.VISUAL_ID:
				return new RepeatPatternRepeatPattern3EditPart(view);

			case Aggregation3EditPart.VISUAL_ID:
				return new Aggregation3EditPart(view);

			case AggregationTypeAggregation3EditPart.VISUAL_ID:
				return new AggregationTypeAggregation3EditPart(view);

			case ConditionGroup3EditPart.VISUAL_ID:
				return new ConditionGroup3EditPart(view);

			case ConditionGroupConditionGroup3EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroup3EditPart(view);

			case GroupbyCondition2EditPart.VISUAL_ID:
				return new GroupbyCondition2EditPart(view);

			case GroupbyConditionGroupbyCondition2EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyCondition2EditPart(view);

			case Not4EditPart.VISUAL_ID:
				return new Not4EditPart(view);

			case NotDescription4EditPart.VISUAL_ID:
				return new NotDescription4EditPart(view);

			case UnaryPattern4EditPart.VISUAL_ID:
				return new UnaryPattern4EditPart(view);

			case UnaryPatternName4EditPart.VISUAL_ID:
				return new UnaryPatternName4EditPart(view);

			case PatternTimer4EditPart.VISUAL_ID:
				return new PatternTimer4EditPart(view);

			case PatternTimerPatternTimer4EditPart.VISUAL_ID:
				return new PatternTimerPatternTimer4EditPart(view);

			case RepeatPattern4EditPart.VISUAL_ID:
				return new RepeatPattern4EditPart(view);

			case RepeatPatternRepeatPattern4EditPart.VISUAL_ID:
				return new RepeatPatternRepeatPattern4EditPart(view);

			case Aggregation4EditPart.VISUAL_ID:
				return new Aggregation4EditPart(view);

			case AggregationTypeAggregation4EditPart.VISUAL_ID:
				return new AggregationTypeAggregation4EditPart(view);

			case ConditionGroup4EditPart.VISUAL_ID:
				return new ConditionGroup4EditPart(view);

			case ConditionGroupConditionGroup4EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroup4EditPart(view);

			case BringGroup2EditPart.VISUAL_ID:
				return new BringGroup2EditPart(view);

			case BringGroupBringGroup2EditPart.VISUAL_ID:
				return new BringGroupBringGroup2EditPart(view);

			case GroupbyCondition3EditPart.VISUAL_ID:
				return new GroupbyCondition3EditPart(view);

			case GroupbyConditionGroupbyCondition3EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyCondition3EditPart(view);

			case GroupbyCondition4EditPart.VISUAL_ID:
				return new GroupbyCondition4EditPart(view);

			case GroupbyConditionGroupbyCondition4EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyCondition4EditPart(view);

			case BringGroup3EditPart.VISUAL_ID:
				return new BringGroup3EditPart(view);

			case BringGroupBringGroup3EditPart.VISUAL_ID:
				return new BringGroupBringGroup3EditPart(view);

			case BringGroup4EditPart.VISUAL_ID:
				return new BringGroup4EditPart(view);

			case BringGroupBringGroup4EditPart.VISUAL_ID:
				return new BringGroupBringGroup4EditPart(view);

			case Operator2EditPart.VISUAL_ID:
				return new Operator2EditPart(view);

			case OperatorOperator2EditPart.VISUAL_ID:
				return new OperatorOperator2EditPart(view);

			case ValueOperator2EditPart.VISUAL_ID:
				return new ValueOperator2EditPart(view);

			case ValueOperatorValueOperator2EditPart.VISUAL_ID:
				return new ValueOperatorValueOperator2EditPart(view);

			case Operator3EditPart.VISUAL_ID:
				return new Operator3EditPart(view);

			case OperatorOperator3EditPart.VISUAL_ID:
				return new OperatorOperator3EditPart(view);

			case ValueOperator3EditPart.VISUAL_ID:
				return new ValueOperator3EditPart(view);

			case ValueOperatorValueOperator3EditPart.VISUAL_ID:
				return new ValueOperatorValueOperator3EditPart(view);

			case Operator4EditPart.VISUAL_ID:
				return new Operator4EditPart(view);

			case OperatorOperator4EditPart.VISUAL_ID:
				return new OperatorOperator4EditPart(view);

			case ValueOperator4EditPart.VISUAL_ID:
				return new ValueOperator4EditPart(view);

			case ValueOperatorValueOperator4EditPart.VISUAL_ID:
				return new ValueOperatorValueOperator4EditPart(view);

			case Not5EditPart.VISUAL_ID:
				return new Not5EditPart(view);

			case NotDescription5EditPart.VISUAL_ID:
				return new NotDescription5EditPart(view);

			case UnaryPattern5EditPart.VISUAL_ID:
				return new UnaryPattern5EditPart(view);

			case UnaryPatternName5EditPart.VISUAL_ID:
				return new UnaryPatternName5EditPart(view);

			case PatternTimer5EditPart.VISUAL_ID:
				return new PatternTimer5EditPart(view);

			case PatternTimerPatternTimer5EditPart.VISUAL_ID:
				return new PatternTimerPatternTimer5EditPart(view);

			case RepeatPattern5EditPart.VISUAL_ID:
				return new RepeatPattern5EditPart(view);

			case RepeatPatternRepeatPattern5EditPart.VISUAL_ID:
				return new RepeatPatternRepeatPattern5EditPart(view);

			case Aggregation5EditPart.VISUAL_ID:
				return new Aggregation5EditPart(view);

			case AggregationTypeAggregation5EditPart.VISUAL_ID:
				return new AggregationTypeAggregation5EditPart(view);

			case ConditionGroup5EditPart.VISUAL_ID:
				return new ConditionGroup5EditPart(view);

			case ConditionGroupConditionGroup5EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroup5EditPart(view);

			case GroupbyCondition5EditPart.VISUAL_ID:
				return new GroupbyCondition5EditPart(view);

			case GroupbyConditionGroupbyCondition5EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyCondition5EditPart(view);

			case BringGroup5EditPart.VISUAL_ID:
				return new BringGroup5EditPart(view);

			case BringGroupBringGroup5EditPart.VISUAL_ID:
				return new BringGroupBringGroup5EditPart(view);

			case Operator5EditPart.VISUAL_ID:
				return new Operator5EditPart(view);

			case OperatorOperator5EditPart.VISUAL_ID:
				return new OperatorOperator5EditPart(view);

			case ValueOperator5EditPart.VISUAL_ID:
				return new ValueOperator5EditPart(view);

			case ValueOperatorValueOperator5EditPart.VISUAL_ID:
				return new ValueOperatorValueOperator5EditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameTypeEditPart.VISUAL_ID:
				return new AttributeNameTypeEditPart(view);

			case Target6EditPart.VISUAL_ID:
				return new Target6EditPart(view);

			case TargetTargetAlias6EditPart.VISUAL_ID:
				return new TargetTargetAlias6EditPart(view);

			case Not6EditPart.VISUAL_ID:
				return new Not6EditPart(view);

			case NotDescription6EditPart.VISUAL_ID:
				return new NotDescription6EditPart(view);

			case UnaryPattern6EditPart.VISUAL_ID:
				return new UnaryPattern6EditPart(view);

			case UnaryPatternName6EditPart.VISUAL_ID:
				return new UnaryPatternName6EditPart(view);

			case PatternTimer6EditPart.VISUAL_ID:
				return new PatternTimer6EditPart(view);

			case PatternTimerPatternTimer6EditPart.VISUAL_ID:
				return new PatternTimerPatternTimer6EditPart(view);

			case RepeatPattern6EditPart.VISUAL_ID:
				return new RepeatPattern6EditPart(view);

			case RepeatPatternRepeatPattern6EditPart.VISUAL_ID:
				return new RepeatPatternRepeatPattern6EditPart(view);

			case Target7EditPart.VISUAL_ID:
				return new Target7EditPart(view);

			case TargetTargetAlias7EditPart.VISUAL_ID:
				return new TargetTargetAlias7EditPart(view);

			case Not7EditPart.VISUAL_ID:
				return new Not7EditPart(view);

			case NotDescription7EditPart.VISUAL_ID:
				return new NotDescription7EditPart(view);

			case UnaryPattern7EditPart.VISUAL_ID:
				return new UnaryPattern7EditPart(view);

			case UnaryPatternName7EditPart.VISUAL_ID:
				return new UnaryPatternName7EditPart(view);

			case PatternTimer7EditPart.VISUAL_ID:
				return new PatternTimer7EditPart(view);

			case PatternTimerPatternTimer7EditPart.VISUAL_ID:
				return new PatternTimerPatternTimer7EditPart(view);

			case RepeatPattern7EditPart.VISUAL_ID:
				return new RepeatPattern7EditPart(view);

			case RepeatPatternRepeatPattern7EditPart.VISUAL_ID:
				return new RepeatPatternRepeatPattern7EditPart(view);

			case Aggregation6EditPart.VISUAL_ID:
				return new Aggregation6EditPart(view);

			case AggregationTypeAggregation6EditPart.VISUAL_ID:
				return new AggregationTypeAggregation6EditPart(view);

			case ConditionGroup6EditPart.VISUAL_ID:
				return new ConditionGroup6EditPart(view);

			case ConditionGroupConditionGroup6EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroup6EditPart(view);

			case GroupbyCondition6EditPart.VISUAL_ID:
				return new GroupbyCondition6EditPart(view);

			case GroupbyConditionGroupbyCondition6EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyCondition6EditPart(view);

			case BringGroup6EditPart.VISUAL_ID:
				return new BringGroup6EditPart(view);

			case BringGroupBringGroup6EditPart.VISUAL_ID:
				return new BringGroupBringGroup6EditPart(view);

			case Operator6EditPart.VISUAL_ID:
				return new Operator6EditPart(view);

			case OperatorOperator6EditPart.VISUAL_ID:
				return new OperatorOperator6EditPart(view);

			case ValueOperator6EditPart.VISUAL_ID:
				return new ValueOperator6EditPart(view);

			case ValueOperatorValueOperator6EditPart.VISUAL_ID:
				return new ValueOperatorValueOperator6EditPart(view);

			case RuleRuleQueriesCompartmentEditPart.VISUAL_ID:
				return new RuleRuleQueriesCompartmentEditPart(view);

			case TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID:
				return new TargetTargetOperationTypesCompartmentEditPart(view);

			case TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID:
				return new TargetTargetOperationTypesCompartment2EditPart(view);

			case ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID:
				return new ConditionGroupConditionGroupOperationTypesCompartmentEditPart(
						view);

			case TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID:
				return new TargetTargetOperationTypesCompartment3EditPart(view);

			case GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart(
						view);

			case TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID:
				return new TargetTargetOperationTypesCompartment4EditPart(view);

			case BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID:
				return new BringGroupBringGroupOperationTypesCompartmentEditPart(
						view);

			case TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID:
				return new TargetTargetOperationTypesCompartment5EditPart(view);

			case ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroupOperationTypesCompartment2EditPart(
						view);

			case ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroupOperationTypesCompartment3EditPart(
						view);

			case GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart(
						view);

			case ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroupOperationTypesCompartment4EditPart(
						view);

			case BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID:
				return new BringGroupBringGroupOperationTypesCompartment2EditPart(
						view);

			case GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart(
						view);

			case GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart(
						view);

			case BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID:
				return new BringGroupBringGroupOperationTypesCompartment3EditPart(
						view);

			case BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID:
				return new BringGroupBringGroupOperationTypesCompartment4EditPart(
						view);

			case ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroupOperationTypesCompartment5EditPart(
						view);

			case GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart(
						view);

			case BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID:
				return new BringGroupBringGroupOperationTypesCompartment5EditPart(
						view);

			case EventEventAttributesCompartmentEditPart.VISUAL_ID:
				return new EventEventAttributesCompartmentEditPart(view);

			case EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID:
				return new EventPatternEventPatternNodeCompartmentEditPart(view);

			case TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID:
				return new TargetTargetOperationTypesCompartment6EditPart(view);

			case EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID:
				return new EventOutputEventOutputQueriesCompartmentEditPart(
						view);

			case TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID:
				return new TargetTargetOperationTypesCompartment7EditPart(view);

			case ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID:
				return new ConditionGroupConditionGroupOperationTypesCompartment6EditPart(
						view);

			case GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID:
				return new GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart(
						view);

			case BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID:
				return new BringGroupBringGroupOperationTypesCompartment6EditPart(
						view);

			case ComparisonEditPart.VISUAL_ID:
				return new ComparisonEditPart(view);

			case ComparisonComparisonEditPart.VISUAL_ID:
				return new ComparisonComparisonEditPart(view);

			case ArithmeticEditPart.VISUAL_ID:
				return new ArithmeticEditPart(view);

			case ArithmeticArithmeticEditPart.VISUAL_ID:
				return new ArithmeticArithmeticEditPart(view);

			case LogicalConnectorEditPart.VISUAL_ID:
				return new LogicalConnectorEditPart(view);

			case LogicalConnectorTypeLogicalEditPart.VISUAL_ID:
				return new LogicalConnectorTypeLogicalEditPart(view);

			case LinkTargetEditPart.VISUAL_ID:
				return new LinkTargetEditPart(view);

			case LinkPatternTargetEditPart.VISUAL_ID:
				return new LinkPatternTargetEditPart(view);

			case LinkPatternTargetComparisonTargetEditPart.VISUAL_ID:
				return new LinkPatternTargetComparisonTargetEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
