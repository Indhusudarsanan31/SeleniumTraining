package org.col;

public class DepartmentInfo {
	
	private void ug(String name) {
		System.out.println("Name of the department : " + name );
	}
	private void ug(int count) {
		System.out.println("Students count of the department : " + count );
	}
	
	private void ug(long contact) {
		System.out.println("Contact detail of the department : " + contact);
	}

	public static void main(String[] args) {
		
		DepartmentInfo d = new DepartmentInfo();
		
		d.ug("Commerce");
		d.ug(150);
		d.ug(9876543210l);
	}
}
