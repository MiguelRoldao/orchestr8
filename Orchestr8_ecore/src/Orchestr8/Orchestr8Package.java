/**
 */
package Orchestr8;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Orchestr8.Orchestr8Factory
 * @model kind="package"
 * @generated
 */
public interface Orchestr8Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Orchestr8";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://Orchestr8.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.Orchestr8";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Orchestr8Package eINSTANCE = Orchestr8.impl.Orchestr8PackageImpl.init();

	/**
	 * The meta object id for the '{@link Orchestr8.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.NamedElementImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.ScoreImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__BPM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Signature num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__TIME_SIGNATURE_NUM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Setup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__SETUP = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__END = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__MEASURES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Signature den</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__TIME_SIGNATURE_DEN = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.InstrumentImpl <em>Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.InstrumentImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getInstrument()
	 * @generated
	 */
	int INSTRUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__GENERATOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__VOLUME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__FREQUENCY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.MixerImpl <em>Mixer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.MixerImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getMixer()
	 * @generated
	 */
	int MIXER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sampling rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXER__SAMPLING_RATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXER__SCORES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mixer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mixer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.CmdTempoImpl <em>Cmd Tempo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.CmdTempoImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdTempo()
	 * @generated
	 */
	int CMD_TEMPO = 8;

	/**
	 * The meta object id for the '{@link Orchestr8.Command <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.Command
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.GeneratorImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__MODE = 1;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.MeasureImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Beats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__BEATS = 1;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link Orchestr8.impl.BeatImpl <em>Beat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.BeatImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getBeat()
	 * @generated
	 */
	int BEAT = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT__ID = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Beat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Beat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.ParameterImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TEMPO__TYPE = COMMAND__TYPE;

	/**
	 * The feature id for the '<em><b>Bpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TEMPO__BPM = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cmd Tempo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TEMPO_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cmd Tempo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TEMPO_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link Orchestr8.impl.CmdTimeSignatureImpl <em>Cmd Time Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.CmdTimeSignatureImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdTimeSignature()
	 * @generated
	 */
	int CMD_TIME_SIGNATURE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TIME_SIGNATURE__TYPE = COMMAND__TYPE;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TIME_SIGNATURE__DENOMINATOR = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TIME_SIGNATURE__NUMERATOR = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cmd Time Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TIME_SIGNATURE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cmd Time Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_TIME_SIGNATURE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.CmdPlayImpl <em>Cmd Play</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.CmdPlayImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdPlay()
	 * @generated
	 */
	int CMD_PLAY = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PLAY__TYPE = COMMAND__TYPE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PLAY__NOTE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PLAY__LENGTH = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cmd Play</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PLAY_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cmd Play</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_PLAY_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.CmdInstrumentImpl <em>Cmd Instrument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.CmdInstrumentImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdInstrument()
	 * @generated
	 */
	int CMD_INSTRUMENT = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_INSTRUMENT__TYPE = COMMAND__TYPE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_INSTRUMENT__PARAMETER = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cmd Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_INSTRUMENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cmd Instrument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_INSTRUMENT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.CmdSetImpl <em>Cmd Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.CmdSetImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdSet()
	 * @generated
	 */
	int CMD_SET = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_SET__TYPE = COMMAND__TYPE;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_SET__INSTRUMENT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cmd Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_SET_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cmd Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_SET_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Orchestr8.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Orchestr8.impl.ModelImpl
	 * @see Orchestr8.impl.Orchestr8PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 13;

	/**
	 * The feature id for the '<em><b>Mixer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MIXER = 0;

	/**
	 * The feature id for the '<em><b>Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCORES = 1;

	/**
	 * The feature id for the '<em><b>Instruments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INSTRUMENTS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link Orchestr8.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see Orchestr8.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Score#getBpm <em>Bpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bpm</em>'.
	 * @see Orchestr8.Score#getBpm()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Bpm();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Score#getTimeSignature_num <em>Time Signature num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Signature num</em>'.
	 * @see Orchestr8.Score#getTimeSignature_num()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_TimeSignature_num();

	/**
	 * Returns the meta object for the containment reference list '{@link Orchestr8.Score#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setup</em>'.
	 * @see Orchestr8.Score#getSetup()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Setup();

	/**
	 * Returns the meta object for the containment reference list '{@link Orchestr8.Score#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End</em>'.
	 * @see Orchestr8.Score#getEnd()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_End();

	/**
	 * Returns the meta object for the containment reference list '{@link Orchestr8.Score#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see Orchestr8.Score#getMeasures()
	 * @see #getScore()
	 * @generated
	 */
	EReference getScore_Measures();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Score#getTimeSignature_den <em>Time Signature den</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Signature den</em>'.
	 * @see Orchestr8.Score#getTimeSignature_den()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_TimeSignature_den();

	/**
	 * Returns the meta object for class '{@link Orchestr8.Instrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrument</em>'.
	 * @see Orchestr8.Instrument
	 * @generated
	 */
	EClass getInstrument();

	/**
	 * Returns the meta object for the containment reference '{@link Orchestr8.Instrument#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generator</em>'.
	 * @see Orchestr8.Instrument#getGenerator()
	 * @see #getInstrument()
	 * @generated
	 */
	EReference getInstrument_Generator();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Instrument#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see Orchestr8.Instrument#getVolume()
	 * @see #getInstrument()
	 * @generated
	 */
	EAttribute getInstrument_Volume();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Instrument#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see Orchestr8.Instrument#getFrequency()
	 * @see #getInstrument()
	 * @generated
	 */
	EAttribute getInstrument_Frequency();

	/**
	 * Returns the meta object for the containment reference list '{@link Orchestr8.Instrument#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see Orchestr8.Instrument#getParameters()
	 * @see #getInstrument()
	 * @generated
	 */
	EReference getInstrument_Parameters();

	/**
	 * Returns the meta object for class '{@link Orchestr8.Mixer <em>Mixer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixer</em>'.
	 * @see Orchestr8.Mixer
	 * @generated
	 */
	EClass getMixer();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Mixer#getSampling_rate <em>Sampling rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling rate</em>'.
	 * @see Orchestr8.Mixer#getSampling_rate()
	 * @see #getMixer()
	 * @generated
	 */
	EAttribute getMixer_Sampling_rate();

	/**
	 * Returns the meta object for the reference list '{@link Orchestr8.Mixer#getScores <em>Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scores</em>'.
	 * @see Orchestr8.Mixer#getScores()
	 * @see #getMixer()
	 * @generated
	 */
	EReference getMixer_Scores();

	/**
	 * Returns the meta object for class '{@link Orchestr8.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see Orchestr8.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Command#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Orchestr8.Command#getType()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Type();

	/**
	 * Returns the meta object for class '{@link Orchestr8.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see Orchestr8.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Generator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Orchestr8.Generator#getType()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Type();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Generator#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see Orchestr8.Generator#getMode()
	 * @see #getGenerator()
	 * @generated
	 */
	EAttribute getGenerator_Mode();

	/**
	 * Returns the meta object for class '{@link Orchestr8.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see Orchestr8.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Measure#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Orchestr8.Measure#getID()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link Orchestr8.Measure#getBeats <em>Beats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beats</em>'.
	 * @see Orchestr8.Measure#getBeats()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Beats();

	/**
	 * Returns the meta object for class '{@link Orchestr8.Beat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beat</em>'.
	 * @see Orchestr8.Beat
	 * @generated
	 */
	EClass getBeat();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Beat#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Orchestr8.Beat#getID()
	 * @see #getBeat()
	 * @generated
	 */
	EAttribute getBeat_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link Orchestr8.Beat#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see Orchestr8.Beat#getCommands()
	 * @see #getBeat()
	 * @generated
	 */
	EReference getBeat_Commands();

	/**
	 * Returns the meta object for class '{@link Orchestr8.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see Orchestr8.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Parameter#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Orchestr8.Parameter#getID()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ID();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Orchestr8.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link Orchestr8.CmdTempo <em>Cmd Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd Tempo</em>'.
	 * @see Orchestr8.CmdTempo
	 * @generated
	 */
	EClass getCmdTempo();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.CmdTempo#getBpm <em>Bpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bpm</em>'.
	 * @see Orchestr8.CmdTempo#getBpm()
	 * @see #getCmdTempo()
	 * @generated
	 */
	EAttribute getCmdTempo_Bpm();

	/**
	 * Returns the meta object for class '{@link Orchestr8.CmdTimeSignature <em>Cmd Time Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd Time Signature</em>'.
	 * @see Orchestr8.CmdTimeSignature
	 * @generated
	 */
	EClass getCmdTimeSignature();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.CmdTimeSignature#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator</em>'.
	 * @see Orchestr8.CmdTimeSignature#getDenominator()
	 * @see #getCmdTimeSignature()
	 * @generated
	 */
	EAttribute getCmdTimeSignature_Denominator();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.CmdTimeSignature#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numerator</em>'.
	 * @see Orchestr8.CmdTimeSignature#getNumerator()
	 * @see #getCmdTimeSignature()
	 * @generated
	 */
	EAttribute getCmdTimeSignature_Numerator();

	/**
	 * Returns the meta object for class '{@link Orchestr8.CmdPlay <em>Cmd Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd Play</em>'.
	 * @see Orchestr8.CmdPlay
	 * @generated
	 */
	EClass getCmdPlay();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.CmdPlay#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see Orchestr8.CmdPlay#getNote()
	 * @see #getCmdPlay()
	 * @generated
	 */
	EAttribute getCmdPlay_Note();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.CmdPlay#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see Orchestr8.CmdPlay#getLength()
	 * @see #getCmdPlay()
	 * @generated
	 */
	EAttribute getCmdPlay_Length();

	/**
	 * Returns the meta object for class '{@link Orchestr8.CmdInstrument <em>Cmd Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd Instrument</em>'.
	 * @see Orchestr8.CmdInstrument
	 * @generated
	 */
	EClass getCmdInstrument();

	/**
	 * Returns the meta object for the containment reference '{@link Orchestr8.CmdInstrument#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see Orchestr8.CmdInstrument#getParameter()
	 * @see #getCmdInstrument()
	 * @generated
	 */
	EReference getCmdInstrument_Parameter();

	/**
	 * Returns the meta object for class '{@link Orchestr8.CmdSet <em>Cmd Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd Set</em>'.
	 * @see Orchestr8.CmdSet
	 * @generated
	 */
	EClass getCmdSet();

	/**
	 * Returns the meta object for the reference '{@link Orchestr8.CmdSet#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instrument</em>'.
	 * @see Orchestr8.CmdSet#getInstrument()
	 * @see #getCmdSet()
	 * @generated
	 */
	EReference getCmdSet_Instrument();

	/**
	 * Returns the meta object for class '{@link Orchestr8.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see Orchestr8.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link Orchestr8.Model#getMixer <em>Mixer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mixer</em>'.
	 * @see Orchestr8.Model#getMixer()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Mixer();

	/**
	 * Returns the meta object for the containment reference list '{@link Orchestr8.Model#getScores <em>Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scores</em>'.
	 * @see Orchestr8.Model#getScores()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Scores();

	/**
	 * Returns the meta object for the containment reference list '{@link Orchestr8.Model#getInstruments <em>Instruments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruments</em>'.
	 * @see Orchestr8.Model#getInstruments()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Instruments();

	/**
	 * Returns the meta object for class '{@link Orchestr8.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Orchestr8.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Orchestr8.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Orchestr8.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Orchestr8Factory getOrchestr8Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Orchestr8.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.ScoreImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getScore()
		 * @generated
		 */
		EClass SCORE = eINSTANCE.getScore();

		/**
		 * The meta object literal for the '<em><b>Bpm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__BPM = eINSTANCE.getScore_Bpm();

		/**
		 * The meta object literal for the '<em><b>Time Signature num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__TIME_SIGNATURE_NUM = eINSTANCE.getScore_TimeSignature_num();

		/**
		 * The meta object literal for the '<em><b>Setup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE__SETUP = eINSTANCE.getScore_Setup();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE__END = eINSTANCE.getScore_End();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE__MEASURES = eINSTANCE.getScore_Measures();

		/**
		 * The meta object literal for the '<em><b>Time Signature den</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__TIME_SIGNATURE_DEN = eINSTANCE.getScore_TimeSignature_den();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.InstrumentImpl <em>Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.InstrumentImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getInstrument()
		 * @generated
		 */
		EClass INSTRUMENT = eINSTANCE.getInstrument();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENT__GENERATOR = eINSTANCE.getInstrument_Generator();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUMENT__VOLUME = eINSTANCE.getInstrument_Volume();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUMENT__FREQUENCY = eINSTANCE.getInstrument_Frequency();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENT__PARAMETERS = eINSTANCE.getInstrument_Parameters();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.MixerImpl <em>Mixer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.MixerImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getMixer()
		 * @generated
		 */
		EClass MIXER = eINSTANCE.getMixer();

		/**
		 * The meta object literal for the '<em><b>Sampling rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXER__SAMPLING_RATE = eINSTANCE.getMixer_Sampling_rate();

		/**
		 * The meta object literal for the '<em><b>Scores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXER__SCORES = eINSTANCE.getMixer_Scores();

		/**
		 * The meta object literal for the '{@link Orchestr8.Command <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.Command
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__TYPE = eINSTANCE.getCommand_Type();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.GeneratorImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__TYPE = eINSTANCE.getGenerator_Type();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR__MODE = eINSTANCE.getGenerator_Mode();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.MeasureImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__ID = eINSTANCE.getMeasure_ID();

		/**
		 * The meta object literal for the '<em><b>Beats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__BEATS = eINSTANCE.getMeasure_Beats();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.BeatImpl <em>Beat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.BeatImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getBeat()
		 * @generated
		 */
		EClass BEAT = eINSTANCE.getBeat();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEAT__ID = eINSTANCE.getBeat_ID();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAT__COMMANDS = eINSTANCE.getBeat_Commands();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.ParameterImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ID = eINSTANCE.getParameter_ID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.CmdTempoImpl <em>Cmd Tempo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.CmdTempoImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdTempo()
		 * @generated
		 */
		EClass CMD_TEMPO = eINSTANCE.getCmdTempo();

		/**
		 * The meta object literal for the '<em><b>Bpm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_TEMPO__BPM = eINSTANCE.getCmdTempo_Bpm();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.CmdTimeSignatureImpl <em>Cmd Time Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.CmdTimeSignatureImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdTimeSignature()
		 * @generated
		 */
		EClass CMD_TIME_SIGNATURE = eINSTANCE.getCmdTimeSignature();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_TIME_SIGNATURE__DENOMINATOR = eINSTANCE.getCmdTimeSignature_Denominator();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_TIME_SIGNATURE__NUMERATOR = eINSTANCE.getCmdTimeSignature_Numerator();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.CmdPlayImpl <em>Cmd Play</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.CmdPlayImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdPlay()
		 * @generated
		 */
		EClass CMD_PLAY = eINSTANCE.getCmdPlay();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PLAY__NOTE = eINSTANCE.getCmdPlay_Note();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_PLAY__LENGTH = eINSTANCE.getCmdPlay_Length();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.CmdInstrumentImpl <em>Cmd Instrument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.CmdInstrumentImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdInstrument()
		 * @generated
		 */
		EClass CMD_INSTRUMENT = eINSTANCE.getCmdInstrument();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_INSTRUMENT__PARAMETER = eINSTANCE.getCmdInstrument_Parameter();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.CmdSetImpl <em>Cmd Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.CmdSetImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getCmdSet()
		 * @generated
		 */
		EClass CMD_SET = eINSTANCE.getCmdSet();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_SET__INSTRUMENT = eINSTANCE.getCmdSet_Instrument();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.ModelImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Mixer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MIXER = eINSTANCE.getModel_Mixer();

		/**
		 * The meta object literal for the '<em><b>Scores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCORES = eINSTANCE.getModel_Scores();

		/**
		 * The meta object literal for the '<em><b>Instruments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INSTRUMENTS = eINSTANCE.getModel_Instruments();

		/**
		 * The meta object literal for the '{@link Orchestr8.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Orchestr8.impl.NamedElementImpl
		 * @see Orchestr8.impl.Orchestr8PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //Orchestr8Package
