/**
 */
package Orchestr8;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.CmdSet#getInstrument <em>Instrument</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getCmdSet()
 * @model
 * @generated
 */
public interface CmdSet extends Command {
	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' reference.
	 * @see #setInstrument(Instrument)
	 * @see Orchestr8.Orchestr8Package#getCmdSet_Instrument()
	 * @model required="true"
	 * @generated
	 */
	Instrument getInstrument();

	/**
	 * Sets the value of the '{@link Orchestr8.CmdSet#getInstrument <em>Instrument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' reference.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(Instrument value);

} // CmdSet
