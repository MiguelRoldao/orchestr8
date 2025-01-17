/*
 * generated by Xtext 2.26.0
 */
package org.xtext.orchestr8_test.serializer;

import Orchestr8.Beat;
import Orchestr8.CmdInstrument;
import Orchestr8.CmdPlay;
import Orchestr8.CmdSet;
import Orchestr8.CmdTempo;
import Orchestr8.CmdTimeSignature;
import Orchestr8.Generator;
import Orchestr8.Instrument;
import Orchestr8.Measure;
import Orchestr8.Mixer;
import Orchestr8.Model;
import Orchestr8.Orchestr8Package;
import Orchestr8.Score;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.orchestr8_test.services.Orch8GrammarAccess;

@SuppressWarnings("all")
public class Orch8SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Orch8GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Orchestr8Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Orchestr8Package.BEAT:
				sequence_Beat(context, (Beat) semanticObject); 
				return; 
			case Orchestr8Package.CMD_INSTRUMENT:
				sequence_CmdInstrument(context, (CmdInstrument) semanticObject); 
				return; 
			case Orchestr8Package.CMD_PLAY:
				sequence_CmdPlay(context, (CmdPlay) semanticObject); 
				return; 
			case Orchestr8Package.CMD_SET:
				sequence_CmdSet(context, (CmdSet) semanticObject); 
				return; 
			case Orchestr8Package.CMD_TEMPO:
				sequence_CmdTempo(context, (CmdTempo) semanticObject); 
				return; 
			case Orchestr8Package.CMD_TIME_SIGNATURE:
				sequence_CmdTimeSignature(context, (CmdTimeSignature) semanticObject); 
				return; 
			case Orchestr8Package.GENERATOR:
				sequence_Generator(context, (Generator) semanticObject); 
				return; 
			case Orchestr8Package.INSTRUMENT:
				sequence_Instrument(context, (Instrument) semanticObject); 
				return; 
			case Orchestr8Package.MEASURE:
				sequence_Measure(context, (Measure) semanticObject); 
				return; 
			case Orchestr8Package.MIXER:
				sequence_Mixer(context, (Mixer) semanticObject); 
				return; 
			case Orchestr8Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Orchestr8Package.PARAMETER:
				sequence_Parameter(context, (Orchestr8.Parameter) semanticObject); 
				return; 
			case Orchestr8Package.SCORE:
				sequence_Score(context, (Score) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Beat returns Beat
	 *
	 * Constraint:
	 *     (ID=EDouble commands+=Command+)
	 * </pre>
	 */
	protected void sequence_Beat(ISerializationContext context, Beat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SetupCommand returns CmdInstrument
	 *     Command returns CmdInstrument
	 *     CmdInstrument returns CmdInstrument
	 *
	 * Constraint:
	 *     (type='instrument' parameter=Parameter)
	 * </pre>
	 */
	protected void sequence_CmdInstrument(ISerializationContext context, CmdInstrument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE));
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.CMD_INSTRUMENT__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.CMD_INSTRUMENT__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCmdInstrumentAccess().getTypeInstrumentKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCmdInstrumentAccess().getParameterParameterParserRuleCall_1_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns CmdPlay
	 *     CmdPlay returns CmdPlay
	 *
	 * Constraint:
	 *     (type='play' note=NOTE length=EDouble)
	 * </pre>
	 */
	protected void sequence_CmdPlay(ISerializationContext context, CmdPlay semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE));
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.CMD_PLAY__NOTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.CMD_PLAY__NOTE));
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.CMD_PLAY__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.CMD_PLAY__LENGTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCmdPlayAccess().getTypePlayKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCmdPlayAccess().getNoteNOTETerminalRuleCall_1_0(), semanticObject.getNote());
		feeder.accept(grammarAccess.getCmdPlayAccess().getLengthEDoubleParserRuleCall_3_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SetupCommand returns CmdSet
	 *     Command returns CmdSet
	 *     CmdSet returns CmdSet
	 *
	 * Constraint:
	 *     (type='set' instrument=[Instrument|EString])
	 * </pre>
	 */
	protected void sequence_CmdSet(ISerializationContext context, CmdSet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE));
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.CMD_SET__INSTRUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.CMD_SET__INSTRUMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCmdSetAccess().getTypeSetKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCmdSetAccess().getInstrumentInstrumentEStringParserRuleCall_1_0_1(), semanticObject.eGet(Orchestr8Package.Literals.CMD_SET__INSTRUMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SetupCommand returns CmdTempo
	 *     Command returns CmdTempo
	 *     CmdTempo returns CmdTempo
	 *
	 * Constraint:
	 *     (type='tempo' bpm=EInt)
	 * </pre>
	 */
	protected void sequence_CmdTempo(ISerializationContext context, CmdTempo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE));
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.CMD_TEMPO__BPM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.CMD_TEMPO__BPM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCmdTempoAccess().getTypeTempoKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCmdTempoAccess().getBpmEIntParserRuleCall_1_0(), semanticObject.getBpm());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SetupCommand returns CmdTimeSignature
	 *     Command returns CmdTimeSignature
	 *     CmdTimeSignature returns CmdTimeSignature
	 *
	 * Constraint:
	 *     (type='time_signature' numerator=EInt denominator=EInt)
	 * </pre>
	 */
	protected void sequence_CmdTimeSignature(ISerializationContext context, CmdTimeSignature semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.COMMAND__TYPE));
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.CMD_TIME_SIGNATURE__NUMERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.CMD_TIME_SIGNATURE__NUMERATOR));
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.CMD_TIME_SIGNATURE__DENOMINATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.CMD_TIME_SIGNATURE__DENOMINATOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCmdTimeSignatureAccess().getTypeTime_signatureKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCmdTimeSignatureAccess().getNumeratorEIntParserRuleCall_1_0(), semanticObject.getNumerator());
		feeder.accept(grammarAccess.getCmdTimeSignatureAccess().getDenominatorEIntParserRuleCall_3_0(), semanticObject.getDenominator());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Generator returns Generator
	 *
	 * Constraint:
	 *     ((mode='type' | mode='custom') type=EString)
	 * </pre>
	 */
	protected void sequence_Generator(ISerializationContext context, Generator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Instrument returns Instrument
	 *
	 * Constraint:
	 *     (name=EString generator=Generator parameters+=Parameter*)
	 * </pre>
	 */
	protected void sequence_Instrument(ISerializationContext context, Instrument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Measure returns Measure
	 *
	 * Constraint:
	 *     (ID=EInt beats+=Beat+)
	 * </pre>
	 */
	protected void sequence_Measure(ISerializationContext context, Measure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Mixer returns Mixer
	 *
	 * Constraint:
	 *     (name=EString sampling_rate=EInt? scores+=[Score|EString] scores+=[Score|EString]*)
	 * </pre>
	 */
	protected void sequence_Mixer(ISerializationContext context, Mixer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     ((scores+=Score | instruments+=Instrument)* mixer=Mixer (scores+=Score | instruments+=Instrument)*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (ID=EString value=EDouble)
	 * </pre>
	 */
	protected void sequence_Parameter(ISerializationContext context, Orchestr8.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.PARAMETER__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.PARAMETER__ID));
			if (transientValues.isValueTransient(semanticObject, Orchestr8Package.Literals.PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Orchestr8Package.Literals.PARAMETER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getIDEStringParserRuleCall_0_0(), semanticObject.getID());
		feeder.accept(grammarAccess.getParameterAccess().getValueEDoubleParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Score returns Score
	 *
	 * Constraint:
	 *     (name=EString setup+=SetupCommand* measures+=Measure+ end+=SetupCommand*)
	 * </pre>
	 */
	protected void sequence_Score(ISerializationContext context, Score semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
