package Testngdemo;

import java.sql.DriverManager;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class WindowHandling {
@Test
public void irtclogin() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.irctc.co.in/nget/train-search");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[5]")).click();
	 Set<String>WinHandles=driver.getWindowHandles();
	 System.out.println("the number of window handles are "+WinHandles.size());
	 for(String winHandle:WinHandles) {
	 driver.switchTo().window(winHandle);
	 }
	 String title=driver.getTitle();
	 System.out.println("the page title is");
	 driver.close();
	 
}

}
