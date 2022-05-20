/**
 */
package Orchestr8;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.CmdInstrument#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getCmdInstrument()
 * @model
 * @generated
 */
public interface CmdInstrument extends Command {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Parameter)
	 * @see Orchestr8.Orchestr8Package#getCmdInstrument_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link Orchestr8.CmdInstrument#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // CmdInstrument
