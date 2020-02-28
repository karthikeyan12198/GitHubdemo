package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinLogin {
	WebDriver driver;
	By signin=By.xpath("/html/body/nav/a[3]");
	By username=By.id("username");
	By password=By.id("password");
	By loginbutton=By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
	
	
	public LinkedinLogin(WebDriver driver) {
		
		this.driver = driver;
	}
	public void signin() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://in.linkedin.com/");
	driver.findElement(signin).click();
	}
	public void logintoApp_username(String userid) {
	driver.findElement(username).sendKeys(userid);	
	}
	public void logintoApp_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	
	}
public void loginApp_loginbutton() 

{
driver.findElement(loginbutton).click();	
}
}
