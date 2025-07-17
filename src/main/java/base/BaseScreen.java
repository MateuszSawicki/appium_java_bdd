package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.PropertiesLoader;

public class BaseScreen {
    protected PropertiesLoader propertiesLoader;
    public AppiumDriver mobileDriver;

    public BaseScreen(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        propertiesLoader = new PropertiesLoader();
        PageFactory.initElements(new AppiumFieldDecorator(this.mobileDriver), this);
    }

    protected void click(@NotNull WebElement targetElement) {
        targetElement.click();
    }

    protected void sendKeys(WebElement targetElement, String text) {
        targetElement.sendKeys(text);
    }
}
