package przyklady.pobranieInfo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Rectangle;

public class PobranieInfo {
    WebDriver driver;

    @Test
    public void pobranieTytyluStorny(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.getTitle();
    }

    @Test
    public void aktualnegoUrl(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.getCurrentUrl();
    }

    @Test
    public void a(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://www.google.com/");
        //returns true if element is enabled else returns false
        boolean value = driver.findElement(By.name("btnK")).isEnabled();
    }

    @Test
    public void sprawdzenieCzyJestCosZaznaczoneWybrane(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //navigates to url
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //returns true if element is checked else returns false
        boolean value = driver.findElement(By.cssSelector("input[type='checkbox']:first-of-type")).isSelected();
    }

    @Test
    public void pobranieTagName(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.example.com");
        String value = driver.findElement(By.cssSelector("h1")).getTagName();
    }

    @Test
    public void sizeAndPosition(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.example.com");
        Rectangle res =  driver.findElement(By.cssSelector("h1")).getRect();
        System.out.println(res.getX());
        System.out.println(res.getY());
    }

    @Test
    public void pobranieWartosciCss(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.example.com");
        String cssValue = driver.findElement(By.linkText("More information...")).getCssValue("color");
    }

    @Test
    public void pobranieTestuZKontentu(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");
        String text = driver.findElement(By.cssSelector("h1")).getText();
    }

    @Test
    public void pobranieAtrybutuLubPropertisa(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/inputs.html");
        WebElement emailTxt = driver.findElement(By.name(("email_input")));
        //fetch the value property associated with the textbox
        String valueInfo = emailTxt.getAttribute("value");
    }
}
