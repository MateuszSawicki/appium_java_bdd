package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutCompleteScreen extends BaseScreen {

    public CheckoutCompleteScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='THANK YOU FOR YOU ORDER']")
    WebElement lblOrderSuccess;

    public boolean isOrderSuccessLblDisplayed() {
        return isElementDisplayed(lblOrderSuccess);
    }
}

