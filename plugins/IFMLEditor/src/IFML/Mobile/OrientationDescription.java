/**
 */
package IFML.Mobile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Orientation Description</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see IFML.Mobile.MobilePackage#getOrientationDescription()
 * @model
 * @generated
 */
public enum OrientationDescription implements Enumerator {
	/**
	 * The '<em><b>Unkown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKOWN(0, "unkown", "unkown"),

	/**
	 * The '<em><b>Portrait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTRAIT_VALUE
	 * @generated
	 * @ordered
	 */
	PORTRAIT(0, "portrait", "portrait"),

	/**
	 * The '<em><b>Landscape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	LANDSCAPE(0, "landscape", "landscape"),

	/**
	 * The '<em><b>Portrait Upside Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTRAIT_UPSIDE_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	PORTRAIT_UPSIDE_DOWN(0, "portraitUpsideDown", "portraitUpsideDown"),

	/**
	 * The '<em><b>Landscape Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LANDSCAPE_RIGHT(0, "landscapeRight", "landscapeRight"),

	/**
	 * The '<em><b>Landscape Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LANDSCAPE_LEFT(0, "landscapeLeft", "landscapeLeft"),

	/**
	 * The '<em><b>Face Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACE_UP_VALUE
	 * @generated
	 * @ordered
	 */
	FACE_UP(0, "faceUp", "faceUp"),

	/**
	 * The '<em><b>Face Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACE_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	FACE_DOWN(0, "faceDown", "faceDown");

	/**
	 * The '<em><b>Unkown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unkown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKOWN
	 * @model name="unkown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKOWN_VALUE = 0;

	/**
	 * The '<em><b>Portrait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Portrait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTRAIT
	 * @model name="portrait"
	 * @generated
	 * @ordered
	 */
	public static final int PORTRAIT_VALUE = 0;

	/**
	 * The '<em><b>Landscape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Landscape</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE
	 * @model name="landscape"
	 * @generated
	 * @ordered
	 */
	public static final int LANDSCAPE_VALUE = 0;

	/**
	 * The '<em><b>Portrait Upside Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Portrait Upside Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTRAIT_UPSIDE_DOWN
	 * @model name="portraitUpsideDown"
	 * @generated
	 * @ordered
	 */
	public static final int PORTRAIT_UPSIDE_DOWN_VALUE = 0;

	/**
	 * The '<em><b>Landscape Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Landscape Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE_RIGHT
	 * @model name="landscapeRight"
	 * @generated
	 * @ordered
	 */
	public static final int LANDSCAPE_RIGHT_VALUE = 0;

	/**
	 * The '<em><b>Landscape Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Landscape Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE_LEFT
	 * @model name="landscapeLeft"
	 * @generated
	 * @ordered
	 */
	public static final int LANDSCAPE_LEFT_VALUE = 0;

	/**
	 * The '<em><b>Face Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Face Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACE_UP
	 * @model name="faceUp"
	 * @generated
	 * @ordered
	 */
	public static final int FACE_UP_VALUE = 0;

	/**
	 * The '<em><b>Face Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Face Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACE_DOWN
	 * @model name="faceDown"
	 * @generated
	 * @ordered
	 */
	public static final int FACE_DOWN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Orientation Description</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrientationDescription[] VALUES_ARRAY =
		new OrientationDescription[] {
			UNKOWN,
			PORTRAIT,
			LANDSCAPE,
			PORTRAIT_UPSIDE_DOWN,
			LANDSCAPE_RIGHT,
			LANDSCAPE_LEFT,
			FACE_UP,
			FACE_DOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Orientation Description</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrientationDescription> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Orientation Description</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrientationDescription get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrientationDescription result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orientation Description</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrientationDescription getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrientationDescription result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orientation Description</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrientationDescription get(int value) {
		switch (value) {
			case UNKOWN_VALUE: return UNKOWN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OrientationDescription(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OrientationDescription
