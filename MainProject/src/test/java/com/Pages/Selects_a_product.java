package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selects_a_product {
	WebDriver driver;
	By next=By.id("next2");
	By product=By.linkText("Apple monitor 24");
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
	public void click_next() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(next).click();
	}
	public void select_product() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(product).click();
	}
	public void quit()
	{
		driver.close();
	}
}
