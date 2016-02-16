/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsml.diagram.edit.commands.AggregationCreateCommand;
import dsml.diagram.edit.commands.BringGroupCreateCommand;
import dsml.diagram.edit.commands.ConditionGroupCreateCommand;
import dsml.diagram.edit.commands.GroupbyConditionCreateCommand;
import dsml.diagram.edit.commands.NotCreateCommand;
import dsml.diagram.edit.commands.OperatorCreateCommand;
import dsml.diagram.edit.commands.PatternTimerCreateCommand;
import dsml.diagram.edit.commands.RepeatPatternCreateCommand;
import dsml.diagram.edit.commands.Target2CreateCommand;
import dsml.diagram.edit.commands.UnaryPatternCreateCommand;
import dsml.diagram.edit.commands.ValueOperatorCreateCommand;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class TargetTargetOperationTypesCompartmentItemSemanticEditPolicy extends
		DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TargetTargetOperationTypesCompartmentItemSemanticEditPolicy() {
		super(DsmlElementTypes.Target_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsmlElementTypes.Target_3002 == req.getElementType()) {
			return getGEFWrapper(new Target2CreateCommand(req));
		}
		if (DsmlElementTypes.Not_3003 == req.getElementType()) {
			return getGEFWrapper(new NotCreateCommand(req));
		}
		if (DsmlElementTypes.UnaryPattern_3004 == req.getElementType()) {
			return getGEFWrapper(new UnaryPatternCreateCommand(req));
		}
		if (DsmlElementTypes.PatternTimer_3005 == req.getElementType()) {
			return getGEFWrapper(new PatternTimerCreateCommand(req));
		}
		if (DsmlElementTypes.RepeatPattern_3006 == req.getElementType()) {
			return getGEFWrapper(new RepeatPatternCreateCommand(req));
		}
		if (DsmlElementTypes.Aggregation_3007 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req));
		}
		if (DsmlElementTypes.ConditionGroup_3008 == req.getElementType()) {
			return getGEFWrapper(new ConditionGroupCreateCommand(req));
		}
		if (DsmlElementTypes.GroupbyCondition_3010 == req.getElementType()) {
			return getGEFWrapper(new GroupbyConditionCreateCommand(req));
		}
		if (DsmlElementTypes.BringGroup_3012 == req.getElementType()) {
			return getGEFWrapper(new BringGroupCreateCommand(req));
		}
		if (DsmlElementTypes.Operator_3014 == req.getElementType()) {
			return getGEFWrapper(new OperatorCreateCommand(req));
		}
		if (DsmlElementTypes.ValueOperator_3015 == req.getElementType()) {
			return getGEFWrapper(new ValueOperatorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
