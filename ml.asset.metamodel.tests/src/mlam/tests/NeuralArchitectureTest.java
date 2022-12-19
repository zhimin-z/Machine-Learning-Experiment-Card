/**
 */
package mlam.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mlam.MlamFactory;
import mlam.NeuralArchitecture;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neural Architecture</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeuralArchitectureTest extends TestCase {

	/**
	 * The fixture for this Neural Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeuralArchitecture fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeuralArchitectureTest.class);
	}

	/**
	 * Constructs a new Neural Architecture test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeuralArchitectureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Neural Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NeuralArchitecture fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Neural Architecture test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeuralArchitecture getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MlamFactory.eINSTANCE.createNeuralArchitecture());
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

} //NeuralArchitectureTest
