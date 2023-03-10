package helper;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.raports.ExtentReportsManger;

public class ListenersTest implements ITestListener, ISuiteListener {

    @Override
    public void onTestStart(final ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        String descriptions = result.getMethod().getDescription();
        System.out.println("Wystartowal test: " + methodName + "z opisem " + descriptions);
        String pathRaports = "/src/main/resources/reports/index.html";
        ExtentReportsManger.getExtentHtmlReporter(pathRaports);
        ExtentReports extentReporters = ExtentReportsManger.getExtentReports(pathRaports);
        ExtentTest test = extentReporters.createTest("Wyszukiwanie hotelu test");
    }

    @Override
    public void onTestSuccess(final ITestResult result) {
        System.out.println("Test zakonczyl sie sukcesem");
    }

    @Override
    public void onTestFailure(final ITestResult result) {
        System.out.println("Test zakonczyl sie porazka");
    }

    @Override
    public void onTestSkipped(final ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(final ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(final ITestResult result) {

    }

    @Override
    public void onStart(final ITestContext context) {
        String suiteName = context.getName().replace(" ", "");
        System.out.println("Wystartowalismy suitName: " + suiteName);
    }

    @Override
    public void onFinish(final ITestContext context) {
        System.out.println("Zakonczylismy suitName: " + context);
    }
}
