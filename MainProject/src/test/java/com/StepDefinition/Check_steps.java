package com.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.Check;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Check_steps {
	WebDriver driver;
	Check phno=new Check();
	@Given("^The User launched the Chrome_Browser$")
	public void the_User_launched_the_Chrome_Browser() throws Throwable {
		phno.launching_chrome();
	}

	@When("^User opens product Store homepage$")
	public void user_opens_product_Store_homepage() throws Throwable {
	   phno.product_store();
	}

	@Then("^User checks if the number is valid\\.$")
	public void user_checks_if_the_number_is_valid() throws Throwable {
		String ab=phno.check();
		String phone_number="440 123456";
		Assert.assertEquals(phone_number,ab);
		System.out.println("Valid");
		  phno.exitApplication();
	}


}
