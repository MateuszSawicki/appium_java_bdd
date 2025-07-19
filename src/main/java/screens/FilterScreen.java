package screens;

import base.BaseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FilterScreen extends BaseScreen {

    public FilterScreen(AppiumDriver mobileDriver) {
        super(mobileDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc='Selector container']/" +
            "android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement btnNameZtoA;

    public void ClickNameZtoA() {
        click(btnNameZtoA);
    }


}

