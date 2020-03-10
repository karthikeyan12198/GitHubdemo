package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class login_page {
	WebDriver driver;
	
	
	By signin_button =By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]");
	By username =By.xpath("//*[@id=\"ap_email\"]");
	By password =By.xpath("//*[@id=\"ap_password\"]");
	
	 
	
	public login_page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public void click_signin()
	{
		driver.findElement(signin_button).click();
		
		}
public void login(String user,String pass) {
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		}

	
}
