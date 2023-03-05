package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PobieranieTekstuZPolaTekstowego {
    WebDriver driver;

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();

        WebElement inputText = driver.findElement(By.name("username"));
        inputText.clear();
        inputText.sendKeys("Przemyslaw Dobrowolski");
        String wartoscAtrybutuValue = inputText.getAttribute("value");
        System.out.println(wartoscAtrybutuValue);
    }
}
