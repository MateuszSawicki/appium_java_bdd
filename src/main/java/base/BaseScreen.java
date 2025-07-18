package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertiesLoader;

import java.time.Duration;

public class BaseScreen {
    protected PropertiesLoader propertiesLoader;
    public AppiumDriver mobileDriver;
    private final int timeOut = new PropertiesLoader().getExplicitWait();

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

    protected boolean isGivenTextDisplayed(WebElement targetElement, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(this.mobileDriver, Duration.ofSeconds(timeOut));
            wait.until(ExpectedConditions.textToBePresentInElement(targetElement, text));
            return true;
        } catch (TimeoutException e) {
            System.out.println("Text: " + text + " is not visible in: " + targetElement);
            throw e;
        }
    }
}
