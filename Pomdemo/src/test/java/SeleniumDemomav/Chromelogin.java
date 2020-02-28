package SeleniumDemomav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
	}

}
