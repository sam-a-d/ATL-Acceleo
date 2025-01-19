/**
 */
package vendingMachineUAQ.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>vendingMachineUAQ</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingMachineUAQTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new VendingMachineUAQTests("vendingMachineUAQ Tests");
		suite.addTestSuite(LocationTest.class);
		suite.addTestSuite(PaymentProcessorTest.class);
		suite.addTestSuite(ItemGroupTest.class);
		suite.addTestSuite(InventoryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineUAQTests(String name) {
		super(name);
	}

} //VendingMachineUAQTests
