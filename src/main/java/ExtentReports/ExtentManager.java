package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("A101_FinalCase_Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Test Environment", "http://www.hepsiburada.com/");
        extentReports.setSystemInfo("Automation Tester", "Mehmet AKBAYIR");
        return extentReports;
    }



}
