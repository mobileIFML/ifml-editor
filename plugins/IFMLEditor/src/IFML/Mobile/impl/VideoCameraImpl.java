/**
 */
package IFML.Mobile.impl;

import IFML.Mobile.MobilePackage;
import IFML.Mobile.VideoCamera;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.VideoCameraImpl#isRear <em>Rear</em>}</li>
 *   <li>{@link IFML.Mobile.impl.VideoCameraImpl#isFront <em>Front</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VideoCameraImpl extends MobileDeviceSensorImpl implements VideoCamera {
	/**
	 * The default value of the '{@link #isRear() <em>Rear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRear()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRear() <em>Rear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRear()
	 * @generated
	 * @ordered
	 */
	protected boolean rear = REAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isFront() <em>Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFront()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRONT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFront() <em>Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFront()
	 * @generated
	 * @ordered
	 */
	protected boolean front = FRONT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoCameraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.VIDEO_CAMERA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRear() {
		return rear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRear(boolean newRear) {
		boolean oldRear = rear;
		rear = newRear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.VIDEO_CAMERA__REAR, oldRear, rear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFront() {
		return front;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFront(boolean newFront) {
		boolean oldFront = front;
		front = newFront;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.VIDEO_CAMERA__FRONT, oldFront, front));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.VIDEO_CAMERA__REAR:
				return isRear();
			case MobilePackage.VIDEO_CAMERA__FRONT:
				return isFront();
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
			case MobilePackage.VIDEO_CAMERA__REAR:
				setRear((Boolean)newValue);
				return;
			case MobilePackage.VIDEO_CAMERA__FRONT:
				setFront((Boolean)newValue);
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
			case MobilePackage.VIDEO_CAMERA__REAR:
				setRear(REAR_EDEFAULT);
				return;
			case MobilePackage.VIDEO_CAMERA__FRONT:
				setFront(FRONT_EDEFAULT);
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
			case MobilePackage.VIDEO_CAMERA__REAR:
				return rear != REAR_EDEFAULT;
			case MobilePackage.VIDEO_CAMERA__FRONT:
				return front != FRONT_EDEFAULT;
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
		result.append(" (rear: ");
		result.append(rear);
		result.append(", front: ");
		result.append(front);
		result.append(')');
		return result.toString();
	}

} //VideoCameraImpl
