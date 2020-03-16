package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {
	WebDriver driver;
	By contact=By.linkText("Contact");
	By email=By.id("recipient-email");
	By contact_name=By.id("recipient-name");
	By contact_message=By.id("message-text");
	By send =By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
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
	public void contact() throws InterruptedException
	{
		driver.findElement(contact).click();
		Thread.sleep(3000);
	}
	public void contact_details(String emailid,String name,String message )
	{
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(contact_name).sendKeys(name);
		driver.findElement(contact_message).sendKeys(message);
	}
	public void send_message() throws InterruptedException
	{
		driver.findElement(send).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		  a.accept();
	}
	public void quit()
	{
		driver.close();
	}

}
