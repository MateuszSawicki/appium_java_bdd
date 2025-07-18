package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewScreen extends BaseScreen {

    public CheckoutOverviewScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Description']/*[1]")
    WebElement lblFirstPurchasedItem;

//    @AndroidFindBy(accessibility = "")
//    WebElement btnFinish;

    public boolean isTextDisplayed(String Text) {
        return isGivenTextDisplayed(lblFirstPurchasedItem, Text);
    }
}
//    public void scrollDown() {
//    }

//    public void clickContinue() {
//        click(btnContinue);
//    }


