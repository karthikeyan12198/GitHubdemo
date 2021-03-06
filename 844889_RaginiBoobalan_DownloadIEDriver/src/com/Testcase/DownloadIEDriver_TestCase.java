package com.Testcase;


import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.WrapperClass;
import com.Pages.DownloadIEDriver_Page;

public class DownloadIEDriver_TestCase extends WrapperClass
{
	
	@BeforeClass
	public void startup()
	{
		//Navigate to selenium.dev site
		launch("chrome","https://www.selenium.dev/downloads/");
	}
	
	@Test
	public void testcase()
	{
		DownloadIEDriver_Page page = new DownloadIEDriver_Page(driver);
		page.clicks();
	}
	
	@Test
	public void assertGet()
	{
			
		File file = new File("C:\\\\Users\\\\BLTuser.BLT1217\\\\Downloads\\\\IEDriverServer_x64_3.150.1.zip");
		boolean check = file.exists(); 
		if(check)//Check download file exists
		System.out.println("File Exists");
		//On check = true test will be passed
		//On check = false test will be failed with assert message as "Not
		Assert.assertTrue(check);
	}
	
	
	@AfterClass
	public void close() throws IOException
	{
		screenshot("C:\\Users\\BLTuser.BLT1217\\eclipse-workspace\\T_Seleniumhq\\Screenshott\\Oldtest.png");
		quit();
	}

}
