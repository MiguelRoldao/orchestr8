/**
 */
package Orchestr8;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd Time Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.CmdTimeSignature#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link Orchestr8.CmdTimeSignature#getNumerator <em>Numerator</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getCmdTimeSignature()
 * @model
 * @generated
 */
public interface CmdTimeSignature extends Command {
	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #setDenominator(int)
	 * @see Orchestr8.Orchestr8Package#getCmdTimeSignature_Denominator()
	 * @model
	 * @generated
	 */
	int getDenominator();

	/**
	 * Sets the value of the '{@link Orchestr8.CmdTimeSignature#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(int value);

	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' attribute.
	 * @see #setNumerator(int)
	 * @see Orchestr8.Orchestr8Package#getCmdTimeSignature_Numerator()
	 * @model
	 * @generated
	 */
	int getNumerator();

	/**
	 * Sets the value of the '{@link Orchestr8.CmdTimeSignature#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' attribute.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(int value);

} // CmdTimeSignature
