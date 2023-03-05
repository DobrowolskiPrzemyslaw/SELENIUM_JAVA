package seleniumZbiorWiedzy.report;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.*;

public class ReportTest extends BaseReportTest {

    @Test
    public void test(){
        ExtentTest test = extentReporters.createTest("Wyszukiwanie hotelu test");
        test.log(Status.PASS, "Otwarcie strony z hotelami");
        test.log(Status.PASS, "Udalo sie wyszukac hotel");
        test.log(Status.PASS, "Zamkniecie strony z hotelami");
    }
}
