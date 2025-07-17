package managers;

import io.appium.java_client.AppiumDriver;
import screens.LoginScreen;

public class PageObjectManager {
    AppiumDriver mobileDriver;
    LoginScreen loginScreen;

    public PageObjectManager(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
    }

    public LoginScreen getLoginScreen() {
        return (loginScreen == null) ? loginScreen = new LoginScreen(this.mobileDriver) :
                loginScreen;
    }
}
