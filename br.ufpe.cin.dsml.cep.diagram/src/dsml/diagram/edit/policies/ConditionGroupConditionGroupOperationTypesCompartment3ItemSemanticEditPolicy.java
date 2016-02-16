/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsml.diagram.edit.commands.Aggregation3CreateCommand;
import dsml.diagram.edit.commands.BringGroup2CreateCommand;
import dsml.diagram.edit.commands.ConditionGroup3CreateCommand;
import dsml.diagram.edit.commands.GroupbyCondition2CreateCommand;
import dsml.diagram.edit.commands.Not3CreateCommand;
import dsml.diagram.edit.commands.Operator4CreateCommand;
import dsml.diagram.edit.commands.PatternTimer3CreateCommand;
import dsml.diagram.edit.commands.RepeatPattern3CreateCommand;
import dsml.diagram.edit.commands.Target3CreateCommand;
import dsml.diagram.edit.commands.UnaryPattern3CreateCommand;
import dsml.diagram.edit.commands.ValueOperator4CreateCommand;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class ConditionGroupConditionGroupOperationTypesCompartment3ItemSemanticEditPolicy
		extends DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionGroupConditionGroupOperationTypesCompartment3ItemSemanticEditPolicy() {
		super(DsmlElementTypes.ConditionGroup_3027);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsmlElementTypes.Target_3009 == req.getElementType()) {
			return getGEFWrapper(new Target3CreateCommand(req));
		}
		if (DsmlElementTypes.Not_3022 == req.getElementType()) {
			return getGEFWrapper(new Not3CreateCommand(req));
		}
		if (DsmlElementTypes.UnaryPattern_3023 == req.getElementType()) {
			return getGEFWrapper(new UnaryPattern3CreateCommand(req));
		}
		if (DsmlElementTypes.PatternTimer_3024 == req.getElementType()) {
			return getGEFWrapper(new PatternTimer3CreateCommand(req));
		}
		if (DsmlElementTypes.RepeatPattern_3025 == req.getElementType()) {
			return getGEFWrapper(new RepeatPattern3CreateCommand(req));
		}
		if (DsmlElementTypes.Aggregation_3026 == req.getElementType()) {
			return getGEFWrapper(new Aggregation3CreateCommand(req));
		}
		if (DsmlElementTypes.ConditionGroup_3027 == req.getElementType()) {
			return getGEFWrapper(new ConditionGroup3CreateCommand(req));
		}
		if (DsmlElementTypes.GroupbyCondition_3028 == req.getElementType()) {
			return getGEFWrapper(new GroupbyCondition2CreateCommand(req));
		}
		if (DsmlElementTypes.BringGroup_3035 == req.getElementType()) {
			return getGEFWrapper(new BringGroup2CreateCommand(req));
		}
		if (DsmlElementTypes.Operator_3044 == req.getElementType()) {
			return getGEFWrapper(new Operator4CreateCommand(req));
		}
		if (DsmlElementTypes.ValueOperator_3045 == req.getElementType()) {
			return getGEFWrapper(new ValueOperator4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
