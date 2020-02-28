package StepsEx;

import Com.main.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstep {
	Login l=new Login();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser()  {
		l.url();
		
	   
	   
	}
	@When("^the user click signin$")
	public void the_user_click_signin() {
	   l.google_homepage();
	    
	}
	@Then("^verify username and password$")
	public void verify_username_and_password() {
	   l.verify();
	 	}
	@Then("^click the submit button$")
	public void click_the_submit_button() {
	  l.done();
	   
	}
}
