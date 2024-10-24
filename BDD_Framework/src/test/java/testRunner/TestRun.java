package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\User\\eclipse-workspace_1\\BDD_Framework\\Features\\Login.feature",
		glue = {"stepDefinition"},
		dryRun = false,
		monochrome = true,
		tags = "@Regression or @Smoke",
		plugin = {"pretty","html:target/Reports/BDD_Report.html"}
		)



public class TestRun {

}
