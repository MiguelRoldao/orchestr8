/**
 */
package Orchestr8;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd Tempo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.CmdTempo#getBpm <em>Bpm</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getCmdTempo()
 * @model
 * @generated
 */
public interface CmdTempo extends Command {
	/**
	 * Returns the value of the '<em><b>Bpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpm</em>' attribute.
	 * @see #setBpm(int)
	 * @see Orchestr8.Orchestr8Package#getCmdTempo_Bpm()
	 * @model
	 * @generated
	 */
	int getBpm();

	/**
	 * Sets the value of the '{@link Orchestr8.CmdTempo#getBpm <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpm</em>' attribute.
	 * @see #getBpm()
	 * @generated
	 */
	void setBpm(int value);

} // CmdTempo
