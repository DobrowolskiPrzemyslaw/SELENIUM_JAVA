package seleniumZbiorWiedzy.get;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GetTest {
    WebDriver driver;

    @Test
    public void pobranieTytuluZAktywnegoElementu(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        try {
            driver.get("http://www.google.com");
            driver.findElement(By.cssSelector("[name='q']")).sendKeys("webElement");

            // Get attribute of current active element
            String attr = driver.switchTo().activeElement().getAttribute("title");
            System.out.println(attr);
        } finally {
            driver.quit();
        }
    }

    @Test
    public void pobranieTytuluZAktywnegoElement() throws MalformedURLException {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL("http://www.example.com"), firefoxOptions);
        driver.get("http://www.google.com");
        driver.quit();
    }
}
