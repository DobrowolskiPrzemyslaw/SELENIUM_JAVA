package seleniumZbiorWiedzy.assercje;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AssertTest {
    WebDriver driver;

    @Test
    public void poprawnaAssercja(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");

        driver.close();
    }

    @Test
    public void drobnyBladWAssercja(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");
        Assert.assertEquals(paraText, "Dopiero", "Teksty są różne"); // Pozwala na dodanie info po nie udanej assercji

        driver.close();
    }

    @Test
    public void bladWAssercja(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero", "Teksty są różne"); // Pozwala na dodanie info po nie udanej assercji

        driver.close();
    }

    @Test
    public void sprawdzenieWyswietlenia(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        WebElement para = driver.findElement(By.cssSelector("p"));
        Assert.assertEquals(para.isDisplayed(), true);
        Assert.assertTrue(para.isDisplayed());
        Assert.assertEquals(para.getText(), "Dopiero się pojawiłem!");
        Assert.assertEquals(para.getText().contains("Dopiero"), true);
        Assert.assertEquals(para.getText().endsWith("pojawiłem!"), true);
        Assert.assertEquals(para.getText().startsWith("Dopiero"), true);
        driver.close();
    }

    @Test
    public void miekieAsercje(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        SoftAssert softAssert = new SoftAssert();

        WebElement para = driver.findElement(By.cssSelector("p"));
        softAssert.assertEquals(para.isDisplayed(), true);
        softAssert.assertTrue(para.isDisplayed());
        softAssert.assertTrue(para.isDisplayed(), "Element nie jest wyswietlny");
        softAssert.assertEquals(para.getText(), "Dopiero się pojawiłem!");
        softAssert.assertTrue(para.getText().contains("DopieroXXX"));
        softAssert.assertTrue(para.getText().endsWith("pojawiłemXXX!"));
        softAssert.assertEquals(para.getText().startsWith("Dopiero"), true);
        driver.close();

        softAssert.assertAll();
    }
}
