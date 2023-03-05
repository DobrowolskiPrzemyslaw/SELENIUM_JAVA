package seleniumZbiorWiedzy.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = {ListenersTest.class})
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

    @Test
    public void test(){
        System.out.println("To jest Test");
    }

    @Test
    public void test2(){
        System.out.println("To jest Test2");
    }

    @Test
    public void test3(){
        System.out.println("To jest Test3");
    }
}
