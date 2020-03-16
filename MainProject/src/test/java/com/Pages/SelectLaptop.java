package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectLaptop {
	WebDriver driver;
	By click_laptop=By.linkText("Laptops");
	By link=By.linkText("MacBook air");
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
	public void laptop() {
		driver.findElement(click_laptop).click();
		driver.findElement(link).click();
		
	}
	public void value() {
		String price=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3")).getText();
		System.out.println(price);
	}
	public void quitapp() {
		driver.close();
	}
}
