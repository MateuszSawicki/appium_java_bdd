package steps;

import base.BaseTest;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseTest {
    @When("User clicks login button")
    public void userClicksLoginButton() {
        pages.getLoginScreen().clickLoginBtn();
    }
}
