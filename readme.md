

If we wanted to automate iOS as well we need to add into screen.java files:
```
@AndroidFindBy(accessibility = "test-LOGIN")
@iOSXCUITFindBy(accessibility = "test-LOGIN")
WebElement loginBtn;

public void enterUsername(String username) {
if (mobileDriver instanceof AndroidDriver) {
    sendKeys(txtUsername, username);
    } else {
        //do somethine else
    }
}
```

