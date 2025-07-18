package steps;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.PropertiesLoader;

public class LoginSteps extends BaseTest {
    PropertiesLoader propertiesLoader = new PropertiesLoader();

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        String username = propertiesLoader.getUsername();
        String password = propertiesLoader.getPassword();
        pages.getLoginScreen().enterUsername(username);
        pages.getLoginScreen().enterPassword(password);
        pages.getLoginScreen().clickLoginBtn();
    }

    @When("user tries to login with username field empty")
    public void userTriesToLoginWithUsernameFieldEmpty() {
        pages.getLoginScreen().clickLoginBtn();
    }

    @Then("error message is displayed")
    public void errorMessagesAreDisplayed() {
        Assert.assertTrue(pages.getLoginScreen().isErrorMessageDisplayed("Username is required"));
    }
}
