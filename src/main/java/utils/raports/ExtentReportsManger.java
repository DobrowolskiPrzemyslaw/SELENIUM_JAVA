package utils.raports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsManger {
    private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extentReporters;

    public static ExtentReports getExtentReports() {
        getExtentHtmlReporter("//src//main//resources//reports//index.html");
        extentReporters = new ExtentReports();
        extentReporters.attachReporter(htmlReporter);
        return extentReporters;
    }

    public static ExtentHtmlReporter getExtentHtmlReporter (String filePath) {
        htmlReporter = new ExtentHtmlReporter(filePath);
        return htmlReporter;
    }
}
