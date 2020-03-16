package com.StepDefinition;

import com.Pages.Two_product;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Two_product_steps {
	Two_product tw=new Two_product();
	@Given("^The User launch the Chrome_browser$")
	public void the_User_launch_the_Chrome_browser() throws Throwable {
	    tw.launchapp();
	}

	@When("^The User open product Store homepage$")
	public void the_User_open_product_Store_homepage() throws Throwable {
	 tw.productStore();
	}

	@Then("^user need to add more than one products in cart$")
	public void user_need_to_add_more_than_one_products_in_cart() throws Throwable {
	   tw.clickOne();
	   tw.clickagain();
	   tw.closeBrowser();
	}

}
