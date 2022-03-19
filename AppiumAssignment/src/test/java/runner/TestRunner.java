package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		//features location
		features = "./src/test/java/features",
		//steps for features
		glue = "stepdefinitions",
		//tags use in testing
		tags = {"@smoke"},
		//plugin for reporting
		plugin = {"json:target/cucumber.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
