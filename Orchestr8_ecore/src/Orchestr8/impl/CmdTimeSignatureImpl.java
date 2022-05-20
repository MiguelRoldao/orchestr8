/**
 */
package Orchestr8.impl;

import Orchestr8.CmdTimeSignature;
import Orchestr8.Orchestr8Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmd Time Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Orchestr8.impl.CmdTimeSignatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link Orchestr8.impl.CmdTimeSignatureImpl#getDenominator <em>Denominator</em>}</li>
 *   <li>{@link Orchestr8.impl.CmdTimeSignatureImpl#getNumerator <em>Numerator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmdTimeSignatureImpl extends MinimalEObjectImpl.Container implements CmdTimeSignature {
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
	 * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final int DENOMINATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected int denominator = DENOMINATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected int numerator = NUMERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdTimeSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Orchestr8Package.Literals.CMD_TIME_SIGNATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.CMD_TIME_SIGNATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(int newDenominator) {
		int oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.CMD_TIME_SIGNATURE__DENOMINATOR, oldDenominator, denominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(int newNumerator) {
		int oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Orchestr8Package.CMD_TIME_SIGNATURE__NUMERATOR, oldNumerator, numerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Orchestr8Package.CMD_TIME_SIGNATURE__TYPE:
				return getType();
			case Orchestr8Package.CMD_TIME_SIGNATURE__DENOMINATOR:
				return getDenominator();
			case Orchestr8Package.CMD_TIME_SIGNATURE__NUMERATOR:
				return getNumerator();
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
			case Orchestr8Package.CMD_TIME_SIGNATURE__TYPE:
				setType((String)newValue);
				return;
			case Orchestr8Package.CMD_TIME_SIGNATURE__DENOMINATOR:
				setDenominator((Integer)newValue);
				return;
			case Orchestr8Package.CMD_TIME_SIGNATURE__NUMERATOR:
				setNumerator((Integer)newValue);
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
			case Orchestr8Package.CMD_TIME_SIGNATURE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Orchestr8Package.CMD_TIME_SIGNATURE__DENOMINATOR:
				setDenominator(DENOMINATOR_EDEFAULT);
				return;
			case Orchestr8Package.CMD_TIME_SIGNATURE__NUMERATOR:
				setNumerator(NUMERATOR_EDEFAULT);
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
			case Orchestr8Package.CMD_TIME_SIGNATURE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Orchestr8Package.CMD_TIME_SIGNATURE__DENOMINATOR:
				return denominator != DENOMINATOR_EDEFAULT;
			case Orchestr8Package.CMD_TIME_SIGNATURE__NUMERATOR:
				return numerator != NUMERATOR_EDEFAULT;
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
		result.append(", denominator: ");
		result.append(denominator);
		result.append(", numerator: ");
		result.append(numerator);
		result.append(')');
		return result.toString();
	}

} //CmdTimeSignatureImpl
