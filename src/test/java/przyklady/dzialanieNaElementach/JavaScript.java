package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class JavaScript {

    @Test
    public void klikanie(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",basicPageLink); // klikniecie w link za pomoca kodu javaScript // to jest kod Javascript argument[0].click()
    }

    @Test
    public void wysylanie_Wartosci_Do_Inputa(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",basicPageLink); // klikniecie w link za pomoca kodu javaScript // to jest kod Javascript argument[0].click()

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // bez implicityWait nie chcialo dzialac

        WebElement nameInput = driver.findElement(By.cssSelector("#fname"));
        executor.executeScript("arguments[0].setAttribute('value','Przemek');",nameInput);
    }

    @Test
    public void kasowanie_Wartosci_Z_Inputa(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // bez implicityWait nie chcialo dzialac
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",basicPageLink); // klikniecie w link za pomoca kodu javaScript // to jest kod Javascript argument[0].click()

        WebElement nameInput = driver.findElement(By.name("fname"));
        executor.executeScript("arguments[0].setAttribute('value','Przemek');",nameInput); // klikniecie w link za pomoca kodu javaScript // to jest kod Javascript argument[0].click()
        executor.executeScript("arguments[0].setAttribute('value','');",nameInput);
    }
}
