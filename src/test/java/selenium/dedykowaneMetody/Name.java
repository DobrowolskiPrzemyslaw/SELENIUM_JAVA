package selenium.dedykowaneMetody;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import selenium.DriverManager;
import selenium.baseTests.BaseTest;

public class Name extends BaseTest {
    WebDriver driver;
    @Test
    public void class_(){
        driver = DriverManager.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.name("topSecret"));                                   // <input name="topSecret"></input>
    }
}