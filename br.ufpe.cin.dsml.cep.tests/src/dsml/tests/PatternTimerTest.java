/**
 */
package dsml.tests;

import dsml.DsmlFactory;
import dsml.PatternTimer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pattern Timer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternTimerTest extends PatternTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PatternTimerTest.class);
	}

	/**
	 * Constructs a new Pattern Timer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternTimerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pattern Timer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PatternTimer getFixture() {
		return (PatternTimer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DsmlFactory.eINSTANCE.createPatternTimer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PatternTimerTest
