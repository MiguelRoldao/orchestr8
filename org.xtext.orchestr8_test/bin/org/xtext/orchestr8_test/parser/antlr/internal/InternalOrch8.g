/*
 * generated by Xtext 2.26.0
 */
grammar InternalOrch8;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.orchestr8_test.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.orchestr8_test.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.orchestr8_test.services.Orch8GrammarAccess;

}

@parser::members {

 	private Orch8GrammarAccess grammarAccess;

    public InternalOrch8Parser(TokenStream input, Orch8GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Orch8GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getScoresScoreParserRuleCall_0_0_0());
					}
					lv_scores_0_0=ruleScore
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"scores",
							lv_scores_0_0,
							"org.xtext.orchestr8_test.Orch8.Score");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getInstrumentsInstrumentParserRuleCall_0_1_0());
					}
					lv_instruments_1_0=ruleInstrument
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"instruments",
							lv_instruments_1_0,
							"org.xtext.orchestr8_test.Orch8.Instrument");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getMixerMixerParserRuleCall_1_0());
				}
				lv_mixer_2_0=ruleMixer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"mixer",
						lv_mixer_2_0,
						"org.xtext.orchestr8_test.Orch8.Mixer");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getScoresScoreParserRuleCall_2_0_0());
					}
					lv_scores_3_0=ruleScore
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"scores",
							lv_scores_3_0,
							"org.xtext.orchestr8_test.Orch8.Score");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getInstrumentsInstrumentParserRuleCall_2_1_0());
					}
					lv_instruments_4_0=ruleInstrument
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"instruments",
							lv_instruments_4_0,
							"org.xtext.orchestr8_test.Orch8.Instrument");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCommandAccess().getCmdTempoParserRuleCall_0());
		}
		this_CmdTempo_0=ruleCmdTempo
		{
			$current = $this_CmdTempo_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getCmdTimeSignatureParserRuleCall_1());
		}
		this_CmdTimeSignature_1=ruleCmdTimeSignature
		{
			$current = $this_CmdTimeSignature_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getCmdPlayParserRuleCall_2());
		}
		this_CmdPlay_2=ruleCmdPlay
		{
			$current = $this_CmdPlay_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getCmdInstrumentParserRuleCall_3());
		}
		this_CmdInstrument_3=ruleCmdInstrument
		{
			$current = $this_CmdInstrument_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getCmdSetParserRuleCall_4());
		}
		this_CmdSet_4=ruleCmdSet
		{
			$current = $this_CmdSet_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMixer
entryRuleMixer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMixerRule()); }
	iv_ruleMixer=ruleMixer
	{ $current=$iv_ruleMixer.current; }
	EOF;

// Rule Mixer
ruleMixer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Mixer'
		{
			newLeafNode(otherlv_0, grammarAccess.getMixerAccess().getMixerKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMixerAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMixerRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.orchestr8_test.Orch8.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMixerAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='sampling_rate'
			{
				newLeafNode(otherlv_3, grammarAccess.getMixerAccess().getSampling_rateKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMixerAccess().getSampling_rateEIntParserRuleCall_3_1_0());
					}
					lv_sampling_rate_4_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMixerRule());
						}
						set(
							$current,
							"sampling_rate",
							lv_sampling_rate_4_0,
							"org.xtext.orchestr8_test.Orch8.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='scores'
		{
			newLeafNode(otherlv_5, grammarAccess.getMixerAccess().getScoresKeyword_4());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getMixerAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMixerRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getMixerAccess().getScoresScoreCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getMixerAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMixerRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getMixerAccess().getScoresScoreCrossReference_7_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getMixerAccess().getRightCurlyBracketKeyword_8());
		}
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getMixerAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleScore
entryRuleScore returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScoreRule()); }
	iv_ruleScore=ruleScore
	{ $current=$iv_ruleScore.current; }
	EOF;

