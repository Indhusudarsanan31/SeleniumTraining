package org.inm;

public class InternDetails {
	private void internName() {
		System.out.println("Indhu");
	}
	private void internDob() {
         System.out.println("31/01/2000");
	}
	private void internEducation() {
		System.out.println("UG");
	}
	private void internPhone() {
		System.out.println("6369110781");
	}
	private void internEmail() {
		System.out.println("indhusuresh881@gmail.com");
	}
	private void internGender() {
		System.out.println("Female");
	}
	private void internAddress() {
		System.out.println("Karani garden 3rd street");
	}
    public static void main(String[] args) {
		InternDetails n = new InternDetails();
		n.internName();
		n.internDob();
		n.internEducation();
		n.internPhone();
		n.internEmail();
		n.internGender();
		n.internAddress();
	}	
}
