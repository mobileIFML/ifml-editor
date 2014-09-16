/**
 */
package IFML.Mobile.impl;

import IFML.Mobile.MobilePackage;
import IFML.Mobile.Screen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.ScreenImpl#isIsModal <em>Is Modal</em>}</li>
 *   <li>{@link IFML.Mobile.impl.ScreenImpl#isHasNavBar <em>Has Nav Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScreenImpl extends MobileViewContainerImpl implements Screen {
	/**
	 * The default value of the '{@link #isIsModal() <em>Is Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsModal() <em>Is Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModal()
	 * @generated
	 * @ordered
	 */
	protected boolean isModal = IS_MODAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasNavBar() <em>Has Nav Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasNavBar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_NAV_BAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasNavBar() <em>Has Nav Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasNavBar()
	 * @generated
	 * @ordered
	 */
	protected boolean hasNavBar = HAS_NAV_BAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.SCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsModal() {
		return isModal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModal(boolean newIsModal) {
		boolean oldIsModal = isModal;
		isModal = newIsModal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.SCREEN__IS_MODAL, oldIsModal, isModal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasNavBar() {
		return hasNavBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasNavBar(boolean newHasNavBar) {
		boolean oldHasNavBar = hasNavBar;
		hasNavBar = newHasNavBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.SCREEN__HAS_NAV_BAR, oldHasNavBar, hasNavBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.SCREEN__IS_MODAL:
				return isIsModal();
			case MobilePackage.SCREEN__HAS_NAV_BAR:
				return isHasNavBar();
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
			case MobilePackage.SCREEN__IS_MODAL:
				setIsModal((Boolean)newValue);
				return;
			case MobilePackage.SCREEN__HAS_NAV_BAR:
				setHasNavBar((Boolean)newValue);
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
			case MobilePackage.SCREEN__IS_MODAL:
				setIsModal(IS_MODAL_EDEFAULT);
				return;
			case MobilePackage.SCREEN__HAS_NAV_BAR:
				setHasNavBar(HAS_NAV_BAR_EDEFAULT);
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
			case MobilePackage.SCREEN__IS_MODAL:
				return isModal != IS_MODAL_EDEFAULT;
			case MobilePackage.SCREEN__HAS_NAV_BAR:
				return hasNavBar != HAS_NAV_BAR_EDEFAULT;
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
		result.append(" (isModal: ");
		result.append(isModal);
		result.append(", hasNavBar: ");
		result.append(hasNavBar);
		result.append(')');
		return result.toString();
	}

} //ScreenImpl
