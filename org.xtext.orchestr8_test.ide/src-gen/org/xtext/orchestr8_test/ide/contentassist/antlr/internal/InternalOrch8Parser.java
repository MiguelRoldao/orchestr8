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


    // $ANTLR start "entryRuleCommand"
    // InternalOrch8.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalOrch8.g:79:1: ( ruleCommand EOF )
            // InternalOrch8.g:80:1: ruleCommand EOF
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
    // InternalOrch8.g:87:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:91:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalOrch8.g:92:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalOrch8.g:92:2: ( ( rule__Command__Alternatives ) )
            // InternalOrch8.g:93:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalOrch8.g:94:3: ( rule__Command__Alternatives )
            // InternalOrch8.g:94:4: rule__Command__Alternatives
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
    // InternalOrch8.g:103:1: entryRuleMixer : ruleMixer EOF ;
    public final void entryRuleMixer() throws RecognitionException {
        try {
            // InternalOrch8.g:104:1: ( ruleMixer EOF )
            // InternalOrch8.g:105:1: ruleMixer EOF
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
    // InternalOrch8.g:112:1: ruleMixer : ( ( rule__Mixer__Group__0 ) ) ;
    public final void ruleMixer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:116:2: ( ( ( rule__Mixer__Group__0 ) ) )
            // InternalOrch8.g:117:2: ( ( rule__Mixer__Group__0 ) )
            {
            // InternalOrch8.g:117:2: ( ( rule__Mixer__Group__0 ) )
            // InternalOrch8.g:118:3: ( rule__Mixer__Group__0 )
            {
             before(grammarAccess.getMixerAccess().getGroup()); 
            // InternalOrch8.g:119:3: ( rule__Mixer__Group__0 )
            // InternalOrch8.g:119:4: rule__Mixer__Group__0
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
    // InternalOrch8.g:128:1: entryRuleScore : ruleScore EOF ;
    public final void entryRuleScore() throws RecognitionException {
        try {
            // InternalOrch8.g:129:1: ( ruleScore EOF )
            // InternalOrch8.g:130:1: ruleScore EOF
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
    // InternalOrch8.g:137:1: ruleScore : ( ( rule__Score__Group__0 ) ) ;
    public final void ruleScore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:141:2: ( ( ( rule__Score__Group__0 ) ) )
            // InternalOrch8.g:142:2: ( ( rule__Score__Group__0 ) )
            {
            // InternalOrch8.g:142:2: ( ( rule__Score__Group__0 ) )
            // InternalOrch8.g:143:3: ( rule__Score__Group__0 )
            {
             before(grammarAccess.getScoreAccess().getGroup()); 
            // InternalOrch8.g:144:3: ( rule__Score__Group__0 )
            // InternalOrch8.g:144:4: rule__Score__Group__0
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
    // InternalOrch8.g:153:1: entryRuleInstrument : ruleInstrument EOF ;
    public final void entryRuleInstrument() throws RecognitionException {
        try {
            // InternalOrch8.g:154:1: ( ruleInstrument EOF )
            // InternalOrch8.g:155:1: ruleInstrument EOF
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
    // InternalOrch8.g:162:1: ruleInstrument : ( ( rule__Instrument__Group__0 ) ) ;
    public final void ruleInstrument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:166:2: ( ( ( rule__Instrument__Group__0 ) ) )
            // InternalOrch8.g:167:2: ( ( rule__Instrument__Group__0 ) )
            {
            // InternalOrch8.g:167:2: ( ( rule__Instrument__Group__0 ) )
            // InternalOrch8.g:168:3: ( rule__Instrument__Group__0 )
            {
             before(grammarAccess.getInstrumentAccess().getGroup()); 
            // InternalOrch8.g:169:3: ( rule__Instrument__Group__0 )
            // InternalOrch8.g:169:4: rule__Instrument__Group__0
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
    // InternalOrch8.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOrch8.g:179:1: ( ruleEString EOF )
            // InternalOrch8.g:180:1: ruleEString EOF
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
    // InternalOrch8.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalOrch8.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalOrch8.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalOrch8.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalOrch8.g:194:3: ( rule__EString__Alternatives )
            // InternalOrch8.g:194:4: rule__EString__Alternatives
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
    // InternalOrch8.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalOrch8.g:204:1: ( ruleEInt EOF )
            // InternalOrch8.g:205:1: ruleEInt EOF
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
    // InternalOrch8.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalOrch8.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalOrch8.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalOrch8.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalOrch8.g:219:3: ( rule__EInt__Group__0 )
            // InternalOrch8.g:219:4: rule__EInt__Group__0
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
    // InternalOrch8.g:228:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalOrch8.g:229:1: ( ruleEDouble EOF )
            // InternalOrch8.g:230:1: ruleEDouble EOF
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
    // InternalOrch8.g:237:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:241:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalOrch8.g:242:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalOrch8.g:242:2: ( ( rule__EDouble__Group__0 ) )
            // InternalOrch8.g:243:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalOrch8.g:244:3: ( rule__EDouble__Group__0 )
            // InternalOrch8.g:244:4: rule__EDouble__Group__0
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
    // InternalOrch8.g:253:1: entryRuleMeasure : ruleMeasure EOF ;
    public final void entryRuleMeasure() throws RecognitionException {
        try {
            // InternalOrch8.g:254:1: ( ruleMeasure EOF )
            // InternalOrch8.g:255:1: ruleMeasure EOF
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
    // InternalOrch8.g:262:1: ruleMeasure : ( ( rule__Measure__Group__0 ) ) ;
    public final void ruleMeasure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:266:2: ( ( ( rule__Measure__Group__0 ) ) )
            // InternalOrch8.g:267:2: ( ( rule__Measure__Group__0 ) )
            {
            // InternalOrch8.g:267:2: ( ( rule__Measure__Group__0 ) )
            // InternalOrch8.g:268:3: ( rule__Measure__Group__0 )
            {
             before(grammarAccess.getMeasureAccess().getGroup()); 
            // InternalOrch8.g:269:3: ( rule__Measure__Group__0 )
            // InternalOrch8.g:269:4: rule__Measure__Group__0
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
    // InternalOrch8.g:278:1: entryRuleCmdInstrument : ruleCmdInstrument EOF ;
    public final void entryRuleCmdInstrument() throws RecognitionException {
        try {
            // InternalOrch8.g:279:1: ( ruleCmdInstrument EOF )
            // InternalOrch8.g:280:1: ruleCmdInstrument EOF
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
    // InternalOrch8.g:287:1: ruleCmdInstrument : ( ( rule__CmdInstrument__Group__0 ) ) ;
    public final void ruleCmdInstrument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:291:2: ( ( ( rule__CmdInstrument__Group__0 ) ) )
            // InternalOrch8.g:292:2: ( ( rule__CmdInstrument__Group__0 ) )
            {
            // InternalOrch8.g:292:2: ( ( rule__CmdInstrument__Group__0 ) )
            // InternalOrch8.g:293:3: ( rule__CmdInstrument__Group__0 )
            {
             before(grammarAccess.getCmdInstrumentAccess().getGroup()); 
            // InternalOrch8.g:294:3: ( rule__CmdInstrument__Group__0 )
            // InternalOrch8.g:294:4: rule__CmdInstrument__Group__0
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
    // InternalOrch8.g:303:1: entryRuleCmdPlay : ruleCmdPlay EOF ;
    public final void entryRuleCmdPlay() throws RecognitionException {
        try {
            // InternalOrch8.g:304:1: ( ruleCmdPlay EOF )
            // InternalOrch8.g:305:1: ruleCmdPlay EOF
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
    // InternalOrch8.g:312:1: ruleCmdPlay : ( ( rule__CmdPlay__Group__0 ) ) ;
    public final void ruleCmdPlay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:316:2: ( ( ( rule__CmdPlay__Group__0 ) ) )
            // InternalOrch8.g:317:2: ( ( rule__CmdPlay__Group__0 ) )
            {
            // InternalOrch8.g:317:2: ( ( rule__CmdPlay__Group__0 ) )
            // InternalOrch8.g:318:3: ( rule__CmdPlay__Group__0 )
            {
             before(grammarAccess.getCmdPlayAccess().getGroup()); 
            // InternalOrch8.g:319:3: ( rule__CmdPlay__Group__0 )
            // InternalOrch8.g:319:4: rule__CmdPlay__Group__0
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
    // InternalOrch8.g:328:1: entryRuleCmdTempo : ruleCmdTempo EOF ;
    public final void entryRuleCmdTempo() throws RecognitionException {
        try {
            // InternalOrch8.g:329:1: ( ruleCmdTempo EOF )
            // InternalOrch8.g:330:1: ruleCmdTempo EOF
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
    // InternalOrch8.g:337:1: ruleCmdTempo : ( ( rule__CmdTempo__Group__0 ) ) ;
    public final void ruleCmdTempo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:341:2: ( ( ( rule__CmdTempo__Group__0 ) ) )
            // InternalOrch8.g:342:2: ( ( rule__CmdTempo__Group__0 ) )
            {
            // InternalOrch8.g:342:2: ( ( rule__CmdTempo__Group__0 ) )
            // InternalOrch8.g:343:3: ( rule__CmdTempo__Group__0 )
            {
             before(grammarAccess.getCmdTempoAccess().getGroup()); 
            // InternalOrch8.g:344:3: ( rule__CmdTempo__Group__0 )
            // InternalOrch8.g:344:4: rule__CmdTempo__Group__0
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
    // InternalOrch8.g:353:1: entryRuleCmdTimeSignature : ruleCmdTimeSignature EOF ;
    public final void entryRuleCmdTimeSignature() throws RecognitionException {
        try {
            // InternalOrch8.g:354:1: ( ruleCmdTimeSignature EOF )
            // InternalOrch8.g:355:1: ruleCmdTimeSignature EOF
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
    // InternalOrch8.g:362:1: ruleCmdTimeSignature : ( ( rule__CmdTimeSignature__Group__0 ) ) ;
    public final void ruleCmdTimeSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:366:2: ( ( ( rule__CmdTimeSignature__Group__0 ) ) )
            // InternalOrch8.g:367:2: ( ( rule__CmdTimeSignature__Group__0 ) )
            {
            // InternalOrch8.g:367:2: ( ( rule__CmdTimeSignature__Group__0 ) )
            // InternalOrch8.g:368:3: ( rule__CmdTimeSignature__Group__0 )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getGroup()); 
            // InternalOrch8.g:369:3: ( rule__CmdTimeSignature__Group__0 )
            // InternalOrch8.g:369:4: rule__CmdTimeSignature__Group__0
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
    // InternalOrch8.g:378:1: entryRuleCmdSet : ruleCmdSet EOF ;
    public final void entryRuleCmdSet() throws RecognitionException {
        try {
            // InternalOrch8.g:379:1: ( ruleCmdSet EOF )
            // InternalOrch8.g:380:1: ruleCmdSet EOF
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
    // InternalOrch8.g:387:1: ruleCmdSet : ( ( rule__CmdSet__Group__0 ) ) ;
    public final void ruleCmdSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:391:2: ( ( ( rule__CmdSet__Group__0 ) ) )
            // InternalOrch8.g:392:2: ( ( rule__CmdSet__Group__0 ) )
            {
            // InternalOrch8.g:392:2: ( ( rule__CmdSet__Group__0 ) )
            // InternalOrch8.g:393:3: ( rule__CmdSet__Group__0 )
            {
             before(grammarAccess.getCmdSetAccess().getGroup()); 
            // InternalOrch8.g:394:3: ( rule__CmdSet__Group__0 )
            // InternalOrch8.g:394:4: rule__CmdSet__Group__0
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
    // InternalOrch8.g:403:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalOrch8.g:404:1: ( ruleParameter EOF )
            // InternalOrch8.g:405:1: ruleParameter EOF
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
    // InternalOrch8.g:412:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:416:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalOrch8.g:417:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalOrch8.g:417:2: ( ( rule__Parameter__Group__0 ) )
            // InternalOrch8.g:418:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalOrch8.g:419:3: ( rule__Parameter__Group__0 )
            // InternalOrch8.g:419:4: rule__Parameter__Group__0
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
    // InternalOrch8.g:428:1: entryRuleBeat : ruleBeat EOF ;
    public final void entryRuleBeat() throws RecognitionException {
        try {
            // InternalOrch8.g:429:1: ( ruleBeat EOF )
            // InternalOrch8.g:430:1: ruleBeat EOF
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
    // InternalOrch8.g:437:1: ruleBeat : ( ( rule__Beat__Group__0 ) ) ;
    public final void ruleBeat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:441:2: ( ( ( rule__Beat__Group__0 ) ) )
            // InternalOrch8.g:442:2: ( ( rule__Beat__Group__0 ) )
            {
            // InternalOrch8.g:442:2: ( ( rule__Beat__Group__0 ) )
            // InternalOrch8.g:443:3: ( rule__Beat__Group__0 )
            {
             before(grammarAccess.getBeatAccess().getGroup()); 
            // InternalOrch8.g:444:3: ( rule__Beat__Group__0 )
            // InternalOrch8.g:444:4: rule__Beat__Group__0
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
    // InternalOrch8.g:453:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // InternalOrch8.g:454:1: ( ruleGenerator EOF )
            // InternalOrch8.g:455:1: ruleGenerator EOF
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
    // InternalOrch8.g:462:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:466:2: ( ( ( rule__Generator__Group__0 ) ) )
            // InternalOrch8.g:467:2: ( ( rule__Generator__Group__0 ) )
            {
            // InternalOrch8.g:467:2: ( ( rule__Generator__Group__0 ) )
            // InternalOrch8.g:468:3: ( rule__Generator__Group__0 )
            {
             before(grammarAccess.getGeneratorAccess().getGroup()); 
            // InternalOrch8.g:469:3: ( rule__Generator__Group__0 )
            // InternalOrch8.g:469:4: rule__Generator__Group__0
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
    // InternalOrch8.g:477:1: rule__Model__Alternatives_0 : ( ( ( rule__Model__ScoresAssignment_0_0 ) ) | ( ( rule__Model__InstrumentsAssignment_0_1 ) ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:481:1: ( ( ( rule__Model__ScoresAssignment_0_0 ) ) | ( ( rule__Model__InstrumentsAssignment_0_1 ) ) )
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
                    // InternalOrch8.g:482:2: ( ( rule__Model__ScoresAssignment_0_0 ) )
                    {
                    // InternalOrch8.g:482:2: ( ( rule__Model__ScoresAssignment_0_0 ) )
                    // InternalOrch8.g:483:3: ( rule__Model__ScoresAssignment_0_0 )
                    {
                     before(grammarAccess.getModelAccess().getScoresAssignment_0_0()); 
                    // InternalOrch8.g:484:3: ( rule__Model__ScoresAssignment_0_0 )
                    // InternalOrch8.g:484:4: rule__Model__ScoresAssignment_0_0
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
                    // InternalOrch8.g:488:2: ( ( rule__Model__InstrumentsAssignment_0_1 ) )
                    {
                    // InternalOrch8.g:488:2: ( ( rule__Model__InstrumentsAssignment_0_1 ) )
                    // InternalOrch8.g:489:3: ( rule__Model__InstrumentsAssignment_0_1 )
                    {
                     before(grammarAccess.getModelAccess().getInstrumentsAssignment_0_1()); 
                    // InternalOrch8.g:490:3: ( rule__Model__InstrumentsAssignment_0_1 )
                    // InternalOrch8.g:490:4: rule__Model__InstrumentsAssignment_0_1
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
    // InternalOrch8.g:498:1: rule__Model__Alternatives_2 : ( ( ( rule__Model__ScoresAssignment_2_0 ) ) | ( ( rule__Model__InstrumentsAssignment_2_1 ) ) );
    public final void rule__Model__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:502:1: ( ( ( rule__Model__ScoresAssignment_2_0 ) ) | ( ( rule__Model__InstrumentsAssignment_2_1 ) ) )
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
                    // InternalOrch8.g:503:2: ( ( rule__Model__ScoresAssignment_2_0 ) )
                    {
                    // InternalOrch8.g:503:2: ( ( rule__Model__ScoresAssignment_2_0 ) )
                    // InternalOrch8.g:504:3: ( rule__Model__ScoresAssignment_2_0 )
                    {
                     before(grammarAccess.getModelAccess().getScoresAssignment_2_0()); 
                    // InternalOrch8.g:505:3: ( rule__Model__ScoresAssignment_2_0 )
                    // InternalOrch8.g:505:4: rule__Model__ScoresAssignment_2_0
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
                    // InternalOrch8.g:509:2: ( ( rule__Model__InstrumentsAssignment_2_1 ) )
                    {
                    // InternalOrch8.g:509:2: ( ( rule__Model__InstrumentsAssignment_2_1 ) )
                    // InternalOrch8.g:510:3: ( rule__Model__InstrumentsAssignment_2_1 )
                    {
                     before(grammarAccess.getModelAccess().getInstrumentsAssignment_2_1()); 
                    // InternalOrch8.g:511:3: ( rule__Model__InstrumentsAssignment_2_1 )
                    // InternalOrch8.g:511:4: rule__Model__InstrumentsAssignment_2_1
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


    // $ANTLR start "rule__Command__Alternatives"
    // InternalOrch8.g:519:1: rule__Command__Alternatives : ( ( ruleCmdTempo ) | ( ruleCmdTimeSignature ) | ( ruleCmdPlay ) | ( ruleCmdInstrument ) | ( ruleCmdSet ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:523:1: ( ( ruleCmdTempo ) | ( ruleCmdTimeSignature ) | ( ruleCmdPlay ) | ( ruleCmdInstrument ) | ( ruleCmdSet ) )
            int alt3=5;
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
            case 33:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            case 36:
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
                    // InternalOrch8.g:524:2: ( ruleCmdTempo )
                    {
                    // InternalOrch8.g:524:2: ( ruleCmdTempo )
                    // InternalOrch8.g:525:3: ruleCmdTempo
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
                    // InternalOrch8.g:530:2: ( ruleCmdTimeSignature )
                    {
                    // InternalOrch8.g:530:2: ( ruleCmdTimeSignature )
                    // InternalOrch8.g:531:3: ruleCmdTimeSignature
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
                    // InternalOrch8.g:536:2: ( ruleCmdPlay )
                    {
                    // InternalOrch8.g:536:2: ( ruleCmdPlay )
                    // InternalOrch8.g:537:3: ruleCmdPlay
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
                    // InternalOrch8.g:542:2: ( ruleCmdInstrument )
                    {
                    // InternalOrch8.g:542:2: ( ruleCmdInstrument )
                    // InternalOrch8.g:543:3: ruleCmdInstrument
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
                    // InternalOrch8.g:548:2: ( ruleCmdSet )
                    {
                    // InternalOrch8.g:548:2: ( ruleCmdSet )
                    // InternalOrch8.g:549:3: ruleCmdSet
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
    // InternalOrch8.g:558:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:562:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOrch8.g:563:2: ( RULE_STRING )
                    {
                    // InternalOrch8.g:563:2: ( RULE_STRING )
                    // InternalOrch8.g:564:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:569:2: ( RULE_ID )
                    {
                    // InternalOrch8.g:569:2: ( RULE_ID )
                    // InternalOrch8.g:570:3: RULE_ID
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
    // InternalOrch8.g:579:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:583:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOrch8.g:584:2: ( 'E' )
                    {
                    // InternalOrch8.g:584:2: ( 'E' )
                    // InternalOrch8.g:585:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:590:2: ( 'e' )
                    {
                    // InternalOrch8.g:590:2: ( 'e' )
                    // InternalOrch8.g:591:3: 'e'
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
    // InternalOrch8.g:600:1: rule__Generator__ModeAlternatives_0_0 : ( ( 'type' ) | ( 'custom' ) );
    public final void rule__Generator__ModeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:604:1: ( ( 'type' ) | ( 'custom' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOrch8.g:605:2: ( 'type' )
                    {
                    // InternalOrch8.g:605:2: ( 'type' )
                    // InternalOrch8.g:606:3: 'type'
                    {
                     before(grammarAccess.getGeneratorAccess().getModeTypeKeyword_0_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getGeneratorAccess().getModeTypeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrch8.g:611:2: ( 'custom' )
                    {
                    // InternalOrch8.g:611:2: ( 'custom' )
                    // InternalOrch8.g:612:3: 'custom'
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
    // InternalOrch8.g:621:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:625:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOrch8.g:626:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalOrch8.g:633:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:637:1: ( ( ( rule__Model__Alternatives_0 )* ) )
            // InternalOrch8.g:638:1: ( ( rule__Model__Alternatives_0 )* )
            {
            // InternalOrch8.g:638:1: ( ( rule__Model__Alternatives_0 )* )
            // InternalOrch8.g:639:2: ( rule__Model__Alternatives_0 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalOrch8.g:640:2: ( rule__Model__Alternatives_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22||LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOrch8.g:640:3: rule__Model__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalOrch8.g:648:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:652:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOrch8.g:653:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalOrch8.g:660:1: rule__Model__Group__1__Impl : ( ( rule__Model__MixerAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:664:1: ( ( ( rule__Model__MixerAssignment_1 ) ) )
            // InternalOrch8.g:665:1: ( ( rule__Model__MixerAssignment_1 ) )
            {
            // InternalOrch8.g:665:1: ( ( rule__Model__MixerAssignment_1 ) )
            // InternalOrch8.g:666:2: ( rule__Model__MixerAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getMixerAssignment_1()); 
            // InternalOrch8.g:667:2: ( rule__Model__MixerAssignment_1 )
            // InternalOrch8.g:667:3: rule__Model__MixerAssignment_1
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
    // InternalOrch8.g:675:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:679:1: ( rule__Model__Group__2__Impl )
            // InternalOrch8.g:680:2: rule__Model__Group__2__Impl
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
    // InternalOrch8.g:686:1: rule__Model__Group__2__Impl : ( ( rule__Model__Alternatives_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:690:1: ( ( ( rule__Model__Alternatives_2 )* ) )
            // InternalOrch8.g:691:1: ( ( rule__Model__Alternatives_2 )* )
            {
            // InternalOrch8.g:691:1: ( ( rule__Model__Alternatives_2 )* )
            // InternalOrch8.g:692:2: ( rule__Model__Alternatives_2 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_2()); 
            // InternalOrch8.g:693:2: ( rule__Model__Alternatives_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22||LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOrch8.g:693:3: rule__Model__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalOrch8.g:702:1: rule__Mixer__Group__0 : rule__Mixer__Group__0__Impl rule__Mixer__Group__1 ;
    public final void rule__Mixer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:706:1: ( rule__Mixer__Group__0__Impl rule__Mixer__Group__1 )
            // InternalOrch8.g:707:2: rule__Mixer__Group__0__Impl rule__Mixer__Group__1
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
    // InternalOrch8.g:714:1: rule__Mixer__Group__0__Impl : ( 'Mixer' ) ;
    public final void rule__Mixer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:718:1: ( ( 'Mixer' ) )
            // InternalOrch8.g:719:1: ( 'Mixer' )
            {
            // InternalOrch8.g:719:1: ( 'Mixer' )
            // InternalOrch8.g:720:2: 'Mixer'
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
    // InternalOrch8.g:729:1: rule__Mixer__Group__1 : rule__Mixer__Group__1__Impl rule__Mixer__Group__2 ;
    public final void rule__Mixer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:733:1: ( rule__Mixer__Group__1__Impl rule__Mixer__Group__2 )
            // InternalOrch8.g:734:2: rule__Mixer__Group__1__Impl rule__Mixer__Group__2
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
    // InternalOrch8.g:741:1: rule__Mixer__Group__1__Impl : ( ( rule__Mixer__NameAssignment_1 ) ) ;
    public final void rule__Mixer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:745:1: ( ( ( rule__Mixer__NameAssignment_1 ) ) )
            // InternalOrch8.g:746:1: ( ( rule__Mixer__NameAssignment_1 ) )
            {
            // InternalOrch8.g:746:1: ( ( rule__Mixer__NameAssignment_1 ) )
            // InternalOrch8.g:747:2: ( rule__Mixer__NameAssignment_1 )
            {
             before(grammarAccess.getMixerAccess().getNameAssignment_1()); 
            // InternalOrch8.g:748:2: ( rule__Mixer__NameAssignment_1 )
            // InternalOrch8.g:748:3: rule__Mixer__NameAssignment_1
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
    // InternalOrch8.g:756:1: rule__Mixer__Group__2 : rule__Mixer__Group__2__Impl rule__Mixer__Group__3 ;
    public final void rule__Mixer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:760:1: ( rule__Mixer__Group__2__Impl rule__Mixer__Group__3 )
            // InternalOrch8.g:761:2: rule__Mixer__Group__2__Impl rule__Mixer__Group__3
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
    // InternalOrch8.g:768:1: rule__Mixer__Group__2__Impl : ( '{' ) ;
    public final void rule__Mixer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:772:1: ( ( '{' ) )
            // InternalOrch8.g:773:1: ( '{' )
            {
            // InternalOrch8.g:773:1: ( '{' )
            // InternalOrch8.g:774:2: '{'
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
    // InternalOrch8.g:783:1: rule__Mixer__Group__3 : rule__Mixer__Group__3__Impl rule__Mixer__Group__4 ;
    public final void rule__Mixer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:787:1: ( rule__Mixer__Group__3__Impl rule__Mixer__Group__4 )
            // InternalOrch8.g:788:2: rule__Mixer__Group__3__Impl rule__Mixer__Group__4
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
    // InternalOrch8.g:795:1: rule__Mixer__Group__3__Impl : ( ( rule__Mixer__Group_3__0 )? ) ;
    public final void rule__Mixer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:799:1: ( ( ( rule__Mixer__Group_3__0 )? ) )
            // InternalOrch8.g:800:1: ( ( rule__Mixer__Group_3__0 )? )
            {
            // InternalOrch8.g:800:1: ( ( rule__Mixer__Group_3__0 )? )
            // InternalOrch8.g:801:2: ( rule__Mixer__Group_3__0 )?
            {
             before(grammarAccess.getMixerAccess().getGroup_3()); 
            // InternalOrch8.g:802:2: ( rule__Mixer__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOrch8.g:802:3: rule__Mixer__Group_3__0
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
    // InternalOrch8.g:810:1: rule__Mixer__Group__4 : rule__Mixer__Group__4__Impl rule__Mixer__Group__5 ;
    public final void rule__Mixer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:814:1: ( rule__Mixer__Group__4__Impl rule__Mixer__Group__5 )
            // InternalOrch8.g:815:2: rule__Mixer__Group__4__Impl rule__Mixer__Group__5
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
    // InternalOrch8.g:822:1: rule__Mixer__Group__4__Impl : ( 'scores' ) ;
    public final void rule__Mixer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:826:1: ( ( 'scores' ) )
            // InternalOrch8.g:827:1: ( 'scores' )
            {
            // InternalOrch8.g:827:1: ( 'scores' )
            // InternalOrch8.g:828:2: 'scores'
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
    // InternalOrch8.g:837:1: rule__Mixer__Group__5 : rule__Mixer__Group__5__Impl rule__Mixer__Group__6 ;
    public final void rule__Mixer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:841:1: ( rule__Mixer__Group__5__Impl rule__Mixer__Group__6 )
            // InternalOrch8.g:842:2: rule__Mixer__Group__5__Impl rule__Mixer__Group__6
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
    // InternalOrch8.g:849:1: rule__Mixer__Group__5__Impl : ( '{' ) ;
    public final void rule__Mixer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:853:1: ( ( '{' ) )
            // InternalOrch8.g:854:1: ( '{' )
            {
            // InternalOrch8.g:854:1: ( '{' )
            // InternalOrch8.g:855:2: '{'
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
    // InternalOrch8.g:864:1: rule__Mixer__Group__6 : rule__Mixer__Group__6__Impl rule__Mixer__Group__7 ;
    public final void rule__Mixer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:868:1: ( rule__Mixer__Group__6__Impl rule__Mixer__Group__7 )
            // InternalOrch8.g:869:2: rule__Mixer__Group__6__Impl rule__Mixer__Group__7
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
    // InternalOrch8.g:876:1: rule__Mixer__Group__6__Impl : ( ( rule__Mixer__ScoresAssignment_6 ) ) ;
    public final void rule__Mixer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:880:1: ( ( ( rule__Mixer__ScoresAssignment_6 ) ) )
            // InternalOrch8.g:881:1: ( ( rule__Mixer__ScoresAssignment_6 ) )
            {
            // InternalOrch8.g:881:1: ( ( rule__Mixer__ScoresAssignment_6 ) )
            // InternalOrch8.g:882:2: ( rule__Mixer__ScoresAssignment_6 )
            {
             before(grammarAccess.getMixerAccess().getScoresAssignment_6()); 
            // InternalOrch8.g:883:2: ( rule__Mixer__ScoresAssignment_6 )
            // InternalOrch8.g:883:3: rule__Mixer__ScoresAssignment_6
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
    // InternalOrch8.g:891:1: rule__Mixer__Group__7 : rule__Mixer__Group__7__Impl rule__Mixer__Group__8 ;
    public final void rule__Mixer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:895:1: ( rule__Mixer__Group__7__Impl rule__Mixer__Group__8 )
            // InternalOrch8.g:896:2: rule__Mixer__Group__7__Impl rule__Mixer__Group__8
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
    // InternalOrch8.g:903:1: rule__Mixer__Group__7__Impl : ( ( rule__Mixer__Group_7__0 )* ) ;
    public final void rule__Mixer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:907:1: ( ( ( rule__Mixer__Group_7__0 )* ) )
            // InternalOrch8.g:908:1: ( ( rule__Mixer__Group_7__0 )* )
            {
            // InternalOrch8.g:908:1: ( ( rule__Mixer__Group_7__0 )* )
            // InternalOrch8.g:909:2: ( rule__Mixer__Group_7__0 )*
            {
             before(grammarAccess.getMixerAccess().getGroup_7()); 
            // InternalOrch8.g:910:2: ( rule__Mixer__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOrch8.g:910:3: rule__Mixer__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Mixer__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalOrch8.g:918:1: rule__Mixer__Group__8 : rule__Mixer__Group__8__Impl rule__Mixer__Group__9 ;
    public final void rule__Mixer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:922:1: ( rule__Mixer__Group__8__Impl rule__Mixer__Group__9 )
            // InternalOrch8.g:923:2: rule__Mixer__Group__8__Impl rule__Mixer__Group__9
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
    // InternalOrch8.g:930:1: rule__Mixer__Group__8__Impl : ( '}' ) ;
    public final void rule__Mixer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:934:1: ( ( '}' ) )
            // InternalOrch8.g:935:1: ( '}' )
            {
            // InternalOrch8.g:935:1: ( '}' )
            // InternalOrch8.g:936:2: '}'
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
    // InternalOrch8.g:945:1: rule__Mixer__Group__9 : rule__Mixer__Group__9__Impl ;
    public final void rule__Mixer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:949:1: ( rule__Mixer__Group__9__Impl )
            // InternalOrch8.g:950:2: rule__Mixer__Group__9__Impl
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
    // InternalOrch8.g:956:1: rule__Mixer__Group__9__Impl : ( '}' ) ;
    public final void rule__Mixer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:960:1: ( ( '}' ) )
            // InternalOrch8.g:961:1: ( '}' )
            {
            // InternalOrch8.g:961:1: ( '}' )
            // InternalOrch8.g:962:2: '}'
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
    // InternalOrch8.g:972:1: rule__Mixer__Group_3__0 : rule__Mixer__Group_3__0__Impl rule__Mixer__Group_3__1 ;
    public final void rule__Mixer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:976:1: ( rule__Mixer__Group_3__0__Impl rule__Mixer__Group_3__1 )
            // InternalOrch8.g:977:2: rule__Mixer__Group_3__0__Impl rule__Mixer__Group_3__1
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
    // InternalOrch8.g:984:1: rule__Mixer__Group_3__0__Impl : ( 'sampling_rate' ) ;
    public final void rule__Mixer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:988:1: ( ( 'sampling_rate' ) )
            // InternalOrch8.g:989:1: ( 'sampling_rate' )
            {
            // InternalOrch8.g:989:1: ( 'sampling_rate' )
            // InternalOrch8.g:990:2: 'sampling_rate'
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
    // InternalOrch8.g:999:1: rule__Mixer__Group_3__1 : rule__Mixer__Group_3__1__Impl ;
    public final void rule__Mixer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1003:1: ( rule__Mixer__Group_3__1__Impl )
            // InternalOrch8.g:1004:2: rule__Mixer__Group_3__1__Impl
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
    // InternalOrch8.g:1010:1: rule__Mixer__Group_3__1__Impl : ( ( rule__Mixer__Sampling_rateAssignment_3_1 ) ) ;
    public final void rule__Mixer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1014:1: ( ( ( rule__Mixer__Sampling_rateAssignment_3_1 ) ) )
            // InternalOrch8.g:1015:1: ( ( rule__Mixer__Sampling_rateAssignment_3_1 ) )
            {
            // InternalOrch8.g:1015:1: ( ( rule__Mixer__Sampling_rateAssignment_3_1 ) )
            // InternalOrch8.g:1016:2: ( rule__Mixer__Sampling_rateAssignment_3_1 )
            {
             before(grammarAccess.getMixerAccess().getSampling_rateAssignment_3_1()); 
            // InternalOrch8.g:1017:2: ( rule__Mixer__Sampling_rateAssignment_3_1 )
            // InternalOrch8.g:1017:3: rule__Mixer__Sampling_rateAssignment_3_1
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
    // InternalOrch8.g:1026:1: rule__Mixer__Group_7__0 : rule__Mixer__Group_7__0__Impl rule__Mixer__Group_7__1 ;
    public final void rule__Mixer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1030:1: ( rule__Mixer__Group_7__0__Impl rule__Mixer__Group_7__1 )
            // InternalOrch8.g:1031:2: rule__Mixer__Group_7__0__Impl rule__Mixer__Group_7__1
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
    // InternalOrch8.g:1038:1: rule__Mixer__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Mixer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1042:1: ( ( ',' ) )
            // InternalOrch8.g:1043:1: ( ',' )
            {
            // InternalOrch8.g:1043:1: ( ',' )
            // InternalOrch8.g:1044:2: ','
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
    // InternalOrch8.g:1053:1: rule__Mixer__Group_7__1 : rule__Mixer__Group_7__1__Impl ;
    public final void rule__Mixer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1057:1: ( rule__Mixer__Group_7__1__Impl )
            // InternalOrch8.g:1058:2: rule__Mixer__Group_7__1__Impl
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
    // InternalOrch8.g:1064:1: rule__Mixer__Group_7__1__Impl : ( ( rule__Mixer__ScoresAssignment_7_1 ) ) ;
    public final void rule__Mixer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1068:1: ( ( ( rule__Mixer__ScoresAssignment_7_1 ) ) )
            // InternalOrch8.g:1069:1: ( ( rule__Mixer__ScoresAssignment_7_1 ) )
            {
            // InternalOrch8.g:1069:1: ( ( rule__Mixer__ScoresAssignment_7_1 ) )
            // InternalOrch8.g:1070:2: ( rule__Mixer__ScoresAssignment_7_1 )
            {
             before(grammarAccess.getMixerAccess().getScoresAssignment_7_1()); 
            // InternalOrch8.g:1071:2: ( rule__Mixer__ScoresAssignment_7_1 )
            // InternalOrch8.g:1071:3: rule__Mixer__ScoresAssignment_7_1
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
    // InternalOrch8.g:1080:1: rule__Score__Group__0 : rule__Score__Group__0__Impl rule__Score__Group__1 ;
    public final void rule__Score__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1084:1: ( rule__Score__Group__0__Impl rule__Score__Group__1 )
            // InternalOrch8.g:1085:2: rule__Score__Group__0__Impl rule__Score__Group__1
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
    // InternalOrch8.g:1092:1: rule__Score__Group__0__Impl : ( 'Score' ) ;
    public final void rule__Score__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1096:1: ( ( 'Score' ) )
            // InternalOrch8.g:1097:1: ( 'Score' )
            {
            // InternalOrch8.g:1097:1: ( 'Score' )
            // InternalOrch8.g:1098:2: 'Score'
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
    // InternalOrch8.g:1107:1: rule__Score__Group__1 : rule__Score__Group__1__Impl rule__Score__Group__2 ;
    public final void rule__Score__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1111:1: ( rule__Score__Group__1__Impl rule__Score__Group__2 )
            // InternalOrch8.g:1112:2: rule__Score__Group__1__Impl rule__Score__Group__2
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
    // InternalOrch8.g:1119:1: rule__Score__Group__1__Impl : ( ( rule__Score__NameAssignment_1 ) ) ;
    public final void rule__Score__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1123:1: ( ( ( rule__Score__NameAssignment_1 ) ) )
            // InternalOrch8.g:1124:1: ( ( rule__Score__NameAssignment_1 ) )
            {
            // InternalOrch8.g:1124:1: ( ( rule__Score__NameAssignment_1 ) )
            // InternalOrch8.g:1125:2: ( rule__Score__NameAssignment_1 )
            {
             before(grammarAccess.getScoreAccess().getNameAssignment_1()); 
            // InternalOrch8.g:1126:2: ( rule__Score__NameAssignment_1 )
            // InternalOrch8.g:1126:3: rule__Score__NameAssignment_1
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
    // InternalOrch8.g:1134:1: rule__Score__Group__2 : rule__Score__Group__2__Impl rule__Score__Group__3 ;
    public final void rule__Score__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1138:1: ( rule__Score__Group__2__Impl rule__Score__Group__3 )
            // InternalOrch8.g:1139:2: rule__Score__Group__2__Impl rule__Score__Group__3
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
    // InternalOrch8.g:1146:1: rule__Score__Group__2__Impl : ( '{' ) ;
    public final void rule__Score__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1150:1: ( ( '{' ) )
            // InternalOrch8.g:1151:1: ( '{' )
            {
            // InternalOrch8.g:1151:1: ( '{' )
            // InternalOrch8.g:1152:2: '{'
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
    // InternalOrch8.g:1161:1: rule__Score__Group__3 : rule__Score__Group__3__Impl rule__Score__Group__4 ;
    public final void rule__Score__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1165:1: ( rule__Score__Group__3__Impl rule__Score__Group__4 )
            // InternalOrch8.g:1166:2: rule__Score__Group__3__Impl rule__Score__Group__4
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
    // InternalOrch8.g:1173:1: rule__Score__Group__3__Impl : ( ( rule__Score__Group_3__0 )? ) ;
    public final void rule__Score__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1177:1: ( ( ( rule__Score__Group_3__0 )? ) )
            // InternalOrch8.g:1178:1: ( ( rule__Score__Group_3__0 )? )
            {
            // InternalOrch8.g:1178:1: ( ( rule__Score__Group_3__0 )? )
            // InternalOrch8.g:1179:2: ( rule__Score__Group_3__0 )?
            {
             before(grammarAccess.getScoreAccess().getGroup_3()); 
            // InternalOrch8.g:1180:2: ( rule__Score__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOrch8.g:1180:3: rule__Score__Group_3__0
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
    // InternalOrch8.g:1188:1: rule__Score__Group__4 : rule__Score__Group__4__Impl rule__Score__Group__5 ;
    public final void rule__Score__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1192:1: ( rule__Score__Group__4__Impl rule__Score__Group__5 )
            // InternalOrch8.g:1193:2: rule__Score__Group__4__Impl rule__Score__Group__5
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
    // InternalOrch8.g:1200:1: rule__Score__Group__4__Impl : ( ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* ) ) ;
    public final void rule__Score__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1204:1: ( ( ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* ) ) )
            // InternalOrch8.g:1205:1: ( ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* ) )
            {
            // InternalOrch8.g:1205:1: ( ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* ) )
            // InternalOrch8.g:1206:2: ( ( rule__Score__MeasuresAssignment_4 ) ) ( ( rule__Score__MeasuresAssignment_4 )* )
            {
            // InternalOrch8.g:1206:2: ( ( rule__Score__MeasuresAssignment_4 ) )
            // InternalOrch8.g:1207:3: ( rule__Score__MeasuresAssignment_4 )
            {
             before(grammarAccess.getScoreAccess().getMeasuresAssignment_4()); 
            // InternalOrch8.g:1208:3: ( rule__Score__MeasuresAssignment_4 )
            // InternalOrch8.g:1208:4: rule__Score__MeasuresAssignment_4
            {
            pushFollow(FOLLOW_15);
            rule__Score__MeasuresAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScoreAccess().getMeasuresAssignment_4()); 

            }

            // InternalOrch8.g:1211:2: ( ( rule__Score__MeasuresAssignment_4 )* )
            // InternalOrch8.g:1212:3: ( rule__Score__MeasuresAssignment_4 )*
            {
             before(grammarAccess.getScoreAccess().getMeasuresAssignment_4()); 
            // InternalOrch8.g:1213:3: ( rule__Score__MeasuresAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOrch8.g:1213:4: rule__Score__MeasuresAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Score__MeasuresAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalOrch8.g:1222:1: rule__Score__Group__5 : rule__Score__Group__5__Impl rule__Score__Group__6 ;
    public final void rule__Score__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1226:1: ( rule__Score__Group__5__Impl rule__Score__Group__6 )
            // InternalOrch8.g:1227:2: rule__Score__Group__5__Impl rule__Score__Group__6
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
    // InternalOrch8.g:1234:1: rule__Score__Group__5__Impl : ( ( rule__Score__Group_5__0 )? ) ;
    public final void rule__Score__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1238:1: ( ( ( rule__Score__Group_5__0 )? ) )
            // InternalOrch8.g:1239:1: ( ( rule__Score__Group_5__0 )? )
            {
            // InternalOrch8.g:1239:1: ( ( rule__Score__Group_5__0 )? )
            // InternalOrch8.g:1240:2: ( rule__Score__Group_5__0 )?
            {
             before(grammarAccess.getScoreAccess().getGroup_5()); 
            // InternalOrch8.g:1241:2: ( rule__Score__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOrch8.g:1241:3: rule__Score__Group_5__0
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
    // InternalOrch8.g:1249:1: rule__Score__Group__6 : rule__Score__Group__6__Impl ;
    public final void rule__Score__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1253:1: ( rule__Score__Group__6__Impl )
            // InternalOrch8.g:1254:2: rule__Score__Group__6__Impl
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
    // InternalOrch8.g:1260:1: rule__Score__Group__6__Impl : ( '}' ) ;
    public final void rule__Score__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1264:1: ( ( '}' ) )
            // InternalOrch8.g:1265:1: ( '}' )
            {
            // InternalOrch8.g:1265:1: ( '}' )
            // InternalOrch8.g:1266:2: '}'
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
    // InternalOrch8.g:1276:1: rule__Score__Group_3__0 : rule__Score__Group_3__0__Impl rule__Score__Group_3__1 ;
    public final void rule__Score__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1280:1: ( rule__Score__Group_3__0__Impl rule__Score__Group_3__1 )
            // InternalOrch8.g:1281:2: rule__Score__Group_3__0__Impl rule__Score__Group_3__1
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
    // InternalOrch8.g:1288:1: rule__Score__Group_3__0__Impl : ( '@Setup' ) ;
    public final void rule__Score__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1292:1: ( ( '@Setup' ) )
            // InternalOrch8.g:1293:1: ( '@Setup' )
            {
            // InternalOrch8.g:1293:1: ( '@Setup' )
            // InternalOrch8.g:1294:2: '@Setup'
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
    // InternalOrch8.g:1303:1: rule__Score__Group_3__1 : rule__Score__Group_3__1__Impl ;
    public final void rule__Score__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1307:1: ( rule__Score__Group_3__1__Impl )
            // InternalOrch8.g:1308:2: rule__Score__Group_3__1__Impl
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
    // InternalOrch8.g:1314:1: rule__Score__Group_3__1__Impl : ( ( rule__Score__SetupAssignment_3_1 )* ) ;
    public final void rule__Score__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1318:1: ( ( ( rule__Score__SetupAssignment_3_1 )* ) )
            // InternalOrch8.g:1319:1: ( ( rule__Score__SetupAssignment_3_1 )* )
            {
            // InternalOrch8.g:1319:1: ( ( rule__Score__SetupAssignment_3_1 )* )
            // InternalOrch8.g:1320:2: ( rule__Score__SetupAssignment_3_1 )*
            {
             before(grammarAccess.getScoreAccess().getSetupAssignment_3_1()); 
            // InternalOrch8.g:1321:2: ( rule__Score__SetupAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=32 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOrch8.g:1321:3: rule__Score__SetupAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Score__SetupAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalOrch8.g:1330:1: rule__Score__Group_5__0 : rule__Score__Group_5__0__Impl rule__Score__Group_5__1 ;
    public final void rule__Score__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1334:1: ( rule__Score__Group_5__0__Impl rule__Score__Group_5__1 )
            // InternalOrch8.g:1335:2: rule__Score__Group_5__0__Impl rule__Score__Group_5__1
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
    // InternalOrch8.g:1342:1: rule__Score__Group_5__0__Impl : ( '@End' ) ;
    public final void rule__Score__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1346:1: ( ( '@End' ) )
            // InternalOrch8.g:1347:1: ( '@End' )
            {
            // InternalOrch8.g:1347:1: ( '@End' )
            // InternalOrch8.g:1348:2: '@End'
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
    // InternalOrch8.g:1357:1: rule__Score__Group_5__1 : rule__Score__Group_5__1__Impl ;
    public final void rule__Score__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1361:1: ( rule__Score__Group_5__1__Impl )
            // InternalOrch8.g:1362:2: rule__Score__Group_5__1__Impl
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
    // InternalOrch8.g:1368:1: rule__Score__Group_5__1__Impl : ( ( rule__Score__EndAssignment_5_1 )* ) ;
    public final void rule__Score__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1372:1: ( ( ( rule__Score__EndAssignment_5_1 )* ) )
            // InternalOrch8.g:1373:1: ( ( rule__Score__EndAssignment_5_1 )* )
            {
            // InternalOrch8.g:1373:1: ( ( rule__Score__EndAssignment_5_1 )* )
            // InternalOrch8.g:1374:2: ( rule__Score__EndAssignment_5_1 )*
            {
             before(grammarAccess.getScoreAccess().getEndAssignment_5_1()); 
            // InternalOrch8.g:1375:2: ( rule__Score__EndAssignment_5_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=32 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOrch8.g:1375:3: rule__Score__EndAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Score__EndAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalOrch8.g:1384:1: rule__Instrument__Group__0 : rule__Instrument__Group__0__Impl rule__Instrument__Group__1 ;
    public final void rule__Instrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1388:1: ( rule__Instrument__Group__0__Impl rule__Instrument__Group__1 )
            // InternalOrch8.g:1389:2: rule__Instrument__Group__0__Impl rule__Instrument__Group__1
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
    // InternalOrch8.g:1396:1: rule__Instrument__Group__0__Impl : ( 'Instrument' ) ;
    public final void rule__Instrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1400:1: ( ( 'Instrument' ) )
            // InternalOrch8.g:1401:1: ( 'Instrument' )
            {
            // InternalOrch8.g:1401:1: ( 'Instrument' )
            // InternalOrch8.g:1402:2: 'Instrument'
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
    // InternalOrch8.g:1411:1: rule__Instrument__Group__1 : rule__Instrument__Group__1__Impl rule__Instrument__Group__2 ;
    public final void rule__Instrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1415:1: ( rule__Instrument__Group__1__Impl rule__Instrument__Group__2 )
            // InternalOrch8.g:1416:2: rule__Instrument__Group__1__Impl rule__Instrument__Group__2
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
    // InternalOrch8.g:1423:1: rule__Instrument__Group__1__Impl : ( ( rule__Instrument__NameAssignment_1 ) ) ;
    public final void rule__Instrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1427:1: ( ( ( rule__Instrument__NameAssignment_1 ) ) )
            // InternalOrch8.g:1428:1: ( ( rule__Instrument__NameAssignment_1 ) )
            {
            // InternalOrch8.g:1428:1: ( ( rule__Instrument__NameAssignment_1 ) )
            // InternalOrch8.g:1429:2: ( rule__Instrument__NameAssignment_1 )
            {
             before(grammarAccess.getInstrumentAccess().getNameAssignment_1()); 
            // InternalOrch8.g:1430:2: ( rule__Instrument__NameAssignment_1 )
            // InternalOrch8.g:1430:3: rule__Instrument__NameAssignment_1
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
    // InternalOrch8.g:1438:1: rule__Instrument__Group__2 : rule__Instrument__Group__2__Impl rule__Instrument__Group__3 ;
    public final void rule__Instrument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1442:1: ( rule__Instrument__Group__2__Impl rule__Instrument__Group__3 )
            // InternalOrch8.g:1443:2: rule__Instrument__Group__2__Impl rule__Instrument__Group__3
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
    // InternalOrch8.g:1450:1: rule__Instrument__Group__2__Impl : ( '{' ) ;
    public final void rule__Instrument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1454:1: ( ( '{' ) )
            // InternalOrch8.g:1455:1: ( '{' )
            {
            // InternalOrch8.g:1455:1: ( '{' )
            // InternalOrch8.g:1456:2: '{'
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
    // InternalOrch8.g:1465:1: rule__Instrument__Group__3 : rule__Instrument__Group__3__Impl rule__Instrument__Group__4 ;
    public final void rule__Instrument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1469:1: ( rule__Instrument__Group__3__Impl rule__Instrument__Group__4 )
            // InternalOrch8.g:1470:2: rule__Instrument__Group__3__Impl rule__Instrument__Group__4
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
    // InternalOrch8.g:1477:1: rule__Instrument__Group__3__Impl : ( ( rule__Instrument__GeneratorAssignment_3 ) ) ;
    public final void rule__Instrument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1481:1: ( ( ( rule__Instrument__GeneratorAssignment_3 ) ) )
            // InternalOrch8.g:1482:1: ( ( rule__Instrument__GeneratorAssignment_3 ) )
            {
            // InternalOrch8.g:1482:1: ( ( rule__Instrument__GeneratorAssignment_3 ) )
            // InternalOrch8.g:1483:2: ( rule__Instrument__GeneratorAssignment_3 )
            {
             before(grammarAccess.getInstrumentAccess().getGeneratorAssignment_3()); 
            // InternalOrch8.g:1484:2: ( rule__Instrument__GeneratorAssignment_3 )
            // InternalOrch8.g:1484:3: rule__Instrument__GeneratorAssignment_3
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
    // InternalOrch8.g:1492:1: rule__Instrument__Group__4 : rule__Instrument__Group__4__Impl rule__Instrument__Group__5 ;
    public final void rule__Instrument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1496:1: ( rule__Instrument__Group__4__Impl rule__Instrument__Group__5 )
            // InternalOrch8.g:1497:2: rule__Instrument__Group__4__Impl rule__Instrument__Group__5
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
    // InternalOrch8.g:1504:1: rule__Instrument__Group__4__Impl : ( ( rule__Instrument__ParametersAssignment_4 )* ) ;
    public final void rule__Instrument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1508:1: ( ( ( rule__Instrument__ParametersAssignment_4 )* ) )
            // InternalOrch8.g:1509:1: ( ( rule__Instrument__ParametersAssignment_4 )* )
            {
            // InternalOrch8.g:1509:1: ( ( rule__Instrument__ParametersAssignment_4 )* )
            // InternalOrch8.g:1510:2: ( rule__Instrument__ParametersAssignment_4 )*
            {
             before(grammarAccess.getInstrumentAccess().getParametersAssignment_4()); 
            // InternalOrch8.g:1511:2: ( rule__Instrument__ParametersAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOrch8.g:1511:3: rule__Instrument__ParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Instrument__ParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalOrch8.g:1519:1: rule__Instrument__Group__5 : rule__Instrument__Group__5__Impl ;
    public final void rule__Instrument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1523:1: ( rule__Instrument__Group__5__Impl )
            // InternalOrch8.g:1524:2: rule__Instrument__Group__5__Impl
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
    // InternalOrch8.g:1530:1: rule__Instrument__Group__5__Impl : ( '}' ) ;
    public final void rule__Instrument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1534:1: ( ( '}' ) )
            // InternalOrch8.g:1535:1: ( '}' )
            {
            // InternalOrch8.g:1535:1: ( '}' )
            // InternalOrch8.g:1536:2: '}'
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
    // InternalOrch8.g:1546:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1550:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalOrch8.g:1551:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalOrch8.g:1558:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1562:1: ( ( ( '-' )? ) )
            // InternalOrch8.g:1563:1: ( ( '-' )? )
            {
            // InternalOrch8.g:1563:1: ( ( '-' )? )
            // InternalOrch8.g:1564:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalOrch8.g:1565:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOrch8.g:1565:3: '-'
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
    // InternalOrch8.g:1573:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1577:1: ( rule__EInt__Group__1__Impl )
            // InternalOrch8.g:1578:2: rule__EInt__Group__1__Impl
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
    // InternalOrch8.g:1584:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1588:1: ( ( RULE_INT ) )
            // InternalOrch8.g:1589:1: ( RULE_INT )
            {
            // InternalOrch8.g:1589:1: ( RULE_INT )
            // InternalOrch8.g:1590:2: RULE_INT
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
    // InternalOrch8.g:1600:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1604:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalOrch8.g:1605:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalOrch8.g:1612:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1616:1: ( ( ( '-' )? ) )
            // InternalOrch8.g:1617:1: ( ( '-' )? )
            {
            // InternalOrch8.g:1617:1: ( ( '-' )? )
            // InternalOrch8.g:1618:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalOrch8.g:1619:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOrch8.g:1619:3: '-'
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
    // InternalOrch8.g:1627:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1631:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalOrch8.g:1632:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalOrch8.g:1639:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1643:1: ( ( ( RULE_INT )? ) )
            // InternalOrch8.g:1644:1: ( ( RULE_INT )? )
            {
            // InternalOrch8.g:1644:1: ( ( RULE_INT )? )
            // InternalOrch8.g:1645:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalOrch8.g:1646:2: ( RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOrch8.g:1646:3: RULE_INT
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
    // InternalOrch8.g:1654:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1658:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalOrch8.g:1659:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
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
    // InternalOrch8.g:1666:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1670:1: ( ( '.' ) )
            // InternalOrch8.g:1671:1: ( '.' )
            {
            // InternalOrch8.g:1671:1: ( '.' )
            // InternalOrch8.g:1672:2: '.'
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
    // InternalOrch8.g:1681:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1685:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalOrch8.g:1686:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
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
    // InternalOrch8.g:1693:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1697:1: ( ( RULE_INT ) )
            // InternalOrch8.g:1698:1: ( RULE_INT )
            {
            // InternalOrch8.g:1698:1: ( RULE_INT )
            // InternalOrch8.g:1699:2: RULE_INT
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
    // InternalOrch8.g:1708:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1712:1: ( rule__EDouble__Group__4__Impl )
            // InternalOrch8.g:1713:2: rule__EDouble__Group__4__Impl
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
    // InternalOrch8.g:1719:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1723:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalOrch8.g:1724:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalOrch8.g:1724:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalOrch8.g:1725:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalOrch8.g:1726:2: ( rule__EDouble__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=12 && LA20_0<=13)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOrch8.g:1726:3: rule__EDouble__Group_4__0
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
    // InternalOrch8.g:1735:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1739:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalOrch8.g:1740:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
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
    // InternalOrch8.g:1747:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1751:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalOrch8.g:1752:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalOrch8.g:1752:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalOrch8.g:1753:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalOrch8.g:1754:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalOrch8.g:1754:3: rule__EDouble__Alternatives_4_0
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
    // InternalOrch8.g:1762:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1766:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalOrch8.g:1767:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
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
    // InternalOrch8.g:1774:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1778:1: ( ( ( '-' )? ) )
            // InternalOrch8.g:1779:1: ( ( '-' )? )
            {
            // InternalOrch8.g:1779:1: ( ( '-' )? )
            // InternalOrch8.g:1780:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalOrch8.g:1781:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOrch8.g:1781:3: '-'
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
    // InternalOrch8.g:1789:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1793:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalOrch8.g:1794:2: rule__EDouble__Group_4__2__Impl
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
    // InternalOrch8.g:1800:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1804:1: ( ( RULE_INT ) )
            // InternalOrch8.g:1805:1: ( RULE_INT )
            {
            // InternalOrch8.g:1805:1: ( RULE_INT )
            // InternalOrch8.g:1806:2: RULE_INT
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
    // InternalOrch8.g:1816:1: rule__Measure__Group__0 : rule__Measure__Group__0__Impl rule__Measure__Group__1 ;
    public final void rule__Measure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1820:1: ( rule__Measure__Group__0__Impl rule__Measure__Group__1 )
            // InternalOrch8.g:1821:2: rule__Measure__Group__0__Impl rule__Measure__Group__1
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
    // InternalOrch8.g:1828:1: rule__Measure__Group__0__Impl : ( () ) ;
    public final void rule__Measure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1832:1: ( ( () ) )
            // InternalOrch8.g:1833:1: ( () )
            {
            // InternalOrch8.g:1833:1: ( () )
            // InternalOrch8.g:1834:2: ()
            {
             before(grammarAccess.getMeasureAccess().getMeasureAction_0()); 
            // InternalOrch8.g:1835:2: ()
            // InternalOrch8.g:1835:3: 
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
    // InternalOrch8.g:1843:1: rule__Measure__Group__1 : rule__Measure__Group__1__Impl rule__Measure__Group__2 ;
    public final void rule__Measure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1847:1: ( rule__Measure__Group__1__Impl rule__Measure__Group__2 )
            // InternalOrch8.g:1848:2: rule__Measure__Group__1__Impl rule__Measure__Group__2
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
    // InternalOrch8.g:1855:1: rule__Measure__Group__1__Impl : ( '@' ) ;
    public final void rule__Measure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1859:1: ( ( '@' ) )
            // InternalOrch8.g:1860:1: ( '@' )
            {
            // InternalOrch8.g:1860:1: ( '@' )
            // InternalOrch8.g:1861:2: '@'
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
    // InternalOrch8.g:1870:1: rule__Measure__Group__2 : rule__Measure__Group__2__Impl rule__Measure__Group__3 ;
    public final void rule__Measure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1874:1: ( rule__Measure__Group__2__Impl rule__Measure__Group__3 )
            // InternalOrch8.g:1875:2: rule__Measure__Group__2__Impl rule__Measure__Group__3
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
    // InternalOrch8.g:1882:1: rule__Measure__Group__2__Impl : ( ( rule__Measure__IDAssignment_2 ) ) ;
    public final void rule__Measure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1886:1: ( ( ( rule__Measure__IDAssignment_2 ) ) )
            // InternalOrch8.g:1887:1: ( ( rule__Measure__IDAssignment_2 ) )
            {
            // InternalOrch8.g:1887:1: ( ( rule__Measure__IDAssignment_2 ) )
            // InternalOrch8.g:1888:2: ( rule__Measure__IDAssignment_2 )
            {
             before(grammarAccess.getMeasureAccess().getIDAssignment_2()); 
            // InternalOrch8.g:1889:2: ( rule__Measure__IDAssignment_2 )
            // InternalOrch8.g:1889:3: rule__Measure__IDAssignment_2
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
    // InternalOrch8.g:1897:1: rule__Measure__Group__3 : rule__Measure__Group__3__Impl ;
    public final void rule__Measure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1901:1: ( rule__Measure__Group__3__Impl )
            // InternalOrch8.g:1902:2: rule__Measure__Group__3__Impl
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
    // InternalOrch8.g:1908:1: rule__Measure__Group__3__Impl : ( ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* ) ) ;
    public final void rule__Measure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1912:1: ( ( ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* ) ) )
            // InternalOrch8.g:1913:1: ( ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* ) )
            {
            // InternalOrch8.g:1913:1: ( ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* ) )
            // InternalOrch8.g:1914:2: ( ( rule__Measure__BeatsAssignment_3 ) ) ( ( rule__Measure__BeatsAssignment_3 )* )
            {
            // InternalOrch8.g:1914:2: ( ( rule__Measure__BeatsAssignment_3 ) )
            // InternalOrch8.g:1915:3: ( rule__Measure__BeatsAssignment_3 )
            {
             before(grammarAccess.getMeasureAccess().getBeatsAssignment_3()); 
            // InternalOrch8.g:1916:3: ( rule__Measure__BeatsAssignment_3 )
            // InternalOrch8.g:1916:4: rule__Measure__BeatsAssignment_3
            {
            pushFollow(FOLLOW_25);
            rule__Measure__BeatsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeasureAccess().getBeatsAssignment_3()); 

            }

            // InternalOrch8.g:1919:2: ( ( rule__Measure__BeatsAssignment_3 )* )
            // InternalOrch8.g:1920:3: ( rule__Measure__BeatsAssignment_3 )*
            {
             before(grammarAccess.getMeasureAccess().getBeatsAssignment_3()); 
            // InternalOrch8.g:1921:3: ( rule__Measure__BeatsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOrch8.g:1921:4: rule__Measure__BeatsAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Measure__BeatsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalOrch8.g:1931:1: rule__CmdInstrument__Group__0 : rule__CmdInstrument__Group__0__Impl rule__CmdInstrument__Group__1 ;
    public final void rule__CmdInstrument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1935:1: ( rule__CmdInstrument__Group__0__Impl rule__CmdInstrument__Group__1 )
            // InternalOrch8.g:1936:2: rule__CmdInstrument__Group__0__Impl rule__CmdInstrument__Group__1
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
    // InternalOrch8.g:1943:1: rule__CmdInstrument__Group__0__Impl : ( ( rule__CmdInstrument__TypeAssignment_0 ) ) ;
    public final void rule__CmdInstrument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1947:1: ( ( ( rule__CmdInstrument__TypeAssignment_0 ) ) )
            // InternalOrch8.g:1948:1: ( ( rule__CmdInstrument__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:1948:1: ( ( rule__CmdInstrument__TypeAssignment_0 ) )
            // InternalOrch8.g:1949:2: ( rule__CmdInstrument__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdInstrumentAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:1950:2: ( rule__CmdInstrument__TypeAssignment_0 )
            // InternalOrch8.g:1950:3: rule__CmdInstrument__TypeAssignment_0
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
    // InternalOrch8.g:1958:1: rule__CmdInstrument__Group__1 : rule__CmdInstrument__Group__1__Impl ;
    public final void rule__CmdInstrument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1962:1: ( rule__CmdInstrument__Group__1__Impl )
            // InternalOrch8.g:1963:2: rule__CmdInstrument__Group__1__Impl
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
    // InternalOrch8.g:1969:1: rule__CmdInstrument__Group__1__Impl : ( ( rule__CmdInstrument__ParameterAssignment_1 ) ) ;
    public final void rule__CmdInstrument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1973:1: ( ( ( rule__CmdInstrument__ParameterAssignment_1 ) ) )
            // InternalOrch8.g:1974:1: ( ( rule__CmdInstrument__ParameterAssignment_1 ) )
            {
            // InternalOrch8.g:1974:1: ( ( rule__CmdInstrument__ParameterAssignment_1 ) )
            // InternalOrch8.g:1975:2: ( rule__CmdInstrument__ParameterAssignment_1 )
            {
             before(grammarAccess.getCmdInstrumentAccess().getParameterAssignment_1()); 
            // InternalOrch8.g:1976:2: ( rule__CmdInstrument__ParameterAssignment_1 )
            // InternalOrch8.g:1976:3: rule__CmdInstrument__ParameterAssignment_1
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
    // InternalOrch8.g:1985:1: rule__CmdPlay__Group__0 : rule__CmdPlay__Group__0__Impl rule__CmdPlay__Group__1 ;
    public final void rule__CmdPlay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:1989:1: ( rule__CmdPlay__Group__0__Impl rule__CmdPlay__Group__1 )
            // InternalOrch8.g:1990:2: rule__CmdPlay__Group__0__Impl rule__CmdPlay__Group__1
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
    // InternalOrch8.g:1997:1: rule__CmdPlay__Group__0__Impl : ( ( rule__CmdPlay__TypeAssignment_0 ) ) ;
    public final void rule__CmdPlay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2001:1: ( ( ( rule__CmdPlay__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2002:1: ( ( rule__CmdPlay__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2002:1: ( ( rule__CmdPlay__TypeAssignment_0 ) )
            // InternalOrch8.g:2003:2: ( rule__CmdPlay__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdPlayAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2004:2: ( rule__CmdPlay__TypeAssignment_0 )
            // InternalOrch8.g:2004:3: rule__CmdPlay__TypeAssignment_0
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
    // InternalOrch8.g:2012:1: rule__CmdPlay__Group__1 : rule__CmdPlay__Group__1__Impl rule__CmdPlay__Group__2 ;
    public final void rule__CmdPlay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2016:1: ( rule__CmdPlay__Group__1__Impl rule__CmdPlay__Group__2 )
            // InternalOrch8.g:2017:2: rule__CmdPlay__Group__1__Impl rule__CmdPlay__Group__2
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
    // InternalOrch8.g:2024:1: rule__CmdPlay__Group__1__Impl : ( ( rule__CmdPlay__NoteAssignment_1 ) ) ;
    public final void rule__CmdPlay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2028:1: ( ( ( rule__CmdPlay__NoteAssignment_1 ) ) )
            // InternalOrch8.g:2029:1: ( ( rule__CmdPlay__NoteAssignment_1 ) )
            {
            // InternalOrch8.g:2029:1: ( ( rule__CmdPlay__NoteAssignment_1 ) )
            // InternalOrch8.g:2030:2: ( rule__CmdPlay__NoteAssignment_1 )
            {
             before(grammarAccess.getCmdPlayAccess().getNoteAssignment_1()); 
            // InternalOrch8.g:2031:2: ( rule__CmdPlay__NoteAssignment_1 )
            // InternalOrch8.g:2031:3: rule__CmdPlay__NoteAssignment_1
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
    // InternalOrch8.g:2039:1: rule__CmdPlay__Group__2 : rule__CmdPlay__Group__2__Impl rule__CmdPlay__Group__3 ;
    public final void rule__CmdPlay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2043:1: ( rule__CmdPlay__Group__2__Impl rule__CmdPlay__Group__3 )
            // InternalOrch8.g:2044:2: rule__CmdPlay__Group__2__Impl rule__CmdPlay__Group__3
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
    // InternalOrch8.g:2051:1: rule__CmdPlay__Group__2__Impl : ( 'length' ) ;
    public final void rule__CmdPlay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2055:1: ( ( 'length' ) )
            // InternalOrch8.g:2056:1: ( 'length' )
            {
            // InternalOrch8.g:2056:1: ( 'length' )
            // InternalOrch8.g:2057:2: 'length'
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
    // InternalOrch8.g:2066:1: rule__CmdPlay__Group__3 : rule__CmdPlay__Group__3__Impl ;
    public final void rule__CmdPlay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2070:1: ( rule__CmdPlay__Group__3__Impl )
            // InternalOrch8.g:2071:2: rule__CmdPlay__Group__3__Impl
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
    // InternalOrch8.g:2077:1: rule__CmdPlay__Group__3__Impl : ( ( rule__CmdPlay__LengthAssignment_3 ) ) ;
    public final void rule__CmdPlay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2081:1: ( ( ( rule__CmdPlay__LengthAssignment_3 ) ) )
            // InternalOrch8.g:2082:1: ( ( rule__CmdPlay__LengthAssignment_3 ) )
            {
            // InternalOrch8.g:2082:1: ( ( rule__CmdPlay__LengthAssignment_3 ) )
            // InternalOrch8.g:2083:2: ( rule__CmdPlay__LengthAssignment_3 )
            {
             before(grammarAccess.getCmdPlayAccess().getLengthAssignment_3()); 
            // InternalOrch8.g:2084:2: ( rule__CmdPlay__LengthAssignment_3 )
            // InternalOrch8.g:2084:3: rule__CmdPlay__LengthAssignment_3
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
    // InternalOrch8.g:2093:1: rule__CmdTempo__Group__0 : rule__CmdTempo__Group__0__Impl rule__CmdTempo__Group__1 ;
    public final void rule__CmdTempo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2097:1: ( rule__CmdTempo__Group__0__Impl rule__CmdTempo__Group__1 )
            // InternalOrch8.g:2098:2: rule__CmdTempo__Group__0__Impl rule__CmdTempo__Group__1
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
    // InternalOrch8.g:2105:1: rule__CmdTempo__Group__0__Impl : ( ( rule__CmdTempo__TypeAssignment_0 ) ) ;
    public final void rule__CmdTempo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2109:1: ( ( ( rule__CmdTempo__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2110:1: ( ( rule__CmdTempo__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2110:1: ( ( rule__CmdTempo__TypeAssignment_0 ) )
            // InternalOrch8.g:2111:2: ( rule__CmdTempo__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdTempoAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2112:2: ( rule__CmdTempo__TypeAssignment_0 )
            // InternalOrch8.g:2112:3: rule__CmdTempo__TypeAssignment_0
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
    // InternalOrch8.g:2120:1: rule__CmdTempo__Group__1 : rule__CmdTempo__Group__1__Impl ;
    public final void rule__CmdTempo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2124:1: ( rule__CmdTempo__Group__1__Impl )
            // InternalOrch8.g:2125:2: rule__CmdTempo__Group__1__Impl
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
    // InternalOrch8.g:2131:1: rule__CmdTempo__Group__1__Impl : ( ( rule__CmdTempo__BpmAssignment_1 ) ) ;
    public final void rule__CmdTempo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2135:1: ( ( ( rule__CmdTempo__BpmAssignment_1 ) ) )
            // InternalOrch8.g:2136:1: ( ( rule__CmdTempo__BpmAssignment_1 ) )
            {
            // InternalOrch8.g:2136:1: ( ( rule__CmdTempo__BpmAssignment_1 ) )
            // InternalOrch8.g:2137:2: ( rule__CmdTempo__BpmAssignment_1 )
            {
             before(grammarAccess.getCmdTempoAccess().getBpmAssignment_1()); 
            // InternalOrch8.g:2138:2: ( rule__CmdTempo__BpmAssignment_1 )
            // InternalOrch8.g:2138:3: rule__CmdTempo__BpmAssignment_1
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
    // InternalOrch8.g:2147:1: rule__CmdTimeSignature__Group__0 : rule__CmdTimeSignature__Group__0__Impl rule__CmdTimeSignature__Group__1 ;
    public final void rule__CmdTimeSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2151:1: ( rule__CmdTimeSignature__Group__0__Impl rule__CmdTimeSignature__Group__1 )
            // InternalOrch8.g:2152:2: rule__CmdTimeSignature__Group__0__Impl rule__CmdTimeSignature__Group__1
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
    // InternalOrch8.g:2159:1: rule__CmdTimeSignature__Group__0__Impl : ( ( rule__CmdTimeSignature__TypeAssignment_0 ) ) ;
    public final void rule__CmdTimeSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2163:1: ( ( ( rule__CmdTimeSignature__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2164:1: ( ( rule__CmdTimeSignature__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2164:1: ( ( rule__CmdTimeSignature__TypeAssignment_0 ) )
            // InternalOrch8.g:2165:2: ( rule__CmdTimeSignature__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2166:2: ( rule__CmdTimeSignature__TypeAssignment_0 )
            // InternalOrch8.g:2166:3: rule__CmdTimeSignature__TypeAssignment_0
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
    // InternalOrch8.g:2174:1: rule__CmdTimeSignature__Group__1 : rule__CmdTimeSignature__Group__1__Impl rule__CmdTimeSignature__Group__2 ;
    public final void rule__CmdTimeSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2178:1: ( rule__CmdTimeSignature__Group__1__Impl rule__CmdTimeSignature__Group__2 )
            // InternalOrch8.g:2179:2: rule__CmdTimeSignature__Group__1__Impl rule__CmdTimeSignature__Group__2
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
    // InternalOrch8.g:2186:1: rule__CmdTimeSignature__Group__1__Impl : ( ( rule__CmdTimeSignature__NumeratorAssignment_1 ) ) ;
    public final void rule__CmdTimeSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2190:1: ( ( ( rule__CmdTimeSignature__NumeratorAssignment_1 ) ) )
            // InternalOrch8.g:2191:1: ( ( rule__CmdTimeSignature__NumeratorAssignment_1 ) )
            {
            // InternalOrch8.g:2191:1: ( ( rule__CmdTimeSignature__NumeratorAssignment_1 ) )
            // InternalOrch8.g:2192:2: ( rule__CmdTimeSignature__NumeratorAssignment_1 )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getNumeratorAssignment_1()); 
            // InternalOrch8.g:2193:2: ( rule__CmdTimeSignature__NumeratorAssignment_1 )
            // InternalOrch8.g:2193:3: rule__CmdTimeSignature__NumeratorAssignment_1
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
    // InternalOrch8.g:2201:1: rule__CmdTimeSignature__Group__2 : rule__CmdTimeSignature__Group__2__Impl rule__CmdTimeSignature__Group__3 ;
    public final void rule__CmdTimeSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2205:1: ( rule__CmdTimeSignature__Group__2__Impl rule__CmdTimeSignature__Group__3 )
            // InternalOrch8.g:2206:2: rule__CmdTimeSignature__Group__2__Impl rule__CmdTimeSignature__Group__3
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
    // InternalOrch8.g:2213:1: rule__CmdTimeSignature__Group__2__Impl : ( '/' ) ;
    public final void rule__CmdTimeSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2217:1: ( ( '/' ) )
            // InternalOrch8.g:2218:1: ( '/' )
            {
            // InternalOrch8.g:2218:1: ( '/' )
            // InternalOrch8.g:2219:2: '/'
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
    // InternalOrch8.g:2228:1: rule__CmdTimeSignature__Group__3 : rule__CmdTimeSignature__Group__3__Impl ;
    public final void rule__CmdTimeSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2232:1: ( rule__CmdTimeSignature__Group__3__Impl )
            // InternalOrch8.g:2233:2: rule__CmdTimeSignature__Group__3__Impl
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
    // InternalOrch8.g:2239:1: rule__CmdTimeSignature__Group__3__Impl : ( ( rule__CmdTimeSignature__DenominatorAssignment_3 ) ) ;
    public final void rule__CmdTimeSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2243:1: ( ( ( rule__CmdTimeSignature__DenominatorAssignment_3 ) ) )
            // InternalOrch8.g:2244:1: ( ( rule__CmdTimeSignature__DenominatorAssignment_3 ) )
            {
            // InternalOrch8.g:2244:1: ( ( rule__CmdTimeSignature__DenominatorAssignment_3 ) )
            // InternalOrch8.g:2245:2: ( rule__CmdTimeSignature__DenominatorAssignment_3 )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getDenominatorAssignment_3()); 
            // InternalOrch8.g:2246:2: ( rule__CmdTimeSignature__DenominatorAssignment_3 )
            // InternalOrch8.g:2246:3: rule__CmdTimeSignature__DenominatorAssignment_3
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
    // InternalOrch8.g:2255:1: rule__CmdSet__Group__0 : rule__CmdSet__Group__0__Impl rule__CmdSet__Group__1 ;
    public final void rule__CmdSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2259:1: ( rule__CmdSet__Group__0__Impl rule__CmdSet__Group__1 )
            // InternalOrch8.g:2260:2: rule__CmdSet__Group__0__Impl rule__CmdSet__Group__1
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
    // InternalOrch8.g:2267:1: rule__CmdSet__Group__0__Impl : ( ( rule__CmdSet__TypeAssignment_0 ) ) ;
    public final void rule__CmdSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2271:1: ( ( ( rule__CmdSet__TypeAssignment_0 ) ) )
            // InternalOrch8.g:2272:1: ( ( rule__CmdSet__TypeAssignment_0 ) )
            {
            // InternalOrch8.g:2272:1: ( ( rule__CmdSet__TypeAssignment_0 ) )
            // InternalOrch8.g:2273:2: ( rule__CmdSet__TypeAssignment_0 )
            {
             before(grammarAccess.getCmdSetAccess().getTypeAssignment_0()); 
            // InternalOrch8.g:2274:2: ( rule__CmdSet__TypeAssignment_0 )
            // InternalOrch8.g:2274:3: rule__CmdSet__TypeAssignment_0
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
    // InternalOrch8.g:2282:1: rule__CmdSet__Group__1 : rule__CmdSet__Group__1__Impl ;
    public final void rule__CmdSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2286:1: ( rule__CmdSet__Group__1__Impl )
            // InternalOrch8.g:2287:2: rule__CmdSet__Group__1__Impl
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
    // InternalOrch8.g:2293:1: rule__CmdSet__Group__1__Impl : ( ( rule__CmdSet__InstrumentAssignment_1 ) ) ;
    public final void rule__CmdSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2297:1: ( ( ( rule__CmdSet__InstrumentAssignment_1 ) ) )
            // InternalOrch8.g:2298:1: ( ( rule__CmdSet__InstrumentAssignment_1 ) )
            {
            // InternalOrch8.g:2298:1: ( ( rule__CmdSet__InstrumentAssignment_1 ) )
            // InternalOrch8.g:2299:2: ( rule__CmdSet__InstrumentAssignment_1 )
            {
             before(grammarAccess.getCmdSetAccess().getInstrumentAssignment_1()); 
            // InternalOrch8.g:2300:2: ( rule__CmdSet__InstrumentAssignment_1 )
            // InternalOrch8.g:2300:3: rule__CmdSet__InstrumentAssignment_1
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
    // InternalOrch8.g:2309:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2313:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalOrch8.g:2314:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalOrch8.g:2321:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__IDAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2325:1: ( ( ( rule__Parameter__IDAssignment_0 ) ) )
            // InternalOrch8.g:2326:1: ( ( rule__Parameter__IDAssignment_0 ) )
            {
            // InternalOrch8.g:2326:1: ( ( rule__Parameter__IDAssignment_0 ) )
            // InternalOrch8.g:2327:2: ( rule__Parameter__IDAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getIDAssignment_0()); 
            // InternalOrch8.g:2328:2: ( rule__Parameter__IDAssignment_0 )
            // InternalOrch8.g:2328:3: rule__Parameter__IDAssignment_0
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
    // InternalOrch8.g:2336:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2340:1: ( rule__Parameter__Group__1__Impl )
            // InternalOrch8.g:2341:2: rule__Parameter__Group__1__Impl
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
    // InternalOrch8.g:2347:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ValueAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2351:1: ( ( ( rule__Parameter__ValueAssignment_1 ) ) )
            // InternalOrch8.g:2352:1: ( ( rule__Parameter__ValueAssignment_1 ) )
            {
            // InternalOrch8.g:2352:1: ( ( rule__Parameter__ValueAssignment_1 ) )
            // InternalOrch8.g:2353:2: ( rule__Parameter__ValueAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_1()); 
            // InternalOrch8.g:2354:2: ( rule__Parameter__ValueAssignment_1 )
            // InternalOrch8.g:2354:3: rule__Parameter__ValueAssignment_1
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
    // InternalOrch8.g:2363:1: rule__Beat__Group__0 : rule__Beat__Group__0__Impl rule__Beat__Group__1 ;
    public final void rule__Beat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2367:1: ( rule__Beat__Group__0__Impl rule__Beat__Group__1 )
            // InternalOrch8.g:2368:2: rule__Beat__Group__0__Impl rule__Beat__Group__1
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
    // InternalOrch8.g:2375:1: rule__Beat__Group__0__Impl : ( ':' ) ;
    public final void rule__Beat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2379:1: ( ( ':' ) )
            // InternalOrch8.g:2380:1: ( ':' )
            {
            // InternalOrch8.g:2380:1: ( ':' )
            // InternalOrch8.g:2381:2: ':'
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
    // InternalOrch8.g:2390:1: rule__Beat__Group__1 : rule__Beat__Group__1__Impl rule__Beat__Group__2 ;
    public final void rule__Beat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2394:1: ( rule__Beat__Group__1__Impl rule__Beat__Group__2 )
            // InternalOrch8.g:2395:2: rule__Beat__Group__1__Impl rule__Beat__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalOrch8.g:2402:1: rule__Beat__Group__1__Impl : ( ( rule__Beat__IDAssignment_1 ) ) ;
    public final void rule__Beat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2406:1: ( ( ( rule__Beat__IDAssignment_1 ) ) )
            // InternalOrch8.g:2407:1: ( ( rule__Beat__IDAssignment_1 ) )
            {
            // InternalOrch8.g:2407:1: ( ( rule__Beat__IDAssignment_1 ) )
            // InternalOrch8.g:2408:2: ( rule__Beat__IDAssignment_1 )
            {
             before(grammarAccess.getBeatAccess().getIDAssignment_1()); 
            // InternalOrch8.g:2409:2: ( rule__Beat__IDAssignment_1 )
            // InternalOrch8.g:2409:3: rule__Beat__IDAssignment_1
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
    // InternalOrch8.g:2417:1: rule__Beat__Group__2 : rule__Beat__Group__2__Impl ;
    public final void rule__Beat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2421:1: ( rule__Beat__Group__2__Impl )
            // InternalOrch8.g:2422:2: rule__Beat__Group__2__Impl
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
    // InternalOrch8.g:2428:1: rule__Beat__Group__2__Impl : ( ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* ) ) ;
    public final void rule__Beat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2432:1: ( ( ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* ) ) )
            // InternalOrch8.g:2433:1: ( ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* ) )
            {
            // InternalOrch8.g:2433:1: ( ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* ) )
            // InternalOrch8.g:2434:2: ( ( rule__Beat__CommandsAssignment_2 ) ) ( ( rule__Beat__CommandsAssignment_2 )* )
            {
            // InternalOrch8.g:2434:2: ( ( rule__Beat__CommandsAssignment_2 ) )
            // InternalOrch8.g:2435:3: ( rule__Beat__CommandsAssignment_2 )
            {
             before(grammarAccess.getBeatAccess().getCommandsAssignment_2()); 
            // InternalOrch8.g:2436:3: ( rule__Beat__CommandsAssignment_2 )
            // InternalOrch8.g:2436:4: rule__Beat__CommandsAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Beat__CommandsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBeatAccess().getCommandsAssignment_2()); 

            }

            // InternalOrch8.g:2439:2: ( ( rule__Beat__CommandsAssignment_2 )* )
            // InternalOrch8.g:2440:3: ( rule__Beat__CommandsAssignment_2 )*
            {
             before(grammarAccess.getBeatAccess().getCommandsAssignment_2()); 
            // InternalOrch8.g:2441:3: ( rule__Beat__CommandsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=32 && LA23_0<=36)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOrch8.g:2441:4: rule__Beat__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Beat__CommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalOrch8.g:2451:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2455:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // InternalOrch8.g:2456:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
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
    // InternalOrch8.g:2463:1: rule__Generator__Group__0__Impl : ( ( rule__Generator__ModeAssignment_0 ) ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2467:1: ( ( ( rule__Generator__ModeAssignment_0 ) ) )
            // InternalOrch8.g:2468:1: ( ( rule__Generator__ModeAssignment_0 ) )
            {
            // InternalOrch8.g:2468:1: ( ( rule__Generator__ModeAssignment_0 ) )
            // InternalOrch8.g:2469:2: ( rule__Generator__ModeAssignment_0 )
            {
             before(grammarAccess.getGeneratorAccess().getModeAssignment_0()); 
            // InternalOrch8.g:2470:2: ( rule__Generator__ModeAssignment_0 )
            // InternalOrch8.g:2470:3: rule__Generator__ModeAssignment_0
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
    // InternalOrch8.g:2478:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2482:1: ( rule__Generator__Group__1__Impl )
            // InternalOrch8.g:2483:2: rule__Generator__Group__1__Impl
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
    // InternalOrch8.g:2489:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__TypeAssignment_1 ) ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2493:1: ( ( ( rule__Generator__TypeAssignment_1 ) ) )
            // InternalOrch8.g:2494:1: ( ( rule__Generator__TypeAssignment_1 ) )
            {
            // InternalOrch8.g:2494:1: ( ( rule__Generator__TypeAssignment_1 ) )
            // InternalOrch8.g:2495:2: ( rule__Generator__TypeAssignment_1 )
            {
             before(grammarAccess.getGeneratorAccess().getTypeAssignment_1()); 
            // InternalOrch8.g:2496:2: ( rule__Generator__TypeAssignment_1 )
            // InternalOrch8.g:2496:3: rule__Generator__TypeAssignment_1
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
    // InternalOrch8.g:2505:1: rule__Model__ScoresAssignment_0_0 : ( ruleScore ) ;
    public final void rule__Model__ScoresAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2509:1: ( ( ruleScore ) )
            // InternalOrch8.g:2510:2: ( ruleScore )
            {
            // InternalOrch8.g:2510:2: ( ruleScore )
            // InternalOrch8.g:2511:3: ruleScore
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
    // InternalOrch8.g:2520:1: rule__Model__InstrumentsAssignment_0_1 : ( ruleInstrument ) ;
    public final void rule__Model__InstrumentsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2524:1: ( ( ruleInstrument ) )
            // InternalOrch8.g:2525:2: ( ruleInstrument )
            {
            // InternalOrch8.g:2525:2: ( ruleInstrument )
            // InternalOrch8.g:2526:3: ruleInstrument
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
    // InternalOrch8.g:2535:1: rule__Model__MixerAssignment_1 : ( ruleMixer ) ;
    public final void rule__Model__MixerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2539:1: ( ( ruleMixer ) )
            // InternalOrch8.g:2540:2: ( ruleMixer )
            {
            // InternalOrch8.g:2540:2: ( ruleMixer )
            // InternalOrch8.g:2541:3: ruleMixer
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
    // InternalOrch8.g:2550:1: rule__Model__ScoresAssignment_2_0 : ( ruleScore ) ;
    public final void rule__Model__ScoresAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2554:1: ( ( ruleScore ) )
            // InternalOrch8.g:2555:2: ( ruleScore )
            {
            // InternalOrch8.g:2555:2: ( ruleScore )
            // InternalOrch8.g:2556:3: ruleScore
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
    // InternalOrch8.g:2565:1: rule__Model__InstrumentsAssignment_2_1 : ( ruleInstrument ) ;
    public final void rule__Model__InstrumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2569:1: ( ( ruleInstrument ) )
            // InternalOrch8.g:2570:2: ( ruleInstrument )
            {
            // InternalOrch8.g:2570:2: ( ruleInstrument )
            // InternalOrch8.g:2571:3: ruleInstrument
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
    // InternalOrch8.g:2580:1: rule__Mixer__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Mixer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2584:1: ( ( ruleEString ) )
            // InternalOrch8.g:2585:2: ( ruleEString )
            {
            // InternalOrch8.g:2585:2: ( ruleEString )
            // InternalOrch8.g:2586:3: ruleEString
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
    // InternalOrch8.g:2595:1: rule__Mixer__Sampling_rateAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Mixer__Sampling_rateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2599:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2600:2: ( ruleEInt )
            {
            // InternalOrch8.g:2600:2: ( ruleEInt )
            // InternalOrch8.g:2601:3: ruleEInt
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
    // InternalOrch8.g:2610:1: rule__Mixer__ScoresAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Mixer__ScoresAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2614:1: ( ( ( ruleEString ) ) )
            // InternalOrch8.g:2615:2: ( ( ruleEString ) )
            {
            // InternalOrch8.g:2615:2: ( ( ruleEString ) )
            // InternalOrch8.g:2616:3: ( ruleEString )
            {
             before(grammarAccess.getMixerAccess().getScoresScoreCrossReference_6_0()); 
            // InternalOrch8.g:2617:3: ( ruleEString )
            // InternalOrch8.g:2618:4: ruleEString
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
    // InternalOrch8.g:2629:1: rule__Mixer__ScoresAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Mixer__ScoresAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2633:1: ( ( ( ruleEString ) ) )
            // InternalOrch8.g:2634:2: ( ( ruleEString ) )
            {
            // InternalOrch8.g:2634:2: ( ( ruleEString ) )
            // InternalOrch8.g:2635:3: ( ruleEString )
            {
             before(grammarAccess.getMixerAccess().getScoresScoreCrossReference_7_1_0()); 
            // InternalOrch8.g:2636:3: ( ruleEString )
            // InternalOrch8.g:2637:4: ruleEString
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
    // InternalOrch8.g:2648:1: rule__Score__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Score__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2652:1: ( ( ruleEString ) )
            // InternalOrch8.g:2653:2: ( ruleEString )
            {
            // InternalOrch8.g:2653:2: ( ruleEString )
            // InternalOrch8.g:2654:3: ruleEString
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
    // InternalOrch8.g:2663:1: rule__Score__SetupAssignment_3_1 : ( ruleCommand ) ;
    public final void rule__Score__SetupAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2667:1: ( ( ruleCommand ) )
            // InternalOrch8.g:2668:2: ( ruleCommand )
            {
            // InternalOrch8.g:2668:2: ( ruleCommand )
            // InternalOrch8.g:2669:3: ruleCommand
            {
             before(grammarAccess.getScoreAccess().getSetupCommandParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getSetupCommandParserRuleCall_3_1_0()); 

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
    // InternalOrch8.g:2678:1: rule__Score__MeasuresAssignment_4 : ( ruleMeasure ) ;
    public final void rule__Score__MeasuresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2682:1: ( ( ruleMeasure ) )
            // InternalOrch8.g:2683:2: ( ruleMeasure )
            {
            // InternalOrch8.g:2683:2: ( ruleMeasure )
            // InternalOrch8.g:2684:3: ruleMeasure
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
    // InternalOrch8.g:2693:1: rule__Score__EndAssignment_5_1 : ( ruleCommand ) ;
    public final void rule__Score__EndAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2697:1: ( ( ruleCommand ) )
            // InternalOrch8.g:2698:2: ( ruleCommand )
            {
            // InternalOrch8.g:2698:2: ( ruleCommand )
            // InternalOrch8.g:2699:3: ruleCommand
            {
             before(grammarAccess.getScoreAccess().getEndCommandParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getScoreAccess().getEndCommandParserRuleCall_5_1_0()); 

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
    // InternalOrch8.g:2708:1: rule__Instrument__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Instrument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2712:1: ( ( ruleEString ) )
            // InternalOrch8.g:2713:2: ( ruleEString )
            {
            // InternalOrch8.g:2713:2: ( ruleEString )
            // InternalOrch8.g:2714:3: ruleEString
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
    // InternalOrch8.g:2723:1: rule__Instrument__GeneratorAssignment_3 : ( ruleGenerator ) ;
    public final void rule__Instrument__GeneratorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2727:1: ( ( ruleGenerator ) )
            // InternalOrch8.g:2728:2: ( ruleGenerator )
            {
            // InternalOrch8.g:2728:2: ( ruleGenerator )
            // InternalOrch8.g:2729:3: ruleGenerator
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
    // InternalOrch8.g:2738:1: rule__Instrument__ParametersAssignment_4 : ( ruleParameter ) ;
    public final void rule__Instrument__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2742:1: ( ( ruleParameter ) )
            // InternalOrch8.g:2743:2: ( ruleParameter )
            {
            // InternalOrch8.g:2743:2: ( ruleParameter )
            // InternalOrch8.g:2744:3: ruleParameter
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
    // InternalOrch8.g:2753:1: rule__Measure__IDAssignment_2 : ( ruleEInt ) ;
    public final void rule__Measure__IDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2757:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2758:2: ( ruleEInt )
            {
            // InternalOrch8.g:2758:2: ( ruleEInt )
            // InternalOrch8.g:2759:3: ruleEInt
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
    // InternalOrch8.g:2768:1: rule__Measure__BeatsAssignment_3 : ( ruleBeat ) ;
    public final void rule__Measure__BeatsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2772:1: ( ( ruleBeat ) )
            // InternalOrch8.g:2773:2: ( ruleBeat )
            {
            // InternalOrch8.g:2773:2: ( ruleBeat )
            // InternalOrch8.g:2774:3: ruleBeat
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
    // InternalOrch8.g:2783:1: rule__CmdInstrument__TypeAssignment_0 : ( ( 'instrument' ) ) ;
    public final void rule__CmdInstrument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2787:1: ( ( ( 'instrument' ) ) )
            // InternalOrch8.g:2788:2: ( ( 'instrument' ) )
            {
            // InternalOrch8.g:2788:2: ( ( 'instrument' ) )
            // InternalOrch8.g:2789:3: ( 'instrument' )
            {
             before(grammarAccess.getCmdInstrumentAccess().getTypeInstrumentKeyword_0_0()); 
            // InternalOrch8.g:2790:3: ( 'instrument' )
            // InternalOrch8.g:2791:4: 'instrument'
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
    // InternalOrch8.g:2802:1: rule__CmdInstrument__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__CmdInstrument__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2806:1: ( ( ruleParameter ) )
            // InternalOrch8.g:2807:2: ( ruleParameter )
            {
            // InternalOrch8.g:2807:2: ( ruleParameter )
            // InternalOrch8.g:2808:3: ruleParameter
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
    // InternalOrch8.g:2817:1: rule__CmdPlay__TypeAssignment_0 : ( ( 'play' ) ) ;
    public final void rule__CmdPlay__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2821:1: ( ( ( 'play' ) ) )
            // InternalOrch8.g:2822:2: ( ( 'play' ) )
            {
            // InternalOrch8.g:2822:2: ( ( 'play' ) )
            // InternalOrch8.g:2823:3: ( 'play' )
            {
             before(grammarAccess.getCmdPlayAccess().getTypePlayKeyword_0_0()); 
            // InternalOrch8.g:2824:3: ( 'play' )
            // InternalOrch8.g:2825:4: 'play'
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
    // InternalOrch8.g:2836:1: rule__CmdPlay__NoteAssignment_1 : ( RULE_NOTE ) ;
    public final void rule__CmdPlay__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2840:1: ( ( RULE_NOTE ) )
            // InternalOrch8.g:2841:2: ( RULE_NOTE )
            {
            // InternalOrch8.g:2841:2: ( RULE_NOTE )
            // InternalOrch8.g:2842:3: RULE_NOTE
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
    // InternalOrch8.g:2851:1: rule__CmdPlay__LengthAssignment_3 : ( ruleEDouble ) ;
    public final void rule__CmdPlay__LengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2855:1: ( ( ruleEDouble ) )
            // InternalOrch8.g:2856:2: ( ruleEDouble )
            {
            // InternalOrch8.g:2856:2: ( ruleEDouble )
            // InternalOrch8.g:2857:3: ruleEDouble
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
    // InternalOrch8.g:2866:1: rule__CmdTempo__TypeAssignment_0 : ( ( 'tempo' ) ) ;
    public final void rule__CmdTempo__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2870:1: ( ( ( 'tempo' ) ) )
            // InternalOrch8.g:2871:2: ( ( 'tempo' ) )
            {
            // InternalOrch8.g:2871:2: ( ( 'tempo' ) )
            // InternalOrch8.g:2872:3: ( 'tempo' )
            {
             before(grammarAccess.getCmdTempoAccess().getTypeTempoKeyword_0_0()); 
            // InternalOrch8.g:2873:3: ( 'tempo' )
            // InternalOrch8.g:2874:4: 'tempo'
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
    // InternalOrch8.g:2885:1: rule__CmdTempo__BpmAssignment_1 : ( ruleEInt ) ;
    public final void rule__CmdTempo__BpmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2889:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2890:2: ( ruleEInt )
            {
            // InternalOrch8.g:2890:2: ( ruleEInt )
            // InternalOrch8.g:2891:3: ruleEInt
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
    // InternalOrch8.g:2900:1: rule__CmdTimeSignature__TypeAssignment_0 : ( ( 'time_signature' ) ) ;
    public final void rule__CmdTimeSignature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2904:1: ( ( ( 'time_signature' ) ) )
            // InternalOrch8.g:2905:2: ( ( 'time_signature' ) )
            {
            // InternalOrch8.g:2905:2: ( ( 'time_signature' ) )
            // InternalOrch8.g:2906:3: ( 'time_signature' )
            {
             before(grammarAccess.getCmdTimeSignatureAccess().getTypeTime_signatureKeyword_0_0()); 
            // InternalOrch8.g:2907:3: ( 'time_signature' )
            // InternalOrch8.g:2908:4: 'time_signature'
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
    // InternalOrch8.g:2919:1: rule__CmdTimeSignature__NumeratorAssignment_1 : ( ruleEInt ) ;
    public final void rule__CmdTimeSignature__NumeratorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2923:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2924:2: ( ruleEInt )
            {
            // InternalOrch8.g:2924:2: ( ruleEInt )
            // InternalOrch8.g:2925:3: ruleEInt
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
    // InternalOrch8.g:2934:1: rule__CmdTimeSignature__DenominatorAssignment_3 : ( ruleEInt ) ;
    public final void rule__CmdTimeSignature__DenominatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2938:1: ( ( ruleEInt ) )
            // InternalOrch8.g:2939:2: ( ruleEInt )
            {
            // InternalOrch8.g:2939:2: ( ruleEInt )
            // InternalOrch8.g:2940:3: ruleEInt
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
    // InternalOrch8.g:2949:1: rule__CmdSet__TypeAssignment_0 : ( ( 'set' ) ) ;
    public final void rule__CmdSet__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2953:1: ( ( ( 'set' ) ) )
            // InternalOrch8.g:2954:2: ( ( 'set' ) )
            {
            // InternalOrch8.g:2954:2: ( ( 'set' ) )
            // InternalOrch8.g:2955:3: ( 'set' )
            {
             before(grammarAccess.getCmdSetAccess().getTypeSetKeyword_0_0()); 
            // InternalOrch8.g:2956:3: ( 'set' )
            // InternalOrch8.g:2957:4: 'set'
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
    // InternalOrch8.g:2968:1: rule__CmdSet__InstrumentAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__CmdSet__InstrumentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2972:1: ( ( ( ruleEString ) ) )
            // InternalOrch8.g:2973:2: ( ( ruleEString ) )
            {
            // InternalOrch8.g:2973:2: ( ( ruleEString ) )
            // InternalOrch8.g:2974:3: ( ruleEString )
            {
             before(grammarAccess.getCmdSetAccess().getInstrumentInstrumentCrossReference_1_0()); 
            // InternalOrch8.g:2975:3: ( ruleEString )
            // InternalOrch8.g:2976:4: ruleEString
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
    // InternalOrch8.g:2987:1: rule__Parameter__IDAssignment_0 : ( ruleEString ) ;
    public final void rule__Parameter__IDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:2991:1: ( ( ruleEString ) )
            // InternalOrch8.g:2992:2: ( ruleEString )
            {
            // InternalOrch8.g:2992:2: ( ruleEString )
            // InternalOrch8.g:2993:3: ruleEString
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
    // InternalOrch8.g:3002:1: rule__Parameter__ValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Parameter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3006:1: ( ( ruleEDouble ) )
            // InternalOrch8.g:3007:2: ( ruleEDouble )
            {
            // InternalOrch8.g:3007:2: ( ruleEDouble )
            // InternalOrch8.g:3008:3: ruleEDouble
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
    // InternalOrch8.g:3017:1: rule__Beat__IDAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Beat__IDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3021:1: ( ( ruleEDouble ) )
            // InternalOrch8.g:3022:2: ( ruleEDouble )
            {
            // InternalOrch8.g:3022:2: ( ruleEDouble )
            // InternalOrch8.g:3023:3: ruleEDouble
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
    // InternalOrch8.g:3032:1: rule__Beat__CommandsAssignment_2 : ( ruleCommand ) ;
    public final void rule__Beat__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3036:1: ( ( ruleCommand ) )
            // InternalOrch8.g:3037:2: ( ruleCommand )
            {
            // InternalOrch8.g:3037:2: ( ruleCommand )
            // InternalOrch8.g:3038:3: ruleCommand
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
    // InternalOrch8.g:3047:1: rule__Generator__ModeAssignment_0 : ( ( rule__Generator__ModeAlternatives_0_0 ) ) ;
    public final void rule__Generator__ModeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3051:1: ( ( ( rule__Generator__ModeAlternatives_0_0 ) ) )
            // InternalOrch8.g:3052:2: ( ( rule__Generator__ModeAlternatives_0_0 ) )
            {
            // InternalOrch8.g:3052:2: ( ( rule__Generator__ModeAlternatives_0_0 ) )
            // InternalOrch8.g:3053:3: ( rule__Generator__ModeAlternatives_0_0 )
            {
             before(grammarAccess.getGeneratorAccess().getModeAlternatives_0_0()); 
            // InternalOrch8.g:3054:3: ( rule__Generator__ModeAlternatives_0_0 )
            // InternalOrch8.g:3054:4: rule__Generator__ModeAlternatives_0_0
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
    // InternalOrch8.g:3062:1: rule__Generator__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__Generator__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrch8.g:3066:1: ( ( ruleEString ) )
            // InternalOrch8.g:3067:2: ( ruleEString )
            {
            // InternalOrch8.g:3067:2: ( ruleEString )
            // InternalOrch8.g:3068:3: ruleEString
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001F00000002L});
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

}