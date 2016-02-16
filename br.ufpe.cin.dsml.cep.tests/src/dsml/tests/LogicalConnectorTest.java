/**
 */
package dsml.tests;

import dsml.DsmlFactory;
import dsml.LogicalConnector;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logical Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalConnectorTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogicalConnectorTest.class);
	}

	/**
	 * Constructs a new Logical Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Logical Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LogicalConnector getFixture() {
		return (LogicalConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DsmlFactory.eINSTANCE.createLogicalConnector());
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

} //LogicalConnectorTest
