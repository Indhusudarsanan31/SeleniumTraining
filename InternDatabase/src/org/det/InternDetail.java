package org.det;

public class InternDetail {
	
	private void interns(String name ) {
		System.out.println("Intern Name : " + name );
	}
	private void interns(int age) {
		System.out.println("Intern Age : " + age );
	}
	
	public static void main(String[] args) {
		
		InternDetail a = new InternDetail();
		
		a.interns("Indhu");
		a.interns(23);
	}


}
