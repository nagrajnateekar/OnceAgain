package com.writeexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public static void writing(String value) throws InvalidFormatException, IOException {
		 File file=new File(".//TestData//data.xlsx");
		FileInputStream input =new FileInputStream(file);
		 XSSFWorkbook wb=new XSSFWorkbook(input);
		 
		XSSFSheet sheet= wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++) {
		      sheet.getRow(i).createCell(3).setCellValue(value);
		}
		FileOutputStream output=new FileOutputStream(file);
		wb.write(output);
		wb.close();

	}

}
