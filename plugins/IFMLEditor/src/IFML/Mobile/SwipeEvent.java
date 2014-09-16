/**
 */
package IFML.Mobile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swipe Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFML.Mobile.SwipeEvent#getSwipeDirection <em>Swipe Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFML.Mobile.MobilePackage#getSwipeEvent()
 * @model
 * @generated
 */
public interface SwipeEvent extends TouchEvent {
	/**
	 * Returns the value of the '<em><b>Swipe Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link IFML.Mobile.SwipeDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swipe Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swipe Direction</em>' attribute.
	 * @see IFML.Mobile.SwipeDirection
	 * @see #setSwipeDirection(SwipeDirection)
	 * @see IFML.Mobile.MobilePackage#getSwipeEvent_SwipeDirection()
	 * @model
	 * @generated
	 */
	SwipeDirection getSwipeDirection();

	/**
	 * Sets the value of the '{@link IFML.Mobile.SwipeEvent#getSwipeDirection <em>Swipe Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swipe Direction</em>' attribute.
	 * @see IFML.Mobile.SwipeDirection
	 * @see #getSwipeDirection()
	 * @generated
	 */
	void setSwipeDirection(SwipeDirection value);

} // SwipeEvent
