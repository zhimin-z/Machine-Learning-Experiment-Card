/**
 */
package mlam.tests;

import junit.textui.TestRunner;

import mlam.Log;
import mlam.MlamFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogTest extends DocumentationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogTest.class);
	}

	/**
	 * Constructs a new Log test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Log test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Log getFixture() {
		return (Log)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MlamFactory.eINSTANCE.createLog());
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

} //LogTest
