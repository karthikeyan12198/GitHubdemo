package Com.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/Demoblaze.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01_Demoblaze_signup"},
		glue = {"Stepdefinition"},
		monochrome = true
		)
public class Login_data {

}
