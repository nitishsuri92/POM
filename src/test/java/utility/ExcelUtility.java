package utility;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtility(String excelPath, String sheetName) throws IOException{
		 workbook = new XSSFWorkbook(excelPath);
		 sheet = workbook.getSheet(sheetName);
	}
	
	public static void GetCellData(int rowNum, int colNum) throws IOException {
		DataFormatter format = new DataFormatter();
		Object value = format.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println(value);
	}
	
	public static void GetRowCount() throws IOException {
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows : " + rowCount);
	}
}
