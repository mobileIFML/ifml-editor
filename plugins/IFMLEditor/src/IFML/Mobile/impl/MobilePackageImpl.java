/**
 */
package IFML.Mobile.impl;

import IFML.Core.CorePackage;

import IFML.Core.impl.CorePackageImpl;

import IFML.DataTypes.DataTypesPackage;

import IFML.DataTypes.impl.DataTypesPackageImpl;

import IFML.Extensions.ExtensionsPackage;

import IFML.Extensions.impl.ExtensionsPackageImpl;

import IFML.Mobile.Acceleration;
import IFML.Mobile.AccelerationX;
import IFML.Mobile.AccelerationY;
import IFML.Mobile.AccelerationZ;
import IFML.Mobile.Accelerometer;
import IFML.Mobile.AccelerometerEvent;
import IFML.Mobile.Altitude;
import IFML.Mobile.Attitude;
import IFML.Mobile.Battery;
import IFML.Mobile.BatteryEvent;
import IFML.Mobile.BatteryLevel;
import IFML.Mobile.BatteryStatus;
import IFML.Mobile.BatteryStatusDescription;
import IFML.Mobile.Bluetooth;
import IFML.Mobile.CameraAction;
import IFML.Mobile.CameraActionEvent;
import IFML.Mobile.Cellular;
import IFML.Mobile.ConnectionEvent;
import IFML.Mobile.Direction;
import IFML.Mobile.Gyroscope;
import IFML.Mobile.GyroscopeEvent;
import IFML.Mobile.HorizontalAccuracy;
import IFML.Mobile.Latitude;
import IFML.Mobile.Location;
import IFML.Mobile.LocationEvent;
import IFML.Mobile.LongPressEvent;
import IFML.Mobile.Longitude;
import IFML.Mobile.MagneticHeadingAccuracy;
import IFML.Mobile.MagneticHeadingDirection;
import IFML.Mobile.Magnetometer;
import IFML.Mobile.MagnetometerEvent;
import IFML.Mobile.MemoryEvent;
import IFML.Mobile.Microphone;
import IFML.Mobile.MicrophoneAction;
import IFML.Mobile.MicrophoneActionEvent;
import IFML.Mobile.MobileAction;
import IFML.Mobile.MobileActionEvent;
import IFML.Mobile.MobileContextVariable;
import IFML.Mobile.MobileDevice;
import IFML.Mobile.MobileDeviceScreen;
import IFML.Mobile.MobileDeviceSensor;
import IFML.Mobile.MobileFactory;
import IFML.Mobile.MobileMessage;
import IFML.Mobile.MobilePackage;
import IFML.Mobile.MobileResourceEvent;
import IFML.Mobile.MobileSensorEvent;
import IFML.Mobile.MobileSystemEvent;
import IFML.Mobile.MobileViewComponent;
import IFML.Mobile.MobileViewContainer;
import IFML.Mobile.MobileViewElementEvent;
import IFML.Mobile.MotionEvent;
import IFML.Mobile.Network;
import IFML.Mobile.OrientationDescription;
import IFML.Mobile.OrientationEvent;
import IFML.Mobile.PanEvent;
import IFML.Mobile.PinchEvent;
import IFML.Mobile.Pitch;
import IFML.Mobile.ProximityEvent;
import IFML.Mobile.ProximitySensor;
import IFML.Mobile.Roll;
import IFML.Mobile.RotateEvent;
import IFML.Mobile.Rotation;
import IFML.Mobile.RotationX;
import IFML.Mobile.RotationY;
import IFML.Mobile.RotationZ;
import IFML.Mobile.Screen;
import IFML.Mobile.SearchView;
import IFML.Mobile.ShakeEvent;
import IFML.Mobile.Speed;
import IFML.Mobile.StillCamera;
import IFML.Mobile.SwipeDirection;
import IFML.Mobile.SwipeEvent;
import IFML.Mobile.TapEvent;
import IFML.Mobile.TouchEvent;
import IFML.Mobile.TrueHeadingDirection;
import IFML.Mobile.VerticalAccuracy;
import IFML.Mobile.VideoCamera;
import IFML.Mobile.WiFi;
import IFML.Mobile.Yaw;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobilePackageImpl extends EPackageImpl implements MobilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileViewContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileViewComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileViewElementEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longPressEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swipeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microphoneActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileActionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraActionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microphoneActionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileSystemEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileResourceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileSensorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerometerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gyroscopeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magnetometerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientationEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proximityEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shakeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileDeviceScreenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileDeviceSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gyroscopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magnetometerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microphoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proximitySensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stillCameraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoCameraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileContextVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerationXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerationYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accelerationZEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalAccuracyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalAccuracyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rollEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiFiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magneticHeadingDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass magneticHeadingAccuracyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueHeadingDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationZEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum swipeDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum batteryStatusDescriptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationDescriptionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see IFML.Mobile.MobilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MobilePackageImpl() {
		super(eNS_URI, MobileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MobilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MobilePackage init() {
		if (isInited) return (MobilePackage)EPackage.Registry.INSTANCE.getEPackage(MobilePackage.eNS_URI);

		// Obtain or create and register package
		MobilePackageImpl theMobilePackage = (MobilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MobilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MobilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theMobilePackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theMobilePackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMobilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MobilePackage.eNS_URI, theMobilePackage);
		return theMobilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileViewContainer() {
		return mobileViewContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileViewContainer_IsMobileSystem() {
		return (EAttribute)mobileViewContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreen() {
		return screenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_IsModal() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_HasNavBar() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileViewComponent() {
		return mobileViewComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileViewComponent_IsMobileSystem() {
		return (EAttribute)mobileViewComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileMessage() {
		return mobileMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchView() {
		return searchViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileViewElementEvent() {
		return mobileViewElementEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchEvent() {
		return touchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongPressEvent() {
		return longPressEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongPressEvent_PressDuration() {
		return (EAttribute)longPressEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongPressEvent_FingersCount() {
		return (EAttribute)longPressEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanEvent() {
		return panEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPanEvent_FingersCount() {
		return (EAttribute)panEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinchEvent() {
		return pinchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwipeEvent() {
		return swipeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwipeEvent_SwipeDirection() {
		return (EAttribute)swipeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTapEvent() {
		return tapEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileAction() {
		return mobileActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraAction() {
		return cameraActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrophoneAction() {
		return microphoneActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileActionEvent() {
		return mobileActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraActionEvent() {
		return cameraActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrophoneActionEvent() {
		return microphoneActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileSystemEvent() {
		return mobileSystemEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileResourceEvent() {
		return mobileResourceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryEvent() {
		return batteryEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionEvent() {
		return connectionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryEvent() {
		return memoryEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileSensorEvent() {
		return mobileSensorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccelerometerEvent() {
		return accelerometerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGyroscopeEvent() {
		return gyroscopeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationEvent() {
		return locationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMagnetometerEvent() {
		return magnetometerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionEvent() {
		return motionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientationEvent() {
		return orientationEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProximityEvent() {
		return proximityEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotateEvent() {
		return rotateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShakeEvent() {
		return shakeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileDevice() {
		return mobileDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobileDevice_Screens() {
		return (EReference)mobileDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobileDevice_Sensors() {
		return (EReference)mobileDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileDeviceScreen() {
		return mobileDeviceScreenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileDeviceScreen_Heigt() {
		return (EAttribute)mobileDeviceScreenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileDeviceScreen_Width() {
		return (EAttribute)mobileDeviceScreenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileDeviceScreen_Density() {
		return (EAttribute)mobileDeviceScreenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileDeviceSensor() {
		return mobileDeviceSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccelerometer() {
		return accelerometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPS() {
		return gpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_IsAvailable() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPS_IsEnabled() {
		return (EAttribute)gpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGyroscope() {
		return gyroscopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGyroscope_IsAvailable() {
		return (EAttribute)gyroscopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMagnetometer() {
		return magnetometerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagnetometer_IsAvailable() {
		return (EAttribute)magnetometerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrophone() {
		return microphoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicrophone_IsAvailable() {
		return (EAttribute)microphoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProximitySensor() {
		return proximitySensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProximitySensor_IsAvailable() {
		return (EAttribute)proximitySensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStillCamera() {
		return stillCameraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStillCamera_Front() {
		return (EAttribute)stillCameraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStillCamera_Rear() {
		return (EAttribute)stillCameraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoCamera() {
		return videoCameraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoCamera_Rear() {
		return (EAttribute)videoCameraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoCamera_Front() {
		return (EAttribute)videoCameraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileContextVariable() {
		return mobileContextVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceleration() {
		return accelerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceleration_IsAvailable() {
		return (EAttribute)accelerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccelerationX() {
		return accelerationXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccelerationX_Value() {
		return (EAttribute)accelerationXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccelerationY() {
		return accelerationYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccelerationY_Value() {
		return (EAttribute)accelerationYEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccelerationZ() {
		return accelerationZEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccelerationZ_Value() {
		return (EAttribute)accelerationZEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAltitude() {
		return altitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAltitude_Value() {
		return (EAttribute)altitudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalAccuracy() {
		return horizontalAccuracyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHorizontalAccuracy_Value() {
		return (EAttribute)horizontalAccuracyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatitude() {
		return latitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatitude_Value() {
		return (EAttribute)latitudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongitude() {
		return longitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongitude_Value() {
		return (EAttribute)longitudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeed() {
		return speedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeed_Value() {
		return (EAttribute)speedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalAccuracy() {
		return verticalAccuracyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalAccuracy_Value() {
		return (EAttribute)verticalAccuracyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttitude() {
		return attitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPitch() {
		return pitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPitch_Value() {
		return (EAttribute)pitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoll() {
		return rollEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoll_Value() {
		return (EAttribute)rollEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYaw() {
		return yawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYaw_Value() {
		return (EAttribute)yawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBattery() {
		return batteryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryLevel() {
		return batteryLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryLevel_Value() {
		return (EAttribute)batteryLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryStatus() {
		return batteryStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryStatus_Value() {
		return (EAttribute)batteryStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_IsAvailable() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetooth() {
		return bluetoothEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetooth_Value() {
		return (EAttribute)bluetoothEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellular() {
		return cellularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCellular_Value() {
		return (EAttribute)cellularEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiFi() {
		return wiFiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiFi_Value() {
		return (EAttribute)wiFiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirection() {
		return directionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMagneticHeadingDirection() {
		return magneticHeadingDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagneticHeadingDirection_Value() {
		return (EAttribute)magneticHeadingDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMagneticHeadingAccuracy() {
		return magneticHeadingAccuracyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMagneticHeadingAccuracy_Value() {
		return (EAttribute)magneticHeadingAccuracyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueHeadingDirection() {
		return trueHeadingDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrueHeadingDirection_Value() {
		return (EAttribute)trueHeadingDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotation() {
		return rotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotation_IsAvailable() {
		return (EAttribute)rotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationX() {
		return rotationXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotationX_Value() {
		return (EAttribute)rotationXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationY() {
		return rotationYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotationY_Value() {
		return (EAttribute)rotationYEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationZ() {
		return rotationZEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotationZ_Value() {
		return (EAttribute)rotationZEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSwipeDirection() {
		return swipeDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBatteryStatusDescription() {
		return batteryStatusDescriptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientationDescription() {
		return orientationDescriptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileFactory getMobileFactory() {
		return (MobileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mobileViewContainerEClass = createEClass(MOBILE_VIEW_CONTAINER);
		createEAttribute(mobileViewContainerEClass, MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM);

		screenEClass = createEClass(SCREEN);
		createEAttribute(screenEClass, SCREEN__IS_MODAL);
		createEAttribute(screenEClass, SCREEN__HAS_NAV_BAR);

		mobileViewComponentEClass = createEClass(MOBILE_VIEW_COMPONENT);
		createEAttribute(mobileViewComponentEClass, MOBILE_VIEW_COMPONENT__IS_MOBILE_SYSTEM);

		mobileMessageEClass = createEClass(MOBILE_MESSAGE);

		searchViewEClass = createEClass(SEARCH_VIEW);

		mobileViewElementEventEClass = createEClass(MOBILE_VIEW_ELEMENT_EVENT);

		touchEventEClass = createEClass(TOUCH_EVENT);

		longPressEventEClass = createEClass(LONG_PRESS_EVENT);
		createEAttribute(longPressEventEClass, LONG_PRESS_EVENT__PRESS_DURATION);
		createEAttribute(longPressEventEClass, LONG_PRESS_EVENT__FINGERS_COUNT);

		panEventEClass = createEClass(PAN_EVENT);
		createEAttribute(panEventEClass, PAN_EVENT__FINGERS_COUNT);

		pinchEventEClass = createEClass(PINCH_EVENT);

		swipeEventEClass = createEClass(SWIPE_EVENT);
		createEAttribute(swipeEventEClass, SWIPE_EVENT__SWIPE_DIRECTION);

		tapEventEClass = createEClass(TAP_EVENT);

		mobileActionEClass = createEClass(MOBILE_ACTION);

		cameraActionEClass = createEClass(CAMERA_ACTION);

		microphoneActionEClass = createEClass(MICROPHONE_ACTION);

		mobileActionEventEClass = createEClass(MOBILE_ACTION_EVENT);

		cameraActionEventEClass = createEClass(CAMERA_ACTION_EVENT);

		microphoneActionEventEClass = createEClass(MICROPHONE_ACTION_EVENT);

		mobileSystemEventEClass = createEClass(MOBILE_SYSTEM_EVENT);

		mobileResourceEventEClass = createEClass(MOBILE_RESOURCE_EVENT);

		batteryEventEClass = createEClass(BATTERY_EVENT);

		connectionEventEClass = createEClass(CONNECTION_EVENT);

		memoryEventEClass = createEClass(MEMORY_EVENT);

		mobileSensorEventEClass = createEClass(MOBILE_SENSOR_EVENT);

		accelerometerEventEClass = createEClass(ACCELEROMETER_EVENT);

		gyroscopeEventEClass = createEClass(GYROSCOPE_EVENT);

		locationEventEClass = createEClass(LOCATION_EVENT);

		magnetometerEventEClass = createEClass(MAGNETOMETER_EVENT);

		motionEventEClass = createEClass(MOTION_EVENT);

		orientationEventEClass = createEClass(ORIENTATION_EVENT);

		proximityEventEClass = createEClass(PROXIMITY_EVENT);

		rotateEventEClass = createEClass(ROTATE_EVENT);

		shakeEventEClass = createEClass(SHAKE_EVENT);

		mobileDeviceEClass = createEClass(MOBILE_DEVICE);
		createEReference(mobileDeviceEClass, MOBILE_DEVICE__SCREENS);
		createEReference(mobileDeviceEClass, MOBILE_DEVICE__SENSORS);

		mobileDeviceScreenEClass = createEClass(MOBILE_DEVICE_SCREEN);
		createEAttribute(mobileDeviceScreenEClass, MOBILE_DEVICE_SCREEN__HEIGT);
		createEAttribute(mobileDeviceScreenEClass, MOBILE_DEVICE_SCREEN__WIDTH);
		createEAttribute(mobileDeviceScreenEClass, MOBILE_DEVICE_SCREEN__DENSITY);

		mobileDeviceSensorEClass = createEClass(MOBILE_DEVICE_SENSOR);

		accelerometerEClass = createEClass(ACCELEROMETER);

		gpsEClass = createEClass(GPS);
		createEAttribute(gpsEClass, GPS__IS_AVAILABLE);
		createEAttribute(gpsEClass, GPS__IS_ENABLED);

		gyroscopeEClass = createEClass(GYROSCOPE);
		createEAttribute(gyroscopeEClass, GYROSCOPE__IS_AVAILABLE);

		magnetometerEClass = createEClass(MAGNETOMETER);
		createEAttribute(magnetometerEClass, MAGNETOMETER__IS_AVAILABLE);

		microphoneEClass = createEClass(MICROPHONE);
		createEAttribute(microphoneEClass, MICROPHONE__IS_AVAILABLE);

		proximitySensorEClass = createEClass(PROXIMITY_SENSOR);
		createEAttribute(proximitySensorEClass, PROXIMITY_SENSOR__IS_AVAILABLE);

		stillCameraEClass = createEClass(STILL_CAMERA);
		createEAttribute(stillCameraEClass, STILL_CAMERA__FRONT);
		createEAttribute(stillCameraEClass, STILL_CAMERA__REAR);

		videoCameraEClass = createEClass(VIDEO_CAMERA);
		createEAttribute(videoCameraEClass, VIDEO_CAMERA__REAR);
		createEAttribute(videoCameraEClass, VIDEO_CAMERA__FRONT);

		mobileContextVariableEClass = createEClass(MOBILE_CONTEXT_VARIABLE);

		accelerationEClass = createEClass(ACCELERATION);
		createEAttribute(accelerationEClass, ACCELERATION__IS_AVAILABLE);

		accelerationXEClass = createEClass(ACCELERATION_X);
		createEAttribute(accelerationXEClass, ACCELERATION_X__VALUE);

		accelerationYEClass = createEClass(ACCELERATION_Y);
		createEAttribute(accelerationYEClass, ACCELERATION_Y__VALUE);

		accelerationZEClass = createEClass(ACCELERATION_Z);
		createEAttribute(accelerationZEClass, ACCELERATION_Z__VALUE);

		locationEClass = createEClass(LOCATION);

		altitudeEClass = createEClass(ALTITUDE);
		createEAttribute(altitudeEClass, ALTITUDE__VALUE);

		horizontalAccuracyEClass = createEClass(HORIZONTAL_ACCURACY);
		createEAttribute(horizontalAccuracyEClass, HORIZONTAL_ACCURACY__VALUE);

		latitudeEClass = createEClass(LATITUDE);
		createEAttribute(latitudeEClass, LATITUDE__VALUE);

		longitudeEClass = createEClass(LONGITUDE);
		createEAttribute(longitudeEClass, LONGITUDE__VALUE);

		speedEClass = createEClass(SPEED);
		createEAttribute(speedEClass, SPEED__VALUE);

		verticalAccuracyEClass = createEClass(VERTICAL_ACCURACY);
		createEAttribute(verticalAccuracyEClass, VERTICAL_ACCURACY__VALUE);

		attitudeEClass = createEClass(ATTITUDE);

		pitchEClass = createEClass(PITCH);
		createEAttribute(pitchEClass, PITCH__VALUE);

		rollEClass = createEClass(ROLL);
		createEAttribute(rollEClass, ROLL__VALUE);

		yawEClass = createEClass(YAW);
		createEAttribute(yawEClass, YAW__VALUE);

		batteryEClass = createEClass(BATTERY);

		batteryLevelEClass = createEClass(BATTERY_LEVEL);
		createEAttribute(batteryLevelEClass, BATTERY_LEVEL__VALUE);

		batteryStatusEClass = createEClass(BATTERY_STATUS);
		createEAttribute(batteryStatusEClass, BATTERY_STATUS__VALUE);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__IS_AVAILABLE);

		bluetoothEClass = createEClass(BLUETOOTH);
		createEAttribute(bluetoothEClass, BLUETOOTH__VALUE);

		cellularEClass = createEClass(CELLULAR);
		createEAttribute(cellularEClass, CELLULAR__VALUE);

		wiFiEClass = createEClass(WI_FI);
		createEAttribute(wiFiEClass, WI_FI__VALUE);

		directionEClass = createEClass(DIRECTION);

		magneticHeadingDirectionEClass = createEClass(MAGNETIC_HEADING_DIRECTION);
		createEAttribute(magneticHeadingDirectionEClass, MAGNETIC_HEADING_DIRECTION__VALUE);

		magneticHeadingAccuracyEClass = createEClass(MAGNETIC_HEADING_ACCURACY);
		createEAttribute(magneticHeadingAccuracyEClass, MAGNETIC_HEADING_ACCURACY__VALUE);

		trueHeadingDirectionEClass = createEClass(TRUE_HEADING_DIRECTION);
		createEAttribute(trueHeadingDirectionEClass, TRUE_HEADING_DIRECTION__VALUE);

		rotationEClass = createEClass(ROTATION);
		createEAttribute(rotationEClass, ROTATION__IS_AVAILABLE);

		rotationXEClass = createEClass(ROTATION_X);
		createEAttribute(rotationXEClass, ROTATION_X__VALUE);

		rotationYEClass = createEClass(ROTATION_Y);
		createEAttribute(rotationYEClass, ROTATION_Y__VALUE);

		rotationZEClass = createEClass(ROTATION_Z);
		createEAttribute(rotationZEClass, ROTATION_Z__VALUE);

		// Create enums
		swipeDirectionEEnum = createEEnum(SWIPE_DIRECTION);
		batteryStatusDescriptionEEnum = createEEnum(BATTERY_STATUS_DESCRIPTION);
		orientationDescriptionEEnum = createEEnum(ORIENTATION_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ExtensionsPackage theExtensionsPackage = (ExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mobileViewContainerEClass.getESuperTypes().add(theCorePackage.getViewContainer());
		screenEClass.getESuperTypes().add(this.getMobileViewContainer());
		mobileViewComponentEClass.getESuperTypes().add(theCorePackage.getViewComponent());
		mobileMessageEClass.getESuperTypes().add(this.getMobileViewComponent());
		searchViewEClass.getESuperTypes().add(this.getMobileViewComponent());
		mobileViewElementEventEClass.getESuperTypes().add(theCorePackage.getViewElementEvent());
		touchEventEClass.getESuperTypes().add(this.getMobileViewElementEvent());
		longPressEventEClass.getESuperTypes().add(this.getTouchEvent());
		panEventEClass.getESuperTypes().add(this.getTouchEvent());
		pinchEventEClass.getESuperTypes().add(this.getTouchEvent());
		swipeEventEClass.getESuperTypes().add(this.getTouchEvent());
		tapEventEClass.getESuperTypes().add(this.getTouchEvent());
		mobileActionEClass.getESuperTypes().add(theCorePackage.getIFMLAction());
		cameraActionEClass.getESuperTypes().add(this.getMobileAction());
		microphoneActionEClass.getESuperTypes().add(this.getMobileAction());
		mobileActionEventEClass.getESuperTypes().add(theCorePackage.getActionEvent());
		cameraActionEventEClass.getESuperTypes().add(this.getCameraAction());
		cameraActionEventEClass.getESuperTypes().add(this.getMobileActionEvent());
		microphoneActionEventEClass.getESuperTypes().add(this.getMicrophoneAction());
		microphoneActionEventEClass.getESuperTypes().add(this.getMobileActionEvent());
		mobileSystemEventEClass.getESuperTypes().add(theCorePackage.getSystemEvent());
		mobileResourceEventEClass.getESuperTypes().add(this.getMobileSystemEvent());
		batteryEventEClass.getESuperTypes().add(this.getMobileResourceEvent());
		connectionEventEClass.getESuperTypes().add(this.getMobileResourceEvent());
		memoryEventEClass.getESuperTypes().add(this.getMobileResourceEvent());
		mobileSensorEventEClass.getESuperTypes().add(this.getMobileSystemEvent());
		accelerometerEventEClass.getESuperTypes().add(this.getMobileSensorEvent());
		gyroscopeEventEClass.getESuperTypes().add(this.getMobileSensorEvent());
		locationEventEClass.getESuperTypes().add(this.getMobileSensorEvent());
		magnetometerEventEClass.getESuperTypes().add(this.getMobileSensorEvent());
		motionEventEClass.getESuperTypes().add(this.getMobileSensorEvent());
		orientationEventEClass.getESuperTypes().add(this.getMotionEvent());
		proximityEventEClass.getESuperTypes().add(this.getMobileSensorEvent());
		rotateEventEClass.getESuperTypes().add(this.getTouchEvent());
		shakeEventEClass.getESuperTypes().add(this.getMotionEvent());
		mobileDeviceEClass.getESuperTypes().add(theExtensionsPackage.getDevice());
		mobileDeviceScreenEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		mobileDeviceSensorEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		accelerometerEClass.getESuperTypes().add(this.getMobileDeviceSensor());
		gpsEClass.getESuperTypes().add(this.getMobileDeviceSensor());
		gyroscopeEClass.getESuperTypes().add(this.getMobileDeviceSensor());
		magnetometerEClass.getESuperTypes().add(this.getMobileDeviceSensor());
		microphoneEClass.getESuperTypes().add(this.getMobileDeviceSensor());
		proximitySensorEClass.getESuperTypes().add(this.getMobileDeviceSensor());
		stillCameraEClass.getESuperTypes().add(this.getMobileDeviceSensor());
		videoCameraEClass.getESuperTypes().add(this.getMobileDeviceSensor());
		mobileContextVariableEClass.getESuperTypes().add(theCorePackage.getSimpleContextVariable());
		accelerationEClass.getESuperTypes().add(this.getMobileContextVariable());
		accelerationXEClass.getESuperTypes().add(this.getAcceleration());
		accelerationYEClass.getESuperTypes().add(this.getAcceleration());
		accelerationZEClass.getESuperTypes().add(this.getAcceleration());
		locationEClass.getESuperTypes().add(this.getMobileContextVariable());
		altitudeEClass.getESuperTypes().add(this.getLocation());
		horizontalAccuracyEClass.getESuperTypes().add(this.getLocation());
		latitudeEClass.getESuperTypes().add(this.getLocation());
		longitudeEClass.getESuperTypes().add(this.getLocation());
		speedEClass.getESuperTypes().add(this.getLocation());
		verticalAccuracyEClass.getESuperTypes().add(this.getLocation());
		attitudeEClass.getESuperTypes().add(this.getMobileContextVariable());
		pitchEClass.getESuperTypes().add(this.getAttitude());
		rollEClass.getESuperTypes().add(this.getAttitude());
		yawEClass.getESuperTypes().add(this.getAttitude());
		batteryEClass.getESuperTypes().add(this.getMobileContextVariable());
		batteryLevelEClass.getESuperTypes().add(this.getBattery());
		batteryStatusEClass.getESuperTypes().add(this.getBattery());
		networkEClass.getESuperTypes().add(this.getMobileContextVariable());
		bluetoothEClass.getESuperTypes().add(this.getNetwork());
		cellularEClass.getESuperTypes().add(this.getNetwork());
		wiFiEClass.getESuperTypes().add(this.getNetwork());
		directionEClass.getESuperTypes().add(this.getMobileContextVariable());
		magneticHeadingDirectionEClass.getESuperTypes().add(this.getDirection());
		magneticHeadingAccuracyEClass.getESuperTypes().add(this.getDirection());
		trueHeadingDirectionEClass.getESuperTypes().add(this.getDirection());
		rotationEClass.getESuperTypes().add(this.getMobileContextVariable());
		rotationXEClass.getESuperTypes().add(this.getRotation());
		rotationYEClass.getESuperTypes().add(this.getRotation());
		rotationZEClass.getESuperTypes().add(this.getRotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(mobileViewContainerEClass, MobileViewContainer.class, "MobileViewContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobileViewContainer_IsMobileSystem(), theEcorePackage.getEBoolean(), "isMobileSystem", null, 0, 1, MobileViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenEClass, Screen.class, "Screen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScreen_IsModal(), theTypesPackage.getBoolean(), "isModal", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreen_HasNavBar(), theTypesPackage.getBoolean(), "hasNavBar", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobileViewComponentEClass, MobileViewComponent.class, "MobileViewComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobileViewComponent_IsMobileSystem(), ecorePackage.getEBoolean(), "isMobileSystem", null, 0, 1, MobileViewComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobileMessageEClass, MobileMessage.class, "MobileMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchViewEClass, SearchView.class, "SearchView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileViewElementEventEClass, MobileViewElementEvent.class, "MobileViewElementEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchEventEClass, TouchEvent.class, "TouchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longPressEventEClass, LongPressEvent.class, "LongPressEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongPressEvent_PressDuration(), ecorePackage.getEFloat(), "pressDuration", null, 0, 1, LongPressEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongPressEvent_FingersCount(), ecorePackage.getEFloat(), "fingersCount", null, 0, 1, LongPressEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panEventEClass, PanEvent.class, "PanEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanEvent_FingersCount(), ecorePackage.getEFloat(), "fingersCount", null, 0, 1, PanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinchEventEClass, PinchEvent.class, "PinchEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swipeEventEClass, SwipeEvent.class, "SwipeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwipeEvent_SwipeDirection(), this.getSwipeDirection(), "swipeDirection", null, 0, 1, SwipeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tapEventEClass, TapEvent.class, "TapEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileActionEClass, MobileAction.class, "MobileAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cameraActionEClass, CameraAction.class, "CameraAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microphoneActionEClass, MicrophoneAction.class, "MicrophoneAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileActionEventEClass, MobileActionEvent.class, "MobileActionEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cameraActionEventEClass, CameraActionEvent.class, "CameraActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microphoneActionEventEClass, MicrophoneActionEvent.class, "MicrophoneActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileSystemEventEClass, MobileSystemEvent.class, "MobileSystemEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileResourceEventEClass, MobileResourceEvent.class, "MobileResourceEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(batteryEventEClass, BatteryEvent.class, "BatteryEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionEventEClass, ConnectionEvent.class, "ConnectionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryEventEClass, MemoryEvent.class, "MemoryEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileSensorEventEClass, MobileSensorEvent.class, "MobileSensorEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accelerometerEventEClass, AccelerometerEvent.class, "AccelerometerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gyroscopeEventEClass, GyroscopeEvent.class, "GyroscopeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEventEClass, LocationEvent.class, "LocationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(magnetometerEventEClass, MagnetometerEvent.class, "MagnetometerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motionEventEClass, MotionEvent.class, "MotionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orientationEventEClass, OrientationEvent.class, "OrientationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proximityEventEClass, ProximityEvent.class, "ProximityEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotateEventEClass, RotateEvent.class, "RotateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shakeEventEClass, ShakeEvent.class, "ShakeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileDeviceEClass, MobileDevice.class, "MobileDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobileDevice_Screens(), this.getMobileDeviceScreen(), null, "screens", null, 0, -1, MobileDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobileDevice_Sensors(), this.getMobileDeviceSensor(), null, "sensors", null, 0, -1, MobileDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobileDeviceScreenEClass, MobileDeviceScreen.class, "MobileDeviceScreen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobileDeviceScreen_Heigt(), ecorePackage.getEFloat(), "heigt", null, 0, 1, MobileDeviceScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobileDeviceScreen_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, MobileDeviceScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobileDeviceScreen_Density(), ecorePackage.getEFloat(), "density", null, 0, 1, MobileDeviceScreen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobileDeviceSensorEClass, MobileDeviceSensor.class, "MobileDeviceSensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accelerometerEClass, Accelerometer.class, "Accelerometer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpsEClass, IFML.Mobile.GPS.class, "GPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPS_IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", null, 0, 1, IFML.Mobile.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPS_IsEnabled(), theTypesPackage.getBoolean(), "isEnabled", null, 0, 1, IFML.Mobile.GPS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gyroscopeEClass, Gyroscope.class, "Gyroscope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGyroscope_IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", null, 0, 1, Gyroscope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(magnetometerEClass, Magnetometer.class, "Magnetometer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMagnetometer_IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", null, 0, 1, Magnetometer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microphoneEClass, Microphone.class, "Microphone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicrophone_IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", null, 0, 1, Microphone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proximitySensorEClass, ProximitySensor.class, "ProximitySensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProximitySensor_IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", null, 0, 1, ProximitySensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stillCameraEClass, StillCamera.class, "StillCamera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStillCamera_Front(), theTypesPackage.getBoolean(), "front", null, 0, 1, StillCamera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStillCamera_Rear(), theTypesPackage.getBoolean(), "rear", null, 0, 1, StillCamera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoCameraEClass, VideoCamera.class, "VideoCamera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoCamera_Rear(), theTypesPackage.getBoolean(), "rear", null, 0, 1, VideoCamera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoCamera_Front(), theTypesPackage.getBoolean(), "front", null, 0, 1, VideoCamera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobileContextVariableEClass, MobileContextVariable.class, "MobileContextVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accelerationEClass, Acceleration.class, "Acceleration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceleration_IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", null, 0, 1, Acceleration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accelerationXEClass, AccelerationX.class, "AccelerationX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccelerationX_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AccelerationX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accelerationYEClass, AccelerationY.class, "AccelerationY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccelerationY_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AccelerationY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accelerationZEClass, AccelerationZ.class, "AccelerationZ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccelerationZ_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AccelerationZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(altitudeEClass, Altitude.class, "Altitude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAltitude_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Altitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalAccuracyEClass, HorizontalAccuracy.class, "HorizontalAccuracy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalAccuracy_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, HorizontalAccuracy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latitudeEClass, Latitude.class, "Latitude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatitude_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Latitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longitudeEClass, Longitude.class, "Longitude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongitude_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Longitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speedEClass, Speed.class, "Speed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeed_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Speed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verticalAccuracyEClass, VerticalAccuracy.class, "VerticalAccuracy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerticalAccuracy_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, VerticalAccuracy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attitudeEClass, Attitude.class, "Attitude", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pitchEClass, Pitch.class, "Pitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPitch_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rollEClass, Roll.class, "Roll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoll_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Roll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yawEClass, Yaw.class, "Yaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYaw_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Yaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryEClass, Battery.class, "Battery", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(batteryLevelEClass, BatteryLevel.class, "BatteryLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryLevel_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, BatteryLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryStatusEClass, BatteryStatus.class, "BatteryStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryStatus_Value(), this.getBatteryStatusDescription(), "value", null, 0, 1, BatteryStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bluetoothEClass, Bluetooth.class, "Bluetooth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBluetooth_Value(), theTypesPackage.getBoolean(), "value", null, 0, 1, Bluetooth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellularEClass, Cellular.class, "Cellular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCellular_Value(), theTypesPackage.getBoolean(), "value", null, 0, 1, Cellular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiFiEClass, WiFi.class, "WiFi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiFi_Value(), theTypesPackage.getBoolean(), "value", null, 0, 1, WiFi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directionEClass, Direction.class, "Direction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(magneticHeadingDirectionEClass, MagneticHeadingDirection.class, "MagneticHeadingDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMagneticHeadingDirection_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, MagneticHeadingDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(magneticHeadingAccuracyEClass, MagneticHeadingAccuracy.class, "MagneticHeadingAccuracy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMagneticHeadingAccuracy_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, MagneticHeadingAccuracy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueHeadingDirectionEClass, TrueHeadingDirection.class, "TrueHeadingDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrueHeadingDirection_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, TrueHeadingDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationEClass, Rotation.class, "Rotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotation_IsAvailable(), theTypesPackage.getBoolean(), "isAvailable", null, 0, 1, Rotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationXEClass, RotationX.class, "RotationX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotationX_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, RotationX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationYEClass, RotationY.class, "RotationY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotationY_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, RotationY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationZEClass, RotationZ.class, "RotationZ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotationZ_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, RotationZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(swipeDirectionEEnum, SwipeDirection.class, "SwipeDirection");
		addEEnumLiteral(swipeDirectionEEnum, SwipeDirection.RIGHT);
		addEEnumLiteral(swipeDirectionEEnum, SwipeDirection.LEFT);
		addEEnumLiteral(swipeDirectionEEnum, SwipeDirection.UP);
		addEEnumLiteral(swipeDirectionEEnum, SwipeDirection.DOWN);

		initEEnum(batteryStatusDescriptionEEnum, BatteryStatusDescription.class, "BatteryStatusDescription");
		addEEnumLiteral(batteryStatusDescriptionEEnum, BatteryStatusDescription.UNPLUGGED);
		addEEnumLiteral(batteryStatusDescriptionEEnum, BatteryStatusDescription.CHARGING);
		addEEnumLiteral(batteryStatusDescriptionEEnum, BatteryStatusDescription.FULL);
		addEEnumLiteral(batteryStatusDescriptionEEnum, BatteryStatusDescription.UNKNOWN);

		initEEnum(orientationDescriptionEEnum, OrientationDescription.class, "OrientationDescription");
		addEEnumLiteral(orientationDescriptionEEnum, OrientationDescription.UNKOWN);
		addEEnumLiteral(orientationDescriptionEEnum, OrientationDescription.PORTRAIT);
		addEEnumLiteral(orientationDescriptionEEnum, OrientationDescription.LANDSCAPE);
		addEEnumLiteral(orientationDescriptionEEnum, OrientationDescription.PORTRAIT_UPSIDE_DOWN);
		addEEnumLiteral(orientationDescriptionEEnum, OrientationDescription.LANDSCAPE_RIGHT);
		addEEnumLiteral(orientationDescriptionEEnum, OrientationDescription.LANDSCAPE_LEFT);
		addEEnumLiteral(orientationDescriptionEEnum, OrientationDescription.FACE_UP);
		addEEnumLiteral(orientationDescriptionEEnum, OrientationDescription.FACE_DOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //MobilePackageImpl
