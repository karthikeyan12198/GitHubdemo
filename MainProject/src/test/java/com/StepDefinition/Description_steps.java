package com.StepDefinition;

import com.Pages.Description;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Description_steps {
	Description des=new Description();
	@Given("^The User launched the Chrome_browser$")
	public void the_User_launched_the_Chrome_browser() throws Throwable {
	   des.launching_chrome();
	}

	@When("^The User opens product Store homepage$")
	public void the_User_opens_product_Store_homepage() throws Throwable {
	   des.product_store();
	}

	@Then("^User gets the description of the specific product$")
	public void user_gets_the_description_of_the_specific_product() throws Throwable {
	   des.getDescription();
	   
	}


}
