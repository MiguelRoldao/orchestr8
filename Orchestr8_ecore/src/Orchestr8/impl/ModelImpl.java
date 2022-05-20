/**
 */
package Orchestr8.impl;

import Orchestr8.Instrument;
import Orchestr8.Mixer;
import Orchestr8.Model;
import Orchestr8.Orchestr8Package;
import Orchestr8.Score;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.impl.ModelImpl#getMixer <em>Mixer</em>}</li>
 *   <li>{@link Orchestr8.impl.ModelImpl#getScores <em>Scores</em>}</li>
 *   <li>{@link Orchestr8.impl.ModelImpl#getInstruments <em>Instruments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getMixer() <em>Mixer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixer()
	 * @generated
	 * @ordered
	 */
	protected Mixer mixer;

	/**
	 * The cached value of the '{@link #getScores() <em>Scores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScores()
	 * @generated
	 * @ordered
	 */
	protected EList<Score> scores;

	/**
	 * The cached value of the '{@link #getInstruments() <em>Instruments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruments()
	 * @generated
	 * @ordered
	 */
	protected EList<Instrument> instruments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Orchestr8Package.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mixer getMixer() {
		return mixer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMixer(Mixer newMixer, NotificationChain msgs) {
		Mixer oldMixer = mixer;
		mixer = newMixer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Orchestr8Package.MODEL__MIXER, oldMixer, newMixer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMixer(Mixer newMixer) {
		if (newMixer != mixer) {
			NotificationChain msgs = null;
			if (mixer != null)
				msgs = ((InternalEObject)mixer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Orchestr8Package.MODEL__MIXER, null, msgs);
			if (newMixer != null)
				msgs = ((InternalEObject)newMixer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Orchestr8Package.MODEL__MIXER, null, msgs);
			msgs = basicSetMixer(newMixer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.MODEL__MIXER, newMixer, newMixer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Score> getScores() {
		if (scores == null) {
			scores = new EObjectContainmentEList<Score>(Score.class, this, Orchestr8Package.MODEL__SCORES);
		}
		return scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instrument> getInstruments() {
		if (instruments == null) {
			instruments = new EObjectContainmentEList<Instrument>(Instrument.class, this, Orchestr8Package.MODEL__INSTRUMENTS);
		}
		return instruments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Orchestr8Package.MODEL__MIXER:
				return basicSetMixer(null, msgs);
			case Orchestr8Package.MODEL__SCORES:
				return ((InternalEList<?>)getScores()).basicRemove(otherEnd, msgs);
			case Orchestr8Package.MODEL__INSTRUMENTS:
				return ((InternalEList<?>)getInstruments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Orchestr8Package.MODEL__MIXER:
				return getMixer();
			case Orchestr8Package.MODEL__SCORES:
				return getScores();
			case Orchestr8Package.MODEL__INSTRUMENTS:
				return getInstruments();
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
			case Orchestr8Package.MODEL__MIXER:
				setMixer((Mixer)newValue);
				return;
			case Orchestr8Package.MODEL__SCORES:
				getScores().clear();
				getScores().addAll((Collection<? extends Score>)newValue);
				return;
			case Orchestr8Package.MODEL__INSTRUMENTS:
				getInstruments().clear();
				getInstruments().addAll((Collection<? extends Instrument>)newValue);
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
			case Orchestr8Package.MODEL__MIXER:
				setMixer((Mixer)null);
				return;
			case Orchestr8Package.MODEL__SCORES:
				getScores().clear();
				return;
			case Orchestr8Package.MODEL__INSTRUMENTS:
				getInstruments().clear();
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
			case Orchestr8Package.MODEL__MIXER:
				return mixer != null;
			case Orchestr8Package.MODEL__SCORES:
				return scores != null && !scores.isEmpty();
			case Orchestr8Package.MODEL__INSTRUMENTS:
				return instruments != null && !instruments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
