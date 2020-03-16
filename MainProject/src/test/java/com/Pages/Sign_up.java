package com.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sign_up {
	WebDriver driver;
	By username=By.id("sign-username");
	By password=By.id("sign-password");
	By sign_up=By.id("signin2");
	By signup_btn=By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
	
	public void url() { 
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\BLTuser.BLT1221\\Desktop\\desk 2\\New/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void HomePage() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
	}
	
	public void username_password() throws InterruptedException 
	{
		driver.findElement(sign_up).click();
		Thread.sleep(3000);
		driver.findElement(username).sendKeys("mathumitha");
		Thread.sleep(3000);
		driver.findElement(password).sendKeys("12345678"); 
		}
	public void sign_up () throws Throwable 
	{
		driver.findElement(signup_btn).click(); 
	}
	public void quit()
	{
		driver.close(); 
	}
	}

