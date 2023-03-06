package przyklady.interactions;

import base.BaseTest;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUrl extends BaseTest {
    WebDriver driver;

    @Test
    public void test(){
        driver = DriverManager.getWebDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/");
        Assert.assertEquals( driver.getCurrentUrl(), "https://www.selenium.dev/documentation/webdriver/interactions/");
    }
}
