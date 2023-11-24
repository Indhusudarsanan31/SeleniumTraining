package org.stepdefenition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass1 {

	@Before(order = 2, value = "@Sanity")
	private void preCondition1() {
		windowMaximize();
		System.out.println("Maximize the window");

	}

	@Before(order = 1)
	private void preCondition2() {
		launchBrowser();
		System.out.println("Launch the browser");
	}

	@Before(order = 3)
	private void preCondition3() {
		System.out.println("PreCondition");

	}

	@After(order = 1)
	private void postCondition1() {
		closeEntireBrowser();
		System.out.println("Close the Browser");

	}

	@After(order = -2, value = "@Sanity")
	private void postCondition2() {
		System.out.println("Take the screenshot of the home page in application");
	}

}
