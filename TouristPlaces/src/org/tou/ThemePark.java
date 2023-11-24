package org.tou;

public class ThemePark extends Beaches{
	public void wonderla() {
		System.out.println("Wonderla Located in Bangalore");
	}
	public void blackThunder() {
		System.out.println("Black Thunder located in Ooty");
	}
	
	public static void main(String[] args) {
		ThemePark t = new ThemePark();
		
		t.marinaBeach();
		t.mahabalipuramBeach();
		t.wonderla();
		t.blackThunder();
		
	}

}
