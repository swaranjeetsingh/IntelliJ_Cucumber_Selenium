package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/features/account.feature",
				strict = true,
				dryRun = true,
				monochrome = true,
				glue = "stepsDefinitions",
				plugin = {"pretty", "html:reports"},
				tags = "@execute")
public class testRunner {
}
