package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import driver.DriverManager;
import driver.WebBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import methods.WebDriverWithMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest  {
    public WebDriver driver;
    public WebDriverWithMethods webDriverWithMethods;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentReports extentReporters;

    @BeforeSuite
    public void beforeSuite(){
        htmlReporter = new ExtentHtmlReporter("src//main//resources//raports//raportTest.html");
        extentReporters = new ExtentReports();
        extentReporters.attachReporter(htmlReporter);
    }

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        DriverManager.createInstance(WebBrowser.CHROME);
        driver = DriverManager.getWebDriver();
        driver.manage().window().maximize();
        webDriverWithMethods = new WebDriverWithMethods();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @AfterSuite
    public void afterSuite(){
        htmlReporter.flush();
        extentReporters.flush();
    }
}
