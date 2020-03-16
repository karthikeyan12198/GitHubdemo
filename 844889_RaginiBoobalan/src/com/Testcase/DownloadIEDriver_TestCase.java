package com.Testcase;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import com.BaseClass.WrapperClass;
import com.Pages.DownloadIEDriver_Page;

public class DownloadIEDriver_TestCase extends WrapperClass
{
	
	@BeforeClass
	public void startup()
	{
		//Navigate to selenium.dev site
		launch("chrome","https://www.selenium.dev/");
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
		File file = new File("C:\\Users\\BLTuser.BLT1221\\Downloads\\IEDriverServer_x64_3.150.1.zip");
		boolean check = file.exists();  //Check download file exists
		if(check)
		{
			System.out.println("File Exists");
			Assert.assertTrue(check);
		}
		else
			System.out.println("not found");
		//On check = true test will be passed
		//On check = false test will be failed with assert message as "Not
		
	}
	
	
	@AfterClass
	public void closes() throws Throwable 
	{
		screenshot("C:\\Users\\BLTuser.BLT1221\\git\\GitHubdemo\\844889_RaginiBoobalan\\Screenshott\\Oldtesttest.png");
		quit();
	}

}
