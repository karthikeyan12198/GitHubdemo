package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Description {
	WebDriver driver;

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
	public void getDescription() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a")).click();
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2")).getText();
	    System.out.println("Product description");
	    String s2=driver.findElement(By.xpath("//*[@id=\"more-information\"]/p")).getText();
	    System.out.println(s);
	   // System.out.println(s1);
	    
	    System.out.println(s2);
	}
	public void exitBrowser() {
		driver.close();
	}
}
