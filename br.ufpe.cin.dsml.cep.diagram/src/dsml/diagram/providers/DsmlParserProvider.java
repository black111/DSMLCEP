/*
 * 
 */
package dsml.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import dsml.DsmlPackage;
import dsml.diagram.edit.parts.AggregationTypeAggregation2EditPart;
import dsml.diagram.edit.parts.AggregationTypeAggregation3EditPart;
import dsml.diagram.edit.parts.AggregationTypeAggregation4EditPart;
import dsml.diagram.edit.parts.AggregationTypeAggregation5EditPart;
import dsml.diagram.edit.parts.AggregationTypeAggregation6EditPart;
import dsml.diagram.edit.parts.AggregationTypeAggregationEditPart;
import dsml.diagram.edit.parts.ArithmeticArithmeticEditPart;
import dsml.diagram.edit.parts.AttributeNameTypeEditPart;
import dsml.diagram.edit.parts.BringGroupBringGroup2EditPart;
import dsml.diagram.edit.parts.BringGroupBringGroup3EditPart;
import dsml.diagram.edit.parts.BringGroupBringGroup4EditPart;
import dsml.diagram.edit.parts.BringGroupBringGroup5EditPart;
import dsml.diagram.edit.parts.BringGroupBringGroup6EditPart;
import dsml.diagram.edit.parts.BringGroupBringGroupEditPart;
import dsml.diagram.edit.parts.ComparisonComparisonEditPart;
import dsml.diagram.edit.parts.ConditionGroupConditionGroup2EditPart;
import dsml.diagram.edit.parts.ConditionGroupConditionGroup3EditPart;
import dsml.diagram.edit.parts.ConditionGroupConditionGroup4EditPart;
import dsml.diagram.edit.parts.ConditionGroupConditionGroup5EditPart;
import dsml.diagram.edit.parts.ConditionGroupConditionGroup6EditPart;
import dsml.diagram.edit.parts.ConditionGroupConditionGroupEditPart;
import dsml.diagram.edit.parts.EventEventNameEditPart;
import dsml.diagram.edit.parts.EventOutputOutputNameEditPart;
import dsml.diagram.edit.parts.EventPatternEventPatternEditPart;
import dsml.diagram.edit.parts.GroupbyConditionGroupbyCondition2EditPart;
import dsml.diagram.edit.parts.GroupbyConditionGroupbyCondition3EditPart;
import dsml.diagram.edit.parts.GroupbyConditionGroupbyCondition4EditPart;
import dsml.diagram.edit.parts.GroupbyConditionGroupbyCondition5EditPart;
import dsml.diagram.edit.parts.GroupbyConditionGroupbyCondition6EditPart;
import dsml.diagram.edit.parts.GroupbyConditionGroupbyConditionEditPart;
import dsml.diagram.edit.parts.LinkPatternTargetComparisonTargetEditPart;
import dsml.diagram.edit.parts.LogicalConnectorTypeLogicalEditPart;
import dsml.diagram.edit.parts.NotDescription2EditPart;
import dsml.diagram.edit.parts.NotDescription3EditPart;
import dsml.diagram.edit.parts.NotDescription4EditPart;
import dsml.diagram.edit.parts.NotDescription5EditPart;
import dsml.diagram.edit.parts.NotDescription6EditPart;
import dsml.diagram.edit.parts.NotDescription7EditPart;
import dsml.diagram.edit.parts.NotDescriptionEditPart;
import dsml.diagram.edit.parts.OperatorOperator2EditPart;
import dsml.diagram.edit.parts.OperatorOperator3EditPart;
import dsml.diagram.edit.parts.OperatorOperator4EditPart;
import dsml.diagram.edit.parts.OperatorOperator5EditPart;
import dsml.diagram.edit.parts.OperatorOperator6EditPart;
import dsml.diagram.edit.parts.OperatorOperatorEditPart;
import dsml.diagram.edit.parts.PatternTimerPatternTimer2EditPart;
import dsml.diagram.edit.parts.PatternTimerPatternTimer3EditPart;
import dsml.diagram.edit.parts.PatternTimerPatternTimer4EditPart;
import dsml.diagram.edit.parts.PatternTimerPatternTimer5EditPart;
import dsml.diagram.edit.parts.PatternTimerPatternTimer6EditPart;
import dsml.diagram.edit.parts.PatternTimerPatternTimer7EditPart;
import dsml.diagram.edit.parts.PatternTimerPatternTimerEditPart;
import dsml.diagram.edit.parts.RepeatPatternRepeatPattern2EditPart;
import dsml.diagram.edit.parts.RepeatPatternRepeatPattern3EditPart;
import dsml.diagram.edit.parts.RepeatPatternRepeatPattern4EditPart;
import dsml.diagram.edit.parts.RepeatPatternRepeatPattern5EditPart;
import dsml.diagram.edit.parts.RepeatPatternRepeatPattern6EditPart;
import dsml.diagram.edit.parts.RepeatPatternRepeatPattern7EditPart;
import dsml.diagram.edit.parts.RepeatPatternRepeatPatternEditPart;
import dsml.diagram.edit.parts.RuleRuleNameEditPart;
import dsml.diagram.edit.parts.TargetGroupbyTargetGroupbyEditPart;
import dsml.diagram.edit.parts.TargetTargetAlias2EditPart;
import dsml.diagram.edit.parts.TargetTargetAlias3EditPart;
import dsml.diagram.edit.parts.TargetTargetAlias4EditPart;
import dsml.diagram.edit.parts.TargetTargetAlias5EditPart;
import dsml.diagram.edit.parts.TargetTargetAlias6EditPart;
import dsml.diagram.edit.parts.TargetTargetAlias7EditPart;
import dsml.diagram.edit.parts.TargetTargetAliasEditPart;
import dsml.diagram.edit.parts.UnaryPatternName2EditPart;
import dsml.diagram.edit.parts.UnaryPatternName3EditPart;
import dsml.diagram.edit.parts.UnaryPatternName4EditPart;
import dsml.diagram.edit.parts.UnaryPatternName5EditPart;
import dsml.diagram.edit.parts.UnaryPatternName6EditPart;
import dsml.diagram.edit.parts.UnaryPatternName7EditPart;
import dsml.diagram.edit.parts.UnaryPatternNameEditPart;
import dsml.diagram.edit.parts.ValueOperatorValueOperator2EditPart;
import dsml.diagram.edit.parts.ValueOperatorValueOperator3EditPart;
import dsml.diagram.edit.parts.ValueOperatorValueOperator4EditPart;
import dsml.diagram.edit.parts.ValueOperatorValueOperator5EditPart;
import dsml.diagram.edit.parts.ValueOperatorValueOperator6EditPart;
import dsml.diagram.edit.parts.ValueOperatorValueOperatorEditPart;
import dsml.diagram.edit.parts.WindowWindowEditPart;
import dsml.diagram.parsers.MessageFormatParser;
import dsml.diagram.part.DsmlVisualIDRegistry;

