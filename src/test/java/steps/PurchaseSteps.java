package steps;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PurchaseSteps extends BaseTest {
    @When("the user adds the product to the shopping cart")
    public void theUserAddsTheProductToTheShoppingCart() {
        pages.getProductsScreen().clickAddToCart(1);
    }

    @And("the user opens the shopping cart")
    public void theUserOpensTheShoppingCart() {
        pages.getProductsScreen().clickShoppingCart();
    }

    @Then("the added product is displayed")
    public void theAddedProductIsDisplayed() {
        Assert.assertTrue(pages.getYourCartScreen().isTextDisplayed("Sauce Labs Backpack"));
    }

    @When("the user checks out")
    public void theUserChecksOut() {
        pages.getYourCartScreen().clickCheckoutBtn();
    }

    @And("the user fills in required information")
    public void theUserFillsInRequiredInformation() {
        pages.getCheckoutInformationScreen().enterFirstName("testFirstName");
        pages.getCheckoutInformationScreen().enterLastName("testLastName");
        pages.getCheckoutInformationScreen().enterZipPostalCode("12-234");
        pages.getCheckoutInformationScreen().clickContinue();
    }

    @Then("payment details are displayed")
    public void paymentDetailsAreDisplayed() {
        Assert.assertTrue(pages.getCheckoutOverviewScreen().isTextDisplayed("Sauce Labs Backpack"));
    }

    @When("the user clicks finish")
    public void theUserClicksFinish() {
        pages.getCheckoutOverviewScreen().scrollDown();
        pages.getCheckoutOverviewScreen().clickFinish();
    }

    @Then("the complete purchase screen is displayed")
    public void theCompletePurchaseScreenIsDisplayed() {
        Assert.assertTrue(pages.getCheckoutCompleteScreen().isOrderSuccessLblDisplayed());
    }
}
