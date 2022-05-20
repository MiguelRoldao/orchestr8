/**
 */
package Orchestr8.impl;

import Orchestr8.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Orchestr8FactoryImpl extends EFactoryImpl implements Orchestr8Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Orchestr8Factory init() {
		try {
			Orchestr8Factory theOrchestr8Factory = (Orchestr8Factory)EPackage.Registry.INSTANCE.getEFactory(Orchestr8Package.eNS_URI);
			if (theOrchestr8Factory != null) {
				return theOrchestr8Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Orchestr8FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orchestr8FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Orchestr8Package.SCORE: return createScore();
			case Orchestr8Package.INSTRUMENT: return createInstrument();
			case Orchestr8Package.MIXER: return createMixer();
			case Orchestr8Package.GENERATOR: return createGenerator();
			case Orchestr8Package.MEASURE: return createMeasure();
			case Orchestr8Package.BEAT: return createBeat();
			case Orchestr8Package.PARAMETER: return createParameter();
			case Orchestr8Package.CMD_TEMPO: return createCmdTempo();
			case Orchestr8Package.CMD_TIME_SIGNATURE: return createCmdTimeSignature();
			case Orchestr8Package.CMD_PLAY: return createCmdPlay();
			case Orchestr8Package.CMD_INSTRUMENT: return createCmdInstrument();
			case Orchestr8Package.CMD_SET: return createCmdSet();
			case Orchestr8Package.MODEL: return createModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score createScore() {
		ScoreImpl score = new ScoreImpl();
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instrument createInstrument() {
		InstrumentImpl instrument = new InstrumentImpl();
		return instrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mixer createMixer() {
		MixerImpl mixer = new MixerImpl();
		return mixer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beat createBeat() {
		BeatImpl beat = new BeatImpl();
		return beat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdTempo createCmdTempo() {
		CmdTempoImpl cmdTempo = new CmdTempoImpl();
		return cmdTempo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdTimeSignature createCmdTimeSignature() {
		CmdTimeSignatureImpl cmdTimeSignature = new CmdTimeSignatureImpl();
		return cmdTimeSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPlay createCmdPlay() {
		CmdPlayImpl cmdPlay = new CmdPlayImpl();
		return cmdPlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdInstrument createCmdInstrument() {
		CmdInstrumentImpl cmdInstrument = new CmdInstrumentImpl();
		return cmdInstrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdSet createCmdSet() {
		CmdSetImpl cmdSet = new CmdSetImpl();
		return cmdSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orchestr8Package getOrchestr8Package() {
		return (Orchestr8Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Orchestr8Package getPackage() {
		return Orchestr8Package.eINSTANCE;
	}

} //Orchestr8FactoryImpl
