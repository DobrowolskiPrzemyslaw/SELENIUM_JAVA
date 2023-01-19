
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import driver.DriverManager;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        DriverManager.createInstance("chrome");
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
//        driver.close();
    }
}
