package org.sof;

public class ApiTesting implements Automation, Manual {
	
	private void RestAssured() {

	}

	@Override
	public void TestCase() {
		System.out.println("Create the test cases");
	}

	@Override
	public void Framework() {
		System.out.println("Using the Framework");
	}
	
	public static void main(String[] args) {
		
		ApiTesting a = new ApiTesting();
		
		a.TestCase();
		a.Framework();
		
	}
	
	

}
