package training;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
	//maximize the screen
		//driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("chennai");
//driver.findElement(By.className("db")).sendKeys("Puducherry");
driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Puducherry");
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]//table//tbody//tr[6]//td[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[7]/td[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
	}

}