/**
 * @generated
 */
public class DsmlParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser ruleRuleName_5056Parser;

	/**
	 * @generated
	 */
	private IParser getRuleRuleName_5056Parser() {
		if (ruleRuleName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getRule_RuleName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ruleRuleName_5056Parser = parser;
		}
		return ruleRuleName_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventEventName_5058Parser;

	/**
	 * @generated
	 */
	private IParser getEventEventName_5058Parser() {
		if (eventEventName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getEvent_EventName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventEventName_5058Parser = parser;
		}
		return eventEventName_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventPatternEventPattern_5064Parser;

	/**
	 * @generated
	 */
	private IParser getEventPatternEventPattern_5064Parser() {
		if (eventPatternEventPattern_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getEventPattern_EventPattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPatternEventPattern_5064Parser = parser;
		}
		return eventPatternEventPattern_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventOutputOutputName_5076Parser;

	/**
	 * @generated
	 */
	private IParser getEventOutputOutputName_5076Parser() {
		if (eventOutputOutputName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getEventOutput_OutputName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventOutputOutputName_5076Parser = parser;
		}
		return eventOutputOutputName_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser windowWindow_5077Parser;

	/**
	 * @generated
	 */
	private IParser getWindowWindow_5077Parser() {
		if (windowWindow_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getWindow_Window() };
			MessageFormatParser parser = new MessageFormatParser(features);
			windowWindow_5077Parser = parser;
		}
		return windowWindow_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser targetGroupbyTargetGroupby_5078Parser;

	/**
	 * @generated
	 */
	private IParser getTargetGroupbyTargetGroupby_5078Parser() {
		if (targetGroupbyTargetGroupby_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getTargetGroupby_TargetGroupby() };
			MessageFormatParser parser = new MessageFormatParser(features);
			targetGroupbyTargetGroupby_5078Parser = parser;
		}
		return targetGroupbyTargetGroupby_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser targetTargetAlias_5045Parser;

	/**
	 * @generated
	 */
	private IParser getTargetTargetAlias_5045Parser() {
		if (targetTargetAlias_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getTarget_TargetAlias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			targetTargetAlias_5045Parser = parser;
		}
		return targetTargetAlias_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser targetTargetAlias_5044Parser;

	/**
	 * @generated
	 */
	private IParser getTargetTargetAlias_5044Parser() {
		if (targetTargetAlias_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getTarget_TargetAlias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			targetTargetAlias_5044Parser = parser;
		}
		return targetTargetAlias_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDescription_5001Parser;

	/**
	 * @generated
	 */
	private IParser getNotDescription_5001Parser() {
		if (notDescription_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getNot_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notDescription_5001Parser = parser;
		}
		return notDescription_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser unaryPatternName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getUnaryPatternName_5002Parser() {
		if (unaryPatternName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getUnaryPattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unaryPatternName_5002Parser = parser;
		}
		return unaryPatternName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser patternTimerPatternTimer_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPatternTimerPatternTimer_5003Parser() {
		if (patternTimerPatternTimer_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getPatternTimer_PatternTimer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			patternTimerPatternTimer_5003Parser = parser;
		}
		return patternTimerPatternTimer_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatPatternRepeatPattern_5004Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatPatternRepeatPattern_5004Parser() {
		if (repeatPatternRepeatPattern_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getRepeatPattern_RepeatPattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatPatternRepeatPattern_5004Parser = parser;
		}
		return repeatPatternRepeatPattern_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationTypeAggregation_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationTypeAggregation_5005Parser() {
		if (aggregationTypeAggregation_5005Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getAggregation_TypeAggregation();
			EnumParser parser = new EnumParser(editableFeature);
			aggregationTypeAggregation_5005Parser = parser;
		}
		return aggregationTypeAggregation_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionGroupConditionGroup_5043Parser;

	/**
	 * @generated
	 */
	private IParser getConditionGroupConditionGroup_5043Parser() {
		if (conditionGroupConditionGroup_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getConditionGroup_ConditionGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionGroupConditionGroup_5043Parser = parser;
		}
		return conditionGroupConditionGroup_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser targetTargetAlias_5042Parser;

	/**
	 * @generated
	 */
	private IParser getTargetTargetAlias_5042Parser() {
		if (targetTargetAlias_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getTarget_TargetAlias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			targetTargetAlias_5042Parser = parser;
		}
		return targetTargetAlias_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupbyConditionGroupbyCondition_5041Parser;

	/**
	 * @generated
	 */
	private IParser getGroupbyConditionGroupbyCondition_5041Parser() {
		if (groupbyConditionGroupbyCondition_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getGroupbyCondition_GroupbyCondition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupbyConditionGroupbyCondition_5041Parser = parser;
		}
		return groupbyConditionGroupbyCondition_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser targetTargetAlias_5040Parser;

	/**
	 * @generated
	 */
	private IParser getTargetTargetAlias_5040Parser() {
		if (targetTargetAlias_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getTarget_TargetAlias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			targetTargetAlias_5040Parser = parser;
		}
		return targetTargetAlias_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser bringGroupBringGroup_5039Parser;

	/**
	 * @generated
	 */
	private IParser getBringGroupBringGroup_5039Parser() {
		if (bringGroupBringGroup_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getBringGroup_BringGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bringGroupBringGroup_5039Parser = parser;
		}
		return bringGroupBringGroup_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser targetTargetAlias_5008Parser;

	/**
	 * @generated
	 */
	private IParser getTargetTargetAlias_5008Parser() {
		if (targetTargetAlias_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getTarget_TargetAlias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			targetTargetAlias_5008Parser = parser;
		}
		return targetTargetAlias_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatorOperator_5006Parser;

	/**
	 * @generated
	 */
	private IParser getOperatorOperator_5006Parser() {
		if (operatorOperator_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getOperator_Operator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatorOperator_5006Parser = parser;
		}
		return operatorOperator_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueOperatorValueOperator_5007Parser;

	/**
	 * @generated
	 */
	private IParser getValueOperatorValueOperator_5007Parser() {
		if (valueOperatorValueOperator_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getValueOperator_ValueOperator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueOperatorValueOperator_5007Parser = parser;
		}
		return valueOperatorValueOperator_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDescription_5009Parser;

	/**
	 * @generated
	 */
	private IParser getNotDescription_5009Parser() {
		if (notDescription_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getNot_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notDescription_5009Parser = parser;
		}
		return notDescription_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser unaryPatternName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getUnaryPatternName_5010Parser() {
		if (unaryPatternName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getUnaryPattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unaryPatternName_5010Parser = parser;
		}
		return unaryPatternName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser patternTimerPatternTimer_5011Parser;

	/**
	 * @generated
	 */
	private IParser getPatternTimerPatternTimer_5011Parser() {
		if (patternTimerPatternTimer_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getPatternTimer_PatternTimer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			patternTimerPatternTimer_5011Parser = parser;
		}
		return patternTimerPatternTimer_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatPatternRepeatPattern_5012Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatPatternRepeatPattern_5012Parser() {
		if (repeatPatternRepeatPattern_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getRepeatPattern_RepeatPattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatPatternRepeatPattern_5012Parser = parser;
		}
		return repeatPatternRepeatPattern_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationTypeAggregation_5013Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationTypeAggregation_5013Parser() {
		if (aggregationTypeAggregation_5013Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getAggregation_TypeAggregation();
			EnumParser parser = new EnumParser(editableFeature);
			aggregationTypeAggregation_5013Parser = parser;
		}
		return aggregationTypeAggregation_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionGroupConditionGroup_5038Parser;

	/**
	 * @generated
	 */
	private IParser getConditionGroupConditionGroup_5038Parser() {
		if (conditionGroupConditionGroup_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getConditionGroup_ConditionGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionGroupConditionGroup_5038Parser = parser;
		}
		return conditionGroupConditionGroup_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDescription_5014Parser;

	/**
	 * @generated
	 */
	private IParser getNotDescription_5014Parser() {
		if (notDescription_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getNot_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notDescription_5014Parser = parser;
		}
		return notDescription_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser unaryPatternName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getUnaryPatternName_5015Parser() {
		if (unaryPatternName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getUnaryPattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unaryPatternName_5015Parser = parser;
		}
		return unaryPatternName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser patternTimerPatternTimer_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPatternTimerPatternTimer_5016Parser() {
		if (patternTimerPatternTimer_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getPatternTimer_PatternTimer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			patternTimerPatternTimer_5016Parser = parser;
		}
		return patternTimerPatternTimer_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatPatternRepeatPattern_5017Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatPatternRepeatPattern_5017Parser() {
		if (repeatPatternRepeatPattern_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getRepeatPattern_RepeatPattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatPatternRepeatPattern_5017Parser = parser;
		}
		return repeatPatternRepeatPattern_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationTypeAggregation_5018Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationTypeAggregation_5018Parser() {
		if (aggregationTypeAggregation_5018Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getAggregation_TypeAggregation();
			EnumParser parser = new EnumParser(editableFeature);
			aggregationTypeAggregation_5018Parser = parser;
		}
		return aggregationTypeAggregation_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionGroupConditionGroup_5037Parser;

	/**
	 * @generated
	 */
	private IParser getConditionGroupConditionGroup_5037Parser() {
		if (conditionGroupConditionGroup_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getConditionGroup_ConditionGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionGroupConditionGroup_5037Parser = parser;
		}
		return conditionGroupConditionGroup_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupbyConditionGroupbyCondition_5036Parser;

	/**
	 * @generated
	 */
	private IParser getGroupbyConditionGroupbyCondition_5036Parser() {
		if (groupbyConditionGroupbyCondition_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getGroupbyCondition_GroupbyCondition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupbyConditionGroupbyCondition_5036Parser = parser;
		}
		return groupbyConditionGroupbyCondition_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDescription_5019Parser;

	/**
	 * @generated
	 */
	private IParser getNotDescription_5019Parser() {
		if (notDescription_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getNot_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notDescription_5019Parser = parser;
		}
		return notDescription_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser unaryPatternName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getUnaryPatternName_5020Parser() {
		if (unaryPatternName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getUnaryPattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unaryPatternName_5020Parser = parser;
		}
		return unaryPatternName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser patternTimerPatternTimer_5021Parser;

	/**
	 * @generated
	 */
	private IParser getPatternTimerPatternTimer_5021Parser() {
		if (patternTimerPatternTimer_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getPatternTimer_PatternTimer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			patternTimerPatternTimer_5021Parser = parser;
		}
		return patternTimerPatternTimer_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatPatternRepeatPattern_5022Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatPatternRepeatPattern_5022Parser() {
		if (repeatPatternRepeatPattern_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getRepeatPattern_RepeatPattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatPatternRepeatPattern_5022Parser = parser;
		}
		return repeatPatternRepeatPattern_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationTypeAggregation_5023Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationTypeAggregation_5023Parser() {
		if (aggregationTypeAggregation_5023Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getAggregation_TypeAggregation();
			EnumParser parser = new EnumParser(editableFeature);
			aggregationTypeAggregation_5023Parser = parser;
		}
		return aggregationTypeAggregation_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionGroupConditionGroup_5035Parser;

	/**
	 * @generated
	 */
	private IParser getConditionGroupConditionGroup_5035Parser() {
		if (conditionGroupConditionGroup_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getConditionGroup_ConditionGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionGroupConditionGroup_5035Parser = parser;
		}
		return conditionGroupConditionGroup_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser bringGroupBringGroup_5032Parser;

	/**
	 * @generated
	 */
	private IParser getBringGroupBringGroup_5032Parser() {
		if (bringGroupBringGroup_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getBringGroup_BringGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bringGroupBringGroup_5032Parser = parser;
		}
		return bringGroupBringGroup_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupbyConditionGroupbyCondition_5031Parser;

	/**
	 * @generated
	 */
	private IParser getGroupbyConditionGroupbyCondition_5031Parser() {
		if (groupbyConditionGroupbyCondition_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getGroupbyCondition_GroupbyCondition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupbyConditionGroupbyCondition_5031Parser = parser;
		}
		return groupbyConditionGroupbyCondition_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupbyConditionGroupbyCondition_5030Parser;

	/**
	 * @generated
	 */
	private IParser getGroupbyConditionGroupbyCondition_5030Parser() {
		if (groupbyConditionGroupbyCondition_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getGroupbyCondition_GroupbyCondition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupbyConditionGroupbyCondition_5030Parser = parser;
		}
		return groupbyConditionGroupbyCondition_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser bringGroupBringGroup_5027Parser;

	/**
	 * @generated
	 */
	private IParser getBringGroupBringGroup_5027Parser() {
		if (bringGroupBringGroup_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getBringGroup_BringGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bringGroupBringGroup_5027Parser = parser;
		}
		return bringGroupBringGroup_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser bringGroupBringGroup_5026Parser;

	/**
	 * @generated
	 */
	private IParser getBringGroupBringGroup_5026Parser() {
		if (bringGroupBringGroup_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getBringGroup_BringGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bringGroupBringGroup_5026Parser = parser;
		}
		return bringGroupBringGroup_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatorOperator_5024Parser;

	/**
	 * @generated
	 */
	private IParser getOperatorOperator_5024Parser() {
		if (operatorOperator_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getOperator_Operator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatorOperator_5024Parser = parser;
		}
		return operatorOperator_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueOperatorValueOperator_5025Parser;

	/**
	 * @generated
	 */
	private IParser getValueOperatorValueOperator_5025Parser() {
		if (valueOperatorValueOperator_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getValueOperator_ValueOperator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueOperatorValueOperator_5025Parser = parser;
		}
		return valueOperatorValueOperator_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatorOperator_5028Parser;

	/**
	 * @generated
	 */
	private IParser getOperatorOperator_5028Parser() {
		if (operatorOperator_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getOperator_Operator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatorOperator_5028Parser = parser;
		}
		return operatorOperator_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueOperatorValueOperator_5029Parser;

	/**
	 * @generated
	 */
	private IParser getValueOperatorValueOperator_5029Parser() {
		if (valueOperatorValueOperator_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getValueOperator_ValueOperator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueOperatorValueOperator_5029Parser = parser;
		}
		return valueOperatorValueOperator_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatorOperator_5033Parser;

	/**
	 * @generated
	 */
	private IParser getOperatorOperator_5033Parser() {
		if (operatorOperator_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getOperator_Operator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatorOperator_5033Parser = parser;
		}
		return operatorOperator_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueOperatorValueOperator_5034Parser;

	/**
	 * @generated
	 */
	private IParser getValueOperatorValueOperator_5034Parser() {
		if (valueOperatorValueOperator_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getValueOperator_ValueOperator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueOperatorValueOperator_5034Parser = parser;
		}
		return valueOperatorValueOperator_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDescription_5046Parser;

	/**
	 * @generated
	 */
	private IParser getNotDescription_5046Parser() {
		if (notDescription_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getNot_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notDescription_5046Parser = parser;
		}
		return notDescription_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser unaryPatternName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getUnaryPatternName_5047Parser() {
		if (unaryPatternName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getUnaryPattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unaryPatternName_5047Parser = parser;
		}
		return unaryPatternName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser patternTimerPatternTimer_5048Parser;

	/**
	 * @generated
	 */
	private IParser getPatternTimerPatternTimer_5048Parser() {
		if (patternTimerPatternTimer_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getPatternTimer_PatternTimer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			patternTimerPatternTimer_5048Parser = parser;
		}
		return patternTimerPatternTimer_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatPatternRepeatPattern_5049Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatPatternRepeatPattern_5049Parser() {
		if (repeatPatternRepeatPattern_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getRepeatPattern_RepeatPattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatPatternRepeatPattern_5049Parser = parser;
		}
		return repeatPatternRepeatPattern_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationTypeAggregation_5050Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationTypeAggregation_5050Parser() {
		if (aggregationTypeAggregation_5050Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getAggregation_TypeAggregation();
			EnumParser parser = new EnumParser(editableFeature);
			aggregationTypeAggregation_5050Parser = parser;
		}
		return aggregationTypeAggregation_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionGroupConditionGroup_5051Parser;

	/**
	 * @generated
	 */
	private IParser getConditionGroupConditionGroup_5051Parser() {
		if (conditionGroupConditionGroup_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getConditionGroup_ConditionGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionGroupConditionGroup_5051Parser = parser;
		}
		return conditionGroupConditionGroup_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupbyConditionGroupbyCondition_5052Parser;

	/**
	 * @generated
	 */
	private IParser getGroupbyConditionGroupbyCondition_5052Parser() {
		if (groupbyConditionGroupbyCondition_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getGroupbyCondition_GroupbyCondition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupbyConditionGroupbyCondition_5052Parser = parser;
		}
		return groupbyConditionGroupbyCondition_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser bringGroupBringGroup_5053Parser;

	/**
	 * @generated
	 */
	private IParser getBringGroupBringGroup_5053Parser() {
		if (bringGroupBringGroup_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getBringGroup_BringGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bringGroupBringGroup_5053Parser = parser;
		}
		return bringGroupBringGroup_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatorOperator_5054Parser;

	/**
	 * @generated
	 */
	private IParser getOperatorOperator_5054Parser() {
		if (operatorOperator_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getOperator_Operator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatorOperator_5054Parser = parser;
		}
		return operatorOperator_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueOperatorValueOperator_5055Parser;

	/**
	 * @generated
	 */
	private IParser getValueOperatorValueOperator_5055Parser() {
		if (valueOperatorValueOperator_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getValueOperator_ValueOperator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueOperatorValueOperator_5055Parser = parser;
		}
		return valueOperatorValueOperator_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeNameType_5057Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeNameType_5057Parser() {
		if (attributeNameType_5057Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DsmlPackage.eINSTANCE.getAttribute_Name(),
					DsmlPackage.eINSTANCE.getAttribute_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			attributeNameType_5057Parser = parser;
		}
		return attributeNameType_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser targetTargetAlias_5059Parser;

	/**
	 * @generated
	 */
	private IParser getTargetTargetAlias_5059Parser() {
		if (targetTargetAlias_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getTarget_TargetAlias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			targetTargetAlias_5059Parser = parser;
		}
		return targetTargetAlias_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDescription_5060Parser;

	/**
	 * @generated
	 */
	private IParser getNotDescription_5060Parser() {
		if (notDescription_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getNot_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notDescription_5060Parser = parser;
		}
		return notDescription_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser unaryPatternName_5061Parser;

	/**
	 * @generated
	 */
	private IParser getUnaryPatternName_5061Parser() {
		if (unaryPatternName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getUnaryPattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unaryPatternName_5061Parser = parser;
		}
		return unaryPatternName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser patternTimerPatternTimer_5062Parser;

	/**
	 * @generated
	 */
	private IParser getPatternTimerPatternTimer_5062Parser() {
		if (patternTimerPatternTimer_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getPatternTimer_PatternTimer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			patternTimerPatternTimer_5062Parser = parser;
		}
		return patternTimerPatternTimer_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatPatternRepeatPattern_5063Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatPatternRepeatPattern_5063Parser() {
		if (repeatPatternRepeatPattern_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getRepeatPattern_RepeatPattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatPatternRepeatPattern_5063Parser = parser;
		}
		return repeatPatternRepeatPattern_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser targetTargetAlias_5065Parser;

	/**
	 * @generated
	 */
	private IParser getTargetTargetAlias_5065Parser() {
		if (targetTargetAlias_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getTarget_TargetAlias() };
			MessageFormatParser parser = new MessageFormatParser(features);
			targetTargetAlias_5065Parser = parser;
		}
		return targetTargetAlias_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser notDescription_5066Parser;

	/**
	 * @generated
	 */
	private IParser getNotDescription_5066Parser() {
		if (notDescription_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getNot_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notDescription_5066Parser = parser;
		}
		return notDescription_5066Parser;
	}

	/**
	 * @generated
	 */
	private IParser unaryPatternName_5067Parser;

	/**
	 * @generated
	 */
	private IParser getUnaryPatternName_5067Parser() {
		if (unaryPatternName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getUnaryPattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unaryPatternName_5067Parser = parser;
		}
		return unaryPatternName_5067Parser;
	}

	/**
	 * @generated
	 */
	private IParser patternTimerPatternTimer_5068Parser;

	/**
	 * @generated
	 */
	private IParser getPatternTimerPatternTimer_5068Parser() {
		if (patternTimerPatternTimer_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getPatternTimer_PatternTimer() };
			MessageFormatParser parser = new MessageFormatParser(features);
			patternTimerPatternTimer_5068Parser = parser;
		}
		return patternTimerPatternTimer_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatPatternRepeatPattern_5069Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatPatternRepeatPattern_5069Parser() {
		if (repeatPatternRepeatPattern_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getRepeatPattern_RepeatPattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			repeatPatternRepeatPattern_5069Parser = parser;
		}
		return repeatPatternRepeatPattern_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationTypeAggregation_5070Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationTypeAggregation_5070Parser() {
		if (aggregationTypeAggregation_5070Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getAggregation_TypeAggregation();
			EnumParser parser = new EnumParser(editableFeature);
			aggregationTypeAggregation_5070Parser = parser;
		}
		return aggregationTypeAggregation_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionGroupConditionGroup_5071Parser;

	/**
	 * @generated
	 */
	private IParser getConditionGroupConditionGroup_5071Parser() {
		if (conditionGroupConditionGroup_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getConditionGroup_ConditionGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionGroupConditionGroup_5071Parser = parser;
		}
		return conditionGroupConditionGroup_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser groupbyConditionGroupbyCondition_5072Parser;

	/**
	 * @generated
	 */
	private IParser getGroupbyConditionGroupbyCondition_5072Parser() {
		if (groupbyConditionGroupbyCondition_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getGroupbyCondition_GroupbyCondition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupbyConditionGroupbyCondition_5072Parser = parser;
		}
		return groupbyConditionGroupbyCondition_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser bringGroupBringGroup_5073Parser;

	/**
	 * @generated
	 */
	private IParser getBringGroupBringGroup_5073Parser() {
		if (bringGroupBringGroup_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getBringGroup_BringGroup() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bringGroupBringGroup_5073Parser = parser;
		}
		return bringGroupBringGroup_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser operatorOperator_5074Parser;

	/**
	 * @generated
	 */
	private IParser getOperatorOperator_5074Parser() {
		if (operatorOperator_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getOperator_Operator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operatorOperator_5074Parser = parser;
		}
		return operatorOperator_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueOperatorValueOperator_5075Parser;

	/**
	 * @generated
	 */
	private IParser getValueOperatorValueOperator_5075Parser() {
		if (valueOperatorValueOperator_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { DsmlPackage.eINSTANCE
					.getValueOperator_ValueOperator() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueOperatorValueOperator_5075Parser = parser;
		}
		return valueOperatorValueOperator_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser comparisonComparison_6001Parser;

	/**
	 * @generated
	 */
	private IParser getComparisonComparison_6001Parser() {
		if (comparisonComparison_6001Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getComparison_Comparison();
			EnumParser parser = new EnumParser(editableFeature);
			comparisonComparison_6001Parser = parser;
		}
		return comparisonComparison_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser arithmeticArithmetic_6002Parser;

	/**
	 * @generated
	 */
	private IParser getArithmeticArithmetic_6002Parser() {
		if (arithmeticArithmetic_6002Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getArithmetic_Arithmetic();
			EnumParser parser = new EnumParser(editableFeature);
			arithmeticArithmetic_6002Parser = parser;
		}
		return arithmeticArithmetic_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser logicalConnectorTypeLogical_6003Parser;

	/**
	 * @generated
	 */
	private IParser getLogicalConnectorTypeLogical_6003Parser() {
		if (logicalConnectorTypeLogical_6003Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getLogicalConnector_TypeLogical();
			EnumParser parser = new EnumParser(editableFeature);
			logicalConnectorTypeLogical_6003Parser = parser;
		}
		return logicalConnectorTypeLogical_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkPatternTargetComparisonTarget_6004Parser;

	/**
	 * @generated
	 */
	private IParser getLinkPatternTargetComparisonTarget_6004Parser() {
		if (linkPatternTargetComparisonTarget_6004Parser == null) {
			EAttribute editableFeature = DsmlPackage.eINSTANCE
					.getLinkPatternTarget_ComparisonTarget();
			EnumParser parser = new EnumParser(editableFeature);
			linkPatternTargetComparisonTarget_6004Parser = parser;
		}
		return linkPatternTargetComparisonTarget_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RuleRuleNameEditPart.VISUAL_ID:
			return getRuleRuleName_5056Parser();
		case EventEventNameEditPart.VISUAL_ID:
			return getEventEventName_5058Parser();
		case EventPatternEventPatternEditPart.VISUAL_ID:
			return getEventPatternEventPattern_5064Parser();
		case EventOutputOutputNameEditPart.VISUAL_ID:
			return getEventOutputOutputName_5076Parser();
		case WindowWindowEditPart.VISUAL_ID:
			return getWindowWindow_5077Parser();
		case TargetGroupbyTargetGroupbyEditPart.VISUAL_ID:
			return getTargetGroupbyTargetGroupby_5078Parser();
		case TargetTargetAliasEditPart.VISUAL_ID:
			return getTargetTargetAlias_5045Parser();
		case TargetTargetAlias2EditPart.VISUAL_ID:
			return getTargetTargetAlias_5044Parser();
		case NotDescriptionEditPart.VISUAL_ID:
			return getNotDescription_5001Parser();
		case UnaryPatternNameEditPart.VISUAL_ID:
			return getUnaryPatternName_5002Parser();
		case PatternTimerPatternTimerEditPart.VISUAL_ID:
			return getPatternTimerPatternTimer_5003Parser();
		case RepeatPatternRepeatPatternEditPart.VISUAL_ID:
			return getRepeatPatternRepeatPattern_5004Parser();

		case AggregationTypeAggregationEditPart.VISUAL_ID:
			return getAggregationTypeAggregation_5005Parser();
		case ConditionGroupConditionGroupEditPart.VISUAL_ID:
			return getConditionGroupConditionGroup_5043Parser();
		case TargetTargetAlias3EditPart.VISUAL_ID:
			return getTargetTargetAlias_5042Parser();
		case GroupbyConditionGroupbyConditionEditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyCondition_5041Parser();
		case TargetTargetAlias4EditPart.VISUAL_ID:
			return getTargetTargetAlias_5040Parser();
		case BringGroupBringGroupEditPart.VISUAL_ID:
			return getBringGroupBringGroup_5039Parser();
		case TargetTargetAlias5EditPart.VISUAL_ID:
			return getTargetTargetAlias_5008Parser();
		case OperatorOperatorEditPart.VISUAL_ID:
			return getOperatorOperator_5006Parser();
		case ValueOperatorValueOperatorEditPart.VISUAL_ID:
			return getValueOperatorValueOperator_5007Parser();
		case NotDescription2EditPart.VISUAL_ID:
			return getNotDescription_5009Parser();
		case UnaryPatternName2EditPart.VISUAL_ID:
			return getUnaryPatternName_5010Parser();
		case PatternTimerPatternTimer2EditPart.VISUAL_ID:
			return getPatternTimerPatternTimer_5011Parser();
		case RepeatPatternRepeatPattern2EditPart.VISUAL_ID:
			return getRepeatPatternRepeatPattern_5012Parser();

		case AggregationTypeAggregation2EditPart.VISUAL_ID:
			return getAggregationTypeAggregation_5013Parser();
		case ConditionGroupConditionGroup2EditPart.VISUAL_ID:
			return getConditionGroupConditionGroup_5038Parser();
		case NotDescription3EditPart.VISUAL_ID:
			return getNotDescription_5014Parser();
		case UnaryPatternName3EditPart.VISUAL_ID:
			return getUnaryPatternName_5015Parser();
		case PatternTimerPatternTimer3EditPart.VISUAL_ID:
			return getPatternTimerPatternTimer_5016Parser();
		case RepeatPatternRepeatPattern3EditPart.VISUAL_ID:
			return getRepeatPatternRepeatPattern_5017Parser();

		case AggregationTypeAggregation3EditPart.VISUAL_ID:
			return getAggregationTypeAggregation_5018Parser();
		case ConditionGroupConditionGroup3EditPart.VISUAL_ID:
			return getConditionGroupConditionGroup_5037Parser();
		case GroupbyConditionGroupbyCondition2EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyCondition_5036Parser();
		case NotDescription4EditPart.VISUAL_ID:
			return getNotDescription_5019Parser();
		case UnaryPatternName4EditPart.VISUAL_ID:
			return getUnaryPatternName_5020Parser();
		case PatternTimerPatternTimer4EditPart.VISUAL_ID:
			return getPatternTimerPatternTimer_5021Parser();
		case RepeatPatternRepeatPattern4EditPart.VISUAL_ID:
			return getRepeatPatternRepeatPattern_5022Parser();

		case AggregationTypeAggregation4EditPart.VISUAL_ID:
			return getAggregationTypeAggregation_5023Parser();
		case ConditionGroupConditionGroup4EditPart.VISUAL_ID:
			return getConditionGroupConditionGroup_5035Parser();
		case BringGroupBringGroup2EditPart.VISUAL_ID:
			return getBringGroupBringGroup_5032Parser();
		case GroupbyConditionGroupbyCondition3EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyCondition_5031Parser();
		case GroupbyConditionGroupbyCondition4EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyCondition_5030Parser();
		case BringGroupBringGroup3EditPart.VISUAL_ID:
			return getBringGroupBringGroup_5027Parser();
		case BringGroupBringGroup4EditPart.VISUAL_ID:
			return getBringGroupBringGroup_5026Parser();
		case OperatorOperator2EditPart.VISUAL_ID:
			return getOperatorOperator_5024Parser();
		case ValueOperatorValueOperator2EditPart.VISUAL_ID:
			return getValueOperatorValueOperator_5025Parser();
		case OperatorOperator3EditPart.VISUAL_ID:
			return getOperatorOperator_5028Parser();
		case ValueOperatorValueOperator3EditPart.VISUAL_ID:
			return getValueOperatorValueOperator_5029Parser();
		case OperatorOperator4EditPart.VISUAL_ID:
			return getOperatorOperator_5033Parser();
		case ValueOperatorValueOperator4EditPart.VISUAL_ID:
			return getValueOperatorValueOperator_5034Parser();
		case NotDescription5EditPart.VISUAL_ID:
			return getNotDescription_5046Parser();
		case UnaryPatternName5EditPart.VISUAL_ID:
			return getUnaryPatternName_5047Parser();
		case PatternTimerPatternTimer5EditPart.VISUAL_ID:
			return getPatternTimerPatternTimer_5048Parser();
		case RepeatPatternRepeatPattern5EditPart.VISUAL_ID:
			return getRepeatPatternRepeatPattern_5049Parser();

		case AggregationTypeAggregation5EditPart.VISUAL_ID:
			return getAggregationTypeAggregation_5050Parser();
		case ConditionGroupConditionGroup5EditPart.VISUAL_ID:
			return getConditionGroupConditionGroup_5051Parser();
		case GroupbyConditionGroupbyCondition5EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyCondition_5052Parser();
		case BringGroupBringGroup5EditPart.VISUAL_ID:
			return getBringGroupBringGroup_5053Parser();
		case OperatorOperator5EditPart.VISUAL_ID:
			return getOperatorOperator_5054Parser();
		case ValueOperatorValueOperator5EditPart.VISUAL_ID:
			return getValueOperatorValueOperator_5055Parser();
		case AttributeNameTypeEditPart.VISUAL_ID:
			return getAttributeNameType_5057Parser();
		case TargetTargetAlias6EditPart.VISUAL_ID:
			return getTargetTargetAlias_5059Parser();
		case NotDescription6EditPart.VISUAL_ID:
			return getNotDescription_5060Parser();
		case UnaryPatternName6EditPart.VISUAL_ID:
			return getUnaryPatternName_5061Parser();
		case PatternTimerPatternTimer6EditPart.VISUAL_ID:
			return getPatternTimerPatternTimer_5062Parser();
		case RepeatPatternRepeatPattern6EditPart.VISUAL_ID:
			return getRepeatPatternRepeatPattern_5063Parser();
		case TargetTargetAlias7EditPart.VISUAL_ID:
			return getTargetTargetAlias_5065Parser();
		case NotDescription7EditPart.VISUAL_ID:
			return getNotDescription_5066Parser();
		case UnaryPatternName7EditPart.VISUAL_ID:
			return getUnaryPatternName_5067Parser();
		case PatternTimerPatternTimer7EditPart.VISUAL_ID:
			return getPatternTimerPatternTimer_5068Parser();
		case RepeatPatternRepeatPattern7EditPart.VISUAL_ID:
			return getRepeatPatternRepeatPattern_5069Parser();

		case AggregationTypeAggregation6EditPart.VISUAL_ID:
			return getAggregationTypeAggregation_5070Parser();
		case ConditionGroupConditionGroup6EditPart.VISUAL_ID:
			return getConditionGroupConditionGroup_5071Parser();
		case GroupbyConditionGroupbyCondition6EditPart.VISUAL_ID:
			return getGroupbyConditionGroupbyCondition_5072Parser();
		case BringGroupBringGroup6EditPart.VISUAL_ID:
			return getBringGroupBringGroup_5073Parser();
		case OperatorOperator6EditPart.VISUAL_ID:
			return getOperatorOperator_5074Parser();
		case ValueOperatorValueOperator6EditPart.VISUAL_ID:
			return getValueOperatorValueOperator_5075Parser();

		case ComparisonComparisonEditPart.VISUAL_ID:
			return getComparisonComparison_6001Parser();

		case ArithmeticArithmeticEditPart.VISUAL_ID:
			return getArithmeticArithmetic_6002Parser();

		case LogicalConnectorTypeLogicalEditPart.VISUAL_ID:
			return getLogicalConnectorTypeLogical_6003Parser();

		case LinkPatternTargetComparisonTargetEditPart.VISUAL_ID:
			return getLinkPatternTargetComparisonTarget_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DsmlVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DsmlVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DsmlElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
