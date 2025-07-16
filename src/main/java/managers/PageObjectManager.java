package managers;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import screens.LoginScreen;

public class PageObjectManager {
    MobileDriver<MobileElement> mobileDriver;
    LoginScreen loginScreen;

    public PageObjectManager(MobileDriver<MobileElement> mobileDriver) {
        this.mobileDriver = mobileDriver;
    }

    public LoginScreen getLoginScreen() {
        return (loginScreen == null) ? loginScreen = new LoginScreen(this.mobileDriver) :
                loginScreen;
    }
}
