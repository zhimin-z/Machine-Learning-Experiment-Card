/**
 */
package mlam.tests;

import junit.textui.TestRunner;

import mlam.MlamFactory;
import mlam.ProductionCode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Production Code</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductionCodeTest extends CodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductionCodeTest.class);
	}

	/**
	 * Constructs a new Production Code test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionCodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Production Code test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProductionCode getFixture() {
		return (ProductionCode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MlamFactory.eINSTANCE.createProductionCode());
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

} //ProductionCodeTest
