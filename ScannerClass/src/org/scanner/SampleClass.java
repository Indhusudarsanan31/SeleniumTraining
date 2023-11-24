package org.scanner;

import java.util.Scanner;

public class SampleClass {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the internName: ");
		String name = a.nextLine();
		
		System.out.println("Enter the internAge: ");
		byte age = a.nextByte();
		
		System.out.println("Enter the internPhoneNo: ");
		long internPhoneNo = a.nextLong();
		
		System.out.println("Enter the internSalary: ");
		double internSalary = a.nextDouble();
		
		System.out.println("Enter the internAddress: ");
		String internAddress = a.next();
		
		
		
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("PhoneNo: " + internPhoneNo);
		System.out.println("Salary:  " + internSalary);
		System.out.println("Address: " + internAddress);

	}

}
