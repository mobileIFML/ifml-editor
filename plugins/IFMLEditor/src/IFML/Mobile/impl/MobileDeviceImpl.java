/**
 */
package IFML.Mobile.impl;

import IFML.Extensions.impl.DeviceImpl;

import IFML.Mobile.MobileDevice;
import IFML.Mobile.MobileDeviceScreen;
import IFML.Mobile.MobileDeviceSensor;
import IFML.Mobile.MobilePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.MobileDeviceImpl#getScreens <em>Screens</em>}</li>
 *   <li>{@link IFML.Mobile.impl.MobileDeviceImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobileDeviceImpl extends DeviceImpl implements MobileDevice {
	/**
	 * The cached value of the '{@link #getScreens() <em>Screens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreens()
	 * @generated
	 * @ordered
	 */
	protected EList<MobileDeviceScreen> screens;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<MobileDeviceSensor> sensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.MOBILE_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobileDeviceScreen> getScreens() {
		if (screens == null) {
			screens = new EObjectResolvingEList<MobileDeviceScreen>(MobileDeviceScreen.class, this, MobilePackage.MOBILE_DEVICE__SCREENS);
		}
		return screens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobileDeviceSensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectResolvingEList<MobileDeviceSensor>(MobileDeviceSensor.class, this, MobilePackage.MOBILE_DEVICE__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.MOBILE_DEVICE__SCREENS:
				return getScreens();
			case MobilePackage.MOBILE_DEVICE__SENSORS:
				return getSensors();
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
			case MobilePackage.MOBILE_DEVICE__SCREENS:
				getScreens().clear();
				getScreens().addAll((Collection<? extends MobileDeviceScreen>)newValue);
				return;
			case MobilePackage.MOBILE_DEVICE__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends MobileDeviceSensor>)newValue);
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
			case MobilePackage.MOBILE_DEVICE__SCREENS:
				getScreens().clear();
				return;
			case MobilePackage.MOBILE_DEVICE__SENSORS:
				getSensors().clear();
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
			case MobilePackage.MOBILE_DEVICE__SCREENS:
				return screens != null && !screens.isEmpty();
			case MobilePackage.MOBILE_DEVICE__SENSORS:
				return sensors != null && !sensors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MobileDeviceImpl
