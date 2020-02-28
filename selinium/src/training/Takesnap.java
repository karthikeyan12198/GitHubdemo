package training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Takesnap {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.linkedin.com");
		TakesScreenshot ts=((TakesScreenshot)driver);
			File source=ts.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(source, new File("C:\\Users\\BLTuser.BLT1221\\Desktop\\output\\karthisss.png"));
		
		}
			
		
	}


