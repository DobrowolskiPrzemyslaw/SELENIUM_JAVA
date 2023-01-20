package helper;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener {

    @Override
    public void onTestStart(final ITestResult result) {
        System.out.println("Wystartowal test");
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

    }

    @Override
    public void onFinish(final ITestContext context) {

    }
}
