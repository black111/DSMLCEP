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
public class ComparisonItemSemanticEditPolicy extends
		DsmlBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComparisonItemSemanticEditPolicy() {
		super(DsmlElementTypes.Comparison_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
