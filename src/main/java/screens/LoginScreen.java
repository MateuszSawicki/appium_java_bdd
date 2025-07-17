package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(accessibility = "test-Username")
    WebElement txtUsername;

    @AndroidFindBy(accessibility = "test-Password")
    WebElement txtPassword;


    @AndroidFindBy(accessibility = "test-LOGIN")
    @iOSXCUITFindBy(xpath = "test")
    WebElement loginBtn;

    public LoginScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }

    public void enterUsername(String username) {
        if (mobileDriver instanceof AndroidDriver) {
            sendKeys(txtUsername, username);
        }
    }

    public void enterPassword(String password) {
        if (mobileDriver instanceof AndroidDriver) {
            sendKeys(txtPassword, password);
        }
    }

    public void clickLoginBtn() {
        if (mobileDriver instanceof AndroidDriver) {
            click(loginBtn);
    }
}
}
