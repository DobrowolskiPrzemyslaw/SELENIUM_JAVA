package przyklady.frame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frame {
    WebDriver driver;

    @Test
    public void kliknieciewPrzyciskNaRamce(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        WebElement iframe = driver.findElement(By.cssSelector("#modal>iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.tagName("button")).click();
    }

    @Test
    public void kliknieciewPrzyciskNaRamce_wyszukaniePoId(){
        driver.switchTo().frame("buttonframe");
        driver.switchTo().frame("myframe");
    }

    @Test
    public void kliknieciewPrzyciskNaRamce_wyszukaniePoIndexie(){
        driver.switchTo().frame(1);
    }

    @Test
    public void powrotDoDomyslnejRamki(){
        driver.switchTo().defaultContent();
    }


    @Test
    public void poLinku(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        WebElement lnkElemnet = driver.findElement(By.linkText("com.thoughtworks.selenium"));
        driver.switchTo().frame(lnkElemnet);
        driver.close();
    }

    @Test
    public void poIdLubClssName(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.switchTo().frame("packageListFrame");
        driver.close();
    }

    @Test
    public void poIndexie(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.switchTo().frame(0);
        driver.close();
    }

    @Test
    public void doRodzica(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.switchTo().parentFrame();
        driver.close();
    }

    @Test
    public void domyslenaRamka(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.switchTo().defaultContent();
        driver.close();
    }
}
