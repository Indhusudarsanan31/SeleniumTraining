package org.samp;

import org.base.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenProject extends BaseClass{

	public static void main(String[] args) throws IOException {

		createCell(0, 0, "Selenium");
		createCell(0, 1, "Java");
		createCell(0, 2, "Data Driven");
		createCell(0, 3, "POM");
		
		createRow(1, 0, "Appium");
		createRow(1, 1, "Cucumber");
		createRow(1, 2, "Junit");
		createRow(1, 3, "TestNG");

	
		
	}

}

		
		
		
		
		
		
		
		
		
		
		
		

//		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenPractice\\Excel\\newFile.xlsx");
//
//		Workbook w = new XSSFWorkbook();
//		
//		Sheet newSheet = w.createSheet("Datas");
//		
//		Row newRow = newSheet.createRow(0);
//		
//		Cell newCell = newRow.createCell(0);
//		
//		newCell.setCellValue("Selenium");
//		
//		FileOutputStream fos = new FileOutputStream(f);
//		
//		w.write(fos);
		
		
		
		
		
		
		
		
		
//		FileInputStream fis = new FileInputStream(f);


//		Sheet mySheet = wb.getSheet("Data");
//
//		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
//
//			Row r = mySheet.getRow(i);
//
//			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
//
//				Cell c = r.getCell(j);
//
//				int cellType = c.getCellType();
//
//				if (cellType == 1) {
//
//					String value = c.getStringCellValue();
//
//					System.out.println(value);
//
//				} else if (DateUtil.isCellDateFormatted(c)) {
//
//					Date dd = c.getDateCellValue();
//
//					SimpleDateFormat s = new SimpleDateFormat("dd-mmm-yyyy");
//
//					String value = s.format(dd);
//
//					System.out.println(value);
//
//				}
//
//				else {
//					
//					double d = c.getNumericCellValue();
//					
//					long l = (long) d;
//					
//					String value = String.valueOf(l);
//					
//					System.out.println(value);
//				}
//
//			}
//
//		}

	
		
	


