package Testngdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

public class Junittestcase {
	@Test
	public void tesCase1() {
		System.out.println("test case 1");
	}
	@Test
	public void tesCase2() {
		System.out.println("Test case 2");
	}
	@Test
	public void tesCase3() {
		System.out.println("Test case 3");
	}
@Before
public void beforeMethod() {
	System.out.println("Before method");
	
}
@After
public void afterMethod() {
	System.out.println("After method");
}
@BeforeClass
public static void setUpforClass() {
	System.out.println("before class");
}
@AfterClass
public static void setUpforClassafter() {
	System.out.println("after class");
}

}
