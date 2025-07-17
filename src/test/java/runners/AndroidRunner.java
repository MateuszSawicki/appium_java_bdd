package runners;

import base.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import managers.PageObjectManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.MobileDriverFactory;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"steps"}
        , plugin = {"pretty",
        "json:target/cucumber-reports/json/cucumber.json",
        "junit:target/cucumber-reports/xml/cucumber.xml"}
        , strict = true
)
public class AndroidRunner extends BaseTest {
    @BeforeClass
    public static void beforeAllTests() throws MalformedURLException, URISyntaxException {
        mobileDriverFactory = new MobileDriverFactory();
        mobileDriverFactory.createLocalAndroidDriver();
        mobileDriverFactory.setImplicitlyWait();
        pages = new PageObjectManager(mobileDriverFactory.getDriver());
    }

//    @AfterClass
//    public static void afterAllTests() {
//        mobileDriverFactory.getDriver().quit();
//    }
}
