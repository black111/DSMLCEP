/*
 * 
 */
package dsml.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import dsml.diagram.edit.parts.*;
import dsml.diagram.part.DsmlDiagramEditorPlugin;
import dsml.diagram.part.DsmlVisualIDRegistry;
import dsml.diagram.providers.DsmlElementTypes;
import dsml.diagram.providers.DsmlParserProvider;

/**
 * @generated
 */
public class DsmlNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DsmlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DsmlDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DsmlNavigatorItem
				&& !isOwnView(((DsmlNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DsmlNavigatorGroup) {
			DsmlNavigatorGroup group = (DsmlNavigatorGroup) element;
			return DsmlDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DsmlNavigatorItem) {
			DsmlNavigatorItem navigatorItem = (DsmlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (DsmlVisualIDRegistry.getVisualID(view)) {
		case DrawingAreaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?dsml?DrawingArea", DsmlElementTypes.DrawingArea_1000); //$NON-NLS-1$
		case RuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?dsml?Rule", DsmlElementTypes.Rule_2001); //$NON-NLS-1$
		case EventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?dsml?Event", DsmlElementTypes.Event_2002); //$NON-NLS-1$
		case EventPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?dsml?EventPattern", DsmlElementTypes.EventPattern_2003); //$NON-NLS-1$
		case EventOutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?dsml?EventOutput", DsmlElementTypes.EventOutput_2004); //$NON-NLS-1$
		case WindowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?dsml?Window", DsmlElementTypes.Window_2005); //$NON-NLS-1$
		case TargetGroupbyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?dsml?TargetGroupby", DsmlElementTypes.TargetGroupby_2006); //$NON-NLS-1$
		case TargetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Target", DsmlElementTypes.Target_3001); //$NON-NLS-1$
		case Target2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Target", DsmlElementTypes.Target_3002); //$NON-NLS-1$
		case NotEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Not", DsmlElementTypes.Not_3003); //$NON-NLS-1$
		case UnaryPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?UnaryPattern", DsmlElementTypes.UnaryPattern_3004); //$NON-NLS-1$
		case PatternTimerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?PatternTimer", DsmlElementTypes.PatternTimer_3005); //$NON-NLS-1$
		case RepeatPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?RepeatPattern", DsmlElementTypes.RepeatPattern_3006); //$NON-NLS-1$
		case AggregationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Aggregation", DsmlElementTypes.Aggregation_3007); //$NON-NLS-1$
		case ConditionGroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ConditionGroup", DsmlElementTypes.ConditionGroup_3008); //$NON-NLS-1$
		case Target3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Target", DsmlElementTypes.Target_3009); //$NON-NLS-1$
		case GroupbyConditionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?GroupbyCondition", DsmlElementTypes.GroupbyCondition_3010); //$NON-NLS-1$
		case Target4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Target", DsmlElementTypes.Target_3011); //$NON-NLS-1$
		case BringGroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?BringGroup", DsmlElementTypes.BringGroup_3012); //$NON-NLS-1$
		case Target5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Target", DsmlElementTypes.Target_3013); //$NON-NLS-1$
		case OperatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Operator", DsmlElementTypes.Operator_3014); //$NON-NLS-1$
		case ValueOperatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ValueOperator", DsmlElementTypes.ValueOperator_3015); //$NON-NLS-1$
		case Not2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Not", DsmlElementTypes.Not_3016); //$NON-NLS-1$
		case UnaryPattern2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?UnaryPattern", DsmlElementTypes.UnaryPattern_3017); //$NON-NLS-1$
		case PatternTimer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?PatternTimer", DsmlElementTypes.PatternTimer_3018); //$NON-NLS-1$
		case RepeatPattern2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?RepeatPattern", DsmlElementTypes.RepeatPattern_3019); //$NON-NLS-1$
		case Aggregation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Aggregation", DsmlElementTypes.Aggregation_3020); //$NON-NLS-1$
		case ConditionGroup2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ConditionGroup", DsmlElementTypes.ConditionGroup_3021); //$NON-NLS-1$
		case Not3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Not", DsmlElementTypes.Not_3022); //$NON-NLS-1$
		case UnaryPattern3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?UnaryPattern", DsmlElementTypes.UnaryPattern_3023); //$NON-NLS-1$
		case PatternTimer3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?PatternTimer", DsmlElementTypes.PatternTimer_3024); //$NON-NLS-1$
		case RepeatPattern3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?RepeatPattern", DsmlElementTypes.RepeatPattern_3025); //$NON-NLS-1$
		case Aggregation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Aggregation", DsmlElementTypes.Aggregation_3026); //$NON-NLS-1$
		case ConditionGroup3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ConditionGroup", DsmlElementTypes.ConditionGroup_3027); //$NON-NLS-1$
		case GroupbyCondition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?GroupbyCondition", DsmlElementTypes.GroupbyCondition_3028); //$NON-NLS-1$
		case Not4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Not", DsmlElementTypes.Not_3029); //$NON-NLS-1$
		case UnaryPattern4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?UnaryPattern", DsmlElementTypes.UnaryPattern_3030); //$NON-NLS-1$
		case PatternTimer4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?PatternTimer", DsmlElementTypes.PatternTimer_3031); //$NON-NLS-1$
		case RepeatPattern4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?RepeatPattern", DsmlElementTypes.RepeatPattern_3032); //$NON-NLS-1$
		case Aggregation4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Aggregation", DsmlElementTypes.Aggregation_3033); //$NON-NLS-1$
		case ConditionGroup4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ConditionGroup", DsmlElementTypes.ConditionGroup_3034); //$NON-NLS-1$
		case BringGroup2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?BringGroup", DsmlElementTypes.BringGroup_3035); //$NON-NLS-1$
		case GroupbyCondition3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?GroupbyCondition", DsmlElementTypes.GroupbyCondition_3036); //$NON-NLS-1$
		case GroupbyCondition4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?GroupbyCondition", DsmlElementTypes.GroupbyCondition_3037); //$NON-NLS-1$
		case BringGroup3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?BringGroup", DsmlElementTypes.BringGroup_3038); //$NON-NLS-1$
		case BringGroup4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?BringGroup", DsmlElementTypes.BringGroup_3039); //$NON-NLS-1$
		case Operator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Operator", DsmlElementTypes.Operator_3040); //$NON-NLS-1$
		case ValueOperator2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ValueOperator", DsmlElementTypes.ValueOperator_3041); //$NON-NLS-1$
		case Operator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Operator", DsmlElementTypes.Operator_3042); //$NON-NLS-1$
		case ValueOperator3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ValueOperator", DsmlElementTypes.ValueOperator_3043); //$NON-NLS-1$
		case Operator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Operator", DsmlElementTypes.Operator_3044); //$NON-NLS-1$
		case ValueOperator4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ValueOperator", DsmlElementTypes.ValueOperator_3045); //$NON-NLS-1$
		case Not5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Not", DsmlElementTypes.Not_3046); //$NON-NLS-1$
		case UnaryPattern5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?UnaryPattern", DsmlElementTypes.UnaryPattern_3047); //$NON-NLS-1$
		case PatternTimer5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?PatternTimer", DsmlElementTypes.PatternTimer_3048); //$NON-NLS-1$
		case RepeatPattern5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?RepeatPattern", DsmlElementTypes.RepeatPattern_3049); //$NON-NLS-1$
		case Aggregation5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Aggregation", DsmlElementTypes.Aggregation_3050); //$NON-NLS-1$
		case ConditionGroup5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ConditionGroup", DsmlElementTypes.ConditionGroup_3051); //$NON-NLS-1$
		case GroupbyCondition5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?GroupbyCondition", DsmlElementTypes.GroupbyCondition_3052); //$NON-NLS-1$
		case BringGroup5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?BringGroup", DsmlElementTypes.BringGroup_3053); //$NON-NLS-1$
		case Operator5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Operator", DsmlElementTypes.Operator_3054); //$NON-NLS-1$
		case ValueOperator5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ValueOperator", DsmlElementTypes.ValueOperator_3055); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Attribute", DsmlElementTypes.Attribute_3056); //$NON-NLS-1$
		case Target6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Target", DsmlElementTypes.Target_3057); //$NON-NLS-1$
		case Not6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Not", DsmlElementTypes.Not_3058); //$NON-NLS-1$
		case UnaryPattern6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?UnaryPattern", DsmlElementTypes.UnaryPattern_3059); //$NON-NLS-1$
		case PatternTimer6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?PatternTimer", DsmlElementTypes.PatternTimer_3060); //$NON-NLS-1$
		case RepeatPattern6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?RepeatPattern", DsmlElementTypes.RepeatPattern_3061); //$NON-NLS-1$
		case Target7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Target", DsmlElementTypes.Target_3062); //$NON-NLS-1$
		case Not7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Not", DsmlElementTypes.Not_3063); //$NON-NLS-1$
		case UnaryPattern7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?UnaryPattern", DsmlElementTypes.UnaryPattern_3064); //$NON-NLS-1$
		case PatternTimer7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?PatternTimer", DsmlElementTypes.PatternTimer_3065); //$NON-NLS-1$
		case RepeatPattern7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?RepeatPattern", DsmlElementTypes.RepeatPattern_3066); //$NON-NLS-1$
		case Aggregation6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Aggregation", DsmlElementTypes.Aggregation_3067); //$NON-NLS-1$
		case ConditionGroup6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ConditionGroup", DsmlElementTypes.ConditionGroup_3068); //$NON-NLS-1$
		case GroupbyCondition6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?GroupbyCondition", DsmlElementTypes.GroupbyCondition_3069); //$NON-NLS-1$
		case BringGroup6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?BringGroup", DsmlElementTypes.BringGroup_3070); //$NON-NLS-1$
		case Operator6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?Operator", DsmlElementTypes.Operator_3071); //$NON-NLS-1$
		case ValueOperator6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?dsml?ValueOperator", DsmlElementTypes.ValueOperator_3072); //$NON-NLS-1$
		case ComparisonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?dsml?Comparison", DsmlElementTypes.Comparison_4001); //$NON-NLS-1$
		case ArithmeticEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?dsml?Arithmetic", DsmlElementTypes.Arithmetic_4002); //$NON-NLS-1$
		case LogicalConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?dsml?LogicalConnector", DsmlElementTypes.LogicalConnector_4003); //$NON-NLS-1$
		case LinkTargetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?dsml?LinkTarget", DsmlElementTypes.LinkTarget_4004); //$NON-NLS-1$
		case LinkPatternTargetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?dsml?LinkPatternTarget", DsmlElementTypes.LinkPatternTarget_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DsmlDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DsmlElementTypes.isKnownElementType(elementType)) {
			image = DsmlElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof DsmlNavigatorGroup) {
			DsmlNavigatorGroup group = (DsmlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DsmlNavigatorItem) {
			DsmlNavigatorItem navigatorItem = (DsmlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DsmlVisualIDRegistry.getVisualID(view)) {
		case DrawingAreaEditPart.VISUAL_ID:
			return getDrawingArea_1000Text(view);
		case RuleEditPart.VISUAL_ID:
			return getRule_2001Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2002Text(view);
		case EventPatternEditPart.VISUAL_ID:
			return getEventPattern_2003Text(view);
		case EventOutputEditPart.VISUAL_ID:
			return getEventOutput_2004Text(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_2005Text(view);
		case TargetGroupbyEditPart.VISUAL_ID:
			return getTargetGroupby_2006Text(view);
		case TargetEditPart.VISUAL_ID:
			return getTarget_3001Text(view);
		case Target2EditPart.VISUAL_ID:
			return getTarget_3002Text(view);
		case NotEditPart.VISUAL_ID:
			return getNot_3003Text(view);
		case UnaryPatternEditPart.VISUAL_ID:
			return getUnaryPattern_3004Text(view);
		case PatternTimerEditPart.VISUAL_ID:
			return getPatternTimer_3005Text(view);
		case RepeatPatternEditPart.VISUAL_ID:
			return getRepeatPattern_3006Text(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_3007Text(view);
		case ConditionGroupEditPart.VISUAL_ID:
			return getConditionGroup_3008Text(view);
		case Target3EditPart.VISUAL_ID:
			return getTarget_3009Text(view);
		case GroupbyConditionEditPart.VISUAL_ID:
			return getGroupbyCondition_3010Text(view);
		case Target4EditPart.VISUAL_ID:
			return getTarget_3011Text(view);
		case BringGroupEditPart.VISUAL_ID:
			return getBringGroup_3012Text(view);
		case Target5EditPart.VISUAL_ID:
			return getTarget_3013Text(view);
		case OperatorEditPart.VISUAL_ID:
			return getOperator_3014Text(view);
		case ValueOperatorEditPart.VISUAL_ID:
			return getValueOperator_3015Text(view);
		case Not2EditPart.VISUAL_ID:
			return getNot_3016Text(view);
		case UnaryPattern2EditPart.VISUAL_ID:
			return getUnaryPattern_3017Text(view);
		case PatternTimer2EditPart.VISUAL_ID:
			return getPatternTimer_3018Text(view);
		case RepeatPattern2EditPart.VISUAL_ID:
			return getRepeatPattern_3019Text(view);
		case Aggregation2EditPart.VISUAL_ID:
			return getAggregation_3020Text(view);
		case ConditionGroup2EditPart.VISUAL_ID:
			return getConditionGroup_3021Text(view);
		case Not3EditPart.VISUAL_ID:
			return getNot_3022Text(view);
		case UnaryPattern3EditPart.VISUAL_ID:
			return getUnaryPattern_3023Text(view);
		case PatternTimer3EditPart.VISUAL_ID:
			return getPatternTimer_3024Text(view);
		case RepeatPattern3EditPart.VISUAL_ID:
			return getRepeatPattern_3025Text(view);
		case Aggregation3EditPart.VISUAL_ID:
			return getAggregation_3026Text(view);
		case ConditionGroup3EditPart.VISUAL_ID:
			return getConditionGroup_3027Text(view);
		case GroupbyCondition2EditPart.VISUAL_ID:
			return getGroupbyCondition_3028Text(view);
		case Not4EditPart.VISUAL_ID:
			return getNot_3029Text(view);
		case UnaryPattern4EditPart.VISUAL_ID:
			return getUnaryPattern_3030Text(view);
		case PatternTimer4EditPart.VISUAL_ID:
			return getPatternTimer_3031Text(view);
		case RepeatPattern4EditPart.VISUAL_ID:
			return getRepeatPattern_3032Text(view);
		case Aggregation4EditPart.VISUAL_ID:
			return getAggregation_3033Text(view);
		case ConditionGroup4EditPart.VISUAL_ID:
			return getConditionGroup_3034Text(view);
		case BringGroup2EditPart.VISUAL_ID:
			return getBringGroup_3035Text(view);
		case GroupbyCondition3EditPart.VISUAL_ID:
			return getGroupbyCondition_3036Text(view);
		case GroupbyCondition4EditPart.VISUAL_ID:
			return getGroupbyCondition_3037Text(view);
		case BringGroup3EditPart.VISUAL_ID:
			return getBringGroup_3038Text(view);
		case BringGroup4EditPart.VISUAL_ID:
			return getBringGroup_3039Text(view);
		case Operator2EditPart.VISUAL_ID:
			return getOperator_3040Text(view);
		case ValueOperator2EditPart.VISUAL_ID:
			return getValueOperator_3041Text(view);
		case Operator3EditPart.VISUAL_ID:
			return getOperator_3042Text(view);
		case ValueOperator3EditPart.VISUAL_ID:
			return getValueOperator_3043Text(view);
		case Operator4EditPart.VISUAL_ID:
			return getOperator_3044Text(view);
		case ValueOperator4EditPart.VISUAL_ID:
			return getValueOperator_3045Text(view);
		case Not5EditPart.VISUAL_ID:
			return getNot_3046Text(view);
		case UnaryPattern5EditPart.VISUAL_ID:
			return getUnaryPattern_3047Text(view);
		case PatternTimer5EditPart.VISUAL_ID:
			return getPatternTimer_3048Text(view);
		case RepeatPattern5EditPart.VISUAL_ID:
			return getRepeatPattern_3049Text(view);
		case Aggregation5EditPart.VISUAL_ID:
			return getAggregation_3050Text(view);
		case ConditionGroup5EditPart.VISUAL_ID:
			return getConditionGroup_3051Text(view);
		case GroupbyCondition5EditPart.VISUAL_ID:
			return getGroupbyCondition_3052Text(view);
		case BringGroup5EditPart.VISUAL_ID:
			return getBringGroup_3053Text(view);
		case Operator5EditPart.VISUAL_ID:
			return getOperator_3054Text(view);
		case ValueOperator5EditPart.VISUAL_ID:
			return getValueOperator_3055Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3056Text(view);
		case Target6EditPart.VISUAL_ID:
			return getTarget_3057Text(view);
		case Not6EditPart.VISUAL_ID:
			return getNot_3058Text(view);
		case UnaryPattern6EditPart.VISUAL_ID:
			return getUnaryPattern_3059Text(view);
		case PatternTimer6EditPart.VISUAL_ID:
			return getPatternTimer_3060Text(view);
		case RepeatPattern6EditPart.VISUAL_ID:
			return getRepeatPattern_3061Text(view);
		case Target7EditPart.VISUAL_ID:
			return getTarget_3062Text(view);
		case Not7EditPart.VISUAL_ID:
			return getNot_3063Text(view);
		case UnaryPattern7EditPart.VISUAL_ID:
			return getUnaryPattern_3064Text(view);
		case PatternTimer7EditPart.VISUAL_ID:
			return getPatternTimer_3065Text(view);
		case RepeatPattern7EditPart.VISUAL_ID:
			return getRepeatPattern_3066Text(view);
		case Aggregation6EditPart.VISUAL_ID:
			return getAggregation_3067Text(view);
		case ConditionGroup6EditPart.VISUAL_ID:
			return getConditionGroup_3068Text(view);
		case GroupbyCondition6EditPart.VISUAL_ID:
			return getGroupbyCondition_3069Text(view);
		case BringGroup6EditPart.VISUAL_ID:
			return getBringGroup_3070Text(view);
		case Operator6EditPart.VISUAL_ID:
			return getOperator_3071Text(view);
		case ValueOperator6EditPart.VISUAL_ID:
			return getValueOperator_3072Text(view);
		case ComparisonEditPart.VISUAL_ID:
			return getComparison_4001Text(view);
		case ArithmeticEditPart.VISUAL_ID:
			return getArithmetic_4002Text(view);
		case LogicalConnectorEditPart.VISUAL_ID:
			return getLogicalConnector_4003Text(view);
		case LinkTargetEditPart.VISUAL_ID:
			return getLinkTarget_4004Text(view);
		case LinkPatternTargetEditPart.VISUAL_ID:
			return getLinkPatternTarget_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDrawingArea_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRule_2001Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Rule_2001,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry.getType(RuleRuleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvent_2002Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Event_2002,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry.getType(EventEventNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventPattern_2003Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.EventPattern_2003,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(EventPatternEventPatternEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventOutput_2004Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.EventOutput_2004,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(EventOutputOutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWindow_2005Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Window_2005,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry.getType(WindowWindowEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTargetGroupby_2006Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.TargetGroupby_2006,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(TargetGroupbyTargetGroupbyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTarget_3001Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Target_3001,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(TargetTargetAliasEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTarget_3002Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Target_3002,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(TargetTargetAlias2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNot_3003Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Not_3003,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry.getType(NotDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnaryPattern_3004Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.UnaryPattern_3004,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(UnaryPatternNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPatternTimer_3005Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.PatternTimer_3005,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(PatternTimerPatternTimerEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatPattern_3006Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.RepeatPattern_3006,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(RepeatPatternRepeatPatternEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_3007Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Aggregation_3007,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(AggregationTypeAggregationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionGroup_3008Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ConditionGroup_3008,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ConditionGroupConditionGroupEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTarget_3009Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Target_3009,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(TargetTargetAlias3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroupbyCondition_3010Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.GroupbyCondition_3010,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(GroupbyConditionGroupbyConditionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTarget_3011Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Target_3011,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(TargetTargetAlias4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBringGroup_3012Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.BringGroup_3012,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(BringGroupBringGroupEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTarget_3013Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Target_3013,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(TargetTargetAlias5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperator_3014Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Operator_3014,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(OperatorOperatorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueOperator_3015Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.ValueOperator_3015,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(ValueOperatorValueOperatorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNot_3016Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(DsmlElementTypes.Not_3016,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(NotDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnaryPattern_3017Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.UnaryPattern_3017,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(UnaryPatternName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPatternTimer_3018Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.PatternTimer_3018,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(PatternTimerPatternTimer2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatPattern_3019Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.RepeatPattern_3019,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(RepeatPatternRepeatPattern2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_3020Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.Aggregation_3020,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(AggregationTypeAggregation2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionGroup_3021Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ConditionGroup_3021,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ConditionGroupConditionGroup2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNot_3022Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(DsmlElementTypes.Not_3022,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(NotDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnaryPattern_3023Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.UnaryPattern_3023,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(UnaryPatternName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPatternTimer_3024Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.PatternTimer_3024,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(PatternTimerPatternTimer3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatPattern_3025Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.RepeatPattern_3025,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(RepeatPatternRepeatPattern3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_3026Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.Aggregation_3026,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(AggregationTypeAggregation3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionGroup_3027Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ConditionGroup_3027,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ConditionGroupConditionGroup3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroupbyCondition_3028Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.GroupbyCondition_3028,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(GroupbyConditionGroupbyCondition2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNot_3029Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(DsmlElementTypes.Not_3029,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(NotDescription4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnaryPattern_3030Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.UnaryPattern_3030,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(UnaryPatternName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPatternTimer_3031Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.PatternTimer_3031,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(PatternTimerPatternTimer4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatPattern_3032Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.RepeatPattern_3032,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(RepeatPatternRepeatPattern4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_3033Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.Aggregation_3033,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(AggregationTypeAggregation4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionGroup_3034Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ConditionGroup_3034,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ConditionGroupConditionGroup4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBringGroup_3035Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.BringGroup_3035,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(BringGroupBringGroup2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroupbyCondition_3036Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.GroupbyCondition_3036,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(GroupbyConditionGroupbyCondition3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroupbyCondition_3037Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.GroupbyCondition_3037,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(GroupbyConditionGroupbyCondition4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBringGroup_3038Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.BringGroup_3038,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(BringGroupBringGroup3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBringGroup_3039Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.BringGroup_3039,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(BringGroupBringGroup4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperator_3040Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Operator_3040,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(OperatorOperator2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueOperator_3041Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ValueOperator_3041,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ValueOperatorValueOperator2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperator_3042Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Operator_3042,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(OperatorOperator3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueOperator_3043Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ValueOperator_3043,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ValueOperatorValueOperator3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperator_3044Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Operator_3044,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(OperatorOperator4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueOperator_3045Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ValueOperator_3045,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ValueOperatorValueOperator4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNot_3046Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(DsmlElementTypes.Not_3046,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(NotDescription5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnaryPattern_3047Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.UnaryPattern_3047,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(UnaryPatternName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPatternTimer_3048Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.PatternTimer_3048,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(PatternTimerPatternTimer5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatPattern_3049Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.RepeatPattern_3049,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(RepeatPatternRepeatPattern5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_3050Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.Aggregation_3050,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(AggregationTypeAggregation5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionGroup_3051Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ConditionGroup_3051,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ConditionGroupConditionGroup5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroupbyCondition_3052Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.GroupbyCondition_3052,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(GroupbyConditionGroupbyCondition5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBringGroup_3053Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.BringGroup_3053,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(BringGroupBringGroup5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperator_3054Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Operator_3054,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(OperatorOperator5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueOperator_3055Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ValueOperator_3055,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ValueOperatorValueOperator5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3056Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Attribute_3056,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(AttributeNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTarget_3057Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Target_3057,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(TargetTargetAlias6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNot_3058Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(DsmlElementTypes.Not_3058,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(NotDescription6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnaryPattern_3059Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.UnaryPattern_3059,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(UnaryPatternName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPatternTimer_3060Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.PatternTimer_3060,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(PatternTimerPatternTimer6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatPattern_3061Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.RepeatPattern_3061,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(RepeatPatternRepeatPattern6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTarget_3062Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Target_3062,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(TargetTargetAlias7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNot_3063Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(DsmlElementTypes.Not_3063,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(NotDescription7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnaryPattern_3064Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.UnaryPattern_3064,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(UnaryPatternName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPatternTimer_3065Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.PatternTimer_3065,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(PatternTimerPatternTimer7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepeatPattern_3066Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.RepeatPattern_3066,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(RepeatPatternRepeatPattern7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_3067Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.Aggregation_3067,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(AggregationTypeAggregation6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionGroup_3068Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ConditionGroup_3068,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ConditionGroupConditionGroup6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroupbyCondition_3069Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.GroupbyCondition_3069,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(GroupbyConditionGroupbyCondition6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBringGroup_3070Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.BringGroup_3070,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(BringGroupBringGroup6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperator_3071Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Operator_3071,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(OperatorOperator6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValueOperator_3072Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.ValueOperator_3072,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(ValueOperatorValueOperator6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComparison_4001Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Comparison_4001,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(ComparisonComparisonEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArithmetic_4002Text(View view) {
		IParser parser = DsmlParserProvider.getParser(
				DsmlElementTypes.Arithmetic_4002,
				view.getElement() != null ? view.getElement() : view,
				DsmlVisualIDRegistry
						.getType(ArithmeticArithmeticEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLogicalConnector_4003Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.LogicalConnector_4003,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(LogicalConnectorTypeLogicalEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLinkTarget_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLinkPatternTarget_4005Text(View view) {
		IParser parser = DsmlParserProvider
				.getParser(
						DsmlElementTypes.LinkPatternTarget_4005,
						view.getElement() != null ? view.getElement() : view,
						DsmlVisualIDRegistry
								.getType(LinkPatternTargetComparisonTargetEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsmlDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DrawingAreaEditPart.MODEL_ID.equals(DsmlVisualIDRegistry
				.getModelID(view));
	}

}
