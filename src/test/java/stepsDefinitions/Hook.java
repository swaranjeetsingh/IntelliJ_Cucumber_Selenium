package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Base;
import utils.CaptureScreenShot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hook extends Base {
    private Base base;
    public Hook(Base base) {
        this.base = base;
    }

    @Before
    public void setup() throws IOException {
        base.logger = Logger.getLogger("cucumber_framework");
        PropertyConfigurator.configure("log4j.properties");

        FileInputStream fileInputStream = new FileInputStream(
                new File(System.getProperty("user.dir") + "/config.properties"));
        properties = new Properties();
        properties.load(fileInputStream);
        base.driver = setBrowser(properties.getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            captureScreenShot = PageFactory.initElements(driver, CaptureScreenShot.class);
            captureScreenShot.takeScreenShot(scenario.getName());
        }
        try {
            base.driver.quit();
        } catch (Exception e) {
            System.out.println("The exception is :" + e.getMessage());
        }
    }
}
