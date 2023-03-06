package selenium.najlepsze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import selenium.DriverManager;
import selenium.baseTests.BaseTest;

public class ClassName extends BaseTest {
    WebDriver driver;

    @Test
    public void class_(){
        driver = DriverManager.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.className("topSecret"));                             // <input class="topSecret"></input>
    }
}