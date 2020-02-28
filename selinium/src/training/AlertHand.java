package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
		driver.manage().window().maximize();
		//alert cannot be inspect
		//driver.findElement(By.name("submit")).click();
		driver.findElement(By.className("btn-search3")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		// accept  for ok button
		a.accept();
		//dismiss for cancel button
		//a.dismiss();
		a.sendKeys("pondicherry");
	//	driver.quit();

	}

}
