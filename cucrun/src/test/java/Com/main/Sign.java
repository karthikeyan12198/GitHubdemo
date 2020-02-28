package Com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign {
	WebDriver driver;
	WebElement textbox;

	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.get("https://google.com");
//		System.out.println(driver.getTitle());

	}
	public void google_homepage()
	{
		driver.get("https://in.linkedin.com/");
		System.out.println(driver.getTitle());
	}

	public void verify() {
		driver.findElement(By.xpath("/html/body/nav/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"email-or-phone\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("2345");
		driver.findElement(By.xpath("//*[@id=\"join-form-submit\"]")).click();
		}


	

}
