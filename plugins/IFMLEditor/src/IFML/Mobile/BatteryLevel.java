/**
 */
package IFML.Mobile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.BatteryLevel#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getBatteryLevel()
 * @model
 * @generated
 */
public interface BatteryLevel extends Battery {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see IFML.Mobile.MobilePackage#getBatteryLevel_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link IFML.Mobile.BatteryLevel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // BatteryLevel
