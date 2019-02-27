package com.actitime.framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Filelib {
public String getPropertyKeyValue(String key) throws Throwable {
	FileInputStream file=new FileInputStream("./data/testData.properties");
	Properties pro=new Properties();
	pro.load(file);
    String data=pro.getProperty(key);
    //System.out.println(pro.getProperty("url"));
    return data;
}
public String getExcelData(String sheetName,int rowNum,int celNum) throws Throwable {
	FileInputStream file = new FileInputStream("./data/Test12.xlsx");
	Workbook book = WorkbookFactory.create(file);
	 org.apache.poi.ss.usermodel.Sheet sh=book.getSheet(sheetName);
	 Row ro=sh.getRow(rowNum);
	 Thread.sleep(5000);
	 String data= ro.getCell(celNum).getStringCellValue();
	book.close();
	return data;
	
}
public void  setExcelData(String sheetName,int rowNum,int celNum,String data) throws Throwable {
	FileInputStream file = new FileInputStream("./data/Test12.xlsx");
	Workbook book = WorkbookFactory.create(file);
	 org.apache.poi.ss.usermodel.Sheet sh=book.getSheet(sheetName);
	 Row ro=sh.getRow(rowNum);
	 ro.createCell(celNum).setCellValue(data);
	 FileOutputStream fos=new FileOutputStream("./data/Test12.xlsx");
	 book.write(fos);
	 book.close();
}
	
}
