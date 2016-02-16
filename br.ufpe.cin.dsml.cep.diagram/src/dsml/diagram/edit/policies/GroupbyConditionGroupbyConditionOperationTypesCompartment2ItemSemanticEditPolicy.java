/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsml.diagram.edit.commands.Aggregation4CreateCommand;
import dsml.diagram.edit.commands.BringGroup3CreateCommand;
import dsml.diagram.edit.commands.ConditionGroup4CreateCommand;
import dsml.diagram.edit.commands.GroupbyCondition4CreateCommand;
import dsml.diagram.edit.commands.Not4CreateCommand;
import dsml.diagram.edit.commands.Operator3CreateCommand;
import dsml.diagram.edit.commands.PatternTimer4CreateCommand;
import dsml.diagram.edit.commands.RepeatPattern4CreateCommand;
import dsml.diagram.edit.commands.Target4CreateCommand;
import dsml.diagram.edit.commands.UnaryPattern4CreateCommand;
import dsml.diagram.edit.commands.ValueOperator3CreateCommand;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class GroupbyConditionGroupbyConditionOperationTypesCompartment2ItemSemanticEditPolicy
		extends DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GroupbyConditionGroupbyConditionOperationTypesCompartment2ItemSemanticEditPolicy() {
		super(DsmlElementTypes.GroupbyCondition_3028);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsmlElementTypes.Target_3011 == req.getElementType()) {
			return getGEFWrapper(new Target4CreateCommand(req));
		}
		if (DsmlElementTypes.Not_3029 == req.getElementType()) {
			return getGEFWrapper(new Not4CreateCommand(req));
		}
		if (DsmlElementTypes.UnaryPattern_3030 == req.getElementType()) {
			return getGEFWrapper(new UnaryPattern4CreateCommand(req));
		}
		if (DsmlElementTypes.PatternTimer_3031 == req.getElementType()) {
			return getGEFWrapper(new PatternTimer4CreateCommand(req));
		}
		if (DsmlElementTypes.RepeatPattern_3032 == req.getElementType()) {
			return getGEFWrapper(new RepeatPattern4CreateCommand(req));
		}
		if (DsmlElementTypes.Aggregation_3033 == req.getElementType()) {
			return getGEFWrapper(new Aggregation4CreateCommand(req));
		}
		if (DsmlElementTypes.ConditionGroup_3034 == req.getElementType()) {
			return getGEFWrapper(new ConditionGroup4CreateCommand(req));
		}
		if (DsmlElementTypes.GroupbyCondition_3037 == req.getElementType()) {
			return getGEFWrapper(new GroupbyCondition4CreateCommand(req));
		}
		if (DsmlElementTypes.BringGroup_3038 == req.getElementType()) {
			return getGEFWrapper(new BringGroup3CreateCommand(req));
		}
		if (DsmlElementTypes.Operator_3042 == req.getElementType()) {
			return getGEFWrapper(new Operator3CreateCommand(req));
		}
		if (DsmlElementTypes.ValueOperator_3043 == req.getElementType()) {
			return getGEFWrapper(new ValueOperator3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
