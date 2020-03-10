package com.Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.baseclass;
import com.pages.account_page;
import com.pages.search_page;

@Test
public class search_case extends baseclass{
	@BeforeClass
	public void startUp() {
		
		launchapp("chrome","https://www.amazon.in/");
		
		
	}
	public void search_method() throws IOException, InterruptedException
	{        
	        
	      search_page search=new search_page(driver);
	      search.movedown("mobile");
	      
	      
	         
	}
	
	@AfterClass
	public void close() {
		
		quit();
}
}
