/**
 */
package Orchestr8.impl;

import Orchestr8.Mixer;
import Orchestr8.Orchestr8Package;
import Orchestr8.Score;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.impl.MixerImpl#getSampling_rate <em>Sampling rate</em>}</li>
 *   <li>{@link Orchestr8.impl.MixerImpl#getScores <em>Scores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MixerImpl extends NamedElementImpl implements Mixer {
	/**
	 * The default value of the '{@link #getSampling_rate() <em>Sampling rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampling_rate()
	 * @generated
	 * @ordered
	 */
	protected static final int SAMPLING_RATE_EDEFAULT = 48000;

	/**
	 * The cached value of the '{@link #getSampling_rate() <em>Sampling rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampling_rate()
	 * @generated
	 * @ordered
	 */
	protected int sampling_rate = SAMPLING_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScores() <em>Scores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScores()
	 * @generated
	 * @ordered
	 */
	protected EList<Score> scores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MixerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Orchestr8Package.Literals.MIXER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSampling_rate() {
		return sampling_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampling_rate(int newSampling_rate) {
		int oldSampling_rate = sampling_rate;
		sampling_rate = newSampling_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.MIXER__SAMPLING_RATE, oldSampling_rate, sampling_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Score> getScores() {
		if (scores == null) {
			scores = new EObjectResolvingEList<Score>(Score.class, this, Orchestr8Package.MIXER__SCORES);
		}
		return scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Orchestr8Package.MIXER__SAMPLING_RATE:
				return getSampling_rate();
			case Orchestr8Package.MIXER__SCORES:
				return getScores();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Orchestr8Package.MIXER__SAMPLING_RATE:
				setSampling_rate((Integer)newValue);
				return;
			case Orchestr8Package.MIXER__SCORES:
				getScores().clear();
				getScores().addAll((Collection<? extends Score>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Orchestr8Package.MIXER__SAMPLING_RATE:
				setSampling_rate(SAMPLING_RATE_EDEFAULT);
				return;
			case Orchestr8Package.MIXER__SCORES:
				getScores().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Orchestr8Package.MIXER__SAMPLING_RATE:
				return sampling_rate != SAMPLING_RATE_EDEFAULT;
			case Orchestr8Package.MIXER__SCORES:
				return scores != null && !scores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sampling_rate: ");
		result.append(sampling_rate);
		result.append(')');
		return result.toString();
	}

} //MixerImpl
