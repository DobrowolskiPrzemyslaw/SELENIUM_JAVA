package seleniumZbiorWiedzy.waity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

// Thread.sleep - to szytwne oczekiwanie określony okres czasu
// Thread.sleep może okazać się zbyt długi - wtedy wydłuża czas testu
// Thread.sleep może okazać się zbyt krótki - wtedy wywala niepotrzebnie test
public class ThreadSleep {
    WebDriver driver;

    @Test
    public void zbytKrotkiThreadSleep2() throws InterruptedException {
        String pathDriver = "F:\\_Selenium\\2020.11.05_KursSelenium\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("p"));
    }

    @Test
    public void zbytDlugiThreadSleep() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(20000);
        driver.findElement(By.cssSelector("p"));
    }
}
