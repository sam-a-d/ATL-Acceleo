/**
 */
package vendingMachineUAQ.tests;

import junit.textui.TestRunner;

import vendingMachineUAQ.PaymentProcessor;
import vendingMachineUAQ.VendingMachineUAQFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Payment Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link vendingMachineUAQ.PaymentProcessor#isPaymentComplete() <em>Is Payment Complete</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PaymentProcessorTest extends HasOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaymentProcessorTest.class);
	}

	/**
	 * Constructs a new Payment Processor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentProcessorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Payment Processor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PaymentProcessor getFixture() {
		return (PaymentProcessor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VendingMachineUAQFactory.eINSTANCE.createPaymentProcessor());
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

	/**
	 * Tests the '{@link vendingMachineUAQ.PaymentProcessor#isPaymentComplete() <em>Is Payment Complete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vendingMachineUAQ.PaymentProcessor#isPaymentComplete()
	 * @generated
	 */
	public void testIsPaymentComplete() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PaymentProcessorTest
