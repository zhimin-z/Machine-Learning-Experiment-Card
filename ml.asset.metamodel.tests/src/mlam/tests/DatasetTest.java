/**
 */
package mlam.tests;

import junit.textui.TestRunner;

import mlam.Dataset;
import mlam.MlamFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasetTest extends DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatasetTest.class);
	}

	/**
	 * Constructs a new Dataset test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dataset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Dataset getFixture() {
		return (Dataset)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MlamFactory.eINSTANCE.createDataset());
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

} //DatasetTest
