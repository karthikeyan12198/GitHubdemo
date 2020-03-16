package com.StepDefinition;

import com.Pages.Selects_a_product;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Product_steps {
	Selects_a_product pro=new Selects_a_product();
	@Given("^user launched the Chrome_Browser$")
	public void user_launched_the_Chrome_Browser() throws Throwable {
	   pro.launching_chrome();
	}

	@When("^user opens Product Store  Homepage$")
	public void user_opens_Product_Store_Homepage() throws Throwable {
	   pro.product_store();
	}

	@Then("^user clicks next$")
	public void user_clicks_next() throws Throwable {
	    pro.click_next();
	}

	@Then("^user selects product$")
	public void user_selects_product() throws Throwable {
	   pro.select_product();
	   pro.quit();
	}
}
