package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadIEDriver_Page
{

	WebDriver driver;
	
	By downloads = By.xpath("//*[@id=\"navbar\"]/a[1]"); //Click on Downloads
	By bit = By.xpath("/html/body/div[2]/div[2]/p/a[2]"); //Click on 64 bit IE
	
	public DownloadIEDriver_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clicks()
	{
		driver.findElement(downloads).click();
		driver.findElement(bit).click();
	}
	
	
	
}
