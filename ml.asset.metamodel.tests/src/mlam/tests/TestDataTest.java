/**
 */
package mlam.tests;

import junit.textui.TestRunner;

import mlam.MlamFactory;
import mlam.TestData;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestDataTest extends DatasetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestDataTest.class);
	}

	/**
	 * Constructs a new Test Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TestData getFixture() {
		return (TestData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MlamFactory.eINSTANCE.createTestData());
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

} //TestDataTest
