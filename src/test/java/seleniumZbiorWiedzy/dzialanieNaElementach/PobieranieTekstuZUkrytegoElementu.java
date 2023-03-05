package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PobieranieTekstuZUkrytegoElementu {
    WebDriver driver;

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicPageLink.click();

        WebElement paragraf = driver.findElement(By.tagName("p"));
        System.out.println("By text: " + paragraf.getText());
        System.out.println("By attribute value: " + paragraf.getAttribute("value"));
        System.out.println("By attribute textContent: " + paragraf.getAttribute("textContent")); //DZIALA POPRAWNIE
    }
}
