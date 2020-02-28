package Testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void testcase1() {
	  System.out.println("testcase1");
  }
 
	  @Test
	  public void testcase2() {
		  System.out.println("testcase2");
	  }
	  
		  @Test
		  public void testcase3() {
			  System.out.println("testcase3");
		  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
  System.out.println("before class:prepare test data");
  }

  @AfterClass
  public void afterClass() {
  System.out.println("after class:clear test data");
  
  }

  @BeforeTest
  public void beforeTest() {
  System.out.println("before test:open db connection");
  }

  @AfterTest
  public void afterTest() {
  System.out.println("after test:close db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
  System.out.println("before suite:smoke testing");
  }

  @AfterSuite
  public void afterSuite() {
  System.out.println("after suite:generate report");
  }

}
