package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	WebDriver driver;
	By login_username=By.id("loginusername");
	By login_password=By.id("loginpassword");
	By login=By.id("login2");
	By login_btn=By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	public void launching_chrome() { 
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\BLTuser.BLT1221\\Desktop\\desk 2\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void product_store() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());	
	}
	
	public void login_username_password(String user,String pass) throws InterruptedException 
	{
		driver.findElement(login).click();
		Thread.sleep(3000);
		driver.findElement(login_username).sendKeys(user);
		Thread.sleep(3000);
		driver.findElement(login_password).sendKeys(pass); 
		Thread.sleep(3000);
		driver.findElement(login_btn).click();	  	
		}
	public void alert_handling()
	{
		Alert a = driver.switchTo().alert();		
		a.accept();
	}
	public void logout () throws Throwable 
	{
	 driver.findElement(By.id("logout2")).click();
	}
	public void quitt()
	{
		driver.close();
	}
	}
