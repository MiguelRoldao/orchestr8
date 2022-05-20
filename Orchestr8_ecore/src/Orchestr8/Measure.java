/**
 */
package Orchestr8;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.Measure#getID <em>ID</em>}</li>
 *   <li>{@link Orchestr8.Measure#getBeats <em>Beats</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see Orchestr8.Orchestr8Package#getMeasure_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link Orchestr8.Measure#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Beats</b></em>' containment reference list.
	 * The list contents are of type {@link Orchestr8.Beat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beats</em>' containment reference list.
	 * @see Orchestr8.Orchestr8Package#getMeasure_Beats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Beat> getBeats();

} // Measure
