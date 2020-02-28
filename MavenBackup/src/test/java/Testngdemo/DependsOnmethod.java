package Testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnmethod {

	@Test
	public void login() {
		System.out.println("Login to app");
	}
	@Test(dependsOnMethods= {"login"})
	public void search() {
		System.out.println("searching app");
		Assert.assertEquals("abc", "ysz");
		
	}
	@Test(dependsOnMethods= {"search"},alwaysRun=true)
	public void logout() {
		System.out.println("Logout to app");
		
	}
}
