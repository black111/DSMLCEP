/**
 */
package dsml.tests;

import dsml.DsmlFactory;
import dsml.TargetGroupby;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Groupby</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetGroupbyTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetGroupbyTest.class);
	}

	/**
	 * Constructs a new Target Groupby test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetGroupbyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Target Groupby test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TargetGroupby getFixture() {
		return (TargetGroupby)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DsmlFactory.eINSTANCE.createTargetGroupby());
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

} //TargetGroupbyTest
