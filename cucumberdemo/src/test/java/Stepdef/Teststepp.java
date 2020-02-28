package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teststepp {
	WebDriver driver;
	@Given("^we launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(5000);
	}
	@When("^I open linkedin page$")
	public void open_homepage() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.get("https://in.linkedin.com/");
	}
	@Then("^enter username and password in fields$")
	public void verify_textbox()           
	{
	driver.findElement(By.xpath("/html/body/nav/section[2]/form/div[1]/div[1]/input")).sendKeys("9566567030");
	driver.findElement(By.xpath("/html/body/nav/section[2]/form/div[1]/div[2]/input")).sendKeys("Karthikeyan@12198");
	

	
	}
	@And("^clicks the submit button$")
	public void display_searchbutton()
	{
		
driver.findElement(By.xpath("/html/body/nav/section[2]/form/div[2]/button")).click();
	System.out.println("The page displays Google Search Button");

	}

}
