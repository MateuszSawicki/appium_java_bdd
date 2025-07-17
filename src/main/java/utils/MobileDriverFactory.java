package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class MobileDriverFactory {
    AppiumDriver driver;
    PropertiesLoader propertiesLoader = new PropertiesLoader();

    public void createLocalAndroidDriver() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "emulator-5554");
        capabilities.setCapability("appium:automationName", propertiesLoader.getAutomationName());
        capabilities.setCapability("appium:platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "15.0");
        capabilities.setCapability("appium:app", propertiesLoader.getAppPathAndroid());
        capabilities.setCapability("appium:newCommandTimeout", propertiesLoader.getNewCommandTimeout());
        capabilities.setCapability("appium:appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.SplashActivity");
        driver = new AndroidDriver(new URI("http://0.0.0.0:4723").toURL(), capabilities);

    }

    public void setImplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(propertiesLoader.getImplicitWait()));
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    public String getScreenSource() {
        return driver.getPageSource();
    }
}
