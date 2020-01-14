package DataDrivenTestPOI;

import LibraryForReadExcel.ExcelDataConfig;

public class ReadExcelSheetUsingLibraries {

	public static void main(String[] args) {
		
		ExcelDataConfig excelData  = new ExcelDataConfig("C:\\ExcelSheet\\POIExcelSheet.xlsx");
		
		System.out.println(excelData.getData(0, 1, 1));

	}

}
