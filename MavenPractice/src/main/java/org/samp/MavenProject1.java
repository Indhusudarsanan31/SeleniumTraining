package org.samp;

import java.io.IOException;

import org.base.BaseClass;

public class MavenProject1 extends BaseClass{
	
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
