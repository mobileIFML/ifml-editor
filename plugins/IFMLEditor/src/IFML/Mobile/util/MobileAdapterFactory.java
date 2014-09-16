/**
 */
package IFML.Mobile.util;

import IFML.Core.ActionEvent;
import IFML.Core.CatchingEvent;
import IFML.Core.ContextDimension;
import IFML.Core.ContextVariable;
import IFML.Core.Element;
import IFML.Core.Event;
import IFML.Core.IFMLAction;
import IFML.Core.InteractionFlowElement;
import IFML.Core.InteractionFlowModelElement;
import IFML.Core.NamedElement;
import IFML.Core.SimpleContextVariable;
import IFML.Core.SystemEvent;
import IFML.Core.ViewComponent;
import IFML.Core.ViewContainer;
import IFML.Core.ViewElement;
import IFML.Core.ViewElementEvent;

import IFML.Extensions.Device;

import IFML.Mobile.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobilePackage
 * @generated
 */
public class MobileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MobilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileSwitch<Adapter> modelSwitch =
		new MobileSwitch<Adapter>() {
			@Override
			public Adapter caseMobileViewContainer(MobileViewContainer object) {
				return createMobileViewContainerAdapter();
			}
			@Override
			public Adapter caseScreen(Screen object) {
				return createScreenAdapter();
			}
			@Override
			public Adapter caseMobileViewComponent(MobileViewComponent object) {
				return createMobileViewComponentAdapter();
			}
			@Override
			public Adapter caseMobileMessage(MobileMessage object) {
				return createMobileMessageAdapter();
			}
			@Override
			public Adapter caseSearchView(SearchView object) {
				return createSearchViewAdapter();
			}
			@Override
			public Adapter caseMobileViewElementEvent(MobileViewElementEvent object) {
				return createMobileViewElementEventAdapter();
			}
			@Override
			public Adapter caseTouchEvent(TouchEvent object) {
				return createTouchEventAdapter();
			}
			@Override
			public Adapter caseLongPressEvent(LongPressEvent object) {
				return createLongPressEventAdapter();
			}
			@Override
			public Adapter casePanEvent(PanEvent object) {
				return createPanEventAdapter();
			}
			@Override
			public Adapter casePinchEvent(PinchEvent object) {
				return createPinchEventAdapter();
			}
			@Override
			public Adapter caseSwipeEvent(SwipeEvent object) {
				return createSwipeEventAdapter();
			}
			@Override
			public Adapter caseTapEvent(TapEvent object) {
				return createTapEventAdapter();
			}
			@Override
			public Adapter caseMobileAction(MobileAction object) {
				return createMobileActionAdapter();
			}
			@Override
			public Adapter caseCameraAction(CameraAction object) {
				return createCameraActionAdapter();
			}
			@Override
			public Adapter caseMicrophoneAction(MicrophoneAction object) {
				return createMicrophoneActionAdapter();
			}
			@Override
			public Adapter caseMobileActionEvent(MobileActionEvent object) {
				return createMobileActionEventAdapter();
			}
			@Override
			public Adapter caseCameraActionEvent(CameraActionEvent object) {
				return createCameraActionEventAdapter();
			}
			@Override
			public Adapter caseMicrophoneActionEvent(MicrophoneActionEvent object) {
				return createMicrophoneActionEventAdapter();
			}
			@Override
			public Adapter caseMobileSystemEvent(MobileSystemEvent object) {
				return createMobileSystemEventAdapter();
			}
			@Override
			public Adapter caseMobileResourceEvent(MobileResourceEvent object) {
				return createMobileResourceEventAdapter();
			}
			@Override
			public Adapter caseBatteryEvent(BatteryEvent object) {
				return createBatteryEventAdapter();
			}
			@Override
			public Adapter caseConnectionEvent(ConnectionEvent object) {
				return createConnectionEventAdapter();
			}
			@Override
			public Adapter caseMemoryEvent(MemoryEvent object) {
				return createMemoryEventAdapter();
			}
			@Override
			public Adapter caseMobileSensorEvent(MobileSensorEvent object) {
				return createMobileSensorEventAdapter();
			}
			@Override
			public Adapter caseAccelerometerEvent(AccelerometerEvent object) {
				return createAccelerometerEventAdapter();
			}
			@Override
			public Adapter caseGyroscopeEvent(GyroscopeEvent object) {
				return createGyroscopeEventAdapter();
			}
			@Override
			public Adapter caseLocationEvent(LocationEvent object) {
				return createLocationEventAdapter();
			}
			@Override
			public Adapter caseMagnetometerEvent(MagnetometerEvent object) {
				return createMagnetometerEventAdapter();
			}
			@Override
			public Adapter caseMotionEvent(MotionEvent object) {
				return createMotionEventAdapter();
			}
			@Override
			public Adapter caseOrientationEvent(OrientationEvent object) {
				return createOrientationEventAdapter();
			}
			@Override
			public Adapter caseProximityEvent(ProximityEvent object) {
				return createProximityEventAdapter();
			}
			@Override
			public Adapter caseRotateEvent(RotateEvent object) {
				return createRotateEventAdapter();
			}
			@Override
			public Adapter caseShakeEvent(ShakeEvent object) {
				return createShakeEventAdapter();
			}
			@Override
			public Adapter caseMobileDevice(MobileDevice object) {
				return createMobileDeviceAdapter();
			}
			@Override
			public Adapter caseMobileDeviceScreen(MobileDeviceScreen object) {
				return createMobileDeviceScreenAdapter();
			}
			@Override
			public Adapter caseMobileDeviceSensor(MobileDeviceSensor object) {
				return createMobileDeviceSensorAdapter();
			}
			@Override
			public Adapter caseAccelerometer(Accelerometer object) {
				return createAccelerometerAdapter();
			}
			@Override
			public Adapter caseGPS(GPS object) {
				return createGPSAdapter();
			}
			@Override
			public Adapter caseGyroscope(Gyroscope object) {
				return createGyroscopeAdapter();
			}
			@Override
			public Adapter caseMagnetometer(Magnetometer object) {
				return createMagnetometerAdapter();
			}
			@Override
			public Adapter caseMicrophone(Microphone object) {
				return createMicrophoneAdapter();
			}
			@Override
			public Adapter caseProximitySensor(ProximitySensor object) {
				return createProximitySensorAdapter();
			}
			@Override
			public Adapter caseStillCamera(StillCamera object) {
				return createStillCameraAdapter();
			}
			@Override
			public Adapter caseVideoCamera(VideoCamera object) {
				return createVideoCameraAdapter();
			}
			@Override
			public Adapter caseMobileContextVariable(MobileContextVariable object) {
				return createMobileContextVariableAdapter();
			}
			@Override
			public Adapter caseAcceleration(Acceleration object) {
				return createAccelerationAdapter();
			}
			@Override
			public Adapter caseAccelerationX(AccelerationX object) {
				return createAccelerationXAdapter();
			}
			@Override
			public Adapter caseAccelerationY(AccelerationY object) {
				return createAccelerationYAdapter();
			}
			@Override
			public Adapter caseAccelerationZ(AccelerationZ object) {
				return createAccelerationZAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseAltitude(Altitude object) {
				return createAltitudeAdapter();
			}
			@Override
			public Adapter caseHorizontalAccuracy(HorizontalAccuracy object) {
				return createHorizontalAccuracyAdapter();
			}
			@Override
			public Adapter caseLatitude(Latitude object) {
				return createLatitudeAdapter();
			}
			@Override
			public Adapter caseLongitude(Longitude object) {
				return createLongitudeAdapter();
			}
			@Override
			public Adapter caseSpeed(Speed object) {
				return createSpeedAdapter();
			}
			@Override
			public Adapter caseVerticalAccuracy(VerticalAccuracy object) {
				return createVerticalAccuracyAdapter();
			}
			@Override
			public Adapter caseAttitude(Attitude object) {
				return createAttitudeAdapter();
			}
			@Override
			public Adapter casePitch(Pitch object) {
				return createPitchAdapter();
			}
			@Override
			public Adapter caseRoll(Roll object) {
				return createRollAdapter();
			}
			@Override
			public Adapter caseYaw(Yaw object) {
				return createYawAdapter();
			}
			@Override
			public Adapter caseBattery(Battery object) {
				return createBatteryAdapter();
			}
			@Override
			public Adapter caseBatteryLevel(BatteryLevel object) {
				return createBatteryLevelAdapter();
			}
			@Override
			public Adapter caseBatteryStatus(BatteryStatus object) {
				return createBatteryStatusAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseBluetooth(Bluetooth object) {
				return createBluetoothAdapter();
			}
			@Override
			public Adapter caseCellular(Cellular object) {
				return createCellularAdapter();
			}
			@Override
			public Adapter caseWiFi(WiFi object) {
				return createWiFiAdapter();
			}
			@Override
			public Adapter caseDirection(Direction object) {
				return createDirectionAdapter();
			}
			@Override
			public Adapter caseMagneticHeadingDirection(MagneticHeadingDirection object) {
				return createMagneticHeadingDirectionAdapter();
			}
			@Override
			public Adapter caseMagneticHeadingAccuracy(MagneticHeadingAccuracy object) {
				return createMagneticHeadingAccuracyAdapter();
			}
			@Override
			public Adapter caseTrueHeadingDirection(TrueHeadingDirection object) {
				return createTrueHeadingDirectionAdapter();
			}
			@Override
			public Adapter caseRotation(Rotation object) {
				return createRotationAdapter();
			}
			@Override
			public Adapter caseRotationX(RotationX object) {
				return createRotationXAdapter();
			}
			@Override
			public Adapter caseRotationY(RotationY object) {
				return createRotationYAdapter();
			}
			@Override
			public Adapter caseRotationZ(RotationZ object) {
				return createRotationZAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseInteractionFlowModelElement(InteractionFlowModelElement object) {
				return createInteractionFlowModelElementAdapter();
			}
			@Override
			public Adapter caseInteractionFlowElement(InteractionFlowElement object) {
				return createInteractionFlowElementAdapter();
			}
			@Override
			public Adapter caseViewElement(ViewElement object) {
				return createViewElementAdapter();
			}
			@Override
			public Adapter caseViewContainer(ViewContainer object) {
				return createViewContainerAdapter();
			}
			@Override
			public Adapter caseViewComponent(ViewComponent object) {
				return createViewComponentAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseCatchingEvent(CatchingEvent object) {
				return createCatchingEventAdapter();
			}
			@Override
			public Adapter caseViewElementEvent(ViewElementEvent object) {
				return createViewElementEventAdapter();
			}
			@Override
			public Adapter caseIFMLAction(IFMLAction object) {
				return createIFMLActionAdapter();
			}
			@Override
			public Adapter caseActionEvent(ActionEvent object) {
				return createActionEventAdapter();
			}
			@Override
			public Adapter caseSystemEvent(SystemEvent object) {
				return createSystemEventAdapter();
			}
			@Override
			public Adapter caseContextDimension(ContextDimension object) {
				return createContextDimensionAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseContextVariable(ContextVariable object) {
				return createContextVariableAdapter();
			}
			@Override
			public Adapter caseSimpleContextVariable(SimpleContextVariable object) {
				return createSimpleContextVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileViewContainer
	 * @generated
	 */
	public Adapter createMobileViewContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Screen
	 * @generated
	 */
	public Adapter createScreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileViewComponent
	 * @generated
	 */
	public Adapter createMobileViewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileMessage
	 * @generated
	 */
	public Adapter createMobileMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.SearchView <em>Search View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.SearchView
	 * @generated
	 */
	public Adapter createSearchViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileViewElementEvent
	 * @generated
	 */
	public Adapter createMobileViewElementEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.TouchEvent <em>Touch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.TouchEvent
	 * @generated
	 */
	public Adapter createTouchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.LongPressEvent <em>Long Press Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.LongPressEvent
	 * @generated
	 */
	public Adapter createLongPressEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.PanEvent <em>Pan Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.PanEvent
	 * @generated
	 */
	public Adapter createPanEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.PinchEvent <em>Pinch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.PinchEvent
	 * @generated
	 */
	public Adapter createPinchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.SwipeEvent <em>Swipe Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.SwipeEvent
	 * @generated
	 */
	public Adapter createSwipeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.TapEvent <em>Tap Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.TapEvent
	 * @generated
	 */
	public Adapter createTapEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileAction
	 * @generated
	 */
	public Adapter createMobileActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.CameraAction <em>Camera Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.CameraAction
	 * @generated
	 */
	public Adapter createCameraActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MicrophoneAction <em>Microphone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MicrophoneAction
	 * @generated
	 */
	public Adapter createMicrophoneActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileActionEvent
	 * @generated
	 */
	public Adapter createMobileActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.CameraActionEvent <em>Camera Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.CameraActionEvent
	 * @generated
	 */
	public Adapter createCameraActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MicrophoneActionEvent <em>Microphone Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MicrophoneActionEvent
	 * @generated
	 */
	public Adapter createMicrophoneActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileSystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileSystemEvent
	 * @generated
	 */
	public Adapter createMobileSystemEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileResourceEvent <em>Resource Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileResourceEvent
	 * @generated
	 */
	public Adapter createMobileResourceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.BatteryEvent <em>Battery Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.BatteryEvent
	 * @generated
	 */
	public Adapter createBatteryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.ConnectionEvent <em>Connection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.ConnectionEvent
	 * @generated
	 */
	public Adapter createConnectionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MemoryEvent <em>Memory Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MemoryEvent
	 * @generated
	 */
	public Adapter createMemoryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileSensorEvent <em>Sensor Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileSensorEvent
	 * @generated
	 */
	public Adapter createMobileSensorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.AccelerometerEvent <em>Accelerometer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.AccelerometerEvent
	 * @generated
	 */
	public Adapter createAccelerometerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.GyroscopeEvent <em>Gyroscope Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.GyroscopeEvent
	 * @generated
	 */
	public Adapter createGyroscopeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.LocationEvent <em>Location Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.LocationEvent
	 * @generated
	 */
	public Adapter createLocationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MagnetometerEvent <em>Magnetometer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MagnetometerEvent
	 * @generated
	 */
	public Adapter createMagnetometerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MotionEvent <em>Motion Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MotionEvent
	 * @generated
	 */
	public Adapter createMotionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.OrientationEvent <em>Orientation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.OrientationEvent
	 * @generated
	 */
	public Adapter createOrientationEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.ProximityEvent <em>Proximity Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.ProximityEvent
	 * @generated
	 */
	public Adapter createProximityEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.RotateEvent <em>Rotate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.RotateEvent
	 * @generated
	 */
	public Adapter createRotateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.ShakeEvent <em>Shake Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.ShakeEvent
	 * @generated
	 */
	public Adapter createShakeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileDevice
	 * @generated
	 */
	public Adapter createMobileDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileDeviceScreen <em>Device Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileDeviceScreen
	 * @generated
	 */
	public Adapter createMobileDeviceScreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileDeviceSensor <em>Device Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileDeviceSensor
	 * @generated
	 */
	public Adapter createMobileDeviceSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Accelerometer <em>Accelerometer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Accelerometer
	 * @generated
	 */
	public Adapter createAccelerometerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.GPS
	 * @generated
	 */
	public Adapter createGPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Gyroscope <em>Gyroscope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Gyroscope
	 * @generated
	 */
	public Adapter createGyroscopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Magnetometer <em>Magnetometer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Magnetometer
	 * @generated
	 */
	public Adapter createMagnetometerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Microphone <em>Microphone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Microphone
	 * @generated
	 */
	public Adapter createMicrophoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.ProximitySensor <em>Proximity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.ProximitySensor
	 * @generated
	 */
	public Adapter createProximitySensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.StillCamera <em>Still Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.StillCamera
	 * @generated
	 */
	public Adapter createStillCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.VideoCamera <em>Video Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.VideoCamera
	 * @generated
	 */
	public Adapter createVideoCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MobileContextVariable <em>Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MobileContextVariable
	 * @generated
	 */
	public Adapter createMobileContextVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Acceleration <em>Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Acceleration
	 * @generated
	 */
	public Adapter createAccelerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.AccelerationX <em>Acceleration X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.AccelerationX
	 * @generated
	 */
	public Adapter createAccelerationXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.AccelerationY <em>Acceleration Y</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.AccelerationY
	 * @generated
	 */
	public Adapter createAccelerationYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.AccelerationZ <em>Acceleration Z</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.AccelerationZ
	 * @generated
	 */
	public Adapter createAccelerationZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Altitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Altitude
	 * @generated
	 */
	public Adapter createAltitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.HorizontalAccuracy <em>Horizontal Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.HorizontalAccuracy
	 * @generated
	 */
	public Adapter createHorizontalAccuracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Latitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Latitude
	 * @generated
	 */
	public Adapter createLatitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Longitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Longitude
	 * @generated
	 */
	public Adapter createLongitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Speed
	 * @generated
	 */
	public Adapter createSpeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.VerticalAccuracy <em>Vertical Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.VerticalAccuracy
	 * @generated
	 */
	public Adapter createVerticalAccuracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Attitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Attitude
	 * @generated
	 */
	public Adapter createAttitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Pitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Pitch
	 * @generated
	 */
	public Adapter createPitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Roll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Roll
	 * @generated
	 */
	public Adapter createRollAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Yaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Yaw
	 * @generated
	 */
	public Adapter createYawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Battery
	 * @generated
	 */
	public Adapter createBatteryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.BatteryLevel <em>Battery Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.BatteryLevel
	 * @generated
	 */
	public Adapter createBatteryLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.BatteryStatus <em>Battery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.BatteryStatus
	 * @generated
	 */
	public Adapter createBatteryStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Bluetooth <em>Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Bluetooth
	 * @generated
	 */
	public Adapter createBluetoothAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Cellular <em>Cellular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Cellular
	 * @generated
	 */
	public Adapter createCellularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.WiFi <em>Wi Fi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.WiFi
	 * @generated
	 */
	public Adapter createWiFiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Direction
	 * @generated
	 */
	public Adapter createDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MagneticHeadingDirection <em>Magnetic Heading Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MagneticHeadingDirection
	 * @generated
	 */
	public Adapter createMagneticHeadingDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.MagneticHeadingAccuracy <em>Magnetic Heading Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.MagneticHeadingAccuracy
	 * @generated
	 */
	public Adapter createMagneticHeadingAccuracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.TrueHeadingDirection <em>True Heading Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.TrueHeadingDirection
	 * @generated
	 */
	public Adapter createTrueHeadingDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.Rotation
	 * @generated
	 */
	public Adapter createRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.RotationX <em>Rotation X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.RotationX
	 * @generated
	 */
	public Adapter createRotationXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.RotationY <em>Rotation Y</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.RotationY
	 * @generated
	 */
	public Adapter createRotationYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Mobile.RotationZ <em>Rotation Z</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Mobile.RotationZ
	 * @generated
	 */
	public Adapter createRotationZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlowModelElement
	 * @generated
	 */
	public Adapter createInteractionFlowModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.InteractionFlowElement <em>Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.InteractionFlowElement
	 * @generated
	 */
	public Adapter createInteractionFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewContainer
	 * @generated
	 */
	public Adapter createViewContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewComponent
	 * @generated
	 */
	public Adapter createViewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.CatchingEvent <em>Catching Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.CatchingEvent
	 * @generated
	 */
	public Adapter createCatchingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ViewElementEvent
	 * @generated
	 */
	public Adapter createViewElementEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.IFMLAction <em>IFML Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.IFMLAction
	 * @generated
	 */
	public Adapter createIFMLActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ActionEvent
	 * @generated
	 */
	public Adapter createActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.SystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.SystemEvent
	 * @generated
	 */
	public Adapter createSystemEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ContextDimension <em>Context Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ContextDimension
	 * @generated
	 */
	public Adapter createContextDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Extensions.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Extensions.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.ContextVariable <em>Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.ContextVariable
	 * @generated
	 */
	public Adapter createContextVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link IFML.Core.SimpleContextVariable <em>Simple Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see IFML.Core.SimpleContextVariable
	 * @generated
	 */
	public Adapter createSimpleContextVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MobileAdapterFactory
