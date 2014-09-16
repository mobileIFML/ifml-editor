/**
 */
package IFML.Mobile.impl;

import IFML.Mobile.MobilePackage;
import IFML.Mobile.SwipeDirection;
import IFML.Mobile.SwipeEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swipe Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.SwipeEventImpl#getSwipeDirection <em>Swipe Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwipeEventImpl extends TouchEventImpl implements SwipeEvent {
	/**
	 * The default value of the '{@link #getSwipeDirection() <em>Swipe Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwipeDirection()
	 * @generated
	 * @ordered
	 */
	protected static final SwipeDirection SWIPE_DIRECTION_EDEFAULT = SwipeDirection.RIGHT;

	/**
	 * The cached value of the '{@link #getSwipeDirection() <em>Swipe Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwipeDirection()
	 * @generated
	 * @ordered
	 */
	protected SwipeDirection swipeDirection = SWIPE_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwipeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.SWIPE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwipeDirection getSwipeDirection() {
		return swipeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwipeDirection(SwipeDirection newSwipeDirection) {
		SwipeDirection oldSwipeDirection = swipeDirection;
		swipeDirection = newSwipeDirection == null ? SWIPE_DIRECTION_EDEFAULT : newSwipeDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.SWIPE_EVENT__SWIPE_DIRECTION, oldSwipeDirection, swipeDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.SWIPE_EVENT__SWIPE_DIRECTION:
				return getSwipeDirection();
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
			case MobilePackage.SWIPE_EVENT__SWIPE_DIRECTION:
				setSwipeDirection((SwipeDirection)newValue);
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
			case MobilePackage.SWIPE_EVENT__SWIPE_DIRECTION:
				setSwipeDirection(SWIPE_DIRECTION_EDEFAULT);
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
			case MobilePackage.SWIPE_EVENT__SWIPE_DIRECTION:
				return swipeDirection != SWIPE_DIRECTION_EDEFAULT;
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
		result.append(" (swipeDirection: ");
		result.append(swipeDirection);
		result.append(')');
		return result.toString();
	}

} //SwipeEventImpl
