/**
 */
package vendingMachineUAQ.tests;

import junit.textui.TestRunner;

import vendingMachineUAQ.Keypad;
import vendingMachineUAQ.VendingMachineUAQFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Keypad</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeypadTest extends HasOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KeypadTest.class);
	}

	/**
	 * Constructs a new Keypad test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeypadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Keypad test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Keypad getFixture() {
		return (Keypad)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VendingMachineUAQFactory.eINSTANCE.createKeypad());
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

} //KeypadTest
