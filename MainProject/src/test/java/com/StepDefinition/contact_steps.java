package com.StepDefinition;

import com.Pages.contact;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contact_steps {
	contact con=new contact ();
	@Given("^user launched the Chrome Browser$")
	public void user_launched_the_Chrome_Browser() throws Throwable {
	    con.launching_chrome();
	}
	@When("^user opens Product store  Homepage$")
	public void user_opens_Product_store_Homepage() throws Throwable {
	    con.product_store();;
	}

	@Then("^user clicks contact$")
	public void user_clicks_contact() throws Throwable {
	   con.contact();
	}

	@Then("^user enters contact details$")
	public void user_enters_contact_details() throws Throwable {
	    con.contact_details("mmmbady@gmail.com", "sheeba", "hi");
	}

	@Then("^user clicks send message$")
	public void user_clicks_send_message() throws Throwable {
	  con.send_message();
	  con.quit();
	}

}
