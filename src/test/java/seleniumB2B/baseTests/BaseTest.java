package seleniumB2B.baseTests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import framework.selenium.base.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentReports extentReporters;

    @BeforeSuite
    public void beforeSuite(){
        htmlReporter = new ExtentHtmlReporter("src/main/resources/reports/index.html");
        extentReporters = new ExtentReports();
        extentReporters.attachReporter(htmlReporter);
    }

    @AfterSuite
    public void afterSuite(){
        htmlReporter.flush();
        extentReporters.flush();
    }

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
