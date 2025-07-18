package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsScreen extends BaseScreen {

    public ProductsScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/" +
            "android.widget.ImageView")
    WebElement btnShoppingCart;


    public void clickShoppingCart() {
        click(btnShoppingCart);
    }

    public void clickAddToCart(Integer ordinalNumber) {
        click(mobileDriver.findElement(By.xpath("(//android.view." +
                "ViewGroup[@content-desc='test-ADD TO CART'])[" + ordinalNumber +"]")));
    }

}

