/*
 * 
 */
package dsml.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import dsml.diagram.edit.commands.ArithmeticCreateCommand;
import dsml.diagram.edit.commands.ArithmeticReorientCommand;
import dsml.diagram.edit.commands.ComparisonCreateCommand;
import dsml.diagram.edit.commands.ComparisonReorientCommand;
import dsml.diagram.edit.commands.LogicalConnectorCreateCommand;
import dsml.diagram.edit.commands.LogicalConnectorReorientCommand;
import dsml.diagram.edit.parts.ArithmeticEditPart;
import dsml.diagram.edit.parts.ComparisonEditPart;
import dsml.diagram.edit.parts.LogicalConnectorEditPart;
import dsml.diagram.part.DsmlVisualIDRegistry;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class Not4ItemSemanticEditPolicy extends DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Not4ItemSemanticEditPolicy() {
		super(DsmlElementTypes.Not_3029);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DsmlVisualIDRegistry.getVisualID(incomingLink) == ComparisonEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsmlVisualIDRegistry.getVisualID(incomingLink) == ArithmeticEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsmlVisualIDRegistry.getVisualID(incomingLink) == LogicalConnectorEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DsmlVisualIDRegistry.getVisualID(outgoingLink) == ComparisonEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DsmlVisualIDRegistry.getVisualID(outgoingLink) == ArithmeticEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DsmlVisualIDRegistry.getVisualID(outgoingLink) == LogicalConnectorEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DsmlElementTypes.Comparison_4001 == req.getElementType()) {
			return getGEFWrapper(new ComparisonCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsmlElementTypes.Arithmetic_4002 == req.getElementType()) {
			return getGEFWrapper(new ArithmeticCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsmlElementTypes.LogicalConnector_4003 == req.getElementType()) {
			return getGEFWrapper(new LogicalConnectorCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DsmlElementTypes.Comparison_4001 == req.getElementType()) {
			return getGEFWrapper(new ComparisonCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsmlElementTypes.Arithmetic_4002 == req.getElementType()) {
			return getGEFWrapper(new ArithmeticCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DsmlElementTypes.LogicalConnector_4003 == req.getElementType()) {
			return getGEFWrapper(new LogicalConnectorCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ComparisonEditPart.VISUAL_ID:
			return getGEFWrapper(new ComparisonReorientCommand(req));
		case ArithmeticEditPart.VISUAL_ID:
			return getGEFWrapper(new ArithmeticReorientCommand(req));
		case LogicalConnectorEditPart.VISUAL_ID:
			return getGEFWrapper(new LogicalConnectorReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
