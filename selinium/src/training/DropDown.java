package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//time wait args=3; time unit timeunit.second
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//select day using xpath create day object to call method 
		Select day=new Select(driver.findElement(By.xpath("//*[@id=\'day\']")));
		day.selectByIndex(12);

	   //select month using xpath create month object to call method 
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		month.selectByIndex(1);
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//select year using xpath create year object to call method 
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		year.selectByValue("1998");
		driver.findElement(By.id("u_0_7")).click();
	
	}

}
