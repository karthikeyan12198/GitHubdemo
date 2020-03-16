package com.StepDefinition;


import com.Pages.Login;

import Excel_utility.excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_steps {
Login log=new Login();
excel ex=new excel();
@Given("^user launched the chrome browser$")
public void user_launched_the_chrome_browser()  {
   log.launching_chrome();
}

@When("^user opens product store  homepage$")
public void user_opens_product_store_homepage()  {
   log.product_store();
}

@Then("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable  {
	
		Thread.sleep(3000);
		log.login_username_password(ex.excel_username(1),ex.excel_password(1));
		Thread.sleep(3000);
		log.logout();
		Thread.sleep(3000);
		log.quitt();
		int count=ex.row_count();
		for(int i=2;i<=count;i++)
		{
			log.launching_chrome();
			log.product_store();
			log.login_username_password(ex.excel_username(i),ex.excel_password(i));
			Thread.sleep(3000);
			log.alert_handling();
			if (i==2) {
			log.quitt();
		}
 }
   
}

@Then("^user clicks login$")
public void user_clicks_login() throws Throwable  {
	 log.quitt();
}

}
