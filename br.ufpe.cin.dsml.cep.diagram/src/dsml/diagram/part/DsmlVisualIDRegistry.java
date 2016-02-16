/*
 * 
 */
package dsml.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import dsml.DrawingArea;
import dsml.DsmlPackage;
import dsml.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DsmlVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "br.ufpe.cin.dsml.cep.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DrawingAreaEditPart.MODEL_ID.equals(view.getType())) {
				return DrawingAreaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dsml.diagram.part.DsmlVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DsmlDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DsmlPackage.eINSTANCE.getDrawingArea().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((DrawingArea) domainElement)) {
			return DrawingAreaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = dsml.diagram.part.DsmlVisualIDRegistry
				.getModelID(containerView);
		if (!DrawingAreaEditPart.MODEL_ID.equals(containerModelID)
				&& !"dsml".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DrawingAreaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dsml.diagram.part.DsmlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DrawingAreaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DrawingAreaEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getRule().isSuperTypeOf(
					domainElement.eClass())) {
				return RuleEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getEvent().isSuperTypeOf(
					domainElement.eClass())) {
				return EventEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getEventPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return EventPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getEventOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return EventOutputEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getWindow().isSuperTypeOf(
					domainElement.eClass())) {
				return WindowEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getTargetGroupby().isSuperTypeOf(
					domainElement.eClass())) {
				return TargetGroupbyEditPart.VISUAL_ID;
			}
			break;
		case RuleRuleQueriesCompartmentEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return TargetEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator5EditPart.VISUAL_ID;
			}
			break;
		case TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimerEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregationEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyConditionEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperatorEditPart.VISUAL_ID;
			}
			break;
		case TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimerEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregationEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyConditionEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperatorEditPart.VISUAL_ID;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator4EditPart.VISUAL_ID;
			}
			break;
		case TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimerEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregationEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyConditionEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperatorEditPart.VISUAL_ID;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator3EditPart.VISUAL_ID;
			}
			break;
		case TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimerEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregationEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyConditionEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperatorEditPart.VISUAL_ID;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator2EditPart.VISUAL_ID;
			}
			break;
		case TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimerEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregationEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyConditionEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperatorEditPart.VISUAL_ID;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator4EditPart.VISUAL_ID;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator4EditPart.VISUAL_ID;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator3EditPart.VISUAL_ID;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator4EditPart.VISUAL_ID;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator2EditPart.VISUAL_ID;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator3EditPart.VISUAL_ID;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator3EditPart.VISUAL_ID;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator2EditPart.VISUAL_ID;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator2EditPart.VISUAL_ID;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator4EditPart.VISUAL_ID;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator3EditPart.VISUAL_ID;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator2EditPart.VISUAL_ID;
			}
			break;
		case EventEventAttributesCompartmentEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern6EditPart.VISUAL_ID;
			}
			break;
		case TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimerEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregationEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyConditionEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperatorEditPart.VISUAL_ID;
			}
			break;
		case EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target7EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not7EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern7EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer7EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern7EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator6EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator6EditPart.VISUAL_ID;
			}
			break;
		case TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimerEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPatternEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return AggregationEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyConditionEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroupEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorEditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperatorEditPart.VISUAL_ID;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator4EditPart.VISUAL_ID;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator3EditPart.VISUAL_ID;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID:
			if (DsmlPackage.eINSTANCE.getTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return Target5EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getNot().isSuperTypeOf(
					domainElement.eClass())) {
				return Not2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getUnaryPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return UnaryPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getPatternTimer().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternTimer2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getRepeatPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return RepeatPattern2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getAggregation().isSuperTypeOf(
					domainElement.eClass())) {
				return Aggregation2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getConditionGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionGroup2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getGroupbyCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupbyCondition3EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getBringGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return BringGroup4EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return Operator2EditPart.VISUAL_ID;
			}
			if (DsmlPackage.eINSTANCE.getValueOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return ValueOperator2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dsml.diagram.part.DsmlVisualIDRegistry
				.getModelID(containerView);
		if (!DrawingAreaEditPart.MODEL_ID.equals(containerModelID)
				&& !"dsml".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DrawingAreaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dsml.diagram.part.DsmlVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DrawingAreaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DrawingAreaEditPart.VISUAL_ID:
			if (RuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WindowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TargetGroupbyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleEditPart.VISUAL_ID:
			if (RuleRuleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RuleRuleQueriesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEditPart.VISUAL_ID:
			if (EventEventNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEventAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPatternEditPart.VISUAL_ID:
			if (EventPatternEventPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventOutputEditPart.VISUAL_ID:
			if (EventOutputOutputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WindowEditPart.VISUAL_ID:
			if (WindowWindowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetGroupbyEditPart.VISUAL_ID:
			if (TargetGroupbyTargetGroupbyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetEditPart.VISUAL_ID:
			if (TargetTargetAliasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Target2EditPart.VISUAL_ID:
			if (TargetTargetAlias2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotEditPart.VISUAL_ID:
			if (NotDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryPatternEditPart.VISUAL_ID:
			if (UnaryPatternNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternTimerEditPart.VISUAL_ID:
			if (PatternTimerPatternTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatPatternEditPart.VISUAL_ID:
			if (RepeatPatternRepeatPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregationEditPart.VISUAL_ID:
			if (AggregationTypeAggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroupEditPart.VISUAL_ID:
			if (ConditionGroupConditionGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Target3EditPart.VISUAL_ID:
			if (TargetTargetAlias3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyConditionEditPart.VISUAL_ID:
			if (GroupbyConditionGroupbyConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Target4EditPart.VISUAL_ID:
			if (TargetTargetAlias4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroupEditPart.VISUAL_ID:
			if (BringGroupBringGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Target5EditPart.VISUAL_ID:
			if (TargetTargetAlias5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperatorEditPart.VISUAL_ID:
			if (OperatorOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueOperatorEditPart.VISUAL_ID:
			if (ValueOperatorValueOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Not2EditPart.VISUAL_ID:
			if (NotDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryPattern2EditPart.VISUAL_ID:
			if (UnaryPatternName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternTimer2EditPart.VISUAL_ID:
			if (PatternTimerPatternTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatPattern2EditPart.VISUAL_ID:
			if (RepeatPatternRepeatPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Aggregation2EditPart.VISUAL_ID:
			if (AggregationTypeAggregation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroup2EditPart.VISUAL_ID:
			if (ConditionGroupConditionGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Not3EditPart.VISUAL_ID:
			if (NotDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryPattern3EditPart.VISUAL_ID:
			if (UnaryPatternName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternTimer3EditPart.VISUAL_ID:
			if (PatternTimerPatternTimer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatPattern3EditPart.VISUAL_ID:
			if (RepeatPatternRepeatPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Aggregation3EditPart.VISUAL_ID:
			if (AggregationTypeAggregation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroup3EditPart.VISUAL_ID:
			if (ConditionGroupConditionGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyCondition2EditPart.VISUAL_ID:
			if (GroupbyConditionGroupbyCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Not4EditPart.VISUAL_ID:
			if (NotDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryPattern4EditPart.VISUAL_ID:
			if (UnaryPatternName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternTimer4EditPart.VISUAL_ID:
			if (PatternTimerPatternTimer4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatPattern4EditPart.VISUAL_ID:
			if (RepeatPatternRepeatPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Aggregation4EditPart.VISUAL_ID:
			if (AggregationTypeAggregation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroup4EditPart.VISUAL_ID:
			if (ConditionGroupConditionGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroup2EditPart.VISUAL_ID:
			if (BringGroupBringGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyCondition3EditPart.VISUAL_ID:
			if (GroupbyConditionGroupbyCondition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyCondition4EditPart.VISUAL_ID:
			if (GroupbyConditionGroupbyCondition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroup3EditPart.VISUAL_ID:
			if (BringGroupBringGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroup4EditPart.VISUAL_ID:
			if (BringGroupBringGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operator2EditPart.VISUAL_ID:
			if (OperatorOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueOperator2EditPart.VISUAL_ID:
			if (ValueOperatorValueOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operator3EditPart.VISUAL_ID:
			if (OperatorOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueOperator3EditPart.VISUAL_ID:
			if (ValueOperatorValueOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operator4EditPart.VISUAL_ID:
			if (OperatorOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueOperator4EditPart.VISUAL_ID:
			if (ValueOperatorValueOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Not5EditPart.VISUAL_ID:
			if (NotDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryPattern5EditPart.VISUAL_ID:
			if (UnaryPatternName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternTimer5EditPart.VISUAL_ID:
			if (PatternTimerPatternTimer5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatPattern5EditPart.VISUAL_ID:
			if (RepeatPatternRepeatPattern5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Aggregation5EditPart.VISUAL_ID:
			if (AggregationTypeAggregation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroup5EditPart.VISUAL_ID:
			if (ConditionGroupConditionGroup5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyCondition5EditPart.VISUAL_ID:
			if (GroupbyConditionGroupbyCondition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroup5EditPart.VISUAL_ID:
			if (BringGroupBringGroup5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operator5EditPart.VISUAL_ID:
			if (OperatorOperator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueOperator5EditPart.VISUAL_ID:
			if (ValueOperatorValueOperator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Target6EditPart.VISUAL_ID:
			if (TargetTargetAlias6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Not6EditPart.VISUAL_ID:
			if (NotDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryPattern6EditPart.VISUAL_ID:
			if (UnaryPatternName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternTimer6EditPart.VISUAL_ID:
			if (PatternTimerPatternTimer6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatPattern6EditPart.VISUAL_ID:
			if (RepeatPatternRepeatPattern6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Target7EditPart.VISUAL_ID:
			if (TargetTargetAlias7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Not7EditPart.VISUAL_ID:
			if (NotDescription7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryPattern7EditPart.VISUAL_ID:
			if (UnaryPatternName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternTimer7EditPart.VISUAL_ID:
			if (PatternTimerPatternTimer7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatPattern7EditPart.VISUAL_ID:
			if (RepeatPatternRepeatPattern7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Aggregation6EditPart.VISUAL_ID:
			if (AggregationTypeAggregation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroup6EditPart.VISUAL_ID:
			if (ConditionGroupConditionGroup6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyCondition6EditPart.VISUAL_ID:
			if (GroupbyConditionGroupbyCondition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroup6EditPart.VISUAL_ID:
			if (BringGroupBringGroup6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Operator6EditPart.VISUAL_ID:
			if (OperatorOperator6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueOperator6EditPart.VISUAL_ID:
			if (ValueOperatorValueOperator6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RuleRuleQueriesCompartmentEditPart.VISUAL_ID:
			if (TargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID:
			if (Target2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID:
			if (Target2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID:
			if (Target3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID:
			if (Target2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID:
			if (Target4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID:
			if (Target2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID:
			if (Target5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID:
			if (Target2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID:
			if (Target3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID:
			if (Target3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID:
			if (Target4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID:
			if (Target3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID:
			if (Target5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID:
			if (Target4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID:
			if (Target4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID:
			if (Target5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID:
			if (Target5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID:
			if (Target3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID:
			if (Target4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID:
			if (Target5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEventAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID:
			if (Target6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID:
			if (Target2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID:
			if (Target7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID:
			if (Target2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AggregationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID:
			if (Target3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID:
			if (Target4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID:
			if (Target5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatPattern2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Aggregation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionGroup2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupbyCondition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BringGroup4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Operator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComparisonEditPart.VISUAL_ID:
			if (ComparisonComparisonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArithmeticEditPart.VISUAL_ID:
			if (ArithmeticArithmeticEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalConnectorEditPart.VISUAL_ID:
			if (LogicalConnectorTypeLogicalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkPatternTargetEditPart.VISUAL_ID:
			if (LinkPatternTargetComparisonTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DsmlPackage.eINSTANCE.getComparison().isSuperTypeOf(
				domainElement.eClass())) {
			return ComparisonEditPart.VISUAL_ID;
		}
		if (DsmlPackage.eINSTANCE.getArithmetic().isSuperTypeOf(
				domainElement.eClass())) {
			return ArithmeticEditPart.VISUAL_ID;
		}
		if (DsmlPackage.eINSTANCE.getLogicalConnector().isSuperTypeOf(
				domainElement.eClass())) {
			return LogicalConnectorEditPart.VISUAL_ID;
		}
		if (DsmlPackage.eINSTANCE.getLinkTarget().isSuperTypeOf(
				domainElement.eClass())) {
			return LinkTargetEditPart.VISUAL_ID;
		}
		if (DsmlPackage.eINSTANCE.getLinkPatternTarget().isSuperTypeOf(
				domainElement.eClass())) {
			return LinkPatternTargetEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(DrawingArea element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case RuleRuleQueriesCompartmentEditPart.VISUAL_ID:
		case TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID:
		case TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID:
		case ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID:
		case TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID:
		case GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID:
		case TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID:
		case BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID:
		case TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID:
		case ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID:
		case ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID:
		case GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID:
		case ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID:
		case BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID:
		case GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID:
		case GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID:
		case BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID:
		case BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID:
		case ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID:
		case GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID:
		case BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID:
		case EventEventAttributesCompartmentEditPart.VISUAL_ID:
		case EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID:
		case TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID:
		case EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID:
		case TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID:
		case ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID:
		case GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID:
		case BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DrawingAreaEditPart.VISUAL_ID:
			return false;
		case WindowEditPart.VISUAL_ID:
		case TargetGroupbyEditPart.VISUAL_ID:
		case NotEditPart.VISUAL_ID:
		case UnaryPatternEditPart.VISUAL_ID:
		case PatternTimerEditPart.VISUAL_ID:
		case RepeatPatternEditPart.VISUAL_ID:
		case AggregationEditPart.VISUAL_ID:
		case OperatorEditPart.VISUAL_ID:
		case ValueOperatorEditPart.VISUAL_ID:
		case Not2EditPart.VISUAL_ID:
		case UnaryPattern2EditPart.VISUAL_ID:
		case PatternTimer2EditPart.VISUAL_ID:
		case RepeatPattern2EditPart.VISUAL_ID:
		case Aggregation2EditPart.VISUAL_ID:
		case Not3EditPart.VISUAL_ID:
		case UnaryPattern3EditPart.VISUAL_ID:
		case PatternTimer3EditPart.VISUAL_ID:
		case RepeatPattern3EditPart.VISUAL_ID:
		case Aggregation3EditPart.VISUAL_ID:
		case Not4EditPart.VISUAL_ID:
		case UnaryPattern4EditPart.VISUAL_ID:
		case PatternTimer4EditPart.VISUAL_ID:
		case RepeatPattern4EditPart.VISUAL_ID:
		case Aggregation4EditPart.VISUAL_ID:
		case Operator2EditPart.VISUAL_ID:
		case ValueOperator2EditPart.VISUAL_ID:
		case Operator3EditPart.VISUAL_ID:
		case ValueOperator3EditPart.VISUAL_ID:
		case Operator4EditPart.VISUAL_ID:
		case ValueOperator4EditPart.VISUAL_ID:
		case Not5EditPart.VISUAL_ID:
		case UnaryPattern5EditPart.VISUAL_ID:
		case PatternTimer5EditPart.VISUAL_ID:
		case RepeatPattern5EditPart.VISUAL_ID:
		case Aggregation5EditPart.VISUAL_ID:
		case Operator5EditPart.VISUAL_ID:
		case ValueOperator5EditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case Not6EditPart.VISUAL_ID:
		case UnaryPattern6EditPart.VISUAL_ID:
		case PatternTimer6EditPart.VISUAL_ID:
		case RepeatPattern6EditPart.VISUAL_ID:
		case Not7EditPart.VISUAL_ID:
		case UnaryPattern7EditPart.VISUAL_ID:
		case PatternTimer7EditPart.VISUAL_ID:
		case RepeatPattern7EditPart.VISUAL_ID:
		case Aggregation6EditPart.VISUAL_ID:
		case Operator6EditPart.VISUAL_ID:
		case ValueOperator6EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return dsml.diagram.part.DsmlVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return dsml.diagram.part.DsmlVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return dsml.diagram.part.DsmlVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return dsml.diagram.part.DsmlVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return dsml.diagram.part.DsmlVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return dsml.diagram.part.DsmlVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}