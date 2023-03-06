package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PrzelaczRamke {
    WebDriver driver;

    // przejscie do ramki po kolejnosci na stronie
    @Test
    public void test(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.switchTo().frame(0);                                       // przechodzimy do ramki na stronie
        driver.findElement(By.name("fname")).sendKeys("Przemek");
        driver.switchTo().defaultContent();                                     // wracamy do pierwotnej strony
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }

    // przejscie do ramki po webElemencie
    @Test
    public void test2(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.switchTo().frame(driver.findElement(By.cssSelector("[src='basics.html']"))); // przechodzimy do ramki na stronie
        driver.findElement(By.name("fname")).sendKeys("Przemek");
        driver.switchTo().defaultContent();                                                // wracamy do pierwotnej strony
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }

    // przejscie do ramki jesli ramka posiada unikatowa nazwe name lub id
    @Test
    public void test3(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.switchTo().frame("unikatowa nazwe name lub id"); // przechodzimy do ramki na stronie
        driver.findElement(By.name("fname")).sendKeys("Przemek");
        driver.switchTo().defaultContent();                                                // wracamy do pierwotnej strony
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }
}
