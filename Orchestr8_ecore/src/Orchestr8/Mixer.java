/**
 */
package Orchestr8;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.Mixer#getSampling_rate <em>Sampling rate</em>}</li>
 *   <li>{@link Orchestr8.Mixer#getScores <em>Scores</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getMixer()
 * @model
 * @generated
 */
public interface Mixer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sampling rate</b></em>' attribute.
	 * The default value is <code>"48000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling rate</em>' attribute.
	 * @see #setSampling_rate(int)
	 * @see Orchestr8.Orchestr8Package#getMixer_Sampling_rate()
	 * @model default="48000"
	 * @generated
	 */
	int getSampling_rate();

	/**
	 * Sets the value of the '{@link Orchestr8.Mixer#getSampling_rate <em>Sampling rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling rate</em>' attribute.
	 * @see #getSampling_rate()
	 * @generated
	 */
	void setSampling_rate(int value);

	/**
	 * Returns the value of the '<em><b>Scores</b></em>' reference list.
	 * The list contents are of type {@link Orchestr8.Score}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scores</em>' reference list.
	 * @see Orchestr8.Orchestr8Package#getMixer_Scores()
	 * @model
	 * @generated
	 */
	EList<Score> getScores();

} // Mixer
