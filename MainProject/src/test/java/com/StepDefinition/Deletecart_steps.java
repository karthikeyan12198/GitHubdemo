package com.StepDefinition;

import com.Pages.Deletecart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Deletecart_steps {
	Deletecart dc=new Deletecart();
	@Given("^user launched the Chrome_browser$")
	public void user_launched_the_Chrome_browser()  {
		dc.launching_chrome();
	   
	}

	@When("^user opens Product store homepage$")
	public void user_opens_Product_store_homepage()  {
	  dc.product_store();
	}

	@Then("^user clicks cart$")
	public void user_clicks_cart() throws Throwable  {
	  dc.cart();
	}

	@Then("^delete the product in cart$")
	public void delete_the_product_in_cart() throws InterruptedException  {
	 dc.delete();
	 dc.exitap();
	 
	}

}
