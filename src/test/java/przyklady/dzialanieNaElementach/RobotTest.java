package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotTest {

    @Test
    public void wciskanieKlawiszyNaKlawiaturze()  {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();
        try {
            Robot robot = new Robot();
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_Q);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_X);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    @Test
    public void wciskanieEnteraPoWprowadzeniuLoginuIHasla()
    {
        WebDriver driver=new FirefoxDriver();
        Robot robot=null;
        driver.get("test-url");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("xpath-expression")).click();
        driver.findElement(By.xpath("xpath-expression")).sendKeys("username");
        driver.findElement(By.xpath("xpath-expression")).sendKeys("password");
        try {
            robot=new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //Keyboard Activity Using Robot Class
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    @Test
    public void ruszanieMyszka()
    {
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
    public void wciskaniePrawegoLewegoPrzyciskuMyszy()
    {
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
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        // RIGHT CLICK
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    @Test
    public void scrollingMyszy()
    {
        WebDriver driver=new FirefoxDriver();
        Robot robot = null;
        driver.get("test-url");
        driver.manage().window().maximize();
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        // MIDDLE WHEEL CLICK
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);

        // SCROLL THE MOUSE WHEEL
        robot.mouseWheel(100);  // wartosc dodatnia do przesuwania w dol
        robot.mouseWheel(-100);  // wartosc ujemna do przesuwania w gore
    }
}
