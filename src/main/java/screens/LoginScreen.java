package screens;

import base.BaseScreen;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginScreen extends BaseScreen {
    @AndroidFindBy(id = "")
    @iOSXCUITFindBy(xpath = "")
    MobileElement loginBtn;

    public LoginScreen(MobileDriver<MobileElement> mobileDriver) {
        super(mobileDriver);
    }

    public void clickLoginBtn() {
        if (mobileDriver instanceof AndroidDriver) {
            click(loginBtn);
    }
}
}
