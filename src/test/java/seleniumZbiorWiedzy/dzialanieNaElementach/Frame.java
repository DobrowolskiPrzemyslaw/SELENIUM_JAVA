package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frame {

    // http://pragmatictestlabs.com/2018/06/28/selenium-webdriver-commands/

    @Test
    public void poLinku(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        WebElement lnkElemnet = driver.findElement(By.linkText("com.thoughtworks.selenium"));
        driver.switchTo().frame(lnkElemnet);
        driver.close();
    }

    @Test
    public void poIdLubClssName(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.switchTo().frame("packageListFrame");
        driver.close();
    }

    @Test
    public void poIndexie(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.switchTo().frame(0);
        driver.close();
    }

    @Test
    public void doRodzica(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.switchTo().parentFrame();
        driver.close();
    }

    @Test
    public void domyslenaRamka(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.switchTo().defaultContent();
        driver.close();
    }
}
