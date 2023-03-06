package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageTest {
    WebDriver driver;

    @Test
    public void pobranieWysokosci(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement image = driver.findElement(By.tagName("img"));
        String wysokoscObrazka = image.getAttribute("naturalHeight");
        Assert.assertEquals(wysokoscObrazka, "223");
        driver.close();
    }

    @Test
    public void pobranieWysokosci2(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basicsa.html"); // bledy endpoint
        WebElement image = driver.findElement(By.tagName("img"));
        String wysokoscObrazka = image.getAttribute("naturalHeight");
        Assert.assertEquals(wysokoscObrazka, "0");
        driver.close();
    }

    @Test
    public void pobranieWymiarow(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basicsa.html");
        Rectangle res = driver.findElement(By.tagName("img")).getRect();
        System.out.println(res.getX());
        Assert.assertEquals(res.getX(), 120);
        Assert.assertEquals(res.getY(), 120);
        driver.close();
    }

    @Test
    public void pobranieWartosciAtrubutu(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basicsa.html");
        String res = driver.findElement(By.tagName("img")).getCssValue("color");
        System.out.println(res);
        Assert.assertEquals(res, "RED");
        driver.close();
    }


}
