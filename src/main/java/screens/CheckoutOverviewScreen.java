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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FINISH']")
    WebElement btnFinish;



    public boolean isTextDisplayed(String Text) {
        return isGivenTextDisplayed(lblFirstPurchasedItem, Text);
    }

    public void scrollDown() {
        swipeFromToFraction(0.5, 0.8, 0.5, 0.2, 500);
    }

    public void clickFinish() {
        click(btnFinish);
    }


}