// Rule Score
ruleScore returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Score'
		{
			newLeafNode(otherlv_0, grammarAccess.getScoreAccess().getScoreKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScoreAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScoreRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.orchestr8_test.Orch8.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getScoreAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='@Setup'
			{
				newLeafNode(otherlv_3, grammarAccess.getScoreAccess().getSetupKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getScoreAccess().getSetupCommandParserRuleCall_3_1_0());
					}
					lv_setup_4_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScoreRule());
						}
						add(
							$current,
							"setup",
							lv_setup_4_0,
							"org.xtext.orchestr8_test.Orch8.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getScoreAccess().getMeasuresMeasureParserRuleCall_4_0());
				}
				lv_measures_5_0=ruleMeasure
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScoreRule());
					}
					add(
						$current,
						"measures",
						lv_measures_5_0,
						"org.xtext.orchestr8_test.Orch8.Measure");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			otherlv_6='@End'
			{
				newLeafNode(otherlv_6, grammarAccess.getScoreAccess().getEndKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getScoreAccess().getEndCommandParserRuleCall_5_1_0());
					}
					lv_end_7_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScoreRule());
						}
						add(
							$current,
							"end",
							lv_end_7_0,
							"org.xtext.orchestr8_test.Orch8.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getScoreAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleInstrument
entryRuleInstrument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstrumentRule()); }
	iv_ruleInstrument=ruleInstrument
	{ $current=$iv_ruleInstrument.current; }
	EOF;

// Rule Instrument
ruleInstrument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Instrument'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstrumentAccess().getInstrumentKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstrumentAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstrumentRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.orchestr8_test.Orch8.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInstrumentAccess().getGeneratorGeneratorParserRuleCall_3_0());
				}
				lv_generator_3_0=ruleGenerator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstrumentRule());
					}
					set(
						$current,
						"generator",
						lv_generator_3_0,
						"org.xtext.orchestr8_test.Orch8.Generator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstrumentAccess().getParametersParameterParserRuleCall_4_0());
				}
				lv_parameters_4_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstrumentRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_4_0,
						"org.xtext.orchestr8_test.Orch8.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleMeasure
entryRuleMeasure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMeasureRule()); }
	iv_ruleMeasure=ruleMeasure
	{ $current=$iv_ruleMeasure.current; }
	EOF;

// Rule Measure
ruleMeasure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMeasureAccess().getMeasureAction_0(),
					$current);
			}
		)
		otherlv_1='@'
		{
			newLeafNode(otherlv_1, grammarAccess.getMeasureAccess().getCommercialAtKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMeasureAccess().getIDEIntParserRuleCall_2_0());
				}
				lv_ID_2_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMeasureRule());
					}
					set(
						$current,
						"ID",
						lv_ID_2_0,
						"org.xtext.orchestr8_test.Orch8.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMeasureAccess().getBeatsBeatParserRuleCall_3_0());
				}
				lv_beats_3_0=ruleBeat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMeasureRule());
					}
					add(
						$current,
						"beats",
						lv_beats_3_0,
						"org.xtext.orchestr8_test.Orch8.Beat");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleCmdInstrument
entryRuleCmdInstrument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCmdInstrumentRule()); }
	iv_ruleCmdInstrument=ruleCmdInstrument
	{ $current=$iv_ruleCmdInstrument.current; }
	EOF;

// Rule CmdInstrument
ruleCmdInstrument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='instrument'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getCmdInstrumentAccess().getTypeInstrumentKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCmdInstrumentRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "instrument");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCmdInstrumentAccess().getParameterParameterParserRuleCall_1_0());
				}
				lv_parameter_1_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCmdInstrumentRule());
					}
					set(
						$current,
						"parameter",
						lv_parameter_1_0,
						"org.xtext.orchestr8_test.Orch8.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCmdPlay
entryRuleCmdPlay returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCmdPlayRule()); }
	iv_ruleCmdPlay=ruleCmdPlay
	{ $current=$iv_ruleCmdPlay.current; }
	EOF;

// Rule CmdPlay
ruleCmdPlay returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='play'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getCmdPlayAccess().getTypePlayKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCmdPlayRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "play");
				}
			)
		)
		(
			(
				lv_note_1_0=RULE_NOTE
				{
					newLeafNode(lv_note_1_0, grammarAccess.getCmdPlayAccess().getNoteNOTETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCmdPlayRule());
					}
					setWithLastConsumed(
						$current,
						"note",
						lv_note_1_0,
						"org.xtext.orchestr8_test.Orch8.NOTE");
				}
			)
		)
		otherlv_2='length'
		{
			newLeafNode(otherlv_2, grammarAccess.getCmdPlayAccess().getLengthKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCmdPlayAccess().getLengthEDoubleParserRuleCall_3_0());
				}
				lv_length_3_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCmdPlayRule());
					}
					set(
						$current,
						"length",
						lv_length_3_0,
						"org.xtext.orchestr8_test.Orch8.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCmdTempo
entryRuleCmdTempo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCmdTempoRule()); }
	iv_ruleCmdTempo=ruleCmdTempo
	{ $current=$iv_ruleCmdTempo.current; }
	EOF;

