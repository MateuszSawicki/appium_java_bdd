Important: Change name of file "sharedlocal.properties" to "local.properties" and fill the data.

Min. required installations:
- Appium 2.0
- Java 8

Before you run your tests you have to:
- Run `Appium` server
- Connect real device

And then you can run your tests (while being in the project location):
- `./gradlew test` 

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

