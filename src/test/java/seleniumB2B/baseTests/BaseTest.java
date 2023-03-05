package seleniumB2B.baseTests;

import seleniumB2B.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.createInstance("chrome");
        WebDriver driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://simpletheme.myshopify.com/");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.getDriver().quit();
    }
}
