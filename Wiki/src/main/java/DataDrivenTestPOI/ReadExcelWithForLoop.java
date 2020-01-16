package DataDrivenTestPOI;

//
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelWithForLoop {

  public static void main(String[] args) throws Exception {
	File file = new File("C:\\ExcelSheet\\POIExcelSheet.xlsx");
	FileInputStream fileInput = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook(fileInput);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	
	int rowCount = sheet1.getLastRowNum();
	System.out.println("The Total rows are "+rowCount);
	
	for(int i = 0; i<rowCount; i++) {
		
		String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("TEst data from excel is " +data0);
	}
	
	//If you want to close wb to avoid memory leak
	 // wb.close();
  }
}
