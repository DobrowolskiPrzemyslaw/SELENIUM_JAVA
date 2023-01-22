package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import driver.DriverManager;
import driver.WebBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest  {
    public WebDriver driver;
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
