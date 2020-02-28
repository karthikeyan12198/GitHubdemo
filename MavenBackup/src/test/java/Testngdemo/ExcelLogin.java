package Testngdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelLogin {

	public static void main(String[] args) throws IOException {
		FileInputStream Fi= new FileInputStream(new File("C:\\Users\\BLTuser.BLT1221\\Desktop\\Excel\\data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(Fi);
		XSSFSheet Sheet=workbook.getSheet("Sheet1");
		int count=Sheet.getLastRowNum();
		System.out.println(count);
		for (int i = 1; i <=count; i++) {
			 XSSFRow row=Sheet.getRow(i);
			 XSSFCell cell=row.getCell(0);
			 String un=cell.getStringCellValue();
			 XSSFCell cell1=row.getCell(1);
			 String pwd=cell1.getStringCellValue();
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\chromedriver.exe");
	       WebDriver  driver = new ChromeDriver();
	       driver.get("https://www.linkedin.com/login");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(un);
	       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
	       driver.findElement((By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button"))).click();
	       driver.close();
		}
		
		
	}

}
