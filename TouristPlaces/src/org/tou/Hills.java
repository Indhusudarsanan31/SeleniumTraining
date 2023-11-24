package org.tou;

public class Hills extends ThemePark{
	
	private void munnar() {
		System.out.println("Munnar Located in Munnar District");
	}
	private void vagamon() {
		System.out.println("Vagamon Located in Kottayam");
	}
	
	public static void main(String[] args) {
		
		Hills h = new Hills();
		
		h.marinaBeach();
		h.mahabalipuramBeach();
		h.wonderla();
		h.blackThunder();
		h.munnar();
		h.vagamon();
		
		
	}

}
