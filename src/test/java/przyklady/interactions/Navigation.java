package przyklady.interactions;

import base.BaseTest;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Navigation extends BaseTest {
    WebDriver driver;

    @Test
    public void open(){
        driver = DriverManager.getWebDriver();
        driver.get("https://www.selenium.dev/");
    }

    @Test
    public void navigateTo(){
        driver = DriverManager.getWebDriver();
        driver.navigate().to("https://www.selenium.dev/"); //zamiest przycisku
    }

    @Test
    public void back(){
        driver = DriverManager.getWebDriver();
        driver.get("https://www.selenium.dev/");
        driver.navigate().to("https://www.selenium.dev/documentation/webdriver/interactions/navigation/");
        driver.navigate().back(); //Przydatne jesli alert zniknal zanim wykonalismy na nim akcje
        Assert.assertEquals( driver.getCurrentUrl(), "https://www.selenium.dev/");
    }

    @Test
    public void next(){
        driver = DriverManager.getWebDriver();
        driver.get("https://www.selenium.dev/");
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/navigation/");
        driver.navigate().back();
        driver.navigate().forward();
        Assert.assertEquals("https://www.selenium.dev/documentation/webdriver/interactions/navigation/", driver.getCurrentUrl());
    }

    @Test
    public void refresh(){
        driver = DriverManager.getWebDriver();
        driver.get("https://www.selenium.dev/");
        driver.navigate().refresh();
        Assert.assertEquals( driver.getCurrentUrl(), "https://www.selenium.dev/");
    }
}
