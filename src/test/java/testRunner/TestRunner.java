package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/features/account.feature",
				glue = "stepsDefinitions",
//				strict = true,
				dryRun = false,
				monochrome = true,
				plugin = {"pretty", "html:reports"},
//				format = {"json:reports/cucumber.json"},
				tags = "@execute")
public class TestRunner extends AbstractTestNGCucumberTests {
	// AbstractTestNGCucumberTests helps in running cucumber test in Testng
}
