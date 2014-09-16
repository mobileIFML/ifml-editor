/**
 */
package IFML.Mobile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gyroscope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.Gyroscope#isIsAvailable <em>Is Available</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getGyroscope()
 * @model
 * @generated
 */
public interface Gyroscope extends MobileDeviceSensor {
	/**
	 * Returns the value of the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Available</em>' attribute.
	 * @see #setIsAvailable(boolean)
	 * @see IFML.Mobile.MobilePackage#getGyroscope_IsAvailable()
	 * @model dataType="org.eclipse.uml2.types.Boolean"
	 * @generated
	 */
	boolean isIsAvailable();

	/**
	 * Sets the value of the '{@link IFML.Mobile.Gyroscope#isIsAvailable <em>Is Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Available</em>' attribute.
	 * @see #isIsAvailable()
	 * @generated
	 */
	void setIsAvailable(boolean value);

} // Gyroscope
