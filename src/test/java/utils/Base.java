package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Logger logger;
    public Properties properties;
    public CaptureScreenShot captureScreenShot;

    public WebDriver setBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/drivers/chromedriver");
            driver = new ChromeDriver();
            System.out.println(browserName);
        }
        else if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/src/test/drivers/geckodriver");
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
