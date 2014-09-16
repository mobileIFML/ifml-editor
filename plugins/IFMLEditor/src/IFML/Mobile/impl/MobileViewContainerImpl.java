/**
 */
package IFML.Mobile.impl;

import IFML.Core.impl.ViewContainerImpl;

import IFML.Mobile.MobilePackage;
import IFML.Mobile.MobileViewContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.MobileViewContainerImpl#isIsMobileSystem <em>Is Mobile System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MobileViewContainerImpl extends ViewContainerImpl implements MobileViewContainer {
	/**
	 * The default value of the '{@link #isIsMobileSystem() <em>Is Mobile System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMobileSystem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MOBILE_SYSTEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMobileSystem() <em>Is Mobile System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMobileSystem()
	 * @generated
	 * @ordered
	 */
	protected boolean isMobileSystem = IS_MOBILE_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileViewContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.MOBILE_VIEW_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMobileSystem() {
		return isMobileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMobileSystem(boolean newIsMobileSystem) {
		boolean oldIsMobileSystem = isMobileSystem;
		isMobileSystem = newIsMobileSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM, oldIsMobileSystem, isMobileSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM:
				return isIsMobileSystem();
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
			case MobilePackage.MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM:
				setIsMobileSystem((Boolean)newValue);
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
			case MobilePackage.MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM:
				setIsMobileSystem(IS_MOBILE_SYSTEM_EDEFAULT);
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
			case MobilePackage.MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM:
				return isMobileSystem != IS_MOBILE_SYSTEM_EDEFAULT;
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
		result.append(" (isMobileSystem: ");
		result.append(isMobileSystem);
		result.append(')');
		return result.toString();
	}

} //MobileViewContainerImpl
