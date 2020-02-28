import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
	public void demo() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://filebin.net/");
	driver.findElement(By.xpath("//*[@id=\"fileField\"]")).sendKeys("C:\\Users\\BLTuser.BLT1221\\Downloads\\New folder\\128.pdf");
}
}
