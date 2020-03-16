package step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.google_jar;


public class google_steps {
	google_jar google = new google_jar();

	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() {
		google.url();
	}
	@When("^the user opens google homepage$")
	public void the_user_opens_google_homepage() throws InterruptedException {
		google.google_homepage();
	}

	@Then("^verify textbox$")
	public void verify_textbox() throws InterruptedException {
		google.verify();
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() {
		google.submit();

	}

}
