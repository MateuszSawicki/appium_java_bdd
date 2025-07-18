package steps;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        pages.getYourCartScreen().isTextDisplayed("Sauce Labs Backpack");
    }
}
