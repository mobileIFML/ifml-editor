/**
 */
package IFML.Mobile;

import IFML.Core.CorePackage;

import IFML.Extensions.ExtensionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobileFactory
 * @model kind="package"
 * @generated
 */
public interface MobilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Mobile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/20130218/mobile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mobile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobilePackage eINSTANCE = IFML.Mobile.impl.MobilePackageImpl.init();

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileViewContainerImpl <em>View Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileViewContainerImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileViewContainer()
	 * @generated
	 */
	int MOBILE_VIEW_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__ID = CorePackage.VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__CONSTRAINTS = CorePackage.VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__ANNOTATIONS = CorePackage.VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__NAME = CorePackage.VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__PARAMETERS = CorePackage.VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__OUT_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__IN_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__ACTIVATION_EXPRESSION = CorePackage.VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__VIEW_CONTAINER = CorePackage.VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__IS_LANDMARK = CorePackage.VIEW_CONTAINER__IS_LANDMARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__IS_DEFAULT = CorePackage.VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__IS_XOR = CorePackage.VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__VIEW_ELEMENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__ACTIONS = CorePackage.VIEW_CONTAINER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Is Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__IS_HOME = CorePackage.VIEW_CONTAINER__IS_HOME;

	/**
	 * The feature id for the '<em><b>Is Mobile System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER_FEATURE_COUNT = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_CONTAINER_OPERATION_COUNT = CorePackage.VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.ScreenImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ID = MOBILE_VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__CONSTRAINTS = MOBILE_VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ANNOTATIONS = MOBILE_VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__NAME = MOBILE_VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__PARAMETERS = MOBILE_VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__OUT_INTERACTION_FLOWS = MOBILE_VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IN_INTERACTION_FLOWS = MOBILE_VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__VIEW_ELEMENT_EVENTS = MOBILE_VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ACTIVATION_EXPRESSION = MOBILE_VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__VIEW_CONTAINER = MOBILE_VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_LANDMARK = MOBILE_VIEW_CONTAINER__IS_LANDMARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_DEFAULT = MOBILE_VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_XOR = MOBILE_VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__VIEW_ELEMENTS = MOBILE_VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__ACTIONS = MOBILE_VIEW_CONTAINER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Is Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_HOME = MOBILE_VIEW_CONTAINER__IS_HOME;

	/**
	 * The feature id for the '<em><b>Is Mobile System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_MOBILE_SYSTEM = MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Is Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__IS_MODAL = MOBILE_VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Nav Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__HAS_NAV_BAR = MOBILE_VIEW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = MOBILE_VIEW_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OPERATION_COUNT = MOBILE_VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileViewComponentImpl <em>View Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileViewComponentImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileViewComponent()
	 * @generated
	 */
	int MOBILE_VIEW_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Is Mobile System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT__IS_MOBILE_SYSTEM = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_COMPONENT_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileMessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileMessageImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileMessage()
	 * @generated
	 */
	int MOBILE_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__ID = MOBILE_VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__CONSTRAINTS = MOBILE_VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__ANNOTATIONS = MOBILE_VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__NAME = MOBILE_VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__PARAMETERS = MOBILE_VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__OUT_INTERACTION_FLOWS = MOBILE_VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__IN_INTERACTION_FLOWS = MOBILE_VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__VIEW_ELEMENT_EVENTS = MOBILE_VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__ACTIVATION_EXPRESSION = MOBILE_VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__VIEW_CONTAINER = MOBILE_VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__VIEW_COMPONENT_PARTS = MOBILE_VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Is Mobile System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE__IS_MOBILE_SYSTEM = MOBILE_VIEW_COMPONENT__IS_MOBILE_SYSTEM;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE_FEATURE_COUNT = MOBILE_VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_MESSAGE_OPERATION_COUNT = MOBILE_VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.SearchViewImpl <em>Search View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.SearchViewImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getSearchView()
	 * @generated
	 */
	int SEARCH_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__ID = MOBILE_VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__CONSTRAINTS = MOBILE_VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__ANNOTATIONS = MOBILE_VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__NAME = MOBILE_VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__PARAMETERS = MOBILE_VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__OUT_INTERACTION_FLOWS = MOBILE_VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__IN_INTERACTION_FLOWS = MOBILE_VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__VIEW_ELEMENT_EVENTS = MOBILE_VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__ACTIVATION_EXPRESSION = MOBILE_VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__VIEW_CONTAINER = MOBILE_VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__VIEW_COMPONENT_PARTS = MOBILE_VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Is Mobile System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW__IS_MOBILE_SYSTEM = MOBILE_VIEW_COMPONENT__IS_MOBILE_SYSTEM;

	/**
	 * The number of structural features of the '<em>Search View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW_FEATURE_COUNT = MOBILE_VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Search View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIEW_OPERATION_COUNT = MOBILE_VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileViewElementEventImpl <em>View Element Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileViewElementEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileViewElementEvent()
	 * @generated
	 */
	int MOBILE_VIEW_ELEMENT_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__ID = CorePackage.VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__CONSTRAINTS = CorePackage.VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__ANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__NAME = CorePackage.VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__PARAMETERS = CorePackage.VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT__VIEW_ELEMENT = CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>View Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_VIEW_ELEMENT_EVENT_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.TouchEventImpl <em>Touch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.TouchEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getTouchEvent()
	 * @generated
	 */
	int TOUCH_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__ID = MOBILE_VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__CONSTRAINTS = MOBILE_VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__ANNOTATIONS = MOBILE_VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__NAME = MOBILE_VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__PARAMETERS = MOBILE_VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__OUT_INTERACTION_FLOWS = MOBILE_VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__IN_INTERACTION_FLOWS = MOBILE_VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__ACTIVATION_EXPRESSION = MOBILE_VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT__VIEW_ELEMENT = MOBILE_VIEW_ELEMENT_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Touch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT_FEATURE_COUNT = MOBILE_VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Touch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_EVENT_OPERATION_COUNT = MOBILE_VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.LongPressEventImpl <em>Long Press Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.LongPressEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getLongPressEvent()
	 * @generated
	 */
	int LONG_PRESS_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__ID = TOUCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__CONSTRAINTS = TOUCH_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__ANNOTATIONS = TOUCH_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__NAME = TOUCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__PARAMETERS = TOUCH_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__OUT_INTERACTION_FLOWS = TOUCH_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__IN_INTERACTION_FLOWS = TOUCH_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__ACTIVATION_EXPRESSION = TOUCH_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__INTERACTION_FLOW_EXPRESSION = TOUCH_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__VIEW_ELEMENT = TOUCH_EVENT__VIEW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Press Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__PRESS_DURATION = TOUCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fingers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT__FINGERS_COUNT = TOUCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Long Press Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT_FEATURE_COUNT = TOUCH_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Long Press Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_PRESS_EVENT_OPERATION_COUNT = TOUCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.PanEventImpl <em>Pan Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.PanEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getPanEvent()
	 * @generated
	 */
	int PAN_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__ID = TOUCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__CONSTRAINTS = TOUCH_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__ANNOTATIONS = TOUCH_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__NAME = TOUCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__PARAMETERS = TOUCH_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__OUT_INTERACTION_FLOWS = TOUCH_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__IN_INTERACTION_FLOWS = TOUCH_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__ACTIVATION_EXPRESSION = TOUCH_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__INTERACTION_FLOW_EXPRESSION = TOUCH_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__VIEW_ELEMENT = TOUCH_EVENT__VIEW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Fingers Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT__FINGERS_COUNT = TOUCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pan Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT_FEATURE_COUNT = TOUCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pan Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_EVENT_OPERATION_COUNT = TOUCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.PinchEventImpl <em>Pinch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.PinchEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getPinchEvent()
	 * @generated
	 */
	int PINCH_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__ID = TOUCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__CONSTRAINTS = TOUCH_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__ANNOTATIONS = TOUCH_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__NAME = TOUCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__PARAMETERS = TOUCH_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__OUT_INTERACTION_FLOWS = TOUCH_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__IN_INTERACTION_FLOWS = TOUCH_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__ACTIVATION_EXPRESSION = TOUCH_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__INTERACTION_FLOW_EXPRESSION = TOUCH_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT__VIEW_ELEMENT = TOUCH_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Pinch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT_FEATURE_COUNT = TOUCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pinch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINCH_EVENT_OPERATION_COUNT = TOUCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.SwipeEventImpl <em>Swipe Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.SwipeEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getSwipeEvent()
	 * @generated
	 */
	int SWIPE_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__ID = TOUCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__CONSTRAINTS = TOUCH_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__ANNOTATIONS = TOUCH_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__NAME = TOUCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__PARAMETERS = TOUCH_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__OUT_INTERACTION_FLOWS = TOUCH_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__IN_INTERACTION_FLOWS = TOUCH_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__ACTIVATION_EXPRESSION = TOUCH_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__INTERACTION_FLOW_EXPRESSION = TOUCH_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__VIEW_ELEMENT = TOUCH_EVENT__VIEW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Swipe Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT__SWIPE_DIRECTION = TOUCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swipe Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT_FEATURE_COUNT = TOUCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swipe Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIPE_EVENT_OPERATION_COUNT = TOUCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.TapEventImpl <em>Tap Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.TapEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getTapEvent()
	 * @generated
	 */
	int TAP_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__ID = TOUCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__CONSTRAINTS = TOUCH_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__ANNOTATIONS = TOUCH_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__NAME = TOUCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__PARAMETERS = TOUCH_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__OUT_INTERACTION_FLOWS = TOUCH_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__IN_INTERACTION_FLOWS = TOUCH_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__ACTIVATION_EXPRESSION = TOUCH_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__INTERACTION_FLOW_EXPRESSION = TOUCH_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT__VIEW_ELEMENT = TOUCH_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Tap Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT_FEATURE_COUNT = TOUCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tap Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAP_EVENT_OPERATION_COUNT = TOUCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileActionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileAction()
	 * @generated
	 */
	int MOBILE_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__ID = CorePackage.IFML_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__CONSTRAINTS = CorePackage.IFML_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__ANNOTATIONS = CorePackage.IFML_ACTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__NAME = CorePackage.IFML_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__PARAMETERS = CorePackage.IFML_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__OUT_INTERACTION_FLOWS = CorePackage.IFML_ACTION__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__IN_INTERACTION_FLOWS = CorePackage.IFML_ACTION__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__ACTION_EVENTS = CorePackage.IFML_ACTION__ACTION_EVENTS;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__DYNAMIC_BEHAVIOR = CorePackage.IFML_ACTION__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION__VIEW_CONTAINER = CorePackage.IFML_ACTION__VIEW_CONTAINER;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_FEATURE_COUNT = CorePackage.IFML_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_OPERATION_COUNT = CorePackage.IFML_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.CameraActionImpl <em>Camera Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.CameraActionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getCameraAction()
	 * @generated
	 */
	int CAMERA_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__ID = MOBILE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__CONSTRAINTS = MOBILE_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__ANNOTATIONS = MOBILE_ACTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__NAME = MOBILE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__PARAMETERS = MOBILE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__OUT_INTERACTION_FLOWS = MOBILE_ACTION__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__IN_INTERACTION_FLOWS = MOBILE_ACTION__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__ACTION_EVENTS = MOBILE_ACTION__ACTION_EVENTS;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__DYNAMIC_BEHAVIOR = MOBILE_ACTION__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION__VIEW_CONTAINER = MOBILE_ACTION__VIEW_CONTAINER;

	/**
	 * The number of structural features of the '<em>Camera Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_FEATURE_COUNT = MOBILE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Camera Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_OPERATION_COUNT = MOBILE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MicrophoneActionImpl <em>Microphone Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MicrophoneActionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophoneAction()
	 * @generated
	 */
	int MICROPHONE_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__ID = MOBILE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__CONSTRAINTS = MOBILE_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__ANNOTATIONS = MOBILE_ACTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__NAME = MOBILE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__PARAMETERS = MOBILE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__OUT_INTERACTION_FLOWS = MOBILE_ACTION__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__IN_INTERACTION_FLOWS = MOBILE_ACTION__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__ACTION_EVENTS = MOBILE_ACTION__ACTION_EVENTS;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__DYNAMIC_BEHAVIOR = MOBILE_ACTION__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION__VIEW_CONTAINER = MOBILE_ACTION__VIEW_CONTAINER;

	/**
	 * The number of structural features of the '<em>Microphone Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_FEATURE_COUNT = MOBILE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microphone Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_OPERATION_COUNT = MOBILE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileActionEventImpl <em>Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileActionEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileActionEvent()
	 * @generated
	 */
	int MOBILE_ACTION_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__ID = CorePackage.ACTION_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__CONSTRAINTS = CorePackage.ACTION_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__ANNOTATIONS = CorePackage.ACTION_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__NAME = CorePackage.ACTION_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__PARAMETERS = CorePackage.ACTION_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__OUT_INTERACTION_FLOWS = CorePackage.ACTION_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__IN_INTERACTION_FLOWS = CorePackage.ACTION_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__ACTIVATION_EXPRESSION = CorePackage.ACTION_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.ACTION_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT_FEATURE_COUNT = CorePackage.ACTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_ACTION_EVENT_OPERATION_COUNT = CorePackage.ACTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.CameraActionEventImpl <em>Camera Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.CameraActionEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getCameraActionEvent()
	 * @generated
	 */
	int CAMERA_ACTION_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__ID = CAMERA_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__CONSTRAINTS = CAMERA_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__ANNOTATIONS = CAMERA_ACTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__NAME = CAMERA_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__PARAMETERS = CAMERA_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__OUT_INTERACTION_FLOWS = CAMERA_ACTION__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__IN_INTERACTION_FLOWS = CAMERA_ACTION__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__ACTION_EVENTS = CAMERA_ACTION__ACTION_EVENTS;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__DYNAMIC_BEHAVIOR = CAMERA_ACTION__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__VIEW_CONTAINER = CAMERA_ACTION__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__ACTIVATION_EXPRESSION = CAMERA_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = CAMERA_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Camera Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT_FEATURE_COUNT = CAMERA_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Camera Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_ACTION_EVENT_OPERATION_COUNT = CAMERA_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MicrophoneActionEventImpl <em>Microphone Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MicrophoneActionEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophoneActionEvent()
	 * @generated
	 */
	int MICROPHONE_ACTION_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__ID = MICROPHONE_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__CONSTRAINTS = MICROPHONE_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__ANNOTATIONS = MICROPHONE_ACTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__NAME = MICROPHONE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__PARAMETERS = MICROPHONE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__OUT_INTERACTION_FLOWS = MICROPHONE_ACTION__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__IN_INTERACTION_FLOWS = MICROPHONE_ACTION__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__ACTION_EVENTS = MICROPHONE_ACTION__ACTION_EVENTS;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__DYNAMIC_BEHAVIOR = MICROPHONE_ACTION__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__VIEW_CONTAINER = MICROPHONE_ACTION__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__ACTIVATION_EXPRESSION = MICROPHONE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = MICROPHONE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Microphone Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT_FEATURE_COUNT = MICROPHONE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Microphone Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_ACTION_EVENT_OPERATION_COUNT = MICROPHONE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileSystemEventImpl <em>System Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileSystemEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileSystemEvent()
	 * @generated
	 */
	int MOBILE_SYSTEM_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__ID = CorePackage.SYSTEM_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__CONSTRAINTS = CorePackage.SYSTEM_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__ANNOTATIONS = CorePackage.SYSTEM_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__NAME = CorePackage.SYSTEM_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__PARAMETERS = CorePackage.SYSTEM_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__OUT_INTERACTION_FLOWS = CorePackage.SYSTEM_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__IN_INTERACTION_FLOWS = CorePackage.SYSTEM_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__ACTIVATION_EXPRESSION = CorePackage.SYSTEM_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__TRIGGERING_EXPRESSIONS = CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT__TYPE = CorePackage.SYSTEM_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT_FEATURE_COUNT = CorePackage.SYSTEM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SYSTEM_EVENT_OPERATION_COUNT = CorePackage.SYSTEM_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileResourceEventImpl <em>Resource Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileResourceEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileResourceEvent()
	 * @generated
	 */
	int MOBILE_RESOURCE_EVENT = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__ID = MOBILE_SYSTEM_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__CONSTRAINTS = MOBILE_SYSTEM_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__ANNOTATIONS = MOBILE_SYSTEM_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__NAME = MOBILE_SYSTEM_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__PARAMETERS = MOBILE_SYSTEM_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SYSTEM_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__IN_INTERACTION_FLOWS = MOBILE_SYSTEM_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__ACTIVATION_EXPRESSION = MOBILE_SYSTEM_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SYSTEM_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT__TYPE = MOBILE_SYSTEM_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Resource Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT_FEATURE_COUNT = MOBILE_SYSTEM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_RESOURCE_EVENT_OPERATION_COUNT = MOBILE_SYSTEM_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.BatteryEventImpl <em>Battery Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.BatteryEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryEvent()
	 * @generated
	 */
	int BATTERY_EVENT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__ID = MOBILE_RESOURCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__CONSTRAINTS = MOBILE_RESOURCE_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__ANNOTATIONS = MOBILE_RESOURCE_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__NAME = MOBILE_RESOURCE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__PARAMETERS = MOBILE_RESOURCE_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__OUT_INTERACTION_FLOWS = MOBILE_RESOURCE_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__IN_INTERACTION_FLOWS = MOBILE_RESOURCE_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__ACTIVATION_EXPRESSION = MOBILE_RESOURCE_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_RESOURCE_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_RESOURCE_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT__TYPE = MOBILE_RESOURCE_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Battery Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT_FEATURE_COUNT = MOBILE_RESOURCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Battery Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_EVENT_OPERATION_COUNT = MOBILE_RESOURCE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.ConnectionEventImpl <em>Connection Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.ConnectionEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getConnectionEvent()
	 * @generated
	 */
	int CONNECTION_EVENT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__ID = MOBILE_RESOURCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__CONSTRAINTS = MOBILE_RESOURCE_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__ANNOTATIONS = MOBILE_RESOURCE_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__NAME = MOBILE_RESOURCE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__PARAMETERS = MOBILE_RESOURCE_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__OUT_INTERACTION_FLOWS = MOBILE_RESOURCE_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__IN_INTERACTION_FLOWS = MOBILE_RESOURCE_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__ACTIVATION_EXPRESSION = MOBILE_RESOURCE_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_RESOURCE_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_RESOURCE_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT__TYPE = MOBILE_RESOURCE_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Connection Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT_FEATURE_COUNT = MOBILE_RESOURCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_EVENT_OPERATION_COUNT = MOBILE_RESOURCE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MemoryEventImpl <em>Memory Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MemoryEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMemoryEvent()
	 * @generated
	 */
	int MEMORY_EVENT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__ID = MOBILE_RESOURCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__CONSTRAINTS = MOBILE_RESOURCE_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__ANNOTATIONS = MOBILE_RESOURCE_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__NAME = MOBILE_RESOURCE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__PARAMETERS = MOBILE_RESOURCE_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__OUT_INTERACTION_FLOWS = MOBILE_RESOURCE_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__IN_INTERACTION_FLOWS = MOBILE_RESOURCE_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__ACTIVATION_EXPRESSION = MOBILE_RESOURCE_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_RESOURCE_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_RESOURCE_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT__TYPE = MOBILE_RESOURCE_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Memory Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT_FEATURE_COUNT = MOBILE_RESOURCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Memory Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_EVENT_OPERATION_COUNT = MOBILE_RESOURCE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileSensorEventImpl <em>Sensor Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileSensorEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileSensorEvent()
	 * @generated
	 */
	int MOBILE_SENSOR_EVENT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__ID = MOBILE_SYSTEM_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__CONSTRAINTS = MOBILE_SYSTEM_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__ANNOTATIONS = MOBILE_SYSTEM_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__NAME = MOBILE_SYSTEM_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__PARAMETERS = MOBILE_SYSTEM_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SYSTEM_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__IN_INTERACTION_FLOWS = MOBILE_SYSTEM_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__ACTIVATION_EXPRESSION = MOBILE_SYSTEM_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SYSTEM_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT__TYPE = MOBILE_SYSTEM_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Sensor Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT_FEATURE_COUNT = MOBILE_SYSTEM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_SENSOR_EVENT_OPERATION_COUNT = MOBILE_SYSTEM_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.AccelerometerEventImpl <em>Accelerometer Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.AccelerometerEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerometerEvent()
	 * @generated
	 */
	int ACCELEROMETER_EVENT = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__ID = MOBILE_SENSOR_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__CONSTRAINTS = MOBILE_SENSOR_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__ANNOTATIONS = MOBILE_SENSOR_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__NAME = MOBILE_SENSOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__PARAMETERS = MOBILE_SENSOR_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__IN_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__ACTIVATION_EXPRESSION = MOBILE_SENSOR_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SENSOR_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SENSOR_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT__TYPE = MOBILE_SENSOR_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Accelerometer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT_FEATURE_COUNT = MOBILE_SENSOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accelerometer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_EVENT_OPERATION_COUNT = MOBILE_SENSOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.GyroscopeEventImpl <em>Gyroscope Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.GyroscopeEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getGyroscopeEvent()
	 * @generated
	 */
	int GYROSCOPE_EVENT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__ID = MOBILE_SENSOR_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__CONSTRAINTS = MOBILE_SENSOR_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__ANNOTATIONS = MOBILE_SENSOR_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__NAME = MOBILE_SENSOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__PARAMETERS = MOBILE_SENSOR_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__IN_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__ACTIVATION_EXPRESSION = MOBILE_SENSOR_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SENSOR_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SENSOR_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT__TYPE = MOBILE_SENSOR_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Gyroscope Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT_FEATURE_COUNT = MOBILE_SENSOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gyroscope Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_EVENT_OPERATION_COUNT = MOBILE_SENSOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.LocationEventImpl <em>Location Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.LocationEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getLocationEvent()
	 * @generated
	 */
	int LOCATION_EVENT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__ID = MOBILE_SENSOR_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__CONSTRAINTS = MOBILE_SENSOR_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__ANNOTATIONS = MOBILE_SENSOR_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__NAME = MOBILE_SENSOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__PARAMETERS = MOBILE_SENSOR_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__IN_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__ACTIVATION_EXPRESSION = MOBILE_SENSOR_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SENSOR_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SENSOR_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT__TYPE = MOBILE_SENSOR_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Location Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT_FEATURE_COUNT = MOBILE_SENSOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_EVENT_OPERATION_COUNT = MOBILE_SENSOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MagnetometerEventImpl <em>Magnetometer Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MagnetometerEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMagnetometerEvent()
	 * @generated
	 */
	int MAGNETOMETER_EVENT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__ID = MOBILE_SENSOR_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__CONSTRAINTS = MOBILE_SENSOR_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__ANNOTATIONS = MOBILE_SENSOR_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__NAME = MOBILE_SENSOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__PARAMETERS = MOBILE_SENSOR_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__IN_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__ACTIVATION_EXPRESSION = MOBILE_SENSOR_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SENSOR_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SENSOR_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT__TYPE = MOBILE_SENSOR_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Magnetometer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT_FEATURE_COUNT = MOBILE_SENSOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Magnetometer Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_EVENT_OPERATION_COUNT = MOBILE_SENSOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MotionEventImpl <em>Motion Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MotionEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMotionEvent()
	 * @generated
	 */
	int MOTION_EVENT = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__ID = MOBILE_SENSOR_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__CONSTRAINTS = MOBILE_SENSOR_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__ANNOTATIONS = MOBILE_SENSOR_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__NAME = MOBILE_SENSOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__PARAMETERS = MOBILE_SENSOR_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__IN_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__ACTIVATION_EXPRESSION = MOBILE_SENSOR_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SENSOR_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SENSOR_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT__TYPE = MOBILE_SENSOR_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Motion Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT_FEATURE_COUNT = MOBILE_SENSOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motion Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVENT_OPERATION_COUNT = MOBILE_SENSOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.OrientationEventImpl <em>Orientation Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.OrientationEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getOrientationEvent()
	 * @generated
	 */
	int ORIENTATION_EVENT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__ID = MOTION_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__CONSTRAINTS = MOTION_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__ANNOTATIONS = MOTION_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__NAME = MOTION_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__PARAMETERS = MOTION_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__OUT_INTERACTION_FLOWS = MOTION_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__IN_INTERACTION_FLOWS = MOTION_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__ACTIVATION_EXPRESSION = MOTION_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__INTERACTION_FLOW_EXPRESSION = MOTION_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__TRIGGERING_EXPRESSIONS = MOTION_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT__TYPE = MOTION_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Orientation Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT_FEATURE_COUNT = MOTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Orientation Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_EVENT_OPERATION_COUNT = MOTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.ProximityEventImpl <em>Proximity Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.ProximityEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getProximityEvent()
	 * @generated
	 */
	int PROXIMITY_EVENT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__ID = MOBILE_SENSOR_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__CONSTRAINTS = MOBILE_SENSOR_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__ANNOTATIONS = MOBILE_SENSOR_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__NAME = MOBILE_SENSOR_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__PARAMETERS = MOBILE_SENSOR_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__OUT_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__IN_INTERACTION_FLOWS = MOBILE_SENSOR_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__ACTIVATION_EXPRESSION = MOBILE_SENSOR_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__INTERACTION_FLOW_EXPRESSION = MOBILE_SENSOR_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__TRIGGERING_EXPRESSIONS = MOBILE_SENSOR_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT__TYPE = MOBILE_SENSOR_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Proximity Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT_FEATURE_COUNT = MOBILE_SENSOR_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proximity Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_EVENT_OPERATION_COUNT = MOBILE_SENSOR_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.RotateEventImpl <em>Rotate Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.RotateEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getRotateEvent()
	 * @generated
	 */
	int ROTATE_EVENT = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__ID = TOUCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__CONSTRAINTS = TOUCH_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__ANNOTATIONS = TOUCH_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__NAME = TOUCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__PARAMETERS = TOUCH_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__OUT_INTERACTION_FLOWS = TOUCH_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__IN_INTERACTION_FLOWS = TOUCH_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__ACTIVATION_EXPRESSION = TOUCH_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__INTERACTION_FLOW_EXPRESSION = TOUCH_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT__VIEW_ELEMENT = TOUCH_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Rotate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT_FEATURE_COUNT = TOUCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_EVENT_OPERATION_COUNT = TOUCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.ShakeEventImpl <em>Shake Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.ShakeEventImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getShakeEvent()
	 * @generated
	 */
	int SHAKE_EVENT = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__ID = MOTION_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__CONSTRAINTS = MOTION_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__ANNOTATIONS = MOTION_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__NAME = MOTION_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__PARAMETERS = MOTION_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__OUT_INTERACTION_FLOWS = MOTION_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__IN_INTERACTION_FLOWS = MOTION_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__ACTIVATION_EXPRESSION = MOTION_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__INTERACTION_FLOW_EXPRESSION = MOTION_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__TRIGGERING_EXPRESSIONS = MOTION_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT__TYPE = MOTION_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Shake Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT_FEATURE_COUNT = MOTION_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shake Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAKE_EVENT_OPERATION_COUNT = MOTION_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileDeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileDeviceImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileDevice()
	 * @generated
	 */
	int MOBILE_DEVICE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__ID = ExtensionsPackage.DEVICE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__CONSTRAINTS = ExtensionsPackage.DEVICE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__ANNOTATIONS = ExtensionsPackage.DEVICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__NAME = ExtensionsPackage.DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Screens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__SCREENS = ExtensionsPackage.DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__SENSORS = ExtensionsPackage.DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_FEATURE_COUNT = ExtensionsPackage.DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_OPERATION_COUNT = ExtensionsPackage.DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileDeviceScreenImpl <em>Device Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileDeviceScreenImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileDeviceScreen()
	 * @generated
	 */
	int MOBILE_DEVICE_SCREEN = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN__ID = CorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN__CONSTRAINTS = CorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Heigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN__HEIGT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN__WIDTH = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN__DENSITY = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Device Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Device Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SCREEN_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileDeviceSensorImpl <em>Device Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileDeviceSensorImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileDeviceSensor()
	 * @generated
	 */
	int MOBILE_DEVICE_SENSOR = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SENSOR__ID = CorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SENSOR__CONSTRAINTS = CorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SENSOR__ANNOTATIONS = CorePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SENSOR__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Device Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SENSOR_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_SENSOR_OPERATION_COUNT = CorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.AccelerometerImpl <em>Accelerometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.AccelerometerImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerometer()
	 * @generated
	 */
	int ACCELEROMETER = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER__ID = MOBILE_DEVICE_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER__CONSTRAINTS = MOBILE_DEVICE_SENSOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER__ANNOTATIONS = MOBILE_DEVICE_SENSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER__NAME = MOBILE_DEVICE_SENSOR__NAME;

	/**
	 * The number of structural features of the '<em>Accelerometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_FEATURE_COUNT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accelerometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELEROMETER_OPERATION_COUNT = MOBILE_DEVICE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.GPSImpl <em>GPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.GPSImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getGPS()
	 * @generated
	 */
	int GPS = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__ID = MOBILE_DEVICE_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__CONSTRAINTS = MOBILE_DEVICE_SENSOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__ANNOTATIONS = MOBILE_DEVICE_SENSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__NAME = MOBILE_DEVICE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__IS_AVAILABLE = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__IS_ENABLED = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FEATURE_COUNT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_OPERATION_COUNT = MOBILE_DEVICE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.GyroscopeImpl <em>Gyroscope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.GyroscopeImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getGyroscope()
	 * @generated
	 */
	int GYROSCOPE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE__ID = MOBILE_DEVICE_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE__CONSTRAINTS = MOBILE_DEVICE_SENSOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE__ANNOTATIONS = MOBILE_DEVICE_SENSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE__NAME = MOBILE_DEVICE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE__IS_AVAILABLE = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gyroscope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_FEATURE_COUNT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gyroscope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GYROSCOPE_OPERATION_COUNT = MOBILE_DEVICE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MagnetometerImpl <em>Magnetometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MagnetometerImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMagnetometer()
	 * @generated
	 */
	int MAGNETOMETER = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER__ID = MOBILE_DEVICE_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER__CONSTRAINTS = MOBILE_DEVICE_SENSOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER__ANNOTATIONS = MOBILE_DEVICE_SENSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER__NAME = MOBILE_DEVICE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER__IS_AVAILABLE = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Magnetometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_FEATURE_COUNT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Magnetometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETOMETER_OPERATION_COUNT = MOBILE_DEVICE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MicrophoneImpl <em>Microphone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MicrophoneImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophone()
	 * @generated
	 */
	int MICROPHONE = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__ID = MOBILE_DEVICE_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__CONSTRAINTS = MOBILE_DEVICE_SENSOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__ANNOTATIONS = MOBILE_DEVICE_SENSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__NAME = MOBILE_DEVICE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE__IS_AVAILABLE = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Microphone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_FEATURE_COUNT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Microphone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROPHONE_OPERATION_COUNT = MOBILE_DEVICE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.ProximitySensorImpl <em>Proximity Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.ProximitySensorImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getProximitySensor()
	 * @generated
	 */
	int PROXIMITY_SENSOR = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_SENSOR__ID = MOBILE_DEVICE_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_SENSOR__CONSTRAINTS = MOBILE_DEVICE_SENSOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_SENSOR__ANNOTATIONS = MOBILE_DEVICE_SENSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_SENSOR__NAME = MOBILE_DEVICE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_SENSOR__IS_AVAILABLE = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proximity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_SENSOR_FEATURE_COUNT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proximity Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXIMITY_SENSOR_OPERATION_COUNT = MOBILE_DEVICE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.StillCameraImpl <em>Still Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.StillCameraImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getStillCamera()
	 * @generated
	 */
	int STILL_CAMERA = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STILL_CAMERA__ID = MOBILE_DEVICE_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STILL_CAMERA__CONSTRAINTS = MOBILE_DEVICE_SENSOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STILL_CAMERA__ANNOTATIONS = MOBILE_DEVICE_SENSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STILL_CAMERA__NAME = MOBILE_DEVICE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STILL_CAMERA__FRONT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STILL_CAMERA__REAR = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Still Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STILL_CAMERA_FEATURE_COUNT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Still Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STILL_CAMERA_OPERATION_COUNT = MOBILE_DEVICE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.VideoCameraImpl <em>Video Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.VideoCameraImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getVideoCamera()
	 * @generated
	 */
	int VIDEO_CAMERA = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CAMERA__ID = MOBILE_DEVICE_SENSOR__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CAMERA__CONSTRAINTS = MOBILE_DEVICE_SENSOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CAMERA__ANNOTATIONS = MOBILE_DEVICE_SENSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CAMERA__NAME = MOBILE_DEVICE_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Rear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CAMERA__REAR = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CAMERA__FRONT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Video Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CAMERA_FEATURE_COUNT = MOBILE_DEVICE_SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Video Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CAMERA_OPERATION_COUNT = MOBILE_DEVICE_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MobileContextVariableImpl <em>Context Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MobileContextVariableImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileContextVariable()
	 * @generated
	 */
	int MOBILE_CONTEXT_VARIABLE = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_CONTEXT_VARIABLE__ID = CorePackage.SIMPLE_CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_CONTEXT_VARIABLE__CONSTRAINTS = CorePackage.SIMPLE_CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_CONTEXT_VARIABLE__ANNOTATIONS = CorePackage.SIMPLE_CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_CONTEXT_VARIABLE__NAME = CorePackage.SIMPLE_CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_CONTEXT_VARIABLE__CONTEXT = CorePackage.SIMPLE_CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_CONTEXT_VARIABLE__SCOPE = CorePackage.SIMPLE_CONTEXT_VARIABLE__SCOPE;

	/**
	 * The number of structural features of the '<em>Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT = CorePackage.SIMPLE_CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_CONTEXT_VARIABLE_OPERATION_COUNT = CorePackage.SIMPLE_CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.AccelerationImpl <em>Acceleration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.AccelerationImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getAcceleration()
	 * @generated
	 */
	int ACCELERATION = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION__ID = MOBILE_CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION__CONSTRAINTS = MOBILE_CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION__ANNOTATIONS = MOBILE_CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION__NAME = MOBILE_CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION__CONTEXT = MOBILE_CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION__SCOPE = MOBILE_CONTEXT_VARIABLE__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION__IS_AVAILABLE = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acceleration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_FEATURE_COUNT = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acceleration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_OPERATION_COUNT = MOBILE_CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.AccelerationXImpl <em>Acceleration X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.AccelerationXImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerationX()
	 * @generated
	 */
	int ACCELERATION_X = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X__ID = ACCELERATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X__CONSTRAINTS = ACCELERATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X__ANNOTATIONS = ACCELERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X__NAME = ACCELERATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X__CONTEXT = ACCELERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X__SCOPE = ACCELERATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X__IS_AVAILABLE = ACCELERATION__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X__VALUE = ACCELERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acceleration X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X_FEATURE_COUNT = ACCELERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acceleration X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_X_OPERATION_COUNT = ACCELERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.AccelerationYImpl <em>Acceleration Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.AccelerationYImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerationY()
	 * @generated
	 */
	int ACCELERATION_Y = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y__ID = ACCELERATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y__CONSTRAINTS = ACCELERATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y__ANNOTATIONS = ACCELERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y__NAME = ACCELERATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y__CONTEXT = ACCELERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y__SCOPE = ACCELERATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y__IS_AVAILABLE = ACCELERATION__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y__VALUE = ACCELERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acceleration Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y_FEATURE_COUNT = ACCELERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acceleration Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Y_OPERATION_COUNT = ACCELERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.AccelerationZImpl <em>Acceleration Z</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.AccelerationZImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerationZ()
	 * @generated
	 */
	int ACCELERATION_Z = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z__ID = ACCELERATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z__CONSTRAINTS = ACCELERATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z__ANNOTATIONS = ACCELERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z__NAME = ACCELERATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z__CONTEXT = ACCELERATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z__SCOPE = ACCELERATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z__IS_AVAILABLE = ACCELERATION__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z__VALUE = ACCELERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acceleration Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z_FEATURE_COUNT = ACCELERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acceleration Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCELERATION_Z_OPERATION_COUNT = ACCELERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.LocationImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = MOBILE_CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONSTRAINTS = MOBILE_CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ANNOTATIONS = MOBILE_CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = MOBILE_CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTEXT = MOBILE_CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SCOPE = MOBILE_CONTEXT_VARIABLE__SCOPE;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = MOBILE_CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.AltitudeImpl <em>Altitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.AltitudeImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getAltitude()
	 * @generated
	 */
	int ALTITUDE = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE__CONSTRAINTS = LOCATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE__CONTEXT = LOCATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE__SCOPE = LOCATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE__VALUE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Altitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Altitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTITUDE_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.HorizontalAccuracyImpl <em>Horizontal Accuracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.HorizontalAccuracyImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getHorizontalAccuracy()
	 * @generated
	 */
	int HORIZONTAL_ACCURACY = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY__CONSTRAINTS = LOCATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY__CONTEXT = LOCATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY__SCOPE = LOCATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY__VALUE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Horizontal Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Horizontal Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_ACCURACY_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.LatitudeImpl <em>Latitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.LatitudeImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getLatitude()
	 * @generated
	 */
	int LATITUDE = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE__CONSTRAINTS = LOCATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE__CONTEXT = LOCATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE__SCOPE = LOCATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE__VALUE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Latitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Latitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATITUDE_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.LongitudeImpl <em>Longitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.LongitudeImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getLongitude()
	 * @generated
	 */
	int LONGITUDE = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE__CONSTRAINTS = LOCATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE__CONTEXT = LOCATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE__SCOPE = LOCATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE__VALUE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Longitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Longitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGITUDE_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.SpeedImpl <em>Speed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.SpeedImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getSpeed()
	 * @generated
	 */
	int SPEED = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__CONSTRAINTS = LOCATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__CONTEXT = LOCATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__SCOPE = LOCATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED__VALUE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Speed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.VerticalAccuracyImpl <em>Vertical Accuracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.VerticalAccuracyImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getVerticalAccuracy()
	 * @generated
	 */
	int VERTICAL_ACCURACY = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY__CONSTRAINTS = LOCATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY__CONTEXT = LOCATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY__SCOPE = LOCATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY__VALUE = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vertical Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vertical Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_ACCURACY_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.AttitudeImpl <em>Attitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.AttitudeImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getAttitude()
	 * @generated
	 */
	int ATTITUDE = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE__ID = MOBILE_CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE__CONSTRAINTS = MOBILE_CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE__ANNOTATIONS = MOBILE_CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE__NAME = MOBILE_CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE__CONTEXT = MOBILE_CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE__SCOPE = MOBILE_CONTEXT_VARIABLE__SCOPE;

	/**
	 * The number of structural features of the '<em>Attitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE_FEATURE_COUNT = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE_OPERATION_COUNT = MOBILE_CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.PitchImpl <em>Pitch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.PitchImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getPitch()
	 * @generated
	 */
	int PITCH = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__ID = ATTITUDE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__CONSTRAINTS = ATTITUDE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__ANNOTATIONS = ATTITUDE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__NAME = ATTITUDE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__CONTEXT = ATTITUDE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__SCOPE = ATTITUDE__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__VALUE = ATTITUDE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_FEATURE_COUNT = ATTITUDE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_OPERATION_COUNT = ATTITUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.RollImpl <em>Roll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.RollImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getRoll()
	 * @generated
	 */
	int ROLL = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL__ID = ATTITUDE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL__CONSTRAINTS = ATTITUDE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL__ANNOTATIONS = ATTITUDE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL__NAME = ATTITUDE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL__CONTEXT = ATTITUDE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL__SCOPE = ATTITUDE__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL__VALUE = ATTITUDE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Roll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_FEATURE_COUNT = ATTITUDE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Roll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLL_OPERATION_COUNT = ATTITUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.YawImpl <em>Yaw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.YawImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getYaw()
	 * @generated
	 */
	int YAW = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW__ID = ATTITUDE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW__CONSTRAINTS = ATTITUDE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW__ANNOTATIONS = ATTITUDE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW__NAME = ATTITUDE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW__CONTEXT = ATTITUDE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW__SCOPE = ATTITUDE__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW__VALUE = ATTITUDE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Yaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW_FEATURE_COUNT = ATTITUDE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Yaw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW_OPERATION_COUNT = ATTITUDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.BatteryImpl <em>Battery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.BatteryImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getBattery()
	 * @generated
	 */
	int BATTERY = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__ID = MOBILE_CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CONSTRAINTS = MOBILE_CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__ANNOTATIONS = MOBILE_CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__NAME = MOBILE_CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__CONTEXT = MOBILE_CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY__SCOPE = MOBILE_CONTEXT_VARIABLE__SCOPE;

	/**
	 * The number of structural features of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_FEATURE_COUNT = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Battery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_OPERATION_COUNT = MOBILE_CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.BatteryLevelImpl <em>Battery Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.BatteryLevelImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryLevel()
	 * @generated
	 */
	int BATTERY_LEVEL = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL__ID = BATTERY__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL__CONSTRAINTS = BATTERY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL__ANNOTATIONS = BATTERY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL__NAME = BATTERY__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL__CONTEXT = BATTERY__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL__SCOPE = BATTERY__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL__VALUE = BATTERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Battery Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL_FEATURE_COUNT = BATTERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Battery Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_LEVEL_OPERATION_COUNT = BATTERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.BatteryStatusImpl <em>Battery Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.BatteryStatusImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryStatus()
	 * @generated
	 */
	int BATTERY_STATUS = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__ID = BATTERY__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__CONSTRAINTS = BATTERY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__ANNOTATIONS = BATTERY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__NAME = BATTERY__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__CONTEXT = BATTERY__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__SCOPE = BATTERY__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS__VALUE = BATTERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Battery Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS_FEATURE_COUNT = BATTERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Battery Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_STATUS_OPERATION_COUNT = BATTERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.NetworkImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = MOBILE_CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CONSTRAINTS = MOBILE_CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ANNOTATIONS = MOBILE_CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = MOBILE_CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CONTEXT = MOBILE_CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SCOPE = MOBILE_CONTEXT_VARIABLE__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IS_AVAILABLE = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = MOBILE_CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.BluetoothImpl <em>Bluetooth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.BluetoothImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getBluetooth()
	 * @generated
	 */
	int BLUETOOTH = 64;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH__ID = NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH__CONSTRAINTS = NETWORK__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH__ANNOTATIONS = NETWORK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH__NAME = NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH__CONTEXT = NETWORK__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH__SCOPE = NETWORK__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH__IS_AVAILABLE = NETWORK__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH__VALUE = NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bluetooth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_FEATURE_COUNT = NETWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bluetooth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_OPERATION_COUNT = NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.CellularImpl <em>Cellular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.CellularImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getCellular()
	 * @generated
	 */
	int CELLULAR = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR__ID = NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR__CONSTRAINTS = NETWORK__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR__ANNOTATIONS = NETWORK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR__NAME = NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR__CONTEXT = NETWORK__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR__SCOPE = NETWORK__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR__IS_AVAILABLE = NETWORK__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR__VALUE = NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cellular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_FEATURE_COUNT = NETWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cellular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_OPERATION_COUNT = NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.WiFiImpl <em>Wi Fi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.WiFiImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getWiFi()
	 * @generated
	 */
	int WI_FI = 66;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI__ID = NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI__CONSTRAINTS = NETWORK__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI__ANNOTATIONS = NETWORK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI__NAME = NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI__CONTEXT = NETWORK__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI__SCOPE = NETWORK__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI__IS_AVAILABLE = NETWORK__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI__VALUE = NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wi Fi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI_FEATURE_COUNT = NETWORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wi Fi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WI_FI_OPERATION_COUNT = NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.DirectionImpl <em>Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.DirectionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__ID = MOBILE_CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__CONSTRAINTS = MOBILE_CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__ANNOTATIONS = MOBILE_CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__NAME = MOBILE_CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__CONTEXT = MOBILE_CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION__SCOPE = MOBILE_CONTEXT_VARIABLE__SCOPE;

	/**
	 * The number of structural features of the '<em>Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_FEATURE_COUNT = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_OPERATION_COUNT = MOBILE_CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MagneticHeadingDirectionImpl <em>Magnetic Heading Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MagneticHeadingDirectionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMagneticHeadingDirection()
	 * @generated
	 */
	int MAGNETIC_HEADING_DIRECTION = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION__ID = DIRECTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION__CONSTRAINTS = DIRECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION__ANNOTATIONS = DIRECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION__NAME = DIRECTION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION__CONTEXT = DIRECTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION__SCOPE = DIRECTION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION__VALUE = DIRECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Magnetic Heading Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION_FEATURE_COUNT = DIRECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Magnetic Heading Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_DIRECTION_OPERATION_COUNT = DIRECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.MagneticHeadingAccuracyImpl <em>Magnetic Heading Accuracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.MagneticHeadingAccuracyImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getMagneticHeadingAccuracy()
	 * @generated
	 */
	int MAGNETIC_HEADING_ACCURACY = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY__ID = DIRECTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY__CONSTRAINTS = DIRECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY__ANNOTATIONS = DIRECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY__NAME = DIRECTION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY__CONTEXT = DIRECTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY__SCOPE = DIRECTION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY__VALUE = DIRECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Magnetic Heading Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY_FEATURE_COUNT = DIRECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Magnetic Heading Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAGNETIC_HEADING_ACCURACY_OPERATION_COUNT = DIRECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.TrueHeadingDirectionImpl <em>True Heading Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.TrueHeadingDirectionImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getTrueHeadingDirection()
	 * @generated
	 */
	int TRUE_HEADING_DIRECTION = 70;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION__ID = DIRECTION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION__CONSTRAINTS = DIRECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION__ANNOTATIONS = DIRECTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION__NAME = DIRECTION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION__CONTEXT = DIRECTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION__SCOPE = DIRECTION__SCOPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION__VALUE = DIRECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>True Heading Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION_FEATURE_COUNT = DIRECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>True Heading Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_HEADING_DIRECTION_OPERATION_COUNT = DIRECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.RotationImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__ID = MOBILE_CONTEXT_VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__CONSTRAINTS = MOBILE_CONTEXT_VARIABLE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__ANNOTATIONS = MOBILE_CONTEXT_VARIABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__NAME = MOBILE_CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__CONTEXT = MOBILE_CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__SCOPE = MOBILE_CONTEXT_VARIABLE__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__IS_AVAILABLE = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = MOBILE_CONTEXT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = MOBILE_CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.RotationXImpl <em>Rotation X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.RotationXImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getRotationX()
	 * @generated
	 */
	int ROTATION_X = 72;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X__ID = ROTATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X__CONSTRAINTS = ROTATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X__ANNOTATIONS = ROTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X__NAME = ROTATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X__CONTEXT = ROTATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X__SCOPE = ROTATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X__IS_AVAILABLE = ROTATION__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X__VALUE = ROTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotation X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X_FEATURE_COUNT = ROTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rotation X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_X_OPERATION_COUNT = ROTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.RotationYImpl <em>Rotation Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.RotationYImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getRotationY()
	 * @generated
	 */
	int ROTATION_Y = 73;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y__ID = ROTATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y__CONSTRAINTS = ROTATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y__ANNOTATIONS = ROTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y__NAME = ROTATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y__CONTEXT = ROTATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y__SCOPE = ROTATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y__IS_AVAILABLE = ROTATION__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y__VALUE = ROTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotation Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y_FEATURE_COUNT = ROTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rotation Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Y_OPERATION_COUNT = ROTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.impl.RotationZImpl <em>Rotation Z</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.impl.RotationZImpl
	 * @see IFML.Mobile.impl.MobilePackageImpl#getRotationZ()
	 * @generated
	 */
	int ROTATION_Z = 74;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z__ID = ROTATION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z__CONSTRAINTS = ROTATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z__ANNOTATIONS = ROTATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z__NAME = ROTATION__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z__CONTEXT = ROTATION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z__SCOPE = ROTATION__SCOPE;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z__IS_AVAILABLE = ROTATION__IS_AVAILABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z__VALUE = ROTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotation Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z_FEATURE_COUNT = ROTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rotation Z</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_Z_OPERATION_COUNT = ROTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Mobile.SwipeDirection <em>Swipe Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.SwipeDirection
	 * @see IFML.Mobile.impl.MobilePackageImpl#getSwipeDirection()
	 * @generated
	 */
	int SWIPE_DIRECTION = 75;

	/**
	 * The meta object id for the '{@link IFML.Mobile.BatteryStatusDescription <em>Battery Status Description</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.BatteryStatusDescription
	 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryStatusDescription()
	 * @generated
	 */
	int BATTERY_STATUS_DESCRIPTION = 76;

	/**
	 * The meta object id for the '{@link IFML.Mobile.OrientationDescription <em>Orientation Description</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Mobile.OrientationDescription
	 * @see IFML.Mobile.impl.MobilePackageImpl#getOrientationDescription()
	 * @generated
	 */
	int ORIENTATION_DESCRIPTION = 77;


	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Container</em>'.
	 * @see IFML.Mobile.MobileViewContainer
	 * @generated
	 */
	EClass getMobileViewContainer();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.MobileViewContainer#isIsMobileSystem <em>Is Mobile System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mobile System</em>'.
	 * @see IFML.Mobile.MobileViewContainer#isIsMobileSystem()
	 * @see #getMobileViewContainer()
	 * @generated
	 */
	EAttribute getMobileViewContainer_IsMobileSystem();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see IFML.Mobile.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Screen#isIsModal <em>Is Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modal</em>'.
	 * @see IFML.Mobile.Screen#isIsModal()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_IsModal();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Screen#isHasNavBar <em>Has Nav Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Nav Bar</em>'.
	 * @see IFML.Mobile.Screen#isHasNavBar()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_HasNavBar();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Component</em>'.
	 * @see IFML.Mobile.MobileViewComponent
	 * @generated
	 */
	EClass getMobileViewComponent();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.MobileViewComponent#isIsMobileSystem <em>Is Mobile System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mobile System</em>'.
	 * @see IFML.Mobile.MobileViewComponent#isIsMobileSystem()
	 * @see #getMobileViewComponent()
	 * @generated
	 */
	EAttribute getMobileViewComponent_IsMobileSystem();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see IFML.Mobile.MobileMessage
	 * @generated
	 */
	EClass getMobileMessage();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.SearchView <em>Search View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search View</em>'.
	 * @see IFML.Mobile.SearchView
	 * @generated
	 */
	EClass getSearchView();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element Event</em>'.
	 * @see IFML.Mobile.MobileViewElementEvent
	 * @generated
	 */
	EClass getMobileViewElementEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.TouchEvent <em>Touch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Event</em>'.
	 * @see IFML.Mobile.TouchEvent
	 * @generated
	 */
	EClass getTouchEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.LongPressEvent <em>Long Press Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Press Event</em>'.
	 * @see IFML.Mobile.LongPressEvent
	 * @generated
	 */
	EClass getLongPressEvent();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.LongPressEvent#getPressDuration <em>Press Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Press Duration</em>'.
	 * @see IFML.Mobile.LongPressEvent#getPressDuration()
	 * @see #getLongPressEvent()
	 * @generated
	 */
	EAttribute getLongPressEvent_PressDuration();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.LongPressEvent#getFingersCount <em>Fingers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fingers Count</em>'.
	 * @see IFML.Mobile.LongPressEvent#getFingersCount()
	 * @see #getLongPressEvent()
	 * @generated
	 */
	EAttribute getLongPressEvent_FingersCount();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.PanEvent <em>Pan Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pan Event</em>'.
	 * @see IFML.Mobile.PanEvent
	 * @generated
	 */
	EClass getPanEvent();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.PanEvent#getFingersCount <em>Fingers Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fingers Count</em>'.
	 * @see IFML.Mobile.PanEvent#getFingersCount()
	 * @see #getPanEvent()
	 * @generated
	 */
	EAttribute getPanEvent_FingersCount();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.PinchEvent <em>Pinch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pinch Event</em>'.
	 * @see IFML.Mobile.PinchEvent
	 * @generated
	 */
	EClass getPinchEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.SwipeEvent <em>Swipe Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swipe Event</em>'.
	 * @see IFML.Mobile.SwipeEvent
	 * @generated
	 */
	EClass getSwipeEvent();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.SwipeEvent#getSwipeDirection <em>Swipe Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swipe Direction</em>'.
	 * @see IFML.Mobile.SwipeEvent#getSwipeDirection()
	 * @see #getSwipeEvent()
	 * @generated
	 */
	EAttribute getSwipeEvent_SwipeDirection();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.TapEvent <em>Tap Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Event</em>'.
	 * @see IFML.Mobile.TapEvent
	 * @generated
	 */
	EClass getTapEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see IFML.Mobile.MobileAction
	 * @generated
	 */
	EClass getMobileAction();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.CameraAction <em>Camera Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Action</em>'.
	 * @see IFML.Mobile.CameraAction
	 * @generated
	 */
	EClass getCameraAction();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MicrophoneAction <em>Microphone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone Action</em>'.
	 * @see IFML.Mobile.MicrophoneAction
	 * @generated
	 */
	EClass getMicrophoneAction();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Event</em>'.
	 * @see IFML.Mobile.MobileActionEvent
	 * @generated
	 */
	EClass getMobileActionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.CameraActionEvent <em>Camera Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Action Event</em>'.
	 * @see IFML.Mobile.CameraActionEvent
	 * @generated
	 */
	EClass getCameraActionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MicrophoneActionEvent <em>Microphone Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone Action Event</em>'.
	 * @see IFML.Mobile.MicrophoneActionEvent
	 * @generated
	 */
	EClass getMicrophoneActionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileSystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Event</em>'.
	 * @see IFML.Mobile.MobileSystemEvent
	 * @generated
	 */
	EClass getMobileSystemEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileResourceEvent <em>Resource Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Event</em>'.
	 * @see IFML.Mobile.MobileResourceEvent
	 * @generated
	 */
	EClass getMobileResourceEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.BatteryEvent <em>Battery Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Event</em>'.
	 * @see IFML.Mobile.BatteryEvent
	 * @generated
	 */
	EClass getBatteryEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.ConnectionEvent <em>Connection Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Event</em>'.
	 * @see IFML.Mobile.ConnectionEvent
	 * @generated
	 */
	EClass getConnectionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MemoryEvent <em>Memory Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Event</em>'.
	 * @see IFML.Mobile.MemoryEvent
	 * @generated
	 */
	EClass getMemoryEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileSensorEvent <em>Sensor Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Event</em>'.
	 * @see IFML.Mobile.MobileSensorEvent
	 * @generated
	 */
	EClass getMobileSensorEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.AccelerometerEvent <em>Accelerometer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accelerometer Event</em>'.
	 * @see IFML.Mobile.AccelerometerEvent
	 * @generated
	 */
	EClass getAccelerometerEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.GyroscopeEvent <em>Gyroscope Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gyroscope Event</em>'.
	 * @see IFML.Mobile.GyroscopeEvent
	 * @generated
	 */
	EClass getGyroscopeEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.LocationEvent <em>Location Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Event</em>'.
	 * @see IFML.Mobile.LocationEvent
	 * @generated
	 */
	EClass getLocationEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MagnetometerEvent <em>Magnetometer Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Magnetometer Event</em>'.
	 * @see IFML.Mobile.MagnetometerEvent
	 * @generated
	 */
	EClass getMagnetometerEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MotionEvent <em>Motion Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Event</em>'.
	 * @see IFML.Mobile.MotionEvent
	 * @generated
	 */
	EClass getMotionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.OrientationEvent <em>Orientation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientation Event</em>'.
	 * @see IFML.Mobile.OrientationEvent
	 * @generated
	 */
	EClass getOrientationEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.ProximityEvent <em>Proximity Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proximity Event</em>'.
	 * @see IFML.Mobile.ProximityEvent
	 * @generated
	 */
	EClass getProximityEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.RotateEvent <em>Rotate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Event</em>'.
	 * @see IFML.Mobile.RotateEvent
	 * @generated
	 */
	EClass getRotateEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.ShakeEvent <em>Shake Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shake Event</em>'.
	 * @see IFML.Mobile.ShakeEvent
	 * @generated
	 */
	EClass getShakeEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see IFML.Mobile.MobileDevice
	 * @generated
	 */
	EClass getMobileDevice();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Mobile.MobileDevice#getScreens <em>Screens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Screens</em>'.
	 * @see IFML.Mobile.MobileDevice#getScreens()
	 * @see #getMobileDevice()
	 * @generated
	 */
	EReference getMobileDevice_Screens();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Mobile.MobileDevice#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see IFML.Mobile.MobileDevice#getSensors()
	 * @see #getMobileDevice()
	 * @generated
	 */
	EReference getMobileDevice_Sensors();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileDeviceScreen <em>Device Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Screen</em>'.
	 * @see IFML.Mobile.MobileDeviceScreen
	 * @generated
	 */
	EClass getMobileDeviceScreen();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.MobileDeviceScreen#getHeigt <em>Heigt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigt</em>'.
	 * @see IFML.Mobile.MobileDeviceScreen#getHeigt()
	 * @see #getMobileDeviceScreen()
	 * @generated
	 */
	EAttribute getMobileDeviceScreen_Heigt();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.MobileDeviceScreen#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see IFML.Mobile.MobileDeviceScreen#getWidth()
	 * @see #getMobileDeviceScreen()
	 * @generated
	 */
	EAttribute getMobileDeviceScreen_Width();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.MobileDeviceScreen#getDensity <em>Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Density</em>'.
	 * @see IFML.Mobile.MobileDeviceScreen#getDensity()
	 * @see #getMobileDeviceScreen()
	 * @generated
	 */
	EAttribute getMobileDeviceScreen_Density();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileDeviceSensor <em>Device Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Sensor</em>'.
	 * @see IFML.Mobile.MobileDeviceSensor
	 * @generated
	 */
	EClass getMobileDeviceSensor();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Accelerometer <em>Accelerometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accelerometer</em>'.
	 * @see IFML.Mobile.Accelerometer
	 * @generated
	 */
	EClass getAccelerometer();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.GPS <em>GPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPS</em>'.
	 * @see IFML.Mobile.GPS
	 * @generated
	 */
	EClass getGPS();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.GPS#isIsAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see IFML.Mobile.GPS#isIsAvailable()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_IsAvailable();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.GPS#isIsEnabled <em>Is Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enabled</em>'.
	 * @see IFML.Mobile.GPS#isIsEnabled()
	 * @see #getGPS()
	 * @generated
	 */
	EAttribute getGPS_IsEnabled();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Gyroscope <em>Gyroscope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gyroscope</em>'.
	 * @see IFML.Mobile.Gyroscope
	 * @generated
	 */
	EClass getGyroscope();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Gyroscope#isIsAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see IFML.Mobile.Gyroscope#isIsAvailable()
	 * @see #getGyroscope()
	 * @generated
	 */
	EAttribute getGyroscope_IsAvailable();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Magnetometer <em>Magnetometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Magnetometer</em>'.
	 * @see IFML.Mobile.Magnetometer
	 * @generated
	 */
	EClass getMagnetometer();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Magnetometer#isIsAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see IFML.Mobile.Magnetometer#isIsAvailable()
	 * @see #getMagnetometer()
	 * @generated
	 */
	EAttribute getMagnetometer_IsAvailable();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Microphone <em>Microphone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microphone</em>'.
	 * @see IFML.Mobile.Microphone
	 * @generated
	 */
	EClass getMicrophone();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Microphone#isIsAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see IFML.Mobile.Microphone#isIsAvailable()
	 * @see #getMicrophone()
	 * @generated
	 */
	EAttribute getMicrophone_IsAvailable();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.ProximitySensor <em>Proximity Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proximity Sensor</em>'.
	 * @see IFML.Mobile.ProximitySensor
	 * @generated
	 */
	EClass getProximitySensor();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.ProximitySensor#isIsAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see IFML.Mobile.ProximitySensor#isIsAvailable()
	 * @see #getProximitySensor()
	 * @generated
	 */
	EAttribute getProximitySensor_IsAvailable();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.StillCamera <em>Still Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Still Camera</em>'.
	 * @see IFML.Mobile.StillCamera
	 * @generated
	 */
	EClass getStillCamera();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.StillCamera#isFront <em>Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front</em>'.
	 * @see IFML.Mobile.StillCamera#isFront()
	 * @see #getStillCamera()
	 * @generated
	 */
	EAttribute getStillCamera_Front();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.StillCamera#isRear <em>Rear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rear</em>'.
	 * @see IFML.Mobile.StillCamera#isRear()
	 * @see #getStillCamera()
	 * @generated
	 */
	EAttribute getStillCamera_Rear();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.VideoCamera <em>Video Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Camera</em>'.
	 * @see IFML.Mobile.VideoCamera
	 * @generated
	 */
	EClass getVideoCamera();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.VideoCamera#isRear <em>Rear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rear</em>'.
	 * @see IFML.Mobile.VideoCamera#isRear()
	 * @see #getVideoCamera()
	 * @generated
	 */
	EAttribute getVideoCamera_Rear();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.VideoCamera#isFront <em>Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front</em>'.
	 * @see IFML.Mobile.VideoCamera#isFront()
	 * @see #getVideoCamera()
	 * @generated
	 */
	EAttribute getVideoCamera_Front();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MobileContextVariable <em>Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Variable</em>'.
	 * @see IFML.Mobile.MobileContextVariable
	 * @generated
	 */
	EClass getMobileContextVariable();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Acceleration <em>Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceleration</em>'.
	 * @see IFML.Mobile.Acceleration
	 * @generated
	 */
	EClass getAcceleration();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Acceleration#isIsAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see IFML.Mobile.Acceleration#isIsAvailable()
	 * @see #getAcceleration()
	 * @generated
	 */
	EAttribute getAcceleration_IsAvailable();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.AccelerationX <em>Acceleration X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceleration X</em>'.
	 * @see IFML.Mobile.AccelerationX
	 * @generated
	 */
	EClass getAccelerationX();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.AccelerationX#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.AccelerationX#getValue()
	 * @see #getAccelerationX()
	 * @generated
	 */
	EAttribute getAccelerationX_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.AccelerationY <em>Acceleration Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceleration Y</em>'.
	 * @see IFML.Mobile.AccelerationY
	 * @generated
	 */
	EClass getAccelerationY();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.AccelerationY#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.AccelerationY#getValue()
	 * @see #getAccelerationY()
	 * @generated
	 */
	EAttribute getAccelerationY_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.AccelerationZ <em>Acceleration Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceleration Z</em>'.
	 * @see IFML.Mobile.AccelerationZ
	 * @generated
	 */
	EClass getAccelerationZ();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.AccelerationZ#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.AccelerationZ#getValue()
	 * @see #getAccelerationZ()
	 * @generated
	 */
	EAttribute getAccelerationZ_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see IFML.Mobile.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Altitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Altitude</em>'.
	 * @see IFML.Mobile.Altitude
	 * @generated
	 */
	EClass getAltitude();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Altitude#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Altitude#getValue()
	 * @see #getAltitude()
	 * @generated
	 */
	EAttribute getAltitude_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.HorizontalAccuracy <em>Horizontal Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Accuracy</em>'.
	 * @see IFML.Mobile.HorizontalAccuracy
	 * @generated
	 */
	EClass getHorizontalAccuracy();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.HorizontalAccuracy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.HorizontalAccuracy#getValue()
	 * @see #getHorizontalAccuracy()
	 * @generated
	 */
	EAttribute getHorizontalAccuracy_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Latitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latitude</em>'.
	 * @see IFML.Mobile.Latitude
	 * @generated
	 */
	EClass getLatitude();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Latitude#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Latitude#getValue()
	 * @see #getLatitude()
	 * @generated
	 */
	EAttribute getLatitude_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Longitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Longitude</em>'.
	 * @see IFML.Mobile.Longitude
	 * @generated
	 */
	EClass getLongitude();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Longitude#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Longitude#getValue()
	 * @see #getLongitude()
	 * @generated
	 */
	EAttribute getLongitude_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed</em>'.
	 * @see IFML.Mobile.Speed
	 * @generated
	 */
	EClass getSpeed();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Speed#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Speed#getValue()
	 * @see #getSpeed()
	 * @generated
	 */
	EAttribute getSpeed_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.VerticalAccuracy <em>Vertical Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Accuracy</em>'.
	 * @see IFML.Mobile.VerticalAccuracy
	 * @generated
	 */
	EClass getVerticalAccuracy();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.VerticalAccuracy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.VerticalAccuracy#getValue()
	 * @see #getVerticalAccuracy()
	 * @generated
	 */
	EAttribute getVerticalAccuracy_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Attitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attitude</em>'.
	 * @see IFML.Mobile.Attitude
	 * @generated
	 */
	EClass getAttitude();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Pitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pitch</em>'.
	 * @see IFML.Mobile.Pitch
	 * @generated
	 */
	EClass getPitch();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Pitch#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Pitch#getValue()
	 * @see #getPitch()
	 * @generated
	 */
	EAttribute getPitch_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Roll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roll</em>'.
	 * @see IFML.Mobile.Roll
	 * @generated
	 */
	EClass getRoll();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Roll#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Roll#getValue()
	 * @see #getRoll()
	 * @generated
	 */
	EAttribute getRoll_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Yaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yaw</em>'.
	 * @see IFML.Mobile.Yaw
	 * @generated
	 */
	EClass getYaw();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Yaw#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Yaw#getValue()
	 * @see #getYaw()
	 * @generated
	 */
	EAttribute getYaw_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery</em>'.
	 * @see IFML.Mobile.Battery
	 * @generated
	 */
	EClass getBattery();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.BatteryLevel <em>Battery Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Level</em>'.
	 * @see IFML.Mobile.BatteryLevel
	 * @generated
	 */
	EClass getBatteryLevel();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.BatteryLevel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.BatteryLevel#getValue()
	 * @see #getBatteryLevel()
	 * @generated
	 */
	EAttribute getBatteryLevel_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.BatteryStatus <em>Battery Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery Status</em>'.
	 * @see IFML.Mobile.BatteryStatus
	 * @generated
	 */
	EClass getBatteryStatus();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.BatteryStatus#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.BatteryStatus#getValue()
	 * @see #getBatteryStatus()
	 * @generated
	 */
	EAttribute getBatteryStatus_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see IFML.Mobile.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Network#isIsAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see IFML.Mobile.Network#isIsAvailable()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_IsAvailable();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Bluetooth <em>Bluetooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth</em>'.
	 * @see IFML.Mobile.Bluetooth
	 * @generated
	 */
	EClass getBluetooth();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Bluetooth#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Bluetooth#isValue()
	 * @see #getBluetooth()
	 * @generated
	 */
	EAttribute getBluetooth_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Cellular <em>Cellular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cellular</em>'.
	 * @see IFML.Mobile.Cellular
	 * @generated
	 */
	EClass getCellular();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Cellular#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.Cellular#isValue()
	 * @see #getCellular()
	 * @generated
	 */
	EAttribute getCellular_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.WiFi <em>Wi Fi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wi Fi</em>'.
	 * @see IFML.Mobile.WiFi
	 * @generated
	 */
	EClass getWiFi();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.WiFi#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.WiFi#isValue()
	 * @see #getWiFi()
	 * @generated
	 */
	EAttribute getWiFi_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction</em>'.
	 * @see IFML.Mobile.Direction
	 * @generated
	 */
	EClass getDirection();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MagneticHeadingDirection <em>Magnetic Heading Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Magnetic Heading Direction</em>'.
	 * @see IFML.Mobile.MagneticHeadingDirection
	 * @generated
	 */
	EClass getMagneticHeadingDirection();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.MagneticHeadingDirection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.MagneticHeadingDirection#getValue()
	 * @see #getMagneticHeadingDirection()
	 * @generated
	 */
	EAttribute getMagneticHeadingDirection_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.MagneticHeadingAccuracy <em>Magnetic Heading Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Magnetic Heading Accuracy</em>'.
	 * @see IFML.Mobile.MagneticHeadingAccuracy
	 * @generated
	 */
	EClass getMagneticHeadingAccuracy();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.MagneticHeadingAccuracy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.MagneticHeadingAccuracy#getValue()
	 * @see #getMagneticHeadingAccuracy()
	 * @generated
	 */
	EAttribute getMagneticHeadingAccuracy_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.TrueHeadingDirection <em>True Heading Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Heading Direction</em>'.
	 * @see IFML.Mobile.TrueHeadingDirection
	 * @generated
	 */
	EClass getTrueHeadingDirection();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.TrueHeadingDirection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.TrueHeadingDirection#getValue()
	 * @see #getTrueHeadingDirection()
	 * @generated
	 */
	EAttribute getTrueHeadingDirection_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see IFML.Mobile.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.Rotation#isIsAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see IFML.Mobile.Rotation#isIsAvailable()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_IsAvailable();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.RotationX <em>Rotation X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation X</em>'.
	 * @see IFML.Mobile.RotationX
	 * @generated
	 */
	EClass getRotationX();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.RotationX#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.RotationX#getValue()
	 * @see #getRotationX()
	 * @generated
	 */
	EAttribute getRotationX_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.RotationY <em>Rotation Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Y</em>'.
	 * @see IFML.Mobile.RotationY
	 * @generated
	 */
	EClass getRotationY();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.RotationY#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.RotationY#getValue()
	 * @see #getRotationY()
	 * @generated
	 */
	EAttribute getRotationY_Value();

	/**
	 * Returns the meta object for class '{@link IFML.Mobile.RotationZ <em>Rotation Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Z</em>'.
	 * @see IFML.Mobile.RotationZ
	 * @generated
	 */
	EClass getRotationZ();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Mobile.RotationZ#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see IFML.Mobile.RotationZ#getValue()
	 * @see #getRotationZ()
	 * @generated
	 */
	EAttribute getRotationZ_Value();

	/**
	 * Returns the meta object for enum '{@link IFML.Mobile.SwipeDirection <em>Swipe Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Swipe Direction</em>'.
	 * @see IFML.Mobile.SwipeDirection
	 * @generated
	 */
	EEnum getSwipeDirection();

	/**
	 * Returns the meta object for enum '{@link IFML.Mobile.BatteryStatusDescription <em>Battery Status Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Battery Status Description</em>'.
	 * @see IFML.Mobile.BatteryStatusDescription
	 * @generated
	 */
	EEnum getBatteryStatusDescription();

	/**
	 * Returns the meta object for enum '{@link IFML.Mobile.OrientationDescription <em>Orientation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation Description</em>'.
	 * @see IFML.Mobile.OrientationDescription
	 * @generated
	 */
	EEnum getOrientationDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MobileFactory getMobileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileViewContainerImpl <em>View Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileViewContainerImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileViewContainer()
		 * @generated
		 */
		EClass MOBILE_VIEW_CONTAINER = eINSTANCE.getMobileViewContainer();

		/**
		 * The meta object literal for the '<em><b>Is Mobile System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_VIEW_CONTAINER__IS_MOBILE_SYSTEM = eINSTANCE.getMobileViewContainer_IsMobileSystem();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.ScreenImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '<em><b>Is Modal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__IS_MODAL = eINSTANCE.getScreen_IsModal();

		/**
		 * The meta object literal for the '<em><b>Has Nav Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__HAS_NAV_BAR = eINSTANCE.getScreen_HasNavBar();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileViewComponentImpl <em>View Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileViewComponentImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileViewComponent()
		 * @generated
		 */
		EClass MOBILE_VIEW_COMPONENT = eINSTANCE.getMobileViewComponent();

		/**
		 * The meta object literal for the '<em><b>Is Mobile System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_VIEW_COMPONENT__IS_MOBILE_SYSTEM = eINSTANCE.getMobileViewComponent_IsMobileSystem();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileMessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileMessageImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileMessage()
		 * @generated
		 */
		EClass MOBILE_MESSAGE = eINSTANCE.getMobileMessage();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.SearchViewImpl <em>Search View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.SearchViewImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getSearchView()
		 * @generated
		 */
		EClass SEARCH_VIEW = eINSTANCE.getSearchView();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileViewElementEventImpl <em>View Element Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileViewElementEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileViewElementEvent()
		 * @generated
		 */
		EClass MOBILE_VIEW_ELEMENT_EVENT = eINSTANCE.getMobileViewElementEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.TouchEventImpl <em>Touch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.TouchEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getTouchEvent()
		 * @generated
		 */
		EClass TOUCH_EVENT = eINSTANCE.getTouchEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.LongPressEventImpl <em>Long Press Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.LongPressEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getLongPressEvent()
		 * @generated
		 */
		EClass LONG_PRESS_EVENT = eINSTANCE.getLongPressEvent();

		/**
		 * The meta object literal for the '<em><b>Press Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_PRESS_EVENT__PRESS_DURATION = eINSTANCE.getLongPressEvent_PressDuration();

		/**
		 * The meta object literal for the '<em><b>Fingers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_PRESS_EVENT__FINGERS_COUNT = eINSTANCE.getLongPressEvent_FingersCount();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.PanEventImpl <em>Pan Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.PanEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getPanEvent()
		 * @generated
		 */
		EClass PAN_EVENT = eINSTANCE.getPanEvent();

		/**
		 * The meta object literal for the '<em><b>Fingers Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAN_EVENT__FINGERS_COUNT = eINSTANCE.getPanEvent_FingersCount();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.PinchEventImpl <em>Pinch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.PinchEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getPinchEvent()
		 * @generated
		 */
		EClass PINCH_EVENT = eINSTANCE.getPinchEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.SwipeEventImpl <em>Swipe Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.SwipeEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getSwipeEvent()
		 * @generated
		 */
		EClass SWIPE_EVENT = eINSTANCE.getSwipeEvent();

		/**
		 * The meta object literal for the '<em><b>Swipe Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIPE_EVENT__SWIPE_DIRECTION = eINSTANCE.getSwipeEvent_SwipeDirection();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.TapEventImpl <em>Tap Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.TapEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getTapEvent()
		 * @generated
		 */
		EClass TAP_EVENT = eINSTANCE.getTapEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileActionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileAction()
		 * @generated
		 */
		EClass MOBILE_ACTION = eINSTANCE.getMobileAction();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.CameraActionImpl <em>Camera Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.CameraActionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getCameraAction()
		 * @generated
		 */
		EClass CAMERA_ACTION = eINSTANCE.getCameraAction();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MicrophoneActionImpl <em>Microphone Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MicrophoneActionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophoneAction()
		 * @generated
		 */
		EClass MICROPHONE_ACTION = eINSTANCE.getMicrophoneAction();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileActionEventImpl <em>Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileActionEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileActionEvent()
		 * @generated
		 */
		EClass MOBILE_ACTION_EVENT = eINSTANCE.getMobileActionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.CameraActionEventImpl <em>Camera Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.CameraActionEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getCameraActionEvent()
		 * @generated
		 */
		EClass CAMERA_ACTION_EVENT = eINSTANCE.getCameraActionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MicrophoneActionEventImpl <em>Microphone Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MicrophoneActionEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophoneActionEvent()
		 * @generated
		 */
		EClass MICROPHONE_ACTION_EVENT = eINSTANCE.getMicrophoneActionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileSystemEventImpl <em>System Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileSystemEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileSystemEvent()
		 * @generated
		 */
		EClass MOBILE_SYSTEM_EVENT = eINSTANCE.getMobileSystemEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileResourceEventImpl <em>Resource Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileResourceEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileResourceEvent()
		 * @generated
		 */
		EClass MOBILE_RESOURCE_EVENT = eINSTANCE.getMobileResourceEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.BatteryEventImpl <em>Battery Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.BatteryEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryEvent()
		 * @generated
		 */
		EClass BATTERY_EVENT = eINSTANCE.getBatteryEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.ConnectionEventImpl <em>Connection Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.ConnectionEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getConnectionEvent()
		 * @generated
		 */
		EClass CONNECTION_EVENT = eINSTANCE.getConnectionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MemoryEventImpl <em>Memory Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MemoryEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMemoryEvent()
		 * @generated
		 */
		EClass MEMORY_EVENT = eINSTANCE.getMemoryEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileSensorEventImpl <em>Sensor Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileSensorEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileSensorEvent()
		 * @generated
		 */
		EClass MOBILE_SENSOR_EVENT = eINSTANCE.getMobileSensorEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.AccelerometerEventImpl <em>Accelerometer Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.AccelerometerEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerometerEvent()
		 * @generated
		 */
		EClass ACCELEROMETER_EVENT = eINSTANCE.getAccelerometerEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.GyroscopeEventImpl <em>Gyroscope Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.GyroscopeEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getGyroscopeEvent()
		 * @generated
		 */
		EClass GYROSCOPE_EVENT = eINSTANCE.getGyroscopeEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.LocationEventImpl <em>Location Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.LocationEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getLocationEvent()
		 * @generated
		 */
		EClass LOCATION_EVENT = eINSTANCE.getLocationEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MagnetometerEventImpl <em>Magnetometer Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MagnetometerEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMagnetometerEvent()
		 * @generated
		 */
		EClass MAGNETOMETER_EVENT = eINSTANCE.getMagnetometerEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MotionEventImpl <em>Motion Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MotionEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMotionEvent()
		 * @generated
		 */
		EClass MOTION_EVENT = eINSTANCE.getMotionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.OrientationEventImpl <em>Orientation Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.OrientationEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getOrientationEvent()
		 * @generated
		 */
		EClass ORIENTATION_EVENT = eINSTANCE.getOrientationEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.ProximityEventImpl <em>Proximity Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.ProximityEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getProximityEvent()
		 * @generated
		 */
		EClass PROXIMITY_EVENT = eINSTANCE.getProximityEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.RotateEventImpl <em>Rotate Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.RotateEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getRotateEvent()
		 * @generated
		 */
		EClass ROTATE_EVENT = eINSTANCE.getRotateEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.ShakeEventImpl <em>Shake Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.ShakeEventImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getShakeEvent()
		 * @generated
		 */
		EClass SHAKE_EVENT = eINSTANCE.getShakeEvent();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileDeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileDeviceImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileDevice()
		 * @generated
		 */
		EClass MOBILE_DEVICE = eINSTANCE.getMobileDevice();

		/**
		 * The meta object literal for the '<em><b>Screens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILE_DEVICE__SCREENS = eINSTANCE.getMobileDevice_Screens();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILE_DEVICE__SENSORS = eINSTANCE.getMobileDevice_Sensors();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileDeviceScreenImpl <em>Device Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileDeviceScreenImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileDeviceScreen()
		 * @generated
		 */
		EClass MOBILE_DEVICE_SCREEN = eINSTANCE.getMobileDeviceScreen();

		/**
		 * The meta object literal for the '<em><b>Heigt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_DEVICE_SCREEN__HEIGT = eINSTANCE.getMobileDeviceScreen_Heigt();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_DEVICE_SCREEN__WIDTH = eINSTANCE.getMobileDeviceScreen_Width();

		/**
		 * The meta object literal for the '<em><b>Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_DEVICE_SCREEN__DENSITY = eINSTANCE.getMobileDeviceScreen_Density();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileDeviceSensorImpl <em>Device Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileDeviceSensorImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileDeviceSensor()
		 * @generated
		 */
		EClass MOBILE_DEVICE_SENSOR = eINSTANCE.getMobileDeviceSensor();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.AccelerometerImpl <em>Accelerometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.AccelerometerImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerometer()
		 * @generated
		 */
		EClass ACCELEROMETER = eINSTANCE.getAccelerometer();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.GPSImpl <em>GPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.GPSImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getGPS()
		 * @generated
		 */
		EClass GPS = eINSTANCE.getGPS();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__IS_AVAILABLE = eINSTANCE.getGPS_IsAvailable();

		/**
		 * The meta object literal for the '<em><b>Is Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__IS_ENABLED = eINSTANCE.getGPS_IsEnabled();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.GyroscopeImpl <em>Gyroscope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.GyroscopeImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getGyroscope()
		 * @generated
		 */
		EClass GYROSCOPE = eINSTANCE.getGyroscope();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GYROSCOPE__IS_AVAILABLE = eINSTANCE.getGyroscope_IsAvailable();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MagnetometerImpl <em>Magnetometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MagnetometerImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMagnetometer()
		 * @generated
		 */
		EClass MAGNETOMETER = eINSTANCE.getMagnetometer();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGNETOMETER__IS_AVAILABLE = eINSTANCE.getMagnetometer_IsAvailable();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MicrophoneImpl <em>Microphone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MicrophoneImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMicrophone()
		 * @generated
		 */
		EClass MICROPHONE = eINSTANCE.getMicrophone();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROPHONE__IS_AVAILABLE = eINSTANCE.getMicrophone_IsAvailable();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.ProximitySensorImpl <em>Proximity Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.ProximitySensorImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getProximitySensor()
		 * @generated
		 */
		EClass PROXIMITY_SENSOR = eINSTANCE.getProximitySensor();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXIMITY_SENSOR__IS_AVAILABLE = eINSTANCE.getProximitySensor_IsAvailable();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.StillCameraImpl <em>Still Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.StillCameraImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getStillCamera()
		 * @generated
		 */
		EClass STILL_CAMERA = eINSTANCE.getStillCamera();

		/**
		 * The meta object literal for the '<em><b>Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STILL_CAMERA__FRONT = eINSTANCE.getStillCamera_Front();

		/**
		 * The meta object literal for the '<em><b>Rear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STILL_CAMERA__REAR = eINSTANCE.getStillCamera_Rear();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.VideoCameraImpl <em>Video Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.VideoCameraImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getVideoCamera()
		 * @generated
		 */
		EClass VIDEO_CAMERA = eINSTANCE.getVideoCamera();

		/**
		 * The meta object literal for the '<em><b>Rear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_CAMERA__REAR = eINSTANCE.getVideoCamera_Rear();

		/**
		 * The meta object literal for the '<em><b>Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_CAMERA__FRONT = eINSTANCE.getVideoCamera_Front();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MobileContextVariableImpl <em>Context Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MobileContextVariableImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMobileContextVariable()
		 * @generated
		 */
		EClass MOBILE_CONTEXT_VARIABLE = eINSTANCE.getMobileContextVariable();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.AccelerationImpl <em>Acceleration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.AccelerationImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getAcceleration()
		 * @generated
		 */
		EClass ACCELERATION = eINSTANCE.getAcceleration();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCELERATION__IS_AVAILABLE = eINSTANCE.getAcceleration_IsAvailable();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.AccelerationXImpl <em>Acceleration X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.AccelerationXImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerationX()
		 * @generated
		 */
		EClass ACCELERATION_X = eINSTANCE.getAccelerationX();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCELERATION_X__VALUE = eINSTANCE.getAccelerationX_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.AccelerationYImpl <em>Acceleration Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.AccelerationYImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerationY()
		 * @generated
		 */
		EClass ACCELERATION_Y = eINSTANCE.getAccelerationY();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCELERATION_Y__VALUE = eINSTANCE.getAccelerationY_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.AccelerationZImpl <em>Acceleration Z</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.AccelerationZImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getAccelerationZ()
		 * @generated
		 */
		EClass ACCELERATION_Z = eINSTANCE.getAccelerationZ();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCELERATION_Z__VALUE = eINSTANCE.getAccelerationZ_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.LocationImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.AltitudeImpl <em>Altitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.AltitudeImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getAltitude()
		 * @generated
		 */
		EClass ALTITUDE = eINSTANCE.getAltitude();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTITUDE__VALUE = eINSTANCE.getAltitude_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.HorizontalAccuracyImpl <em>Horizontal Accuracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.HorizontalAccuracyImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getHorizontalAccuracy()
		 * @generated
		 */
		EClass HORIZONTAL_ACCURACY = eINSTANCE.getHorizontalAccuracy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_ACCURACY__VALUE = eINSTANCE.getHorizontalAccuracy_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.LatitudeImpl <em>Latitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.LatitudeImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getLatitude()
		 * @generated
		 */
		EClass LATITUDE = eINSTANCE.getLatitude();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATITUDE__VALUE = eINSTANCE.getLatitude_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.LongitudeImpl <em>Longitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.LongitudeImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getLongitude()
		 * @generated
		 */
		EClass LONGITUDE = eINSTANCE.getLongitude();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONGITUDE__VALUE = eINSTANCE.getLongitude_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.SpeedImpl <em>Speed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.SpeedImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getSpeed()
		 * @generated
		 */
		EClass SPEED = eINSTANCE.getSpeed();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED__VALUE = eINSTANCE.getSpeed_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.VerticalAccuracyImpl <em>Vertical Accuracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.VerticalAccuracyImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getVerticalAccuracy()
		 * @generated
		 */
		EClass VERTICAL_ACCURACY = eINSTANCE.getVerticalAccuracy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_ACCURACY__VALUE = eINSTANCE.getVerticalAccuracy_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.AttitudeImpl <em>Attitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.AttitudeImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getAttitude()
		 * @generated
		 */
		EClass ATTITUDE = eINSTANCE.getAttitude();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.PitchImpl <em>Pitch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.PitchImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getPitch()
		 * @generated
		 */
		EClass PITCH = eINSTANCE.getPitch();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PITCH__VALUE = eINSTANCE.getPitch_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.RollImpl <em>Roll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.RollImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getRoll()
		 * @generated
		 */
		EClass ROLL = eINSTANCE.getRoll();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLL__VALUE = eINSTANCE.getRoll_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.YawImpl <em>Yaw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.YawImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getYaw()
		 * @generated
		 */
		EClass YAW = eINSTANCE.getYaw();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAW__VALUE = eINSTANCE.getYaw_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.BatteryImpl <em>Battery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.BatteryImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getBattery()
		 * @generated
		 */
		EClass BATTERY = eINSTANCE.getBattery();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.BatteryLevelImpl <em>Battery Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.BatteryLevelImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryLevel()
		 * @generated
		 */
		EClass BATTERY_LEVEL = eINSTANCE.getBatteryLevel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_LEVEL__VALUE = eINSTANCE.getBatteryLevel_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.BatteryStatusImpl <em>Battery Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.BatteryStatusImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryStatus()
		 * @generated
		 */
		EClass BATTERY_STATUS = eINSTANCE.getBatteryStatus();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_STATUS__VALUE = eINSTANCE.getBatteryStatus_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.NetworkImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IS_AVAILABLE = eINSTANCE.getNetwork_IsAvailable();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.BluetoothImpl <em>Bluetooth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.BluetoothImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getBluetooth()
		 * @generated
		 */
		EClass BLUETOOTH = eINSTANCE.getBluetooth();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH__VALUE = eINSTANCE.getBluetooth_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.CellularImpl <em>Cellular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.CellularImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getCellular()
		 * @generated
		 */
		EClass CELLULAR = eINSTANCE.getCellular();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELLULAR__VALUE = eINSTANCE.getCellular_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.WiFiImpl <em>Wi Fi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.WiFiImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getWiFi()
		 * @generated
		 */
		EClass WI_FI = eINSTANCE.getWiFi();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WI_FI__VALUE = eINSTANCE.getWiFi_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.DirectionImpl <em>Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.DirectionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getDirection()
		 * @generated
		 */
		EClass DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MagneticHeadingDirectionImpl <em>Magnetic Heading Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MagneticHeadingDirectionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMagneticHeadingDirection()
		 * @generated
		 */
		EClass MAGNETIC_HEADING_DIRECTION = eINSTANCE.getMagneticHeadingDirection();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGNETIC_HEADING_DIRECTION__VALUE = eINSTANCE.getMagneticHeadingDirection_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.MagneticHeadingAccuracyImpl <em>Magnetic Heading Accuracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.MagneticHeadingAccuracyImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getMagneticHeadingAccuracy()
		 * @generated
		 */
		EClass MAGNETIC_HEADING_ACCURACY = eINSTANCE.getMagneticHeadingAccuracy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAGNETIC_HEADING_ACCURACY__VALUE = eINSTANCE.getMagneticHeadingAccuracy_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.TrueHeadingDirectionImpl <em>True Heading Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.TrueHeadingDirectionImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getTrueHeadingDirection()
		 * @generated
		 */
		EClass TRUE_HEADING_DIRECTION = eINSTANCE.getTrueHeadingDirection();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUE_HEADING_DIRECTION__VALUE = eINSTANCE.getTrueHeadingDirection_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.RotationImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__IS_AVAILABLE = eINSTANCE.getRotation_IsAvailable();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.RotationXImpl <em>Rotation X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.RotationXImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getRotationX()
		 * @generated
		 */
		EClass ROTATION_X = eINSTANCE.getRotationX();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION_X__VALUE = eINSTANCE.getRotationX_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.RotationYImpl <em>Rotation Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.RotationYImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getRotationY()
		 * @generated
		 */
		EClass ROTATION_Y = eINSTANCE.getRotationY();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION_Y__VALUE = eINSTANCE.getRotationY_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.impl.RotationZImpl <em>Rotation Z</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.impl.RotationZImpl
		 * @see IFML.Mobile.impl.MobilePackageImpl#getRotationZ()
		 * @generated
		 */
		EClass ROTATION_Z = eINSTANCE.getRotationZ();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION_Z__VALUE = eINSTANCE.getRotationZ_Value();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.SwipeDirection <em>Swipe Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.SwipeDirection
		 * @see IFML.Mobile.impl.MobilePackageImpl#getSwipeDirection()
		 * @generated
		 */
		EEnum SWIPE_DIRECTION = eINSTANCE.getSwipeDirection();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.BatteryStatusDescription <em>Battery Status Description</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.BatteryStatusDescription
		 * @see IFML.Mobile.impl.MobilePackageImpl#getBatteryStatusDescription()
		 * @generated
		 */
		EEnum BATTERY_STATUS_DESCRIPTION = eINSTANCE.getBatteryStatusDescription();

		/**
		 * The meta object literal for the '{@link IFML.Mobile.OrientationDescription <em>Orientation Description</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Mobile.OrientationDescription
		 * @see IFML.Mobile.impl.MobilePackageImpl#getOrientationDescription()
		 * @generated
		 */
		EEnum ORIENTATION_DESCRIPTION = eINSTANCE.getOrientationDescription();

	}

} //MobilePackage
