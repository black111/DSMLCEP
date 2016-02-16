/**
 */
package dsml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Window</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsml.DsmlPackage#getTypeWindow()
 * @model
 * @generated
 */
public enum TypeWindow implements Enumerator {
	/**
	 * The '<em><b>LENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH(0, "LENGTH", "LENGTH"),

	/**
	 * The '<em><b>LENGTH BATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_BATCH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH_BATCH(1, "LENGTH_BATCH", "LENGTH_BATCH"),

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(2, "TIME", "TIME"),

	/**
	 * The '<em><b>EXT TIMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXT_TIMED_VALUE
	 * @generated
	 * @ordered
	 */
	EXT_TIMED(3, "EXT_TIMED", "EXT_TIMED"),

	/**
	 * The '<em><b>TIME BATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_BATCH_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_BATCH(4, "TIME_BATCH", "TIME_BATCH"),

	/**
	 * The '<em><b>EXT TIMED BATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXT_TIMED_BATCH_VALUE
	 * @generated
	 * @ordered
	 */
	EXT_TIMED_BATCH(5, "EXT_TIMED_BATCH", "EXT_TIMED_BATCH"),

	/**
	 * The '<em><b>TIME LENGTH BATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LENGTH_BATCH_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_LENGTH_BATCH(6, "TIME_LENGTH_BATCH", "TIME_LENGTH_BATCH"),

	/**
	 * The '<em><b>TIME SEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SEC_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_SEC(7, "TIME_SEC", "TIME_SEC"),

	/**
	 * The '<em><b>TIME ACCUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_ACCUM_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_ACCUM(8, "TIME_ACCUM", "TIME_ACCUM"),

	/**
	 * The '<em><b>KEEPALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEPALL_VALUE
	 * @generated
	 * @ordered
	 */
	KEEPALL(9, "KEEPALL", "KEEPALL"),

	/**
	 * The '<em><b>FIRSTLENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRSTLENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	FIRSTLENGTH(10, "FIRSTLENGTH", "FIRSTLENGTH"),

	/**
	 * The '<em><b>FIRSTTIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRSTTIME_VALUE
	 * @generated
	 * @ordered
	 */
	FIRSTTIME(11, "FIRSTTIME", "FIRSTTIME"),

	/**
	 * The '<em><b>EXPR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPR_VALUE
	 * @generated
	 * @ordered
	 */
	EXPR(12, "EXPR", "EXPR"),

	/**
	 * The '<em><b>EXPR BATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPR_BATCH_VALUE
	 * @generated
	 * @ordered
	 */
	EXPR_BATCH(13, "EXPR_BATCH", "EXPR_BATCH");

	/**
	 * The '<em><b>LENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LENGTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_VALUE = 0;

	/**
	 * The '<em><b>LENGTH BATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LENGTH BATCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENGTH_BATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_BATCH_VALUE = 1;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 2;

	/**
	 * The '<em><b>EXT TIMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXT TIMED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXT_TIMED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXT_TIMED_VALUE = 3;

	/**
	 * The '<em><b>TIME BATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME BATCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_BATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_BATCH_VALUE = 4;

	/**
	 * The '<em><b>EXT TIMED BATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXT TIMED BATCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXT_TIMED_BATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXT_TIMED_BATCH_VALUE = 5;

	/**
	 * The '<em><b>TIME LENGTH BATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME LENGTH BATCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_LENGTH_BATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_LENGTH_BATCH_VALUE = 6;

	/**
	 * The '<em><b>TIME SEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME SEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_SEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SEC_VALUE = 7;

	/**
	 * The '<em><b>TIME ACCUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME ACCUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_ACCUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_ACCUM_VALUE = 8;

	/**
	 * The '<em><b>KEEPALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEEPALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEEPALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEEPALL_VALUE = 9;

	/**
	 * The '<em><b>FIRSTLENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRSTLENGTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRSTLENGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRSTLENGTH_VALUE = 10;

	/**
	 * The '<em><b>FIRSTTIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRSTTIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRSTTIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRSTTIME_VALUE = 11;

	/**
	 * The '<em><b>EXPR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPR_VALUE = 12;

	/**
	 * The '<em><b>EXPR BATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPR BATCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPR_BATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPR_BATCH_VALUE = 13;

	/**
	 * An array of all the '<em><b>Type Window</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeWindow[] VALUES_ARRAY =
		new TypeWindow[] {
			LENGTH,
			LENGTH_BATCH,
			TIME,
			EXT_TIMED,
			TIME_BATCH,
			EXT_TIMED_BATCH,
			TIME_LENGTH_BATCH,
			TIME_SEC,
			TIME_ACCUM,
			KEEPALL,
			FIRSTLENGTH,
			FIRSTTIME,
			EXPR,
			EXPR_BATCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Window</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeWindow> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Window</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeWindow get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeWindow result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Window</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeWindow getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeWindow result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Window</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeWindow get(int value) {
		switch (value) {
			case LENGTH_VALUE: return LENGTH;
			case LENGTH_BATCH_VALUE: return LENGTH_BATCH;
			case TIME_VALUE: return TIME;
			case EXT_TIMED_VALUE: return EXT_TIMED;
			case TIME_BATCH_VALUE: return TIME_BATCH;
			case EXT_TIMED_BATCH_VALUE: return EXT_TIMED_BATCH;
			case TIME_LENGTH_BATCH_VALUE: return TIME_LENGTH_BATCH;
			case TIME_SEC_VALUE: return TIME_SEC;
			case TIME_ACCUM_VALUE: return TIME_ACCUM;
			case KEEPALL_VALUE: return KEEPALL;
			case FIRSTLENGTH_VALUE: return FIRSTLENGTH;
			case FIRSTTIME_VALUE: return FIRSTTIME;
			case EXPR_VALUE: return EXPR;
			case EXPR_BATCH_VALUE: return EXPR_BATCH;
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
	private TypeWindow(int value, String name, String literal) {
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
	
} //TypeWindow
