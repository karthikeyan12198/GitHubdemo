package MavenBackup.MavenBackup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class dataproviderdemo
{
	@Test(dataProvider = "Testdata") 
	public void login(String username, String password) 
	{ 
	 driver.findElement(By.id("email")).sendKeys(username); 
	 driver.findElement(By.id("pass")).sendKeys(password); 
	 driver.close(); 
	 } 
	public ChromeDriver driver; 
	@BeforeMethod 
	public void beforeMethod() 
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	 driver.get("https://www.guru99.com/"); 
	 } 
	@DataProvider (name= "Testdata") 
	public Object[][] getdata()
	{ 
	 Object[][] data = new Object[3][2] ; 
	 data [0][0] = "user1"; 
	 data [0][1] ="password1"; 
	 data [1][0] ="user2"; 
	 data [2][0] ="password1"; 
	 data [2][1] ="user3"; 
	 data [2][1] ="password3"; 
	 
	return data; 
	 
}
}
