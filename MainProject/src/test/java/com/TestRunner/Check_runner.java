package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Scenario.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@Tc08_To_check_phone_number"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)

public class Check_runner {

}
