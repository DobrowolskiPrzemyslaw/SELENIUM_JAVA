package przyklady.dzialanieNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class Scrolling {

    @Test
    public void scrollingMyszy()
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
        // MIDDLE WHEEL CLICK
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);

        // SCROLL THE MOUSE WHEEL
        robot.mouseWheel(100);  // wartosc dodatnia do przesuwania w dol
        robot.mouseWheel(-100);  // wartosc ujemna do przesuwania w gore
    }
}
