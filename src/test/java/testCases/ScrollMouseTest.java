package testCases;

import base.BaseTest;
import driver.DriverManager;
import methods.WebDriverWithMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScrollMouseTest extends BaseTest {
    WebDriverWithMethods webDriverWithMethods = new WebDriverWithMethods();

    @Test
    public void scrollTest(){
        WebDriver driver = DriverManager.getWebDriver();
        driver.get("http://www.kurs-selenium.pl/demo/");
    }
}
