package base;

import driver.DriverManager;
import driver.WebBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest  {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        DriverManager.createInstance(WebBrowser.CHROME);
        driver = DriverManager.getWebDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
