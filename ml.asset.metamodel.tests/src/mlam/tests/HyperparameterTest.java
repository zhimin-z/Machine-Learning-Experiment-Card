/**
 */
package mlam.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mlam.Hyperparameter;
import mlam.MlamFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hyperparameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HyperparameterTest extends TestCase {

	/**
	 * The fixture for this Hyperparameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hyperparameter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HyperparameterTest.class);
	}

	/**
	 * Constructs a new Hyperparameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperparameterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hyperparameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Hyperparameter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hyperparameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hyperparameter getFixture() {
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
		setFixture(MlamFactory.eINSTANCE.createHyperparameter());
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

} //HyperparameterTest
