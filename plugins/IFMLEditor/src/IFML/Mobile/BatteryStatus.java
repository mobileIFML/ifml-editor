/**
 */
package IFML.Mobile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.BatteryStatus#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getBatteryStatus()
 * @model
 * @generated
 */
public interface BatteryStatus extends Battery {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link IFML.Mobile.BatteryStatusDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see IFML.Mobile.BatteryStatusDescription
	 * @see #setValue(BatteryStatusDescription)
	 * @see IFML.Mobile.MobilePackage#getBatteryStatus_Value()
	 * @model
	 * @generated
	 */
	BatteryStatusDescription getValue();

	/**
	 * Sets the value of the '{@link IFML.Mobile.BatteryStatus#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see IFML.Mobile.BatteryStatusDescription
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BatteryStatusDescription value);

} // BatteryStatus
