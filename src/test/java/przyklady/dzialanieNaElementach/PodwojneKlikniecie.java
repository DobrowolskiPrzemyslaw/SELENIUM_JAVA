package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PodwojneKlikniecie {

    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // bez implicityWait nie chcialo dzialac
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");

        WebElement basicPageLink = driver.findElement(By.id("bottom"));

        Actions actions = new Actions(driver);
        actions.doubleClick(basicPageLink).perform();
    }

    // test skonczy sie sukcesem, ale nie otworzy sie nowe okno!!! - KIEPSKA METODA
    @Test
    public void test2(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // bez implicityWait nie chcialo dzialac
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");

        WebElement basicPageLink = driver.findElement(By.id("bottom"));
        basicPageLink.click();
        basicPageLink.click();
    }
}
