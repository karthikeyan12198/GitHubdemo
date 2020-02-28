package training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class firefoxlogin {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.linkedin.com");
		
		//driver.findElement(By.className("nav__button-secondary")).click();
		
				//driver.findElement(By.id("username")).sendKeys("yogeyogesh9355@gmail.com");
				//driver.findElement(By.id("password")).sendKeys("abcdefgh");
			
			//driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
				
				//driver.findElement(By.partialLinkText("Join")).click();
				
			//driver.close();
		driver.findElement(By.xpath("//*[@class='pill pill--talent-finder-cta']")).click();
		  //relative xpath using and condition
		   driver.findElement(By.xpath("//*[@type='text' and @id='first-name-ember18']")).sendKeys("Karthik");
		 
		   
		  //relative xpath using or condition
		   driver.findElement(By.xpath("//*[@type='tet' or @id='last-name-ember18']")).sendKeys("P");
		   
		   //relative xpath using contains
		   driver.findElement(By.xpath("//*[contains(@id,'email-address-ember18')]")).sendKeys("karthik@gmail.com");
		   
		   //relative xpath using starts-with
		   driver.findElement(By.xpath("//*[starts-with(@id,'password-ember18')]")).sendKeys("Karthikeyan@12198");
		   TakesScreenshot ts=((TakesScreenshot)driver);
			File source=ts.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(source, new File("C:\\Users\\BLTuser.BLT1221\\Desktop\\output\\karthisec.png"));
		   
		
	}

}