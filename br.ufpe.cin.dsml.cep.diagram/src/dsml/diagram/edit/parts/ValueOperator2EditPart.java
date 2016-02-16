/*
 * 
 */
package dsml.diagram.edit.parts;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import dsml.diagram.edit.policies.ValueOperator2ItemSemanticEditPolicy;
import dsml.diagram.part.DsmlVisualIDRegistry;

/**
 * @generated
 */
public class ValueOperator2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3041;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ValueOperator2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ValueOperator2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ValueOperatorFigure();
	}

	/**
	 * @generated
	 */
	public ValueOperatorFigure getPrimaryShape() {
		return (ValueOperatorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ValueOperatorValueOperator2EditPart) {
			((ValueOperatorValueOperator2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureValueOperatorLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ValueOperatorValueOperator2EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40){
		public PointList getPolygonPoints() {
			PointList points = new PointList(21);
			Rectangle anchRect = getHandleBounds();
			points.addPoint(anchRect.x, anchRect.y + anchRect.height * 50/ 100); // A1
			//primeiro arco
			points.addPoint(anchRect.x + anchRect.width * 5 / 100, anchRect.y + anchRect.height * 25 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 10 / 100, anchRect.y + anchRect.height * 15 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 15 / 100, anchRect.y + anchRect.height * 10 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 25 / 100, anchRect.y + anchRect.height * 5 / 100); // A1
			// fim primeiro arco
			points.addPoint(anchRect.x + anchRect.width * 50 / 100, anchRect.y); // A2
			//2 arco
			points.addPoint(anchRect.x + anchRect.width * 75 / 100, anchRect.y + anchRect.height * 5 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 85 / 100, anchRect.y + anchRect.height * 10 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 90 / 100, anchRect.y + anchRect.height * 15 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 95 / 100, anchRect.y + anchRect.height * 25 / 100); // A1
			//fim 2 arc
			points.addPoint(anchRect.x + anchRect.width, anchRect.y + anchRect.height * 50 / 100); // A3
			//arco 3
			points.addPoint(anchRect.x + anchRect.width * 95 / 100, anchRect.y + anchRect.height * 75 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 90 / 100, anchRect.y + anchRect.height * 85 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 85 / 100, anchRect.y + anchRect.height * 90 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 75 / 100, anchRect.y + anchRect.height * 95 / 100); // A1
			//fim arco 3
			points.addPoint(anchRect.x + anchRect.width * 50 / 100, anchRect.y + anchRect.height); // A4
			//arco 4
			points.addPoint(anchRect.x + anchRect.width * 25 / 100, anchRect.y + anchRect.height * 95 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 15 / 100, anchRect.y + anchRect.height * 90 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 10 / 100, anchRect.y + anchRect.height * 85 / 100); // A1
			points.addPoint(anchRect.x + anchRect.width * 5 / 100, 	anchRect.y + anchRect.height * 75 / 100); // A1
			//fim arco4
			points.addPoint(anchRect.x, anchRect.y + anchRect.height * 50 / 100);
			return points;
		}
	};
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(DsmlVisualIDRegistry
				.getType(ValueOperatorValueOperator2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ValueOperatorFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureValueOperatorLabelFigure;

		/**
		 * @generated
		 */
		public ValueOperatorFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureValueOperatorLabelFigure = new WrappingLabel();

			fFigureValueOperatorLabelFigure.setText("ValueOperator");

			this.add(fFigureValueOperatorLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureValueOperatorLabelFigure() {
			return fFigureValueOperatorLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}