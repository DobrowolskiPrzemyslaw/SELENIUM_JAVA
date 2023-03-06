package przyklady.interactions;

import base.BaseTest;
import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alerts extends BaseTest {
//    http://pragmatictestlabs.com/2018/06/28/selenium-webdriver-commands/
    WebDriver driver;

    @Test
    public void promptAlert(){
        driver = DriverManager.getWebDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        Alert alert= driver.switchTo().alert();
        alert.sendKeys("Login");
        alert.sendKeys("Haslo");
    }

//    http://pragmatictestlabs.com/2018/02/12/working-javascript-popup-boxes-selenium-webdriver/
    @Test
    public void dismissAlert(){
        driver = DriverManager.getWebDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert= driver.switchTo().alert();
        alert.dismiss();
    }

    @Test
    public void test(){
        driver = DriverManager.getWebDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();
        WebElement uaernameInput = driver.findElement(By.name("username"));
        uaernameInput.sendKeys(Keys.ENTER);
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.getText();
        firstAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.dismiss();
    }

//    Gdy chcielibysmy wprowadzic ustawienie dla wszytkich alertow w aplikacji
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.INGORE );
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS );

//Przydatne jesli alert zniknal zanim wykonalismy na nim akcje
//    driver.navigate().back();
}
