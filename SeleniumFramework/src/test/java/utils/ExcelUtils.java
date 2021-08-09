package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	//Create a Constructor
	public ExcelUtils(String ExcelPath, String SheetName)
	{
		
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(ExcelPath);
			sheet = workbook.getSheet(SheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		getRowCount();
		getCellDataString(0, 0);
		getCellDataNumber(1, 1);

	}

	public static int getRowCount() {
		int rowcount = 0;
		try {
			
			rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows" + rowcount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowcount;

	}
	
	public static int getColCount() {
		int colcount = 0;
		try {
			
			colcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of columns" + colcount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colcount;

	}

	public static String getCellDataString(int rowNum, int colNum)
	{
		String celldata=null;
		try {
			
			celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(celldata);
			
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
			System.out.println(e1.getCause());
			e1.printStackTrace();
		}
			return celldata;
	}
	public static void getCellDataNumber(int rowNum, int colNum) {

		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath + "\\Excel\\Data.xlsx.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double celldata = sheet.getRow(rowNum).getCell(rowNum).getNumericCellValue();
			//System.out.println(celldata);

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
			System.out.println(e1.getCause());
			e1.printStackTrace();
		}

	}

}
