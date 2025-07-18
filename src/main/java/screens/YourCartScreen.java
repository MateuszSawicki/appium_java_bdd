package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class YourCartScreen extends BaseScreen {

    public YourCartScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Description']/*[1]")
    WebElement lblFirstAddedItem;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CHECKOUT']")
    WebElement btnCheckout;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-REMOVE']")
    WebElement btnRemove;

    public void clickCheckoutBtn() {
        click(btnCheckout);
    }

    public void clickOnRemoveBtn() {
        click(btnRemove);
    }

    public boolean isTextDisplayed(String Text) {
        return isGivenTextDisplayed(lblFirstAddedItem,Text);
    }

    public boolean isElementDisplayed() {
        return isElementDisplayed(lblFirstAddedItem);
    }



}

