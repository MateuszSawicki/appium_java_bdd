package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertiesLoader;

import java.time.Duration;
import java.util.Collections;
import java.util.NoSuchElementException;

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

    protected void sendKeys(@NotNull WebElement targetElement, String text) {
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

    protected boolean isElementDisplayed(WebElement targetElement) {
        try {
            WebDriverWait wait = new WebDriverWait(this.mobileDriver, Duration.ofSeconds(timeOut));
            wait.until(ExpectedConditions.visibilityOf(targetElement));
            return true;
        } catch (TimeoutException | StaleElementReferenceException | NoSuchElementException e) {
            return false;
        }
    }

    public void swipeFromToFraction(
            double startXFraction, double startYFraction,
            double endXFraction, double endYFraction,
            int durationMs
    ) {
        Dimension screenSize = mobileDriver.manage().window().getSize();
        int width = screenSize.getWidth();
        int height = screenSize.getHeight();

        int x1 = (int) (width * startXFraction);
        int y1 = (int) (height * startYFraction);
        int x2 = (int) (width * endXFraction);
        int y2 = (int) (height * endYFraction);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x1, y1));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(durationMs), PointerInput.Origin.viewport(), x2, y2));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        mobileDriver.perform(Collections.singletonList(swipe));
    }

}
