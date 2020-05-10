package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ExtentReportUtils extends Base{

    String timeStamp = new SimpleDateFormat("YYYY-mm-DD-HH-MM-SS").format(new Date());
    public void extentReportMethod(){
        extent = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/extent_reports/report"+ timeStamp +".html");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("Cucumber Test Report");
        htmlReporter.config().setReportName("Automation Test");

        extent.attachReporter(htmlReporter);
    }

    public void takeScreenShot(String name) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/extent_reports/" + timeStamp +name + ".png";
        File destinationFolder = new File(destination);
        scenarioLog.fail("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(destination).build());
        FileUtils.copyFile(srcFile, destinationFolder);
    }

    public void flushReport(){
        extent.flush();
    }
}
