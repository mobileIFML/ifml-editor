/**
 */
package IFML.Mobile.impl;

import IFML.Mobile.GPS;
import IFML.Mobile.MobilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.GPSImpl#isIsAvailable <em>Is Available</em>}</li>
 *   <li>{@link IFML.Mobile.impl.GPSImpl#isIsEnabled <em>Is Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GPSImpl extends MobileDeviceSensorImpl implements GPS {
	/**
	 * The default value of the '{@link #isIsAvailable() <em>Is Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AVAILABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAvailable() <em>Is Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean isAvailable = IS_AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEnabled() <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnabled() <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnabled = IS_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.GPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAvailable() {
		return isAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAvailable(boolean newIsAvailable) {
		boolean oldIsAvailable = isAvailable;
		isAvailable = newIsAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.GPS__IS_AVAILABLE, oldIsAvailable, isAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnabled() {
		return isEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnabled(boolean newIsEnabled) {
		boolean oldIsEnabled = isEnabled;
		isEnabled = newIsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.GPS__IS_ENABLED, oldIsEnabled, isEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.GPS__IS_AVAILABLE:
				return isIsAvailable();
			case MobilePackage.GPS__IS_ENABLED:
				return isIsEnabled();
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
			case MobilePackage.GPS__IS_AVAILABLE:
				setIsAvailable((Boolean)newValue);
				return;
			case MobilePackage.GPS__IS_ENABLED:
				setIsEnabled((Boolean)newValue);
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
			case MobilePackage.GPS__IS_AVAILABLE:
				setIsAvailable(IS_AVAILABLE_EDEFAULT);
				return;
			case MobilePackage.GPS__IS_ENABLED:
				setIsEnabled(IS_ENABLED_EDEFAULT);
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
			case MobilePackage.GPS__IS_AVAILABLE:
				return isAvailable != IS_AVAILABLE_EDEFAULT;
			case MobilePackage.GPS__IS_ENABLED:
				return isEnabled != IS_ENABLED_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAvailable: ");
		result.append(isAvailable);
		result.append(", isEnabled: ");
		result.append(isEnabled);
		result.append(')');
		return result.toString();
	}

} //GPSImpl
