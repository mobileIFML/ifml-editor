/**
 */
package IFML.Mobile.impl;

import IFML.Mobile.MobilePackage;
import IFML.Mobile.PanEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pan Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.PanEventImpl#getFingersCount <em>Fingers Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PanEventImpl extends TouchEventImpl implements PanEvent {
	/**
	 * The default value of the '{@link #getFingersCount() <em>Fingers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingersCount()
	 * @generated
	 * @ordered
	 */
	protected static final float FINGERS_COUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFingersCount() <em>Fingers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingersCount()
	 * @generated
	 * @ordered
	 */
	protected float fingersCount = FINGERS_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.PAN_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFingersCount() {
		return fingersCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFingersCount(float newFingersCount) {
		float oldFingersCount = fingersCount;
		fingersCount = newFingersCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.PAN_EVENT__FINGERS_COUNT, oldFingersCount, fingersCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.PAN_EVENT__FINGERS_COUNT:
				return getFingersCount();
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
			case MobilePackage.PAN_EVENT__FINGERS_COUNT:
				setFingersCount((Float)newValue);
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
			case MobilePackage.PAN_EVENT__FINGERS_COUNT:
				setFingersCount(FINGERS_COUNT_EDEFAULT);
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
			case MobilePackage.PAN_EVENT__FINGERS_COUNT:
				return fingersCount != FINGERS_COUNT_EDEFAULT;
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
		result.append(" (fingersCount: ");
		result.append(fingersCount);
		result.append(')');
		return result.toString();
	}

} //PanEventImpl
