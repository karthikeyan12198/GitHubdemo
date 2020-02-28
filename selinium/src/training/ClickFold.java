package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickFold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement a =driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement c=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement d=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		WebElement e=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
		
		
		Actions act=new Actions(driver);
act.clickAndHold(a).clickAndHold(e).release().build().perform();
	}

}
