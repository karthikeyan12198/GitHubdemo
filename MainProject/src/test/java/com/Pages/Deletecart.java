package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletecart {
	WebDriver driver;
	By product=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
	By Add_cart=By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");
	By Delete_cart=By.linkText("Delete");
	By cart=By.id("cartur");
	public void launching_chrome() { 
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\BLTuser.BLT1221\\Desktop\\desk 2\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	public void product_store() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
	}

	public void cart() throws InterruptedException
	{
		driver.findElement(product).click();
		driver.findElement(Add_cart).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		  a.accept();
		
		
	}
	public void delete() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(cart).click();
		  driver.findElement(Delete_cart).click();
	}
	public void exitap()
	{
		driver.close();
	}
}
