package steps;

import base.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FiltersSteps extends BaseTest {
    @When("the user filter the products by name")
    public void theUserFilterTheProductsByName() {
        pages.getProductsScreen().tapOnFilterBtn();
        pages.getFilterScreen().ClickNameZtoA();
    }

    @Then("the products are displayed filtered by the name")
    public void theProductsAreDisplayedFilteredByTheName() {
        Assert.assertTrue(pages.getProductsScreen().isProperLabelDisplayed("Test.allTheThings() T-Shirt (Red)"));
    }
}
