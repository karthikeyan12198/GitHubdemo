package com.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Scenario.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@Tc01_SignUp"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)

public class SelectLaptop_runner {

}
