/*
 * 
 */
package dsml.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import dsml.diagram.providers.DsmlElementTypes;

/**
 * @generated
 */
public class DsmlPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createEmsembles2Group());
		paletteRoot.add(createTargetConnector3Group());
		paletteRoot.add(createOperacionalComponents4Group());
		paletteRoot.add(createOperacionalConnectors5Group());
		paletteRoot.add(createPatternComponents6Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createEvent2CreationTool());
		paletteContainer.add(createEventOutput3CreationTool());
		paletteContainer.add(createEventPattern4CreationTool());
		paletteContainer.add(createRule5CreationTool());
		paletteContainer.add(createTargetGroupby6CreationTool());
		paletteContainer.add(createWindow7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Emsembles" palette tool group
	 * @generated
	 */
	private PaletteContainer createEmsembles2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Emsembles2Group_title);
		paletteContainer.setId("createEmsembles2Group"); //$NON-NLS-1$
		paletteContainer.add(createBringGroup1CreationTool());
		paletteContainer.add(createTarget2CreationTool());
		paletteContainer.add(createConditionGroup3CreationTool());
		paletteContainer.add(createGroupbyCondition4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Target Connector" palette tool group
	 * @generated
	 */
	private PaletteContainer createTargetConnector3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.TargetConnector3Group_title);
		paletteContainer.setId("createTargetConnector3Group"); //$NON-NLS-1$
		paletteContainer.add(createLinkTarget1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Operacional Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createOperacionalComponents4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.OperacionalComponents4Group_title);
		paletteContainer.setId("createOperacionalComponents4Group"); //$NON-NLS-1$
		paletteContainer.add(createOperator1CreationTool());
		paletteContainer.add(createValueOperator2CreationTool());
		paletteContainer.add(createAggregation3CreationTool());
		paletteContainer.add(createNot4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Operacional Connectors" palette tool group
	 * @generated
	 */
	private PaletteContainer createOperacionalConnectors5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.OperacionalConnectors5Group_title);
		paletteContainer.setId("createOperacionalConnectors5Group"); //$NON-NLS-1$
		paletteContainer.add(createArithmetic1CreationTool());
		paletteContainer.add(createComparison2CreationTool());
		paletteContainer.add(createLogicalConnector3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Pattern Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createPatternComponents6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.PatternComponents6Group_title);
		paletteContainer.setId("createPatternComponents6Group"); //$NON-NLS-1$
		paletteContainer.add(createUnaryPattern1CreationTool());
		paletteContainer.add(createRepeatPattern2CreationTool());
		paletteContainer.add(createPatternTimer3CreationTool());
		paletteContainer.add(createLinkPatternTarget4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.Attribute_3056));
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Attribute_3056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvent2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Event2CreationTool_title,
				Messages.Event2CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.Event_2002));
		entry.setId("createEvent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Event_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventOutput3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.EventOutput3CreationTool_title,
				Messages.EventOutput3CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.EventOutput_2004));
		entry.setId("createEventOutput3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.EventOutput_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventPattern4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.EventPattern4CreationTool_title,
				Messages.EventPattern4CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.EventPattern_2003));
		entry.setId("createEventPattern4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.EventPattern_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRule5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Rule5CreationTool_title,
				Messages.Rule5CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.Rule_2001));
		entry.setId("createRule5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Rule_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTargetGroupby6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TargetGroupby6CreationTool_title,
				Messages.TargetGroupby6CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.TargetGroupby_2006));
		entry.setId("createTargetGroupby6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.TargetGroupby_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindow7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Window7CreationTool_title,
				Messages.Window7CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.Window_2005));
		entry.setId("createWindow7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Window_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBringGroup1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(DsmlElementTypes.BringGroup_3012);
		types.add(DsmlElementTypes.BringGroup_3035);
		types.add(DsmlElementTypes.BringGroup_3038);
		types.add(DsmlElementTypes.BringGroup_3039);
		types.add(DsmlElementTypes.BringGroup_3053);
		types.add(DsmlElementTypes.BringGroup_3070);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.BringGroup1CreationTool_title,
				Messages.BringGroup1CreationTool_desc, types);
		entry.setId("createBringGroup1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.BringGroup_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTarget2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DsmlElementTypes.Target_3001);
		types.add(DsmlElementTypes.Target_3002);
		types.add(DsmlElementTypes.Target_3009);
		types.add(DsmlElementTypes.Target_3011);
		types.add(DsmlElementTypes.Target_3013);
		types.add(DsmlElementTypes.Target_3057);
		types.add(DsmlElementTypes.Target_3062);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Target2CreationTool_title,
				Messages.Target2CreationTool_desc, types);
		entry.setId("createTarget2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Target_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionGroup3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(DsmlElementTypes.ConditionGroup_3008);
		types.add(DsmlElementTypes.ConditionGroup_3021);
		types.add(DsmlElementTypes.ConditionGroup_3027);
		types.add(DsmlElementTypes.ConditionGroup_3034);
		types.add(DsmlElementTypes.ConditionGroup_3051);
		types.add(DsmlElementTypes.ConditionGroup_3068);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ConditionGroup3CreationTool_title,
				Messages.ConditionGroup3CreationTool_desc, types);
		entry.setId("createConditionGroup3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.ConditionGroup_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroupbyCondition4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(DsmlElementTypes.GroupbyCondition_3010);
		types.add(DsmlElementTypes.GroupbyCondition_3028);
		types.add(DsmlElementTypes.GroupbyCondition_3036);
		types.add(DsmlElementTypes.GroupbyCondition_3037);
		types.add(DsmlElementTypes.GroupbyCondition_3052);
		types.add(DsmlElementTypes.GroupbyCondition_3069);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.GroupbyCondition4CreationTool_title,
				Messages.GroupbyCondition4CreationTool_desc, types);
		entry.setId("createGroupbyCondition4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.GroupbyCondition_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkTarget1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.LinkTarget1CreationTool_title,
				Messages.LinkTarget1CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.LinkTarget_4004));
		entry.setId("createLinkTarget1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.LinkTarget_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperator1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(DsmlElementTypes.Operator_3014);
		types.add(DsmlElementTypes.Operator_3040);
		types.add(DsmlElementTypes.Operator_3042);
		types.add(DsmlElementTypes.Operator_3044);
		types.add(DsmlElementTypes.Operator_3054);
		types.add(DsmlElementTypes.Operator_3071);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Operator1CreationTool_title,
				Messages.Operator1CreationTool_desc, types);
		entry.setId("createOperator1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Operator_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueOperator2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(DsmlElementTypes.ValueOperator_3015);
		types.add(DsmlElementTypes.ValueOperator_3041);
		types.add(DsmlElementTypes.ValueOperator_3043);
		types.add(DsmlElementTypes.ValueOperator_3045);
		types.add(DsmlElementTypes.ValueOperator_3055);
		types.add(DsmlElementTypes.ValueOperator_3072);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ValueOperator2CreationTool_title,
				Messages.ValueOperator2CreationTool_desc, types);
		entry.setId("createValueOperator2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.ValueOperator_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregation3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(DsmlElementTypes.Aggregation_3007);
		types.add(DsmlElementTypes.Aggregation_3020);
		types.add(DsmlElementTypes.Aggregation_3026);
		types.add(DsmlElementTypes.Aggregation_3033);
		types.add(DsmlElementTypes.Aggregation_3050);
		types.add(DsmlElementTypes.Aggregation_3067);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Aggregation3CreationTool_title,
				Messages.Aggregation3CreationTool_desc, types);
		entry.setId("createAggregation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Aggregation_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNot4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DsmlElementTypes.Not_3003);
		types.add(DsmlElementTypes.Not_3016);
		types.add(DsmlElementTypes.Not_3022);
		types.add(DsmlElementTypes.Not_3029);
		types.add(DsmlElementTypes.Not_3046);
		types.add(DsmlElementTypes.Not_3058);
		types.add(DsmlElementTypes.Not_3063);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Not4CreationTool_title,
				Messages.Not4CreationTool_desc, types);
		entry.setId("createNot4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Not_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArithmetic1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Arithmetic1CreationTool_title,
				Messages.Arithmetic1CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.Arithmetic_4002));
		entry.setId("createArithmetic1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Arithmetic_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComparison2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Comparison2CreationTool_title,
				Messages.Comparison2CreationTool_desc,
				Collections.singletonList(DsmlElementTypes.Comparison_4001));
		entry.setId("createComparison2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.Comparison_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogicalConnector3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.LogicalConnector3CreationTool_title,
				Messages.LogicalConnector3CreationTool_desc,
				Collections
						.singletonList(DsmlElementTypes.LogicalConnector_4003));
		entry.setId("createLogicalConnector3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.LogicalConnector_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnaryPattern1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DsmlElementTypes.UnaryPattern_3004);
		types.add(DsmlElementTypes.UnaryPattern_3017);
		types.add(DsmlElementTypes.UnaryPattern_3023);
		types.add(DsmlElementTypes.UnaryPattern_3030);
		types.add(DsmlElementTypes.UnaryPattern_3047);
		types.add(DsmlElementTypes.UnaryPattern_3059);
		types.add(DsmlElementTypes.UnaryPattern_3064);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.UnaryPattern1CreationTool_title,
				Messages.UnaryPattern1CreationTool_desc, types);
		entry.setId("createUnaryPattern1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.UnaryPattern_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepeatPattern2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DsmlElementTypes.RepeatPattern_3006);
		types.add(DsmlElementTypes.RepeatPattern_3019);
		types.add(DsmlElementTypes.RepeatPattern_3025);
		types.add(DsmlElementTypes.RepeatPattern_3032);
		types.add(DsmlElementTypes.RepeatPattern_3049);
		types.add(DsmlElementTypes.RepeatPattern_3061);
		types.add(DsmlElementTypes.RepeatPattern_3066);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.RepeatPattern2CreationTool_title,
				Messages.RepeatPattern2CreationTool_desc, types);
		entry.setId("createRepeatPattern2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.RepeatPattern_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPatternTimer3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DsmlElementTypes.PatternTimer_3005);
		types.add(DsmlElementTypes.PatternTimer_3018);
		types.add(DsmlElementTypes.PatternTimer_3024);
		types.add(DsmlElementTypes.PatternTimer_3031);
		types.add(DsmlElementTypes.PatternTimer_3048);
		types.add(DsmlElementTypes.PatternTimer_3060);
		types.add(DsmlElementTypes.PatternTimer_3065);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.PatternTimer3CreationTool_title,
				Messages.PatternTimer3CreationTool_desc, types);
		entry.setId("createPatternTimer3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.PatternTimer_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkPatternTarget4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.LinkPatternTarget4CreationTool_title,
				Messages.LinkPatternTarget4CreationTool_desc,
				Collections
						.singletonList(DsmlElementTypes.LinkPatternTarget_4005));
		entry.setId("createLinkPatternTarget4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsmlElementTypes
				.getImageDescriptor(DsmlElementTypes.LinkPatternTarget_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
