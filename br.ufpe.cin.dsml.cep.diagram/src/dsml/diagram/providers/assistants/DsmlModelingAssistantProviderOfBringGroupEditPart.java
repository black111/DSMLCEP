/*
 * 
 */
package dsml.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dsml.diagram.edit.parts.Aggregation2EditPart;
import dsml.diagram.edit.parts.Aggregation3EditPart;
import dsml.diagram.edit.parts.Aggregation4EditPart;
import dsml.diagram.edit.parts.Aggregation5EditPart;
import dsml.diagram.edit.parts.Aggregation6EditPart;
import dsml.diagram.edit.parts.AggregationEditPart;
import dsml.diagram.edit.parts.BringGroup2EditPart;
import dsml.diagram.edit.parts.BringGroup3EditPart;
import dsml.diagram.edit.parts.BringGroup4EditPart;
import dsml.diagram.edit.parts.BringGroup5EditPart;
import dsml.diagram.edit.parts.BringGroup6EditPart;
import dsml.diagram.edit.parts.BringGroupEditPart;
import dsml.diagram.edit.parts.ConditionGroup2EditPart;
import dsml.diagram.edit.parts.ConditionGroup3EditPart;
import dsml.diagram.edit.parts.ConditionGroup4EditPart;
import dsml.diagram.edit.parts.ConditionGroup5EditPart;
import dsml.diagram.edit.parts.ConditionGroup6EditPart;
import dsml.diagram.edit.parts.ConditionGroupEditPart;
import dsml.diagram.edit.parts.GroupbyCondition2EditPart;
import dsml.diagram.edit.parts.GroupbyCondition3EditPart;
import dsml.diagram.edit.parts.GroupbyCondition4EditPart;
import dsml.diagram.edit.parts.GroupbyCondition5EditPart;
import dsml.diagram.edit.parts.GroupbyCondition6EditPart;
import dsml.diagram.edit.parts.GroupbyConditionEditPart;
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
import dsml.diagram.edit.parts.Target2EditPart;
import dsml.diagram.edit.parts.Target3EditPart;
import dsml.diagram.edit.parts.Target4EditPart;
import dsml.diagram.edit.parts.Target5EditPart;
import dsml.diagram.edit.parts.Target6EditPart;
import dsml.diagram.edit.parts.Target7EditPart;
import dsml.diagram.edit.parts.TargetEditPart;
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
import dsml.diagram.providers.DsmlElementTypes;
import dsml.diagram.providers.DsmlModelingAssistantProvider;

/**
 * @generated
 */
