package org.xtext.orchestr8_test.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.orchestr8_test.services.Orch8GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOrch8Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NOTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'type'", "'custom'", "'Mixer'", "'{'", "'scores'", "'}'", "'sampling_rate'", "','", "'Score'", "'@Setup'", "'@End'", "'Instrument'", "'-'", "'.'", "'@'", "'length'", "'/'", "':'", "'instrument'", "'play'", "'tempo'", "'time_signature'", "'set'"
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

    	public void setGrammarAccess(Orch8GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalOrch8.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOrch8.g:54:1: ( ruleModel EOF )
            // InternalOrch8.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOrch8.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalOrch8.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalOrch8.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalOrch8.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalOrch8.g:69:3: ( rule__Model__Group__0 )
            // InternalOrch8.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSetupCommand"
    // InternalOrch8.g:78:1: entryRuleSetupCommand : ruleSetupCommand EOF ;
    public final void entryRuleSetupCommand() throws RecognitionException {
        try {
            // InternalOrch8.g:79:1: ( ruleSetupCommand EOF )
            // InternalOrch8.g:80:1: ruleSetupCommand EOF
            {
             before(grammarAccess.getSetupCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleSetupCommand();

            state._fsp--;

             after(grammarAccess.getSetupCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetupCommand"


    // $ANTLR start "ruleSetupCommand"
    // InternalOrch8.g:87:1: ruleSetupCommand : ( ( rule__SetupCommand__Alternatives ) ) ;
    public final void ruleSetupCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:91:2: ( ( ( rule__SetupCommand__Alternatives ) ) )
            // InternalOrch8.g:92:2: ( ( rule__SetupCommand__Alternatives ) )
            {
            // InternalOrch8.g:92:2: ( ( rule__SetupCommand__Alternatives ) )
            // InternalOrch8.g:93:3: ( rule__SetupCommand__Alternatives )
            {
             before(grammarAccess.getSetupCommandAccess().getAlternatives()); 
            // InternalOrch8.g:94:3: ( rule__SetupCommand__Alternatives )
            // InternalOrch8.g:94:4: rule__SetupCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SetupCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSetupCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetupCommand"


    // $ANTLR start "entryRuleCommand"
    // InternalOrch8.g:103:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalOrch8.g:104:1: ( ruleCommand EOF )
            // InternalOrch8.g:105:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalOrch8.g:112:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:116:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalOrch8.g:117:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalOrch8.g:117:2: ( ( rule__Command__Alternatives ) )
            // InternalOrch8.g:118:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalOrch8.g:119:3: ( rule__Command__Alternatives )
            // InternalOrch8.g:119:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleMixer"
    // InternalOrch8.g:128:1: entryRuleMixer : ruleMixer EOF ;
    public final void entryRuleMixer() throws RecognitionException {
        try {
            // InternalOrch8.g:129:1: ( ruleMixer EOF )
            // InternalOrch8.g:130:1: ruleMixer EOF
            {
             before(grammarAccess.getMixerRule()); 
            pushFollow(FOLLOW_1);
            ruleMixer();

            state._fsp--;

             after(grammarAccess.getMixerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMixer"


    // $ANTLR start "ruleMixer"
    // InternalOrch8.g:137:1: ruleMixer : ( ( rule__Mixer__Group__0 ) ) ;
    public final void ruleMixer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:141:2: ( ( ( rule__Mixer__Group__0 ) ) )
            // InternalOrch8.g:142:2: ( ( rule__Mixer__Group__0 ) )
            {
            // InternalOrch8.g:142:2: ( ( rule__Mixer__Group__0 ) )
            // InternalOrch8.g:143:3: ( rule__Mixer__Group__0 )
            {
             before(grammarAccess.getMixerAccess().getGroup()); 
            // InternalOrch8.g:144:3: ( rule__Mixer__Group__0 )
            // InternalOrch8.g:144:4: rule__Mixer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mixer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixer"


    // $ANTLR start "entryRuleScore"
    // InternalOrch8.g:153:1: entryRuleScore : ruleScore EOF ;
    public final void entryRuleScore() throws RecognitionException {
        try {
            // InternalOrch8.g:154:1: ( ruleScore EOF )
            // InternalOrch8.g:155:1: ruleScore EOF
            {
             before(grammarAccess.getScoreRule()); 
            pushFollow(FOLLOW_1);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getScoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScore"


    // $ANTLR start "ruleScore"
    // InternalOrch8.g:162:1: ruleScore : ( ( rule__Score__Group__0 ) ) ;
    public final void ruleScore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:166:2: ( ( ( rule__Score__Group__0 ) ) )
            // InternalOrch8.g:167:2: ( ( rule__Score__Group__0 ) )
            {
            // InternalOrch8.g:167:2: ( ( rule__Score__Group__0 ) )
            // InternalOrch8.g:168:3: ( rule__Score__Group__0 )
            {
             before(grammarAccess.getScoreAccess().getGroup()); 
            // InternalOrch8.g:169:3: ( rule__Score__Group__0 )
            // InternalOrch8.g:169:4: rule__Score__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScore"


    // $ANTLR start "entryRuleInstrument"
    // InternalOrch8.g:178:1: entryRuleInstrument : ruleInstrument EOF ;
    public final void entryRuleInstrument() throws RecognitionException {
        try {
            // InternalOrch8.g:179:1: ( ruleInstrument EOF )
            // InternalOrch8.g:180:1: ruleInstrument EOF
            {
             before(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_1);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getInstrumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // InternalOrch8.g:187:1: ruleInstrument : ( ( rule__Instrument__Group__0 ) ) ;
    public final void ruleInstrument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:191:2: ( ( ( rule__Instrument__Group__0 ) ) )
            // InternalOrch8.g:192:2: ( ( rule__Instrument__Group__0 ) )
            {
            // InternalOrch8.g:192:2: ( ( rule__Instrument__Group__0 ) )
            // InternalOrch8.g:193:3: ( rule__Instrument__Group__0 )
            {
             before(grammarAccess.getInstrumentAccess().getGroup()); 
            // InternalOrch8.g:194:3: ( rule__Instrument__Group__0 )
            // InternalOrch8.g:194:4: rule__Instrument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instrument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstrument"


    // $ANTLR start "entryRuleEString"
    // InternalOrch8.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOrch8.g:204:1: ( ruleEString EOF )
            // InternalOrch8.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOrch8.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalOrch8.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalOrch8.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalOrch8.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalOrch8.g:219:3: ( rule__EString__Alternatives )
            // InternalOrch8.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalOrch8.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalOrch8.g:229:1: ( ruleEInt EOF )
            // InternalOrch8.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalOrch8.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalOrch8.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalOrch8.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalOrch8.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalOrch8.g:244:3: ( rule__EInt__Group__0 )
            // InternalOrch8.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalOrch8.g:253:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalOrch8.g:254:1: ( ruleEDouble EOF )
            // InternalOrch8.g:255:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalOrch8.g:262:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:266:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalOrch8.g:267:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalOrch8.g:267:2: ( ( rule__EDouble__Group__0 ) )
            // InternalOrch8.g:268:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalOrch8.g:269:3: ( rule__EDouble__Group__0 )
            // InternalOrch8.g:269:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleMeasure"
    // InternalOrch8.g:278:1: entryRuleMeasure : ruleMeasure EOF ;
    public final void entryRuleMeasure() throws RecognitionException {
        try {
            // InternalOrch8.g:279:1: ( ruleMeasure EOF )
            // InternalOrch8.g:280:1: ruleMeasure EOF
            {
             before(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getMeasureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalOrch8.g:287:1: ruleMeasure : ( ( rule__Measure__Group__0 ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:291:2: ( ( ( rule__Measure__Group__0 ) ) )
            // InternalOrch8.g:292:2: ( ( rule__Measure__Group__0 ) )
            {
            // InternalOrch8.g:292:2: ( ( rule__Measure__Group__0 ) )
            // InternalOrch8.g:293:3: ( rule__Measure__Group__0 )
            {
             before(grammarAccess.getMeasureAccess().getGroup()); 
            // InternalOrch8.g:294:3: ( rule__Measure__Group__0 )
            // InternalOrch8.g:294:4: rule__Measure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleCmdInstrument"
    // InternalOrch8.g:303:1: entryRuleCmdInstrument : ruleCmdInstrument EOF ;
    public final void entryRuleCmdInstrument() throws RecognitionException {
        try {
            // InternalOrch8.g:304:1: ( ruleCmdInstrument EOF )
            // InternalOrch8.g:305:1: ruleCmdInstrument EOF
            {
             before(grammarAccess.getCmdInstrumentRule()); 
            pushFollow(FOLLOW_1);
            ruleCmdInstrument();

            state._fsp--;

             after(grammarAccess.getCmdInstrumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCmdInstrument"


    // $ANTLR start "ruleCmdInstrument"
    // InternalOrch8.g:312:1: ruleCmdInstrument : ( ( rule__CmdInstrument__Group__0 ) ) ;
    public final void ruleCmdInstrument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:316:2: ( ( ( rule__CmdInstrument__Group__0 ) ) )
            // InternalOrch8.g:317:2: ( ( rule__CmdInstrument__Group__0 ) )
            {
            // InternalOrch8.g:317:2: ( ( rule__CmdInstrument__Group__0 ) )
            // InternalOrch8.g:318:3: ( rule__CmdInstrument__Group__0 )
            {
             before(grammarAccess.getCmdInstrumentAccess().getGroup()); 
            // InternalOrch8.g:319:3: ( rule__CmdInstrument__Group__0 )
            // InternalOrch8.g:319:4: rule__CmdInstrument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CmdInstrument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdInstrumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmdInstrument"


    // $ANTLR start "entryRuleCmdPlay"
    // InternalOrch8.g:328:1: entryRuleCmdPlay : ruleCmdPlay EOF ;
    public final void entryRuleCmdPlay() throws RecognitionException {
        try {
            // InternalOrch8.g:329:1: ( ruleCmdPlay EOF )
            // InternalOrch8.g:330:1: ruleCmdPlay EOF
            {
             before(grammarAccess.getCmdPlayRule()); 
            pushFollow(FOLLOW_1);
            ruleCmdPlay();

            state._fsp--;

             after(grammarAccess.getCmdPlayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCmdPlay"


    // $ANTLR start "ruleCmdPlay"
    // InternalOrch8.g:337:1: ruleCmdPlay : ( ( rule__CmdPlay__Group__0 ) ) ;
    public final void ruleCmdPlay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:341:2: ( ( ( rule__CmdPlay__Group__0 ) ) )
            // InternalOrch8.g:342:2: ( ( rule__CmdPlay__Group__0 ) )
            {
            // InternalOrch8.g:342:2: ( ( rule__CmdPlay__Group__0 ) )
            // InternalOrch8.g:343:3: ( rule__CmdPlay__Group__0 )
            {
             before(grammarAccess.getCmdPlayAccess().getGroup()); 
            // InternalOrch8.g:344:3: ( rule__CmdPlay__Group__0 )
            // InternalOrch8.g:344:4: rule__CmdPlay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CmdPlay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdPlayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmdPlay"


    // $ANTLR start "entryRuleCmdTempo"
    // InternalOrch8.g:353:1: entryRuleCmdTempo : ruleCmdTempo EOF ;
    public final void entryRuleCmdTempo() throws RecognitionException {
        try {
            // InternalOrch8.g:354:1: ( ruleCmdTempo EOF )
            // InternalOrch8.g:355:1: ruleCmdTempo EOF
            {
             before(grammarAccess.getCmdTempoRule()); 
            pushFollow(FOLLOW_1);
            ruleCmdTempo();

            state._fsp--;

             after(grammarAccess.getCmdTempoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCmdTempo"


    // $ANTLR start "ruleCmdTempo"
    // InternalOrch8.g:362:1: ruleCmdTempo : ( ( rule__CmdTempo__Group__0 ) ) ;
    public final void ruleCmdTempo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:366:2: ( ( ( rule__CmdTempo__Group__0 ) ) )
            // InternalOrch8.g:367:2: ( ( rule__CmdTempo__Group__0 ) )
            {
            // InternalOrch8.g:367:2: ( ( rule__CmdTempo__Group__0 ) )
            // InternalOrch8.g:368:3: ( rule__CmdTempo__Group__0 )
            {
             before(grammarAccess.getCmdTempoAccess().getGroup()); 
            // InternalOrch8.g:369:3: ( rule__CmdTempo__Group__0 )
            // InternalOrch8.g:369:4: rule__CmdTempo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CmdTempo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdTempoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmdTempo"


    // $ANTLR start "entryRuleCmdTimeSignature"
    // InternalOrch8.g:378:1: entryRuleCmdTimeSignature : ruleCmdTimeSignature EOF ;
    public final void entryRuleCmdTimeSignature() throws RecognitionException {
        try {
            // InternalOrch8.g:379:1: ( ruleCmdTimeSignature EOF )
            // InternalOrch8.g:380:1: ruleCmdTimeSignature EOF
            {
             before(grammarAccess.getCmdTimeSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleCmdTimeSignature();

            state._fsp--;

             after(grammarAccess.getCmdTimeSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCmdTimeSignature"


    // $ANTLR start "ruleCmdTimeSignature"
    // InternalOrch8.g:387:1: ruleCmdTimeSignature : ( ( rule__CmdTimeSignature__Group__0 ) ) ;
    public final void ruleCmdTimeSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:391:2: ( ( ( rule__CmdTimeSignature__Group__0 ) ) )
            // InternalOrch8.g:392:2: ( ( rule__CmdTimeSignature__Group__0 ) )
            {
            // InternalOrch8.g:392:2: ( ( rule__CmdTimeSignature__Group__0 ) )
            // InternalOrch8.g:393:3: ( rule__CmdTimeSignature__Group__0 )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getGroup()); 
            // InternalOrch8.g:394:3: ( rule__CmdTimeSignature__Group__0 )
            // InternalOrch8.g:394:4: rule__CmdTimeSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CmdTimeSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdTimeSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmdTimeSignature"


    // $ANTLR start "entryRuleCmdSet"
    // InternalOrch8.g:403:1: entryRuleCmdSet : ruleCmdSet EOF ;
    public final void entryRuleCmdSet() throws RecognitionException {
        try {
            // InternalOrch8.g:404:1: ( ruleCmdSet EOF )
            // InternalOrch8.g:405:1: ruleCmdSet EOF
            {
             before(grammarAccess.getCmdSetRule()); 
            pushFollow(FOLLOW_1);
            ruleCmdSet();

            state._fsp--;

             after(grammarAccess.getCmdSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCmdSet"


    // $ANTLR start "ruleCmdSet"
    // InternalOrch8.g:412:1: ruleCmdSet : ( ( rule__CmdSet__Group__0 ) ) ;
    public final void ruleCmdSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:416:2: ( ( ( rule__CmdSet__Group__0 ) ) )
            // InternalOrch8.g:417:2: ( ( rule__CmdSet__Group__0 ) )
            {
            // InternalOrch8.g:417:2: ( ( rule__CmdSet__Group__0 ) )
            // InternalOrch8.g:418:3: ( rule__CmdSet__Group__0 )
            {
             before(grammarAccess.getCmdSetAccess().getGroup()); 
            // InternalOrch8.g:419:3: ( rule__CmdSet__Group__0 )
            // InternalOrch8.g:419:4: rule__CmdSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CmdSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmdSet"


    // $ANTLR start "entryRuleParameter"
    // InternalOrch8.g:428:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalOrch8.g:429:1: ( ruleParameter EOF )
            // InternalOrch8.g:430:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalOrch8.g:437:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:441:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalOrch8.g:442:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalOrch8.g:442:2: ( ( rule__Parameter__Group__0 ) )
            // InternalOrch8.g:443:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalOrch8.g:444:3: ( rule__Parameter__Group__0 )
            // InternalOrch8.g:444:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBeat"
    // InternalOrch8.g:453:1: entryRuleBeat : ruleBeat EOF ;
    public final void entryRuleBeat() throws RecognitionException {
        try {
            // InternalOrch8.g:454:1: ( ruleBeat EOF )
            // InternalOrch8.g:455:1: ruleBeat EOF
            {
             before(grammarAccess.getBeatRule()); 
            pushFollow(FOLLOW_1);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getBeatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBeat"


    // $ANTLR start "ruleBeat"
    // InternalOrch8.g:462:1: ruleBeat : ( ( rule__Beat__Group__0 ) ) ;
    public final void ruleBeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:466:2: ( ( ( rule__Beat__Group__0 ) ) )
            // InternalOrch8.g:467:2: ( ( rule__Beat__Group__0 ) )
            {
            // InternalOrch8.g:467:2: ( ( rule__Beat__Group__0 ) )
            // InternalOrch8.g:468:3: ( rule__Beat__Group__0 )
            {
             before(grammarAccess.getBeatAccess().getGroup()); 
            // InternalOrch8.g:469:3: ( rule__Beat__Group__0 )
            // InternalOrch8.g:469:4: rule__Beat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBeat"


    // $ANTLR start "entryRuleGenerator"
    // InternalOrch8.g:478:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalOrch8.g:479:1: ( ruleGenerator EOF )
            // InternalOrch8.g:480:1: ruleGenerator EOF
            {
             before(grammarAccess.getGeneratorRule()); 
            pushFollow(FOLLOW_1);
            ruleGenerator();

            state._fsp--;

             after(grammarAccess.getGeneratorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // InternalOrch8.g:487:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:491:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalOrch8.g:492:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalOrch8.g:492:2: ( ( rule__Generator__Group__0 ) )
            // InternalOrch8.g:493:3: ( rule__Generator__Group__0 )
            {
             before(grammarAccess.getGeneratorAccess().getGroup()); 
            // InternalOrch8.g:494:3: ( rule__Generator__Group__0 )
            // InternalOrch8.g:494:4: rule__Generator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "rule__Model__Alternatives_0"
    // InternalOrch8.g:502:1: rule__Model__Alternatives_0 : ( ( ( rule__Model__ScoresAssignment_0_0 ) ) | ( ( rule__Model__InstrumentsAssignment_0_1 ) ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:506:1: ( ( ( rule__Model__ScoresAssignment_0_0 ) ) | ( ( rule__Model__InstrumentsAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOrch8.g:507:2: ( ( rule__Model__ScoresAssignment_0_0 ) )
                    {
                    // InternalOrch8.g:507:2: ( ( rule__Model__ScoresAssignment_0_0 ) )
                    // InternalOrch8.g:508:3: ( rule__Model__ScoresAssignment_0_0 )
                    {
                     before(grammarAccess.getModelAccess().getScoresAssignment_0_0()); 
                    // InternalOrch8.g:509:3: ( rule__Model__ScoresAssignment_0_0 )
                    // InternalOrch8.g:509:4: rule__Model__ScoresAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ScoresAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getScoresAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:513:2: ( ( rule__Model__InstrumentsAssignment_0_1 ) )
                    {
                    // InternalOrch8.g:513:2: ( ( rule__Model__InstrumentsAssignment_0_1 ) )
                    // InternalOrch8.g:514:3: ( rule__Model__InstrumentsAssignment_0_1 )
                    {
                     before(grammarAccess.getModelAccess().getInstrumentsAssignment_0_1()); 
                    // InternalOrch8.g:515:3: ( rule__Model__InstrumentsAssignment_0_1 )
                    // InternalOrch8.g:515:4: rule__Model__InstrumentsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__InstrumentsAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getInstrumentsAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_0"


    // $ANTLR start "rule__Model__Alternatives_2"
    // InternalOrch8.g:523:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__ScoresAssignment_2_0 ) ) | ( ( rule__Model__InstrumentsAssignment_2_1 ) ) );
    public final void rule__Model__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:527:1: ( ( ( rule__Model__ScoresAssignment_2_0 ) ) | ( ( rule__Model__InstrumentsAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOrch8.g:528:2: ( ( rule__Model__ScoresAssignment_2_0 ) )
                    {
                    // InternalOrch8.g:528:2: ( ( rule__Model__ScoresAssignment_2_0 ) )
                    // InternalOrch8.g:529:3: ( rule__Model__ScoresAssignment_2_0 )
                    {
                     before(grammarAccess.getModelAccess().getScoresAssignment_2_0()); 
                    // InternalOrch8.g:530:3: ( rule__Model__ScoresAssignment_2_0 )
                    // InternalOrch8.g:530:4: rule__Model__ScoresAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ScoresAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getScoresAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:534:2: ( ( rule__Model__InstrumentsAssignment_2_1 ) )
                    {
                    // InternalOrch8.g:534:2: ( ( rule__Model__InstrumentsAssignment_2_1 ) )
                    // InternalOrch8.g:535:3: ( rule__Model__InstrumentsAssignment_2_1 )
                    {
                     before(grammarAccess.getModelAccess().getInstrumentsAssignment_2_1()); 
                    // InternalOrch8.g:536:3: ( rule__Model__InstrumentsAssignment_2_1 )
                    // InternalOrch8.g:536:4: rule__Model__InstrumentsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__InstrumentsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getInstrumentsAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_2"


    // $ANTLR start "rule__SetupCommand__Alternatives"
    // InternalOrch8.g:544:1: rule__SetupCommand__Alternatives : ( ( ruleCmdTempo ) | ( ruleCmdTimeSignature ) | ( ruleCmdInstrument ) | ( ruleCmdSet ) );
    public final void rule__SetupCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:548:1: ( ( ruleCmdTempo ) | ( ruleCmdTimeSignature ) | ( ruleCmdInstrument ) | ( ruleCmdSet ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 36:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOrch8.g:549:2: ( ruleCmdTempo )
                    {
                    // InternalOrch8.g:549:2: ( ruleCmdTempo )
                    // InternalOrch8.g:550:3: ruleCmdTempo
                    {
                     before(grammarAccess.getSetupCommandAccess().getCmdTempoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdTempo();

                    state._fsp--;

                     after(grammarAccess.getSetupCommandAccess().getCmdTempoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:555:2: ( ruleCmdTimeSignature )
                    {
                    // InternalOrch8.g:555:2: ( ruleCmdTimeSignature )
                    // InternalOrch8.g:556:3: ruleCmdTimeSignature
                    {
                     before(grammarAccess.getSetupCommandAccess().getCmdTimeSignatureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdTimeSignature();

                    state._fsp--;

                     after(grammarAccess.getSetupCommandAccess().getCmdTimeSignatureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOrch8.g:561:2: ( ruleCmdInstrument )
                    {
                    // InternalOrch8.g:561:2: ( ruleCmdInstrument )
                    // InternalOrch8.g:562:3: ruleCmdInstrument
                    {
                     before(grammarAccess.getSetupCommandAccess().getCmdInstrumentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdInstrument();

                    state._fsp--;

                     after(grammarAccess.getSetupCommandAccess().getCmdInstrumentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOrch8.g:567:2: ( ruleCmdSet )
                    {
                    // InternalOrch8.g:567:2: ( ruleCmdSet )
                    // InternalOrch8.g:568:3: ruleCmdSet
                    {
                     before(grammarAccess.getSetupCommandAccess().getCmdSetParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdSet();

                    state._fsp--;

                     after(grammarAccess.getSetupCommandAccess().getCmdSetParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetupCommand__Alternatives"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalOrch8.g:577:1: rule__Command__Alternatives : ( ( ruleCmdTempo ) | ( ruleCmdTimeSignature ) | ( ruleCmdPlay ) | ( ruleCmdInstrument ) | ( ruleCmdSet ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:581:1: ( ( ruleCmdTempo ) | ( ruleCmdTimeSignature ) | ( ruleCmdPlay ) | ( ruleCmdInstrument ) | ( ruleCmdSet ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOrch8.g:582:2: ( ruleCmdTempo )
                    {
                    // InternalOrch8.g:582:2: ( ruleCmdTempo )
                    // InternalOrch8.g:583:3: ruleCmdTempo
                    {
                     before(grammarAccess.getCommandAccess().getCmdTempoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdTempo();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCmdTempoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:588:2: ( ruleCmdTimeSignature )
                    {
                    // InternalOrch8.g:588:2: ( ruleCmdTimeSignature )
                    // InternalOrch8.g:589:3: ruleCmdTimeSignature
                    {
                     before(grammarAccess.getCommandAccess().getCmdTimeSignatureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdTimeSignature();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCmdTimeSignatureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOrch8.g:594:2: ( ruleCmdPlay )
                    {
                    // InternalOrch8.g:594:2: ( ruleCmdPlay )
                    // InternalOrch8.g:595:3: ruleCmdPlay
                    {
                     before(grammarAccess.getCommandAccess().getCmdPlayParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdPlay();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCmdPlayParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOrch8.g:600:2: ( ruleCmdInstrument )
                    {
                    // InternalOrch8.g:600:2: ( ruleCmdInstrument )
                    // InternalOrch8.g:601:3: ruleCmdInstrument
                    {
                     before(grammarAccess.getCommandAccess().getCmdInstrumentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdInstrument();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCmdInstrumentParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOrch8.g:606:2: ( ruleCmdSet )
                    {
                    // InternalOrch8.g:606:2: ( ruleCmdSet )
                    // InternalOrch8.g:607:3: ruleCmdSet
                    {
                     before(grammarAccess.getCommandAccess().getCmdSetParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCmdSet();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCmdSetParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalOrch8.g:616:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:620:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOrch8.g:621:2: ( RULE_STRING )
                    {
                    // InternalOrch8.g:621:2: ( RULE_STRING )
                    // InternalOrch8.g:622:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:627:2: ( RULE_ID )
                    {
                    // InternalOrch8.g:627:2: ( RULE_ID )
                    // InternalOrch8.g:628:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalOrch8.g:637:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:641:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOrch8.g:642:2: ( 'E' )
                    {
                    // InternalOrch8.g:642:2: ( 'E' )
                    // InternalOrch8.g:643:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:648:2: ( 'e' )
                    {
                    // InternalOrch8.g:648:2: ( 'e' )
                    // InternalOrch8.g:649:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Generator__ModeAlternatives_0_0"
    // InternalOrch8.g:658:1: rule__Generator__ModeAlternatives_0_0 : ( ( 'type' ) | ( 'custom' ) );
    public final void rule__Generator__ModeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:662:1: ( ( 'type' ) | ( 'custom' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOrch8.g:663:2: ( 'type' )
                    {
                    // InternalOrch8.g:663:2: ( 'type' )
                    // InternalOrch8.g:664:3: 'type'
                    {
                     before(grammarAccess.getGeneratorAccess().getModeTypeKeyword_0_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getGeneratorAccess().getModeTypeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:669:2: ( 'custom' )
                    {
                    // InternalOrch8.g:669:2: ( 'custom' )
                    // InternalOrch8.g:670:3: 'custom'
                    {
                     before(grammarAccess.getGeneratorAccess().getModeCustomKeyword_0_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getGeneratorAccess().getModeCustomKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__ModeAlternatives_0_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalOrch8.g:679:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:683:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOrch8.g:684:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalOrch8.g:691:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:695:1: ( ( ( rule__Model__Alternatives_0 )* ) )
            // InternalOrch8.g:696:1: ( ( rule__Model__Alternatives_0 )* )
            {
            // InternalOrch8.g:696:1: ( ( rule__Model__Alternatives_0 )* )
            // InternalOrch8.g:697:2: ( rule__Model__Alternatives_0 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalOrch8.g:698:2: ( rule__Model__Alternatives_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22||LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOrch8.g:698:3: rule__Model__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalOrch8.g:706:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:710:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOrch8.g:711:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalOrch8.g:718:1: rule__Model__Group__1__Impl : ( ( rule__Model__MixerAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:722:1: ( ( ( rule__Model__MixerAssignment_1 ) ) )
            // InternalOrch8.g:723:1: ( ( rule__Model__MixerAssignment_1 ) )
            {
            // InternalOrch8.g:723:1: ( ( rule__Model__MixerAssignment_1 ) )
            // InternalOrch8.g:724:2: ( rule__Model__MixerAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getMixerAssignment_1()); 
            // InternalOrch8.g:725:2: ( rule__Model__MixerAssignment_1 )
            // InternalOrch8.g:725:3: rule__Model__MixerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__MixerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMixerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalOrch8.g:733:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:737:1: ( rule__Model__Group__2__Impl )
            // InternalOrch8.g:738:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalOrch8.g:744:1: rule__Model__Group__2__Impl : ( ( rule__Model__Alternatives_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:748:1: ( ( ( rule__Model__Alternatives_2 )* ) )
            // InternalOrch8.g:749:1: ( ( rule__Model__Alternatives_2 )* )
            {
            // InternalOrch8.g:749:1: ( ( rule__Model__Alternatives_2 )* )
            // InternalOrch8.g:750:2: ( rule__Model__Alternatives_2 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_2()); 
            // InternalOrch8.g:751:2: ( rule__Model__Alternatives_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22||LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOrch8.g:751:3: rule__Model__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Mixer__Group__0"
    // InternalOrch8.g:760:1: rule__Mixer__Group__0 : rule__Mixer__Group__0__Impl rule__Mixer__Group__1 ;
    public final void rule__Mixer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:764:1: ( rule__Mixer__Group__0__Impl rule__Mixer__Group__1 )
            // InternalOrch8.g:765:2: rule__Mixer__Group__0__Impl rule__Mixer__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Mixer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__0"


    // $ANTLR start "rule__Mixer__Group__0__Impl"
    // InternalOrch8.g:772:1: rule__Mixer__Group__0__Impl : ( 'Mixer' ) ;
    public final void rule__Mixer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:776:1: ( ( 'Mixer' ) )
            // InternalOrch8.g:777:1: ( 'Mixer' )
            {
            // InternalOrch8.g:777:1: ( 'Mixer' )
            // InternalOrch8.g:778:2: 'Mixer'
            {
             before(grammarAccess.getMixerAccess().getMixerKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMixerAccess().getMixerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__0__Impl"


    // $ANTLR start "rule__Mixer__Group__1"
    // InternalOrch8.g:787:1: rule__Mixer__Group__1 : rule__Mixer__Group__1__Impl rule__Mixer__Group__2 ;
    public final void rule__Mixer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:791:1: ( rule__Mixer__Group__1__Impl rule__Mixer__Group__2 )
            // InternalOrch8.g:792:2: rule__Mixer__Group__1__Impl rule__Mixer__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Mixer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__1"


    // $ANTLR start "rule__Mixer__Group__1__Impl"
    // InternalOrch8.g:799:1: rule__Mixer__Group__1__Impl : ( ( rule__Mixer__NameAssignment_1 ) ) ;
    public final void rule__Mixer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:803:1: ( ( ( rule__Mixer__NameAssignment_1 ) ) )
            // InternalOrch8.g:804:1: ( ( rule__Mixer__NameAssignment_1 ) )
            {
            // InternalOrch8.g:804:1: ( ( rule__Mixer__NameAssignment_1 ) )
            // InternalOrch8.g:805:2: ( rule__Mixer__NameAssignment_1 )
            {
             before(grammarAccess.getMixerAccess().getNameAssignment_1()); 
            // InternalOrch8.g:806:2: ( rule__Mixer__NameAssignment_1 )
            // InternalOrch8.g:806:3: rule__Mixer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMixerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__1__Impl"


    // $ANTLR start "rule__Mixer__Group__2"
    // InternalOrch8.g:814:1: rule__Mixer__Group__2 : rule__Mixer__Group__2__Impl rule__Mixer__Group__3 ;
    public final void rule__Mixer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:818:1: ( rule__Mixer__Group__2__Impl rule__Mixer__Group__3 )
            // InternalOrch8.g:819:2: rule__Mixer__Group__2__Impl rule__Mixer__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Mixer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__2"


    // $ANTLR start "rule__Mixer__Group__2__Impl"
    // InternalOrch8.g:826:1: rule__Mixer__Group__2__Impl : ( '{' ) ;
    public final void rule__Mixer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:830:1: ( ( '{' ) )
            // InternalOrch8.g:831:1: ( '{' )
            {
            // InternalOrch8.g:831:1: ( '{' )
            // InternalOrch8.g:832:2: '{'
            {
             before(grammarAccess.getMixerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMixerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__2__Impl"


    // $ANTLR start "rule__Mixer__Group__3"
    // InternalOrch8.g:841:1: rule__Mixer__Group__3 : rule__Mixer__Group__3__Impl rule__Mixer__Group__4 ;
    public final void rule__Mixer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:845:1: ( rule__Mixer__Group__3__Impl rule__Mixer__Group__4 )
            // InternalOrch8.g:846:2: rule__Mixer__Group__3__Impl rule__Mixer__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Mixer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__3"


    // $ANTLR start "rule__Mixer__Group__3__Impl"
    // InternalOrch8.g:853:1: rule__Mixer__Group__3__Impl : ( ( rule__Mixer__Group_3__0 )? ) ;
    public final void rule__Mixer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:857:1: ( ( ( rule__Mixer__Group_3__0 )? ) )
            // InternalOrch8.g:858:1: ( ( rule__Mixer__Group_3__0 )? )
            {
            // InternalOrch8.g:858:1: ( ( rule__Mixer__Group_3__0 )? )
            // InternalOrch8.g:859:2: ( rule__Mixer__Group_3__0 )?
            {
             before(grammarAccess.getMixerAccess().getGroup_3()); 
            // InternalOrch8.g:860:2: ( rule__Mixer__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOrch8.g:860:3: rule__Mixer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__3__Impl"


    // $ANTLR start "rule__Mixer__Group__4"
    // InternalOrch8.g:868:1: rule__Mixer__Group__4 : rule__Mixer__Group__4__Impl rule__Mixer__Group__5 ;
    public final void rule__Mixer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:872:1: ( rule__Mixer__Group__4__Impl rule__Mixer__Group__5 )
            // InternalOrch8.g:873:2: rule__Mixer__Group__4__Impl rule__Mixer__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Mixer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__4"


    // $ANTLR start "rule__Mixer__Group__4__Impl"
    // InternalOrch8.g:880:1: rule__Mixer__Group__4__Impl : ( 'scores' ) ;
    public final void rule__Mixer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:884:1: ( ( 'scores' ) )
            // InternalOrch8.g:885:1: ( 'scores' )
            {
            // InternalOrch8.g:885:1: ( 'scores' )
            // InternalOrch8.g:886:2: 'scores'
            {
             before(grammarAccess.getMixerAccess().getScoresKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMixerAccess().getScoresKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__4__Impl"


    // $ANTLR start "rule__Mixer__Group__5"
    // InternalOrch8.g:895:1: rule__Mixer__Group__5 : rule__Mixer__Group__5__Impl rule__Mixer__Group__6 ;
    public final void rule__Mixer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:899:1: ( rule__Mixer__Group__5__Impl rule__Mixer__Group__6 )
            // InternalOrch8.g:900:2: rule__Mixer__Group__5__Impl rule__Mixer__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Mixer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__5"


    // $ANTLR start "rule__Mixer__Group__5__Impl"
    // InternalOrch8.g:907:1: rule__Mixer__Group__5__Impl : ( '{' ) ;
    public final void rule__Mixer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:911:1: ( ( '{' ) )
            // InternalOrch8.g:912:1: ( '{' )
            {
            // InternalOrch8.g:912:1: ( '{' )
            // InternalOrch8.g:913:2: '{'
            {
             before(grammarAccess.getMixerAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMixerAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__5__Impl"


    // $ANTLR start "rule__Mixer__Group__6"
    // InternalOrch8.g:922:1: rule__Mixer__Group__6 : rule__Mixer__Group__6__Impl rule__Mixer__Group__7 ;
    public final void rule__Mixer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:926:1: ( rule__Mixer__Group__6__Impl rule__Mixer__Group__7 )
            // InternalOrch8.g:927:2: rule__Mixer__Group__6__Impl rule__Mixer__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Mixer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__6"


    // $ANTLR start "rule__Mixer__Group__6__Impl"
    // InternalOrch8.g:934:1: rule__Mixer__Group__6__Impl : ( ( rule__Mixer__ScoresAssignment_6 ) ) ;
    public final void rule__Mixer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:938:1: ( ( ( rule__Mixer__ScoresAssignment_6 ) ) )
            // InternalOrch8.g:939:1: ( ( rule__Mixer__ScoresAssignment_6 ) )
            {
            // InternalOrch8.g:939:1: ( ( rule__Mixer__ScoresAssignment_6 ) )
            // InternalOrch8.g:940:2: ( rule__Mixer__ScoresAssignment_6 )
            {
             before(grammarAccess.getMixerAccess().getScoresAssignment_6()); 
            // InternalOrch8.g:941:2: ( rule__Mixer__ScoresAssignment_6 )
            // InternalOrch8.g:941:3: rule__Mixer__ScoresAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Mixer__ScoresAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMixerAccess().getScoresAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__6__Impl"


    // $ANTLR start "rule__Mixer__Group__7"
    // InternalOrch8.g:949:1: rule__Mixer__Group__7 : rule__Mixer__Group__7__Impl rule__Mixer__Group__8 ;
    public final void rule__Mixer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:953:1: ( rule__Mixer__Group__7__Impl rule__Mixer__Group__8 )
            // InternalOrch8.g:954:2: rule__Mixer__Group__7__Impl rule__Mixer__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Mixer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__7"


    // $ANTLR start "rule__Mixer__Group__7__Impl"
    // InternalOrch8.g:961:1: rule__Mixer__Group__7__Impl : ( ( rule__Mixer__Group_7__0 )* ) ;
    public final void rule__Mixer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:965:1: ( ( ( rule__Mixer__Group_7__0 )* ) )
            // InternalOrch8.g:966:1: ( ( rule__Mixer__Group_7__0 )* )
            {
            // InternalOrch8.g:966:1: ( ( rule__Mixer__Group_7__0 )* )
            // InternalOrch8.g:967:2: ( rule__Mixer__Group_7__0 )*
            {
             before(grammarAccess.getMixerAccess().getGroup_7()); 
            // InternalOrch8.g:968:2: ( rule__Mixer__Group_7__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOrch8.g:968:3: rule__Mixer__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Mixer__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMixerAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__7__Impl"


    // $ANTLR start "rule__Mixer__Group__8"
    // InternalOrch8.g:976:1: rule__Mixer__Group__8 : rule__Mixer__Group__8__Impl rule__Mixer__Group__9 ;
    public final void rule__Mixer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:980:1: ( rule__Mixer__Group__8__Impl rule__Mixer__Group__9 )
            // InternalOrch8.g:981:2: rule__Mixer__Group__8__Impl rule__Mixer__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Mixer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__8"


    // $ANTLR start "rule__Mixer__Group__8__Impl"
    // InternalOrch8.g:988:1: rule__Mixer__Group__8__Impl : ( '}' ) ;
    public final void rule__Mixer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:992:1: ( ( '}' ) )
            // InternalOrch8.g:993:1: ( '}' )
            {
            // InternalOrch8.g:993:1: ( '}' )
            // InternalOrch8.g:994:2: '}'
            {
             before(grammarAccess.getMixerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMixerAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__8__Impl"


    // $ANTLR start "rule__Mixer__Group__9"
    // InternalOrch8.g:1003:1: rule__Mixer__Group__9 : rule__Mixer__Group__9__Impl ;
    public final void rule__Mixer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1007:1: ( rule__Mixer__Group__9__Impl )
            // InternalOrch8.g:1008:2: rule__Mixer__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixer__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__9"


    // $ANTLR start "rule__Mixer__Group__9__Impl"
    // InternalOrch8.g:1014:1: rule__Mixer__Group__9__Impl : ( '}' ) ;
    public final void rule__Mixer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1018:1: ( ( '}' ) )
            // InternalOrch8.g:1019:1: ( '}' )
            {
            // InternalOrch8.g:1019:1: ( '}' )
            // InternalOrch8.g:1020:2: '}'
            {
             before(grammarAccess.getMixerAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMixerAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group__9__Impl"


    // $ANTLR start "rule__Mixer__Group_3__0"
    // InternalOrch8.g:1030:1: rule__Mixer__Group_3__0 : rule__Mixer__Group_3__0__Impl rule__Mixer__Group_3__1 ;
    public final void rule__Mixer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1034:1: ( rule__Mixer__Group_3__0__Impl rule__Mixer__Group_3__1 )
            // InternalOrch8.g:1035:2: rule__Mixer__Group_3__0__Impl rule__Mixer__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Mixer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group_3__0"


    // $ANTLR start "rule__Mixer__Group_3__0__Impl"
    // InternalOrch8.g:1042:1: rule__Mixer__Group_3__0__Impl : ( 'sampling_rate' ) ;
    public final void rule__Mixer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1046:1: ( ( 'sampling_rate' ) )
            // InternalOrch8.g:1047:1: ( 'sampling_rate' )
            {
            // InternalOrch8.g:1047:1: ( 'sampling_rate' )
            // InternalOrch8.g:1048:2: 'sampling_rate'
            {
             before(grammarAccess.getMixerAccess().getSampling_rateKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMixerAccess().getSampling_rateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group_3__0__Impl"


    // $ANTLR start "rule__Mixer__Group_3__1"
    // InternalOrch8.g:1057:1: rule__Mixer__Group_3__1 : rule__Mixer__Group_3__1__Impl ;
    public final void rule__Mixer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1061:1: ( rule__Mixer__Group_3__1__Impl )
            // InternalOrch8.g:1062:2: rule__Mixer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group_3__1"


    // $ANTLR start "rule__Mixer__Group_3__1__Impl"
    // InternalOrch8.g:1068:1: rule__Mixer__Group_3__1__Impl : ( ( rule__Mixer__Sampling_rateAssignment_3_1 ) ) ;
    public final void rule__Mixer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1072:1: ( ( ( rule__Mixer__Sampling_rateAssignment_3_1 ) ) )
            // InternalOrch8.g:1073:1: ( ( rule__Mixer__Sampling_rateAssignment_3_1 ) )
            {
            // InternalOrch8.g:1073:1: ( ( rule__Mixer__Sampling_rateAssignment_3_1 ) )
            // InternalOrch8.g:1074:2: ( rule__Mixer__Sampling_rateAssignment_3_1 )
            {
             before(grammarAccess.getMixerAccess().getSampling_rateAssignment_3_1()); 
            // InternalOrch8.g:1075:2: ( rule__Mixer__Sampling_rateAssignment_3_1 )
            // InternalOrch8.g:1075:3: rule__Mixer__Sampling_rateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixer__Sampling_rateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMixerAccess().getSampling_rateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group_3__1__Impl"


    // $ANTLR start "rule__Mixer__Group_7__0"
    // InternalOrch8.g:1084:1: rule__Mixer__Group_7__0 : rule__Mixer__Group_7__0__Impl rule__Mixer__Group_7__1 ;
    public final void rule__Mixer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1088:1: ( rule__Mixer__Group_7__0__Impl rule__Mixer__Group_7__1 )
            // InternalOrch8.g:1089:2: rule__Mixer__Group_7__0__Impl rule__Mixer__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Mixer__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixer__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group_7__0"


    // $ANTLR start "rule__Mixer__Group_7__0__Impl"
    // InternalOrch8.g:1096:1: rule__Mixer__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Mixer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1100:1: ( ( ',' ) )
            // InternalOrch8.g:1101:1: ( ',' )
            {
            // InternalOrch8.g:1101:1: ( ',' )
            // InternalOrch8.g:1102:2: ','
            {
             before(grammarAccess.getMixerAccess().getCommaKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMixerAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group_7__0__Impl"


    // $ANTLR start "rule__Mixer__Group_7__1"
    // InternalOrch8.g:1111:1: rule__Mixer__Group_7__1 : rule__Mixer__Group_7__1__Impl ;
    public final void rule__Mixer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1115:1: ( rule__Mixer__Group_7__1__Impl )
            // InternalOrch8.g:1116:2: rule__Mixer__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixer__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group_7__1"


    // $ANTLR start "rule__Mixer__Group_7__1__Impl"
    // InternalOrch8.g:1122:1: rule__Mixer__Group_7__1__Impl : ( ( rule__Mixer__ScoresAssignment_7_1 ) ) ;
    public final void rule__Mixer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1126:1: ( ( ( rule__Mixer__ScoresAssignment_7_1 ) ) )
            // InternalOrch8.g:1127:1: ( ( rule__Mixer__ScoresAssignment_7_1 ) )
            {
            // InternalOrch8.g:1127:1: ( ( rule__Mixer__ScoresAssignment_7_1 ) )
            // InternalOrch8.g:1128:2: ( rule__Mixer__ScoresAssignment_7_1 )
            {
             before(grammarAccess.getMixerAccess().getScoresAssignment_7_1()); 
            // InternalOrch8.g:1129:2: ( rule__Mixer__ScoresAssignment_7_1 )
            // InternalOrch8.g:1129:3: rule__Mixer__ScoresAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixer__ScoresAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMixerAccess().getScoresAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Group_7__1__Impl"


    // $ANTLR start "rule__Score__Group__0"
    // InternalOrch8.g:1138:1: rule__Score__Group__0 : rule__Score__Group__0__Impl rule__Score__Group__1 ;
    public final void rule__Score__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1142:1: ( rule__Score__Group__0__Impl rule__Score__Group__1 )
            // InternalOrch8.g:1143:2: rule__Score__Group__0__Impl rule__Score__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Score__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__0"


    // $ANTLR start "rule__Score__Group__0__Impl"
    // InternalOrch8.g:1150:1: rule__Score__Group__0__Impl : ( 'Score' ) ;
    public final void rule__Score__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1154:1: ( ( 'Score' ) )
            // InternalOrch8.g:1155:1: ( 'Score' )
            {
            // InternalOrch8.g:1155:1: ( 'Score' )
            // InternalOrch8.g:1156:2: 'Score'
            {
             before(grammarAccess.getScoreAccess().getScoreKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getScoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__0__Impl"


    // $ANTLR start "rule__Score__Group__1"
    // InternalOrch8.g:1165:1: rule__Score__Group__1 : rule__Score__Group__1__Impl rule__Score__Group__2 ;
    public final void rule__Score__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1169:1: ( rule__Score__Group__1__Impl rule__Score__Group__2 )
            // InternalOrch8.g:1170:2: rule__Score__Group__1__Impl rule__Score__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Score__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__1"


    // $ANTLR start "rule__Score__Group__1__Impl"
    // InternalOrch8.g:1177:1: rule__Score__Group__1__Impl : ( ( rule__Score__NameAssignment_1 ) ) ;
    public final void rule__Score__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1181:1: ( ( ( rule__Score__NameAssignment_1 ) ) )
            // InternalOrch8.g:1182:1: ( ( rule__Score__NameAssignment_1 ) )
            {
            // InternalOrch8.g:1182:1: ( ( rule__Score__NameAssignment_1 ) )
            // InternalOrch8.g:1183:2: ( rule__Score__NameAssignment_1 )
            {
             before(grammarAccess.getScoreAccess().getNameAssignment_1()); 
            // InternalOrch8.g:1184:2: ( rule__Score__NameAssignment_1 )
            // InternalOrch8.g:1184:3: rule__Score__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Score__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__1__Impl"


    // $ANTLR start "rule__Score__Group__2"
    // InternalOrch8.g:1192:1: rule__Score__Group__2 : rule__Score__Group__2__Impl rule__Score__Group__3 ;
    public final void rule__Score__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1196:1: ( rule__Score__Group__2__Impl rule__Score__Group__3 )
            // InternalOrch8.g:1197:2: rule__Score__Group__2__Impl rule__Score__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Score__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__2"


    // $ANTLR start "rule__Score__Group__2__Impl"
    // InternalOrch8.g:1204:1: rule__Score__Group__2__Impl : ( '{' ) ;
    public final void rule__Score__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1208:1: ( ( '{' ) )
            // InternalOrch8.g:1209:1: ( '{' )
            {
            // InternalOrch8.g:1209:1: ( '{' )
            // InternalOrch8.g:1210:2: '{'
            {
             before(grammarAccess.getScoreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__2__Impl"


    // $ANTLR start "rule__Score__Group__3"
    // InternalOrch8.g:1219:1: rule__Score__Group__3 : rule__Score__Group__3__Impl rule__Score__Group__4 ;
    public final void rule__Score__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1223:1: ( rule__Score__Group__3__Impl rule__Score__Group__4 )
            // InternalOrch8.g:1224:2: rule__Score__Group__3__Impl rule__Score__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Score__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__3"


    // $ANTLR start "rule__Score__Group__3__Impl"
    // InternalOrch8.g:1231:1: rule__Score__Group__3__Impl : ( ( rule__Score__Group_3__0 )? ) ;
    public final void rule__Score__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1235:1: ( ( ( rule__Score__Group_3__0 )? ) )
            // InternalOrch8.g:1236:1: ( ( rule__Score__Group_3__0 )? )
            {
            // InternalOrch8.g:1236:1: ( ( rule__Score__Group_3__0 )? )
            // InternalOrch8.g:1237:2: ( rule__Score__Group_3__0 )?
            {
             before(grammarAccess.getScoreAccess().getGroup_3()); 
            // InternalOrch8.g:1238:2: ( rule__Score__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOrch8.g:1238:3: rule__Score__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Score__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScoreAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__3__Impl"


    // $ANTLR start "rule__Score__Group__4"
    // InternalOrch8.g:1246:1: rule__Score__Group__4 : rule__Score__Group__4__Impl rule__Score__Group__5 ;
    public final void rule__Score__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1250:1: ( rule__Score__Group__4__Impl rule__Score__Group__5 )
            // InternalOrch8.g:1251:2: rule__Score__Group__4__Impl rule__Score__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Score__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__4"


    // $ANTLR start "rule__Score__Group__4__Impl"
    // InternalOrch8.g:1258:1: rule__Score__Group__4__Impl : ( ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* ) ) ;
    public final void rule__Score__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1262:1: ( ( ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* ) ) )
            // InternalOrch8.g:1263:1: ( ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* ) )
            {
            // InternalOrch8.g:1263:1: ( ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* ) )
            // InternalOrch8.g:1264:2: ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* )
            {
            // InternalOrch8.g:1264:2: ( ( rule__Score__MeasuresAssignment_4 ) )
            // InternalOrch8.g:1265:3: ( rule__Score__MeasuresAssignment_4 )
            {
             before(grammarAccess.getScoreAccess().getMeasuresAssignment_4()); 
            // InternalOrch8.g:1266:3: ( rule__Score__MeasuresAssignment_4 )
            // InternalOrch8.g:1266:4: rule__Score__MeasuresAssignment_4
            {
            pushFollow(FOLLOW_15);
            rule__Score__MeasuresAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getMeasuresAssignment_4()); 

            }

            // InternalOrch8.g:1269:2: ( ( rule__Score__MeasuresAssignment_4 )* )
            // InternalOrch8.g:1270:3: ( rule__Score__MeasuresAssignment_4 )*
            {
             before(grammarAccess.getScoreAccess().getMeasuresAssignment_4()); 
            // InternalOrch8.g:1271:3: ( rule__Score__MeasuresAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOrch8.g:1271:4: rule__Score__MeasuresAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Score__MeasuresAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getScoreAccess().getMeasuresAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__4__Impl"


    // $ANTLR start "rule__Score__Group__5"
    // InternalOrch8.g:1280:1: rule__Score__Group__5 : rule__Score__Group__5__Impl rule__Score__Group__6 ;
    public final void rule__Score__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1284:1: ( rule__Score__Group__5__Impl rule__Score__Group__6 )
            // InternalOrch8.g:1285:2: rule__Score__Group__5__Impl rule__Score__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Score__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__5"


    // $ANTLR start "rule__Score__Group__5__Impl"
    // InternalOrch8.g:1292:1: rule__Score__Group__5__Impl : ( ( rule__Score__Group_5__0 )? ) ;
    public final void rule__Score__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1296:1: ( ( ( rule__Score__Group_5__0 )? ) )
            // InternalOrch8.g:1297:1: ( ( rule__Score__Group_5__0 )? )
            {
            // InternalOrch8.g:1297:1: ( ( rule__Score__Group_5__0 )? )
            // InternalOrch8.g:1298:2: ( rule__Score__Group_5__0 )?
            {
             before(grammarAccess.getScoreAccess().getGroup_5()); 
            // InternalOrch8.g:1299:2: ( rule__Score__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOrch8.g:1299:3: rule__Score__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Score__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScoreAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__5__Impl"


    // $ANTLR start "rule__Score__Group__6"
    // InternalOrch8.g:1307:1: rule__Score__Group__6 : rule__Score__Group__6__Impl ;
    public final void rule__Score__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1311:1: ( rule__Score__Group__6__Impl )
            // InternalOrch8.g:1312:2: rule__Score__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__6"


    // $ANTLR start "rule__Score__Group__6__Impl"
    // InternalOrch8.g:1318:1: rule__Score__Group__6__Impl : ( '}' ) ;
    public final void rule__Score__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1322:1: ( ( '}' ) )
            // InternalOrch8.g:1323:1: ( '}' )
            {
            // InternalOrch8.g:1323:1: ( '}' )
            // InternalOrch8.g:1324:2: '}'
            {
             before(grammarAccess.getScoreAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group__6__Impl"


    // $ANTLR start "rule__Score__Group_3__0"
    // InternalOrch8.g:1334:1: rule__Score__Group_3__0 : rule__Score__Group_3__0__Impl rule__Score__Group_3__1 ;
    public final void rule__Score__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1338:1: ( rule__Score__Group_3__0__Impl rule__Score__Group_3__1 )
            // InternalOrch8.g:1339:2: rule__Score__Group_3__0__Impl rule__Score__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Score__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group_3__0"


    // $ANTLR start "rule__Score__Group_3__0__Impl"
    // InternalOrch8.g:1346:1: rule__Score__Group_3__0__Impl : ( '@Setup' ) ;
    public final void rule__Score__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1350:1: ( ( '@Setup' ) )
            // InternalOrch8.g:1351:1: ( '@Setup' )
            {
            // InternalOrch8.g:1351:1: ( '@Setup' )
            // InternalOrch8.g:1352:2: '@Setup'
            {
             before(grammarAccess.getScoreAccess().getSetupKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getSetupKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group_3__0__Impl"


    // $ANTLR start "rule__Score__Group_3__1"
    // InternalOrch8.g:1361:1: rule__Score__Group_3__1 : rule__Score__Group_3__1__Impl ;
    public final void rule__Score__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1365:1: ( rule__Score__Group_3__1__Impl )
            // InternalOrch8.g:1366:2: rule__Score__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group_3__1"


    // $ANTLR start "rule__Score__Group_3__1__Impl"
    // InternalOrch8.g:1372:1: rule__Score__Group_3__1__Impl : ( ( rule__Score__SetupAssignment_3_1 )* ) ;
    public final void rule__Score__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1376:1: ( ( ( rule__Score__SetupAssignment_3_1 )* ) )
            // InternalOrch8.g:1377:1: ( ( rule__Score__SetupAssignment_3_1 )* )
            {
            // InternalOrch8.g:1377:1: ( ( rule__Score__SetupAssignment_3_1 )* )
            // InternalOrch8.g:1378:2: ( rule__Score__SetupAssignment_3_1 )*
            {
             before(grammarAccess.getScoreAccess().getSetupAssignment_3_1()); 
            // InternalOrch8.g:1379:2: ( rule__Score__SetupAssignment_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32||(LA15_0>=34 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOrch8.g:1379:3: rule__Score__SetupAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Score__SetupAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getScoreAccess().getSetupAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group_3__1__Impl"


    // $ANTLR start "rule__Score__Group_5__0"
    // InternalOrch8.g:1388:1: rule__Score__Group_5__0 : rule__Score__Group_5__0__Impl rule__Score__Group_5__1 ;
    public final void rule__Score__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1392:1: ( rule__Score__Group_5__0__Impl rule__Score__Group_5__1 )
            // InternalOrch8.g:1393:2: rule__Score__Group_5__0__Impl rule__Score__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Score__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Score__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group_5__0"


    // $ANTLR start "rule__Score__Group_5__0__Impl"
    // InternalOrch8.g:1400:1: rule__Score__Group_5__0__Impl : ( '@End' ) ;
    public final void rule__Score__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1404:1: ( ( '@End' ) )
            // InternalOrch8.g:1405:1: ( '@End' )
            {
            // InternalOrch8.g:1405:1: ( '@End' )
            // InternalOrch8.g:1406:2: '@End'
            {
             before(grammarAccess.getScoreAccess().getEndKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getScoreAccess().getEndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group_5__0__Impl"


    // $ANTLR start "rule__Score__Group_5__1"
    // InternalOrch8.g:1415:1: rule__Score__Group_5__1 : rule__Score__Group_5__1__Impl ;
    public final void rule__Score__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1419:1: ( rule__Score__Group_5__1__Impl )
            // InternalOrch8.g:1420:2: rule__Score__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Score__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group_5__1"


    // $ANTLR start "rule__Score__Group_5__1__Impl"
    // InternalOrch8.g:1426:1: rule__Score__Group_5__1__Impl : ( ( rule__Score__EndAssignment_5_1 )* ) ;
    public final void rule__Score__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1430:1: ( ( ( rule__Score__EndAssignment_5_1 )* ) )
            // InternalOrch8.g:1431:1: ( ( rule__Score__EndAssignment_5_1 )* )
            {
            // InternalOrch8.g:1431:1: ( ( rule__Score__EndAssignment_5_1 )* )
            // InternalOrch8.g:1432:2: ( rule__Score__EndAssignment_5_1 )*
            {
             before(grammarAccess.getScoreAccess().getEndAssignment_5_1()); 
            // InternalOrch8.g:1433:2: ( rule__Score__EndAssignment_5_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32||(LA16_0>=34 && LA16_0<=36)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOrch8.g:1433:3: rule__Score__EndAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Score__EndAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getScoreAccess().getEndAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__Group_5__1__Impl"


    // $ANTLR start "rule__Instrument__Group__0"
    // InternalOrch8.g:1442:1: rule__Instrument__Group__0 : rule__Instrument__Group__0__Impl rule__Instrument__Group__1 ;
    public final void rule__Instrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1446:1: ( rule__Instrument__Group__0__Impl rule__Instrument__Group__1 )
            // InternalOrch8.g:1447:2: rule__Instrument__Group__0__Impl rule__Instrument__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Instrument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instrument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__0"


    // $ANTLR start "rule__Instrument__Group__0__Impl"
    // InternalOrch8.g:1454:1: rule__Instrument__Group__0__Impl : ( 'Instrument' ) ;
    public final void rule__Instrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1458:1: ( ( 'Instrument' ) )
            // InternalOrch8.g:1459:1: ( 'Instrument' )
            {
            // InternalOrch8.g:1459:1: ( 'Instrument' )
            // InternalOrch8.g:1460:2: 'Instrument'
            {
             before(grammarAccess.getInstrumentAccess().getInstrumentKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInstrumentAccess().getInstrumentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__0__Impl"


    // $ANTLR start "rule__Instrument__Group__1"
    // InternalOrch8.g:1469:1: rule__Instrument__Group__1 : rule__Instrument__Group__1__Impl rule__Instrument__Group__2 ;
    public final void rule__Instrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1473:1: ( rule__Instrument__Group__1__Impl rule__Instrument__Group__2 )
            // InternalOrch8.g:1474:2: rule__Instrument__Group__1__Impl rule__Instrument__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Instrument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instrument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__1"


    // $ANTLR start "rule__Instrument__Group__1__Impl"
    // InternalOrch8.g:1481:1: rule__Instrument__Group__1__Impl : ( ( rule__Instrument__NameAssignment_1 ) ) ;
    public final void rule__Instrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1485:1: ( ( ( rule__Instrument__NameAssignment_1 ) ) )
            // InternalOrch8.g:1486:1: ( ( rule__Instrument__NameAssignment_1 ) )
            {
            // InternalOrch8.g:1486:1: ( ( rule__Instrument__NameAssignment_1 ) )
            // InternalOrch8.g:1487:2: ( rule__Instrument__NameAssignment_1 )
            {
             before(grammarAccess.getInstrumentAccess().getNameAssignment_1()); 
            // InternalOrch8.g:1488:2: ( rule__Instrument__NameAssignment_1 )
            // InternalOrch8.g:1488:3: rule__Instrument__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Instrument__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__1__Impl"


    // $ANTLR start "rule__Instrument__Group__2"
    // InternalOrch8.g:1496:1: rule__Instrument__Group__2 : rule__Instrument__Group__2__Impl rule__Instrument__Group__3 ;
    public final void rule__Instrument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1500:1: ( rule__Instrument__Group__2__Impl rule__Instrument__Group__3 )
            // InternalOrch8.g:1501:2: rule__Instrument__Group__2__Impl rule__Instrument__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Instrument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instrument__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__2"


    // $ANTLR start "rule__Instrument__Group__2__Impl"
    // InternalOrch8.g:1508:1: rule__Instrument__Group__2__Impl : ( '{' ) ;
    public final void rule__Instrument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1512:1: ( ( '{' ) )
            // InternalOrch8.g:1513:1: ( '{' )
            {
            // InternalOrch8.g:1513:1: ( '{' )
            // InternalOrch8.g:1514:2: '{'
            {
             before(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInstrumentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__2__Impl"


    // $ANTLR start "rule__Instrument__Group__3"
    // InternalOrch8.g:1523:1: rule__Instrument__Group__3 : rule__Instrument__Group__3__Impl rule__Instrument__Group__4 ;
    public final void rule__Instrument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1527:1: ( rule__Instrument__Group__3__Impl rule__Instrument__Group__4 )
            // InternalOrch8.g:1528:2: rule__Instrument__Group__3__Impl rule__Instrument__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Instrument__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instrument__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__3"


    // $ANTLR start "rule__Instrument__Group__3__Impl"
    // InternalOrch8.g:1535:1: rule__Instrument__Group__3__Impl : ( ( rule__Instrument__GeneratorAssignment_3 ) ) ;
    public final void rule__Instrument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1539:1: ( ( ( rule__Instrument__GeneratorAssignment_3 ) ) )
            // InternalOrch8.g:1540:1: ( ( rule__Instrument__GeneratorAssignment_3 ) )
            {
            // InternalOrch8.g:1540:1: ( ( rule__Instrument__GeneratorAssignment_3 ) )
            // InternalOrch8.g:1541:2: ( rule__Instrument__GeneratorAssignment_3 )
            {
             before(grammarAccess.getInstrumentAccess().getGeneratorAssignment_3()); 
            // InternalOrch8.g:1542:2: ( rule__Instrument__GeneratorAssignment_3 )
            // InternalOrch8.g:1542:3: rule__Instrument__GeneratorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Instrument__GeneratorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getGeneratorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__3__Impl"


    // $ANTLR start "rule__Instrument__Group__4"
    // InternalOrch8.g:1550:1: rule__Instrument__Group__4 : rule__Instrument__Group__4__Impl rule__Instrument__Group__5 ;
    public final void rule__Instrument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1554:1: ( rule__Instrument__Group__4__Impl rule__Instrument__Group__5 )
            // InternalOrch8.g:1555:2: rule__Instrument__Group__4__Impl rule__Instrument__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Instrument__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instrument__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__4"


    // $ANTLR start "rule__Instrument__Group__4__Impl"
    // InternalOrch8.g:1562:1: rule__Instrument__Group__4__Impl : ( ( rule__Instrument__ParametersAssignment_4 )* ) ;
    public final void rule__Instrument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1566:1: ( ( ( rule__Instrument__ParametersAssignment_4 )* ) )
            // InternalOrch8.g:1567:1: ( ( rule__Instrument__ParametersAssignment_4 )* )
            {
            // InternalOrch8.g:1567:1: ( ( rule__Instrument__ParametersAssignment_4 )* )
            // InternalOrch8.g:1568:2: ( rule__Instrument__ParametersAssignment_4 )*
            {
             before(grammarAccess.getInstrumentAccess().getParametersAssignment_4()); 
            // InternalOrch8.g:1569:2: ( rule__Instrument__ParametersAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOrch8.g:1569:3: rule__Instrument__ParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Instrument__ParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInstrumentAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__4__Impl"


    // $ANTLR start "rule__Instrument__Group__5"
    // InternalOrch8.g:1577:1: rule__Instrument__Group__5 : rule__Instrument__Group__5__Impl ;
    public final void rule__Instrument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1581:1: ( rule__Instrument__Group__5__Impl )
            // InternalOrch8.g:1582:2: rule__Instrument__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instrument__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__5"


    // $ANTLR start "rule__Instrument__Group__5__Impl"
    // InternalOrch8.g:1588:1: rule__Instrument__Group__5__Impl : ( '}' ) ;
    public final void rule__Instrument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1592:1: ( ( '}' ) )
            // InternalOrch8.g:1593:1: ( '}' )
            {
            // InternalOrch8.g:1593:1: ( '}' )
            // InternalOrch8.g:1594:2: '}'
            {
             before(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInstrumentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Group__5__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalOrch8.g:1604:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1608:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalOrch8.g:1609:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalOrch8.g:1616:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1620:1: ( ( ( '-' )? ) )
            // InternalOrch8.g:1621:1: ( ( '-' )? )
            {
            // InternalOrch8.g:1621:1: ( ( '-' )? )
            // InternalOrch8.g:1622:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalOrch8.g:1623:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOrch8.g:1623:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalOrch8.g:1631:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1635:1: ( rule__EInt__Group__1__Impl )
            // InternalOrch8.g:1636:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalOrch8.g:1642:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1646:1: ( ( RULE_INT ) )
            // InternalOrch8.g:1647:1: ( RULE_INT )
            {
            // InternalOrch8.g:1647:1: ( RULE_INT )
            // InternalOrch8.g:1648:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalOrch8.g:1658:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1662:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalOrch8.g:1663:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalOrch8.g:1670:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1674:1: ( ( ( '-' )? ) )
            // InternalOrch8.g:1675:1: ( ( '-' )? )
            {
            // InternalOrch8.g:1675:1: ( ( '-' )? )
            // InternalOrch8.g:1676:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalOrch8.g:1677:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOrch8.g:1677:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalOrch8.g:1685:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1689:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalOrch8.g:1690:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalOrch8.g:1697:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1701:1: ( ( ( RULE_INT )? ) )
            // InternalOrch8.g:1702:1: ( ( RULE_INT )? )
            {
            // InternalOrch8.g:1702:1: ( ( RULE_INT )? )
            // InternalOrch8.g:1703:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalOrch8.g:1704:2: ( RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOrch8.g:1704:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalOrch8.g:1712:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1716:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalOrch8.g:1717:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalOrch8.g:1724:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1728:1: ( ( '.' ) )
            // InternalOrch8.g:1729:1: ( '.' )
            {
            // InternalOrch8.g:1729:1: ( '.' )
            // InternalOrch8.g:1730:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalOrch8.g:1739:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1743:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalOrch8.g:1744:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalOrch8.g:1751:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1755:1: ( ( RULE_INT ) )
            // InternalOrch8.g:1756:1: ( RULE_INT )
            {
            // InternalOrch8.g:1756:1: ( RULE_INT )
            // InternalOrch8.g:1757:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalOrch8.g:1766:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1770:1: ( rule__EDouble__Group__4__Impl )
            // InternalOrch8.g:1771:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalOrch8.g:1777:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1781:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalOrch8.g:1782:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalOrch8.g:1782:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalOrch8.g:1783:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalOrch8.g:1784:2: ( rule__EDouble__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=12 && LA21_0<=13)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOrch8.g:1784:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalOrch8.g:1793:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1797:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalOrch8.g:1798:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalOrch8.g:1805:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1809:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalOrch8.g:1810:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalOrch8.g:1810:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalOrch8.g:1811:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalOrch8.g:1812:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalOrch8.g:1812:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalOrch8.g:1820:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1824:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalOrch8.g:1825:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalOrch8.g:1832:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1836:1: ( ( ( '-' )? ) )
            // InternalOrch8.g:1837:1: ( ( '-' )? )
            {
            // InternalOrch8.g:1837:1: ( ( '-' )? )
            // InternalOrch8.g:1838:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalOrch8.g:1839:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOrch8.g:1839:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalOrch8.g:1847:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1851:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalOrch8.g:1852:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalOrch8.g:1858:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1862:1: ( ( RULE_INT ) )
            // InternalOrch8.g:1863:1: ( RULE_INT )
            {
            // InternalOrch8.g:1863:1: ( RULE_INT )
            // InternalOrch8.g:1864:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Measure__Group__0"
    // InternalOrch8.g:1874:1: rule__Measure__Group__0 : rule__Measure__Group__0__Impl rule__Measure__Group__1 ;
    public final void rule__Measure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1878:1: ( rule__Measure__Group__0__Impl rule__Measure__Group__1 )
            // InternalOrch8.g:1879:2: rule__Measure__Group__0__Impl rule__Measure__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Measure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__0"


    // $ANTLR start "rule__Measure__Group__0__Impl"
    // InternalOrch8.g:1886:1: rule__Measure__Group__0__Impl : ( () ) ;
    public final void rule__Measure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1890:1: ( ( () ) )
            // InternalOrch8.g:1891:1: ( () )
            {
            // InternalOrch8.g:1891:1: ( () )
            // InternalOrch8.g:1892:2: ()
            {
             before(grammarAccess.getMeasureAccess().getMeasureAction_0()); 
            // InternalOrch8.g:1893:2: ()
            // InternalOrch8.g:1893:3: 
            {
            }

             after(grammarAccess.getMeasureAccess().getMeasureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__0__Impl"


    // $ANTLR start "rule__Measure__Group__1"
    // InternalOrch8.g:1901:1: rule__Measure__Group__1 : rule__Measure__Group__1__Impl rule__Measure__Group__2 ;
    public final void rule__Measure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1905:1: ( rule__Measure__Group__1__Impl rule__Measure__Group__2 )
            // InternalOrch8.g:1906:2: rule__Measure__Group__1__Impl rule__Measure__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Measure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__1"


    // $ANTLR start "rule__Measure__Group__1__Impl"
    // InternalOrch8.g:1913:1: rule__Measure__Group__1__Impl : ( '@' ) ;
    public final void rule__Measure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1917:1: ( ( '@' ) )
            // InternalOrch8.g:1918:1: ( '@' )
            {
            // InternalOrch8.g:1918:1: ( '@' )
            // InternalOrch8.g:1919:2: '@'
            {
             before(grammarAccess.getMeasureAccess().getCommercialAtKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMeasureAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__1__Impl"


    // $ANTLR start "rule__Measure__Group__2"
    // InternalOrch8.g:1928:1: rule__Measure__Group__2 : rule__Measure__Group__2__Impl rule__Measure__Group__3 ;
    public final void rule__Measure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1932:1: ( rule__Measure__Group__2__Impl rule__Measure__Group__3 )
            // InternalOrch8.g:1933:2: rule__Measure__Group__2__Impl rule__Measure__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Measure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__2"


    // $ANTLR start "rule__Measure__Group__2__Impl"
    // InternalOrch8.g:1940:1: rule__Measure__Group__2__Impl : ( ( rule__Measure__IDAssignment_2 ) ) ;
    public final void rule__Measure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1944:1: ( ( ( rule__Measure__IDAssignment_2 ) ) )
            // InternalOrch8.g:1945:1: ( ( rule__Measure__IDAssignment_2 ) )
            {
            // InternalOrch8.g:1945:1: ( ( rule__Measure__IDAssignment_2 ) )
            // InternalOrch8.g:1946:2: ( rule__Measure__IDAssignment_2 )
            {
             before(grammarAccess.getMeasureAccess().getIDAssignment_2()); 
            // InternalOrch8.g:1947:2: ( rule__Measure__IDAssignment_2 )
            // InternalOrch8.g:1947:3: rule__Measure__IDAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Measure__IDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__2__Impl"


    // $ANTLR start "rule__Measure__Group__3"
    // InternalOrch8.g:1955:1: rule__Measure__Group__3 : rule__Measure__Group__3__Impl ;
    public final void rule__Measure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1959:1: ( rule__Measure__Group__3__Impl )
            // InternalOrch8.g:1960:2: rule__Measure__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measure__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__3"


    // $ANTLR start "rule__Measure__Group__3__Impl"
    // InternalOrch8.g:1966:1: rule__Measure__Group__3__Impl : ( ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* ) ) ;
    public final void rule__Measure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1970:1: ( ( ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* ) ) )
            // InternalOrch8.g:1971:1: ( ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* ) )
            {
            // InternalOrch8.g:1971:1: ( ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* ) )
            // InternalOrch8.g:1972:2: ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* )
            {
            // InternalOrch8.g:1972:2: ( ( rule__Measure__BeatsAssignment_3 ) )
            // InternalOrch8.g:1973:3: ( rule__Measure__BeatsAssignment_3 )
            {
             before(grammarAccess.getMeasureAccess().getBeatsAssignment_3()); 
            // InternalOrch8.g:1974:3: ( rule__Measure__BeatsAssignment_3 )
            // InternalOrch8.g:1974:4: rule__Measure__BeatsAssignment_3
            {
            pushFollow(FOLLOW_25);
            rule__Measure__BeatsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getBeatsAssignment_3()); 

            }

            // InternalOrch8.g:1977:2: ( ( rule__Measure__BeatsAssignment_3 )* )
            // InternalOrch8.g:1978:3: ( rule__Measure__BeatsAssignment_3 )*
            {
             before(grammarAccess.getMeasureAccess().getBeatsAssignment_3()); 
            // InternalOrch8.g:1979:3: ( rule__Measure__BeatsAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOrch8.g:1979:4: rule__Measure__BeatsAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Measure__BeatsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMeasureAccess().getBeatsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__Group__3__Impl"


    // $ANTLR start "rule__CmdInstrument__Group__0"
    // InternalOrch8.g:1989:1: rule__CmdInstrument__Group__0 : rule__CmdInstrument__Group__0__Impl rule__CmdInstrument__Group__1 ;
    public final void rule__CmdInstrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1993:1: ( rule__CmdInstrument__Group__0__Impl rule__CmdInstrument__Group__1 )
            // InternalOrch8.g:1994:2: rule__CmdInstrument__Group__0__Impl rule__CmdInstrument__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CmdInstrument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdInstrument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdInstrument__Group__0"


    // $ANTLR start "rule__CmdInstrument__Group__0__Impl"
    // InternalOrch8.g:2001:1: rule__CmdInstrument__Group__0__Impl : ( ( rule__CmdInstrument__TypeAssignment_0 ) ) ;
    public final void rule__CmdInstrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2005:1: ( ( ( rule__CmdInstrument__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2006:1: ( ( rule__CmdInstrument__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2006:1: ( ( rule__CmdInstrument__TypeAssignment_0 ) )
            // InternalOrch8.g:2007:2: ( rule__CmdInstrument__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdInstrumentAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2008:2: ( rule__CmdInstrument__TypeAssignment_0 )
            // InternalOrch8.g:2008:3: rule__CmdInstrument__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CmdInstrument__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCmdInstrumentAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdInstrument__Group__0__Impl"


    // $ANTLR start "rule__CmdInstrument__Group__1"
    // InternalOrch8.g:2016:1: rule__CmdInstrument__Group__1 : rule__CmdInstrument__Group__1__Impl ;
    public final void rule__CmdInstrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2020:1: ( rule__CmdInstrument__Group__1__Impl )
            // InternalOrch8.g:2021:2: rule__CmdInstrument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmdInstrument__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdInstrument__Group__1"


    // $ANTLR start "rule__CmdInstrument__Group__1__Impl"
    // InternalOrch8.g:2027:1: rule__CmdInstrument__Group__1__Impl : ( ( rule__CmdInstrument__ParameterAssignment_1 ) ) ;
    public final void rule__CmdInstrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2031:1: ( ( ( rule__CmdInstrument__ParameterAssignment_1 ) ) )
            // InternalOrch8.g:2032:1: ( ( rule__CmdInstrument__ParameterAssignment_1 ) )
            {
            // InternalOrch8.g:2032:1: ( ( rule__CmdInstrument__ParameterAssignment_1 ) )
            // InternalOrch8.g:2033:2: ( rule__CmdInstrument__ParameterAssignment_1 )
            {
             before(grammarAccess.getCmdInstrumentAccess().getParameterAssignment_1()); 
            // InternalOrch8.g:2034:2: ( rule__CmdInstrument__ParameterAssignment_1 )
            // InternalOrch8.g:2034:3: rule__CmdInstrument__ParameterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CmdInstrument__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdInstrumentAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdInstrument__Group__1__Impl"


    // $ANTLR start "rule__CmdPlay__Group__0"
    // InternalOrch8.g:2043:1: rule__CmdPlay__Group__0 : rule__CmdPlay__Group__0__Impl rule__CmdPlay__Group__1 ;
    public final void rule__CmdPlay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2047:1: ( rule__CmdPlay__Group__0__Impl rule__CmdPlay__Group__1 )
            // InternalOrch8.g:2048:2: rule__CmdPlay__Group__0__Impl rule__CmdPlay__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__CmdPlay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdPlay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__Group__0"


    // $ANTLR start "rule__CmdPlay__Group__0__Impl"
    // InternalOrch8.g:2055:1: rule__CmdPlay__Group__0__Impl : ( ( rule__CmdPlay__TypeAssignment_0 ) ) ;
    public final void rule__CmdPlay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2059:1: ( ( ( rule__CmdPlay__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2060:1: ( ( rule__CmdPlay__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2060:1: ( ( rule__CmdPlay__TypeAssignment_0 ) )
            // InternalOrch8.g:2061:2: ( rule__CmdPlay__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdPlayAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2062:2: ( rule__CmdPlay__TypeAssignment_0 )
            // InternalOrch8.g:2062:3: rule__CmdPlay__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CmdPlay__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCmdPlayAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__Group__0__Impl"


    // $ANTLR start "rule__CmdPlay__Group__1"
    // InternalOrch8.g:2070:1: rule__CmdPlay__Group__1 : rule__CmdPlay__Group__1__Impl rule__CmdPlay__Group__2 ;
    public final void rule__CmdPlay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2074:1: ( rule__CmdPlay__Group__1__Impl rule__CmdPlay__Group__2 )
            // InternalOrch8.g:2075:2: rule__CmdPlay__Group__1__Impl rule__CmdPlay__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__CmdPlay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdPlay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__Group__1"


    // $ANTLR start "rule__CmdPlay__Group__1__Impl"
    // InternalOrch8.g:2082:1: rule__CmdPlay__Group__1__Impl : ( ( rule__CmdPlay__NoteAssignment_1 ) ) ;
    public final void rule__CmdPlay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2086:1: ( ( ( rule__CmdPlay__NoteAssignment_1 ) ) )
            // InternalOrch8.g:2087:1: ( ( rule__CmdPlay__NoteAssignment_1 ) )
            {
            // InternalOrch8.g:2087:1: ( ( rule__CmdPlay__NoteAssignment_1 ) )
            // InternalOrch8.g:2088:2: ( rule__CmdPlay__NoteAssignment_1 )
            {
             before(grammarAccess.getCmdPlayAccess().getNoteAssignment_1()); 
            // InternalOrch8.g:2089:2: ( rule__CmdPlay__NoteAssignment_1 )
            // InternalOrch8.g:2089:3: rule__CmdPlay__NoteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CmdPlay__NoteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdPlayAccess().getNoteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__Group__1__Impl"


    // $ANTLR start "rule__CmdPlay__Group__2"
    // InternalOrch8.g:2097:1: rule__CmdPlay__Group__2 : rule__CmdPlay__Group__2__Impl rule__CmdPlay__Group__3 ;
    public final void rule__CmdPlay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2101:1: ( rule__CmdPlay__Group__2__Impl rule__CmdPlay__Group__3 )
            // InternalOrch8.g:2102:2: rule__CmdPlay__Group__2__Impl rule__CmdPlay__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__CmdPlay__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdPlay__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__Group__2"


    // $ANTLR start "rule__CmdPlay__Group__2__Impl"
    // InternalOrch8.g:2109:1: rule__CmdPlay__Group__2__Impl : ( 'length' ) ;
    public final void rule__CmdPlay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2113:1: ( ( 'length' ) )
            // InternalOrch8.g:2114:1: ( 'length' )
            {
            // InternalOrch8.g:2114:1: ( 'length' )
            // InternalOrch8.g:2115:2: 'length'
            {
             before(grammarAccess.getCmdPlayAccess().getLengthKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCmdPlayAccess().getLengthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__Group__2__Impl"


    // $ANTLR start "rule__CmdPlay__Group__3"
    // InternalOrch8.g:2124:1: rule__CmdPlay__Group__3 : rule__CmdPlay__Group__3__Impl ;
    public final void rule__CmdPlay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2128:1: ( rule__CmdPlay__Group__3__Impl )
            // InternalOrch8.g:2129:2: rule__CmdPlay__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmdPlay__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__Group__3"


    // $ANTLR start "rule__CmdPlay__Group__3__Impl"
    // InternalOrch8.g:2135:1: rule__CmdPlay__Group__3__Impl : ( ( rule__CmdPlay__LengthAssignment_3 ) ) ;
    public final void rule__CmdPlay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2139:1: ( ( ( rule__CmdPlay__LengthAssignment_3 ) ) )
            // InternalOrch8.g:2140:1: ( ( rule__CmdPlay__LengthAssignment_3 ) )
            {
            // InternalOrch8.g:2140:1: ( ( rule__CmdPlay__LengthAssignment_3 ) )
            // InternalOrch8.g:2141:2: ( rule__CmdPlay__LengthAssignment_3 )
            {
             before(grammarAccess.getCmdPlayAccess().getLengthAssignment_3()); 
            // InternalOrch8.g:2142:2: ( rule__CmdPlay__LengthAssignment_3 )
            // InternalOrch8.g:2142:3: rule__CmdPlay__LengthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CmdPlay__LengthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCmdPlayAccess().getLengthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__Group__3__Impl"


    // $ANTLR start "rule__CmdTempo__Group__0"
    // InternalOrch8.g:2151:1: rule__CmdTempo__Group__0 : rule__CmdTempo__Group__0__Impl rule__CmdTempo__Group__1 ;
    public final void rule__CmdTempo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2155:1: ( rule__CmdTempo__Group__0__Impl rule__CmdTempo__Group__1 )
            // InternalOrch8.g:2156:2: rule__CmdTempo__Group__0__Impl rule__CmdTempo__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CmdTempo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdTempo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTempo__Group__0"


    // $ANTLR start "rule__CmdTempo__Group__0__Impl"
    // InternalOrch8.g:2163:1: rule__CmdTempo__Group__0__Impl : ( ( rule__CmdTempo__TypeAssignment_0 ) ) ;
    public final void rule__CmdTempo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2167:1: ( ( ( rule__CmdTempo__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2168:1: ( ( rule__CmdTempo__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2168:1: ( ( rule__CmdTempo__TypeAssignment_0 ) )
            // InternalOrch8.g:2169:2: ( rule__CmdTempo__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdTempoAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2170:2: ( rule__CmdTempo__TypeAssignment_0 )
            // InternalOrch8.g:2170:3: rule__CmdTempo__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CmdTempo__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCmdTempoAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTempo__Group__0__Impl"


    // $ANTLR start "rule__CmdTempo__Group__1"
    // InternalOrch8.g:2178:1: rule__CmdTempo__Group__1 : rule__CmdTempo__Group__1__Impl ;
    public final void rule__CmdTempo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2182:1: ( rule__CmdTempo__Group__1__Impl )
            // InternalOrch8.g:2183:2: rule__CmdTempo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmdTempo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTempo__Group__1"


    // $ANTLR start "rule__CmdTempo__Group__1__Impl"
    // InternalOrch8.g:2189:1: rule__CmdTempo__Group__1__Impl : ( ( rule__CmdTempo__BpmAssignment_1 ) ) ;
    public final void rule__CmdTempo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2193:1: ( ( ( rule__CmdTempo__BpmAssignment_1 ) ) )
            // InternalOrch8.g:2194:1: ( ( rule__CmdTempo__BpmAssignment_1 ) )
            {
            // InternalOrch8.g:2194:1: ( ( rule__CmdTempo__BpmAssignment_1 ) )
            // InternalOrch8.g:2195:2: ( rule__CmdTempo__BpmAssignment_1 )
            {
             before(grammarAccess.getCmdTempoAccess().getBpmAssignment_1()); 
            // InternalOrch8.g:2196:2: ( rule__CmdTempo__BpmAssignment_1 )
            // InternalOrch8.g:2196:3: rule__CmdTempo__BpmAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CmdTempo__BpmAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdTempoAccess().getBpmAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTempo__Group__1__Impl"


    // $ANTLR start "rule__CmdTimeSignature__Group__0"
    // InternalOrch8.g:2205:1: rule__CmdTimeSignature__Group__0 : rule__CmdTimeSignature__Group__0__Impl rule__CmdTimeSignature__Group__1 ;
    public final void rule__CmdTimeSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2209:1: ( rule__CmdTimeSignature__Group__0__Impl rule__CmdTimeSignature__Group__1 )
            // InternalOrch8.g:2210:2: rule__CmdTimeSignature__Group__0__Impl rule__CmdTimeSignature__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CmdTimeSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdTimeSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__Group__0"


    // $ANTLR start "rule__CmdTimeSignature__Group__0__Impl"
    // InternalOrch8.g:2217:1: rule__CmdTimeSignature__Group__0__Impl : ( ( rule__CmdTimeSignature__TypeAssignment_0 ) ) ;
    public final void rule__CmdTimeSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2221:1: ( ( ( rule__CmdTimeSignature__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2222:1: ( ( rule__CmdTimeSignature__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2222:1: ( ( rule__CmdTimeSignature__TypeAssignment_0 ) )
            // InternalOrch8.g:2223:2: ( rule__CmdTimeSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2224:2: ( rule__CmdTimeSignature__TypeAssignment_0 )
            // InternalOrch8.g:2224:3: rule__CmdTimeSignature__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CmdTimeSignature__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCmdTimeSignatureAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__Group__0__Impl"


    // $ANTLR start "rule__CmdTimeSignature__Group__1"
    // InternalOrch8.g:2232:1: rule__CmdTimeSignature__Group__1 : rule__CmdTimeSignature__Group__1__Impl rule__CmdTimeSignature__Group__2 ;
    public final void rule__CmdTimeSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2236:1: ( rule__CmdTimeSignature__Group__1__Impl rule__CmdTimeSignature__Group__2 )
            // InternalOrch8.g:2237:2: rule__CmdTimeSignature__Group__1__Impl rule__CmdTimeSignature__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__CmdTimeSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdTimeSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__Group__1"


    // $ANTLR start "rule__CmdTimeSignature__Group__1__Impl"
    // InternalOrch8.g:2244:1: rule__CmdTimeSignature__Group__1__Impl : ( ( rule__CmdTimeSignature__NumeratorAssignment_1 ) ) ;
    public final void rule__CmdTimeSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2248:1: ( ( ( rule__CmdTimeSignature__NumeratorAssignment_1 ) ) )
            // InternalOrch8.g:2249:1: ( ( rule__CmdTimeSignature__NumeratorAssignment_1 ) )
            {
            // InternalOrch8.g:2249:1: ( ( rule__CmdTimeSignature__NumeratorAssignment_1 ) )
            // InternalOrch8.g:2250:2: ( rule__CmdTimeSignature__NumeratorAssignment_1 )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getNumeratorAssignment_1()); 
            // InternalOrch8.g:2251:2: ( rule__CmdTimeSignature__NumeratorAssignment_1 )
            // InternalOrch8.g:2251:3: rule__CmdTimeSignature__NumeratorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CmdTimeSignature__NumeratorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdTimeSignatureAccess().getNumeratorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__Group__1__Impl"


    // $ANTLR start "rule__CmdTimeSignature__Group__2"
    // InternalOrch8.g:2259:1: rule__CmdTimeSignature__Group__2 : rule__CmdTimeSignature__Group__2__Impl rule__CmdTimeSignature__Group__3 ;
    public final void rule__CmdTimeSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2263:1: ( rule__CmdTimeSignature__Group__2__Impl rule__CmdTimeSignature__Group__3 )
            // InternalOrch8.g:2264:2: rule__CmdTimeSignature__Group__2__Impl rule__CmdTimeSignature__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CmdTimeSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdTimeSignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__Group__2"


    // $ANTLR start "rule__CmdTimeSignature__Group__2__Impl"
    // InternalOrch8.g:2271:1: rule__CmdTimeSignature__Group__2__Impl : ( '/' ) ;
    public final void rule__CmdTimeSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2275:1: ( ( '/' ) )
            // InternalOrch8.g:2276:1: ( '/' )
            {
            // InternalOrch8.g:2276:1: ( '/' )
            // InternalOrch8.g:2277:2: '/'
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getSolidusKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCmdTimeSignatureAccess().getSolidusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__Group__2__Impl"


    // $ANTLR start "rule__CmdTimeSignature__Group__3"
    // InternalOrch8.g:2286:1: rule__CmdTimeSignature__Group__3 : rule__CmdTimeSignature__Group__3__Impl ;
    public final void rule__CmdTimeSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2290:1: ( rule__CmdTimeSignature__Group__3__Impl )
            // InternalOrch8.g:2291:2: rule__CmdTimeSignature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmdTimeSignature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__Group__3"


    // $ANTLR start "rule__CmdTimeSignature__Group__3__Impl"
    // InternalOrch8.g:2297:1: rule__CmdTimeSignature__Group__3__Impl : ( ( rule__CmdTimeSignature__DenominatorAssignment_3 ) ) ;
    public final void rule__CmdTimeSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2301:1: ( ( ( rule__CmdTimeSignature__DenominatorAssignment_3 ) ) )
            // InternalOrch8.g:2302:1: ( ( rule__CmdTimeSignature__DenominatorAssignment_3 ) )
            {
            // InternalOrch8.g:2302:1: ( ( rule__CmdTimeSignature__DenominatorAssignment_3 ) )
            // InternalOrch8.g:2303:2: ( rule__CmdTimeSignature__DenominatorAssignment_3 )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getDenominatorAssignment_3()); 
            // InternalOrch8.g:2304:2: ( rule__CmdTimeSignature__DenominatorAssignment_3 )
            // InternalOrch8.g:2304:3: rule__CmdTimeSignature__DenominatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CmdTimeSignature__DenominatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCmdTimeSignatureAccess().getDenominatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__Group__3__Impl"


    // $ANTLR start "rule__CmdSet__Group__0"
    // InternalOrch8.g:2313:1: rule__CmdSet__Group__0 : rule__CmdSet__Group__0__Impl rule__CmdSet__Group__1 ;
    public final void rule__CmdSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2317:1: ( rule__CmdSet__Group__0__Impl rule__CmdSet__Group__1 )
            // InternalOrch8.g:2318:2: rule__CmdSet__Group__0__Impl rule__CmdSet__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CmdSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CmdSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdSet__Group__0"


    // $ANTLR start "rule__CmdSet__Group__0__Impl"
    // InternalOrch8.g:2325:1: rule__CmdSet__Group__0__Impl : ( ( rule__CmdSet__TypeAssignment_0 ) ) ;
    public final void rule__CmdSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2329:1: ( ( ( rule__CmdSet__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2330:1: ( ( rule__CmdSet__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2330:1: ( ( rule__CmdSet__TypeAssignment_0 ) )
            // InternalOrch8.g:2331:2: ( rule__CmdSet__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdSetAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2332:2: ( rule__CmdSet__TypeAssignment_0 )
            // InternalOrch8.g:2332:3: rule__CmdSet__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CmdSet__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCmdSetAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdSet__Group__0__Impl"


    // $ANTLR start "rule__CmdSet__Group__1"
    // InternalOrch8.g:2340:1: rule__CmdSet__Group__1 : rule__CmdSet__Group__1__Impl ;
    public final void rule__CmdSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2344:1: ( rule__CmdSet__Group__1__Impl )
            // InternalOrch8.g:2345:2: rule__CmdSet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CmdSet__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdSet__Group__1"


    // $ANTLR start "rule__CmdSet__Group__1__Impl"
    // InternalOrch8.g:2351:1: rule__CmdSet__Group__1__Impl : ( ( rule__CmdSet__InstrumentAssignment_1 ) ) ;
    public final void rule__CmdSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2355:1: ( ( ( rule__CmdSet__InstrumentAssignment_1 ) ) )
            // InternalOrch8.g:2356:1: ( ( rule__CmdSet__InstrumentAssignment_1 ) )
            {
            // InternalOrch8.g:2356:1: ( ( rule__CmdSet__InstrumentAssignment_1 ) )
            // InternalOrch8.g:2357:2: ( rule__CmdSet__InstrumentAssignment_1 )
            {
             before(grammarAccess.getCmdSetAccess().getInstrumentAssignment_1()); 
            // InternalOrch8.g:2358:2: ( rule__CmdSet__InstrumentAssignment_1 )
            // InternalOrch8.g:2358:3: rule__CmdSet__InstrumentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CmdSet__InstrumentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdSetAccess().getInstrumentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdSet__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalOrch8.g:2367:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2371:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalOrch8.g:2372:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalOrch8.g:2379:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__IDAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2383:1: ( ( ( rule__Parameter__IDAssignment_0 ) ) )
            // InternalOrch8.g:2384:1: ( ( rule__Parameter__IDAssignment_0 ) )
            {
            // InternalOrch8.g:2384:1: ( ( rule__Parameter__IDAssignment_0 ) )
            // InternalOrch8.g:2385:2: ( rule__Parameter__IDAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getIDAssignment_0()); 
            // InternalOrch8.g:2386:2: ( rule__Parameter__IDAssignment_0 )
            // InternalOrch8.g:2386:3: rule__Parameter__IDAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__IDAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getIDAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalOrch8.g:2394:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2398:1: ( rule__Parameter__Group__1__Impl )
            // InternalOrch8.g:2399:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalOrch8.g:2405:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ValueAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2409:1: ( ( ( rule__Parameter__ValueAssignment_1 ) ) )
            // InternalOrch8.g:2410:1: ( ( rule__Parameter__ValueAssignment_1 ) )
            {
            // InternalOrch8.g:2410:1: ( ( rule__Parameter__ValueAssignment_1 ) )
            // InternalOrch8.g:2411:2: ( rule__Parameter__ValueAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_1()); 
            // InternalOrch8.g:2412:2: ( rule__Parameter__ValueAssignment_1 )
            // InternalOrch8.g:2412:3: rule__Parameter__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Beat__Group__0"
    // InternalOrch8.g:2421:1: rule__Beat__Group__0 : rule__Beat__Group__0__Impl rule__Beat__Group__1 ;
    public final void rule__Beat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2425:1: ( rule__Beat__Group__0__Impl rule__Beat__Group__1 )
            // InternalOrch8.g:2426:2: rule__Beat__Group__0__Impl rule__Beat__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Beat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__0"


    // $ANTLR start "rule__Beat__Group__0__Impl"
    // InternalOrch8.g:2433:1: rule__Beat__Group__0__Impl : ( ':' ) ;
    public final void rule__Beat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2437:1: ( ( ':' ) )
            // InternalOrch8.g:2438:1: ( ':' )
            {
            // InternalOrch8.g:2438:1: ( ':' )
            // InternalOrch8.g:2439:2: ':'
            {
             before(grammarAccess.getBeatAccess().getColonKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBeatAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__0__Impl"


    // $ANTLR start "rule__Beat__Group__1"
    // InternalOrch8.g:2448:1: rule__Beat__Group__1 : rule__Beat__Group__1__Impl rule__Beat__Group__2 ;
    public final void rule__Beat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2452:1: ( rule__Beat__Group__1__Impl rule__Beat__Group__2 )
            // InternalOrch8.g:2453:2: rule__Beat__Group__1__Impl rule__Beat__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Beat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Beat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__1"


    // $ANTLR start "rule__Beat__Group__1__Impl"
    // InternalOrch8.g:2460:1: rule__Beat__Group__1__Impl : ( ( rule__Beat__IDAssignment_1 ) ) ;
    public final void rule__Beat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2464:1: ( ( ( rule__Beat__IDAssignment_1 ) ) )
            // InternalOrch8.g:2465:1: ( ( rule__Beat__IDAssignment_1 ) )
            {
            // InternalOrch8.g:2465:1: ( ( rule__Beat__IDAssignment_1 ) )
            // InternalOrch8.g:2466:2: ( rule__Beat__IDAssignment_1 )
            {
             before(grammarAccess.getBeatAccess().getIDAssignment_1()); 
            // InternalOrch8.g:2467:2: ( rule__Beat__IDAssignment_1 )
            // InternalOrch8.g:2467:3: rule__Beat__IDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Beat__IDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getIDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__1__Impl"


    // $ANTLR start "rule__Beat__Group__2"
    // InternalOrch8.g:2475:1: rule__Beat__Group__2 : rule__Beat__Group__2__Impl ;
    public final void rule__Beat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2479:1: ( rule__Beat__Group__2__Impl )
            // InternalOrch8.g:2480:2: rule__Beat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Beat__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__2"


    // $ANTLR start "rule__Beat__Group__2__Impl"
    // InternalOrch8.g:2486:1: rule__Beat__Group__2__Impl : ( ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* ) ) ;
    public final void rule__Beat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2490:1: ( ( ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* ) ) )
            // InternalOrch8.g:2491:1: ( ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* ) )
            {
            // InternalOrch8.g:2491:1: ( ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* ) )
            // InternalOrch8.g:2492:2: ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* )
            {
            // InternalOrch8.g:2492:2: ( ( rule__Beat__CommandsAssignment_2 ) )
            // InternalOrch8.g:2493:3: ( rule__Beat__CommandsAssignment_2 )
            {
             before(grammarAccess.getBeatAccess().getCommandsAssignment_2()); 
            // InternalOrch8.g:2494:3: ( rule__Beat__CommandsAssignment_2 )
            // InternalOrch8.g:2494:4: rule__Beat__CommandsAssignment_2
            {
            pushFollow(FOLLOW_31);
            rule__Beat__CommandsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getCommandsAssignment_2()); 

            }

            // InternalOrch8.g:2497:2: ( ( rule__Beat__CommandsAssignment_2 )* )
            // InternalOrch8.g:2498:3: ( rule__Beat__CommandsAssignment_2 )*
            {
             before(grammarAccess.getBeatAccess().getCommandsAssignment_2()); 
            // InternalOrch8.g:2499:3: ( rule__Beat__CommandsAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=32 && LA24_0<=36)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOrch8.g:2499:4: rule__Beat__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Beat__CommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getBeatAccess().getCommandsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__Group__2__Impl"


    // $ANTLR start "rule__Generator__Group__0"
    // InternalOrch8.g:2509:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2513:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalOrch8.g:2514:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Generator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0"


    // $ANTLR start "rule__Generator__Group__0__Impl"
    // InternalOrch8.g:2521:1: rule__Generator__Group__0__Impl : ( ( rule__Generator__ModeAssignment_0 ) ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2525:1: ( ( ( rule__Generator__ModeAssignment_0 ) ) )
            // InternalOrch8.g:2526:1: ( ( rule__Generator__ModeAssignment_0 ) )
            {
            // InternalOrch8.g:2526:1: ( ( rule__Generator__ModeAssignment_0 ) )
            // InternalOrch8.g:2527:2: ( rule__Generator__ModeAssignment_0 )
            {
             before(grammarAccess.getGeneratorAccess().getModeAssignment_0()); 
            // InternalOrch8.g:2528:2: ( rule__Generator__ModeAssignment_0 )
            // InternalOrch8.g:2528:3: rule__Generator__ModeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Generator__ModeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getModeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0__Impl"


    // $ANTLR start "rule__Generator__Group__1"
    // InternalOrch8.g:2536:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2540:1: ( rule__Generator__Group__1__Impl )
            // InternalOrch8.g:2541:2: rule__Generator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__1"


    // $ANTLR start "rule__Generator__Group__1__Impl"
    // InternalOrch8.g:2547:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__TypeAssignment_1 ) ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2551:1: ( ( ( rule__Generator__TypeAssignment_1 ) ) )
            // InternalOrch8.g:2552:1: ( ( rule__Generator__TypeAssignment_1 ) )
            {
            // InternalOrch8.g:2552:1: ( ( rule__Generator__TypeAssignment_1 ) )
            // InternalOrch8.g:2553:2: ( rule__Generator__TypeAssignment_1 )
            {
             before(grammarAccess.getGeneratorAccess().getTypeAssignment_1()); 
            // InternalOrch8.g:2554:2: ( rule__Generator__TypeAssignment_1 )
            // InternalOrch8.g:2554:3: rule__Generator__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Generator__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__1__Impl"


    // $ANTLR start "rule__Model__ScoresAssignment_0_0"
    // InternalOrch8.g:2563:1: rule__Model__ScoresAssignment_0_0 : ( ruleScore ) ;
    public final void rule__Model__ScoresAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2567:1: ( ( ruleScore ) )
            // InternalOrch8.g:2568:2: ( ruleScore )
            {
            // InternalOrch8.g:2568:2: ( ruleScore )
            // InternalOrch8.g:2569:3: ruleScore
            {
             before(grammarAccess.getModelAccess().getScoresScoreParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScoresScoreParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScoresAssignment_0_0"


    // $ANTLR start "rule__Model__InstrumentsAssignment_0_1"
    // InternalOrch8.g:2578:1: rule__Model__InstrumentsAssignment_0_1 : ( ruleInstrument ) ;
    public final void rule__Model__InstrumentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2582:1: ( ( ruleInstrument ) )
            // InternalOrch8.g:2583:2: ( ruleInstrument )
            {
            // InternalOrch8.g:2583:2: ( ruleInstrument )
            // InternalOrch8.g:2584:3: ruleInstrument
            {
             before(grammarAccess.getModelAccess().getInstrumentsInstrumentParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInstrumentsInstrumentParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InstrumentsAssignment_0_1"


    // $ANTLR start "rule__Model__MixerAssignment_1"
    // InternalOrch8.g:2593:1: rule__Model__MixerAssignment_1 : ( ruleMixer ) ;
    public final void rule__Model__MixerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2597:1: ( ( ruleMixer ) )
            // InternalOrch8.g:2598:2: ( ruleMixer )
            {
            // InternalOrch8.g:2598:2: ( ruleMixer )
            // InternalOrch8.g:2599:3: ruleMixer
            {
             before(grammarAccess.getModelAccess().getMixerMixerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMixer();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMixerMixerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MixerAssignment_1"


    // $ANTLR start "rule__Model__ScoresAssignment_2_0"
    // InternalOrch8.g:2608:1: rule__Model__ScoresAssignment_2_0 : ( ruleScore ) ;
    public final void rule__Model__ScoresAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2612:1: ( ( ruleScore ) )
            // InternalOrch8.g:2613:2: ( ruleScore )
            {
            // InternalOrch8.g:2613:2: ( ruleScore )
            // InternalOrch8.g:2614:3: ruleScore
            {
             before(grammarAccess.getModelAccess().getScoresScoreParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleScore();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScoresScoreParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScoresAssignment_2_0"


    // $ANTLR start "rule__Model__InstrumentsAssignment_2_1"
    // InternalOrch8.g:2623:1: rule__Model__InstrumentsAssignment_2_1 : ( ruleInstrument ) ;
    public final void rule__Model__InstrumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2627:1: ( ( ruleInstrument ) )
            // InternalOrch8.g:2628:2: ( ruleInstrument )
            {
            // InternalOrch8.g:2628:2: ( ruleInstrument )
            // InternalOrch8.g:2629:3: ruleInstrument
            {
             before(grammarAccess.getModelAccess().getInstrumentsInstrumentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInstrumentsInstrumentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InstrumentsAssignment_2_1"


    // $ANTLR start "rule__Mixer__NameAssignment_1"
    // InternalOrch8.g:2638:1: rule__Mixer__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Mixer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2642:1: ( ( ruleEString ) )
            // InternalOrch8.g:2643:2: ( ruleEString )
            {
            // InternalOrch8.g:2643:2: ( ruleEString )
            // InternalOrch8.g:2644:3: ruleEString
            {
             before(grammarAccess.getMixerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMixerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__NameAssignment_1"


    // $ANTLR start "rule__Mixer__Sampling_rateAssignment_3_1"
    // InternalOrch8.g:2653:1: rule__Mixer__Sampling_rateAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Mixer__Sampling_rateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2657:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2658:2: ( ruleEInt )
            {
            // InternalOrch8.g:2658:2: ( ruleEInt )
            // InternalOrch8.g:2659:3: ruleEInt
            {
             before(grammarAccess.getMixerAccess().getSampling_rateEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMixerAccess().getSampling_rateEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__Sampling_rateAssignment_3_1"


    // $ANTLR start "rule__Mixer__ScoresAssignment_6"
    // InternalOrch8.g:2668:1: rule__Mixer__ScoresAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Mixer__ScoresAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2672:1: ( ( ( ruleEString ) ) )
            // InternalOrch8.g:2673:2: ( ( ruleEString ) )
            {
            // InternalOrch8.g:2673:2: ( ( ruleEString ) )
            // InternalOrch8.g:2674:3: ( ruleEString )
            {
             before(grammarAccess.getMixerAccess().getScoresScoreCrossReference_6_0()); 
            // InternalOrch8.g:2675:3: ( ruleEString )
            // InternalOrch8.g:2676:4: ruleEString
            {
             before(grammarAccess.getMixerAccess().getScoresScoreEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMixerAccess().getScoresScoreEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMixerAccess().getScoresScoreCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__ScoresAssignment_6"


    // $ANTLR start "rule__Mixer__ScoresAssignment_7_1"
    // InternalOrch8.g:2687:1: rule__Mixer__ScoresAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Mixer__ScoresAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2691:1: ( ( ( ruleEString ) ) )
            // InternalOrch8.g:2692:2: ( ( ruleEString ) )
            {
            // InternalOrch8.g:2692:2: ( ( ruleEString ) )
            // InternalOrch8.g:2693:3: ( ruleEString )
            {
             before(grammarAccess.getMixerAccess().getScoresScoreCrossReference_7_1_0()); 
            // InternalOrch8.g:2694:3: ( ruleEString )
            // InternalOrch8.g:2695:4: ruleEString
            {
             before(grammarAccess.getMixerAccess().getScoresScoreEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMixerAccess().getScoresScoreEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getMixerAccess().getScoresScoreCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixer__ScoresAssignment_7_1"


    // $ANTLR start "rule__Score__NameAssignment_1"
    // InternalOrch8.g:2706:1: rule__Score__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Score__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2710:1: ( ( ruleEString ) )
            // InternalOrch8.g:2711:2: ( ruleEString )
            {
            // InternalOrch8.g:2711:2: ( ruleEString )
            // InternalOrch8.g:2712:3: ruleEString
            {
             before(grammarAccess.getScoreAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__NameAssignment_1"


    // $ANTLR start "rule__Score__SetupAssignment_3_1"
    // InternalOrch8.g:2721:1: rule__Score__SetupAssignment_3_1 : ( ruleSetupCommand ) ;
    public final void rule__Score__SetupAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2725:1: ( ( ruleSetupCommand ) )
            // InternalOrch8.g:2726:2: ( ruleSetupCommand )
            {
            // InternalOrch8.g:2726:2: ( ruleSetupCommand )
            // InternalOrch8.g:2727:3: ruleSetupCommand
            {
             before(grammarAccess.getScoreAccess().getSetupSetupCommandParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSetupCommand();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getSetupSetupCommandParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__SetupAssignment_3_1"


    // $ANTLR start "rule__Score__MeasuresAssignment_4"
    // InternalOrch8.g:2736:1: rule__Score__MeasuresAssignment_4 : ( ruleMeasure ) ;
    public final void rule__Score__MeasuresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2740:1: ( ( ruleMeasure ) )
            // InternalOrch8.g:2741:2: ( ruleMeasure )
            {
            // InternalOrch8.g:2741:2: ( ruleMeasure )
            // InternalOrch8.g:2742:3: ruleMeasure
            {
             before(grammarAccess.getScoreAccess().getMeasuresMeasureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasure();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getMeasuresMeasureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__MeasuresAssignment_4"


    // $ANTLR start "rule__Score__EndAssignment_5_1"
    // InternalOrch8.g:2751:1: rule__Score__EndAssignment_5_1 : ( ruleSetupCommand ) ;
    public final void rule__Score__EndAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2755:1: ( ( ruleSetupCommand ) )
            // InternalOrch8.g:2756:2: ( ruleSetupCommand )
            {
            // InternalOrch8.g:2756:2: ( ruleSetupCommand )
            // InternalOrch8.g:2757:3: ruleSetupCommand
            {
             before(grammarAccess.getScoreAccess().getEndSetupCommandParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSetupCommand();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getEndSetupCommandParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Score__EndAssignment_5_1"


    // $ANTLR start "rule__Instrument__NameAssignment_1"
    // InternalOrch8.g:2766:1: rule__Instrument__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Instrument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2770:1: ( ( ruleEString ) )
            // InternalOrch8.g:2771:2: ( ruleEString )
            {
            // InternalOrch8.g:2771:2: ( ruleEString )
            // InternalOrch8.g:2772:3: ruleEString
            {
             before(grammarAccess.getInstrumentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInstrumentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__NameAssignment_1"


    // $ANTLR start "rule__Instrument__GeneratorAssignment_3"
    // InternalOrch8.g:2781:1: rule__Instrument__GeneratorAssignment_3 : ( ruleGenerator ) ;
    public final void rule__Instrument__GeneratorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2785:1: ( ( ruleGenerator ) )
            // InternalOrch8.g:2786:2: ( ruleGenerator )
            {
            // InternalOrch8.g:2786:2: ( ruleGenerator )
            // InternalOrch8.g:2787:3: ruleGenerator
            {
             before(grammarAccess.getInstrumentAccess().getGeneratorGeneratorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGenerator();

            state._fsp--;

             after(grammarAccess.getInstrumentAccess().getGeneratorGeneratorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__GeneratorAssignment_3"


    // $ANTLR start "rule__Instrument__ParametersAssignment_4"
    // InternalOrch8.g:2796:1: rule__Instrument__ParametersAssignment_4 : ( ruleParameter ) ;
    public final void rule__Instrument__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2800:1: ( ( ruleParameter ) )
            // InternalOrch8.g:2801:2: ( ruleParameter )
            {
            // InternalOrch8.g:2801:2: ( ruleParameter )
            // InternalOrch8.g:2802:3: ruleParameter
            {
             before(grammarAccess.getInstrumentAccess().getParametersParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getInstrumentAccess().getParametersParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__ParametersAssignment_4"


    // $ANTLR start "rule__Measure__IDAssignment_2"
    // InternalOrch8.g:2811:1: rule__Measure__IDAssignment_2 : ( ruleEInt ) ;
    public final void rule__Measure__IDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2815:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2816:2: ( ruleEInt )
            {
            // InternalOrch8.g:2816:2: ( ruleEInt )
            // InternalOrch8.g:2817:3: ruleEInt
            {
             before(grammarAccess.getMeasureAccess().getIDEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getIDEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__IDAssignment_2"


    // $ANTLR start "rule__Measure__BeatsAssignment_3"
    // InternalOrch8.g:2826:1: rule__Measure__BeatsAssignment_3 : ( ruleBeat ) ;
    public final void rule__Measure__BeatsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2830:1: ( ( ruleBeat ) )
            // InternalOrch8.g:2831:2: ( ruleBeat )
            {
            // InternalOrch8.g:2831:2: ( ruleBeat )
            // InternalOrch8.g:2832:3: ruleBeat
            {
             before(grammarAccess.getMeasureAccess().getBeatsBeatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBeat();

            state._fsp--;

             after(grammarAccess.getMeasureAccess().getBeatsBeatParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Measure__BeatsAssignment_3"


    // $ANTLR start "rule__CmdInstrument__TypeAssignment_0"
    // InternalOrch8.g:2841:1: rule__CmdInstrument__TypeAssignment_0 : ( ( 'instrument' ) ) ;
    public final void rule__CmdInstrument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2845:1: ( ( ( 'instrument' ) ) )
            // InternalOrch8.g:2846:2: ( ( 'instrument' ) )
            {
            // InternalOrch8.g:2846:2: ( ( 'instrument' ) )
            // InternalOrch8.g:2847:3: ( 'instrument' )
            {
             before(grammarAccess.getCmdInstrumentAccess().getTypeInstrumentKeyword_0_0()); 
            // InternalOrch8.g:2848:3: ( 'instrument' )
            // InternalOrch8.g:2849:4: 'instrument'
            {
             before(grammarAccess.getCmdInstrumentAccess().getTypeInstrumentKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCmdInstrumentAccess().getTypeInstrumentKeyword_0_0()); 

            }

             after(grammarAccess.getCmdInstrumentAccess().getTypeInstrumentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdInstrument__TypeAssignment_0"


    // $ANTLR start "rule__CmdInstrument__ParameterAssignment_1"
    // InternalOrch8.g:2860:1: rule__CmdInstrument__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__CmdInstrument__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2864:1: ( ( ruleParameter ) )
            // InternalOrch8.g:2865:2: ( ruleParameter )
            {
            // InternalOrch8.g:2865:2: ( ruleParameter )
            // InternalOrch8.g:2866:3: ruleParameter
            {
             before(grammarAccess.getCmdInstrumentAccess().getParameterParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getCmdInstrumentAccess().getParameterParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdInstrument__ParameterAssignment_1"


    // $ANTLR start "rule__CmdPlay__TypeAssignment_0"
    // InternalOrch8.g:2875:1: rule__CmdPlay__TypeAssignment_0 : ( ( 'play' ) ) ;
    public final void rule__CmdPlay__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2879:1: ( ( ( 'play' ) ) )
            // InternalOrch8.g:2880:2: ( ( 'play' ) )
            {
            // InternalOrch8.g:2880:2: ( ( 'play' ) )
            // InternalOrch8.g:2881:3: ( 'play' )
            {
             before(grammarAccess.getCmdPlayAccess().getTypePlayKeyword_0_0()); 
            // InternalOrch8.g:2882:3: ( 'play' )
            // InternalOrch8.g:2883:4: 'play'
            {
             before(grammarAccess.getCmdPlayAccess().getTypePlayKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCmdPlayAccess().getTypePlayKeyword_0_0()); 

            }

             after(grammarAccess.getCmdPlayAccess().getTypePlayKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__TypeAssignment_0"


    // $ANTLR start "rule__CmdPlay__NoteAssignment_1"
    // InternalOrch8.g:2894:1: rule__CmdPlay__NoteAssignment_1 : ( RULE_NOTE ) ;
    public final void rule__CmdPlay__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2898:1: ( ( RULE_NOTE ) )
            // InternalOrch8.g:2899:2: ( RULE_NOTE )
            {
            // InternalOrch8.g:2899:2: ( RULE_NOTE )
            // InternalOrch8.g:2900:3: RULE_NOTE
            {
             before(grammarAccess.getCmdPlayAccess().getNoteNOTETerminalRuleCall_1_0()); 
            match(input,RULE_NOTE,FOLLOW_2); 
             after(grammarAccess.getCmdPlayAccess().getNoteNOTETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__NoteAssignment_1"


    // $ANTLR start "rule__CmdPlay__LengthAssignment_3"
    // InternalOrch8.g:2909:1: rule__CmdPlay__LengthAssignment_3 : ( ruleEDouble ) ;
    public final void rule__CmdPlay__LengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2913:1: ( ( ruleEDouble ) )
            // InternalOrch8.g:2914:2: ( ruleEDouble )
            {
            // InternalOrch8.g:2914:2: ( ruleEDouble )
            // InternalOrch8.g:2915:3: ruleEDouble
            {
             before(grammarAccess.getCmdPlayAccess().getLengthEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCmdPlayAccess().getLengthEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdPlay__LengthAssignment_3"


    // $ANTLR start "rule__CmdTempo__TypeAssignment_0"
    // InternalOrch8.g:2924:1: rule__CmdTempo__TypeAssignment_0 : ( ( 'tempo' ) ) ;
    public final void rule__CmdTempo__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2928:1: ( ( ( 'tempo' ) ) )
            // InternalOrch8.g:2929:2: ( ( 'tempo' ) )
            {
            // InternalOrch8.g:2929:2: ( ( 'tempo' ) )
            // InternalOrch8.g:2930:3: ( 'tempo' )
            {
             before(grammarAccess.getCmdTempoAccess().getTypeTempoKeyword_0_0()); 
            // InternalOrch8.g:2931:3: ( 'tempo' )
            // InternalOrch8.g:2932:4: 'tempo'
            {
             before(grammarAccess.getCmdTempoAccess().getTypeTempoKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCmdTempoAccess().getTypeTempoKeyword_0_0()); 

            }

             after(grammarAccess.getCmdTempoAccess().getTypeTempoKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTempo__TypeAssignment_0"


    // $ANTLR start "rule__CmdTempo__BpmAssignment_1"
    // InternalOrch8.g:2943:1: rule__CmdTempo__BpmAssignment_1 : ( ruleEInt ) ;
    public final void rule__CmdTempo__BpmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2947:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2948:2: ( ruleEInt )
            {
            // InternalOrch8.g:2948:2: ( ruleEInt )
            // InternalOrch8.g:2949:3: ruleEInt
            {
             before(grammarAccess.getCmdTempoAccess().getBpmEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCmdTempoAccess().getBpmEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTempo__BpmAssignment_1"


    // $ANTLR start "rule__CmdTimeSignature__TypeAssignment_0"
    // InternalOrch8.g:2958:1: rule__CmdTimeSignature__TypeAssignment_0 : ( ( 'time_signature' ) ) ;
    public final void rule__CmdTimeSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2962:1: ( ( ( 'time_signature' ) ) )
            // InternalOrch8.g:2963:2: ( ( 'time_signature' ) )
            {
            // InternalOrch8.g:2963:2: ( ( 'time_signature' ) )
            // InternalOrch8.g:2964:3: ( 'time_signature' )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getTypeTime_signatureKeyword_0_0()); 
            // InternalOrch8.g:2965:3: ( 'time_signature' )
            // InternalOrch8.g:2966:4: 'time_signature'
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getTypeTime_signatureKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCmdTimeSignatureAccess().getTypeTime_signatureKeyword_0_0()); 

            }

             after(grammarAccess.getCmdTimeSignatureAccess().getTypeTime_signatureKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__TypeAssignment_0"


    // $ANTLR start "rule__CmdTimeSignature__NumeratorAssignment_1"
    // InternalOrch8.g:2977:1: rule__CmdTimeSignature__NumeratorAssignment_1 : ( ruleEInt ) ;
    public final void rule__CmdTimeSignature__NumeratorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2981:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2982:2: ( ruleEInt )
            {
            // InternalOrch8.g:2982:2: ( ruleEInt )
            // InternalOrch8.g:2983:3: ruleEInt
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getNumeratorEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCmdTimeSignatureAccess().getNumeratorEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__NumeratorAssignment_1"


    // $ANTLR start "rule__CmdTimeSignature__DenominatorAssignment_3"
    // InternalOrch8.g:2992:1: rule__CmdTimeSignature__DenominatorAssignment_3 : ( ruleEInt ) ;
    public final void rule__CmdTimeSignature__DenominatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2996:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2997:2: ( ruleEInt )
            {
            // InternalOrch8.g:2997:2: ( ruleEInt )
            // InternalOrch8.g:2998:3: ruleEInt
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getDenominatorEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCmdTimeSignatureAccess().getDenominatorEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdTimeSignature__DenominatorAssignment_3"


    // $ANTLR start "rule__CmdSet__TypeAssignment_0"
    // InternalOrch8.g:3007:1: rule__CmdSet__TypeAssignment_0 : ( ( 'set' ) ) ;
    public final void rule__CmdSet__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3011:1: ( ( ( 'set' ) ) )
            // InternalOrch8.g:3012:2: ( ( 'set' ) )
            {
            // InternalOrch8.g:3012:2: ( ( 'set' ) )
            // InternalOrch8.g:3013:3: ( 'set' )
            {
             before(grammarAccess.getCmdSetAccess().getTypeSetKeyword_0_0()); 
            // InternalOrch8.g:3014:3: ( 'set' )
            // InternalOrch8.g:3015:4: 'set'
            {
             before(grammarAccess.getCmdSetAccess().getTypeSetKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCmdSetAccess().getTypeSetKeyword_0_0()); 

            }

             after(grammarAccess.getCmdSetAccess().getTypeSetKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdSet__TypeAssignment_0"


    // $ANTLR start "rule__CmdSet__InstrumentAssignment_1"
    // InternalOrch8.g:3026:1: rule__CmdSet__InstrumentAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__CmdSet__InstrumentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3030:1: ( ( ( ruleEString ) ) )
            // InternalOrch8.g:3031:2: ( ( ruleEString ) )
            {
            // InternalOrch8.g:3031:2: ( ( ruleEString ) )
            // InternalOrch8.g:3032:3: ( ruleEString )
            {
             before(grammarAccess.getCmdSetAccess().getInstrumentInstrumentCrossReference_1_0()); 
            // InternalOrch8.g:3033:3: ( ruleEString )
            // InternalOrch8.g:3034:4: ruleEString
            {
             before(grammarAccess.getCmdSetAccess().getInstrumentInstrumentEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCmdSetAccess().getInstrumentInstrumentEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCmdSetAccess().getInstrumentInstrumentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CmdSet__InstrumentAssignment_1"


    // $ANTLR start "rule__Parameter__IDAssignment_0"
    // InternalOrch8.g:3045:1: rule__Parameter__IDAssignment_0 : ( ruleEString ) ;
    public final void rule__Parameter__IDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3049:1: ( ( ruleEString ) )
            // InternalOrch8.g:3050:2: ( ruleEString )
            {
            // InternalOrch8.g:3050:2: ( ruleEString )
            // InternalOrch8.g:3051:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getIDEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getIDEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__IDAssignment_0"


    // $ANTLR start "rule__Parameter__ValueAssignment_1"
    // InternalOrch8.g:3060:1: rule__Parameter__ValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Parameter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3064:1: ( ( ruleEDouble ) )
            // InternalOrch8.g:3065:2: ( ruleEDouble )
            {
            // InternalOrch8.g:3065:2: ( ruleEDouble )
            // InternalOrch8.g:3066:3: ruleEDouble
            {
             before(grammarAccess.getParameterAccess().getValueEDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueEDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_1"


    // $ANTLR start "rule__Beat__IDAssignment_1"
    // InternalOrch8.g:3075:1: rule__Beat__IDAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Beat__IDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3079:1: ( ( ruleEDouble ) )
            // InternalOrch8.g:3080:2: ( ruleEDouble )
            {
            // InternalOrch8.g:3080:2: ( ruleEDouble )
            // InternalOrch8.g:3081:3: ruleEDouble
            {
             before(grammarAccess.getBeatAccess().getIDEDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getIDEDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__IDAssignment_1"


    // $ANTLR start "rule__Beat__CommandsAssignment_2"
    // InternalOrch8.g:3090:1: rule__Beat__CommandsAssignment_2 : ( ruleCommand ) ;
    public final void rule__Beat__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3094:1: ( ( ruleCommand ) )
            // InternalOrch8.g:3095:2: ( ruleCommand )
            {
            // InternalOrch8.g:3095:2: ( ruleCommand )
            // InternalOrch8.g:3096:3: ruleCommand
            {
             before(grammarAccess.getBeatAccess().getCommandsCommandParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getBeatAccess().getCommandsCommandParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beat__CommandsAssignment_2"


    // $ANTLR start "rule__Generator__ModeAssignment_0"
    // InternalOrch8.g:3105:1: rule__Generator__ModeAssignment_0 : ( ( rule__Generator__ModeAlternatives_0_0 ) ) ;
    public final void rule__Generator__ModeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3109:1: ( ( ( rule__Generator__ModeAlternatives_0_0 ) ) )
            // InternalOrch8.g:3110:2: ( ( rule__Generator__ModeAlternatives_0_0 ) )
            {
            // InternalOrch8.g:3110:2: ( ( rule__Generator__ModeAlternatives_0_0 ) )
            // InternalOrch8.g:3111:3: ( rule__Generator__ModeAlternatives_0_0 )
            {
             before(grammarAccess.getGeneratorAccess().getModeAlternatives_0_0()); 
            // InternalOrch8.g:3112:3: ( rule__Generator__ModeAlternatives_0_0 )
            // InternalOrch8.g:3112:4: rule__Generator__ModeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Generator__ModeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratorAccess().getModeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__ModeAssignment_0"


    // $ANTLR start "rule__Generator__TypeAssignment_1"
    // InternalOrch8.g:3120:1: rule__Generator__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__Generator__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3124:1: ( ( ruleEString ) )
            // InternalOrch8.g:3125:2: ( ruleEString )
            {
            // InternalOrch8.g:3125:2: ( ruleEString )
            // InternalOrch8.g:3126:3: ruleEString
            {
             before(grammarAccess.getGeneratorAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGeneratorAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__TypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001D00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001D00000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001F00000002L});

}