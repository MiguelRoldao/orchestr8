/**
 */
package Orchestr8;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instrument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.Instrument#getGenerator <em>Generator</em>}</li>
 *   <li>{@link Orchestr8.Instrument#getVolume <em>Volume</em>}</li>
 *   <li>{@link Orchestr8.Instrument#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link Orchestr8.Instrument#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see Orchestr8.Orchestr8Package#getInstrument()
 * @model
 * @generated
 */
public interface Instrument extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference.
	 * @see #setGenerator(Generator)
	 * @see Orchestr8.Orchestr8Package#getInstrument_Generator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * Sets the value of the '{@link Orchestr8.Instrument#getGenerator <em>Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' containment reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(double)
	 * @see Orchestr8.Orchestr8Package#getInstrument_Volume()
	 * @model default="0.0"
	 * @generated
	 */
	double getVolume();

	/**
	 * Sets the value of the '{@link Orchestr8.Instrument#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(double value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * The default value is <code>"440.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(double)
	 * @see Orchestr8.Orchestr8Package#getInstrument_Frequency()
	 * @model default="440.0"
	 * @generated
	 */
	double getFrequency();

	/**
	 * Sets the value of the '{@link Orchestr8.Instrument#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(double value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Orchestr8.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see Orchestr8.Orchestr8Package#getInstrument_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Instrument
