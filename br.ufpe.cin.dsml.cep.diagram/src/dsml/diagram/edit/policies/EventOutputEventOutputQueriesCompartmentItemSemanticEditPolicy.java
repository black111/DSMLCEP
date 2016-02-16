/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsml.diagram.edit.commands.Aggregation6CreateCommand;
import dsml.diagram.edit.commands.BringGroup6CreateCommand;
import dsml.diagram.edit.commands.ConditionGroup6CreateCommand;
import dsml.diagram.edit.commands.GroupbyCondition6CreateCommand;
import dsml.diagram.edit.commands.Not7CreateCommand;
import dsml.diagram.edit.commands.Operator6CreateCommand;
import dsml.diagram.edit.commands.PatternTimer7CreateCommand;
import dsml.diagram.edit.commands.RepeatPattern7CreateCommand;
import dsml.diagram.edit.commands.Target7CreateCommand;
import dsml.diagram.edit.commands.UnaryPattern7CreateCommand;
import dsml.diagram.edit.commands.ValueOperator6CreateCommand;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class EventOutputEventOutputQueriesCompartmentItemSemanticEditPolicy
		extends DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventOutputEventOutputQueriesCompartmentItemSemanticEditPolicy() {
		super(DsmlElementTypes.EventOutput_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsmlElementTypes.Target_3062 == req.getElementType()) {
			return getGEFWrapper(new Target7CreateCommand(req));
		}
		if (DsmlElementTypes.Not_3063 == req.getElementType()) {
			return getGEFWrapper(new Not7CreateCommand(req));
		}
		if (DsmlElementTypes.UnaryPattern_3064 == req.getElementType()) {
			return getGEFWrapper(new UnaryPattern7CreateCommand(req));
		}
		if (DsmlElementTypes.PatternTimer_3065 == req.getElementType()) {
			return getGEFWrapper(new PatternTimer7CreateCommand(req));
		}
		if (DsmlElementTypes.RepeatPattern_3066 == req.getElementType()) {
			return getGEFWrapper(new RepeatPattern7CreateCommand(req));
		}
		if (DsmlElementTypes.Aggregation_3067 == req.getElementType()) {
			return getGEFWrapper(new Aggregation6CreateCommand(req));
		}
		if (DsmlElementTypes.ConditionGroup_3068 == req.getElementType()) {
			return getGEFWrapper(new ConditionGroup6CreateCommand(req));
		}
		if (DsmlElementTypes.GroupbyCondition_3069 == req.getElementType()) {
			return getGEFWrapper(new GroupbyCondition6CreateCommand(req));
		}
		if (DsmlElementTypes.BringGroup_3070 == req.getElementType()) {
			return getGEFWrapper(new BringGroup6CreateCommand(req));
		}
		if (DsmlElementTypes.Operator_3071 == req.getElementType()) {
			return getGEFWrapper(new Operator6CreateCommand(req));
		}
		if (DsmlElementTypes.ValueOperator_3072 == req.getElementType()) {
			return getGEFWrapper(new ValueOperator6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
