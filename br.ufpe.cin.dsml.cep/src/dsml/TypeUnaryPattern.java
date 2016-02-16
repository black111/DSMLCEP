/**
 */
package dsml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Unary Pattern</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsml.DsmlPackage#getTypeUnaryPattern()
 * @model
 * @generated
 */
public enum TypeUnaryPattern implements Enumerator {
	/**
	 * The '<em><b>EVERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERY_VALUE
	 * @generated
	 * @ordered
	 */
	EVERY(0, "EVERY", "EVERY"),

	/**
	 * The '<em><b>EVERY DISTINCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERY_DISTINCT_VALUE
	 * @generated
	 * @ordered
	 */
	EVERY_DISTINCT(1, "EVERY_DISTINCT", "EVERY_DISTINCT");

	/**
	 * The '<em><b>EVERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVERY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVERY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVERY_VALUE = 0;

	/**
	 * The '<em><b>EVERY DISTINCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVERY DISTINCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVERY_DISTINCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVERY_DISTINCT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type Unary Pattern</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeUnaryPattern[] VALUES_ARRAY =
		new TypeUnaryPattern[] {
			EVERY,
			EVERY_DISTINCT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Unary Pattern</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeUnaryPattern> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Unary Pattern</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeUnaryPattern get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeUnaryPattern result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Unary Pattern</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeUnaryPattern getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeUnaryPattern result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Unary Pattern</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeUnaryPattern get(int value) {
		switch (value) {
			case EVERY_VALUE: return EVERY;
			case EVERY_DISTINCT_VALUE: return EVERY_DISTINCT;
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
	private TypeUnaryPattern(int value, String name, String literal) {
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
	
} //TypeUnaryPattern