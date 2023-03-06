package przyklady.report;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReportTestZScreenShotem extends BaseReportTest {

    @Test
    public void test() throws IOException {
        ExtentTest test = extentReporters.createTest("Wyszukiwanie hotelu test");
        test.log(Status.PASS, "Otwarcie strony z hotelami");
        test.log(Status.PASS, "Udalo sie wyszukac hotel");
        test.log(Status.PASS, "Zamkniecie strony z hotelami");
        test.log(Status.PASS, "Screenshot", MediaEntityBuilder.createScreenCaptureFromPath("src/test/resources/screenshot.png").build());
    }
}