// Rule CmdTempo
ruleCmdTempo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='tempo'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getCmdTempoAccess().getTypeTempoKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCmdTempoRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "tempo");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCmdTempoAccess().getBpmEIntParserRuleCall_1_0());
				}
				lv_bpm_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCmdTempoRule());
					}
					set(
						$current,
						"bpm",
						lv_bpm_1_0,
						"org.xtext.orchestr8_test.Orch8.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCmdTimeSignature
entryRuleCmdTimeSignature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCmdTimeSignatureRule()); }
	iv_ruleCmdTimeSignature=ruleCmdTimeSignature
	{ $current=$iv_ruleCmdTimeSignature.current; }
	EOF;

// Rule CmdTimeSignature
ruleCmdTimeSignature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='time_signature'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getCmdTimeSignatureAccess().getTypeTime_signatureKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCmdTimeSignatureRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "time_signature");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCmdTimeSignatureAccess().getNumeratorEIntParserRuleCall_1_0());
				}
				lv_numerator_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCmdTimeSignatureRule());
					}
					set(
						$current,
						"numerator",
						lv_numerator_1_0,
						"org.xtext.orchestr8_test.Orch8.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='/'
		{
			newLeafNode(otherlv_2, grammarAccess.getCmdTimeSignatureAccess().getSolidusKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCmdTimeSignatureAccess().getDenominatorEIntParserRuleCall_3_0());
				}
				lv_denominator_3_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCmdTimeSignatureRule());
					}
					set(
						$current,
						"denominator",
						lv_denominator_3_0,
						"org.xtext.orchestr8_test.Orch8.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCmdSet
entryRuleCmdSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCmdSetRule()); }
	iv_ruleCmdSet=ruleCmdSet
	{ $current=$iv_ruleCmdSet.current; }
	EOF;

// Rule CmdSet
ruleCmdSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='set'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getCmdSetAccess().getTypeSetKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCmdSetRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "set");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCmdSetRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCmdSetAccess().getInstrumentInstrumentCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getIDEStringParserRuleCall_0_0());
				}
				lv_ID_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"ID",
						lv_ID_0_0,
						"org.xtext.orchestr8_test.Orch8.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getValueEDoubleParserRuleCall_1_0());
				}
				lv_value_1_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.xtext.orchestr8_test.Orch8.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBeat
entryRuleBeat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBeatRule()); }
	iv_ruleBeat=ruleBeat
	{ $current=$iv_ruleBeat.current; }
	EOF;

// Rule Beat
ruleBeat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getBeatAccess().getColonKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBeatAccess().getIDEDoubleParserRuleCall_1_0());
				}
				lv_ID_1_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBeatRule());
					}
					set(
						$current,
						"ID",
						lv_ID_1_0,
						"org.xtext.orchestr8_test.Orch8.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBeatAccess().getCommandsCommandParserRuleCall_2_0());
				}
				lv_commands_2_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBeatRule());
					}
					add(
						$current,
						"commands",
						lv_commands_2_0,
						"org.xtext.orchestr8_test.Orch8.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleGenerator
entryRuleGenerator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneratorRule()); }
	iv_ruleGenerator=ruleGenerator
	{ $current=$iv_ruleGenerator.current; }
	EOF;

// Rule Generator
ruleGenerator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_mode_0_1='type'
					{
						newLeafNode(lv_mode_0_1, grammarAccess.getGeneratorAccess().getModeTypeKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGeneratorRule());
						}
						setWithLastConsumed($current, "mode", lv_mode_0_1, null);
					}
					    |
					lv_mode_0_2='custom'
					{
						newLeafNode(lv_mode_0_2, grammarAccess.getGeneratorAccess().getModeCustomKeyword_0_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGeneratorRule());
						}
						setWithLastConsumed($current, "mode", lv_mode_0_2, null);
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGeneratorAccess().getTypeEStringParserRuleCall_1_0());
				}
				lv_type_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGeneratorRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"org.xtext.orchestr8_test.Orch8.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_NOTE : ('a'..'g'|'A'..'Z') ('b'|'#')? '0'..'9';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;