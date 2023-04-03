package testSteps;

import io.cucumber.java.en.And;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Checkout;
import pages.Home;
import pages.Product;
import properties.TestContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutSteps {

    private Home home;
    private Checkout checkout;

    public CheckoutSteps(TestContext textContext){ checkout=textContext.getPageManager().getCheckout();}

    @And("I can go to checkout page")
    public void iCanGoToCheckoutPage() {
        //Click Proceed to Checkout and confirm it's the checkout Page
        checkout.goToCheckoutPage();
        assertTrue(checkout.userOnCheckOutPage(), "User is not on Checkout Page");

    }

    @And("I can proceed to place order")
    public void iCanProceedToPlaceOrder() {
        checkout.UserCanProceedToPlaceOrder();
        assertTrue(checkout.UserOnPaymentPage(),"User can not proceed to Payment Page.");

    }

    @And("I can place an order with NameOnCard: {string}, CardNumber:{int}, CVC: {int}, ExpiryMonth: {int} and ExpiryYear: {int}")
    public void iCanPlaceAnOrderWithNameOnCardCardNumberCVCExpiryMonthAndExpiryYear(String nameOnCard, int cardNumber, int cvc, int expiryMonth, int expiryYear) {
        checkout.attemptToPayAndConfirmOrder(nameOnCard, cardNumber, cvc, expiryMonth, expiryYear);
        assertTrue(checkout.confirmPlacedOrder(),"The order was not placed Successfully.");
    }

    @Then("I can download the Invoice")
    public void iCanDownloadTheInvoice() {
        checkout.downloadTheInvoice();
        //assertTrue();
    }

}
