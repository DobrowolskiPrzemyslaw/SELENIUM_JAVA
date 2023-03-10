package przyklady.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.raports.ExtentReportsManger;

public class BaseReportTest {
    protected WebDriver driver;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentReports extentReporters;

    @BeforeSuite
    public void beforeSuite(){
        htmlReporter = ExtentReportsManger.getExtentHtmlReporter("//src//main//resources//reports//index.html");
        extentReporters = ExtentReportsManger.getExtentReports();
        extentReporters.attachReporter(htmlReporter);
    }
    @AfterSuite
    public void afterSuite(){
        htmlReporter.flush();
        extentReporters.flush();
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("            Jestem w BeforeMethod - wykonam się przed każdym testem w danej klasie");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("            Jestem w AfterMethod - wykonam się po każdym testes w danej klasie");
    }
}
