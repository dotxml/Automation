import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	 private static XSSFSheet ExcelWSheet;
	 
     private static XSSFWorkbook ExcelWBook;

     private static XSSFCell cell;

     private static XSSFRow row;
     
	public static void setExcelFile(String filePath,String sheetName) throws IOException {
		
	    // Open the Excel file
		 
		 FileInputStream ExcelFile = new FileInputStream(filePath);
		 
		 // Access the required test data sheet
		 
		 ExcelWBook = new XSSFWorkbook(ExcelFile);
		 
		 ExcelWSheet = ExcelWBook.getSheet(sheetName);

	}
	
	public static String getCellData(int rowNum, int colNum) {
		try {
			
			row = ExcelWSheet.getRow(rowNum);
			cell = row.getCell(colNum);
			if (cell.getCellType() == CellType.STRING)
				return cell.getStringCellValue();
			else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
				String cellValue = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					DateFormat df = new SimpleDateFormat("dd/MM/yy");
					Date date = cell.getDateCellValue();
					cellValue = df.format(date);
				}
				return cellValue;
			} else if (cell.getCellType() == CellType.BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());
		} catch (Exception e) {
			e.printStackTrace();
			return "row " + rowNum + " or column " + colNum + " does not exist  in Excel";
		}
	}
}
