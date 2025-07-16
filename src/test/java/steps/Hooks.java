package steps;


import base.BaseTest;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.jetbrains.annotations.NotNull;
import utils.FailureHandler;

public class Hooks extends BaseTest {
    private final FailureHandler failureHandler = new FailureHandler();

    @Before
    public void beforeScenario() {
        mobileDriverFactory.getDriver().launchApp();
    }

    @After
    public void afterScenario(@NotNull Scenario scenario) {
        if (scenario.isFailed()) {
            failureHandler.takeScreenshot(scenario);
            System.out.println(mobileDriverFactory.getScreenSource());
        }
        mobileDriverFactory.getDriver().closeApp();
    }
}