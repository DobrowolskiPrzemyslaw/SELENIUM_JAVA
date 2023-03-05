package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Klawiatura {
    WebDriver driver;

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();

        WebElement uaernameInput = driver.findElement(By.name("username"));
        uaernameInput.sendKeys(Keys.ENTER);
        uaernameInput.sendKeys(Keys.TAB);
        uaernameInput.sendKeys(Keys.TAB);
//        driver.close();
    }
}
