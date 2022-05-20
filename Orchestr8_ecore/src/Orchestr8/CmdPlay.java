/**
 */
package Orchestr8;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd Play</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.CmdPlay#getNote <em>Note</em>}</li>
 *   <li>{@link Orchestr8.CmdPlay#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getCmdPlay()
 * @model
 * @generated
 */
public interface CmdPlay extends Command {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see Orchestr8.Orchestr8Package#getCmdPlay_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link Orchestr8.CmdPlay#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see Orchestr8.Orchestr8Package#getCmdPlay_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link Orchestr8.CmdPlay#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

} // CmdPlay
