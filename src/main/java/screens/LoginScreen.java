package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(accessibility = "test-Username")
    WebElement txtUsername;

    @AndroidFindBy(accessibility = "test-Password")
    WebElement txtPassword;

    @AndroidFindBy(accessibility = "test-LOGIN")
    WebElement loginBtn;

    public LoginScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }

    public void enterUsername(String username) {
            sendKeys(txtUsername, username);
    }

    public void enterPassword(String password) {
            sendKeys(txtPassword, password);
    }

    public void clickLoginBtn() {
            click(loginBtn);
    }
}

