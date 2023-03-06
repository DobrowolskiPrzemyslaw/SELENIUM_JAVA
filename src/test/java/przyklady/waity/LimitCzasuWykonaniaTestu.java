package przyklady.waity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Ustawienie limitów czasu dla testów pomoże Ci pominąć wolniejsze testy (wąskie gardła) i skrócić czas wykonywania przypadków testowych.
//Możesz uzyskać listę pominiętych testów i uruchomić je później osobno.
public class LimitCzasuWykonaniaTestu {
    WebDriver driver;

    @Test(timeOut = 5000)
    public void zbytDlugiTest() throws InterruptedException {
        String pathDriver = "F:\\PROGRAMOWANIE\\_Selenium\\Selenium\\src\\main\\resources\\webdrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("p"));
        driver.close();
    }

    @Test(timeOut = 10000)
    public void dlugoscTestuJestOk() throws InterruptedException {
        String pathDriver = "F:\\PROGRAMOWANIE\\_Selenium\\Selenium\\src\\main\\resources\\webdrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("p"));
        driver.close();
    }
}
