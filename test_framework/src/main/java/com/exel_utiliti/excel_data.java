package com.exel_utiliti;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel_data {
	public  String excel_username(int a) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT0206\\Desktop\\jav\\test_framework\\src\\test\\resources\\Testdata\\testdata.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		    
			  XSSFRow row =sheet.getRow(a);
			  XSSFCell cell=row.getCell(0);
			  String un=cell.getStringCellValue();
			  
            
		return un;
}
	public  String excel_password(int b) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT0206\\Desktop\\jav\\test_framework\\src\\test\\resources\\Testdata\\testdata.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		  
			  XSSFRow row =sheet.getRow(b);
			  XSSFCell cell1=row.getCell(1);
			  String pwd=cell1.getStringCellValue();
          
		return pwd;
}
}
