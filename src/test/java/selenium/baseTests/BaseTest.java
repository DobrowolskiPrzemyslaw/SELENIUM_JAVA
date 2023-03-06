package selenium.baseTests;

import selenium.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.createInstance("chrome");
        WebDriver driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.getDriver().quit();
    }
}
