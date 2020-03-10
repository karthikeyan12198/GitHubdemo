package com.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.baseclass;
import com.exel_utiliti.excel_data;
import com.pages.account_page;
import com.pages.login_page;

public class account_case extends baseclass {
	@BeforeClass
	public void startUp() {
		
		launchapp("chrome","https://www.amazon.in/");
		
		
	}
	@Test
	public void account_method() throws IOException
	{        
	        
	      account_page account=new account_page(driver);  
	      account.move();
	      screenshot("C:\\Users\\BLTuser.BLT0206\\Desktop\\jav\\test_framework\\src\\test\\resources\\Screenshot\\account.png");
	         
	}
	
	@AfterClass
	public void close() {
		
		quit();
}
}
