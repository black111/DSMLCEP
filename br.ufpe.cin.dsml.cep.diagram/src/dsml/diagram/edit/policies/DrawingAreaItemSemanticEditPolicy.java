/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import dsml.diagram.edit.commands.EventCreateCommand;
import dsml.diagram.edit.commands.EventOutputCreateCommand;
import dsml.diagram.edit.commands.EventPatternCreateCommand;
import dsml.diagram.edit.commands.RuleCreateCommand;
import dsml.diagram.edit.commands.TargetGroupbyCreateCommand;
import dsml.diagram.edit.commands.WindowCreateCommand;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class DrawingAreaItemSemanticEditPolicy extends
		DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DrawingAreaItemSemanticEditPolicy() {
		super(DsmlElementTypes.DrawingArea_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsmlElementTypes.Rule_2001 == req.getElementType()) {
			return getGEFWrapper(new RuleCreateCommand(req));
		}
		if (DsmlElementTypes.Event_2002 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		if (DsmlElementTypes.EventPattern_2003 == req.getElementType()) {
			return getGEFWrapper(new EventPatternCreateCommand(req));
		}
		if (DsmlElementTypes.EventOutput_2004 == req.getElementType()) {
			return getGEFWrapper(new EventOutputCreateCommand(req));
		}
		if (DsmlElementTypes.Window_2005 == req.getElementType()) {
			return getGEFWrapper(new WindowCreateCommand(req));
		}
		if (DsmlElementTypes.TargetGroupby_2006 == req.getElementType()) {
			return getGEFWrapper(new TargetGroupbyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
