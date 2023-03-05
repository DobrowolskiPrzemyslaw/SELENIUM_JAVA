package seleniumZbiorWiedzy.navigate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NavigateTest {
    WebDriver driver;

    @Test
    public void open(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //Convenient
        driver.get("https://selenium.dev");
    }

    @Test
    public void navigateTo(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //Longer way
        driver.navigate().to("https://selenium.dev");
        driver.navigate().back();
    }

    @Test
    public void back(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        driver.get("https://selenium.dev");
        driver.navigate().back();
    }

    @Test
    public void next(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        driver.get("https://selenium.dev");
        driver.navigate().back();
        driver.navigate().forward();
    }

    @Test
    public void refresh(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        driver.get("https://selenium.dev");
        driver.navigate().refresh();
    }
}
