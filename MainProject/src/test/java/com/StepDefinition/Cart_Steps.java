package com.StepDefinition;

import com.Pages.Add_To_Cart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cart_Steps {
	 Add_To_Cart log =new  Add_To_Cart();
	@Given("^user launched the chrome Browser$")
	public void user_launched_the_chrome_Browser() throws Throwable {
	    log.launching_chrome();
	}

	@When("^user opens product store  Homepage$")
	public void user_opens_product_store_Homepage() throws Throwable {
	   log.product_store();
	}

	@Then("^user clicks on product and add to cart$")
	public void user_clicks_on_product_and_add_to_cart() throws Throwable {
	    log.cart();
	    log.quit();
	}



}
