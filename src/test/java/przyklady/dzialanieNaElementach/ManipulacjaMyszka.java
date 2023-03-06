package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class ManipulacjaMyszka {

    @Test
    public void ruszanieMyszka()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        Robot robot = null;
        driver.get("test-url");
        driver.manage().window().maximize();
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        // SET THE MOUSE X Y POSITION
        robot.mouseMove(300, 550);
    }

    @Test
    public void przesuniecieDoKonkretegoElementu()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("test-url");
        driver.manage().window().maximize();
        WebElement lnkJob = driver.findElement(By.xpath("//a/i[contains(text(),'Job')]"));
        Actions action= new Actions(driver);
        action.moveToElement(lnkJob).build().perform();
    }

    @Test
    public void dragAndDrop()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("test-url");
        driver.manage().window().maximize();
        Actions action= new Actions(driver);
        // Opcja 1
        WebElement sourceWebElement = driver.findElement(By.xpath("//a/i[contains(text(),'Job')]"));
        WebElement targetWebElement = driver.findElement(By.xpath("//a/i[contains(text(),'Job')]"));
        action.dragAndDrop(sourceWebElement, targetWebElement).build().perform();                        // z i do konkretnego punktu
        // Opcja 2
        int horizontalMoveOffset = 100;
        int verticalMoveOffset = 100;
        action.dragAndDropBy(sourceWebElement,horizontalMoveOffset, verticalMoveOffset).build().perform(); // o
    }

    @Test
    public void klikanie()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        Robot robot = null;
        driver.get("test-url");
        driver.manage().window().maximize();
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        // LEFT CLICK
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);   // wciska
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // zwalnia

        // RIGHT CLICK
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    @Test
    public void klikanie2()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("test-url");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement targetWebElement = driver.findElement(By.xpath("//a/i[contains(text(),'Job')]"));
        action.click(targetWebElement).build().perform();

        //podwojne klikniecie
        action.doubleClick(targetWebElement).build().perform(); // Double click on webElement
        action.doubleClick().build().perform();                 // Double click on current mouse point
    }

    @Test
    public void kliknieITrzymaj_Zlap()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("test-url");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement targetWebElement = driver.findElement(By.xpath("//a/i[contains(text(),'Job')]"));
        action.clickAndHold(targetWebElement).build().perform();
        action.clickAndHold().build().perform();
    }

    @Test
    public void zwalnianiePrzyciskuMyszy()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("test-url");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement targetWebElement = driver.findElement(By.xpath("//a/i[contains(text(),'Job')]"));
        action.release(targetWebElement).build().perform();
        action.clickAndHold().build().perform();
    }
}
