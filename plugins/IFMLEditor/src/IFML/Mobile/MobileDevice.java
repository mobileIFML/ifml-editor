/**
 */
package IFML.Mobile;

import IFML.Extensions.Device;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.MobileDevice#getScreens <em>Screens</em>}</li>
 *   <li>{@link IFML.Mobile.MobileDevice#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getMobileDevice()
 * @model
 * @generated
 */
public interface MobileDevice extends Device {
	/**
	 * Returns the value of the '<em><b>Screens</b></em>' reference list.
	 * The list contents are of type {@link IFML.Mobile.MobileDeviceScreen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screens</em>' reference list.
	 * @see IFML.Mobile.MobilePackage#getMobileDevice_Screens()
	 * @model
	 * @generated
	 */
	EList<MobileDeviceScreen> getScreens();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' reference list.
	 * The list contents are of type {@link IFML.Mobile.MobileDeviceSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' reference list.
	 * @see IFML.Mobile.MobilePackage#getMobileDevice_Sensors()
	 * @model
	 * @generated
	 */
	EList<MobileDeviceSensor> getSensors();

} // MobileDevice
