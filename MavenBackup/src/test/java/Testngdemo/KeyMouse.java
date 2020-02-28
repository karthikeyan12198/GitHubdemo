package Testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyMouse {
@Test
public void key() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/login");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Karthikeyan");
	driver.findElement(By.id("password")).sendKeys("Hello");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.TAB).perform();
	action.sendKeys(Keys.ENTER).perform();
	
}
}
