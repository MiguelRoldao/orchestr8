/**
 */
package Orchestr8;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.Beat#getID <em>ID</em>}</li>
 *   <li>{@link Orchestr8.Beat#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getBeat()
 * @model
 * @generated
 */
public interface Beat extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(double)
	 * @see Orchestr8.Orchestr8Package#getBeat_ID()
	 * @model
	 * @generated
	 */
	double getID();

	/**
	 * Sets the value of the '{@link Orchestr8.Beat#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(double value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link Orchestr8.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see Orchestr8.Orchestr8Package#getBeat_Commands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // Beat
