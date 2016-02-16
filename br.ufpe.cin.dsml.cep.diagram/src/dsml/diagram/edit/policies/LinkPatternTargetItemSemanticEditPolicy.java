/*
 * 
 */
package dsml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class LinkPatternTargetItemSemanticEditPolicy extends
		DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkPatternTargetItemSemanticEditPolicy() {
		super(DsmlElementTypes.LinkPatternTarget_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
