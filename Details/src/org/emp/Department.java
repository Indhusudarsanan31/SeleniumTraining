package org.emp;

public class Department extends Employee {
	
	private void departmentName() {
		System.out.println("Commerce");
	}

	@Override
	public void employeeDesignation() {
		System.out.println("Software Tester");
	}
	
	@Override
	public void employeeName() {
		System.out.println("Indhu");
	}
	
	public static void main(String[] args) {
		Department d = new Department();
		
		d.departmentName();
		d.employeeDesignation();
		d.employeeName();
		
		
	}

}
