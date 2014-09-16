/**
 */
package IFML.Mobile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pan Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.PanEvent#getFingersCount <em>Fingers Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getPanEvent()
 * @model
 * @generated
 */
public interface PanEvent extends TouchEvent {
	/**
	 * Returns the value of the '<em><b>Fingers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fingers Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fingers Count</em>' attribute.
	 * @see #setFingersCount(float)
	 * @see IFML.Mobile.MobilePackage#getPanEvent_FingersCount()
	 * @model
	 * @generated
	 */
	float getFingersCount();

	/**
	 * Sets the value of the '{@link IFML.Mobile.PanEvent#getFingersCount <em>Fingers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fingers Count</em>' attribute.
	 * @see #getFingersCount()
	 * @generated
	 */
	void setFingersCount(float value);

} // PanEvent