public class DsmlModelingAssistantProviderOfBringGroupEditPart extends
		DsmlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((BringGroupEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(BringGroupEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DsmlElementTypes.Comparison_4001);
		types.add(DsmlElementTypes.Arithmetic_4002);
		types.add(DsmlElementTypes.LogicalConnector_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(BringGroupEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			BringGroupEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TargetEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Target2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof NotEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof UnaryPatternEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof PatternTimerEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof RepeatPatternEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof AggregationEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ConditionGroupEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Target3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof GroupbyConditionEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Target4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof BringGroupEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Target5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof OperatorEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ValueOperatorEditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Not2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof UnaryPattern2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof PatternTimer2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof RepeatPattern2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Aggregation2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ConditionGroup2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Not3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof UnaryPattern3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof PatternTimer3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof RepeatPattern3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Aggregation3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ConditionGroup3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof GroupbyCondition2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Not4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof UnaryPattern4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof PatternTimer4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof RepeatPattern4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Aggregation4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ConditionGroup4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof BringGroup2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof GroupbyCondition3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof GroupbyCondition4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof BringGroup3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof BringGroup4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Operator2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ValueOperator2EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Operator3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ValueOperator3EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Operator4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ValueOperator4EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Not5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof UnaryPattern5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof PatternTimer5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof RepeatPattern5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Aggregation5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ConditionGroup5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof GroupbyCondition5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof BringGroup5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Operator5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ValueOperator5EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Target6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Not6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof UnaryPattern6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof PatternTimer6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof RepeatPattern6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Target7EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Not7EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof UnaryPattern7EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof PatternTimer7EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof RepeatPattern7EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Aggregation6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ConditionGroup6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof GroupbyCondition6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof BringGroup6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof Operator6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof ValueOperator6EditPart) {
			types.add(DsmlElementTypes.Comparison_4001);
		}
		if (targetEditPart instanceof TargetEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Target2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof NotEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof UnaryPatternEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof PatternTimerEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof RepeatPatternEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof AggregationEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ConditionGroupEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Target3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof GroupbyConditionEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Target4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof BringGroupEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Target5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof OperatorEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ValueOperatorEditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Not2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof UnaryPattern2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof PatternTimer2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof RepeatPattern2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Aggregation2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ConditionGroup2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Not3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof UnaryPattern3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof PatternTimer3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof RepeatPattern3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Aggregation3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ConditionGroup3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof GroupbyCondition2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Not4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof UnaryPattern4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof PatternTimer4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof RepeatPattern4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Aggregation4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ConditionGroup4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof BringGroup2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof GroupbyCondition3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof GroupbyCondition4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof BringGroup3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof BringGroup4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Operator2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ValueOperator2EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Operator3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ValueOperator3EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Operator4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ValueOperator4EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Not5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof UnaryPattern5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof PatternTimer5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof RepeatPattern5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Aggregation5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ConditionGroup5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof GroupbyCondition5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof BringGroup5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Operator5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ValueOperator5EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Target6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Not6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof UnaryPattern6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof PatternTimer6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof RepeatPattern6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Target7EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Not7EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof UnaryPattern7EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof PatternTimer7EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof RepeatPattern7EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Aggregation6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ConditionGroup6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof GroupbyCondition6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof BringGroup6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof Operator6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof ValueOperator6EditPart) {
			types.add(DsmlElementTypes.Arithmetic_4002);
		}
		if (targetEditPart instanceof TargetEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Target2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof NotEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof UnaryPatternEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof PatternTimerEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof RepeatPatternEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof AggregationEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ConditionGroupEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Target3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof GroupbyConditionEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Target4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof BringGroupEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Target5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof OperatorEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ValueOperatorEditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Not2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof UnaryPattern2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof PatternTimer2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof RepeatPattern2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Aggregation2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ConditionGroup2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Not3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof UnaryPattern3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof PatternTimer3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof RepeatPattern3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Aggregation3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ConditionGroup3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof GroupbyCondition2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Not4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof UnaryPattern4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof PatternTimer4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof RepeatPattern4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Aggregation4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ConditionGroup4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof BringGroup2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof GroupbyCondition3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof GroupbyCondition4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof BringGroup3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof BringGroup4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Operator2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ValueOperator2EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Operator3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ValueOperator3EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Operator4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ValueOperator4EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Not5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof UnaryPattern5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof PatternTimer5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof RepeatPattern5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Aggregation5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ConditionGroup5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof GroupbyCondition5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof BringGroup5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Operator5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ValueOperator5EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Target6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Not6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof UnaryPattern6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof PatternTimer6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof RepeatPattern6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Target7EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Not7EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof UnaryPattern7EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof PatternTimer7EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof RepeatPattern7EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Aggregation6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ConditionGroup6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof GroupbyCondition6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof BringGroup6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof Operator6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		if (targetEditPart instanceof ValueOperator6EditPart) {
			types.add(DsmlElementTypes.LogicalConnector_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((BringGroupEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(BringGroupEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsmlElementTypes.Comparison_4001) {
			types.add(DsmlElementTypes.Target_3001);
			types.add(DsmlElementTypes.Target_3002);
			types.add(DsmlElementTypes.Not_3003);
			types.add(DsmlElementTypes.UnaryPattern_3004);
			types.add(DsmlElementTypes.PatternTimer_3005);
			types.add(DsmlElementTypes.RepeatPattern_3006);
			types.add(DsmlElementTypes.Aggregation_3007);
			types.add(DsmlElementTypes.ConditionGroup_3008);
			types.add(DsmlElementTypes.Target_3009);
			types.add(DsmlElementTypes.GroupbyCondition_3010);
			types.add(DsmlElementTypes.Target_3011);
			types.add(DsmlElementTypes.BringGroup_3012);
			types.add(DsmlElementTypes.Target_3013);
			types.add(DsmlElementTypes.Operator_3014);
			types.add(DsmlElementTypes.ValueOperator_3015);
			types.add(DsmlElementTypes.Not_3016);
			types.add(DsmlElementTypes.UnaryPattern_3017);
			types.add(DsmlElementTypes.PatternTimer_3018);
			types.add(DsmlElementTypes.RepeatPattern_3019);
			types.add(DsmlElementTypes.Aggregation_3020);
			types.add(DsmlElementTypes.ConditionGroup_3021);
			types.add(DsmlElementTypes.Not_3022);
			types.add(DsmlElementTypes.UnaryPattern_3023);
			types.add(DsmlElementTypes.PatternTimer_3024);
			types.add(DsmlElementTypes.RepeatPattern_3025);
			types.add(DsmlElementTypes.Aggregation_3026);
			types.add(DsmlElementTypes.ConditionGroup_3027);
			types.add(DsmlElementTypes.GroupbyCondition_3028);
			types.add(DsmlElementTypes.Not_3029);
			types.add(DsmlElementTypes.UnaryPattern_3030);
			types.add(DsmlElementTypes.PatternTimer_3031);
			types.add(DsmlElementTypes.RepeatPattern_3032);
			types.add(DsmlElementTypes.Aggregation_3033);
			types.add(DsmlElementTypes.ConditionGroup_3034);
			types.add(DsmlElementTypes.BringGroup_3035);
			types.add(DsmlElementTypes.GroupbyCondition_3036);
			types.add(DsmlElementTypes.GroupbyCondition_3037);
			types.add(DsmlElementTypes.BringGroup_3038);
			types.add(DsmlElementTypes.BringGroup_3039);
			types.add(DsmlElementTypes.Operator_3040);
			types.add(DsmlElementTypes.ValueOperator_3041);
			types.add(DsmlElementTypes.Operator_3042);
			types.add(DsmlElementTypes.ValueOperator_3043);
			types.add(DsmlElementTypes.Operator_3044);
			types.add(DsmlElementTypes.ValueOperator_3045);
			types.add(DsmlElementTypes.Not_3046);
			types.add(DsmlElementTypes.UnaryPattern_3047);
			types.add(DsmlElementTypes.PatternTimer_3048);
			types.add(DsmlElementTypes.RepeatPattern_3049);
			types.add(DsmlElementTypes.Aggregation_3050);
			types.add(DsmlElementTypes.ConditionGroup_3051);
			types.add(DsmlElementTypes.GroupbyCondition_3052);
			types.add(DsmlElementTypes.BringGroup_3053);
			types.add(DsmlElementTypes.Operator_3054);
			types.add(DsmlElementTypes.ValueOperator_3055);
			types.add(DsmlElementTypes.Target_3057);
			types.add(DsmlElementTypes.Not_3058);
			types.add(DsmlElementTypes.UnaryPattern_3059);
			types.add(DsmlElementTypes.PatternTimer_3060);
			types.add(DsmlElementTypes.RepeatPattern_3061);
			types.add(DsmlElementTypes.Target_3062);
			types.add(DsmlElementTypes.Not_3063);
			types.add(DsmlElementTypes.UnaryPattern_3064);
			types.add(DsmlElementTypes.PatternTimer_3065);
			types.add(DsmlElementTypes.RepeatPattern_3066);
			types.add(DsmlElementTypes.Aggregation_3067);
			types.add(DsmlElementTypes.ConditionGroup_3068);
			types.add(DsmlElementTypes.GroupbyCondition_3069);
			types.add(DsmlElementTypes.BringGroup_3070);
			types.add(DsmlElementTypes.Operator_3071);
			types.add(DsmlElementTypes.ValueOperator_3072);
		} else if (relationshipType == DsmlElementTypes.Arithmetic_4002) {
			types.add(DsmlElementTypes.Target_3001);
			types.add(DsmlElementTypes.Target_3002);
			types.add(DsmlElementTypes.Not_3003);
			types.add(DsmlElementTypes.UnaryPattern_3004);
			types.add(DsmlElementTypes.PatternTimer_3005);
			types.add(DsmlElementTypes.RepeatPattern_3006);
			types.add(DsmlElementTypes.Aggregation_3007);
			types.add(DsmlElementTypes.ConditionGroup_3008);
			types.add(DsmlElementTypes.Target_3009);
			types.add(DsmlElementTypes.GroupbyCondition_3010);
			types.add(DsmlElementTypes.Target_3011);
			types.add(DsmlElementTypes.BringGroup_3012);
			types.add(DsmlElementTypes.Target_3013);
			types.add(DsmlElementTypes.Operator_3014);
			types.add(DsmlElementTypes.ValueOperator_3015);
			types.add(DsmlElementTypes.Not_3016);
			types.add(DsmlElementTypes.UnaryPattern_3017);
			types.add(DsmlElementTypes.PatternTimer_3018);
			types.add(DsmlElementTypes.RepeatPattern_3019);
			types.add(DsmlElementTypes.Aggregation_3020);
			types.add(DsmlElementTypes.ConditionGroup_3021);
			types.add(DsmlElementTypes.Not_3022);
			types.add(DsmlElementTypes.UnaryPattern_3023);
			types.add(DsmlElementTypes.PatternTimer_3024);
			types.add(DsmlElementTypes.RepeatPattern_3025);
			types.add(DsmlElementTypes.Aggregation_3026);
			types.add(DsmlElementTypes.ConditionGroup_3027);
			types.add(DsmlElementTypes.GroupbyCondition_3028);
			types.add(DsmlElementTypes.Not_3029);
			types.add(DsmlElementTypes.UnaryPattern_3030);
			types.add(DsmlElementTypes.PatternTimer_3031);
			types.add(DsmlElementTypes.RepeatPattern_3032);
			types.add(DsmlElementTypes.Aggregation_3033);
			types.add(DsmlElementTypes.ConditionGroup_3034);
			types.add(DsmlElementTypes.BringGroup_3035);
			types.add(DsmlElementTypes.GroupbyCondition_3036);
			types.add(DsmlElementTypes.GroupbyCondition_3037);
			types.add(DsmlElementTypes.BringGroup_3038);
			types.add(DsmlElementTypes.BringGroup_3039);
			types.add(DsmlElementTypes.Operator_3040);
			types.add(DsmlElementTypes.ValueOperator_3041);
			types.add(DsmlElementTypes.Operator_3042);
			types.add(DsmlElementTypes.ValueOperator_3043);
			types.add(DsmlElementTypes.Operator_3044);
			types.add(DsmlElementTypes.ValueOperator_3045);
			types.add(DsmlElementTypes.Not_3046);
			types.add(DsmlElementTypes.UnaryPattern_3047);
			types.add(DsmlElementTypes.PatternTimer_3048);
			types.add(DsmlElementTypes.RepeatPattern_3049);
			types.add(DsmlElementTypes.Aggregation_3050);
			types.add(DsmlElementTypes.ConditionGroup_3051);
			types.add(DsmlElementTypes.GroupbyCondition_3052);
			types.add(DsmlElementTypes.BringGroup_3053);
			types.add(DsmlElementTypes.Operator_3054);
			types.add(DsmlElementTypes.ValueOperator_3055);
			types.add(DsmlElementTypes.Target_3057);
			types.add(DsmlElementTypes.Not_3058);
			types.add(DsmlElementTypes.UnaryPattern_3059);
			types.add(DsmlElementTypes.PatternTimer_3060);
			types.add(DsmlElementTypes.RepeatPattern_3061);
			types.add(DsmlElementTypes.Target_3062);
			types.add(DsmlElementTypes.Not_3063);
			types.add(DsmlElementTypes.UnaryPattern_3064);
			types.add(DsmlElementTypes.PatternTimer_3065);
			types.add(DsmlElementTypes.RepeatPattern_3066);
			types.add(DsmlElementTypes.Aggregation_3067);
			types.add(DsmlElementTypes.ConditionGroup_3068);
			types.add(DsmlElementTypes.GroupbyCondition_3069);
			types.add(DsmlElementTypes.BringGroup_3070);
			types.add(DsmlElementTypes.Operator_3071);
			types.add(DsmlElementTypes.ValueOperator_3072);
		} else if (relationshipType == DsmlElementTypes.LogicalConnector_4003) {
			types.add(DsmlElementTypes.Target_3001);
			types.add(DsmlElementTypes.Target_3002);
			types.add(DsmlElementTypes.Not_3003);
			types.add(DsmlElementTypes.UnaryPattern_3004);
			types.add(DsmlElementTypes.PatternTimer_3005);
			types.add(DsmlElementTypes.RepeatPattern_3006);
			types.add(DsmlElementTypes.Aggregation_3007);
			types.add(DsmlElementTypes.ConditionGroup_3008);
			types.add(DsmlElementTypes.Target_3009);
			types.add(DsmlElementTypes.GroupbyCondition_3010);
			types.add(DsmlElementTypes.Target_3011);
			types.add(DsmlElementTypes.BringGroup_3012);
			types.add(DsmlElementTypes.Target_3013);
			types.add(DsmlElementTypes.Operator_3014);
			types.add(DsmlElementTypes.ValueOperator_3015);
			types.add(DsmlElementTypes.Not_3016);
			types.add(DsmlElementTypes.UnaryPattern_3017);
			types.add(DsmlElementTypes.PatternTimer_3018);
			types.add(DsmlElementTypes.RepeatPattern_3019);
			types.add(DsmlElementTypes.Aggregation_3020);
			types.add(DsmlElementTypes.ConditionGroup_3021);
			types.add(DsmlElementTypes.Not_3022);
			types.add(DsmlElementTypes.UnaryPattern_3023);
			types.add(DsmlElementTypes.PatternTimer_3024);
			types.add(DsmlElementTypes.RepeatPattern_3025);
			types.add(DsmlElementTypes.Aggregation_3026);
			types.add(DsmlElementTypes.ConditionGroup_3027);
			types.add(DsmlElementTypes.GroupbyCondition_3028);
			types.add(DsmlElementTypes.Not_3029);
			types.add(DsmlElementTypes.UnaryPattern_3030);
			types.add(DsmlElementTypes.PatternTimer_3031);
			types.add(DsmlElementTypes.RepeatPattern_3032);
			types.add(DsmlElementTypes.Aggregation_3033);
			types.add(DsmlElementTypes.ConditionGroup_3034);
			types.add(DsmlElementTypes.BringGroup_3035);
			types.add(DsmlElementTypes.GroupbyCondition_3036);
			types.add(DsmlElementTypes.GroupbyCondition_3037);
			types.add(DsmlElementTypes.BringGroup_3038);
			types.add(DsmlElementTypes.BringGroup_3039);
			types.add(DsmlElementTypes.Operator_3040);
			types.add(DsmlElementTypes.ValueOperator_3041);
			types.add(DsmlElementTypes.Operator_3042);
			types.add(DsmlElementTypes.ValueOperator_3043);
			types.add(DsmlElementTypes.Operator_3044);
			types.add(DsmlElementTypes.ValueOperator_3045);
			types.add(DsmlElementTypes.Not_3046);
			types.add(DsmlElementTypes.UnaryPattern_3047);
			types.add(DsmlElementTypes.PatternTimer_3048);
			types.add(DsmlElementTypes.RepeatPattern_3049);
			types.add(DsmlElementTypes.Aggregation_3050);
			types.add(DsmlElementTypes.ConditionGroup_3051);
			types.add(DsmlElementTypes.GroupbyCondition_3052);
			types.add(DsmlElementTypes.BringGroup_3053);
			types.add(DsmlElementTypes.Operator_3054);
			types.add(DsmlElementTypes.ValueOperator_3055);
			types.add(DsmlElementTypes.Target_3057);
			types.add(DsmlElementTypes.Not_3058);
			types.add(DsmlElementTypes.UnaryPattern_3059);
			types.add(DsmlElementTypes.PatternTimer_3060);
			types.add(DsmlElementTypes.RepeatPattern_3061);
			types.add(DsmlElementTypes.Target_3062);
			types.add(DsmlElementTypes.Not_3063);
			types.add(DsmlElementTypes.UnaryPattern_3064);
			types.add(DsmlElementTypes.PatternTimer_3065);
			types.add(DsmlElementTypes.RepeatPattern_3066);
			types.add(DsmlElementTypes.Aggregation_3067);
			types.add(DsmlElementTypes.ConditionGroup_3068);
			types.add(DsmlElementTypes.GroupbyCondition_3069);
			types.add(DsmlElementTypes.BringGroup_3070);
			types.add(DsmlElementTypes.Operator_3071);
			types.add(DsmlElementTypes.ValueOperator_3072);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((BringGroupEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(BringGroupEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DsmlElementTypes.Comparison_4001);
		types.add(DsmlElementTypes.Arithmetic_4002);
		types.add(DsmlElementTypes.LogicalConnector_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((BringGroupEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(BringGroupEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsmlElementTypes.Comparison_4001) {
			types.add(DsmlElementTypes.Target_3001);
			types.add(DsmlElementTypes.Target_3002);
			types.add(DsmlElementTypes.Not_3003);
			types.add(DsmlElementTypes.UnaryPattern_3004);
			types.add(DsmlElementTypes.PatternTimer_3005);
			types.add(DsmlElementTypes.RepeatPattern_3006);
			types.add(DsmlElementTypes.Aggregation_3007);
			types.add(DsmlElementTypes.ConditionGroup_3008);
			types.add(DsmlElementTypes.Target_3009);
			types.add(DsmlElementTypes.GroupbyCondition_3010);
			types.add(DsmlElementTypes.Target_3011);
			types.add(DsmlElementTypes.BringGroup_3012);
			types.add(DsmlElementTypes.Target_3013);
			types.add(DsmlElementTypes.Operator_3014);
			types.add(DsmlElementTypes.ValueOperator_3015);
			types.add(DsmlElementTypes.Not_3016);
			types.add(DsmlElementTypes.UnaryPattern_3017);
			types.add(DsmlElementTypes.PatternTimer_3018);
			types.add(DsmlElementTypes.RepeatPattern_3019);
			types.add(DsmlElementTypes.Aggregation_3020);
			types.add(DsmlElementTypes.ConditionGroup_3021);
			types.add(DsmlElementTypes.Not_3022);
			types.add(DsmlElementTypes.UnaryPattern_3023);
			types.add(DsmlElementTypes.PatternTimer_3024);
			types.add(DsmlElementTypes.RepeatPattern_3025);
			types.add(DsmlElementTypes.Aggregation_3026);
			types.add(DsmlElementTypes.ConditionGroup_3027);
			types.add(DsmlElementTypes.GroupbyCondition_3028);
			types.add(DsmlElementTypes.Not_3029);
			types.add(DsmlElementTypes.UnaryPattern_3030);
			types.add(DsmlElementTypes.PatternTimer_3031);
			types.add(DsmlElementTypes.RepeatPattern_3032);
			types.add(DsmlElementTypes.Aggregation_3033);
			types.add(DsmlElementTypes.ConditionGroup_3034);
			types.add(DsmlElementTypes.BringGroup_3035);
			types.add(DsmlElementTypes.GroupbyCondition_3036);
			types.add(DsmlElementTypes.GroupbyCondition_3037);
			types.add(DsmlElementTypes.BringGroup_3038);
			types.add(DsmlElementTypes.BringGroup_3039);
			types.add(DsmlElementTypes.Operator_3040);
			types.add(DsmlElementTypes.ValueOperator_3041);
			types.add(DsmlElementTypes.Operator_3042);
			types.add(DsmlElementTypes.ValueOperator_3043);
			types.add(DsmlElementTypes.Operator_3044);
			types.add(DsmlElementTypes.ValueOperator_3045);
			types.add(DsmlElementTypes.Not_3046);
			types.add(DsmlElementTypes.UnaryPattern_3047);
			types.add(DsmlElementTypes.PatternTimer_3048);
			types.add(DsmlElementTypes.RepeatPattern_3049);
			types.add(DsmlElementTypes.Aggregation_3050);
			types.add(DsmlElementTypes.ConditionGroup_3051);
			types.add(DsmlElementTypes.GroupbyCondition_3052);
			types.add(DsmlElementTypes.BringGroup_3053);
			types.add(DsmlElementTypes.Operator_3054);
			types.add(DsmlElementTypes.ValueOperator_3055);
			types.add(DsmlElementTypes.Target_3057);
			types.add(DsmlElementTypes.Not_3058);
			types.add(DsmlElementTypes.UnaryPattern_3059);
			types.add(DsmlElementTypes.PatternTimer_3060);
			types.add(DsmlElementTypes.RepeatPattern_3061);
			types.add(DsmlElementTypes.Target_3062);
			types.add(DsmlElementTypes.Not_3063);
			types.add(DsmlElementTypes.UnaryPattern_3064);
			types.add(DsmlElementTypes.PatternTimer_3065);
			types.add(DsmlElementTypes.RepeatPattern_3066);
			types.add(DsmlElementTypes.Aggregation_3067);
			types.add(DsmlElementTypes.ConditionGroup_3068);
			types.add(DsmlElementTypes.GroupbyCondition_3069);
			types.add(DsmlElementTypes.BringGroup_3070);
			types.add(DsmlElementTypes.Operator_3071);
			types.add(DsmlElementTypes.ValueOperator_3072);
		} else if (relationshipType == DsmlElementTypes.Arithmetic_4002) {
			types.add(DsmlElementTypes.Target_3001);
			types.add(DsmlElementTypes.Target_3002);
			types.add(DsmlElementTypes.Not_3003);
			types.add(DsmlElementTypes.UnaryPattern_3004);
			types.add(DsmlElementTypes.PatternTimer_3005);
			types.add(DsmlElementTypes.RepeatPattern_3006);
			types.add(DsmlElementTypes.Aggregation_3007);
			types.add(DsmlElementTypes.ConditionGroup_3008);
			types.add(DsmlElementTypes.Target_3009);
			types.add(DsmlElementTypes.GroupbyCondition_3010);
			types.add(DsmlElementTypes.Target_3011);
			types.add(DsmlElementTypes.BringGroup_3012);
			types.add(DsmlElementTypes.Target_3013);
			types.add(DsmlElementTypes.Operator_3014);
			types.add(DsmlElementTypes.ValueOperator_3015);
			types.add(DsmlElementTypes.Not_3016);
			types.add(DsmlElementTypes.UnaryPattern_3017);
			types.add(DsmlElementTypes.PatternTimer_3018);
			types.add(DsmlElementTypes.RepeatPattern_3019);
			types.add(DsmlElementTypes.Aggregation_3020);
			types.add(DsmlElementTypes.ConditionGroup_3021);
			types.add(DsmlElementTypes.Not_3022);
			types.add(DsmlElementTypes.UnaryPattern_3023);
			types.add(DsmlElementTypes.PatternTimer_3024);
			types.add(DsmlElementTypes.RepeatPattern_3025);
			types.add(DsmlElementTypes.Aggregation_3026);
			types.add(DsmlElementTypes.ConditionGroup_3027);
			types.add(DsmlElementTypes.GroupbyCondition_3028);
			types.add(DsmlElementTypes.Not_3029);
			types.add(DsmlElementTypes.UnaryPattern_3030);
			types.add(DsmlElementTypes.PatternTimer_3031);
			types.add(DsmlElementTypes.RepeatPattern_3032);
			types.add(DsmlElementTypes.Aggregation_3033);
			types.add(DsmlElementTypes.ConditionGroup_3034);
			types.add(DsmlElementTypes.BringGroup_3035);
			types.add(DsmlElementTypes.GroupbyCondition_3036);
			types.add(DsmlElementTypes.GroupbyCondition_3037);
			types.add(DsmlElementTypes.BringGroup_3038);
			types.add(DsmlElementTypes.BringGroup_3039);
			types.add(DsmlElementTypes.Operator_3040);
			types.add(DsmlElementTypes.ValueOperator_3041);
			types.add(DsmlElementTypes.Operator_3042);
			types.add(DsmlElementTypes.ValueOperator_3043);
			types.add(DsmlElementTypes.Operator_3044);
			types.add(DsmlElementTypes.ValueOperator_3045);
			types.add(DsmlElementTypes.Not_3046);
			types.add(DsmlElementTypes.UnaryPattern_3047);
			types.add(DsmlElementTypes.PatternTimer_3048);
			types.add(DsmlElementTypes.RepeatPattern_3049);
			types.add(DsmlElementTypes.Aggregation_3050);
			types.add(DsmlElementTypes.ConditionGroup_3051);
			types.add(DsmlElementTypes.GroupbyCondition_3052);
			types.add(DsmlElementTypes.BringGroup_3053);
			types.add(DsmlElementTypes.Operator_3054);
			types.add(DsmlElementTypes.ValueOperator_3055);
			types.add(DsmlElementTypes.Target_3057);
			types.add(DsmlElementTypes.Not_3058);
			types.add(DsmlElementTypes.UnaryPattern_3059);
			types.add(DsmlElementTypes.PatternTimer_3060);
			types.add(DsmlElementTypes.RepeatPattern_3061);
			types.add(DsmlElementTypes.Target_3062);
			types.add(DsmlElementTypes.Not_3063);
			types.add(DsmlElementTypes.UnaryPattern_3064);
			types.add(DsmlElementTypes.PatternTimer_3065);
			types.add(DsmlElementTypes.RepeatPattern_3066);
			types.add(DsmlElementTypes.Aggregation_3067);
			types.add(DsmlElementTypes.ConditionGroup_3068);
			types.add(DsmlElementTypes.GroupbyCondition_3069);
			types.add(DsmlElementTypes.BringGroup_3070);
			types.add(DsmlElementTypes.Operator_3071);
			types.add(DsmlElementTypes.ValueOperator_3072);
		} else if (relationshipType == DsmlElementTypes.LogicalConnector_4003) {
			types.add(DsmlElementTypes.Target_3001);
			types.add(DsmlElementTypes.Target_3002);
			types.add(DsmlElementTypes.Not_3003);
			types.add(DsmlElementTypes.UnaryPattern_3004);
			types.add(DsmlElementTypes.PatternTimer_3005);
			types.add(DsmlElementTypes.RepeatPattern_3006);
			types.add(DsmlElementTypes.Aggregation_3007);
			types.add(DsmlElementTypes.ConditionGroup_3008);
			types.add(DsmlElementTypes.Target_3009);
			types.add(DsmlElementTypes.GroupbyCondition_3010);
			types.add(DsmlElementTypes.Target_3011);
			types.add(DsmlElementTypes.BringGroup_3012);
			types.add(DsmlElementTypes.Target_3013);
			types.add(DsmlElementTypes.Operator_3014);
			types.add(DsmlElementTypes.ValueOperator_3015);
			types.add(DsmlElementTypes.Not_3016);
			types.add(DsmlElementTypes.UnaryPattern_3017);
			types.add(DsmlElementTypes.PatternTimer_3018);
			types.add(DsmlElementTypes.RepeatPattern_3019);
			types.add(DsmlElementTypes.Aggregation_3020);
			types.add(DsmlElementTypes.ConditionGroup_3021);
			types.add(DsmlElementTypes.Not_3022);
			types.add(DsmlElementTypes.UnaryPattern_3023);
			types.add(DsmlElementTypes.PatternTimer_3024);
			types.add(DsmlElementTypes.RepeatPattern_3025);
			types.add(DsmlElementTypes.Aggregation_3026);
			types.add(DsmlElementTypes.ConditionGroup_3027);
			types.add(DsmlElementTypes.GroupbyCondition_3028);
			types.add(DsmlElementTypes.Not_3029);
			types.add(DsmlElementTypes.UnaryPattern_3030);
			types.add(DsmlElementTypes.PatternTimer_3031);
			types.add(DsmlElementTypes.RepeatPattern_3032);
			types.add(DsmlElementTypes.Aggregation_3033);
			types.add(DsmlElementTypes.ConditionGroup_3034);
			types.add(DsmlElementTypes.BringGroup_3035);
			types.add(DsmlElementTypes.GroupbyCondition_3036);
			types.add(DsmlElementTypes.GroupbyCondition_3037);
			types.add(DsmlElementTypes.BringGroup_3038);
			types.add(DsmlElementTypes.BringGroup_3039);
			types.add(DsmlElementTypes.Operator_3040);
			types.add(DsmlElementTypes.ValueOperator_3041);
			types.add(DsmlElementTypes.Operator_3042);
			types.add(DsmlElementTypes.ValueOperator_3043);
			types.add(DsmlElementTypes.Operator_3044);
			types.add(DsmlElementTypes.ValueOperator_3045);
			types.add(DsmlElementTypes.Not_3046);
			types.add(DsmlElementTypes.UnaryPattern_3047);
			types.add(DsmlElementTypes.PatternTimer_3048);
			types.add(DsmlElementTypes.RepeatPattern_3049);
			types.add(DsmlElementTypes.Aggregation_3050);
			types.add(DsmlElementTypes.ConditionGroup_3051);
			types.add(DsmlElementTypes.GroupbyCondition_3052);
			types.add(DsmlElementTypes.BringGroup_3053);
			types.add(DsmlElementTypes.Operator_3054);
			types.add(DsmlElementTypes.ValueOperator_3055);
			types.add(DsmlElementTypes.Target_3057);
			types.add(DsmlElementTypes.Not_3058);
			types.add(DsmlElementTypes.UnaryPattern_3059);
			types.add(DsmlElementTypes.PatternTimer_3060);
			types.add(DsmlElementTypes.RepeatPattern_3061);
			types.add(DsmlElementTypes.Target_3062);
			types.add(DsmlElementTypes.Not_3063);
			types.add(DsmlElementTypes.UnaryPattern_3064);
			types.add(DsmlElementTypes.PatternTimer_3065);
			types.add(DsmlElementTypes.RepeatPattern_3066);
			types.add(DsmlElementTypes.Aggregation_3067);
			types.add(DsmlElementTypes.ConditionGroup_3068);
			types.add(DsmlElementTypes.GroupbyCondition_3069);
			types.add(DsmlElementTypes.BringGroup_3070);
			types.add(DsmlElementTypes.Operator_3071);
			types.add(DsmlElementTypes.ValueOperator_3072);
		}
		return types;
	}

}
