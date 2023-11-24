package org.sinc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A extends BaseClass{

	@Test(invocationCount = 3)
	private void tc55() {
		System.out.println("Test case 55");
	}
	
	@DataProvider(name = "TestNg")
	private Object[][] data() {
		return new Object[][] {
			{"indhushankar","1331"},
			{"sindhu","suresh"},
			{"ammu","123"},
			{"sudarsanan","567"},
			{"framework","2000"}
		};
	}

	@Test(dataProvider = "TestNg")
	private void tc33(String e, String p) {
		launchUrl("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(e);
		WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys(p);
	}

	@Test(priority = -12)
	private void tc11() {
		System.out.println("Test case 11");
	}

}
