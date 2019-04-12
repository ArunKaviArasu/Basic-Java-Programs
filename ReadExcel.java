package week5.day2;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readExcelData(String fileName) throws IOException {
		
		//@SuppressWarnings("resource")
		XSSFWorkbook wBook=new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//Go to sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		
		//get row count
		int rowCount = sheet.getLastRowNum();
		
		System.out.println("Row Count is " +rowCount);
		
		//Get column count
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Cell count is " +columnCount);
		
		String[][] data=new String[rowCount][columnCount];
		
		for (int j = 1; j <=rowCount; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < columnCount; i++) {
				XSSFCell cell = row.getCell(i);
				
				CellType cs=cell.getCellType();
				
				if(cs==CellType.STRING) {
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
					
				}
				else if(cs==CellType.NUMERIC){
					double numericCellValue = cell.getNumericCellValue();
					
					System.out.println((int)numericCellValue);
					
				}
					
				
			} 
		}
		return data;
		
		
	}
	

}
