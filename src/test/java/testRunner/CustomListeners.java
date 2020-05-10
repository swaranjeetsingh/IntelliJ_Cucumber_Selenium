package testRunner;

import com.aventstack.extentreports.gherkin.model.Feature;
import cucumber.api.Scenario;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.Base;
import utils.ExtentReportUtils;

import java.io.IOException;

public class CustomListeners  implements ITestListener {

    ExtentReportUtils extentReportUtils = new ExtentReportUtils();
    Scenario scenario;

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("This is on test start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("This is on test success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("This is on test failure");
        try {
            extentReportUtils.takeScreenShot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("This is on test skipped");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("This is on percentage");

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("This is on test failure with timeout");

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("This is on start");
        extentReportUtils.extentReportMethod();
        extentReportUtils.featureLog = extentReportUtils.extent.createTest(Feature.class, "Account_Feature");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("This is on finish");
        extentReportUtils.flushReport();
    }
}
