package Testngdemo;

import org.testng.annotations.Test;

public class Dependsongroup {
	@Test(groups= {"functional testing","retesting testing"})
	public void testcase1() {
		System.out.println("Testcase1");
		
	}
	@Test(groups= {"functional testing","smoke testing"})
	public void testcase2() {
		System.out.println("Test case 2");
	}
	@Test(groups= {"regression testing","smoke testing"})
	public void testcase3() {
		System.out.println("Testcase3");
	}

}
