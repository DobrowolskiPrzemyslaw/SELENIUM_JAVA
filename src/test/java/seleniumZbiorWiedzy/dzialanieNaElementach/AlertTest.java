package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertTest {

//    http://pragmatictestlabs.com/2018/06/28/selenium-webdriver-commands/

    @Test
    public void otwarciePrzegladarki(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        Alert alert= driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.sendKeys("Login");
        alert.sendKeys("Haslo");
        alert.getText();
        driver.close();
    }

//    http://pragmatictestlabs.com/2018/02/12/working-javascript-popup-boxes-selenium-webdriver/
    @Test
    public void otwarciePrzegladarki2(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
//        Czekanie na alert
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert= driver.switchTo().alert();
        alert.dismiss();
        driver.close();
    }

    WebDriver driver;

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();                           // klikniecie w link po zapisaniu webElementu do zmiennej

        WebElement uaernameInput = driver.findElement(By.name("username"));
        uaernameInput.sendKeys(Keys.ENTER);              // wysylam przycisku ENTER do inputa
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.getText();                                 // pobiera tekst z alertu
        firstAlert.accept();                                  // akceptacja = symulacja wcisniecia przycisku ok/tak
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.dismiss();                                // anulowanie alertu = symulacja wcisniecia X (zamkniecia alertu)
//        secondAlert.sendKeys("jakisTekst");                 // mozemy przeslac wartosc do alertu jesli posiada on pole tekstowe
    }

//    Gdy chcielibysmy wprowadzic ustawienie dla wszytkich alertow w aplikacji
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.INGORE );
//    capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS );

//    Jesli alert zniknal zanim wykonalismy na nim akcje
//    driver.navigate().back();
}
