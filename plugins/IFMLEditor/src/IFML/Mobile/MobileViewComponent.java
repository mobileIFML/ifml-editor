/**
 */
package IFML.Mobile;

import IFML.Core.ViewComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.MobileViewComponent#isIsMobileSystem <em>Is Mobile System</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getMobileViewComponent()
 * @model
 * @generated
 */
public interface MobileViewComponent extends ViewComponent {

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
	 * @see IFML.Mobile.MobilePackage#getMobileViewComponent_IsMobileSystem()
	 * @model
	 * @generated
	 */
	boolean isIsMobileSystem();

	/**
	 * Sets the value of the '{@link IFML.Mobile.MobileViewComponent#isIsMobileSystem <em>Is Mobile System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mobile System</em>' attribute.
	 * @see #isIsMobileSystem()
	 * @generated
	 */
	void setIsMobileSystem(boolean value);
} // MobileViewComponent
