package seleniumZbiorWiedzy.testySelectorow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

// Stosujemy zawsze jesli pojedyncze nazwy sa unikatowe
public class _inne {

    @Test
    public void name_(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.name("fname"));
    }

    @Test
    public void tag_(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.tagName("input"));

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println(inputs);
    }

    @Test
    public void link_(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.linkText("Visit W3Schools.com!")); // wyszukanie jak po teksie ale tag musi byc <a> - musi to byc link
    }

    @Test
    public void fragmentLinku(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.partialLinkText("Visit")); // wyszukanie jak po teksie ale tag musi byc <a> - musi to byc link
    }
}
