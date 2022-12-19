/**
 */
package mlam.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mlam.Experiment;
import mlam.MlamFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentTest extends TestCase {

	/**
	 * The fixture for this Experiment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Experiment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExperimentTest.class);
	}

	/**
	 * Constructs a new Experiment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Experiment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Experiment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Experiment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Experiment getFixture() {
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
		setFixture(MlamFactory.eINSTANCE.createExperiment());
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

} //ExperimentTest
