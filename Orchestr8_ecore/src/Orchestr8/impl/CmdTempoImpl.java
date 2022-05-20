/**
 */
package Orchestr8.impl;

import Orchestr8.CmdTempo;
import Orchestr8.Orchestr8Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmd Tempo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.impl.CmdTempoImpl#getType <em>Type</em>}</li>
 *   <li>{@link Orchestr8.impl.CmdTempoImpl#getBpm <em>Bpm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmdTempoImpl extends MinimalEObjectImpl.Container implements CmdTempo {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpm()
	 * @generated
	 * @ordered
	 */
	protected static final int BPM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpm()
	 * @generated
	 * @ordered
	 */
	protected int bpm = BPM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdTempoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Orchestr8Package.Literals.CMD_TEMPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.CMD_TEMPO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBpm() {
		return bpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpm(int newBpm) {
		int oldBpm = bpm;
		bpm = newBpm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.CMD_TEMPO__BPM, oldBpm, bpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Orchestr8Package.CMD_TEMPO__TYPE:
				return getType();
			case Orchestr8Package.CMD_TEMPO__BPM:
				return getBpm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Orchestr8Package.CMD_TEMPO__TYPE:
				setType((String)newValue);
				return;
			case Orchestr8Package.CMD_TEMPO__BPM:
				setBpm((Integer)newValue);
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
			case Orchestr8Package.CMD_TEMPO__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Orchestr8Package.CMD_TEMPO__BPM:
				setBpm(BPM_EDEFAULT);
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
			case Orchestr8Package.CMD_TEMPO__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Orchestr8Package.CMD_TEMPO__BPM:
				return bpm != BPM_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", bpm: ");
		result.append(bpm);
		result.append(')');
		return result.toString();
	}

} //CmdTempoImpl
