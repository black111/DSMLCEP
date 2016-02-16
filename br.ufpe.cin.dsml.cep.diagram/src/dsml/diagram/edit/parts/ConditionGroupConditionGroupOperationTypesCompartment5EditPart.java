/*
 * 
 */
package dsml.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import dsml.diagram.edit.policies.ConditionGroupConditionGroupOperationTypesCompartment5CanonicalEditPolicy;
import dsml.diagram.edit.policies.ConditionGroupConditionGroupOperationTypesCompartment5ItemSemanticEditPolicy;
import dsml.diagram.part.DsmlVisualIDRegistry;
import dsml.diagram.part.Messages;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class ConditionGroupConditionGroupOperationTypesCompartment5EditPart
		extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7019;

	/**
	 * @generated
	 */
	public ConditionGroupConditionGroupOperationTypesCompartment5EditPart(
			View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.ConditionGroupConditionGroupOperationTypesCompartment5EditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ConditionGroupConditionGroupOperationTypesCompartment5ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						DsmlVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new ConditionGroupConditionGroupOperationTypesCompartment5CanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == DsmlElementTypes.Target_3009) {
				return this;
			}
			if (type == DsmlElementTypes.Not_3022) {
				return this;
			}
			if (type == DsmlElementTypes.UnaryPattern_3023) {
				return this;
			}
			if (type == DsmlElementTypes.PatternTimer_3024) {
				return this;
			}
			if (type == DsmlElementTypes.RepeatPattern_3025) {
				return this;
			}
			if (type == DsmlElementTypes.Aggregation_3026) {
				return this;
			}
			if (type == DsmlElementTypes.ConditionGroup_3027) {
				return this;
			}
			if (type == DsmlElementTypes.GroupbyCondition_3028) {
				return this;
			}
			if (type == DsmlElementTypes.BringGroup_3035) {
				return this;
			}
			if (type == DsmlElementTypes.Operator_3044) {
				return this;
			}
			if (type == DsmlElementTypes.ValueOperator_3045) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request)
						.getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType
								.equals(DsmlElementTypes.Comparison_4001)
								|| elementType
										.equals(DsmlElementTypes.Arithmetic_4002)
								|| elementType
										.equals(DsmlElementTypes.LogicalConnector_4003)
								|| elementType
										.equals(DsmlElementTypes.LinkTarget_4004)
								|| elementType
										.equals(DsmlElementTypes.LinkPatternTarget_4005))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
