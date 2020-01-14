package DataDrivenTestPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet1 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\ExcelSheet\\POIExcelSheet.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = wb.getSheetAt(0);
		
	    sheet.getRow(0).createCell(2).setCellValue("Pass");
		sheet.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream output = new FileOutputStream(file);
		
		wb.write(output);
		wb.close();
		
		
	}
}
