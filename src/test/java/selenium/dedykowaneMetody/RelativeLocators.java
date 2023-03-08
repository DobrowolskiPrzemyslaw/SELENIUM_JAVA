package selenium.dedykowaneMetody;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;
import selenium.DriverManager;
import selenium.baseTests.BaseTest;
import java.time.Duration;

public class RelativeLocators extends BaseTest {
    WebDriver driver;

    @Test
    public void above(){
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("password")));
    }

    @Test
    public void below(){
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("password")));
    }

    @Test
    public void leftOf(){
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(By.id("submit"));
    }


    @Test
    public void rightOf(){
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(By.id("cancel")));
    }

    @Test
    public void near(){
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email")));
    }

    @Test
    public void chainingLocators(){
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.id("email")).toRightOf(By.id("cancel")));
    }
}