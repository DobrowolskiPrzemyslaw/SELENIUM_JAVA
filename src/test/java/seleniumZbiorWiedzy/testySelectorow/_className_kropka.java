package seleniumZbiorWiedzy.testySelectorow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

// Stosujemy zawsze jesli pojedyncze nazwy sa unikatowe
public class _className_kropka {

    @Test
    public void class_(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.className("topSecret"));                             // <input class="topSecret"></input>
    }
}
