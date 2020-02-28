package Demogradle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstDemo {
@Test
	public void demo() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.irctc.co.in/nget/train-search");
	 driver.manage().window().maximize();

}
}
