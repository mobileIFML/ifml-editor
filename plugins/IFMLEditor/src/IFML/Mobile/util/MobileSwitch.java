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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobilePackage
 * @generated
 */
public class MobileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileSwitch() {
		if (modelPackage == null) {
			modelPackage = MobilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MobilePackage.MOBILE_VIEW_CONTAINER: {
				MobileViewContainer mobileViewContainer = (MobileViewContainer)theEObject;
				T result = caseMobileViewContainer(mobileViewContainer);
				if (result == null) result = caseViewContainer(mobileViewContainer);
				if (result == null) result = caseViewElement(mobileViewContainer);
				if (result == null) result = caseInteractionFlowElement(mobileViewContainer);
				if (result == null) result = caseNamedElement(mobileViewContainer);
				if (result == null) result = caseInteractionFlowModelElement(mobileViewContainer);
				if (result == null) result = caseElement(mobileViewContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.SCREEN: {
				Screen screen = (Screen)theEObject;
				T result = caseScreen(screen);
				if (result == null) result = caseMobileViewContainer(screen);
				if (result == null) result = caseViewContainer(screen);
				if (result == null) result = caseViewElement(screen);
				if (result == null) result = caseInteractionFlowElement(screen);
				if (result == null) result = caseNamedElement(screen);
				if (result == null) result = caseInteractionFlowModelElement(screen);
				if (result == null) result = caseElement(screen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_VIEW_COMPONENT: {
				MobileViewComponent mobileViewComponent = (MobileViewComponent)theEObject;
				T result = caseMobileViewComponent(mobileViewComponent);
				if (result == null) result = caseViewComponent(mobileViewComponent);
				if (result == null) result = caseViewElement(mobileViewComponent);
				if (result == null) result = caseInteractionFlowElement(mobileViewComponent);
				if (result == null) result = caseNamedElement(mobileViewComponent);
				if (result == null) result = caseInteractionFlowModelElement(mobileViewComponent);
				if (result == null) result = caseElement(mobileViewComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_MESSAGE: {
				MobileMessage mobileMessage = (MobileMessage)theEObject;
				T result = caseMobileMessage(mobileMessage);
				if (result == null) result = caseMobileViewComponent(mobileMessage);
				if (result == null) result = caseViewComponent(mobileMessage);
				if (result == null) result = caseViewElement(mobileMessage);
				if (result == null) result = caseInteractionFlowElement(mobileMessage);
				if (result == null) result = caseNamedElement(mobileMessage);
				if (result == null) result = caseInteractionFlowModelElement(mobileMessage);
				if (result == null) result = caseElement(mobileMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.SEARCH_VIEW: {
				SearchView searchView = (SearchView)theEObject;
				T result = caseSearchView(searchView);
				if (result == null) result = caseMobileViewComponent(searchView);
				if (result == null) result = caseViewComponent(searchView);
				if (result == null) result = caseViewElement(searchView);
				if (result == null) result = caseInteractionFlowElement(searchView);
				if (result == null) result = caseNamedElement(searchView);
				if (result == null) result = caseInteractionFlowModelElement(searchView);
				if (result == null) result = caseElement(searchView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_VIEW_ELEMENT_EVENT: {
				MobileViewElementEvent mobileViewElementEvent = (MobileViewElementEvent)theEObject;
				T result = caseMobileViewElementEvent(mobileViewElementEvent);
				if (result == null) result = caseViewElementEvent(mobileViewElementEvent);
				if (result == null) result = caseCatchingEvent(mobileViewElementEvent);
				if (result == null) result = caseEvent(mobileViewElementEvent);
				if (result == null) result = caseInteractionFlowElement(mobileViewElementEvent);
				if (result == null) result = caseNamedElement(mobileViewElementEvent);
				if (result == null) result = caseInteractionFlowModelElement(mobileViewElementEvent);
				if (result == null) result = caseElement(mobileViewElementEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.TOUCH_EVENT: {
				TouchEvent touchEvent = (TouchEvent)theEObject;
				T result = caseTouchEvent(touchEvent);
				if (result == null) result = caseMobileViewElementEvent(touchEvent);
				if (result == null) result = caseViewElementEvent(touchEvent);
				if (result == null) result = caseCatchingEvent(touchEvent);
				if (result == null) result = caseEvent(touchEvent);
				if (result == null) result = caseInteractionFlowElement(touchEvent);
				if (result == null) result = caseNamedElement(touchEvent);
				if (result == null) result = caseInteractionFlowModelElement(touchEvent);
				if (result == null) result = caseElement(touchEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.LONG_PRESS_EVENT: {
				LongPressEvent longPressEvent = (LongPressEvent)theEObject;
				T result = caseLongPressEvent(longPressEvent);
				if (result == null) result = caseTouchEvent(longPressEvent);
				if (result == null) result = caseMobileViewElementEvent(longPressEvent);
				if (result == null) result = caseViewElementEvent(longPressEvent);
				if (result == null) result = caseCatchingEvent(longPressEvent);
				if (result == null) result = caseEvent(longPressEvent);
				if (result == null) result = caseInteractionFlowElement(longPressEvent);
				if (result == null) result = caseNamedElement(longPressEvent);
				if (result == null) result = caseInteractionFlowModelElement(longPressEvent);
				if (result == null) result = caseElement(longPressEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.PAN_EVENT: {
				PanEvent panEvent = (PanEvent)theEObject;
				T result = casePanEvent(panEvent);
				if (result == null) result = caseTouchEvent(panEvent);
				if (result == null) result = caseMobileViewElementEvent(panEvent);
				if (result == null) result = caseViewElementEvent(panEvent);
				if (result == null) result = caseCatchingEvent(panEvent);
				if (result == null) result = caseEvent(panEvent);
				if (result == null) result = caseInteractionFlowElement(panEvent);
				if (result == null) result = caseNamedElement(panEvent);
				if (result == null) result = caseInteractionFlowModelElement(panEvent);
				if (result == null) result = caseElement(panEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.PINCH_EVENT: {
				PinchEvent pinchEvent = (PinchEvent)theEObject;
				T result = casePinchEvent(pinchEvent);
				if (result == null) result = caseTouchEvent(pinchEvent);
				if (result == null) result = caseMobileViewElementEvent(pinchEvent);
				if (result == null) result = caseViewElementEvent(pinchEvent);
				if (result == null) result = caseCatchingEvent(pinchEvent);
				if (result == null) result = caseEvent(pinchEvent);
				if (result == null) result = caseInteractionFlowElement(pinchEvent);
				if (result == null) result = caseNamedElement(pinchEvent);
				if (result == null) result = caseInteractionFlowModelElement(pinchEvent);
				if (result == null) result = caseElement(pinchEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.SPREAD_EVENT: {
				SpreadEvent spreadEvent = (SpreadEvent)theEObject;
				T result = caseSpreadEvent(spreadEvent);
				if (result == null) result = caseTouchEvent(spreadEvent);
				if (result == null) result = caseMobileViewElementEvent(spreadEvent);
				if (result == null) result = caseViewElementEvent(spreadEvent);
				if (result == null) result = caseCatchingEvent(spreadEvent);
				if (result == null) result = caseEvent(spreadEvent);
				if (result == null) result = caseInteractionFlowElement(spreadEvent);
				if (result == null) result = caseNamedElement(spreadEvent);
				if (result == null) result = caseInteractionFlowModelElement(spreadEvent);
				if (result == null) result = caseElement(spreadEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.SWIPE_EVENT: {
				SwipeEvent swipeEvent = (SwipeEvent)theEObject;
				T result = caseSwipeEvent(swipeEvent);
				if (result == null) result = caseTouchEvent(swipeEvent);
				if (result == null) result = caseMobileViewElementEvent(swipeEvent);
				if (result == null) result = caseViewElementEvent(swipeEvent);
				if (result == null) result = caseCatchingEvent(swipeEvent);
				if (result == null) result = caseEvent(swipeEvent);
				if (result == null) result = caseInteractionFlowElement(swipeEvent);
				if (result == null) result = caseNamedElement(swipeEvent);
				if (result == null) result = caseInteractionFlowModelElement(swipeEvent);
				if (result == null) result = caseElement(swipeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.TAP_EVENT: {
				TapEvent tapEvent = (TapEvent)theEObject;
				T result = caseTapEvent(tapEvent);
				if (result == null) result = caseTouchEvent(tapEvent);
				if (result == null) result = caseMobileViewElementEvent(tapEvent);
				if (result == null) result = caseViewElementEvent(tapEvent);
				if (result == null) result = caseCatchingEvent(tapEvent);
				if (result == null) result = caseEvent(tapEvent);
				if (result == null) result = caseInteractionFlowElement(tapEvent);
				if (result == null) result = caseNamedElement(tapEvent);
				if (result == null) result = caseInteractionFlowModelElement(tapEvent);
				if (result == null) result = caseElement(tapEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_ACTION: {
				MobileAction mobileAction = (MobileAction)theEObject;
				T result = caseMobileAction(mobileAction);
				if (result == null) result = caseIFMLAction(mobileAction);
				if (result == null) result = caseInteractionFlowElement(mobileAction);
				if (result == null) result = caseNamedElement(mobileAction);
				if (result == null) result = caseInteractionFlowModelElement(mobileAction);
				if (result == null) result = caseElement(mobileAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.CAMERA_ACTION: {
				CameraAction cameraAction = (CameraAction)theEObject;
				T result = caseCameraAction(cameraAction);
				if (result == null) result = caseMobileAction(cameraAction);
				if (result == null) result = caseIFMLAction(cameraAction);
				if (result == null) result = caseInteractionFlowElement(cameraAction);
				if (result == null) result = caseNamedElement(cameraAction);
				if (result == null) result = caseInteractionFlowModelElement(cameraAction);
				if (result == null) result = caseElement(cameraAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MICROPHONE_ACTION: {
				MicrophoneAction microphoneAction = (MicrophoneAction)theEObject;
				T result = caseMicrophoneAction(microphoneAction);
				if (result == null) result = caseMobileAction(microphoneAction);
				if (result == null) result = caseIFMLAction(microphoneAction);
				if (result == null) result = caseInteractionFlowElement(microphoneAction);
				if (result == null) result = caseNamedElement(microphoneAction);
				if (result == null) result = caseInteractionFlowModelElement(microphoneAction);
				if (result == null) result = caseElement(microphoneAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_ACTION_EVENT: {
				MobileActionEvent mobileActionEvent = (MobileActionEvent)theEObject;
				T result = caseMobileActionEvent(mobileActionEvent);
				if (result == null) result = caseActionEvent(mobileActionEvent);
				if (result == null) result = caseCatchingEvent(mobileActionEvent);
				if (result == null) result = caseEvent(mobileActionEvent);
				if (result == null) result = caseInteractionFlowElement(mobileActionEvent);
				if (result == null) result = caseNamedElement(mobileActionEvent);
				if (result == null) result = caseInteractionFlowModelElement(mobileActionEvent);
				if (result == null) result = caseElement(mobileActionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.CAMERA_ACTION_EVENT: {
				CameraActionEvent cameraActionEvent = (CameraActionEvent)theEObject;
				T result = caseCameraActionEvent(cameraActionEvent);
				if (result == null) result = caseCameraAction(cameraActionEvent);
				if (result == null) result = caseMobileActionEvent(cameraActionEvent);
				if (result == null) result = caseMobileAction(cameraActionEvent);
				if (result == null) result = caseActionEvent(cameraActionEvent);
				if (result == null) result = caseIFMLAction(cameraActionEvent);
				if (result == null) result = caseCatchingEvent(cameraActionEvent);
				if (result == null) result = caseEvent(cameraActionEvent);
				if (result == null) result = caseInteractionFlowElement(cameraActionEvent);
				if (result == null) result = caseNamedElement(cameraActionEvent);
				if (result == null) result = caseInteractionFlowModelElement(cameraActionEvent);
				if (result == null) result = caseElement(cameraActionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MICROPHONE_ACTION_EVENT: {
				MicrophoneActionEvent microphoneActionEvent = (MicrophoneActionEvent)theEObject;
				T result = caseMicrophoneActionEvent(microphoneActionEvent);
				if (result == null) result = caseMicrophoneAction(microphoneActionEvent);
				if (result == null) result = caseMobileActionEvent(microphoneActionEvent);
				if (result == null) result = caseMobileAction(microphoneActionEvent);
				if (result == null) result = caseActionEvent(microphoneActionEvent);
				if (result == null) result = caseIFMLAction(microphoneActionEvent);
				if (result == null) result = caseCatchingEvent(microphoneActionEvent);
				if (result == null) result = caseEvent(microphoneActionEvent);
				if (result == null) result = caseInteractionFlowElement(microphoneActionEvent);
				if (result == null) result = caseNamedElement(microphoneActionEvent);
				if (result == null) result = caseInteractionFlowModelElement(microphoneActionEvent);
				if (result == null) result = caseElement(microphoneActionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_SYSTEM_EVENT: {
				MobileSystemEvent mobileSystemEvent = (MobileSystemEvent)theEObject;
				T result = caseMobileSystemEvent(mobileSystemEvent);
				if (result == null) result = caseSystemEvent(mobileSystemEvent);
				if (result == null) result = caseCatchingEvent(mobileSystemEvent);
				if (result == null) result = caseEvent(mobileSystemEvent);
				if (result == null) result = caseInteractionFlowElement(mobileSystemEvent);
				if (result == null) result = caseNamedElement(mobileSystemEvent);
				if (result == null) result = caseInteractionFlowModelElement(mobileSystemEvent);
				if (result == null) result = caseElement(mobileSystemEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_RESOURCE_EVENT: {
				MobileResourceEvent mobileResourceEvent = (MobileResourceEvent)theEObject;
				T result = caseMobileResourceEvent(mobileResourceEvent);
				if (result == null) result = caseMobileSystemEvent(mobileResourceEvent);
				if (result == null) result = caseSystemEvent(mobileResourceEvent);
				if (result == null) result = caseCatchingEvent(mobileResourceEvent);
				if (result == null) result = caseEvent(mobileResourceEvent);
				if (result == null) result = caseInteractionFlowElement(mobileResourceEvent);
				if (result == null) result = caseNamedElement(mobileResourceEvent);
				if (result == null) result = caseInteractionFlowModelElement(mobileResourceEvent);
				if (result == null) result = caseElement(mobileResourceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.BATTERY_EVENT: {
				BatteryEvent batteryEvent = (BatteryEvent)theEObject;
				T result = caseBatteryEvent(batteryEvent);
				if (result == null) result = caseMobileResourceEvent(batteryEvent);
				if (result == null) result = caseMobileSystemEvent(batteryEvent);
				if (result == null) result = caseSystemEvent(batteryEvent);
				if (result == null) result = caseCatchingEvent(batteryEvent);
				if (result == null) result = caseEvent(batteryEvent);
				if (result == null) result = caseInteractionFlowElement(batteryEvent);
				if (result == null) result = caseNamedElement(batteryEvent);
				if (result == null) result = caseInteractionFlowModelElement(batteryEvent);
				if (result == null) result = caseElement(batteryEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.CONNECTION_EVENT: {
				ConnectionEvent connectionEvent = (ConnectionEvent)theEObject;
				T result = caseConnectionEvent(connectionEvent);
				if (result == null) result = caseMobileResourceEvent(connectionEvent);
				if (result == null) result = caseMobileSystemEvent(connectionEvent);
				if (result == null) result = caseSystemEvent(connectionEvent);
				if (result == null) result = caseCatchingEvent(connectionEvent);
				if (result == null) result = caseEvent(connectionEvent);
				if (result == null) result = caseInteractionFlowElement(connectionEvent);
				if (result == null) result = caseNamedElement(connectionEvent);
				if (result == null) result = caseInteractionFlowModelElement(connectionEvent);
				if (result == null) result = caseElement(connectionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MEMORY_EVENT: {
				MemoryEvent memoryEvent = (MemoryEvent)theEObject;
				T result = caseMemoryEvent(memoryEvent);
				if (result == null) result = caseMobileResourceEvent(memoryEvent);
				if (result == null) result = caseMobileSystemEvent(memoryEvent);
				if (result == null) result = caseSystemEvent(memoryEvent);
				if (result == null) result = caseCatchingEvent(memoryEvent);
				if (result == null) result = caseEvent(memoryEvent);
				if (result == null) result = caseInteractionFlowElement(memoryEvent);
				if (result == null) result = caseNamedElement(memoryEvent);
				if (result == null) result = caseInteractionFlowModelElement(memoryEvent);
				if (result == null) result = caseElement(memoryEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_SENSOR_EVENT: {
				MobileSensorEvent mobileSensorEvent = (MobileSensorEvent)theEObject;
				T result = caseMobileSensorEvent(mobileSensorEvent);
				if (result == null) result = caseMobileSystemEvent(mobileSensorEvent);
				if (result == null) result = caseSystemEvent(mobileSensorEvent);
				if (result == null) result = caseCatchingEvent(mobileSensorEvent);
				if (result == null) result = caseEvent(mobileSensorEvent);
				if (result == null) result = caseInteractionFlowElement(mobileSensorEvent);
				if (result == null) result = caseNamedElement(mobileSensorEvent);
				if (result == null) result = caseInteractionFlowModelElement(mobileSensorEvent);
				if (result == null) result = caseElement(mobileSensorEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ACCELEROMETER_EVENT: {
				AccelerometerEvent accelerometerEvent = (AccelerometerEvent)theEObject;
				T result = caseAccelerometerEvent(accelerometerEvent);
				if (result == null) result = caseMobileSensorEvent(accelerometerEvent);
				if (result == null) result = caseMobileSystemEvent(accelerometerEvent);
				if (result == null) result = caseSystemEvent(accelerometerEvent);
				if (result == null) result = caseCatchingEvent(accelerometerEvent);
				if (result == null) result = caseEvent(accelerometerEvent);
				if (result == null) result = caseInteractionFlowElement(accelerometerEvent);
				if (result == null) result = caseNamedElement(accelerometerEvent);
				if (result == null) result = caseInteractionFlowModelElement(accelerometerEvent);
				if (result == null) result = caseElement(accelerometerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.GYROSCOPE_EVENT: {
				GyroscopeEvent gyroscopeEvent = (GyroscopeEvent)theEObject;
				T result = caseGyroscopeEvent(gyroscopeEvent);
				if (result == null) result = caseMobileSensorEvent(gyroscopeEvent);
				if (result == null) result = caseMobileSystemEvent(gyroscopeEvent);
				if (result == null) result = caseSystemEvent(gyroscopeEvent);
				if (result == null) result = caseCatchingEvent(gyroscopeEvent);
				if (result == null) result = caseEvent(gyroscopeEvent);
				if (result == null) result = caseInteractionFlowElement(gyroscopeEvent);
				if (result == null) result = caseNamedElement(gyroscopeEvent);
				if (result == null) result = caseInteractionFlowModelElement(gyroscopeEvent);
				if (result == null) result = caseElement(gyroscopeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.LOCATION_EVENT: {
				LocationEvent locationEvent = (LocationEvent)theEObject;
				T result = caseLocationEvent(locationEvent);
				if (result == null) result = caseMobileSensorEvent(locationEvent);
				if (result == null) result = caseMobileSystemEvent(locationEvent);
				if (result == null) result = caseSystemEvent(locationEvent);
				if (result == null) result = caseCatchingEvent(locationEvent);
				if (result == null) result = caseEvent(locationEvent);
				if (result == null) result = caseInteractionFlowElement(locationEvent);
				if (result == null) result = caseNamedElement(locationEvent);
				if (result == null) result = caseInteractionFlowModelElement(locationEvent);
				if (result == null) result = caseElement(locationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MAGNETOMETER_EVENT: {
				MagnetometerEvent magnetometerEvent = (MagnetometerEvent)theEObject;
				T result = caseMagnetometerEvent(magnetometerEvent);
				if (result == null) result = caseMobileSensorEvent(magnetometerEvent);
				if (result == null) result = caseMobileSystemEvent(magnetometerEvent);
				if (result == null) result = caseSystemEvent(magnetometerEvent);
				if (result == null) result = caseCatchingEvent(magnetometerEvent);
				if (result == null) result = caseEvent(magnetometerEvent);
				if (result == null) result = caseInteractionFlowElement(magnetometerEvent);
				if (result == null) result = caseNamedElement(magnetometerEvent);
				if (result == null) result = caseInteractionFlowModelElement(magnetometerEvent);
				if (result == null) result = caseElement(magnetometerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOTION_EVENT: {
				MotionEvent motionEvent = (MotionEvent)theEObject;
				T result = caseMotionEvent(motionEvent);
				if (result == null) result = caseMobileSensorEvent(motionEvent);
				if (result == null) result = caseMobileSystemEvent(motionEvent);
				if (result == null) result = caseSystemEvent(motionEvent);
				if (result == null) result = caseCatchingEvent(motionEvent);
				if (result == null) result = caseEvent(motionEvent);
				if (result == null) result = caseInteractionFlowElement(motionEvent);
				if (result == null) result = caseNamedElement(motionEvent);
				if (result == null) result = caseInteractionFlowModelElement(motionEvent);
				if (result == null) result = caseElement(motionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ORIENTATION_EVENT: {
				OrientationEvent orientationEvent = (OrientationEvent)theEObject;
				T result = caseOrientationEvent(orientationEvent);
				if (result == null) result = caseMotionEvent(orientationEvent);
				if (result == null) result = caseMobileSensorEvent(orientationEvent);
				if (result == null) result = caseMobileSystemEvent(orientationEvent);
				if (result == null) result = caseSystemEvent(orientationEvent);
				if (result == null) result = caseCatchingEvent(orientationEvent);
				if (result == null) result = caseEvent(orientationEvent);
				if (result == null) result = caseInteractionFlowElement(orientationEvent);
				if (result == null) result = caseNamedElement(orientationEvent);
				if (result == null) result = caseInteractionFlowModelElement(orientationEvent);
				if (result == null) result = caseElement(orientationEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.PROXIMITY_EVENT: {
				ProximityEvent proximityEvent = (ProximityEvent)theEObject;
				T result = caseProximityEvent(proximityEvent);
				if (result == null) result = caseMobileSensorEvent(proximityEvent);
				if (result == null) result = caseMobileSystemEvent(proximityEvent);
				if (result == null) result = caseSystemEvent(proximityEvent);
				if (result == null) result = caseCatchingEvent(proximityEvent);
				if (result == null) result = caseEvent(proximityEvent);
				if (result == null) result = caseInteractionFlowElement(proximityEvent);
				if (result == null) result = caseNamedElement(proximityEvent);
				if (result == null) result = caseInteractionFlowModelElement(proximityEvent);
				if (result == null) result = caseElement(proximityEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ROTATE_EVENT: {
				RotateEvent rotateEvent = (RotateEvent)theEObject;
				T result = caseRotateEvent(rotateEvent);
				if (result == null) result = caseTouchEvent(rotateEvent);
				if (result == null) result = caseMobileViewElementEvent(rotateEvent);
				if (result == null) result = caseViewElementEvent(rotateEvent);
				if (result == null) result = caseCatchingEvent(rotateEvent);
				if (result == null) result = caseEvent(rotateEvent);
				if (result == null) result = caseInteractionFlowElement(rotateEvent);
				if (result == null) result = caseNamedElement(rotateEvent);
				if (result == null) result = caseInteractionFlowModelElement(rotateEvent);
				if (result == null) result = caseElement(rotateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.SHAKE_EVENT: {
				ShakeEvent shakeEvent = (ShakeEvent)theEObject;
				T result = caseShakeEvent(shakeEvent);
				if (result == null) result = caseMotionEvent(shakeEvent);
				if (result == null) result = caseMobileSensorEvent(shakeEvent);
				if (result == null) result = caseMobileSystemEvent(shakeEvent);
				if (result == null) result = caseSystemEvent(shakeEvent);
				if (result == null) result = caseCatchingEvent(shakeEvent);
				if (result == null) result = caseEvent(shakeEvent);
				if (result == null) result = caseInteractionFlowElement(shakeEvent);
				if (result == null) result = caseNamedElement(shakeEvent);
				if (result == null) result = caseInteractionFlowModelElement(shakeEvent);
				if (result == null) result = caseElement(shakeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_DEVICE: {
				MobileDevice mobileDevice = (MobileDevice)theEObject;
				T result = caseMobileDevice(mobileDevice);
				if (result == null) result = caseDevice(mobileDevice);
				if (result == null) result = caseContextDimension(mobileDevice);
				if (result == null) result = caseNamedElement(mobileDevice);
				if (result == null) result = caseElement(mobileDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_DEVICE_SCREEN: {
				MobileDeviceScreen mobileDeviceScreen = (MobileDeviceScreen)theEObject;
				T result = caseMobileDeviceScreen(mobileDeviceScreen);
				if (result == null) result = caseNamedElement(mobileDeviceScreen);
				if (result == null) result = caseElement(mobileDeviceScreen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_DEVICE_SENSOR: {
				MobileDeviceSensor mobileDeviceSensor = (MobileDeviceSensor)theEObject;
				T result = caseMobileDeviceSensor(mobileDeviceSensor);
				if (result == null) result = caseNamedElement(mobileDeviceSensor);
				if (result == null) result = caseElement(mobileDeviceSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ACCELEROMETER: {
				Accelerometer accelerometer = (Accelerometer)theEObject;
				T result = caseAccelerometer(accelerometer);
				if (result == null) result = caseMobileDeviceSensor(accelerometer);
				if (result == null) result = caseNamedElement(accelerometer);
				if (result == null) result = caseElement(accelerometer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.GPS: {
				GPS gps = (GPS)theEObject;
				T result = caseGPS(gps);
				if (result == null) result = caseMobileDeviceSensor(gps);
				if (result == null) result = caseNamedElement(gps);
				if (result == null) result = caseElement(gps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.GYROSCOPE: {
				Gyroscope gyroscope = (Gyroscope)theEObject;
				T result = caseGyroscope(gyroscope);
				if (result == null) result = caseMobileDeviceSensor(gyroscope);
				if (result == null) result = caseNamedElement(gyroscope);
				if (result == null) result = caseElement(gyroscope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MAGNETOMETER: {
				Magnetometer magnetometer = (Magnetometer)theEObject;
				T result = caseMagnetometer(magnetometer);
				if (result == null) result = caseMobileDeviceSensor(magnetometer);
				if (result == null) result = caseNamedElement(magnetometer);
				if (result == null) result = caseElement(magnetometer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MICROPHONE: {
				Microphone microphone = (Microphone)theEObject;
				T result = caseMicrophone(microphone);
				if (result == null) result = caseMobileDeviceSensor(microphone);
				if (result == null) result = caseNamedElement(microphone);
				if (result == null) result = caseElement(microphone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.PROXIMITY_SENSOR: {
				ProximitySensor proximitySensor = (ProximitySensor)theEObject;
				T result = caseProximitySensor(proximitySensor);
				if (result == null) result = caseMobileDeviceSensor(proximitySensor);
				if (result == null) result = caseNamedElement(proximitySensor);
				if (result == null) result = caseElement(proximitySensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.STILL_CAMERA: {
				StillCamera stillCamera = (StillCamera)theEObject;
				T result = caseStillCamera(stillCamera);
				if (result == null) result = caseMobileDeviceSensor(stillCamera);
				if (result == null) result = caseNamedElement(stillCamera);
				if (result == null) result = caseElement(stillCamera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.VIDEO_CAMERA: {
				VideoCamera videoCamera = (VideoCamera)theEObject;
				T result = caseVideoCamera(videoCamera);
				if (result == null) result = caseMobileDeviceSensor(videoCamera);
				if (result == null) result = caseNamedElement(videoCamera);
				if (result == null) result = caseElement(videoCamera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MOBILE_CONTEXT_VARIABLE: {
				MobileContextVariable mobileContextVariable = (MobileContextVariable)theEObject;
				T result = caseMobileContextVariable(mobileContextVariable);
				if (result == null) result = caseSimpleContextVariable(mobileContextVariable);
				if (result == null) result = caseContextVariable(mobileContextVariable);
				if (result == null) result = caseNamedElement(mobileContextVariable);
				if (result == null) result = caseElement(mobileContextVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ACCELERATION: {
				Acceleration acceleration = (Acceleration)theEObject;
				T result = caseAcceleration(acceleration);
				if (result == null) result = caseMobileContextVariable(acceleration);
				if (result == null) result = caseSimpleContextVariable(acceleration);
				if (result == null) result = caseContextVariable(acceleration);
				if (result == null) result = caseNamedElement(acceleration);
				if (result == null) result = caseElement(acceleration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ACCELERATION_X: {
				AccelerationX accelerationX = (AccelerationX)theEObject;
				T result = caseAccelerationX(accelerationX);
				if (result == null) result = caseAcceleration(accelerationX);
				if (result == null) result = caseMobileContextVariable(accelerationX);
				if (result == null) result = caseSimpleContextVariable(accelerationX);
				if (result == null) result = caseContextVariable(accelerationX);
				if (result == null) result = caseNamedElement(accelerationX);
				if (result == null) result = caseElement(accelerationX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ACCELERATION_Y: {
				AccelerationY accelerationY = (AccelerationY)theEObject;
				T result = caseAccelerationY(accelerationY);
				if (result == null) result = caseAcceleration(accelerationY);
				if (result == null) result = caseMobileContextVariable(accelerationY);
				if (result == null) result = caseSimpleContextVariable(accelerationY);
				if (result == null) result = caseContextVariable(accelerationY);
				if (result == null) result = caseNamedElement(accelerationY);
				if (result == null) result = caseElement(accelerationY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ACCELERATION_Z: {
				AccelerationZ accelerationZ = (AccelerationZ)theEObject;
				T result = caseAccelerationZ(accelerationZ);
				if (result == null) result = caseAcceleration(accelerationZ);
				if (result == null) result = caseMobileContextVariable(accelerationZ);
				if (result == null) result = caseSimpleContextVariable(accelerationZ);
				if (result == null) result = caseContextVariable(accelerationZ);
				if (result == null) result = caseNamedElement(accelerationZ);
				if (result == null) result = caseElement(accelerationZ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseMobileContextVariable(location);
				if (result == null) result = caseSimpleContextVariable(location);
				if (result == null) result = caseContextVariable(location);
				if (result == null) result = caseNamedElement(location);
				if (result == null) result = caseElement(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ALTITUDE: {
				Altitude altitude = (Altitude)theEObject;
				T result = caseAltitude(altitude);
				if (result == null) result = caseLocation(altitude);
				if (result == null) result = caseMobileContextVariable(altitude);
				if (result == null) result = caseSimpleContextVariable(altitude);
				if (result == null) result = caseContextVariable(altitude);
				if (result == null) result = caseNamedElement(altitude);
				if (result == null) result = caseElement(altitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.HORIZONTAL_ACCURACY: {
				HorizontalAccuracy horizontalAccuracy = (HorizontalAccuracy)theEObject;
				T result = caseHorizontalAccuracy(horizontalAccuracy);
				if (result == null) result = caseLocation(horizontalAccuracy);
				if (result == null) result = caseMobileContextVariable(horizontalAccuracy);
				if (result == null) result = caseSimpleContextVariable(horizontalAccuracy);
				if (result == null) result = caseContextVariable(horizontalAccuracy);
				if (result == null) result = caseNamedElement(horizontalAccuracy);
				if (result == null) result = caseElement(horizontalAccuracy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.LATITUDE: {
				Latitude latitude = (Latitude)theEObject;
				T result = caseLatitude(latitude);
				if (result == null) result = caseLocation(latitude);
				if (result == null) result = caseMobileContextVariable(latitude);
				if (result == null) result = caseSimpleContextVariable(latitude);
				if (result == null) result = caseContextVariable(latitude);
				if (result == null) result = caseNamedElement(latitude);
				if (result == null) result = caseElement(latitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.LONGITUDE: {
				Longitude longitude = (Longitude)theEObject;
				T result = caseLongitude(longitude);
				if (result == null) result = caseLocation(longitude);
				if (result == null) result = caseMobileContextVariable(longitude);
				if (result == null) result = caseSimpleContextVariable(longitude);
				if (result == null) result = caseContextVariable(longitude);
				if (result == null) result = caseNamedElement(longitude);
				if (result == null) result = caseElement(longitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.SPEED: {
				Speed speed = (Speed)theEObject;
				T result = caseSpeed(speed);
				if (result == null) result = caseLocation(speed);
				if (result == null) result = caseMobileContextVariable(speed);
				if (result == null) result = caseSimpleContextVariable(speed);
				if (result == null) result = caseContextVariable(speed);
				if (result == null) result = caseNamedElement(speed);
				if (result == null) result = caseElement(speed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.VERTICAL_ACCURACY: {
				VerticalAccuracy verticalAccuracy = (VerticalAccuracy)theEObject;
				T result = caseVerticalAccuracy(verticalAccuracy);
				if (result == null) result = caseLocation(verticalAccuracy);
				if (result == null) result = caseMobileContextVariable(verticalAccuracy);
				if (result == null) result = caseSimpleContextVariable(verticalAccuracy);
				if (result == null) result = caseContextVariable(verticalAccuracy);
				if (result == null) result = caseNamedElement(verticalAccuracy);
				if (result == null) result = caseElement(verticalAccuracy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ATTITUDE: {
				Attitude attitude = (Attitude)theEObject;
				T result = caseAttitude(attitude);
				if (result == null) result = caseMobileContextVariable(attitude);
				if (result == null) result = caseSimpleContextVariable(attitude);
				if (result == null) result = caseContextVariable(attitude);
				if (result == null) result = caseNamedElement(attitude);
				if (result == null) result = caseElement(attitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.PITCH: {
				Pitch pitch = (Pitch)theEObject;
				T result = casePitch(pitch);
				if (result == null) result = caseAttitude(pitch);
				if (result == null) result = caseMobileContextVariable(pitch);
				if (result == null) result = caseSimpleContextVariable(pitch);
				if (result == null) result = caseContextVariable(pitch);
				if (result == null) result = caseNamedElement(pitch);
				if (result == null) result = caseElement(pitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ROLL: {
				Roll roll = (Roll)theEObject;
				T result = caseRoll(roll);
				if (result == null) result = caseAttitude(roll);
				if (result == null) result = caseMobileContextVariable(roll);
				if (result == null) result = caseSimpleContextVariable(roll);
				if (result == null) result = caseContextVariable(roll);
				if (result == null) result = caseNamedElement(roll);
				if (result == null) result = caseElement(roll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.YAW: {
				Yaw yaw = (Yaw)theEObject;
				T result = caseYaw(yaw);
				if (result == null) result = caseAttitude(yaw);
				if (result == null) result = caseMobileContextVariable(yaw);
				if (result == null) result = caseSimpleContextVariable(yaw);
				if (result == null) result = caseContextVariable(yaw);
				if (result == null) result = caseNamedElement(yaw);
				if (result == null) result = caseElement(yaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.BATTERY: {
				Battery battery = (Battery)theEObject;
				T result = caseBattery(battery);
				if (result == null) result = caseMobileContextVariable(battery);
				if (result == null) result = caseSimpleContextVariable(battery);
				if (result == null) result = caseContextVariable(battery);
				if (result == null) result = caseNamedElement(battery);
				if (result == null) result = caseElement(battery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.BATTERY_LEVEL: {
				BatteryLevel batteryLevel = (BatteryLevel)theEObject;
				T result = caseBatteryLevel(batteryLevel);
				if (result == null) result = caseBattery(batteryLevel);
				if (result == null) result = caseMobileContextVariable(batteryLevel);
				if (result == null) result = caseSimpleContextVariable(batteryLevel);
				if (result == null) result = caseContextVariable(batteryLevel);
				if (result == null) result = caseNamedElement(batteryLevel);
				if (result == null) result = caseElement(batteryLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.BATTERY_STATUS: {
				BatteryStatus batteryStatus = (BatteryStatus)theEObject;
				T result = caseBatteryStatus(batteryStatus);
				if (result == null) result = caseBattery(batteryStatus);
				if (result == null) result = caseMobileContextVariable(batteryStatus);
				if (result == null) result = caseSimpleContextVariable(batteryStatus);
				if (result == null) result = caseContextVariable(batteryStatus);
				if (result == null) result = caseNamedElement(batteryStatus);
				if (result == null) result = caseElement(batteryStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseMobileContextVariable(network);
				if (result == null) result = caseSimpleContextVariable(network);
				if (result == null) result = caseContextVariable(network);
				if (result == null) result = caseNamedElement(network);
				if (result == null) result = caseElement(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.BLUETOOTH: {
				Bluetooth bluetooth = (Bluetooth)theEObject;
				T result = caseBluetooth(bluetooth);
				if (result == null) result = caseNetwork(bluetooth);
				if (result == null) result = caseMobileContextVariable(bluetooth);
				if (result == null) result = caseSimpleContextVariable(bluetooth);
				if (result == null) result = caseContextVariable(bluetooth);
				if (result == null) result = caseNamedElement(bluetooth);
				if (result == null) result = caseElement(bluetooth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.CELLULAR: {
				Cellular cellular = (Cellular)theEObject;
				T result = caseCellular(cellular);
				if (result == null) result = caseNetwork(cellular);
				if (result == null) result = caseMobileContextVariable(cellular);
				if (result == null) result = caseSimpleContextVariable(cellular);
				if (result == null) result = caseContextVariable(cellular);
				if (result == null) result = caseNamedElement(cellular);
				if (result == null) result = caseElement(cellular);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.WI_FI: {
				WiFi wiFi = (WiFi)theEObject;
				T result = caseWiFi(wiFi);
				if (result == null) result = caseNetwork(wiFi);
				if (result == null) result = caseMobileContextVariable(wiFi);
				if (result == null) result = caseSimpleContextVariable(wiFi);
				if (result == null) result = caseContextVariable(wiFi);
				if (result == null) result = caseNamedElement(wiFi);
				if (result == null) result = caseElement(wiFi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.DIRECTION: {
				Direction direction = (Direction)theEObject;
				T result = caseDirection(direction);
				if (result == null) result = caseMobileContextVariable(direction);
				if (result == null) result = caseSimpleContextVariable(direction);
				if (result == null) result = caseContextVariable(direction);
				if (result == null) result = caseNamedElement(direction);
				if (result == null) result = caseElement(direction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MAGNETIC_HEADING_DIRECTION: {
				MagneticHeadingDirection magneticHeadingDirection = (MagneticHeadingDirection)theEObject;
				T result = caseMagneticHeadingDirection(magneticHeadingDirection);
				if (result == null) result = caseDirection(magneticHeadingDirection);
				if (result == null) result = caseMobileContextVariable(magneticHeadingDirection);
				if (result == null) result = caseSimpleContextVariable(magneticHeadingDirection);
				if (result == null) result = caseContextVariable(magneticHeadingDirection);
				if (result == null) result = caseNamedElement(magneticHeadingDirection);
				if (result == null) result = caseElement(magneticHeadingDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.MAGNETIC_HEADING_ACCURACY: {
				MagneticHeadingAccuracy magneticHeadingAccuracy = (MagneticHeadingAccuracy)theEObject;
				T result = caseMagneticHeadingAccuracy(magneticHeadingAccuracy);
				if (result == null) result = caseDirection(magneticHeadingAccuracy);
				if (result == null) result = caseMobileContextVariable(magneticHeadingAccuracy);
				if (result == null) result = caseSimpleContextVariable(magneticHeadingAccuracy);
				if (result == null) result = caseContextVariable(magneticHeadingAccuracy);
				if (result == null) result = caseNamedElement(magneticHeadingAccuracy);
				if (result == null) result = caseElement(magneticHeadingAccuracy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.TRUE_HEADING_DIRECTION: {
				TrueHeadingDirection trueHeadingDirection = (TrueHeadingDirection)theEObject;
				T result = caseTrueHeadingDirection(trueHeadingDirection);
				if (result == null) result = caseDirection(trueHeadingDirection);
				if (result == null) result = caseMobileContextVariable(trueHeadingDirection);
				if (result == null) result = caseSimpleContextVariable(trueHeadingDirection);
				if (result == null) result = caseContextVariable(trueHeadingDirection);
				if (result == null) result = caseNamedElement(trueHeadingDirection);
				if (result == null) result = caseElement(trueHeadingDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ROTATION: {
				Rotation rotation = (Rotation)theEObject;
				T result = caseRotation(rotation);
				if (result == null) result = caseMobileContextVariable(rotation);
				if (result == null) result = caseSimpleContextVariable(rotation);
				if (result == null) result = caseContextVariable(rotation);
				if (result == null) result = caseNamedElement(rotation);
				if (result == null) result = caseElement(rotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ROTATION_X: {
				RotationX rotationX = (RotationX)theEObject;
				T result = caseRotationX(rotationX);
				if (result == null) result = caseRotation(rotationX);
				if (result == null) result = caseMobileContextVariable(rotationX);
				if (result == null) result = caseSimpleContextVariable(rotationX);
				if (result == null) result = caseContextVariable(rotationX);
				if (result == null) result = caseNamedElement(rotationX);
				if (result == null) result = caseElement(rotationX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ROTATION_Y: {
				RotationY rotationY = (RotationY)theEObject;
				T result = caseRotationY(rotationY);
				if (result == null) result = caseRotation(rotationY);
				if (result == null) result = caseMobileContextVariable(rotationY);
				if (result == null) result = caseSimpleContextVariable(rotationY);
				if (result == null) result = caseContextVariable(rotationY);
				if (result == null) result = caseNamedElement(rotationY);
				if (result == null) result = caseElement(rotationY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobilePackage.ROTATION_Z: {
				RotationZ rotationZ = (RotationZ)theEObject;
				T result = caseRotationZ(rotationZ);
				if (result == null) result = caseRotation(rotationZ);
				if (result == null) result = caseMobileContextVariable(rotationZ);
				if (result == null) result = caseSimpleContextVariable(rotationZ);
				if (result == null) result = caseContextVariable(rotationZ);
				if (result == null) result = caseNamedElement(rotationZ);
				if (result == null) result = caseElement(rotationZ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileViewContainer(MobileViewContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreen(Screen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileViewComponent(MobileViewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileMessage(MobileMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchView(SearchView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileViewElementEvent(MobileViewElementEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchEvent(TouchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Press Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Press Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongPressEvent(LongPressEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pan Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pan Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanEvent(PanEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pinch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pinch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinchEvent(PinchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spread Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spread Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpreadEvent(SpreadEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swipe Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swipe Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwipeEvent(SwipeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tap Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tap Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapEvent(TapEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileAction(MobileAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraAction(CameraAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microphone Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microphone Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrophoneAction(MicrophoneAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileActionEvent(MobileActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraActionEvent(CameraActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microphone Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microphone Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrophoneActionEvent(MicrophoneActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileSystemEvent(MobileSystemEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileResourceEvent(MobileResourceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryEvent(BatteryEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionEvent(ConnectionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryEvent(MemoryEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileSensorEvent(MobileSensorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accelerometer Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accelerometer Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccelerometerEvent(AccelerometerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gyroscope Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gyroscope Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGyroscopeEvent(GyroscopeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationEvent(LocationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Magnetometer Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Magnetometer Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMagnetometerEvent(MagnetometerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motion Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motion Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotionEvent(MotionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientationEvent(OrientationEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proximity Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proximity Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProximityEvent(ProximityEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotateEvent(RotateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shake Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shake Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShakeEvent(ShakeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileDevice(MobileDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Screen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Screen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileDeviceScreen(MobileDeviceScreen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileDeviceSensor(MobileDeviceSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accelerometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accelerometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccelerometer(Accelerometer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPS(GPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gyroscope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gyroscope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGyroscope(Gyroscope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Magnetometer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Magnetometer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMagnetometer(Magnetometer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microphone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microphone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrophone(Microphone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proximity Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proximity Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProximitySensor(ProximitySensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Still Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Still Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStillCamera(StillCamera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoCamera(VideoCamera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileContextVariable(MobileContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceleration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceleration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceleration(Acceleration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceleration X</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceleration X</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccelerationX(AccelerationX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceleration Y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceleration Y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccelerationY(AccelerationY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceleration Z</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceleration Z</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccelerationZ(AccelerationZ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Altitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Altitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltitude(Altitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Accuracy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalAccuracy(HorizontalAccuracy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatitude(Latitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Longitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Longitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongitude(Longitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeed(Speed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Accuracy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalAccuracy(VerticalAccuracy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttitude(Attitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pitch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePitch(Pitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roll</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roll</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoll(Roll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yaw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yaw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYaw(Yaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBattery(Battery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryLevel(BatteryLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryStatus(BatteryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBluetooth(Bluetooth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cellular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cellular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCellular(Cellular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wi Fi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wi Fi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiFi(WiFi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirection(Direction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Magnetic Heading Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Magnetic Heading Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMagneticHeadingDirection(MagneticHeadingDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Magnetic Heading Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Magnetic Heading Accuracy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMagneticHeadingAccuracy(MagneticHeadingAccuracy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Heading Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Heading Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueHeadingDirection(TrueHeadingDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotation(Rotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation X</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation X</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationX(RotationX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationY(RotationY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Z</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Z</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationZ(RotationZ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowModelElement(InteractionFlowModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowElement(InteractionFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewContainer(ViewContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewComponent(ViewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchingEvent(CatchingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElementEvent(ViewElementEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFML Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFML Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFMLAction(IFMLAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEvent(ActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemEvent(SystemEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextDimension(ContextDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextVariable(ContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Context Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleContextVariable(SimpleContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MobileSwitch
