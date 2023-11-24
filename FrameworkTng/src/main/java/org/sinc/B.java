package org.sinc;

import org.testng.annotations.Test;

public class B {

	@Test
	private void tc21() {
		System.out.println("Test case 21");
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
