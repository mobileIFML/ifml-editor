/**
 */
package IFML.Mobile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.VideoCamera#isRear <em>Rear</em>}</li>
 *   <li>{@link IFML.Mobile.VideoCamera#isFront <em>Front</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getVideoCamera()
 * @model
 * @generated
 */
public interface VideoCamera extends MobileDeviceSensor {
	/**
	 * Returns the value of the '<em><b>Rear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rear</em>' attribute.
	 * @see #setRear(boolean)
	 * @see IFML.Mobile.MobilePackage#getVideoCamera_Rear()
	 * @model dataType="org.eclipse.uml2.types.Boolean"
	 * @generated
	 */
	boolean isRear();

	/**
	 * Sets the value of the '{@link IFML.Mobile.VideoCamera#isRear <em>Rear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rear</em>' attribute.
	 * @see #isRear()
	 * @generated
	 */
	void setRear(boolean value);

	/**
	 * Returns the value of the '<em><b>Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front</em>' attribute.
	 * @see #setFront(boolean)
	 * @see IFML.Mobile.MobilePackage#getVideoCamera_Front()
	 * @model dataType="org.eclipse.uml2.types.Boolean"
	 * @generated
	 */
	boolean isFront();

	/**
	 * Sets the value of the '{@link IFML.Mobile.VideoCamera#isFront <em>Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front</em>' attribute.
	 * @see #isFront()
	 * @generated
	 */
	void setFront(boolean value);

} // VideoCamera
