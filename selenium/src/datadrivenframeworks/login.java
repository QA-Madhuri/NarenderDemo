package datadrivenframeworks;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class login {


		
		
		static Workbook book;
		static Sheet sheet;
		public static String Xlfilepath="C:\\Users\\sk\\eclipse-workspace\\selenium\\TestData\\Book1.xlsx";


		public static Object[][] getTestdata(String SheetName)
		{
		FileInputStream file=null;

		
		try {
			file=new FileInputStream(Xlfilepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	



		
		try {
			book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	



		sheet=book.getSheet(SheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());


		for(int i=0;i<sheet.getLastRowNum();i++)
		{
		for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
		{
		data[i][j]=sheet.getRow(i+1).getCell(j).toString();

		}
		}
		return data;


		}


		}

	


