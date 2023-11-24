package org.car;


public class Lancer extends Skoda {
	
	@Override
	public void price(double price) {
		System.out.println("Price of Skoda in lakhs : " + price);
	}
	@Override
	public void model(int model) {
		System.out.println("How many models in Skoda : "  + model);
	}
	private void seater(int seat) {
		System.out.println("How many seater in Lancer car : " + seat);
	}
	private void window(String replcement) {
		System.out.println("There is possible for replacement of windoww in Lancer car  : " + replcement);
	}
	private void mileage(String highest) {
		System.out.println("What is the highest mileage of Lancer car : " + highest);
	}
	private void enginePower(String  name) {
		System.out.println("What is the engine name of the Lancer car : " + name);
	}
	public static void main(String[] args) {
		
		Lancer l = new Lancer();
		
		l.price(11.39);
		l.model(4);
		l.seater(5);
		l.window("Yes");
		l.mileage("440 and 162");
		l.enginePower(" 2.0-liter MIVEC DOHC 16-valve I-4,");
		
		
	}

}
