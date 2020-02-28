package Com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/Test.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01"},
		glue = {"StepsEx"},
		monochrome = true
		)

public class Login {

}
