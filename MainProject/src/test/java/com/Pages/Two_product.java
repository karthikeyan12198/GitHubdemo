package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two_product {
	WebDriver driver;
	By click_one=By.xpath("//*[@id=\"tbodyid\"]/div[7]/div/div/h4/a");
	By add=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
	By click_two=By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a");
	By addto=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
	
	
	public void launchapp() { 
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\BLTuser.BLT1221\\Desktop\\desk 2\\New/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void productStore() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
	}
	public void clickOne() throws InterruptedException {
		driver.findElement(click_one).click();
		Thread.sleep(3000);
		driver.findElement(add).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();	
		a.accept();
		
		
		
	}
	public void clickagain() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.get("https://www.demoblaze.com/");
		driver.findElement(click_two).click();
		driver.findElement(addto).click();
		Thread.sleep(3000);
		Alert b=driver.switchTo().alert();
		b.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
	}
	public void closeBrowser() {
		driver.close();
	}
	
}
