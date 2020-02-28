package StepsEx;


import Com.main.Sign;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signstep {
	Sign s=new Sign();
	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() {
	   s.url();
	    
	}

	@When("^the user clicks join me$")
	public void the_user_clicks_join_me()  {
	   s.google_homepage();
	  
	}

	@Then("^enters values in field$")
	public void enters_values_in_field()  {
	   s.verify();
	    
	}

	@Then("^click the join button$")
	public void click_the_join_button()  {
	 	    
	}


}
