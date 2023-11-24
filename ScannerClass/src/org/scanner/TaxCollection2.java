package org.scanner;

import java.util.Scanner;

public class TaxCollection2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		byte m1 = s.nextByte();
		byte m2 = s.nextByte();
		byte m3 = s.nextByte();
		byte m4 = s.nextByte();
		byte m5 = s.nextByte();

		int total = m1 + m2 + m3 + m4 + m5;
		System.out.println(total);

		float num1 = s.nextFloat();
		System.out.println("enter the first number");

		float num2 = s.nextFloat();
		System.out.println("enter the second number");
		
		float num3 = s.nextFloat();
		System.out.println("enter the third number");

	}

}
