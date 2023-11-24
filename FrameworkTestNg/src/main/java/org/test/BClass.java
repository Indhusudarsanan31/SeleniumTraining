package org.test;

import org.testng.annotations.Test;

public class BClass {
	
	@Test(dataProvider = "Amazon", dataProviderClass = NewProject.class)
	private void tc21(String data) {
		System.out.println(data);
	}

	@Test(enabled = false)
	private void tc23() {
		System.out.println("Test case 21");
	}

	@Test
	private void tc25() {
		System.out.println("Test case 21");
	}

}
