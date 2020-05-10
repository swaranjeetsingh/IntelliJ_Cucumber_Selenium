package stepsDefinitions;

//import io.cucumber.java.*;
import cucumber.api.Scenario;
import cucumber.api.java.*;
//import io.cucumber.java.Scenario;
import utils.Base;
import utils.BrowserFactory;

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
    public void setup(Scenario scenario) throws IOException {
        scenarioLog = featureLog.createNode(scenario.getName());
//        base.logger = Logger.getLogger("cucumber_framework");
//        PropertyConfigurator.configure("log4j.properties");

        FileInputStream fileInputStream = new FileInputStream(
                new File(System.getProperty("user.dir") + "/config.properties"));
        properties = new Properties();
        properties.load(fileInputStream);

        base.browserFactory = new BrowserFactory();
        base.driver = base.browserFactory.setBrowser(properties.getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
//        captureScreenShot = PageFactory.initElements(base.driver, CaptureScreenShot.class);
//        if(scenario.isFailed()){
//            captureScreenShot.takeScreenShot(scenario.getName());
////        }
//        try {
//            base.driver.quit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
