/**
 */
package vendingMachineUAQ.tests;

import junit.textui.TestRunner;

import vendingMachineUAQ.VendingMachine;
import vendingMachineUAQ.VendingMachineUAQFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingMachineTest extends NamedEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VendingMachineTest.class);
	}

	/**
	 * Constructs a new Vending Machine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vending Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VendingMachine getFixture() {
		return (VendingMachine)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VendingMachineUAQFactory.eINSTANCE.createVendingMachine());
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

} //VendingMachineTest
