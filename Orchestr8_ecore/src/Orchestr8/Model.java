/**
 */
package Orchestr8;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.Model#getMixer <em>Mixer</em>}</li>
 *   <li>{@link Orchestr8.Model#getScores <em>Scores</em>}</li>
 *   <li>{@link Orchestr8.Model#getInstruments <em>Instruments</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixer</em>' containment reference.
	 * @see #setMixer(Mixer)
	 * @see Orchestr8.Orchestr8Package#getModel_Mixer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Mixer getMixer();

	/**
	 * Sets the value of the '{@link Orchestr8.Model#getMixer <em>Mixer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mixer</em>' containment reference.
	 * @see #getMixer()
	 * @generated
	 */
	void setMixer(Mixer value);

	/**
	 * Returns the value of the '<em><b>Scores</b></em>' containment reference list.
	 * The list contents are of type {@link Orchestr8.Score}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scores</em>' containment reference list.
	 * @see Orchestr8.Orchestr8Package#getModel_Scores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Score> getScores();

	/**
	 * Returns the value of the '<em><b>Instruments</b></em>' containment reference list.
	 * The list contents are of type {@link Orchestr8.Instrument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruments</em>' containment reference list.
	 * @see Orchestr8.Orchestr8Package#getModel_Instruments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instrument> getInstruments();

} // Model
