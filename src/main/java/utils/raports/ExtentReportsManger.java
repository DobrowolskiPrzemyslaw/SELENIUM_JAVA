package utils.raports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsManger {
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentReports extentReporters;

    public static ExtentReports getExtentReports(String filePath) {
        getExtentHtmlReporter(filePath);
        extentReporters = new ExtentReports();
        extentReporters.attachReporter(htmlReporter);
        return extentReporters;
    }

    public static ExtentHtmlReporter getExtentHtmlReporter (String filePath) {
        htmlReporter = new ExtentHtmlReporter(filePath);
        return htmlReporter;
    }
}
