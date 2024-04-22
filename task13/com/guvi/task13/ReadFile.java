package com.guvi.task13;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {
	public static void main(String[] args) throws IOException {
        //get the excel sheet file location
		FileInputStream inp = new FileInputStream("Learning.xlsx");
		//pass the file in to the workbook
		Workbook wb=new XSSFWorkbook(inp);
		Sheet s1=wb.getSheet("sheet1");
		//get the 
		
		for (int i = 0; i <= s1.getLastRowNum(); i++) {
			Row R0= s1.getRow(i);
			for (int j = 0; j <R0.getLastCellNum(); j++) {
				Cell c0=R0.getCell(j);
				System.out.print(" "+c0.getStringCellValue()+"\t\t");
			}
			System.out.println();
		}
		
	}

}
