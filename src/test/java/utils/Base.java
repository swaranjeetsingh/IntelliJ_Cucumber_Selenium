package utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public Properties properties;
    public BrowserFactory browserFactory ;
    public ExtentReports extent;
    public static ExtentTest featureLog;
    public static ExtentTest scenarioLog;
}
