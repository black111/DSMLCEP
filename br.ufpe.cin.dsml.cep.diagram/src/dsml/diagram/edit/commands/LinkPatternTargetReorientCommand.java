/*
 * 
 */
package dsml.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import dsml.DrawingArea;
import dsml.LinkPatternTarget;
import dsml.Target;
import dsml.diagram.edit.policies.DsmlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class LinkPatternTargetReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public LinkPatternTargetReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof LinkPatternTarget) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Target && newEnd instanceof Target)) {
			return false;
		}
		Target target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof DrawingArea)) {
			return false;
		}
		DrawingArea container = (DrawingArea) getLink().eContainer();
		return DsmlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLinkPatternTarget_4005(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Target && newEnd instanceof Target)) {
			return false;
		}
		Target source = getLink().getSource();
		if (!(getLink().eContainer() instanceof DrawingArea)) {
			return false;
		}
		DrawingArea container = (DrawingArea) getLink().eContainer();
		return DsmlBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLinkPatternTarget_4005(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected LinkPatternTarget getLink() {
		return (LinkPatternTarget) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Target getOldSource() {
		return (Target) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Target getNewSource() {
		return (Target) newEnd;
	}

	/**
	 * @generated
	 */
	protected Target getOldTarget() {
		return (Target) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Target getNewTarget() {
		return (Target) newEnd;
	}
}
