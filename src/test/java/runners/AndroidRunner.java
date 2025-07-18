package runners;

import base.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"steps"}
        , plugin = {"pretty",
        "json:target/cucumber-reports/json/cucumber.json",
        "junit:target/cucumber-reports/xml/cucumber.xml"}
)
public class AndroidRunner extends BaseTest {
    @BeforeClass
    public static void beforeAllTests() {
    }

    @AfterClass
    public static void afterAllTests() {
    }
}
