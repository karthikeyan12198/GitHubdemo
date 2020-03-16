package ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_code {
	public  String excel_username(int i) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\Book1.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		    
			  XSSFRow row =sheet.getRow(i);
			  XSSFCell cell=row.getCell(0);
			  String em=cell.getStringCellValue();
			        
		return em;
}
	public  String excel_password(int i) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT1221\\Desktop\\New\\Book1.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		  
			  XSSFRow row =sheet.getRow(i);
			  XSSFCell cell1=row.getCell(1);
			  String pwd=cell1.getStringCellValue();
      
		return pwd;
}
}
