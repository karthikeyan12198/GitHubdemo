package Com.Stepdefinition;
 

import Com.main.Login_datamain;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_data {
	Login_datamain ld=new Login_datamain();
	@Given("^the user launch chrome page$")
	public void the_user_launch_chrome_page() throws Throwable {
ld.launchChrome();
	}

	@When("^the user opens demoblaze homepage$")
	public void the_user_opens_demoblaze_homepage() throws Throwable {
	   ld.url();
	}

	@Then("^the user click signup$")
	public void the_user_click_signup() throws Throwable {
	   for (int i = 1; i < 5; i++) 
		ld.loginset(i);
	}
	@Then("^the user login with three sets of data$")
	public void the_user_login_with_three_sets_of_data() throws Throwable {
	   ld.quit();
	}

}
