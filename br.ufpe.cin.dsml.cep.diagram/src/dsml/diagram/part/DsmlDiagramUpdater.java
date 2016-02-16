/*
 * 
 */
package dsml.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import dsml.Aggregation;
import dsml.Arithmetic;
import dsml.Attribute;
import dsml.BringGroup;
import dsml.Comparison;
import dsml.Component;
import dsml.ConditionGroup;
import dsml.DrawingArea;
import dsml.DsmlPackage;
import dsml.Event;
import dsml.EventOutput;
import dsml.EventPattern;
import dsml.GroupbyCondition;
import dsml.LinkPatternTarget;
import dsml.LinkTarget;
import dsml.LogicalConnector;
import dsml.Not;
import dsml.Operator;
import dsml.Pattern;
import dsml.PatternTimer;
import dsml.Query;
import dsml.RepeatPattern;
import dsml.Rule;
import dsml.Target;
import dsml.TargetGroupby;
import dsml.UnaryPattern;
import dsml.ValueOperator;
import dsml.Window;
import dsml.diagram.edit.parts.*;
import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class DsmlDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getSemanticChildren(View view) {
		switch (DsmlVisualIDRegistry.getVisualID(view)) {
		case DrawingAreaEditPart.VISUAL_ID:
			return getDrawingArea_1000SemanticChildren(view);
		case RuleRuleQueriesCompartmentEditPart.VISUAL_ID:
			return getRuleRuleQueriesCompartment_7001SemanticChildren(view);
		case TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID:
			return getTargetTargetOperationTypesCompartment_7002SemanticChildren(view);
		case TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID:
			return getTargetTargetOperationTypesCompartment_7003SemanticChildren(view);
		case ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID:
			return getConditionGroupConditionGroupOperationTypesCompartment_7004SemanticChildren(view);
		case TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID:
			return getTargetTargetOperationTypesCompartment_7005SemanticChildren(view);
		case GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyConditionOperationTypesCompartment_7006SemanticChildren(view);
		case TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID:
			return getTargetTargetOperationTypesCompartment_7007SemanticChildren(view);
		case BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID:
			return getBringGroupBringGroupOperationTypesCompartment_7008SemanticChildren(view);
		case TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID:
			return getTargetTargetOperationTypesCompartment_7009SemanticChildren(view);
		case ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID:
			return getConditionGroupConditionGroupOperationTypesCompartment_7010SemanticChildren(view);
		case ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID:
			return getConditionGroupConditionGroupOperationTypesCompartment_7011SemanticChildren(view);
		case GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyConditionOperationTypesCompartment_7012SemanticChildren(view);
		case ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID:
			return getConditionGroupConditionGroupOperationTypesCompartment_7013SemanticChildren(view);
		case BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID:
			return getBringGroupBringGroupOperationTypesCompartment_7014SemanticChildren(view);
		case GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyConditionOperationTypesCompartment_7015SemanticChildren(view);
		case GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyConditionOperationTypesCompartment_7016SemanticChildren(view);
		case BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID:
			return getBringGroupBringGroupOperationTypesCompartment_7017SemanticChildren(view);
		case BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID:
			return getBringGroupBringGroupOperationTypesCompartment_7018SemanticChildren(view);
		case ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID:
			return getConditionGroupConditionGroupOperationTypesCompartment_7019SemanticChildren(view);
		case GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyConditionOperationTypesCompartment_7020SemanticChildren(view);
		case BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID:
			return getBringGroupBringGroupOperationTypesCompartment_7021SemanticChildren(view);
		case EventEventAttributesCompartmentEditPart.VISUAL_ID:
			return getEventEventAttributesCompartment_7022SemanticChildren(view);
		case EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID:
			return getEventPatternEventPatternNodeCompartment_7023SemanticChildren(view);
		case TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID:
			return getTargetTargetOperationTypesCompartment_7024SemanticChildren(view);
		case EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID:
			return getEventOutputEventOutputQueriesCompartment_7025SemanticChildren(view);
		case TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID:
			return getTargetTargetOperationTypesCompartment_7026SemanticChildren(view);
		case ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID:
			return getConditionGroupConditionGroupOperationTypesCompartment_7027SemanticChildren(view);
		case GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyConditionOperationTypesCompartment_7028SemanticChildren(view);
		case BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID:
			return getBringGroupBringGroupOperationTypesCompartment_7029SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getDrawingArea_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DrawingArea modelElement = (DrawingArea) view.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		{
			Rule childElement = modelElement.getRule();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RuleEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getEvents().iterator(); it.hasNext();) {
			Event childElement = (Event) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			EventPattern childElement = modelElement.getPatterns();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
			}
		}
		{
			EventOutput childElement = modelElement.getOutput();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EventOutputEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getWindows().iterator(); it
				.hasNext();) {
			Window childElement = (Window) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WindowEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTargetGroupby().iterator(); it
				.hasNext();) {
			TargetGroupby childElement = (TargetGroupby) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TargetGroupbyEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getRuleRuleQueriesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Rule modelElement = (Rule) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getQueries().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TargetEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getTargetTargetOperationTypesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Target modelElement = (Target) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimerEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregationEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyConditionEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getTargetTargetOperationTypesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Target modelElement = (Target) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimerEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregationEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyConditionEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getConditionGroupConditionGroupOperationTypesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionGroup modelElement = (ConditionGroup) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getTargetTargetOperationTypesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Target modelElement = (Target) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimerEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregationEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyConditionEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getGroupbyConditionGroupbyConditionOperationTypesCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupbyCondition modelElement = (GroupbyCondition) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getTargetTargetOperationTypesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Target modelElement = (Target) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimerEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregationEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyConditionEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getBringGroupBringGroupOperationTypesCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BringGroup modelElement = (BringGroup) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getTargetTargetOperationTypesCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Target modelElement = (Target) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimerEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregationEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyConditionEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getConditionGroupConditionGroupOperationTypesCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionGroup modelElement = (ConditionGroup) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getConditionGroupConditionGroupOperationTypesCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionGroup modelElement = (ConditionGroup) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getGroupbyConditionGroupbyConditionOperationTypesCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupbyCondition modelElement = (GroupbyCondition) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getConditionGroupConditionGroupOperationTypesCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionGroup modelElement = (ConditionGroup) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getBringGroupBringGroupOperationTypesCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BringGroup modelElement = (BringGroup) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getGroupbyConditionGroupbyConditionOperationTypesCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupbyCondition modelElement = (GroupbyCondition) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getGroupbyConditionGroupbyConditionOperationTypesCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupbyCondition modelElement = (GroupbyCondition) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getBringGroupBringGroupOperationTypesCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BringGroup modelElement = (BringGroup) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getBringGroupBringGroupOperationTypesCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BringGroup modelElement = (BringGroup) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getConditionGroupConditionGroupOperationTypesCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionGroup modelElement = (ConditionGroup) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getGroupbyConditionGroupbyConditionOperationTypesCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupbyCondition modelElement = (GroupbyCondition) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getBringGroupBringGroupOperationTypesCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BringGroup modelElement = (BringGroup) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getEventEventAttributesCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Event modelElement = (Event) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getEventPatternEventPatternNodeCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventPattern modelElement = (EventPattern) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNode().iterator(); it.hasNext();) {
			Pattern childElement = (Pattern) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getTargetTargetOperationTypesCompartment_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Target modelElement = (Target) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimerEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregationEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyConditionEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getEventOutputEventOutputQueriesCompartment_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventOutput modelElement = (EventOutput) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getQueries().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target7EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not7EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern7EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer7EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern7EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator6EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getTargetTargetOperationTypesCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Target modelElement = (Target) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimerEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPatternEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AggregationEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyConditionEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroupEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperatorEditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getConditionGroupConditionGroupOperationTypesCompartment_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionGroup modelElement = (ConditionGroup) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getGroupbyConditionGroupbyConditionOperationTypesCompartment_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		GroupbyCondition modelElement = (GroupbyCondition) containerView
				.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlNodeDescriptor> getBringGroupBringGroupOperationTypesCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BringGroup modelElement = (BringGroup) containerView.getElement();
		LinkedList<DsmlNodeDescriptor> result = new LinkedList<DsmlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperationTypes().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsmlVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Target5EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnaryPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PatternTimer2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatPattern2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Aggregation2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionGroup2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupbyCondition3EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BringGroup4EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Operator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueOperator2EditPart.VISUAL_ID) {
				result.add(new DsmlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getContainedLinks(View view) {
		switch (DsmlVisualIDRegistry.getVisualID(view)) {
		case DrawingAreaEditPart.VISUAL_ID:
			return getDrawingArea_1000ContainedLinks(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2001ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2002ContainedLinks(view);
		case EventPatternEditPart.VISUAL_ID:
			return getEventPattern_2003ContainedLinks(view);
		case EventOutputEditPart.VISUAL_ID:
			return getEventOutput_2004ContainedLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_2005ContainedLinks(view);
		case TargetGroupbyEditPart.VISUAL_ID:
			return getTargetGroupby_2006ContainedLinks(view);
		case TargetEditPart.VISUAL_ID:
			return getTarget_3001ContainedLinks(view);
		case Target2EditPart.VISUAL_ID:
			return getTarget_3002ContainedLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_3003ContainedLinks(view);
		case UnaryPatternEditPart.VISUAL_ID:
			return getUnaryPattern_3004ContainedLinks(view);
		case PatternTimerEditPart.VISUAL_ID:
			return getPatternTimer_3005ContainedLinks(view);
		case RepeatPatternEditPart.VISUAL_ID:
			return getRepeatPattern_3006ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_3007ContainedLinks(view);
		case ConditionGroupEditPart.VISUAL_ID:
			return getConditionGroup_3008ContainedLinks(view);
		case Target3EditPart.VISUAL_ID:
			return getTarget_3009ContainedLinks(view);
		case GroupbyConditionEditPart.VISUAL_ID:
			return getGroupbyCondition_3010ContainedLinks(view);
		case Target4EditPart.VISUAL_ID:
			return getTarget_3011ContainedLinks(view);
		case BringGroupEditPart.VISUAL_ID:
			return getBringGroup_3012ContainedLinks(view);
		case Target5EditPart.VISUAL_ID:
			return getTarget_3013ContainedLinks(view);
		case OperatorEditPart.VISUAL_ID:
			return getOperator_3014ContainedLinks(view);
		case ValueOperatorEditPart.VISUAL_ID:
			return getValueOperator_3015ContainedLinks(view);
		case Not2EditPart.VISUAL_ID:
			return getNot_3016ContainedLinks(view);
		case UnaryPattern2EditPart.VISUAL_ID:
			return getUnaryPattern_3017ContainedLinks(view);
		case PatternTimer2EditPart.VISUAL_ID:
			return getPatternTimer_3018ContainedLinks(view);
		case RepeatPattern2EditPart.VISUAL_ID:
			return getRepeatPattern_3019ContainedLinks(view);
		case Aggregation2EditPart.VISUAL_ID:
			return getAggregation_3020ContainedLinks(view);
		case ConditionGroup2EditPart.VISUAL_ID:
			return getConditionGroup_3021ContainedLinks(view);
		case Not3EditPart.VISUAL_ID:
			return getNot_3022ContainedLinks(view);
		case UnaryPattern3EditPart.VISUAL_ID:
			return getUnaryPattern_3023ContainedLinks(view);
		case PatternTimer3EditPart.VISUAL_ID:
			return getPatternTimer_3024ContainedLinks(view);
		case RepeatPattern3EditPart.VISUAL_ID:
			return getRepeatPattern_3025ContainedLinks(view);
		case Aggregation3EditPart.VISUAL_ID:
			return getAggregation_3026ContainedLinks(view);
		case ConditionGroup3EditPart.VISUAL_ID:
			return getConditionGroup_3027ContainedLinks(view);
		case GroupbyCondition2EditPart.VISUAL_ID:
			return getGroupbyCondition_3028ContainedLinks(view);
		case Not4EditPart.VISUAL_ID:
			return getNot_3029ContainedLinks(view);
		case UnaryPattern4EditPart.VISUAL_ID:
			return getUnaryPattern_3030ContainedLinks(view);
		case PatternTimer4EditPart.VISUAL_ID:
			return getPatternTimer_3031ContainedLinks(view);
		case RepeatPattern4EditPart.VISUAL_ID:
			return getRepeatPattern_3032ContainedLinks(view);
		case Aggregation4EditPart.VISUAL_ID:
			return getAggregation_3033ContainedLinks(view);
		case ConditionGroup4EditPart.VISUAL_ID:
			return getConditionGroup_3034ContainedLinks(view);
		case BringGroup2EditPart.VISUAL_ID:
			return getBringGroup_3035ContainedLinks(view);
		case GroupbyCondition3EditPart.VISUAL_ID:
			return getGroupbyCondition_3036ContainedLinks(view);
		case GroupbyCondition4EditPart.VISUAL_ID:
			return getGroupbyCondition_3037ContainedLinks(view);
		case BringGroup3EditPart.VISUAL_ID:
			return getBringGroup_3038ContainedLinks(view);
		case BringGroup4EditPart.VISUAL_ID:
			return getBringGroup_3039ContainedLinks(view);
		case Operator2EditPart.VISUAL_ID:
			return getOperator_3040ContainedLinks(view);
		case ValueOperator2EditPart.VISUAL_ID:
			return getValueOperator_3041ContainedLinks(view);
		case Operator3EditPart.VISUAL_ID:
			return getOperator_3042ContainedLinks(view);
		case ValueOperator3EditPart.VISUAL_ID:
			return getValueOperator_3043ContainedLinks(view);
		case Operator4EditPart.VISUAL_ID:
			return getOperator_3044ContainedLinks(view);
		case ValueOperator4EditPart.VISUAL_ID:
			return getValueOperator_3045ContainedLinks(view);
		case Not5EditPart.VISUAL_ID:
			return getNot_3046ContainedLinks(view);
		case UnaryPattern5EditPart.VISUAL_ID:
			return getUnaryPattern_3047ContainedLinks(view);
		case PatternTimer5EditPart.VISUAL_ID:
			return getPatternTimer_3048ContainedLinks(view);
		case RepeatPattern5EditPart.VISUAL_ID:
			return getRepeatPattern_3049ContainedLinks(view);
		case Aggregation5EditPart.VISUAL_ID:
			return getAggregation_3050ContainedLinks(view);
		case ConditionGroup5EditPart.VISUAL_ID:
			return getConditionGroup_3051ContainedLinks(view);
		case GroupbyCondition5EditPart.VISUAL_ID:
			return getGroupbyCondition_3052ContainedLinks(view);
		case BringGroup5EditPart.VISUAL_ID:
			return getBringGroup_3053ContainedLinks(view);
		case Operator5EditPart.VISUAL_ID:
			return getOperator_3054ContainedLinks(view);
		case ValueOperator5EditPart.VISUAL_ID:
			return getValueOperator_3055ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3056ContainedLinks(view);
		case Target6EditPart.VISUAL_ID:
			return getTarget_3057ContainedLinks(view);
		case Not6EditPart.VISUAL_ID:
			return getNot_3058ContainedLinks(view);
		case UnaryPattern6EditPart.VISUAL_ID:
			return getUnaryPattern_3059ContainedLinks(view);
		case PatternTimer6EditPart.VISUAL_ID:
			return getPatternTimer_3060ContainedLinks(view);
		case RepeatPattern6EditPart.VISUAL_ID:
			return getRepeatPattern_3061ContainedLinks(view);
		case Target7EditPart.VISUAL_ID:
			return getTarget_3062ContainedLinks(view);
		case Not7EditPart.VISUAL_ID:
			return getNot_3063ContainedLinks(view);
		case UnaryPattern7EditPart.VISUAL_ID:
			return getUnaryPattern_3064ContainedLinks(view);
		case PatternTimer7EditPart.VISUAL_ID:
			return getPatternTimer_3065ContainedLinks(view);
		case RepeatPattern7EditPart.VISUAL_ID:
			return getRepeatPattern_3066ContainedLinks(view);
		case Aggregation6EditPart.VISUAL_ID:
			return getAggregation_3067ContainedLinks(view);
		case ConditionGroup6EditPart.VISUAL_ID:
			return getConditionGroup_3068ContainedLinks(view);
		case GroupbyCondition6EditPart.VISUAL_ID:
			return getGroupbyCondition_3069ContainedLinks(view);
		case BringGroup6EditPart.VISUAL_ID:
			return getBringGroup_3070ContainedLinks(view);
		case Operator6EditPart.VISUAL_ID:
			return getOperator_3071ContainedLinks(view);
		case ValueOperator6EditPart.VISUAL_ID:
			return getValueOperator_3072ContainedLinks(view);
		case ComparisonEditPart.VISUAL_ID:
			return getComparison_4001ContainedLinks(view);
		case ArithmeticEditPart.VISUAL_ID:
			return getArithmetic_4002ContainedLinks(view);
		case LogicalConnectorEditPart.VISUAL_ID:
			return getLogicalConnector_4003ContainedLinks(view);
		case LinkTargetEditPart.VISUAL_ID:
			return getLinkTarget_4004ContainedLinks(view);
		case LinkPatternTargetEditPart.VISUAL_ID:
			return getLinkPatternTarget_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getIncomingLinks(View view) {
		switch (DsmlVisualIDRegistry.getVisualID(view)) {
		case RuleEditPart.VISUAL_ID:
			return getRule_2001IncomingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2002IncomingLinks(view);
		case EventPatternEditPart.VISUAL_ID:
			return getEventPattern_2003IncomingLinks(view);
		case EventOutputEditPart.VISUAL_ID:
			return getEventOutput_2004IncomingLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_2005IncomingLinks(view);
		case TargetGroupbyEditPart.VISUAL_ID:
			return getTargetGroupby_2006IncomingLinks(view);
		case TargetEditPart.VISUAL_ID:
			return getTarget_3001IncomingLinks(view);
		case Target2EditPart.VISUAL_ID:
			return getTarget_3002IncomingLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_3003IncomingLinks(view);
		case UnaryPatternEditPart.VISUAL_ID:
			return getUnaryPattern_3004IncomingLinks(view);
		case PatternTimerEditPart.VISUAL_ID:
			return getPatternTimer_3005IncomingLinks(view);
		case RepeatPatternEditPart.VISUAL_ID:
			return getRepeatPattern_3006IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_3007IncomingLinks(view);
		case ConditionGroupEditPart.VISUAL_ID:
			return getConditionGroup_3008IncomingLinks(view);
		case Target3EditPart.VISUAL_ID:
			return getTarget_3009IncomingLinks(view);
		case GroupbyConditionEditPart.VISUAL_ID:
			return getGroupbyCondition_3010IncomingLinks(view);
		case Target4EditPart.VISUAL_ID:
			return getTarget_3011IncomingLinks(view);
		case BringGroupEditPart.VISUAL_ID:
			return getBringGroup_3012IncomingLinks(view);
		case Target5EditPart.VISUAL_ID:
			return getTarget_3013IncomingLinks(view);
		case OperatorEditPart.VISUAL_ID:
			return getOperator_3014IncomingLinks(view);
		case ValueOperatorEditPart.VISUAL_ID:
			return getValueOperator_3015IncomingLinks(view);
		case Not2EditPart.VISUAL_ID:
			return getNot_3016IncomingLinks(view);
		case UnaryPattern2EditPart.VISUAL_ID:
			return getUnaryPattern_3017IncomingLinks(view);
		case PatternTimer2EditPart.VISUAL_ID:
			return getPatternTimer_3018IncomingLinks(view);
		case RepeatPattern2EditPart.VISUAL_ID:
			return getRepeatPattern_3019IncomingLinks(view);
		case Aggregation2EditPart.VISUAL_ID:
			return getAggregation_3020IncomingLinks(view);
		case ConditionGroup2EditPart.VISUAL_ID:
			return getConditionGroup_3021IncomingLinks(view);
		case Not3EditPart.VISUAL_ID:
			return getNot_3022IncomingLinks(view);
		case UnaryPattern3EditPart.VISUAL_ID:
			return getUnaryPattern_3023IncomingLinks(view);
		case PatternTimer3EditPart.VISUAL_ID:
			return getPatternTimer_3024IncomingLinks(view);
		case RepeatPattern3EditPart.VISUAL_ID:
			return getRepeatPattern_3025IncomingLinks(view);
		case Aggregation3EditPart.VISUAL_ID:
			return getAggregation_3026IncomingLinks(view);
		case ConditionGroup3EditPart.VISUAL_ID:
			return getConditionGroup_3027IncomingLinks(view);
		case GroupbyCondition2EditPart.VISUAL_ID:
			return getGroupbyCondition_3028IncomingLinks(view);
		case Not4EditPart.VISUAL_ID:
			return getNot_3029IncomingLinks(view);
		case UnaryPattern4EditPart.VISUAL_ID:
			return getUnaryPattern_3030IncomingLinks(view);
		case PatternTimer4EditPart.VISUAL_ID:
			return getPatternTimer_3031IncomingLinks(view);
		case RepeatPattern4EditPart.VISUAL_ID:
			return getRepeatPattern_3032IncomingLinks(view);
		case Aggregation4EditPart.VISUAL_ID:
			return getAggregation_3033IncomingLinks(view);
		case ConditionGroup4EditPart.VISUAL_ID:
			return getConditionGroup_3034IncomingLinks(view);
		case BringGroup2EditPart.VISUAL_ID:
			return getBringGroup_3035IncomingLinks(view);
		case GroupbyCondition3EditPart.VISUAL_ID:
			return getGroupbyCondition_3036IncomingLinks(view);
		case GroupbyCondition4EditPart.VISUAL_ID:
			return getGroupbyCondition_3037IncomingLinks(view);
		case BringGroup3EditPart.VISUAL_ID:
			return getBringGroup_3038IncomingLinks(view);
		case BringGroup4EditPart.VISUAL_ID:
			return getBringGroup_3039IncomingLinks(view);
		case Operator2EditPart.VISUAL_ID:
			return getOperator_3040IncomingLinks(view);
		case ValueOperator2EditPart.VISUAL_ID:
			return getValueOperator_3041IncomingLinks(view);
		case Operator3EditPart.VISUAL_ID:
			return getOperator_3042IncomingLinks(view);
		case ValueOperator3EditPart.VISUAL_ID:
			return getValueOperator_3043IncomingLinks(view);
		case Operator4EditPart.VISUAL_ID:
			return getOperator_3044IncomingLinks(view);
		case ValueOperator4EditPart.VISUAL_ID:
			return getValueOperator_3045IncomingLinks(view);
		case Not5EditPart.VISUAL_ID:
			return getNot_3046IncomingLinks(view);
		case UnaryPattern5EditPart.VISUAL_ID:
			return getUnaryPattern_3047IncomingLinks(view);
		case PatternTimer5EditPart.VISUAL_ID:
			return getPatternTimer_3048IncomingLinks(view);
		case RepeatPattern5EditPart.VISUAL_ID:
			return getRepeatPattern_3049IncomingLinks(view);
		case Aggregation5EditPart.VISUAL_ID:
			return getAggregation_3050IncomingLinks(view);
		case ConditionGroup5EditPart.VISUAL_ID:
			return getConditionGroup_3051IncomingLinks(view);
		case GroupbyCondition5EditPart.VISUAL_ID:
			return getGroupbyCondition_3052IncomingLinks(view);
		case BringGroup5EditPart.VISUAL_ID:
			return getBringGroup_3053IncomingLinks(view);
		case Operator5EditPart.VISUAL_ID:
			return getOperator_3054IncomingLinks(view);
		case ValueOperator5EditPart.VISUAL_ID:
			return getValueOperator_3055IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3056IncomingLinks(view);
		case Target6EditPart.VISUAL_ID:
			return getTarget_3057IncomingLinks(view);
		case Not6EditPart.VISUAL_ID:
			return getNot_3058IncomingLinks(view);
		case UnaryPattern6EditPart.VISUAL_ID:
			return getUnaryPattern_3059IncomingLinks(view);
		case PatternTimer6EditPart.VISUAL_ID:
			return getPatternTimer_3060IncomingLinks(view);
		case RepeatPattern6EditPart.VISUAL_ID:
			return getRepeatPattern_3061IncomingLinks(view);
		case Target7EditPart.VISUAL_ID:
			return getTarget_3062IncomingLinks(view);
		case Not7EditPart.VISUAL_ID:
			return getNot_3063IncomingLinks(view);
		case UnaryPattern7EditPart.VISUAL_ID:
			return getUnaryPattern_3064IncomingLinks(view);
		case PatternTimer7EditPart.VISUAL_ID:
			return getPatternTimer_3065IncomingLinks(view);
		case RepeatPattern7EditPart.VISUAL_ID:
			return getRepeatPattern_3066IncomingLinks(view);
		case Aggregation6EditPart.VISUAL_ID:
			return getAggregation_3067IncomingLinks(view);
		case ConditionGroup6EditPart.VISUAL_ID:
			return getConditionGroup_3068IncomingLinks(view);
		case GroupbyCondition6EditPart.VISUAL_ID:
			return getGroupbyCondition_3069IncomingLinks(view);
		case BringGroup6EditPart.VISUAL_ID:
			return getBringGroup_3070IncomingLinks(view);
		case Operator6EditPart.VISUAL_ID:
			return getOperator_3071IncomingLinks(view);
		case ValueOperator6EditPart.VISUAL_ID:
			return getValueOperator_3072IncomingLinks(view);
		case ComparisonEditPart.VISUAL_ID:
			return getComparison_4001IncomingLinks(view);
		case ArithmeticEditPart.VISUAL_ID:
			return getArithmetic_4002IncomingLinks(view);
		case LogicalConnectorEditPart.VISUAL_ID:
			return getLogicalConnector_4003IncomingLinks(view);
		case LinkTargetEditPart.VISUAL_ID:
			return getLinkTarget_4004IncomingLinks(view);
		case LinkPatternTargetEditPart.VISUAL_ID:
			return getLinkPatternTarget_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOutgoingLinks(View view) {
		switch (DsmlVisualIDRegistry.getVisualID(view)) {
		case RuleEditPart.VISUAL_ID:
			return getRule_2001OutgoingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2002OutgoingLinks(view);
		case EventPatternEditPart.VISUAL_ID:
			return getEventPattern_2003OutgoingLinks(view);
		case EventOutputEditPart.VISUAL_ID:
			return getEventOutput_2004OutgoingLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_2005OutgoingLinks(view);
		case TargetGroupbyEditPart.VISUAL_ID:
			return getTargetGroupby_2006OutgoingLinks(view);
		case TargetEditPart.VISUAL_ID:
			return getTarget_3001OutgoingLinks(view);
		case Target2EditPart.VISUAL_ID:
			return getTarget_3002OutgoingLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_3003OutgoingLinks(view);
		case UnaryPatternEditPart.VISUAL_ID:
			return getUnaryPattern_3004OutgoingLinks(view);
		case PatternTimerEditPart.VISUAL_ID:
			return getPatternTimer_3005OutgoingLinks(view);
		case RepeatPatternEditPart.VISUAL_ID:
			return getRepeatPattern_3006OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_3007OutgoingLinks(view);
		case ConditionGroupEditPart.VISUAL_ID:
			return getConditionGroup_3008OutgoingLinks(view);
		case Target3EditPart.VISUAL_ID:
			return getTarget_3009OutgoingLinks(view);
		case GroupbyConditionEditPart.VISUAL_ID:
			return getGroupbyCondition_3010OutgoingLinks(view);
		case Target4EditPart.VISUAL_ID:
			return getTarget_3011OutgoingLinks(view);
		case BringGroupEditPart.VISUAL_ID:
			return getBringGroup_3012OutgoingLinks(view);
		case Target5EditPart.VISUAL_ID:
			return getTarget_3013OutgoingLinks(view);
		case OperatorEditPart.VISUAL_ID:
			return getOperator_3014OutgoingLinks(view);
		case ValueOperatorEditPart.VISUAL_ID:
			return getValueOperator_3015OutgoingLinks(view);
		case Not2EditPart.VISUAL_ID:
			return getNot_3016OutgoingLinks(view);
		case UnaryPattern2EditPart.VISUAL_ID:
			return getUnaryPattern_3017OutgoingLinks(view);
		case PatternTimer2EditPart.VISUAL_ID:
			return getPatternTimer_3018OutgoingLinks(view);
		case RepeatPattern2EditPart.VISUAL_ID:
			return getRepeatPattern_3019OutgoingLinks(view);
		case Aggregation2EditPart.VISUAL_ID:
			return getAggregation_3020OutgoingLinks(view);
		case ConditionGroup2EditPart.VISUAL_ID:
			return getConditionGroup_3021OutgoingLinks(view);
		case Not3EditPart.VISUAL_ID:
			return getNot_3022OutgoingLinks(view);
		case UnaryPattern3EditPart.VISUAL_ID:
			return getUnaryPattern_3023OutgoingLinks(view);
		case PatternTimer3EditPart.VISUAL_ID:
			return getPatternTimer_3024OutgoingLinks(view);
		case RepeatPattern3EditPart.VISUAL_ID:
			return getRepeatPattern_3025OutgoingLinks(view);
		case Aggregation3EditPart.VISUAL_ID:
			return getAggregation_3026OutgoingLinks(view);
		case ConditionGroup3EditPart.VISUAL_ID:
			return getConditionGroup_3027OutgoingLinks(view);
		case GroupbyCondition2EditPart.VISUAL_ID:
			return getGroupbyCondition_3028OutgoingLinks(view);
		case Not4EditPart.VISUAL_ID:
			return getNot_3029OutgoingLinks(view);
		case UnaryPattern4EditPart.VISUAL_ID:
			return getUnaryPattern_3030OutgoingLinks(view);
		case PatternTimer4EditPart.VISUAL_ID:
			return getPatternTimer_3031OutgoingLinks(view);
		case RepeatPattern4EditPart.VISUAL_ID:
			return getRepeatPattern_3032OutgoingLinks(view);
		case Aggregation4EditPart.VISUAL_ID:
			return getAggregation_3033OutgoingLinks(view);
		case ConditionGroup4EditPart.VISUAL_ID:
			return getConditionGroup_3034OutgoingLinks(view);
		case BringGroup2EditPart.VISUAL_ID:
			return getBringGroup_3035OutgoingLinks(view);
		case GroupbyCondition3EditPart.VISUAL_ID:
			return getGroupbyCondition_3036OutgoingLinks(view);
		case GroupbyCondition4EditPart.VISUAL_ID:
			return getGroupbyCondition_3037OutgoingLinks(view);
		case BringGroup3EditPart.VISUAL_ID:
			return getBringGroup_3038OutgoingLinks(view);
		case BringGroup4EditPart.VISUAL_ID:
			return getBringGroup_3039OutgoingLinks(view);
		case Operator2EditPart.VISUAL_ID:
			return getOperator_3040OutgoingLinks(view);
		case ValueOperator2EditPart.VISUAL_ID:
			return getValueOperator_3041OutgoingLinks(view);
		case Operator3EditPart.VISUAL_ID:
			return getOperator_3042OutgoingLinks(view);
		case ValueOperator3EditPart.VISUAL_ID:
			return getValueOperator_3043OutgoingLinks(view);
		case Operator4EditPart.VISUAL_ID:
			return getOperator_3044OutgoingLinks(view);
		case ValueOperator4EditPart.VISUAL_ID:
			return getValueOperator_3045OutgoingLinks(view);
		case Not5EditPart.VISUAL_ID:
			return getNot_3046OutgoingLinks(view);
		case UnaryPattern5EditPart.VISUAL_ID:
			return getUnaryPattern_3047OutgoingLinks(view);
		case PatternTimer5EditPart.VISUAL_ID:
			return getPatternTimer_3048OutgoingLinks(view);
		case RepeatPattern5EditPart.VISUAL_ID:
			return getRepeatPattern_3049OutgoingLinks(view);
		case Aggregation5EditPart.VISUAL_ID:
			return getAggregation_3050OutgoingLinks(view);
		case ConditionGroup5EditPart.VISUAL_ID:
			return getConditionGroup_3051OutgoingLinks(view);
		case GroupbyCondition5EditPart.VISUAL_ID:
			return getGroupbyCondition_3052OutgoingLinks(view);
		case BringGroup5EditPart.VISUAL_ID:
			return getBringGroup_3053OutgoingLinks(view);
		case Operator5EditPart.VISUAL_ID:
			return getOperator_3054OutgoingLinks(view);
		case ValueOperator5EditPart.VISUAL_ID:
			return getValueOperator_3055OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3056OutgoingLinks(view);
		case Target6EditPart.VISUAL_ID:
			return getTarget_3057OutgoingLinks(view);
		case Not6EditPart.VISUAL_ID:
			return getNot_3058OutgoingLinks(view);
		case UnaryPattern6EditPart.VISUAL_ID:
			return getUnaryPattern_3059OutgoingLinks(view);
		case PatternTimer6EditPart.VISUAL_ID:
			return getPatternTimer_3060OutgoingLinks(view);
		case RepeatPattern6EditPart.VISUAL_ID:
			return getRepeatPattern_3061OutgoingLinks(view);
		case Target7EditPart.VISUAL_ID:
			return getTarget_3062OutgoingLinks(view);
		case Not7EditPart.VISUAL_ID:
			return getNot_3063OutgoingLinks(view);
		case UnaryPattern7EditPart.VISUAL_ID:
			return getUnaryPattern_3064OutgoingLinks(view);
		case PatternTimer7EditPart.VISUAL_ID:
			return getPatternTimer_3065OutgoingLinks(view);
		case RepeatPattern7EditPart.VISUAL_ID:
			return getRepeatPattern_3066OutgoingLinks(view);
		case Aggregation6EditPart.VISUAL_ID:
			return getAggregation_3067OutgoingLinks(view);
		case ConditionGroup6EditPart.VISUAL_ID:
			return getConditionGroup_3068OutgoingLinks(view);
		case GroupbyCondition6EditPart.VISUAL_ID:
			return getGroupbyCondition_3069OutgoingLinks(view);
		case BringGroup6EditPart.VISUAL_ID:
			return getBringGroup_3070OutgoingLinks(view);
		case Operator6EditPart.VISUAL_ID:
			return getOperator_3071OutgoingLinks(view);
		case ValueOperator6EditPart.VISUAL_ID:
			return getValueOperator_3072OutgoingLinks(view);
		case ComparisonEditPart.VISUAL_ID:
			return getComparison_4001OutgoingLinks(view);
		case ArithmeticEditPart.VISUAL_ID:
			return getArithmetic_4002OutgoingLinks(view);
		case LogicalConnectorEditPart.VISUAL_ID:
			return getLogicalConnector_4003OutgoingLinks(view);
		case LinkTargetEditPart.VISUAL_ID:
			return getLinkTarget_4004OutgoingLinks(view);
		case LinkPatternTargetEditPart.VISUAL_ID:
			return getLinkPatternTarget_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getDrawingArea_1000ContainedLinks(
			View view) {
		DrawingArea modelElement = (DrawingArea) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkTarget_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkPatternTarget_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRule_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEvent_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEventPattern_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEventOutput_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getWindow_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTargetGroupby_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3032ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3035ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3036ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3037ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3039ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3040ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3041ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3042ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3043ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3044ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3045ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3047ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3048ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3049ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3050ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3051ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3052ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3053ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3054ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3055ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAttribute_3056ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3057ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3059ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3060ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3061ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3062ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3064ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3065ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3066ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3067ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3068ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3069ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3070ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3071ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3072ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getComparison_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getArithmetic_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLogicalConnector_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLinkTarget_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLinkPatternTarget_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRule_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEvent_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEventPattern_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEventOutput_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getWindow_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTargetGroupby_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3001IncomingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkTarget_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPatternTarget_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3002IncomingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkTarget_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPatternTarget_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3003IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3004IncomingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3005IncomingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3006IncomingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3007IncomingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3008IncomingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3009IncomingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkTarget_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPatternTarget_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3010IncomingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3011IncomingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkTarget_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPatternTarget_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3012IncomingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3013IncomingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkTarget_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPatternTarget_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3014IncomingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3015IncomingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3016IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3017IncomingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3018IncomingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3019IncomingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3020IncomingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3021IncomingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3022IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3023IncomingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3024IncomingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3025IncomingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3026IncomingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3027IncomingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3028IncomingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3029IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3030IncomingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3031IncomingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3032IncomingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3033IncomingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3034IncomingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3035IncomingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3036IncomingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3037IncomingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3038IncomingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3039IncomingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3040IncomingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3041IncomingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3042IncomingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3043IncomingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3044IncomingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3045IncomingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3046IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3047IncomingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3048IncomingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3049IncomingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3050IncomingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3051IncomingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3052IncomingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3053IncomingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3054IncomingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3055IncomingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAttribute_3056IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3057IncomingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkTarget_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPatternTarget_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3058IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3059IncomingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3060IncomingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3061IncomingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3062IncomingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkTarget_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkPatternTarget_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3063IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3064IncomingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3065IncomingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3066IncomingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3067IncomingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3068IncomingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3069IncomingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3070IncomingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3071IncomingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3072IncomingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Comparison_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Arithmetic_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LogicalConnector_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getComparison_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getArithmetic_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLogicalConnector_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLinkTarget_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLinkPatternTarget_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRule_2001OutgoingLinks(View view) {
		Rule modelElement = (Rule) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkTarget_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEvent_2002OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkTarget_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEventPattern_2003OutgoingLinks(
			View view) {
		EventPattern modelElement = (EventPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkTarget_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getEventOutput_2004OutgoingLinks(
			View view) {
		EventOutput modelElement = (EventOutput) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkTarget_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getWindow_2005OutgoingLinks(View view) {
		Window modelElement = (Window) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkTarget_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTargetGroupby_2006OutgoingLinks(
			View view) {
		TargetGroupby modelElement = (TargetGroupby) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkTarget_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3001OutgoingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPatternTarget_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3002OutgoingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPatternTarget_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3003OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3004OutgoingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3005OutgoingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3006OutgoingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3007OutgoingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3008OutgoingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3009OutgoingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPatternTarget_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3010OutgoingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3011OutgoingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPatternTarget_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3012OutgoingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3013OutgoingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPatternTarget_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3014OutgoingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3015OutgoingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3016OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3017OutgoingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3018OutgoingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3019OutgoingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3020OutgoingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3021OutgoingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3022OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3023OutgoingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3024OutgoingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3025OutgoingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3026OutgoingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3027OutgoingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3028OutgoingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3029OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3030OutgoingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3031OutgoingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3032OutgoingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3033OutgoingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3034OutgoingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3035OutgoingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3036OutgoingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3037OutgoingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3038OutgoingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3039OutgoingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3040OutgoingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3041OutgoingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3042OutgoingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3043OutgoingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3044OutgoingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3045OutgoingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3046OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3047OutgoingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3048OutgoingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3049OutgoingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3050OutgoingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3051OutgoingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3052OutgoingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3053OutgoingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3054OutgoingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3055OutgoingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAttribute_3056OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3057OutgoingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPatternTarget_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3058OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3059OutgoingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3060OutgoingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3061OutgoingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getTarget_3062OutgoingLinks(View view) {
		Target modelElement = (Target) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkPatternTarget_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getNot_3063OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getUnaryPattern_3064OutgoingLinks(
			View view) {
		UnaryPattern modelElement = (UnaryPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getPatternTimer_3065OutgoingLinks(
			View view) {
		PatternTimer modelElement = (PatternTimer) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getRepeatPattern_3066OutgoingLinks(
			View view) {
		RepeatPattern modelElement = (RepeatPattern) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getAggregation_3067OutgoingLinks(
			View view) {
		Aggregation modelElement = (Aggregation) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getConditionGroup_3068OutgoingLinks(
			View view) {
		ConditionGroup modelElement = (ConditionGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getGroupbyCondition_3069OutgoingLinks(
			View view) {
		GroupbyCondition modelElement = (GroupbyCondition) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getBringGroup_3070OutgoingLinks(
			View view) {
		BringGroup modelElement = (BringGroup) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getOperator_3071OutgoingLinks(
			View view) {
		Operator modelElement = (Operator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getValueOperator_3072OutgoingLinks(
			View view) {
		ValueOperator modelElement = (ValueOperator) view.getElement();
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Comparison_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Arithmetic_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalConnector_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getComparison_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getArithmetic_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLogicalConnector_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLinkTarget_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsmlLinkDescriptor> getLinkPatternTarget_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getContainedTypeModelFacetLinks_Comparison_4001(
			DrawingArea container) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Comparison) {
				continue;
			}
			Comparison link = (Comparison) linkObject;
			if (ComparisonEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query dst = link.getTarget();
			Query src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.Comparison_4001,
					ComparisonEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getContainedTypeModelFacetLinks_Arithmetic_4002(
			DrawingArea container) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arithmetic) {
				continue;
			}
			Arithmetic link = (Arithmetic) linkObject;
			if (ArithmeticEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query dst = link.getTarget();
			Query src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.Arithmetic_4002,
					ArithmeticEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getContainedTypeModelFacetLinks_LogicalConnector_4003(
			DrawingArea container) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LogicalConnector) {
				continue;
			}
			LogicalConnector link = (LogicalConnector) linkObject;
			if (LogicalConnectorEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query dst = link.getTarget();
			Query src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.LogicalConnector_4003,
					LogicalConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getContainedTypeModelFacetLinks_LinkTarget_4004(
			DrawingArea container) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinkTaget().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkTarget) {
				continue;
			}
			LinkTarget link = (LinkTarget) linkObject;
			if (LinkTargetEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Target) {
				continue;
			}
			Target dst = (Target) theTarget;
			Component src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.LinkTarget_4004,
					LinkTargetEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getContainedTypeModelFacetLinks_LinkPatternTarget_4005(
			DrawingArea container) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinkPatternTarget().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkPatternTarget) {
				continue;
			}
			LinkPatternTarget link = (LinkPatternTarget) linkObject;
			if (LinkPatternTargetEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Target dst = link.getTarget();
			Target src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.LinkPatternTarget_4005,
					LinkPatternTargetEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getIncomingTypeModelFacetLinks_Comparison_4001(
			Query target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsmlPackage.eINSTANCE
					.getLink_Target()
					|| false == setting.getEObject() instanceof Comparison) {
				continue;
			}
			Comparison link = (Comparison) setting.getEObject();
			if (ComparisonEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, target, link,
					DsmlElementTypes.Comparison_4001,
					ComparisonEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getIncomingTypeModelFacetLinks_Arithmetic_4002(
			Query target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsmlPackage.eINSTANCE
					.getLink_Target()
					|| false == setting.getEObject() instanceof Arithmetic) {
				continue;
			}
			Arithmetic link = (Arithmetic) setting.getEObject();
			if (ArithmeticEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, target, link,
					DsmlElementTypes.Arithmetic_4002,
					ArithmeticEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getIncomingTypeModelFacetLinks_LogicalConnector_4003(
			Query target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsmlPackage.eINSTANCE
					.getLink_Target()
					|| false == setting.getEObject() instanceof LogicalConnector) {
				continue;
			}
			LogicalConnector link = (LogicalConnector) setting.getEObject();
			if (LogicalConnectorEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, target, link,
					DsmlElementTypes.LogicalConnector_4003,
					LogicalConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getIncomingTypeModelFacetLinks_LinkTarget_4004(
			Target target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsmlPackage.eINSTANCE
					.getLinkTarget_Target()
					|| false == setting.getEObject() instanceof LinkTarget) {
				continue;
			}
			LinkTarget link = (LinkTarget) setting.getEObject();
			if (LinkTargetEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Component src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, target, link,
					DsmlElementTypes.LinkTarget_4004,
					LinkTargetEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getIncomingTypeModelFacetLinks_LinkPatternTarget_4005(
			Target target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsmlPackage.eINSTANCE
					.getLinkPatternTarget_Target()
					|| false == setting.getEObject() instanceof LinkPatternTarget) {
				continue;
			}
			LinkPatternTarget link = (LinkPatternTarget) setting.getEObject();
			if (LinkPatternTargetEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Target src = link.getSource();
			result.add(new DsmlLinkDescriptor(src, target, link,
					DsmlElementTypes.LinkPatternTarget_4005,
					LinkPatternTargetEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getOutgoingTypeModelFacetLinks_Comparison_4001(
			Query source) {
		DrawingArea container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DrawingArea) {
				container = (DrawingArea) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Comparison) {
				continue;
			}
			Comparison link = (Comparison) linkObject;
			if (ComparisonEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query dst = link.getTarget();
			Query src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.Comparison_4001,
					ComparisonEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getOutgoingTypeModelFacetLinks_Arithmetic_4002(
			Query source) {
		DrawingArea container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DrawingArea) {
				container = (DrawingArea) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arithmetic) {
				continue;
			}
			Arithmetic link = (Arithmetic) linkObject;
			if (ArithmeticEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query dst = link.getTarget();
			Query src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.Arithmetic_4002,
					ArithmeticEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getOutgoingTypeModelFacetLinks_LogicalConnector_4003(
			Query source) {
		DrawingArea container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DrawingArea) {
				container = (DrawingArea) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LogicalConnector) {
				continue;
			}
			LogicalConnector link = (LogicalConnector) linkObject;
			if (LogicalConnectorEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query dst = link.getTarget();
			Query src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.LogicalConnector_4003,
					LogicalConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkTarget_4004(
			Component source) {
		DrawingArea container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DrawingArea) {
				container = (DrawingArea) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinkTaget().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkTarget) {
				continue;
			}
			LinkTarget link = (LinkTarget) linkObject;
			if (LinkTargetEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getTarget();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Target) {
				continue;
			}
			Target dst = (Target) theTarget;
			Component src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.LinkTarget_4004,
					LinkTargetEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsmlLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkPatternTarget_4005(
			Target source) {
		DrawingArea container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof DrawingArea) {
				container = (DrawingArea) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsmlLinkDescriptor> result = new LinkedList<DsmlLinkDescriptor>();
		for (Iterator<?> links = container.getLinkPatternTarget().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LinkPatternTarget) {
				continue;
			}
			LinkPatternTarget link = (LinkPatternTarget) linkObject;
			if (LinkPatternTargetEditPart.VISUAL_ID != DsmlVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Target dst = link.getTarget();
			Target src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsmlLinkDescriptor(src, dst, link,
					DsmlElementTypes.LinkPatternTarget_4005,
					LinkPatternTargetEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<DsmlNodeDescriptor> getSemanticChildren(View view) {
			return DsmlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DsmlLinkDescriptor> getContainedLinks(View view) {
			return DsmlDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DsmlLinkDescriptor> getIncomingLinks(View view) {
			return DsmlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<DsmlLinkDescriptor> getOutgoingLinks(View view) {
			return DsmlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
