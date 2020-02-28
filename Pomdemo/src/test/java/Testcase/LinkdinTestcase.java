package Testcase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import Library.WrapperEx;
import Pages.LinkedinLogin;

public class LinkdinTestcase extends WrapperEx {
	@BeforeClass
	public void startup() {
		launchApplication("chrome", "https://in.linkedin.com/");
		
	}
	@Test
	public void login() {
		LinkedinLogin lpage=new LinkedinLogin(driver);
		lpage.signin();
		lpage.logintoApp_username("Karthikeyan");
		lpage.logintoApp_password("Welcome123");
		lpage.loginApp_loginbutton();
	}
	@AfterClass 
	public void end() {
		quit();
	}

}
