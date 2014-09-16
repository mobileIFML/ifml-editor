/**
 */
package IFML.Mobile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Press Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.LongPressEvent#getPressDuration <em>Press Duration</em>}</li>
 *   <li>{@link IFML.Mobile.LongPressEvent#getFingersCount <em>Fingers Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getLongPressEvent()
 * @model
 * @generated
 */
public interface LongPressEvent extends TouchEvent {
	/**
	 * Returns the value of the '<em><b>Press Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Press Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Press Duration</em>' attribute.
	 * @see #setPressDuration(float)
	 * @see IFML.Mobile.MobilePackage#getLongPressEvent_PressDuration()
	 * @model
	 * @generated
	 */
	float getPressDuration();

	/**
	 * Sets the value of the '{@link IFML.Mobile.LongPressEvent#getPressDuration <em>Press Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Press Duration</em>' attribute.
	 * @see #getPressDuration()
	 * @generated
	 */
	void setPressDuration(float value);

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
	 * @see IFML.Mobile.MobilePackage#getLongPressEvent_FingersCount()
	 * @model
	 * @generated
	 */
	float getFingersCount();

	/**
	 * Sets the value of the '{@link IFML.Mobile.LongPressEvent#getFingersCount <em>Fingers Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fingers Count</em>' attribute.
	 * @see #getFingersCount()
	 * @generated
	 */
	void setFingersCount(float value);

} // LongPressEvent
