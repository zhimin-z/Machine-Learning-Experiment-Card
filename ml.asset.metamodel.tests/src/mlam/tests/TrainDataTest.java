/**
 */
package mlam.tests;

import junit.textui.TestRunner;

import mlam.MlamFactory;
import mlam.TrainData;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Train Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrainDataTest extends DatasetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrainDataTest.class);
	}

	/**
	 * Constructs a new Train Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Train Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TrainData getFixture() {
		return (TrainData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MlamFactory.eINSTANCE.createTrainData());
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

} //TrainDataTest
