package steps;


import base.BaseTest;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.jetbrains.annotations.NotNull;
import utils.FailureHandler;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Hooks extends BaseTest {
    private final FailureHandler failureHandler = new FailureHandler();

//    @Before
//    public void beforeScenario() throws MalformedURLException, URISyntaxException {
//        mobileDriverFactory.createLocalAndroidDriver();
//    }

    @After
    public void afterScenario(@NotNull Scenario scenario) {
//        if (scenario.isFailed()) {
//            failureHandler.takeScreenshot(scenario);
//            System.out.println(mobileDriverFactory.getScreenSource());

        mobileDriverFactory.getDriver().quit();
    }
}