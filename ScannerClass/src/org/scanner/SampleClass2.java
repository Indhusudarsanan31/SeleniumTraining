package org.scanner;

import java.util.Scanner;

public class SampleClass2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the fromStation");
		String fromStation = s.nextLine();
		
		System.out.println("Enter the toStation");
		String toStation = s.next();
		
		System.out.println("Enter the ticketPrice");
		int ticketPrice = s.nextInt();
		
		System.out.println("Enter the foodPrice");
		int foodPrice = s.nextInt();
		
		System.out.println("There is a travelCost");
		boolean travelCost = s.nextBoolean();
		
		System.out.println("Enter the hotelRent");
		int hotelRent = s.nextInt();
		
		System.out.println("From Station : " + fromStation);
		System.out.println("To Station : " +  toStation);
		System.out.println("Ticket Price : " + ticketPrice);
		System.out.println("Food Price : " + foodPrice);
		System.out.println("There is a TravelCost : " +  travelCost);
		System.out.println("Hotel Rent : " + hotelRent);
	}
	

}
