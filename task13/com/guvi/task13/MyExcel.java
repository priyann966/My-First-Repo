package com.guvi.task13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcel {
	
	public static void main(String[] args) throws IOException {
		// creating workbook object
		Workbook wb=new XSSFWorkbook();
		//
		OutputStream fis
        = new FileOutputStream("Guvi.xlsx");
		// spreadsheet object 
		Sheet sh1=wb.createSheet("Sheet1");

	     HashMap<Integer, String []> hashMap = new HashMap<>();
	     hashMap.put(1, new String[] {" Name"," Age"," Email"});
	     hashMap.put(2, new String[] {"John Doe","30","john@test.com"});
	     hashMap.put(3, new String[] {"Jane Doe","28","john@test.com"});
	     hashMap.put(4, new String[] {"Bob Smith","35","jacky@example.com"});
	     hashMap.put(5, new String[] {"Swapnil","37","swapnil@example.com"});
	     // using for each loop for iterating no of rows and data to be written in to String []
	     
	     Set<Integer> keySet = hashMap.keySet();
	     for (Integer key : keySet) {
	    	 Row r0 = sh1.createRow(key-1); 
	    	 String[] values = hashMap.get(key);
	    	 int index = 0;
	    	 for (String value : values) {
	    		 Cell c0 = r0.createCell(index);
		    	 c0.setCellValue(value);
		    	 index++;
			}	
		}

        wb.write(fis);
        fis.close();

	}

}
