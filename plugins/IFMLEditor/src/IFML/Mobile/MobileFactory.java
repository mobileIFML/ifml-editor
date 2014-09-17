/**
 */
package IFML.Mobile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobilePackage
 * @generated
 */
public interface MobileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobileFactory eINSTANCE = IFML.Mobile.impl.MobileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen</em>'.
	 * @generated
	 */
	Screen createScreen();

	/**
	 * Returns a new object of class '<em>View Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Component</em>'.
	 * @generated
	 */
	MobileViewComponent createMobileViewComponent();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	MobileMessage createMobileMessage();

	/**
	 * Returns a new object of class '<em>Search View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search View</em>'.
	 * @generated
	 */
	SearchView createSearchView();

	/**
	 * Returns a new object of class '<em>Touch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touch Event</em>'.
	 * @generated
	 */
	TouchEvent createTouchEvent();

	/**
	 * Returns a new object of class '<em>Long Press Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Press Event</em>'.
	 * @generated
	 */
	LongPressEvent createLongPressEvent();

	/**
	 * Returns a new object of class '<em>Pan Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pan Event</em>'.
	 * @generated
	 */
	PanEvent createPanEvent();

	/**
	 * Returns a new object of class '<em>Pinch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pinch Event</em>'.
	 * @generated
	 */
	PinchEvent createPinchEvent();

	/**
	 * Returns a new object of class '<em>Spread Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spread Event</em>'.
	 * @generated
	 */
	SpreadEvent createSpreadEvent();

	/**
	 * Returns a new object of class '<em>Swipe Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swipe Event</em>'.
	 * @generated
	 */
	SwipeEvent createSwipeEvent();

	/**
	 * Returns a new object of class '<em>Tap Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tap Event</em>'.
	 * @generated
	 */
	TapEvent createTapEvent();

	/**
	 * Returns a new object of class '<em>Camera Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Action</em>'.
	 * @generated
	 */
	CameraAction createCameraAction();

	/**
	 * Returns a new object of class '<em>Microphone Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microphone Action</em>'.
	 * @generated
	 */
	MicrophoneAction createMicrophoneAction();

	/**
	 * Returns a new object of class '<em>Camera Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Action Event</em>'.
	 * @generated
	 */
	CameraActionEvent createCameraActionEvent();

	/**
	 * Returns a new object of class '<em>Microphone Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microphone Action Event</em>'.
	 * @generated
	 */
	MicrophoneActionEvent createMicrophoneActionEvent();

	/**
	 * Returns a new object of class '<em>Battery Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Event</em>'.
	 * @generated
	 */
	BatteryEvent createBatteryEvent();

	/**
	 * Returns a new object of class '<em>Connection Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Event</em>'.
	 * @generated
	 */
	ConnectionEvent createConnectionEvent();

	/**
	 * Returns a new object of class '<em>Memory Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Event</em>'.
	 * @generated
	 */
	MemoryEvent createMemoryEvent();

	/**
	 * Returns a new object of class '<em>Accelerometer Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accelerometer Event</em>'.
	 * @generated
	 */
	AccelerometerEvent createAccelerometerEvent();

	/**
	 * Returns a new object of class '<em>Gyroscope Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gyroscope Event</em>'.
	 * @generated
	 */
	GyroscopeEvent createGyroscopeEvent();

	/**
	 * Returns a new object of class '<em>Location Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Event</em>'.
	 * @generated
	 */
	LocationEvent createLocationEvent();

	/**
	 * Returns a new object of class '<em>Magnetometer Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Magnetometer Event</em>'.
	 * @generated
	 */
	MagnetometerEvent createMagnetometerEvent();

	/**
	 * Returns a new object of class '<em>Motion Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motion Event</em>'.
	 * @generated
	 */
	MotionEvent createMotionEvent();

	/**
	 * Returns a new object of class '<em>Orientation Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orientation Event</em>'.
	 * @generated
	 */
	OrientationEvent createOrientationEvent();

	/**
	 * Returns a new object of class '<em>Proximity Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proximity Event</em>'.
	 * @generated
	 */
	ProximityEvent createProximityEvent();

	/**
	 * Returns a new object of class '<em>Rotate Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate Event</em>'.
	 * @generated
	 */
	RotateEvent createRotateEvent();

	/**
	 * Returns a new object of class '<em>Shake Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shake Event</em>'.
	 * @generated
	 */
	ShakeEvent createShakeEvent();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	MobileDevice createMobileDevice();

	/**
	 * Returns a new object of class '<em>Device Screen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Screen</em>'.
	 * @generated
	 */
	MobileDeviceScreen createMobileDeviceScreen();

	/**
	 * Returns a new object of class '<em>Accelerometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accelerometer</em>'.
	 * @generated
	 */
	Accelerometer createAccelerometer();

	/**
	 * Returns a new object of class '<em>GPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS</em>'.
	 * @generated
	 */
	GPS createGPS();

	/**
	 * Returns a new object of class '<em>Gyroscope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gyroscope</em>'.
	 * @generated
	 */
	Gyroscope createGyroscope();

	/**
	 * Returns a new object of class '<em>Magnetometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Magnetometer</em>'.
	 * @generated
	 */
	Magnetometer createMagnetometer();

	/**
	 * Returns a new object of class '<em>Microphone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microphone</em>'.
	 * @generated
	 */
	Microphone createMicrophone();

	/**
	 * Returns a new object of class '<em>Proximity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proximity Sensor</em>'.
	 * @generated
	 */
	ProximitySensor createProximitySensor();

	/**
	 * Returns a new object of class '<em>Still Camera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Still Camera</em>'.
	 * @generated
	 */
	StillCamera createStillCamera();

	/**
	 * Returns a new object of class '<em>Video Camera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Camera</em>'.
	 * @generated
	 */
	VideoCamera createVideoCamera();

	/**
	 * Returns a new object of class '<em>Acceleration X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceleration X</em>'.
	 * @generated
	 */
	AccelerationX createAccelerationX();

	/**
	 * Returns a new object of class '<em>Acceleration Y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceleration Y</em>'.
	 * @generated
	 */
	AccelerationY createAccelerationY();

	/**
	 * Returns a new object of class '<em>Acceleration Z</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceleration Z</em>'.
	 * @generated
	 */
	AccelerationZ createAccelerationZ();

	/**
	 * Returns a new object of class '<em>Altitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Altitude</em>'.
	 * @generated
	 */
	Altitude createAltitude();

	/**
	 * Returns a new object of class '<em>Horizontal Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Accuracy</em>'.
	 * @generated
	 */
	HorizontalAccuracy createHorizontalAccuracy();

	/**
	 * Returns a new object of class '<em>Latitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latitude</em>'.
	 * @generated
	 */
	Latitude createLatitude();

	/**
	 * Returns a new object of class '<em>Longitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Longitude</em>'.
	 * @generated
	 */
	Longitude createLongitude();

	/**
	 * Returns a new object of class '<em>Speed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speed</em>'.
	 * @generated
	 */
	Speed createSpeed();

	/**
	 * Returns a new object of class '<em>Vertical Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertical Accuracy</em>'.
	 * @generated
	 */
	VerticalAccuracy createVerticalAccuracy();

	/**
	 * Returns a new object of class '<em>Pitch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pitch</em>'.
	 * @generated
	 */
	Pitch createPitch();

	/**
	 * Returns a new object of class '<em>Roll</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roll</em>'.
	 * @generated
	 */
	Roll createRoll();

	/**
	 * Returns a new object of class '<em>Yaw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yaw</em>'.
	 * @generated
	 */
	Yaw createYaw();

	/**
	 * Returns a new object of class '<em>Battery Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Level</em>'.
	 * @generated
	 */
	BatteryLevel createBatteryLevel();

	/**
	 * Returns a new object of class '<em>Battery Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery Status</em>'.
	 * @generated
	 */
	BatteryStatus createBatteryStatus();

	/**
	 * Returns a new object of class '<em>Bluetooth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bluetooth</em>'.
	 * @generated
	 */
	Bluetooth createBluetooth();

	/**
	 * Returns a new object of class '<em>Cellular</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cellular</em>'.
	 * @generated
	 */
	Cellular createCellular();

	/**
	 * Returns a new object of class '<em>Wi Fi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wi Fi</em>'.
	 * @generated
	 */
	WiFi createWiFi();

	/**
	 * Returns a new object of class '<em>Magnetic Heading Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Magnetic Heading Direction</em>'.
	 * @generated
	 */
	MagneticHeadingDirection createMagneticHeadingDirection();

	/**
	 * Returns a new object of class '<em>Magnetic Heading Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Magnetic Heading Accuracy</em>'.
	 * @generated
	 */
	MagneticHeadingAccuracy createMagneticHeadingAccuracy();

	/**
	 * Returns a new object of class '<em>True Heading Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Heading Direction</em>'.
	 * @generated
	 */
	TrueHeadingDirection createTrueHeadingDirection();

	/**
	 * Returns a new object of class '<em>Rotation X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation X</em>'.
	 * @generated
	 */
	RotationX createRotationX();

	/**
	 * Returns a new object of class '<em>Rotation Y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation Y</em>'.
	 * @generated
	 */
	RotationY createRotationY();

	/**
	 * Returns a new object of class '<em>Rotation Z</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation Z</em>'.
	 * @generated
	 */
	RotationZ createRotationZ();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MobilePackage getMobilePackage();

} //MobileFactory
