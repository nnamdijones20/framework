package DataDrivenTestPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

  public static void main(String[] args) throws Exception {
	File file = new File("C:\\ExcelSheet\\POIExcelSheet.xlsx");
	FileInputStream fileInput = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook(fileInput);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
	System.out.println("Data from excel is " +data0);
	
	//making changes
	
	//If you want to close wb to avoid memory leak
	 // wb.close();
  }
}
