package utils;

import base.BaseTest;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FailureHandler extends BaseTest {
    private final static String screenshotsDir = "screenshots/";

    public void takeScreenshot(Scenario scenario) {
        String timeToPrint = getCurrentTime();

        try {
            File screenSource =
                    ((TakesScreenshot) mobileDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(screenSource, new File(screenshotsDir + "_" + scenario.getName() + timeToPrint + ".png")
            );
            byte[] screenSource2 = ((TakesScreenshot)mobileDriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenSource2, "image/png",timeToPrint);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getCurrentTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss");
        LocalDateTime currentTime = LocalDateTime.now();
        return dateTimeFormatter.format(currentTime);
    }
}
