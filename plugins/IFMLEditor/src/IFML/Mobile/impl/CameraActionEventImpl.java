/**
 */
package IFML.Mobile.impl;

import IFML.Core.ActionEvent;
import IFML.Core.ActivationExpression;
import IFML.Core.CatchingEvent;
import IFML.Core.CorePackage;
import IFML.Core.Event;
import IFML.Core.InteractionFlowExpression;

import IFML.Mobile.CameraActionEvent;
import IFML.Mobile.MobileActionEvent;
import IFML.Mobile.MobilePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Action Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Mobile.impl.CameraActionEventImpl#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link IFML.Mobile.impl.CameraActionEventImpl#getInteractionFlowExpression <em>Interaction Flow Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CameraActionEventImpl extends CameraActionImpl implements CameraActionEvent {
	/**
	 * The cached value of the '{@link #getActivationExpression() <em>Activation Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationExpression()
	 * @generated
	 * @ordered
	 */
	protected ActivationExpression activationExpression;

	/**
	 * The cached value of the '{@link #getInteractionFlowExpression() <em>Interaction Flow Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowExpression()
	 * @generated
	 * @ordered
	 */
	protected InteractionFlowExpression interactionFlowExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraActionEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilePackage.Literals.CAMERA_ACTION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationExpression getActivationExpression() {
		if (activationExpression != null && activationExpression.eIsProxy()) {
			InternalEObject oldActivationExpression = (InternalEObject)activationExpression;
			activationExpression = (ActivationExpression)eResolveProxy(oldActivationExpression);
			if (activationExpression != oldActivationExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobilePackage.CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
			}
		}
		return activationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationExpression basicGetActivationExpression() {
		return activationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationExpression(ActivationExpression newActivationExpression) {
		ActivationExpression oldActivationExpression = activationExpression;
		activationExpression = newActivationExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFlowExpression getInteractionFlowExpression() {
		return interactionFlowExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionFlowExpression(InteractionFlowExpression newInteractionFlowExpression, NotificationChain msgs) {
		InteractionFlowExpression oldInteractionFlowExpression = interactionFlowExpression;
		interactionFlowExpression = newInteractionFlowExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION, oldInteractionFlowExpression, newInteractionFlowExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionFlowExpression(InteractionFlowExpression newInteractionFlowExpression) {
		if (newInteractionFlowExpression != interactionFlowExpression) {
			NotificationChain msgs = null;
			if (interactionFlowExpression != null)
				msgs = ((InternalEObject)interactionFlowExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION, null, msgs);
			if (newInteractionFlowExpression != null)
				msgs = ((InternalEObject)newInteractionFlowExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION, null, msgs);
			msgs = basicSetInteractionFlowExpression(newInteractionFlowExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION, newInteractionFlowExpression, newInteractionFlowExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION:
				return basicSetInteractionFlowExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilePackage.CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION:
				if (resolve) return getActivationExpression();
				return basicGetActivationExpression();
			case MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION:
				return getInteractionFlowExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobilePackage.CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION:
				setActivationExpression((ActivationExpression)newValue);
				return;
			case MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION:
				setInteractionFlowExpression((InteractionFlowExpression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobilePackage.CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION:
				setActivationExpression((ActivationExpression)null);
				return;
			case MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION:
				setInteractionFlowExpression((InteractionFlowExpression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobilePackage.CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION:
				return activationExpression != null;
			case MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION:
				return interactionFlowExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Event.class) {
			switch (derivedFeatureID) {
				case MobilePackage.CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION: return CorePackage.EVENT__ACTIVATION_EXPRESSION;
				case MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION: return CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == CatchingEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActionEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MobileActionEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Event.class) {
			switch (baseFeatureID) {
				case CorePackage.EVENT__ACTIVATION_EXPRESSION: return MobilePackage.CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION;
				case CorePackage.EVENT__INTERACTION_FLOW_EXPRESSION: return MobilePackage.CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == CatchingEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActionEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MobileActionEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CameraActionEventImpl
