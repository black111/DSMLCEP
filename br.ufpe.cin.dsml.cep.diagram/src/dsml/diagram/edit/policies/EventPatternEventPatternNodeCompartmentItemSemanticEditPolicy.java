/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsml.diagram.edit.commands.Not6CreateCommand;
import dsml.diagram.edit.commands.PatternTimer6CreateCommand;
import dsml.diagram.edit.commands.RepeatPattern6CreateCommand;
import dsml.diagram.edit.commands.Target6CreateCommand;
import dsml.diagram.edit.commands.UnaryPattern6CreateCommand;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class EventPatternEventPatternNodeCompartmentItemSemanticEditPolicy
		extends DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventPatternEventPatternNodeCompartmentItemSemanticEditPolicy() {
		super(DsmlElementTypes.EventPattern_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsmlElementTypes.Target_3057 == req.getElementType()) {
			return getGEFWrapper(new Target6CreateCommand(req));
		}
		if (DsmlElementTypes.Not_3058 == req.getElementType()) {
			return getGEFWrapper(new Not6CreateCommand(req));
		}
		if (DsmlElementTypes.UnaryPattern_3059 == req.getElementType()) {
			return getGEFWrapper(new UnaryPattern6CreateCommand(req));
		}
		if (DsmlElementTypes.PatternTimer_3060 == req.getElementType()) {
			return getGEFWrapper(new PatternTimer6CreateCommand(req));
		}
		if (DsmlElementTypes.RepeatPattern_3061 == req.getElementType()) {
			return getGEFWrapper(new RepeatPattern6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
