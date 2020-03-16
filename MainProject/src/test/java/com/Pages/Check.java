package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
	WebDriver driver;

	By number=By.xpath("//*[@id=\"fotcont\"]/div[2]/div/div/p[2]");
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
	public String check() {
		String a=driver.findElement(number).getText();
		String no=a.substring(8, 18);
		//int phno=Integer.parseInt(no);
		return no;
	}
	
	public void exitApplication() {
		driver.close();
	}
	
}
