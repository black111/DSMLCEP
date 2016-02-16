/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsml.diagram.edit.commands.Aggregation2CreateCommand;
import dsml.diagram.edit.commands.BringGroup4CreateCommand;
import dsml.diagram.edit.commands.ConditionGroup2CreateCommand;
import dsml.diagram.edit.commands.GroupbyCondition3CreateCommand;
import dsml.diagram.edit.commands.Not2CreateCommand;
import dsml.diagram.edit.commands.Operator2CreateCommand;
import dsml.diagram.edit.commands.PatternTimer2CreateCommand;
import dsml.diagram.edit.commands.RepeatPattern2CreateCommand;
import dsml.diagram.edit.commands.Target5CreateCommand;
import dsml.diagram.edit.commands.UnaryPattern2CreateCommand;
import dsml.diagram.edit.commands.ValueOperator2CreateCommand;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class BringGroupBringGroupOperationTypesCompartment3ItemSemanticEditPolicy
		extends DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BringGroupBringGroupOperationTypesCompartment3ItemSemanticEditPolicy() {
		super(DsmlElementTypes.BringGroup_3038);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsmlElementTypes.Target_3013 == req.getElementType()) {
			return getGEFWrapper(new Target5CreateCommand(req));
		}
		if (DsmlElementTypes.Not_3016 == req.getElementType()) {
			return getGEFWrapper(new Not2CreateCommand(req));
		}
		if (DsmlElementTypes.UnaryPattern_3017 == req.getElementType()) {
			return getGEFWrapper(new UnaryPattern2CreateCommand(req));
		}
		if (DsmlElementTypes.PatternTimer_3018 == req.getElementType()) {
			return getGEFWrapper(new PatternTimer2CreateCommand(req));
		}
		if (DsmlElementTypes.RepeatPattern_3019 == req.getElementType()) {
			return getGEFWrapper(new RepeatPattern2CreateCommand(req));
		}
		if (DsmlElementTypes.Aggregation_3020 == req.getElementType()) {
			return getGEFWrapper(new Aggregation2CreateCommand(req));
		}
		if (DsmlElementTypes.ConditionGroup_3021 == req.getElementType()) {
			return getGEFWrapper(new ConditionGroup2CreateCommand(req));
		}
		if (DsmlElementTypes.GroupbyCondition_3036 == req.getElementType()) {
			return getGEFWrapper(new GroupbyCondition3CreateCommand(req));
		}
		if (DsmlElementTypes.BringGroup_3039 == req.getElementType()) {
			return getGEFWrapper(new BringGroup4CreateCommand(req));
		}
		if (DsmlElementTypes.Operator_3040 == req.getElementType()) {
			return getGEFWrapper(new Operator2CreateCommand(req));
		}
		if (DsmlElementTypes.ValueOperator_3041 == req.getElementType()) {
			return getGEFWrapper(new ValueOperator2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
