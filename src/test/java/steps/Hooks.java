package steps;

import base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.PageObjectManager;
import utils.MobileDriverFactory;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Hooks extends BaseTest {

    @Before
    public void beforeScenario() throws MalformedURLException, URISyntaxException {
        mobileDriverFactory = new MobileDriverFactory();
        mobileDriverFactory.createLocalAndroidDriver();
        mobileDriverFactory.setImplicitlyWait();
        pages = new PageObjectManager(mobileDriverFactory.getDriver());
    }

    @After
    public void afterScenario() {
        mobileDriverFactory.getDriver().quit();
    }
}