/**
 */
package mlam.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mlam.Dependency;
import mlam.MlamFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyTest extends TestCase {

	/**
	 * The fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dependency fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependencyTest.class);
	}

	/**
	 * Constructs a new Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dependency fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dependency getFixture() {
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
		setFixture(MlamFactory.eINSTANCE.createDependency());
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

} //DependencyTest
