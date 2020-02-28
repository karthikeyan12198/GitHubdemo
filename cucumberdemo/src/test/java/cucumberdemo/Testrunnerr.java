package cucumberdemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Testrunnerr {
	/// I AM RUNNING WITH CUCUMBER CLASS
			@RunWith(Cucumber.class)
			@CucumberOptions(features="feature/testcases11.feature", glue="cucumberdemo")
			public class Testrunner_googlehomepage
			{
			}

	}

