package base;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.PageFactory;
import utils.PropertiesLoader;

public class BaseScreen {
    protected PropertiesLoader propertiesLoader;
    public MobileDriver<MobileElement> mobileDriver;

    public BaseScreen(MobileDriver<MobileElement> mobileDriver) {
        this.mobileDriver = mobileDriver;
        propertiesLoader = new PropertiesLoader();
        PageFactory.initElements(new AppiumFieldDecorator(this.mobileDriver), this);
    }

    protected void click(@NotNull MobileElement targetElement) {
        targetElement.click();
    }
}
