package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AClass extends BaseClass1 {

	@Test(invocationCount = 3)
	private void tc55() {
		System.out.println("Test case 55");
	}

	@Test
	private void tc33() {
		launchUrl("https://www.facebook.com/");

		String title = pageTitle();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("indhushankar");

		Assert.assertTrue(title.contains("facebook"), "check the page title");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("shankarindhu");
	}

	@Test
	private void tc3() {
		launchUrl("https://www.facebook.com/");
		String title = pageTitle();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("indhushankar");

		SoftAssert s = new SoftAssert();
		s.assertTrue(title.contains("facebook"), "check the page title");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("shankarindhu");

		s.assertAll();
	}

	@Test(priority = -12)
	private void tc11() {
		System.out.println("Test case 11");
	}

}
