package steps;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.PropertiesLoader;

public class LoginSteps extends BaseTest {
    PropertiesLoader propertiesLoader = new PropertiesLoader();

    @When("User clicks login button")
    public void userClicksLoginButton() {
        pages.getLoginScreen().clickLoginBtn();
    }

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        String username = propertiesLoader.getUsername();
        String password = propertiesLoader.getPassword();
        pages.getLoginScreen().enterUsername(username);
        pages.getLoginScreen().enterPassword(password);
        pages.getLoginScreen().clickLoginBtn();
    }
}
