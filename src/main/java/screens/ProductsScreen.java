package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.logging.XMLFormatter;

public class ProductsScreen extends BaseScreen {

    public ProductsScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/" +
            "android.widget.ImageView")
    WebElement btnShoppingCart;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Modal Selector Button']")
    WebElement btnFilter;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc='test-Item'])[1]/android.view.ViewGroup/*[3]")
    WebElement lblFirstProduct;

    public void clickShoppingCart() {
        click(btnShoppingCart);
    }

    public void clickAddToCart(Integer ordinalNumber) {
        click(mobileDriver.findElement(By.xpath("(//android.view." +
                "ViewGroup[@content-desc='test-ADD TO CART'])[" + ordinalNumber +"]")));
    }

    public boolean isProperLabelDisplayed(String Text) {
        return isGivenTextDisplayed(lblFirstProduct, Text);
    }

    public void tapOnFilterBtn() {
        click(btnFilter);
    }

}

