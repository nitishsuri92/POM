package utility;

import java.io.IOException;

public class ExcelUtilsTest {

	public static void main(String[] args) throws IOException {
		
		String excelPath = "./UtilityData/TestData.xlsx";
		String sheetName = "Sheet1";

		ExcelUtility excel = new ExcelUtility(excelPath, sheetName);
		
		excel.GetRowCount();
		excel.GetCellData(1,0);
		excel.GetCellData(1,1);
		excel.GetCellData(1,2);
	}

}
