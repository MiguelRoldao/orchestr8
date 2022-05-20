/**
 */
package Orchestr8.impl;

import Orchestr8.Command;
import Orchestr8.Measure;
import Orchestr8.Orchestr8Package;
import Orchestr8.Score;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.impl.ScoreImpl#getBpm <em>Bpm</em>}</li>
 *   <li>{@link Orchestr8.impl.ScoreImpl#getTimeSignature_num <em>Time Signature num</em>}</li>
 *   <li>{@link Orchestr8.impl.ScoreImpl#getSetup <em>Setup</em>}</li>
 *   <li>{@link Orchestr8.impl.ScoreImpl#getEnd <em>End</em>}</li>
 *   <li>{@link Orchestr8.impl.ScoreImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link Orchestr8.impl.ScoreImpl#getTimeSignature_den <em>Time Signature den</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScoreImpl extends NamedElementImpl implements Score {
	/**
	 * The default value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpm()
	 * @generated
	 * @ordered
	 */
	protected static final double BPM_EDEFAULT = 120.0;

	/**
	 * The cached value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpm()
	 * @generated
	 * @ordered
	 */
	protected double bpm = BPM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeSignature_num() <em>Time Signature num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSignature_num()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_SIGNATURE_NUM_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getTimeSignature_num() <em>Time Signature num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSignature_num()
	 * @generated
	 * @ordered
	 */
	protected int timeSignature_num = TIME_SIGNATURE_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> setup;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> end;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The default value of the '{@link #getTimeSignature_den() <em>Time Signature den</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSignature_den()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_SIGNATURE_DEN_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getTimeSignature_den() <em>Time Signature den</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSignature_den()
	 * @generated
	 * @ordered
	 */
	protected int timeSignature_den = TIME_SIGNATURE_DEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Orchestr8Package.Literals.SCORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBpm() {
		return bpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpm(double newBpm) {
		double oldBpm = bpm;
		bpm = newBpm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.SCORE__BPM, oldBpm, bpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeSignature_num() {
		return timeSignature_num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSignature_num(int newTimeSignature_num) {
		int oldTimeSignature_num = timeSignature_num;
		timeSignature_num = newTimeSignature_num;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.SCORE__TIME_SIGNATURE_NUM, oldTimeSignature_num, timeSignature_num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getSetup() {
		if (setup == null) {
			setup = new EObjectContainmentEList<Command>(Command.class, this, Orchestr8Package.SCORE__SETUP);
		}
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getEnd() {
		if (end == null) {
			end = new EObjectContainmentEList<Command>(Command.class, this, Orchestr8Package.SCORE__END);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectContainmentEList<Measure>(Measure.class, this, Orchestr8Package.SCORE__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeSignature_den() {
		return timeSignature_den;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSignature_den(int newTimeSignature_den) {
		int oldTimeSignature_den = timeSignature_den;
		timeSignature_den = newTimeSignature_den;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.SCORE__TIME_SIGNATURE_DEN, oldTimeSignature_den, timeSignature_den));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Orchestr8Package.SCORE__SETUP:
				return ((InternalEList<?>)getSetup()).basicRemove(otherEnd, msgs);
			case Orchestr8Package.SCORE__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case Orchestr8Package.SCORE__MEASURES:
				return ((InternalEList<?>)getMeasures()).basicRemove(otherEnd, msgs);
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
			case Orchestr8Package.SCORE__BPM:
				return getBpm();
			case Orchestr8Package.SCORE__TIME_SIGNATURE_NUM:
				return getTimeSignature_num();
			case Orchestr8Package.SCORE__SETUP:
				return getSetup();
			case Orchestr8Package.SCORE__END:
				return getEnd();
			case Orchestr8Package.SCORE__MEASURES:
				return getMeasures();
			case Orchestr8Package.SCORE__TIME_SIGNATURE_DEN:
				return getTimeSignature_den();
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
			case Orchestr8Package.SCORE__BPM:
				setBpm((Double)newValue);
				return;
			case Orchestr8Package.SCORE__TIME_SIGNATURE_NUM:
				setTimeSignature_num((Integer)newValue);
				return;
			case Orchestr8Package.SCORE__SETUP:
				getSetup().clear();
				getSetup().addAll((Collection<? extends Command>)newValue);
				return;
			case Orchestr8Package.SCORE__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends Command>)newValue);
				return;
			case Orchestr8Package.SCORE__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case Orchestr8Package.SCORE__TIME_SIGNATURE_DEN:
				setTimeSignature_den((Integer)newValue);
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
			case Orchestr8Package.SCORE__BPM:
				setBpm(BPM_EDEFAULT);
				return;
			case Orchestr8Package.SCORE__TIME_SIGNATURE_NUM:
				setTimeSignature_num(TIME_SIGNATURE_NUM_EDEFAULT);
				return;
			case Orchestr8Package.SCORE__SETUP:
				getSetup().clear();
				return;
			case Orchestr8Package.SCORE__END:
				getEnd().clear();
				return;
			case Orchestr8Package.SCORE__MEASURES:
				getMeasures().clear();
				return;
			case Orchestr8Package.SCORE__TIME_SIGNATURE_DEN:
				setTimeSignature_den(TIME_SIGNATURE_DEN_EDEFAULT);
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
			case Orchestr8Package.SCORE__BPM:
				return bpm != BPM_EDEFAULT;
			case Orchestr8Package.SCORE__TIME_SIGNATURE_NUM:
				return timeSignature_num != TIME_SIGNATURE_NUM_EDEFAULT;
			case Orchestr8Package.SCORE__SETUP:
				return setup != null && !setup.isEmpty();
			case Orchestr8Package.SCORE__END:
				return end != null && !end.isEmpty();
			case Orchestr8Package.SCORE__MEASURES:
				return measures != null && !measures.isEmpty();
			case Orchestr8Package.SCORE__TIME_SIGNATURE_DEN:
				return timeSignature_den != TIME_SIGNATURE_DEN_EDEFAULT;
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
		result.append(" (bpm: ");
		result.append(bpm);
		result.append(", timeSignature_num: ");
		result.append(timeSignature_num);
		result.append(", timeSignature_den: ");
		result.append(timeSignature_den);
		result.append(')');
		return result.toString();
	}

} //ScoreImpl
