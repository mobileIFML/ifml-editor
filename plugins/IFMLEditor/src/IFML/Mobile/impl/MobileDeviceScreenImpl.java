/**
 */
package IFML.Mobile.impl;

import IFML.Core.impl.NamedElementImpl;

import IFML.Mobile.MobileDeviceScreen;
import IFML.Mobile.MobilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.MobileDeviceScreenImpl#getHeigt <em>Heigt</em>}</li>
 *   <li>{@link IFML.Mobile.impl.MobileDeviceScreenImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link IFML.Mobile.impl.MobileDeviceScreenImpl#getDensity <em>Density</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobileDeviceScreenImpl extends NamedElementImpl implements MobileDeviceScreen {
	/**
	 * The default value of the '{@link #getHeigt() <em>Heigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigt()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeigt() <em>Heigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigt()
	 * @generated
	 * @ordered
	 */
	protected float heigt = HEIGT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected static final float DENSITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected float density = DENSITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileDeviceScreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.MOBILE_DEVICE_SCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeigt() {
		return heigt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeigt(float newHeigt) {
		float oldHeigt = heigt;
		heigt = newHeigt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.MOBILE_DEVICE_SCREEN__HEIGT, oldHeigt, heigt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.MOBILE_DEVICE_SCREEN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDensity() {
		return density;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDensity(float newDensity) {
		float oldDensity = density;
		density = newDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.MOBILE_DEVICE_SCREEN__DENSITY, oldDensity, density));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.MOBILE_DEVICE_SCREEN__HEIGT:
				return getHeigt();
			case MobilePackage.MOBILE_DEVICE_SCREEN__WIDTH:
				return getWidth();
			case MobilePackage.MOBILE_DEVICE_SCREEN__DENSITY:
				return getDensity();
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
			case MobilePackage.MOBILE_DEVICE_SCREEN__HEIGT:
				setHeigt((Float)newValue);
				return;
			case MobilePackage.MOBILE_DEVICE_SCREEN__WIDTH:
				setWidth((Float)newValue);
				return;
			case MobilePackage.MOBILE_DEVICE_SCREEN__DENSITY:
				setDensity((Float)newValue);
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
			case MobilePackage.MOBILE_DEVICE_SCREEN__HEIGT:
				setHeigt(HEIGT_EDEFAULT);
				return;
			case MobilePackage.MOBILE_DEVICE_SCREEN__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case MobilePackage.MOBILE_DEVICE_SCREEN__DENSITY:
				setDensity(DENSITY_EDEFAULT);
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
			case MobilePackage.MOBILE_DEVICE_SCREEN__HEIGT:
				return heigt != HEIGT_EDEFAULT;
			case MobilePackage.MOBILE_DEVICE_SCREEN__WIDTH:
				return width != WIDTH_EDEFAULT;
			case MobilePackage.MOBILE_DEVICE_SCREEN__DENSITY:
				return density != DENSITY_EDEFAULT;
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
		result.append(" (heigt: ");
		result.append(heigt);
		result.append(", width: ");
		result.append(width);
		result.append(", density: ");
		result.append(density);
		result.append(')');
		return result.toString();
	}

} //MobileDeviceScreenImpl
