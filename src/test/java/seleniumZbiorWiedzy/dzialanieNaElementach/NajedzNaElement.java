package seleniumZbiorWiedzy.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NajedzNaElement {

    @Test
    public void howerTest(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // bez implicityWait nie chcialo dzialac
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement heading = driver.findElement(By.tagName("h1"));

        Actions actions = new Actions(driver);
        actions.moveToElement(heading).perform();
    }
}
