package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperClass 
{

	protected WebDriver driver;
	public void launch(String browser, String url) 
	{	
	try 
	{
	
		if (browser.equalsIgnoreCase("firefox")) 
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\BLTuser.BLT1217\\eclipse-workspace\\T_Seleniumhq\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		
		
		else if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		//To maximise the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	} 
	
	catch (WebDriverException e)
	{
		System.out.println("Browser could not be launched");
	}
}
	
	//To take Screenshot 
	public void screenshot(String path1) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path1));
	}

	//To close the browser
	public void quit()
	{	 
	driver.close();	//Close the current tab
	}
}
