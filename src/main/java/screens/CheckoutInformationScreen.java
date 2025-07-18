package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutInformationScreen extends BaseScreen {

    public CheckoutInformationScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }

    @AndroidFindBy(accessibility = "test-First Name")
    WebElement txtFirstName;

    @AndroidFindBy(accessibility = "test-Last Name")
    WebElement txtLastName;

    @AndroidFindBy(accessibility = "test-Zip/Postal Code")
    WebElement txtZipPostalCode;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CONTINUE']")
    WebElement btnContinue;

    public void enterFirstName(String firstName) {
        sendKeys(txtFirstName, firstName);
    }

    public void enterLastName(String lastName) {
        sendKeys(txtLastName, lastName);
    }

    public void enterZipPostalCode(String zipPostalCode) {
        sendKeys(txtZipPostalCode, zipPostalCode);
    }

    public void clickContinue() {
        click(btnContinue);
    }
}

