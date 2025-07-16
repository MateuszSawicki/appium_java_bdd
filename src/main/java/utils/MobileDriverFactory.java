package utils;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobileDriverFactory {
    MobileDriver<MobileElement> driver;
    PropertiesLoader propertiesLoader = new PropertiesLoader();

    public void createLocalAndroidDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Samsung");
        capabilities.setCapability("automationName", propertiesLoader.getAutomationName());
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", propertiesLoader.getAppPathAndroid());
        capabilities.setCapability("disableWindowAnimation", true);
        capabilities.setCapability("newCommandTimeout", propertiesLoader.getNewCommandTimeout());
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    public void setImplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(propertiesLoader.getImplicitWait(), TimeUnit.SECONDS);
    }

    public MobileDriver<MobileElement> getDriver() {
        return driver;
    }

    public String getScreenSource() {
        return driver.getPageSource();
    }
}
