package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class account_page {
	WebDriver driver;
	
	public account_page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void move()
	{
		WebElement a=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
	WebElement b=driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span"));
		Actions d=new Actions(driver);
		d.moveToElement(a);
		d.moveToElement(b).click().build().perform();
	}
}
