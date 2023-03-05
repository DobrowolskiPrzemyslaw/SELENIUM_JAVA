package seleniumZbiorWiedzy.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseReportTest {
    protected WebDriver driver;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentReports extentReporters;

    @BeforeSuite
    public void beforeSuite(){
        htmlReporter = new ExtentHtmlReporter("index.html"); //inicjalizacja miejsca na raporty
        extentReporters = new ExtentReports();                      //inicjalizacja reportera dla testu
        extentReporters.attachReporter(htmlReporter);               //dodanie raportow do miejsca naraporty
    }
    @AfterSuite
    public void afterSuite(){
        htmlReporter.flush();                                       //zamkniecie dzialanie
        extentReporters.flush();                                    //zamkniecie dzialania
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
