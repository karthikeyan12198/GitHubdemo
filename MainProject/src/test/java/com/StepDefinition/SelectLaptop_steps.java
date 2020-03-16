package com.StepDefinition;

import com.Pages.SelectLaptop;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectLaptop_steps {
	SelectLaptop sl=new SelectLaptop();
	@Given("^User launched the chrome_browser$")
	public void user_launched_the_chrome_browser() throws Throwable {
	   sl.launching_chrome();
	}

	@When("^User opens Product store homepage$")
	public void user_opens_Product_store_homepage() throws Throwable {
	  sl.product_store();
	}

	@Then("^User clicks laptop tab$")
	public void user_clicks_laptop_tab() throws Throwable {
	 sl.laptop();
	}

	@Then("^User selects a laptop and gets price of specific laptop$")
	public void user_selects_a_laptop_and_gets_price_of_specific_laptop() throws Throwable {
	 
		Thread.sleep(3000);sl.value();
	 sl.quitapp();
	}


}
