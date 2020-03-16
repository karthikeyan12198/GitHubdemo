import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bmwdemo {

	public static void main(String[] args) {
		WebDriver driver;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.bmw.in/en/");
	driver.findElement(By.className("tw-relative tw-p-400 tw-m-0 tw-flex tw-items-center tw-font-bmw-bold tw-text-450 tw-border-b-400 tw-border-transparent tw-text-grey-500 xl:hover:tw-text-grey-900 xl:hover:tw-border-b-400 xl:hover:tw-border-primary-500 xl:hover:tw-text-grey-900")).click();
	driver.findElement(By.xpath("//*[@id=\"the-top-navigation\"]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div[1]/div/nav/div/div/div[4]/a")).click();

	
	
	}

}
