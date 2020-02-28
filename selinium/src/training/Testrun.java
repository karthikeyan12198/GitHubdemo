package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
	       WebDriver  driver = new ChromeDriver();
	       driver.get("https://in.linkedin.com/");
	       driver.manage().window().maximize();
	       driver.findElement((By.id("username"))).sendKeys("un");
	       driver.findElement((By.id("password"))).sendKeys("pwd");
	       driver.findElement((By.xpath("/html/body/nav/section[2]/form/div[2]/button"))).click();
	}

}
