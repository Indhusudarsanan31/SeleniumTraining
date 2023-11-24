package org.bik;

public class Ninja extends BMW {
	
	@Override
	public void mileage(String average) {
		System.out.println("Enter the average of mileage in BMW : " + average);
	}
	
	@Override
	public void enginePower(int power) {
		System.out.println("Enter the engine power of BMW : " + power);
	}
	
	
	private void price(int Price ) {
		System.out.println("Price of the Ninja Bike : " + Price);
	}
	private void model(int count) {
		System.out.println("Count of ninja bike models : " + count);
	}
	private void speed(String speed) {
		System.out.println("Speed of the Ninja Bike : " + speed);
	}
	
	

	public static void main(String[] args) {
		
		Ninja n = new Ninja();
		
		n.mileage("As per ARAI, the average of G 310 R [2021] is 30 kmpl");
		n.enginePower( 9500 );
		n.price(348000);
		n.model(23);
		n.speed("182 to 400 km/h");
		
		
		
	}
}
