package managers;

import io.appium.java_client.AppiumDriver;
import screens.*;

public class PageObjectManager {
    AppiumDriver mobileDriver;
    LoginScreen loginScreen;
    ProductsScreen productsScreen;
    YourCartScreen yourCartScreen;
    CheckoutInformationScreen checkoutInformationScreen;
    CheckoutOverviewScreen checkoutOverviewScreen;

    public PageObjectManager(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
    }

    public LoginScreen getLoginScreen() {
        return (loginScreen == null) ? loginScreen = new LoginScreen(this.mobileDriver):
                loginScreen;
    }

    public ProductsScreen getProductsScreen() {
        return (productsScreen == null) ? productsScreen = new ProductsScreen(this.mobileDriver):
                productsScreen;
    }

    public YourCartScreen getYourCartScreen() {
        return (yourCartScreen == null) ? yourCartScreen = new YourCartScreen(this.mobileDriver):
                yourCartScreen;
    }

    public CheckoutInformationScreen getCheckoutInformationScreen() {
        return (checkoutInformationScreen == null) ? checkoutInformationScreen = new CheckoutInformationScreen(this.mobileDriver):
                checkoutInformationScreen;
    }

    public CheckoutOverviewScreen getCheckoutOverviewScreen() {
        return (checkoutOverviewScreen == null) ? checkoutOverviewScreen = new CheckoutOverviewScreen(this.mobileDriver):
                checkoutOverviewScreen;
    }
}
