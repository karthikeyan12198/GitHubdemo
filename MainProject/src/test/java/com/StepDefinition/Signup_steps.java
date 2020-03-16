package com.StepDefinition;

import com.Pages.Sign_up;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup_steps {
	Sign_up sign=new Sign_up();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
	    sign.url();
	}

	@When("^the user opens product store  homepage$")
	public void the_user_opens_product_store_homepage() throws Throwable {
	    sign.HomePage();
	}

	@Then("^the user enters username and password$")
	public void the_user_enters_username_and_password() throws Throwable {
	 sign.username_password();
	}

	@Then("^the user clicks signup$")
	public void the_user_clicks_signup() throws Throwable {
	  sign.sign_up();
	  
	}

	@Then("^the user close the application$")
	public void the_user_close_the_application() throws Throwable {
		  sign.quit();
	}



}
