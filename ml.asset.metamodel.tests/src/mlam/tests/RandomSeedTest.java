/**
 */
package mlam.tests;

import junit.textui.TestRunner;

import mlam.MlamFactory;
import mlam.RandomSeed;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Random Seed</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RandomSeedTest extends DataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RandomSeedTest.class);
	}

	/**
	 * Constructs a new Random Seed test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomSeedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Random Seed test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RandomSeed getFixture() {
		return (RandomSeed)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MlamFactory.eINSTANCE.createRandomSeed());
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

} //RandomSeedTest
