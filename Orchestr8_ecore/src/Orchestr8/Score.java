/**
 */
package Orchestr8;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.Score#getBpm <em>Bpm</em>}</li>
 *   <li>{@link Orchestr8.Score#getTimeSignature_num <em>Time Signature num</em>}</li>
 *   <li>{@link Orchestr8.Score#getSetup <em>Setup</em>}</li>
 *   <li>{@link Orchestr8.Score#getEnd <em>End</em>}</li>
 *   <li>{@link Orchestr8.Score#getMeasures <em>Measures</em>}</li>
 *   <li>{@link Orchestr8.Score#getTimeSignature_den <em>Time Signature den</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getScore()
 * @model
 * @generated
 */
public interface Score extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bpm</b></em>' attribute.
	 * The default value is <code>"120.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpm</em>' attribute.
	 * @see #setBpm(double)
	 * @see Orchestr8.Orchestr8Package#getScore_Bpm()
	 * @model default="120.0"
	 * @generated
	 */
	double getBpm();

	/**
	 * Sets the value of the '{@link Orchestr8.Score#getBpm <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpm</em>' attribute.
	 * @see #getBpm()
	 * @generated
	 */
	void setBpm(double value);

	/**
	 * Returns the value of the '<em><b>Time Signature num</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Signature num</em>' attribute.
	 * @see #setTimeSignature_num(int)
	 * @see Orchestr8.Orchestr8Package#getScore_TimeSignature_num()
	 * @model default="4"
	 * @generated
	 */
	int getTimeSignature_num();

	/**
	 * Sets the value of the '{@link Orchestr8.Score#getTimeSignature_num <em>Time Signature num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Signature num</em>' attribute.
	 * @see #getTimeSignature_num()
	 * @generated
	 */
	void setTimeSignature_num(int value);

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' containment reference list.
	 * The list contents are of type {@link Orchestr8.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup</em>' containment reference list.
	 * @see Orchestr8.Orchestr8Package#getScore_Setup()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getSetup();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link Orchestr8.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see Orchestr8.Orchestr8Package#getScore_End()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getEnd();

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
	 * The list contents are of type {@link Orchestr8.Measure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference list.
	 * @see Orchestr8.Orchestr8Package#getScore_Measures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Time Signature den</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Signature den</em>' attribute.
	 * @see #setTimeSignature_den(int)
	 * @see Orchestr8.Orchestr8Package#getScore_TimeSignature_den()
	 * @model default="4"
	 * @generated
	 */
	int getTimeSignature_den();

	/**
	 * Sets the value of the '{@link Orchestr8.Score#getTimeSignature_den <em>Time Signature den</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Signature den</em>' attribute.
	 * @see #getTimeSignature_den()
	 * @generated
	 */
	void setTimeSignature_den(int value);

} // Score
