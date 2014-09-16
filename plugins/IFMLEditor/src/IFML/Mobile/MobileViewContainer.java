/**
 */
package IFML.Mobile;

import IFML.Core.ViewContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.MobileViewContainer#isIsMobileSystem <em>Is Mobile System</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getMobileViewContainer()
 * @model abstract="true"
 * @generated
 */
public interface MobileViewContainer extends ViewContainer {

	/**
	 * Returns the value of the '<em><b>Is Mobile System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mobile System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mobile System</em>' attribute.
	 * @see #setIsMobileSystem(boolean)
	 * @see IFML.Mobile.MobilePackage#getMobileViewContainer_IsMobileSystem()
	 * @model
	 * @generated
	 */
	boolean isIsMobileSystem();

	/**
	 * Sets the value of the '{@link IFML.Mobile.MobileViewContainer#isIsMobileSystem <em>Is Mobile System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mobile System</em>' attribute.
	 * @see #isIsMobileSystem()
	 * @generated
	 */
	void setIsMobileSystem(boolean value);
} // MobileViewContainer
