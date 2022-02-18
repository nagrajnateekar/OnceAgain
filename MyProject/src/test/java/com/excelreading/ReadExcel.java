package com.excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void reading() throws IOException {

		File file = new File(".//TestData//data.xlsx");
		FileInputStream input = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("row count:"+rowcount+" col count:"+colcount);
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				String data = row.getCell(j).getStringCellValue();
				System.out.print(data + "   ");
			}
			System.out.println();
		}
		wb.close();
	}

}
