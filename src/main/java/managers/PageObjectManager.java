package managers;

import io.appium.java_client.AppiumDriver;
import screens.LoginScreen;
import screens.ProductsScreen;
import screens.YourCartScreen;

public class PageObjectManager {
    AppiumDriver mobileDriver;
    LoginScreen loginScreen;
    ProductsScreen productsScreen;
    YourCartScreen yourCartScreen;

    public PageObjectManager(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
    }

    public LoginScreen getLoginScreen() {
        return (loginScreen == null) ? loginScreen = new LoginScreen(this.mobileDriver) :
                loginScreen;
    }

    public ProductsScreen getProductsScreen() {
        return (productsScreen == null) ? productsScreen = new ProductsScreen(this.mobileDriver) :
                productsScreen;
    }

    public YourCartScreen getYourCartScreen() {
        return (yourCartScreen == null) ? yourCartScreen = new YourCartScreen(this.mobileDriver) :
                yourCartScreen;
    }
}
