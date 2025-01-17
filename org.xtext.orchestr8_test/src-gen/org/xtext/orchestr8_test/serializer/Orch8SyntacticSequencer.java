/*
 * generated by Xtext 2.26.0
 */
package org.xtext.orchestr8_test.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.orchestr8_test.services.Orch8GrammarAccess;

@SuppressWarnings("all")
public class Orch8SyntacticSequencer extends AbstractSyntacticSequencer {

	protected Orch8GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Score_EndKeyword_5_0_q;
	protected AbstractElementAlias match_Score_SetupKeyword_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Orch8GrammarAccess) access;
		match_Score_EndKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getScoreAccess().getEndKeyword_5_0());
		match_Score_SetupKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getScoreAccess().getSetupKeyword_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Score_EndKeyword_5_0_q.equals(syntax))
				emit_Score_EndKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Score_SetupKeyword_3_0_q.equals(syntax))
				emit_Score_SetupKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '@End'?
	 *
	 * This ambiguous syntax occurs at:
	 *     measures+=Measure (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Score_EndKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '@Setup'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString '{' (ambiguity) measures+=Measure
	 
	 * </pre>
	 */
	protected void emit_Score_SetupKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
