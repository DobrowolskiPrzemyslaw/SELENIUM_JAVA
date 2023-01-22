package testCases;

import base.BaseTest;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static pages.Homepage.*;

public class ScrollMouseTest extends BaseTest {

    @Test
    public void scrollTest(){
        WebDriver driver = DriverManager.getWebDriver();
        driver.get("http://www.kurs-selenium.pl/demo/");
        webDriverWithMethods.moveTo(EXRANET_LOGIN_BUTTON);
        webDriverWithMethods.moveTo(CHECH_OUT_INPUT);
        webDriverWithMethods.moveTo(EXRANET_LOGIN_BUTTON);
    }
}
