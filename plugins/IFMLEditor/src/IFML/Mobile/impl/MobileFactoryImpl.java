/**
 */
package IFML.Mobile.impl;

import IFML.Mobile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobileFactoryImpl extends EFactoryImpl implements MobileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobileFactory init() {
		try {
			MobileFactory theMobileFactory = (MobileFactory)EPackage.Registry.INSTANCE.getEFactory(MobilePackage.eNS_URI);
			if (theMobileFactory != null) {
				return theMobileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MobileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MobilePackage.SCREEN: return createScreen();
			case MobilePackage.MOBILE_VIEW_COMPONENT: return createMobileViewComponent();
			case MobilePackage.MOBILE_MESSAGE: return createMobileMessage();
			case MobilePackage.SEARCH_VIEW: return createSearchView();
			case MobilePackage.TOUCH_EVENT: return createTouchEvent();
			case MobilePackage.LONG_PRESS_EVENT: return createLongPressEvent();
			case MobilePackage.PAN_EVENT: return createPanEvent();
			case MobilePackage.PINCH_EVENT: return createPinchEvent();
			case MobilePackage.SWIPE_EVENT: return createSwipeEvent();
			case MobilePackage.TAP_EVENT: return createTapEvent();
			case MobilePackage.CAMERA_ACTION: return createCameraAction();
			case MobilePackage.MICROPHONE_ACTION: return createMicrophoneAction();
			case MobilePackage.CAMERA_ACTION_EVENT: return createCameraActionEvent();
			case MobilePackage.MICROPHONE_ACTION_EVENT: return createMicrophoneActionEvent();
			case MobilePackage.BATTERY_EVENT: return createBatteryEvent();
			case MobilePackage.CONNECTION_EVENT: return createConnectionEvent();
			case MobilePackage.MEMORY_EVENT: return createMemoryEvent();
			case MobilePackage.ACCELEROMETER_EVENT: return createAccelerometerEvent();
			case MobilePackage.GYROSCOPE_EVENT: return createGyroscopeEvent();
			case MobilePackage.LOCATION_EVENT: return createLocationEvent();
			case MobilePackage.MAGNETOMETER_EVENT: return createMagnetometerEvent();
			case MobilePackage.MOTION_EVENT: return createMotionEvent();
			case MobilePackage.ORIENTATION_EVENT: return createOrientationEvent();
			case MobilePackage.PROXIMITY_EVENT: return createProximityEvent();
			case MobilePackage.ROTATE_EVENT: return createRotateEvent();
			case MobilePackage.SHAKE_EVENT: return createShakeEvent();
			case MobilePackage.MOBILE_DEVICE: return createMobileDevice();
			case MobilePackage.MOBILE_DEVICE_SCREEN: return createMobileDeviceScreen();
			case MobilePackage.ACCELEROMETER: return createAccelerometer();
			case MobilePackage.GPS: return createGPS();
			case MobilePackage.GYROSCOPE: return createGyroscope();
			case MobilePackage.MAGNETOMETER: return createMagnetometer();
			case MobilePackage.MICROPHONE: return createMicrophone();
			case MobilePackage.PROXIMITY_SENSOR: return createProximitySensor();
			case MobilePackage.STILL_CAMERA: return createStillCamera();
			case MobilePackage.VIDEO_CAMERA: return createVideoCamera();
			case MobilePackage.ACCELERATION_X: return createAccelerationX();
			case MobilePackage.ACCELERATION_Y: return createAccelerationY();
			case MobilePackage.ACCELERATION_Z: return createAccelerationZ();
			case MobilePackage.ALTITUDE: return createAltitude();
			case MobilePackage.HORIZONTAL_ACCURACY: return createHorizontalAccuracy();
			case MobilePackage.LATITUDE: return createLatitude();
			case MobilePackage.LONGITUDE: return createLongitude();
			case MobilePackage.SPEED: return createSpeed();
			case MobilePackage.VERTICAL_ACCURACY: return createVerticalAccuracy();
			case MobilePackage.PITCH: return createPitch();
			case MobilePackage.ROLL: return createRoll();
			case MobilePackage.YAW: return createYaw();
			case MobilePackage.BATTERY_LEVEL: return createBatteryLevel();
			case MobilePackage.BATTERY_STATUS: return createBatteryStatus();
			case MobilePackage.BLUETOOTH: return createBluetooth();
			case MobilePackage.CELLULAR: return createCellular();
			case MobilePackage.WI_FI: return createWiFi();
			case MobilePackage.MAGNETIC_HEADING_DIRECTION: return createMagneticHeadingDirection();
			case MobilePackage.MAGNETIC_HEADING_ACCURACY: return createMagneticHeadingAccuracy();
			case MobilePackage.TRUE_HEADING_DIRECTION: return createTrueHeadingDirection();
			case MobilePackage.ROTATION_X: return createRotationX();
			case MobilePackage.ROTATION_Y: return createRotationY();
			case MobilePackage.ROTATION_Z: return createRotationZ();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MobilePackage.SWIPE_DIRECTION:
				return createSwipeDirectionFromString(eDataType, initialValue);
			case MobilePackage.BATTERY_STATUS_DESCRIPTION:
				return createBatteryStatusDescriptionFromString(eDataType, initialValue);
			case MobilePackage.ORIENTATION_DESCRIPTION:
				return createOrientationDescriptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MobilePackage.SWIPE_DIRECTION:
				return convertSwipeDirectionToString(eDataType, instanceValue);
			case MobilePackage.BATTERY_STATUS_DESCRIPTION:
				return convertBatteryStatusDescriptionToString(eDataType, instanceValue);
			case MobilePackage.ORIENTATION_DESCRIPTION:
				return convertOrientationDescriptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen createScreen() {
		ScreenImpl screen = new ScreenImpl();
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileViewComponent createMobileViewComponent() {
		MobileViewComponentImpl mobileViewComponent = new MobileViewComponentImpl();
		return mobileViewComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileMessage createMobileMessage() {
		MobileMessageImpl mobileMessage = new MobileMessageImpl();
		return mobileMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchView createSearchView() {
		SearchViewImpl searchView = new SearchViewImpl();
		return searchView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchEvent createTouchEvent() {
		TouchEventImpl touchEvent = new TouchEventImpl();
		return touchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongPressEvent createLongPressEvent() {
		LongPressEventImpl longPressEvent = new LongPressEventImpl();
		return longPressEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanEvent createPanEvent() {
		PanEventImpl panEvent = new PanEventImpl();
		return panEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinchEvent createPinchEvent() {
		PinchEventImpl pinchEvent = new PinchEventImpl();
		return pinchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwipeEvent createSwipeEvent() {
		SwipeEventImpl swipeEvent = new SwipeEventImpl();
		return swipeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapEvent createTapEvent() {
		TapEventImpl tapEvent = new TapEventImpl();
		return tapEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraAction createCameraAction() {
		CameraActionImpl cameraAction = new CameraActionImpl();
		return cameraAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrophoneAction createMicrophoneAction() {
		MicrophoneActionImpl microphoneAction = new MicrophoneActionImpl();
		return microphoneAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraActionEvent createCameraActionEvent() {
		CameraActionEventImpl cameraActionEvent = new CameraActionEventImpl();
		return cameraActionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrophoneActionEvent createMicrophoneActionEvent() {
		MicrophoneActionEventImpl microphoneActionEvent = new MicrophoneActionEventImpl();
		return microphoneActionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryEvent createBatteryEvent() {
		BatteryEventImpl batteryEvent = new BatteryEventImpl();
		return batteryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionEvent createConnectionEvent() {
		ConnectionEventImpl connectionEvent = new ConnectionEventImpl();
		return connectionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryEvent createMemoryEvent() {
		MemoryEventImpl memoryEvent = new MemoryEventImpl();
		return memoryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccelerometerEvent createAccelerometerEvent() {
		AccelerometerEventImpl accelerometerEvent = new AccelerometerEventImpl();
		return accelerometerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GyroscopeEvent createGyroscopeEvent() {
		GyroscopeEventImpl gyroscopeEvent = new GyroscopeEventImpl();
		return gyroscopeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationEvent createLocationEvent() {
		LocationEventImpl locationEvent = new LocationEventImpl();
		return locationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagnetometerEvent createMagnetometerEvent() {
		MagnetometerEventImpl magnetometerEvent = new MagnetometerEventImpl();
		return magnetometerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionEvent createMotionEvent() {
		MotionEventImpl motionEvent = new MotionEventImpl();
		return motionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationEvent createOrientationEvent() {
		OrientationEventImpl orientationEvent = new OrientationEventImpl();
		return orientationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProximityEvent createProximityEvent() {
		ProximityEventImpl proximityEvent = new ProximityEventImpl();
		return proximityEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateEvent createRotateEvent() {
		RotateEventImpl rotateEvent = new RotateEventImpl();
		return rotateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShakeEvent createShakeEvent() {
		ShakeEventImpl shakeEvent = new ShakeEventImpl();
		return shakeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileDevice createMobileDevice() {
		MobileDeviceImpl mobileDevice = new MobileDeviceImpl();
		return mobileDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileDeviceScreen createMobileDeviceScreen() {
		MobileDeviceScreenImpl mobileDeviceScreen = new MobileDeviceScreenImpl();
		return mobileDeviceScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accelerometer createAccelerometer() {
		AccelerometerImpl accelerometer = new AccelerometerImpl();
		return accelerometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPS createGPS() {
		GPSImpl gps = new GPSImpl();
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gyroscope createGyroscope() {
		GyroscopeImpl gyroscope = new GyroscopeImpl();
		return gyroscope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Magnetometer createMagnetometer() {
		MagnetometerImpl magnetometer = new MagnetometerImpl();
		return magnetometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microphone createMicrophone() {
		MicrophoneImpl microphone = new MicrophoneImpl();
		return microphone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProximitySensor createProximitySensor() {
		ProximitySensorImpl proximitySensor = new ProximitySensorImpl();
		return proximitySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StillCamera createStillCamera() {
		StillCameraImpl stillCamera = new StillCameraImpl();
		return stillCamera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoCamera createVideoCamera() {
		VideoCameraImpl videoCamera = new VideoCameraImpl();
		return videoCamera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccelerationX createAccelerationX() {
		AccelerationXImpl accelerationX = new AccelerationXImpl();
		return accelerationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccelerationY createAccelerationY() {
		AccelerationYImpl accelerationY = new AccelerationYImpl();
		return accelerationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccelerationZ createAccelerationZ() {
		AccelerationZImpl accelerationZ = new AccelerationZImpl();
		return accelerationZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Altitude createAltitude() {
		AltitudeImpl altitude = new AltitudeImpl();
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalAccuracy createHorizontalAccuracy() {
		HorizontalAccuracyImpl horizontalAccuracy = new HorizontalAccuracyImpl();
		return horizontalAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latitude createLatitude() {
		LatitudeImpl latitude = new LatitudeImpl();
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Longitude createLongitude() {
		LongitudeImpl longitude = new LongitudeImpl();
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed createSpeed() {
		SpeedImpl speed = new SpeedImpl();
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAccuracy createVerticalAccuracy() {
		VerticalAccuracyImpl verticalAccuracy = new VerticalAccuracyImpl();
		return verticalAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pitch createPitch() {
		PitchImpl pitch = new PitchImpl();
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roll createRoll() {
		RollImpl roll = new RollImpl();
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yaw createYaw() {
		YawImpl yaw = new YawImpl();
		return yaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryLevel createBatteryLevel() {
		BatteryLevelImpl batteryLevel = new BatteryLevelImpl();
		return batteryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryStatus createBatteryStatus() {
		BatteryStatusImpl batteryStatus = new BatteryStatusImpl();
		return batteryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bluetooth createBluetooth() {
		BluetoothImpl bluetooth = new BluetoothImpl();
		return bluetooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cellular createCellular() {
		CellularImpl cellular = new CellularImpl();
		return cellular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiFi createWiFi() {
		WiFiImpl wiFi = new WiFiImpl();
		return wiFi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagneticHeadingDirection createMagneticHeadingDirection() {
		MagneticHeadingDirectionImpl magneticHeadingDirection = new MagneticHeadingDirectionImpl();
		return magneticHeadingDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagneticHeadingAccuracy createMagneticHeadingAccuracy() {
		MagneticHeadingAccuracyImpl magneticHeadingAccuracy = new MagneticHeadingAccuracyImpl();
		return magneticHeadingAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueHeadingDirection createTrueHeadingDirection() {
		TrueHeadingDirectionImpl trueHeadingDirection = new TrueHeadingDirectionImpl();
		return trueHeadingDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationX createRotationX() {
		RotationXImpl rotationX = new RotationXImpl();
		return rotationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationY createRotationY() {
		RotationYImpl rotationY = new RotationYImpl();
		return rotationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationZ createRotationZ() {
		RotationZImpl rotationZ = new RotationZImpl();
		return rotationZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwipeDirection createSwipeDirectionFromString(EDataType eDataType, String initialValue) {
		SwipeDirection result = SwipeDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwipeDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryStatusDescription createBatteryStatusDescriptionFromString(EDataType eDataType, String initialValue) {
		BatteryStatusDescription result = BatteryStatusDescription.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBatteryStatusDescriptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationDescription createOrientationDescriptionFromString(EDataType eDataType, String initialValue) {
		OrientationDescription result = OrientationDescription.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationDescriptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePackage getMobilePackage() {
		return (MobilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MobilePackage getPackage() {
		return MobilePackage.eINSTANCE;
	}

} //MobileFactoryImpl
