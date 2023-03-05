package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WpisywanieTekstuWInput {
    WebDriver driver;

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();                           // klikniecie w link po zapisaniu webElementu do zmiennej

        driver.findElement(By.id("fname")).sendKeys("Przemek");      // wysylam tekst do inputa

        driver.findElement(By.name("username")).clear();                        // czyszczenie inputa
        driver.findElement(By.id("fname")).sendKeys("Przemek");      // wysylam tekst do inputa

        WebElement uaernameInput = driver.findElement(By.name("username"));
        uaernameInput.clear();                                                  // czyszczenie inputa
        uaernameInput.sendKeys("Przemysław Dobrowolski");            // wysylam tekst do inputa
//        driver.close();
    }
}
