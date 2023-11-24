package org.scanner;

import java.util.Scanner;

public class SampleClass3 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the bankName");
		String bankName = x.nextLine();
	
		System.out.println("Enter the branchName");
		String branchName = x.nextLine();
		
		System.out.println("Enter the customerName");
		String customerName = x.next();
		
		System.out.println("Enter the accountNumber");
		long accountNumber = x.nextLong();
		
		System.out.println("Enter the savingBalance");
		int savingBalance = x.nextInt();
		
		System.out.println("Enter the loanAmount");
		int loanAmount = x.nextInt();
		
		System.out.println("Bank Name : " + bankName);
		System.out.println("Branch Name : "  + branchName);
		System.out.println("Customer Name : " + customerName);
		System.out.println(" Account Number : " + accountNumber);
		System.out.println("Savings Blance : " + savingBalance);
		System.out.println("Loan Amount : " + loanAmount);
		
		
	}

}
