package selenium.dedykowaneMetody;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import selenium.DriverManager;

public class Link {
    WebDriver driver;
    @Test
    public void test(){
        driver = DriverManager.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.linkText("Visit W3Schools.com!"));
        driver.findElement(By.partialLinkText("Visit"));
    }
}
