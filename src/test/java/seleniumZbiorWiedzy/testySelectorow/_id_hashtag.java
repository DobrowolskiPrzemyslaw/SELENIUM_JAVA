package seleniumZbiorWiedzy.testySelectorow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Stosujemy zawsze jesli pojedyncze nazwy sa unikatowe
public class _id_hashtag {

//    W CCS to #ID
    @Test
    public void id_(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By buttonId = By.id("clickOnMe");
        WebElement button = driver.findElement(buttonId);
        WebElement button2 = driver.findElement(By.id("clickOnMe"));               // <input id="clickOnMe"></input>
    }
}
