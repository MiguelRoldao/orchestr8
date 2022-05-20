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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOrch8Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NOTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mixer'", "'{'", "'sampling_rate'", "'scores'", "','", "'}'", "'Score'", "'@Setup'", "'@End'", "'Instrument'", "'-'", "'.'", "'E'", "'e'", "'@'", "'instrument'", "'play'", "'length'", "'tempo'", "'time_signature'", "'/'", "'set'", "':'", "'type'", "'custom'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NOTE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOrch8Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOrch8Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOrch8Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalOrch8.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalOrch8.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOrch8.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalOrch8.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOrch8.g:71:1: ruleModel returns [EObject current=null] : ( ( ( (lv_scores_0_0= ruleScore ) ) | ( (lv_instruments_1_0= ruleInstrument ) ) )* ( (lv_mixer_2_0= ruleMixer ) ) ( ( (lv_scores_3_0= ruleScore ) ) | ( (lv_instruments_4_0= ruleInstrument ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_scores_0_0 = null;

        EObject lv_instruments_1_0 = null;

        EObject lv_mixer_2_0 = null;

        EObject lv_scores_3_0 = null;

        EObject lv_instruments_4_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:77:2: ( ( ( ( (lv_scores_0_0= ruleScore ) ) | ( (lv_instruments_1_0= ruleInstrument ) ) )* ( (lv_mixer_2_0= ruleMixer ) ) ( ( (lv_scores_3_0= ruleScore ) ) | ( (lv_instruments_4_0= ruleInstrument ) ) )* ) )
            // InternalOrch8.g:78:2: ( ( ( (lv_scores_0_0= ruleScore ) ) | ( (lv_instruments_1_0= ruleInstrument ) ) )* ( (lv_mixer_2_0= ruleMixer ) ) ( ( (lv_scores_3_0= ruleScore ) ) | ( (lv_instruments_4_0= ruleInstrument ) ) )* )
            {
            // InternalOrch8.g:78:2: ( ( ( (lv_scores_0_0= ruleScore ) ) | ( (lv_instruments_1_0= ruleInstrument ) ) )* ( (lv_mixer_2_0= ruleMixer ) ) ( ( (lv_scores_3_0= ruleScore ) ) | ( (lv_instruments_4_0= ruleInstrument ) ) )* )
            // InternalOrch8.g:79:3: ( ( (lv_scores_0_0= ruleScore ) ) | ( (lv_instruments_1_0= ruleInstrument ) ) )* ( (lv_mixer_2_0= ruleMixer ) ) ( ( (lv_scores_3_0= ruleScore ) ) | ( (lv_instruments_4_0= ruleInstrument ) ) )*
            {
            // InternalOrch8.g:79:3: ( ( (lv_scores_0_0= ruleScore ) ) | ( (lv_instruments_1_0= ruleInstrument ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }
                else if ( (LA1_0==21) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOrch8.g:80:4: ( (lv_scores_0_0= ruleScore ) )
            	    {
            	    // InternalOrch8.g:80:4: ( (lv_scores_0_0= ruleScore ) )
            	    // InternalOrch8.g:81:5: (lv_scores_0_0= ruleScore )
            	    {
            	    // InternalOrch8.g:81:5: (lv_scores_0_0= ruleScore )
            	    // InternalOrch8.g:82:6: lv_scores_0_0= ruleScore
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getScoresScoreParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_scores_0_0=ruleScore();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scores",
            	    							lv_scores_0_0,
            	    							"org.xtext.orchestr8_test.Orch8.Score");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOrch8.g:100:4: ( (lv_instruments_1_0= ruleInstrument ) )
            	    {
            	    // InternalOrch8.g:100:4: ( (lv_instruments_1_0= ruleInstrument ) )
            	    // InternalOrch8.g:101:5: (lv_instruments_1_0= ruleInstrument )
            	    {
            	    // InternalOrch8.g:101:5: (lv_instruments_1_0= ruleInstrument )
            	    // InternalOrch8.g:102:6: lv_instruments_1_0= ruleInstrument
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getInstrumentsInstrumentParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_instruments_1_0=ruleInstrument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instruments",
            	    							lv_instruments_1_0,
            	    							"org.xtext.orchestr8_test.Orch8.Instrument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalOrch8.g:120:3: ( (lv_mixer_2_0= ruleMixer ) )
            // InternalOrch8.g:121:4: (lv_mixer_2_0= ruleMixer )
            {
            // InternalOrch8.g:121:4: (lv_mixer_2_0= ruleMixer )
            // InternalOrch8.g:122:5: lv_mixer_2_0= ruleMixer
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMixerMixerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_mixer_2_0=ruleMixer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"mixer",
            						lv_mixer_2_0,
            						"org.xtext.orchestr8_test.Orch8.Mixer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrch8.g:139:3: ( ( (lv_scores_3_0= ruleScore ) ) | ( (lv_instruments_4_0= ruleInstrument ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }
                else if ( (LA2_0==21) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOrch8.g:140:4: ( (lv_scores_3_0= ruleScore ) )
            	    {
            	    // InternalOrch8.g:140:4: ( (lv_scores_3_0= ruleScore ) )
            	    // InternalOrch8.g:141:5: (lv_scores_3_0= ruleScore )
            	    {
            	    // InternalOrch8.g:141:5: (lv_scores_3_0= ruleScore )
            	    // InternalOrch8.g:142:6: lv_scores_3_0= ruleScore
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getScoresScoreParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_scores_3_0=ruleScore();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scores",
            	    							lv_scores_3_0,
            	    							"org.xtext.orchestr8_test.Orch8.Score");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOrch8.g:160:4: ( (lv_instruments_4_0= ruleInstrument ) )
            	    {
            	    // InternalOrch8.g:160:4: ( (lv_instruments_4_0= ruleInstrument ) )
            	    // InternalOrch8.g:161:5: (lv_instruments_4_0= ruleInstrument )
            	    {
            	    // InternalOrch8.g:161:5: (lv_instruments_4_0= ruleInstrument )
            	    // InternalOrch8.g:162:6: lv_instruments_4_0= ruleInstrument
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getInstrumentsInstrumentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_instruments_4_0=ruleInstrument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instruments",
            	    							lv_instruments_4_0,
            	    							"org.xtext.orchestr8_test.Orch8.Instrument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalOrch8.g:184:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalOrch8.g:184:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalOrch8.g:185:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalOrch8.g:191:1: ruleCommand returns [EObject current=null] : (this_CmdTempo_0= ruleCmdTempo | this_CmdTimeSignature_1= ruleCmdTimeSignature | this_CmdPlay_2= ruleCmdPlay | this_CmdInstrument_3= ruleCmdInstrument | this_CmdSet_4= ruleCmdSet ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_CmdTempo_0 = null;

        EObject this_CmdTimeSignature_1 = null;

        EObject this_CmdPlay_2 = null;

        EObject this_CmdInstrument_3 = null;

        EObject this_CmdSet_4 = null;



        	enterRule();

        try {
            // InternalOrch8.g:197:2: ( (this_CmdTempo_0= ruleCmdTempo | this_CmdTimeSignature_1= ruleCmdTimeSignature | this_CmdPlay_2= ruleCmdPlay | this_CmdInstrument_3= ruleCmdInstrument | this_CmdSet_4= ruleCmdSet ) )
            // InternalOrch8.g:198:2: (this_CmdTempo_0= ruleCmdTempo | this_CmdTimeSignature_1= ruleCmdTimeSignature | this_CmdPlay_2= ruleCmdPlay | this_CmdInstrument_3= ruleCmdInstrument | this_CmdSet_4= ruleCmdSet )
            {
            // InternalOrch8.g:198:2: (this_CmdTempo_0= ruleCmdTempo | this_CmdTimeSignature_1= ruleCmdTimeSignature | this_CmdPlay_2= ruleCmdPlay | this_CmdInstrument_3= ruleCmdInstrument | this_CmdSet_4= ruleCmdSet )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 33:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOrch8.g:199:3: this_CmdTempo_0= ruleCmdTempo
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCmdTempoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CmdTempo_0=ruleCmdTempo();

                    state._fsp--;


                    			current = this_CmdTempo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOrch8.g:208:3: this_CmdTimeSignature_1= ruleCmdTimeSignature
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCmdTimeSignatureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CmdTimeSignature_1=ruleCmdTimeSignature();

                    state._fsp--;


                    			current = this_CmdTimeSignature_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOrch8.g:217:3: this_CmdPlay_2= ruleCmdPlay
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCmdPlayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CmdPlay_2=ruleCmdPlay();

                    state._fsp--;


                    			current = this_CmdPlay_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOrch8.g:226:3: this_CmdInstrument_3= ruleCmdInstrument
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCmdInstrumentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CmdInstrument_3=ruleCmdInstrument();

                    state._fsp--;


                    			current = this_CmdInstrument_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOrch8.g:235:3: this_CmdSet_4= ruleCmdSet
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCmdSetParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CmdSet_4=ruleCmdSet();

                    state._fsp--;


                    			current = this_CmdSet_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleMixer"
    // InternalOrch8.g:247:1: entryRuleMixer returns [EObject current=null] : iv_ruleMixer= ruleMixer EOF ;
    public final EObject entryRuleMixer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixer = null;


        try {
            // InternalOrch8.g:247:46: (iv_ruleMixer= ruleMixer EOF )
            // InternalOrch8.g:248:2: iv_ruleMixer= ruleMixer EOF
            {
             newCompositeNode(grammarAccess.getMixerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixer=ruleMixer();

            state._fsp--;

             current =iv_ruleMixer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixer"


    // $ANTLR start "ruleMixer"
    // InternalOrch8.g:254:1: ruleMixer returns [EObject current=null] : (otherlv_0= 'Mixer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'sampling_rate' ( (lv_sampling_rate_4_0= ruleEInt ) ) )? otherlv_5= 'scores' otherlv_6= '{' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleMixer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sampling_rate_4_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:260:2: ( (otherlv_0= 'Mixer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'sampling_rate' ( (lv_sampling_rate_4_0= ruleEInt ) ) )? otherlv_5= 'scores' otherlv_6= '{' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalOrch8.g:261:2: (otherlv_0= 'Mixer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'sampling_rate' ( (lv_sampling_rate_4_0= ruleEInt ) ) )? otherlv_5= 'scores' otherlv_6= '{' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalOrch8.g:261:2: (otherlv_0= 'Mixer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'sampling_rate' ( (lv_sampling_rate_4_0= ruleEInt ) ) )? otherlv_5= 'scores' otherlv_6= '{' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalOrch8.g:262:3: otherlv_0= 'Mixer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'sampling_rate' ( (lv_sampling_rate_4_0= ruleEInt ) ) )? otherlv_5= 'scores' otherlv_6= '{' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMixerAccess().getMixerKeyword_0());
            		
            // InternalOrch8.g:266:3: ( (lv_name_1_0= ruleEString ) )
            // InternalOrch8.g:267:4: (lv_name_1_0= ruleEString )
            {
            // InternalOrch8.g:267:4: (lv_name_1_0= ruleEString )
            // InternalOrch8.g:268:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMixerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMixerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.orchestr8_test.Orch8.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMixerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOrch8.g:289:3: (otherlv_3= 'sampling_rate' ( (lv_sampling_rate_4_0= ruleEInt ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOrch8.g:290:4: otherlv_3= 'sampling_rate' ( (lv_sampling_rate_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getMixerAccess().getSampling_rateKeyword_3_0());
                    			
                    // InternalOrch8.g:294:4: ( (lv_sampling_rate_4_0= ruleEInt ) )
                    // InternalOrch8.g:295:5: (lv_sampling_rate_4_0= ruleEInt )
                    {
                    // InternalOrch8.g:295:5: (lv_sampling_rate_4_0= ruleEInt )
                    // InternalOrch8.g:296:6: lv_sampling_rate_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMixerAccess().getSampling_rateEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_sampling_rate_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMixerRule());
                    						}
                    						set(
                    							current,
                    							"sampling_rate",
                    							lv_sampling_rate_4_0,
                    							"org.xtext.orchestr8_test.Orch8.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getMixerAccess().getScoresKeyword_4());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getMixerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalOrch8.g:322:3: ( ( ruleEString ) )
            // InternalOrch8.g:323:4: ( ruleEString )
            {
            // InternalOrch8.g:323:4: ( ruleEString )
            // InternalOrch8.g:324:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMixerAccess().getScoresScoreCrossReference_6_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrch8.g:338:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOrch8.g:339:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_8, grammarAccess.getMixerAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalOrch8.g:343:4: ( ( ruleEString ) )
            	    // InternalOrch8.g:344:5: ( ruleEString )
            	    {
            	    // InternalOrch8.g:344:5: ( ruleEString )
            	    // InternalOrch8.g:345:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMixerRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMixerAccess().getScoresScoreCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getMixerAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMixerAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMixer"


    // $ANTLR start "entryRuleScore"
    // InternalOrch8.g:372:1: entryRuleScore returns [EObject current=null] : iv_ruleScore= ruleScore EOF ;
    public final EObject entryRuleScore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScore = null;


        try {
            // InternalOrch8.g:372:46: (iv_ruleScore= ruleScore EOF )
            // InternalOrch8.g:373:2: iv_ruleScore= ruleScore EOF
            {
             newCompositeNode(grammarAccess.getScoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScore=ruleScore();

            state._fsp--;

             current =iv_ruleScore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScore"


    // $ANTLR start "ruleScore"
    // InternalOrch8.g:379:1: ruleScore returns [EObject current=null] : (otherlv_0= 'Score' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= '@Setup' ( (lv_setup_4_0= ruleCommand ) )* )? ( (lv_measures_5_0= ruleMeasure ) )+ (otherlv_6= '@End' ( (lv_end_7_0= ruleCommand ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleScore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_setup_4_0 = null;

        EObject lv_measures_5_0 = null;

        EObject lv_end_7_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:385:2: ( (otherlv_0= 'Score' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= '@Setup' ( (lv_setup_4_0= ruleCommand ) )* )? ( (lv_measures_5_0= ruleMeasure ) )+ (otherlv_6= '@End' ( (lv_end_7_0= ruleCommand ) )* )? otherlv_8= '}' ) )
            // InternalOrch8.g:386:2: (otherlv_0= 'Score' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= '@Setup' ( (lv_setup_4_0= ruleCommand ) )* )? ( (lv_measures_5_0= ruleMeasure ) )+ (otherlv_6= '@End' ( (lv_end_7_0= ruleCommand ) )* )? otherlv_8= '}' )
            {
            // InternalOrch8.g:386:2: (otherlv_0= 'Score' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= '@Setup' ( (lv_setup_4_0= ruleCommand ) )* )? ( (lv_measures_5_0= ruleMeasure ) )+ (otherlv_6= '@End' ( (lv_end_7_0= ruleCommand ) )* )? otherlv_8= '}' )
            // InternalOrch8.g:387:3: otherlv_0= 'Score' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= '@Setup' ( (lv_setup_4_0= ruleCommand ) )* )? ( (lv_measures_5_0= ruleMeasure ) )+ (otherlv_6= '@End' ( (lv_end_7_0= ruleCommand ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScoreAccess().getScoreKeyword_0());
            		
            // InternalOrch8.g:391:3: ( (lv_name_1_0= ruleEString ) )
            // InternalOrch8.g:392:4: (lv_name_1_0= ruleEString )
            {
            // InternalOrch8.g:392:4: (lv_name_1_0= ruleEString )
            // InternalOrch8.g:393:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScoreAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScoreRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.orchestr8_test.Orch8.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getScoreAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOrch8.g:414:3: (otherlv_3= '@Setup' ( (lv_setup_4_0= ruleCommand ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOrch8.g:415:4: otherlv_3= '@Setup' ( (lv_setup_4_0= ruleCommand ) )*
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getScoreAccess().getSetupKeyword_3_0());
                    			
                    // InternalOrch8.g:419:4: ( (lv_setup_4_0= ruleCommand ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=27 && LA6_0<=28)||(LA6_0>=30 && LA6_0<=31)||LA6_0==33) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOrch8.g:420:5: (lv_setup_4_0= ruleCommand )
                    	    {
                    	    // InternalOrch8.g:420:5: (lv_setup_4_0= ruleCommand )
                    	    // InternalOrch8.g:421:6: lv_setup_4_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getScoreAccess().getSetupCommandParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_setup_4_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScoreRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"setup",
                    	    							lv_setup_4_0,
                    	    							"org.xtext.orchestr8_test.Orch8.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOrch8.g:439:3: ( (lv_measures_5_0= ruleMeasure ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOrch8.g:440:4: (lv_measures_5_0= ruleMeasure )
            	    {
            	    // InternalOrch8.g:440:4: (lv_measures_5_0= ruleMeasure )
            	    // InternalOrch8.g:441:5: lv_measures_5_0= ruleMeasure
            	    {

            	    					newCompositeNode(grammarAccess.getScoreAccess().getMeasuresMeasureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_measures_5_0=ruleMeasure();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"measures",
            	    						lv_measures_5_0,
            	    						"org.xtext.orchestr8_test.Orch8.Measure");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalOrch8.g:458:3: (otherlv_6= '@End' ( (lv_end_7_0= ruleCommand ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOrch8.g:459:4: otherlv_6= '@End' ( (lv_end_7_0= ruleCommand ) )*
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getScoreAccess().getEndKeyword_5_0());
                    			
                    // InternalOrch8.g:463:4: ( (lv_end_7_0= ruleCommand ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=27 && LA9_0<=28)||(LA9_0>=30 && LA9_0<=31)||LA9_0==33) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalOrch8.g:464:5: (lv_end_7_0= ruleCommand )
                    	    {
                    	    // InternalOrch8.g:464:5: (lv_end_7_0= ruleCommand )
                    	    // InternalOrch8.g:465:6: lv_end_7_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getScoreAccess().getEndCommandParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_end_7_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScoreRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"end",
                    	    							lv_end_7_0,
                    	    							"org.xtext.orchestr8_test.Orch8.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getScoreAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScore"


    // $ANTLR start "entryRuleInstrument"
    // InternalOrch8.g:491:1: entryRuleInstrument returns [EObject current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final EObject entryRuleInstrument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstrument = null;


        try {
            // InternalOrch8.g:491:51: (iv_ruleInstrument= ruleInstrument EOF )
            // InternalOrch8.g:492:2: iv_ruleInstrument= ruleInstrument EOF
            {
             newCompositeNode(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstrument=ruleInstrument();

            state._fsp--;

             current =iv_ruleInstrument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // InternalOrch8.g:498:1: ruleInstrument returns [EObject current=null] : (otherlv_0= 'Instrument' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_generator_3_0= ruleGenerator ) ) ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= '}' ) ;
    public final EObject ruleInstrument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_generator_3_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:504:2: ( (otherlv_0= 'Instrument' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_generator_3_0= ruleGenerator ) ) ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= '}' ) )
            // InternalOrch8.g:505:2: (otherlv_0= 'Instrument' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_generator_3_0= ruleGenerator ) ) ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= '}' )
            {
            // InternalOrch8.g:505:2: (otherlv_0= 'Instrument' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_generator_3_0= ruleGenerator ) ) ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= '}' )
            // InternalOrch8.g:506:3: otherlv_0= 'Instrument' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_generator_3_0= ruleGenerator ) ) ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstrumentAccess().getInstrumentKeyword_0());
            		
            // InternalOrch8.g:510:3: ( (lv_name_1_0= ruleEString ) )
            // InternalOrch8.g:511:4: (lv_name_1_0= ruleEString )
            {
            // InternalOrch8.g:511:4: (lv_name_1_0= ruleEString )
            // InternalOrch8.g:512:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInstrumentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstrumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.orchestr8_test.Orch8.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOrch8.g:533:3: ( (lv_generator_3_0= ruleGenerator ) )
            // InternalOrch8.g:534:4: (lv_generator_3_0= ruleGenerator )
            {
            // InternalOrch8.g:534:4: (lv_generator_3_0= ruleGenerator )
            // InternalOrch8.g:535:5: lv_generator_3_0= ruleGenerator
            {

            					newCompositeNode(grammarAccess.getInstrumentAccess().getGeneratorGeneratorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_generator_3_0=ruleGenerator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstrumentRule());
            					}
            					set(
            						current,
            						"generator",
            						lv_generator_3_0,
            						"org.xtext.orchestr8_test.Orch8.Generator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrch8.g:552:3: ( (lv_parameters_4_0= ruleParameter ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOrch8.g:553:4: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // InternalOrch8.g:553:4: (lv_parameters_4_0= ruleParameter )
            	    // InternalOrch8.g:554:5: lv_parameters_4_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getInstrumentAccess().getParametersParameterParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstrumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_4_0,
            	    						"org.xtext.orchestr8_test.Orch8.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstrument"


    // $ANTLR start "entryRuleEString"
    // InternalOrch8.g:579:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOrch8.g:579:47: (iv_ruleEString= ruleEString EOF )
            // InternalOrch8.g:580:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOrch8.g:586:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOrch8.g:592:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOrch8.g:593:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOrch8.g:593:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalOrch8.g:594:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOrch8.g:602:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalOrch8.g:613:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalOrch8.g:613:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalOrch8.g:614:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalOrch8.g:620:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOrch8.g:626:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalOrch8.g:627:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalOrch8.g:627:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalOrch8.g:628:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalOrch8.g:628:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOrch8.g:629:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalOrch8.g:646:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalOrch8.g:646:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalOrch8.g:647:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalOrch8.g:653:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalOrch8.g:659:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalOrch8.g:660:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalOrch8.g:660:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalOrch8.g:661:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalOrch8.g:661:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOrch8.g:662:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalOrch8.g:668:3: (this_INT_1= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOrch8.g:669:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_20); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,23,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalOrch8.g:689:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=24 && LA18_0<=25)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOrch8.g:690:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalOrch8.g:690:4: (kw= 'E' | kw= 'e' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==25) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalOrch8.g:691:5: kw= 'E'
                            {
                            kw=(Token)match(input,24,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalOrch8.g:697:5: kw= 'e'
                            {
                            kw=(Token)match(input,25,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalOrch8.g:703:4: (kw= '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==22) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalOrch8.g:704:5: kw= '-'
                            {
                            kw=(Token)match(input,22,FOLLOW_18); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleMeasure"
    // InternalOrch8.g:722:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // InternalOrch8.g:722:48: (iv_ruleMeasure= ruleMeasure EOF )
            // InternalOrch8.g:723:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalOrch8.g:729:1: ruleMeasure returns [EObject current=null] : ( () otherlv_1= '@' ( (lv_ID_2_0= ruleEInt ) ) ( (lv_beats_3_0= ruleBeat ) )+ ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ID_2_0 = null;

        EObject lv_beats_3_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:735:2: ( ( () otherlv_1= '@' ( (lv_ID_2_0= ruleEInt ) ) ( (lv_beats_3_0= ruleBeat ) )+ ) )
            // InternalOrch8.g:736:2: ( () otherlv_1= '@' ( (lv_ID_2_0= ruleEInt ) ) ( (lv_beats_3_0= ruleBeat ) )+ )
            {
            // InternalOrch8.g:736:2: ( () otherlv_1= '@' ( (lv_ID_2_0= ruleEInt ) ) ( (lv_beats_3_0= ruleBeat ) )+ )
            // InternalOrch8.g:737:3: () otherlv_1= '@' ( (lv_ID_2_0= ruleEInt ) ) ( (lv_beats_3_0= ruleBeat ) )+
            {
            // InternalOrch8.g:737:3: ()
            // InternalOrch8.g:738:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAccess().getMeasureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasureAccess().getCommercialAtKeyword_1());
            		
            // InternalOrch8.g:748:3: ( (lv_ID_2_0= ruleEInt ) )
            // InternalOrch8.g:749:4: (lv_ID_2_0= ruleEInt )
            {
            // InternalOrch8.g:749:4: (lv_ID_2_0= ruleEInt )
            // InternalOrch8.g:750:5: lv_ID_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMeasureAccess().getIDEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_ID_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_2_0,
            						"org.xtext.orchestr8_test.Orch8.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrch8.g:767:3: ( (lv_beats_3_0= ruleBeat ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOrch8.g:768:4: (lv_beats_3_0= ruleBeat )
            	    {
            	    // InternalOrch8.g:768:4: (lv_beats_3_0= ruleBeat )
            	    // InternalOrch8.g:769:5: lv_beats_3_0= ruleBeat
            	    {

            	    					newCompositeNode(grammarAccess.getMeasureAccess().getBeatsBeatParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_beats_3_0=ruleBeat();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMeasureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"beats",
            	    						lv_beats_3_0,
            	    						"org.xtext.orchestr8_test.Orch8.Beat");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleCmdInstrument"
    // InternalOrch8.g:790:1: entryRuleCmdInstrument returns [EObject current=null] : iv_ruleCmdInstrument= ruleCmdInstrument EOF ;
    public final EObject entryRuleCmdInstrument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmdInstrument = null;


        try {
            // InternalOrch8.g:790:54: (iv_ruleCmdInstrument= ruleCmdInstrument EOF )
            // InternalOrch8.g:791:2: iv_ruleCmdInstrument= ruleCmdInstrument EOF
            {
             newCompositeNode(grammarAccess.getCmdInstrumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmdInstrument=ruleCmdInstrument();

            state._fsp--;

             current =iv_ruleCmdInstrument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmdInstrument"


    // $ANTLR start "ruleCmdInstrument"
    // InternalOrch8.g:797:1: ruleCmdInstrument returns [EObject current=null] : ( ( (lv_type_0_0= 'instrument' ) ) ( (lv_parameter_1_0= ruleParameter ) ) ) ;
    public final EObject ruleCmdInstrument() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        EObject lv_parameter_1_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:803:2: ( ( ( (lv_type_0_0= 'instrument' ) ) ( (lv_parameter_1_0= ruleParameter ) ) ) )
            // InternalOrch8.g:804:2: ( ( (lv_type_0_0= 'instrument' ) ) ( (lv_parameter_1_0= ruleParameter ) ) )
            {
            // InternalOrch8.g:804:2: ( ( (lv_type_0_0= 'instrument' ) ) ( (lv_parameter_1_0= ruleParameter ) ) )
            // InternalOrch8.g:805:3: ( (lv_type_0_0= 'instrument' ) ) ( (lv_parameter_1_0= ruleParameter ) )
            {
            // InternalOrch8.g:805:3: ( (lv_type_0_0= 'instrument' ) )
            // InternalOrch8.g:806:4: (lv_type_0_0= 'instrument' )
            {
            // InternalOrch8.g:806:4: (lv_type_0_0= 'instrument' )
            // InternalOrch8.g:807:5: lv_type_0_0= 'instrument'
            {
            lv_type_0_0=(Token)match(input,27,FOLLOW_5); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCmdInstrumentAccess().getTypeInstrumentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdInstrumentRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "instrument");
            				

            }


            }

            // InternalOrch8.g:819:3: ( (lv_parameter_1_0= ruleParameter ) )
            // InternalOrch8.g:820:4: (lv_parameter_1_0= ruleParameter )
            {
            // InternalOrch8.g:820:4: (lv_parameter_1_0= ruleParameter )
            // InternalOrch8.g:821:5: lv_parameter_1_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getCmdInstrumentAccess().getParameterParameterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameter_1_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCmdInstrumentRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_1_0,
            						"org.xtext.orchestr8_test.Orch8.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmdInstrument"


    // $ANTLR start "entryRuleCmdPlay"
    // InternalOrch8.g:842:1: entryRuleCmdPlay returns [EObject current=null] : iv_ruleCmdPlay= ruleCmdPlay EOF ;
    public final EObject entryRuleCmdPlay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmdPlay = null;


        try {
            // InternalOrch8.g:842:48: (iv_ruleCmdPlay= ruleCmdPlay EOF )
            // InternalOrch8.g:843:2: iv_ruleCmdPlay= ruleCmdPlay EOF
            {
             newCompositeNode(grammarAccess.getCmdPlayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmdPlay=ruleCmdPlay();

            state._fsp--;

             current =iv_ruleCmdPlay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmdPlay"


    // $ANTLR start "ruleCmdPlay"
    // InternalOrch8.g:849:1: ruleCmdPlay returns [EObject current=null] : ( ( (lv_type_0_0= 'play' ) ) ( (lv_note_1_0= RULE_NOTE ) ) otherlv_2= 'length' ( (lv_length_3_0= ruleEDouble ) ) ) ;
    public final EObject ruleCmdPlay() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_note_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_length_3_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:855:2: ( ( ( (lv_type_0_0= 'play' ) ) ( (lv_note_1_0= RULE_NOTE ) ) otherlv_2= 'length' ( (lv_length_3_0= ruleEDouble ) ) ) )
            // InternalOrch8.g:856:2: ( ( (lv_type_0_0= 'play' ) ) ( (lv_note_1_0= RULE_NOTE ) ) otherlv_2= 'length' ( (lv_length_3_0= ruleEDouble ) ) )
            {
            // InternalOrch8.g:856:2: ( ( (lv_type_0_0= 'play' ) ) ( (lv_note_1_0= RULE_NOTE ) ) otherlv_2= 'length' ( (lv_length_3_0= ruleEDouble ) ) )
            // InternalOrch8.g:857:3: ( (lv_type_0_0= 'play' ) ) ( (lv_note_1_0= RULE_NOTE ) ) otherlv_2= 'length' ( (lv_length_3_0= ruleEDouble ) )
            {
            // InternalOrch8.g:857:3: ( (lv_type_0_0= 'play' ) )
            // InternalOrch8.g:858:4: (lv_type_0_0= 'play' )
            {
            // InternalOrch8.g:858:4: (lv_type_0_0= 'play' )
            // InternalOrch8.g:859:5: lv_type_0_0= 'play'
            {
            lv_type_0_0=(Token)match(input,28,FOLLOW_24); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCmdPlayAccess().getTypePlayKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdPlayRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "play");
            				

            }


            }

            // InternalOrch8.g:871:3: ( (lv_note_1_0= RULE_NOTE ) )
            // InternalOrch8.g:872:4: (lv_note_1_0= RULE_NOTE )
            {
            // InternalOrch8.g:872:4: (lv_note_1_0= RULE_NOTE )
            // InternalOrch8.g:873:5: lv_note_1_0= RULE_NOTE
            {
            lv_note_1_0=(Token)match(input,RULE_NOTE,FOLLOW_25); 

            					newLeafNode(lv_note_1_0, grammarAccess.getCmdPlayAccess().getNoteNOTETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdPlayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"note",
            						lv_note_1_0,
            						"org.xtext.orchestr8_test.Orch8.NOTE");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getCmdPlayAccess().getLengthKeyword_2());
            		
            // InternalOrch8.g:893:3: ( (lv_length_3_0= ruleEDouble ) )
            // InternalOrch8.g:894:4: (lv_length_3_0= ruleEDouble )
            {
            // InternalOrch8.g:894:4: (lv_length_3_0= ruleEDouble )
            // InternalOrch8.g:895:5: lv_length_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getCmdPlayAccess().getLengthEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_length_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCmdPlayRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_3_0,
            						"org.xtext.orchestr8_test.Orch8.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmdPlay"


    // $ANTLR start "entryRuleCmdTempo"
    // InternalOrch8.g:916:1: entryRuleCmdTempo returns [EObject current=null] : iv_ruleCmdTempo= ruleCmdTempo EOF ;
    public final EObject entryRuleCmdTempo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmdTempo = null;


        try {
            // InternalOrch8.g:916:49: (iv_ruleCmdTempo= ruleCmdTempo EOF )
            // InternalOrch8.g:917:2: iv_ruleCmdTempo= ruleCmdTempo EOF
            {
             newCompositeNode(grammarAccess.getCmdTempoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmdTempo=ruleCmdTempo();

            state._fsp--;

             current =iv_ruleCmdTempo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmdTempo"


    // $ANTLR start "ruleCmdTempo"
    // InternalOrch8.g:923:1: ruleCmdTempo returns [EObject current=null] : ( ( (lv_type_0_0= 'tempo' ) ) ( (lv_bpm_1_0= ruleEInt ) ) ) ;
    public final EObject ruleCmdTempo() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        AntlrDatatypeRuleToken lv_bpm_1_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:929:2: ( ( ( (lv_type_0_0= 'tempo' ) ) ( (lv_bpm_1_0= ruleEInt ) ) ) )
            // InternalOrch8.g:930:2: ( ( (lv_type_0_0= 'tempo' ) ) ( (lv_bpm_1_0= ruleEInt ) ) )
            {
            // InternalOrch8.g:930:2: ( ( (lv_type_0_0= 'tempo' ) ) ( (lv_bpm_1_0= ruleEInt ) ) )
            // InternalOrch8.g:931:3: ( (lv_type_0_0= 'tempo' ) ) ( (lv_bpm_1_0= ruleEInt ) )
            {
            // InternalOrch8.g:931:3: ( (lv_type_0_0= 'tempo' ) )
            // InternalOrch8.g:932:4: (lv_type_0_0= 'tempo' )
            {
            // InternalOrch8.g:932:4: (lv_type_0_0= 'tempo' )
            // InternalOrch8.g:933:5: lv_type_0_0= 'tempo'
            {
            lv_type_0_0=(Token)match(input,30,FOLLOW_8); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCmdTempoAccess().getTypeTempoKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdTempoRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "tempo");
            				

            }


            }

            // InternalOrch8.g:945:3: ( (lv_bpm_1_0= ruleEInt ) )
            // InternalOrch8.g:946:4: (lv_bpm_1_0= ruleEInt )
            {
            // InternalOrch8.g:946:4: (lv_bpm_1_0= ruleEInt )
            // InternalOrch8.g:947:5: lv_bpm_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCmdTempoAccess().getBpmEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_bpm_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCmdTempoRule());
            					}
            					set(
            						current,
            						"bpm",
            						lv_bpm_1_0,
            						"org.xtext.orchestr8_test.Orch8.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmdTempo"


    // $ANTLR start "entryRuleCmdTimeSignature"
    // InternalOrch8.g:968:1: entryRuleCmdTimeSignature returns [EObject current=null] : iv_ruleCmdTimeSignature= ruleCmdTimeSignature EOF ;
    public final EObject entryRuleCmdTimeSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmdTimeSignature = null;


        try {
            // InternalOrch8.g:968:57: (iv_ruleCmdTimeSignature= ruleCmdTimeSignature EOF )
            // InternalOrch8.g:969:2: iv_ruleCmdTimeSignature= ruleCmdTimeSignature EOF
            {
             newCompositeNode(grammarAccess.getCmdTimeSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmdTimeSignature=ruleCmdTimeSignature();

            state._fsp--;

             current =iv_ruleCmdTimeSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmdTimeSignature"


    // $ANTLR start "ruleCmdTimeSignature"
    // InternalOrch8.g:975:1: ruleCmdTimeSignature returns [EObject current=null] : ( ( (lv_type_0_0= 'time_signature' ) ) ( (lv_numerator_1_0= ruleEInt ) ) otherlv_2= '/' ( (lv_denominator_3_0= ruleEInt ) ) ) ;
    public final EObject ruleCmdTimeSignature() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_numerator_1_0 = null;

        AntlrDatatypeRuleToken lv_denominator_3_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:981:2: ( ( ( (lv_type_0_0= 'time_signature' ) ) ( (lv_numerator_1_0= ruleEInt ) ) otherlv_2= '/' ( (lv_denominator_3_0= ruleEInt ) ) ) )
            // InternalOrch8.g:982:2: ( ( (lv_type_0_0= 'time_signature' ) ) ( (lv_numerator_1_0= ruleEInt ) ) otherlv_2= '/' ( (lv_denominator_3_0= ruleEInt ) ) )
            {
            // InternalOrch8.g:982:2: ( ( (lv_type_0_0= 'time_signature' ) ) ( (lv_numerator_1_0= ruleEInt ) ) otherlv_2= '/' ( (lv_denominator_3_0= ruleEInt ) ) )
            // InternalOrch8.g:983:3: ( (lv_type_0_0= 'time_signature' ) ) ( (lv_numerator_1_0= ruleEInt ) ) otherlv_2= '/' ( (lv_denominator_3_0= ruleEInt ) )
            {
            // InternalOrch8.g:983:3: ( (lv_type_0_0= 'time_signature' ) )
            // InternalOrch8.g:984:4: (lv_type_0_0= 'time_signature' )
            {
            // InternalOrch8.g:984:4: (lv_type_0_0= 'time_signature' )
            // InternalOrch8.g:985:5: lv_type_0_0= 'time_signature'
            {
            lv_type_0_0=(Token)match(input,31,FOLLOW_8); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCmdTimeSignatureAccess().getTypeTime_signatureKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdTimeSignatureRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "time_signature");
            				

            }


            }

            // InternalOrch8.g:997:3: ( (lv_numerator_1_0= ruleEInt ) )
            // InternalOrch8.g:998:4: (lv_numerator_1_0= ruleEInt )
            {
            // InternalOrch8.g:998:4: (lv_numerator_1_0= ruleEInt )
            // InternalOrch8.g:999:5: lv_numerator_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCmdTimeSignatureAccess().getNumeratorEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_numerator_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCmdTimeSignatureRule());
            					}
            					set(
            						current,
            						"numerator",
            						lv_numerator_1_0,
            						"org.xtext.orchestr8_test.Orch8.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCmdTimeSignatureAccess().getSolidusKeyword_2());
            		
            // InternalOrch8.g:1020:3: ( (lv_denominator_3_0= ruleEInt ) )
            // InternalOrch8.g:1021:4: (lv_denominator_3_0= ruleEInt )
            {
            // InternalOrch8.g:1021:4: (lv_denominator_3_0= ruleEInt )
            // InternalOrch8.g:1022:5: lv_denominator_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCmdTimeSignatureAccess().getDenominatorEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_denominator_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCmdTimeSignatureRule());
            					}
            					set(
            						current,
            						"denominator",
            						lv_denominator_3_0,
            						"org.xtext.orchestr8_test.Orch8.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmdTimeSignature"


    // $ANTLR start "entryRuleCmdSet"
    // InternalOrch8.g:1043:1: entryRuleCmdSet returns [EObject current=null] : iv_ruleCmdSet= ruleCmdSet EOF ;
    public final EObject entryRuleCmdSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmdSet = null;


        try {
            // InternalOrch8.g:1043:47: (iv_ruleCmdSet= ruleCmdSet EOF )
            // InternalOrch8.g:1044:2: iv_ruleCmdSet= ruleCmdSet EOF
            {
             newCompositeNode(grammarAccess.getCmdSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmdSet=ruleCmdSet();

            state._fsp--;

             current =iv_ruleCmdSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmdSet"


    // $ANTLR start "ruleCmdSet"
    // InternalOrch8.g:1050:1: ruleCmdSet returns [EObject current=null] : ( ( (lv_type_0_0= 'set' ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleCmdSet() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;


        	enterRule();

        try {
            // InternalOrch8.g:1056:2: ( ( ( (lv_type_0_0= 'set' ) ) ( ( ruleEString ) ) ) )
            // InternalOrch8.g:1057:2: ( ( (lv_type_0_0= 'set' ) ) ( ( ruleEString ) ) )
            {
            // InternalOrch8.g:1057:2: ( ( (lv_type_0_0= 'set' ) ) ( ( ruleEString ) ) )
            // InternalOrch8.g:1058:3: ( (lv_type_0_0= 'set' ) ) ( ( ruleEString ) )
            {
            // InternalOrch8.g:1058:3: ( (lv_type_0_0= 'set' ) )
            // InternalOrch8.g:1059:4: (lv_type_0_0= 'set' )
            {
            // InternalOrch8.g:1059:4: (lv_type_0_0= 'set' )
            // InternalOrch8.g:1060:5: lv_type_0_0= 'set'
            {
            lv_type_0_0=(Token)match(input,33,FOLLOW_5); 

            					newLeafNode(lv_type_0_0, grammarAccess.getCmdSetAccess().getTypeSetKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdSetRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "set");
            				

            }


            }

            // InternalOrch8.g:1072:3: ( ( ruleEString ) )
            // InternalOrch8.g:1073:4: ( ruleEString )
            {
            // InternalOrch8.g:1073:4: ( ruleEString )
            // InternalOrch8.g:1074:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCmdSetAccess().getInstrumentInstrumentCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmdSet"


    // $ANTLR start "entryRuleParameter"
    // InternalOrch8.g:1092:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalOrch8.g:1092:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalOrch8.g:1093:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalOrch8.g:1099:1: ruleParameter returns [EObject current=null] : ( ( (lv_ID_0_0= ruleEString ) ) ( (lv_value_1_0= ruleEDouble ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ID_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:1105:2: ( ( ( (lv_ID_0_0= ruleEString ) ) ( (lv_value_1_0= ruleEDouble ) ) ) )
            // InternalOrch8.g:1106:2: ( ( (lv_ID_0_0= ruleEString ) ) ( (lv_value_1_0= ruleEDouble ) ) )
            {
            // InternalOrch8.g:1106:2: ( ( (lv_ID_0_0= ruleEString ) ) ( (lv_value_1_0= ruleEDouble ) ) )
            // InternalOrch8.g:1107:3: ( (lv_ID_0_0= ruleEString ) ) ( (lv_value_1_0= ruleEDouble ) )
            {
            // InternalOrch8.g:1107:3: ( (lv_ID_0_0= ruleEString ) )
            // InternalOrch8.g:1108:4: (lv_ID_0_0= ruleEString )
            {
            // InternalOrch8.g:1108:4: (lv_ID_0_0= ruleEString )
            // InternalOrch8.g:1109:5: lv_ID_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getIDEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_ID_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_0_0,
            						"org.xtext.orchestr8_test.Orch8.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrch8.g:1126:3: ( (lv_value_1_0= ruleEDouble ) )
            // InternalOrch8.g:1127:4: (lv_value_1_0= ruleEDouble )
            {
            // InternalOrch8.g:1127:4: (lv_value_1_0= ruleEDouble )
            // InternalOrch8.g:1128:5: lv_value_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getValueEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.orchestr8_test.Orch8.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBeat"
    // InternalOrch8.g:1149:1: entryRuleBeat returns [EObject current=null] : iv_ruleBeat= ruleBeat EOF ;
    public final EObject entryRuleBeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeat = null;


        try {
            // InternalOrch8.g:1149:45: (iv_ruleBeat= ruleBeat EOF )
            // InternalOrch8.g:1150:2: iv_ruleBeat= ruleBeat EOF
            {
             newCompositeNode(grammarAccess.getBeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeat=ruleBeat();

            state._fsp--;

             current =iv_ruleBeat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBeat"


    // $ANTLR start "ruleBeat"
    // InternalOrch8.g:1156:1: ruleBeat returns [EObject current=null] : (otherlv_0= ':' ( (lv_ID_1_0= ruleEDouble ) ) ( (lv_commands_2_0= ruleCommand ) )+ ) ;
    public final EObject ruleBeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_ID_1_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:1162:2: ( (otherlv_0= ':' ( (lv_ID_1_0= ruleEDouble ) ) ( (lv_commands_2_0= ruleCommand ) )+ ) )
            // InternalOrch8.g:1163:2: (otherlv_0= ':' ( (lv_ID_1_0= ruleEDouble ) ) ( (lv_commands_2_0= ruleCommand ) )+ )
            {
            // InternalOrch8.g:1163:2: (otherlv_0= ':' ( (lv_ID_1_0= ruleEDouble ) ) ( (lv_commands_2_0= ruleCommand ) )+ )
            // InternalOrch8.g:1164:3: otherlv_0= ':' ( (lv_ID_1_0= ruleEDouble ) ) ( (lv_commands_2_0= ruleCommand ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getBeatAccess().getColonKeyword_0());
            		
            // InternalOrch8.g:1168:3: ( (lv_ID_1_0= ruleEDouble ) )
            // InternalOrch8.g:1169:4: (lv_ID_1_0= ruleEDouble )
            {
            // InternalOrch8.g:1169:4: (lv_ID_1_0= ruleEDouble )
            // InternalOrch8.g:1170:5: lv_ID_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getBeatAccess().getIDEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_ID_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeatRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_1_0,
            						"org.xtext.orchestr8_test.Orch8.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrch8.g:1187:3: ( (lv_commands_2_0= ruleCommand ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=27 && LA20_0<=28)||(LA20_0>=30 && LA20_0<=31)||LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOrch8.g:1188:4: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalOrch8.g:1188:4: (lv_commands_2_0= ruleCommand )
            	    // InternalOrch8.g:1189:5: lv_commands_2_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getBeatAccess().getCommandsCommandParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBeatRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_2_0,
            	    						"org.xtext.orchestr8_test.Orch8.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBeat"


    // $ANTLR start "entryRuleGenerator"
    // InternalOrch8.g:1210:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // InternalOrch8.g:1210:50: (iv_ruleGenerator= ruleGenerator EOF )
            // InternalOrch8.g:1211:2: iv_ruleGenerator= ruleGenerator EOF
            {
             newCompositeNode(grammarAccess.getGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;

             current =iv_ruleGenerator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // InternalOrch8.g:1217:1: ruleGenerator returns [EObject current=null] : ( ( ( (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' ) ) ) ( (lv_type_1_0= ruleEString ) ) ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token lv_mode_0_1=null;
        Token lv_mode_0_2=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalOrch8.g:1223:2: ( ( ( ( (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' ) ) ) ( (lv_type_1_0= ruleEString ) ) ) )
            // InternalOrch8.g:1224:2: ( ( ( (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' ) ) ) ( (lv_type_1_0= ruleEString ) ) )
            {
            // InternalOrch8.g:1224:2: ( ( ( (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' ) ) ) ( (lv_type_1_0= ruleEString ) ) )
            // InternalOrch8.g:1225:3: ( ( (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' ) ) ) ( (lv_type_1_0= ruleEString ) )
            {
            // InternalOrch8.g:1225:3: ( ( (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' ) ) )
            // InternalOrch8.g:1226:4: ( (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' ) )
            {
            // InternalOrch8.g:1226:4: ( (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' ) )
            // InternalOrch8.g:1227:5: (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' )
            {
            // InternalOrch8.g:1227:5: (lv_mode_0_1= 'type' | lv_mode_0_2= 'custom' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            else if ( (LA21_0==36) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalOrch8.g:1228:6: lv_mode_0_1= 'type'
                    {
                    lv_mode_0_1=(Token)match(input,35,FOLLOW_5); 

                    						newLeafNode(lv_mode_0_1, grammarAccess.getGeneratorAccess().getModeTypeKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneratorRule());
                    						}
                    						setWithLastConsumed(current, "mode", lv_mode_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalOrch8.g:1239:6: lv_mode_0_2= 'custom'
                    {
                    lv_mode_0_2=(Token)match(input,36,FOLLOW_5); 

                    						newLeafNode(lv_mode_0_2, grammarAccess.getGeneratorAccess().getModeCustomKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGeneratorRule());
                    						}
                    						setWithLastConsumed(current, "mode", lv_mode_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalOrch8.g:1252:3: ( (lv_type_1_0= ruleEString ) )
            // InternalOrch8.g:1253:4: (lv_type_1_0= ruleEString )
            {
            // InternalOrch8.g:1253:4: (lv_type_1_0= ruleEString )
            // InternalOrch8.g:1254:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGeneratorAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneratorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.orchestr8_test.Orch8.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000241000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000241002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000002DC080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000041A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000002D8020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000C00040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000002D8000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000002D8000002L});

}