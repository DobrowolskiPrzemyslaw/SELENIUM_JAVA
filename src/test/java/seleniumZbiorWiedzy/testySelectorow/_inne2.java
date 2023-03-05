package seleniumZbiorWiedzy.testySelectorow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import java.util.List;

public class _inne2 {

    @Test
    public void above(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
        driver.findElement(emailLocator);
    }

    @Test
    public void below(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("email"));
        driver.findElement(passwordLocator);
    }

    @Test
    public void toLeftOf(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By cancelLocator = RelativeLocator.with(By.tagName("button")).toLeftOf(By.id("submit"));
        driver.findElement(cancelLocator);
    }

    @Test
    public void toRightOf(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By submitLocator = RelativeLocator.with(By.tagName("button")).toRightOf(By.id("cancel"));
        driver.findElement(submitLocator);
    }

    @Test
    public void near(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By emailLocator = RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email"));
        driver.findElement(emailLocator);
    }

    @Test
    public void below_toRightOf(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By submitLocator = RelativeLocator.with(By.tagName("button")).below(By.id("email")).toRightOf(By.id("cancel"));
        driver.findElement(submitLocator);
    }
}
