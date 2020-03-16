package Com.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelUtility.Excel_code;

public class Login_datamain {
	 WebDriver driver;
	 Excel_code ec=new Excel_code();
	 By signup = By.id("signin2");
		By username =By.xpath("//*[@id=\"sign-username\"]");
		By password = By.id("sign-password");
		By signclick =By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
	//TO launch Chrome
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	//To ente URL
	public void url()
	{
		driver.get("https://www.demoblaze.com/");
	}
	public void loginset(int a) throws IOException  {
		
		
		driver.findElement(signup).click();
		driver.findElement(username).sendKeys(ec.excel_username(a));
		driver.findElement(password).sendKeys(ec.excel_password(a));
		driver.findElement(signclick).click();
		
		
		
		
	
	}
	
	
//	TO take screenshot
	public void screenshot(String path) throws IOException {
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(source, new File(path));
	
	}
	
	//TO close the browser
   public void quit(){
		
	
		driver.close();
   }

}
