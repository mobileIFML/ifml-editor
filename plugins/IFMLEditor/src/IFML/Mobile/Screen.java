/**
 */
package IFML.Mobile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.Screen#isIsModal <em>Is Modal</em>}</li>
 *   <li>{@link IFML.Mobile.Screen#isHasNavBar <em>Has Nav Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getScreen()
 * @model
 * @generated
 */
public interface Screen extends MobileViewContainer {
	/**
	 * Returns the value of the '<em><b>Is Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modal</em>' attribute.
	 * @see #setIsModal(boolean)
	 * @see IFML.Mobile.MobilePackage#getScreen_IsModal()
	 * @model dataType="org.eclipse.uml2.types.Boolean"
	 * @generated
	 */
	boolean isIsModal();

	/**
	 * Sets the value of the '{@link IFML.Mobile.Screen#isIsModal <em>Is Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modal</em>' attribute.
	 * @see #isIsModal()
	 * @generated
	 */
	void setIsModal(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Nav Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Nav Bar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Nav Bar</em>' attribute.
	 * @see #setHasNavBar(boolean)
	 * @see IFML.Mobile.MobilePackage#getScreen_HasNavBar()
	 * @model dataType="org.eclipse.uml2.types.Boolean"
	 * @generated
	 */
	boolean isHasNavBar();

	/**
	 * Sets the value of the '{@link IFML.Mobile.Screen#isHasNavBar <em>Has Nav Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Nav Bar</em>' attribute.
	 * @see #isHasNavBar()
	 * @generated
	 */
	void setHasNavBar(boolean value);

} // Screen
