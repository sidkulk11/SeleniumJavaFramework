package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	
	@Test(dataProvider = "test1data")
	public void test1(String Username, String Password)
	{
		System.out.println(Username+ "  |  " +Password);
		
	}
	
	
	@DataProvider(name = "test1data")
	public static Object[][] main(String[] args) {
		
		String ExcelPath = "C:\\Users\\hp\\eclipse-workspace\\SeleniumFramework\\Excel\\Data.xlsx.xlsx";
		Object data[][] = TestData(ExcelPath, "Sheet1");
		return data;
	}
	
		public static Object[][] TestData(String ExcelPath, String SheetName)
	{
		ExcelUtils excel= new ExcelUtils(ExcelPath, SheetName);
		
		int rowcount = excel.getRowCount();
		int colcount = excel.getColCount();
		
		Object data[][]= new Object[rowcount -1][colcount];
		
		for(int i = 1;i<rowcount;i++)
		{
			for(int j = 0;j<=colcount;j++)
			{
				String celldata = excel.getCellDataString(i, j);
				System.out.println(celldata + " | ");
				data[i-1][j] = celldata;
				
			}	
			System.out.println();
				
		}
		return data;
	}

}
		


