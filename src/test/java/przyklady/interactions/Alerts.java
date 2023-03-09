package przyklady.interactions;

import base.BaseTest;
import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    // Od testera
    @Test
    public void promptAlert(){
        driver = DriverManager.getWebDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        Alert alert= driver.switchTo().alert();
        alert.sendKeys("Login");
        alert.sendKeys("Haslo");
    }

    @Test
    public void dismissAlert(){
        driver = DriverManager.getWebDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert= driver.switchTo().alert();
        alert.dismiss();
    }


    // Ze strony selenium
    @Test
    public void alerts(){
        driver.findElement(By.linkText("See an example alert")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();
    }

    @Test
    public void confirm(){
        driver.findElement(By.linkText("See a sample confirm")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.dismiss();
    }

    @Test
    public void prompt(){
        driver.findElement(By.linkText("See a sample confirm")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.findElement(By.linkText("See a sample prompt")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Selenium");
        alert.accept();
    }


//    Gdy chcielibysmy wprowadzic ustawienie dla wszytkich alertow w aplikacji
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.INGORE );
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS );

//Przydatne jesli alert zniknal zanim wykonalismy na nim akcje
//    driver.navigate().back();
}
