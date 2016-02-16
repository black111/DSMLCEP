/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsml.diagram.edit.commands.Aggregation5CreateCommand;
import dsml.diagram.edit.commands.BringGroup5CreateCommand;
import dsml.diagram.edit.commands.ConditionGroup5CreateCommand;
import dsml.diagram.edit.commands.GroupbyCondition5CreateCommand;
import dsml.diagram.edit.commands.Not5CreateCommand;
import dsml.diagram.edit.commands.Operator5CreateCommand;
import dsml.diagram.edit.commands.PatternTimer5CreateCommand;
import dsml.diagram.edit.commands.RepeatPattern5CreateCommand;
import dsml.diagram.edit.commands.TargetCreateCommand;
import dsml.diagram.edit.commands.UnaryPattern5CreateCommand;
import dsml.diagram.edit.commands.ValueOperator5CreateCommand;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class RuleRuleQueriesCompartmentItemSemanticEditPolicy extends
		DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RuleRuleQueriesCompartmentItemSemanticEditPolicy() {
		super(DsmlElementTypes.Rule_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsmlElementTypes.Target_3001 == req.getElementType()) {
			return getGEFWrapper(new TargetCreateCommand(req));
		}
		if (DsmlElementTypes.Not_3046 == req.getElementType()) {
			return getGEFWrapper(new Not5CreateCommand(req));
		}
		if (DsmlElementTypes.UnaryPattern_3047 == req.getElementType()) {
			return getGEFWrapper(new UnaryPattern5CreateCommand(req));
		}
		if (DsmlElementTypes.PatternTimer_3048 == req.getElementType()) {
			return getGEFWrapper(new PatternTimer5CreateCommand(req));
		}
		if (DsmlElementTypes.RepeatPattern_3049 == req.getElementType()) {
			return getGEFWrapper(new RepeatPattern5CreateCommand(req));
		}
		if (DsmlElementTypes.Aggregation_3050 == req.getElementType()) {
			return getGEFWrapper(new Aggregation5CreateCommand(req));
		}
		if (DsmlElementTypes.ConditionGroup_3051 == req.getElementType()) {
			return getGEFWrapper(new ConditionGroup5CreateCommand(req));
		}
		if (DsmlElementTypes.GroupbyCondition_3052 == req.getElementType()) {
			return getGEFWrapper(new GroupbyCondition5CreateCommand(req));
		}
		if (DsmlElementTypes.BringGroup_3053 == req.getElementType()) {
			return getGEFWrapper(new BringGroup5CreateCommand(req));
		}
		if (DsmlElementTypes.Operator_3054 == req.getElementType()) {
			return getGEFWrapper(new Operator5CreateCommand(req));
		}
		if (DsmlElementTypes.ValueOperator_3055 == req.getElementType()) {
			return getGEFWrapper(new ValueOperator5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
