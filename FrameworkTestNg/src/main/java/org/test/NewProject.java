package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewProject extends BaseClass1 {

	@DataProvider(name = "Amazon")
	private Object[][] data() {
		return new Object[][] { { "Books" }, { "laptop" }, { "mobile" }, { "football" } };
	}

	@Test(dataProvider = "Amazon")
	public void tc2(String product) throws AWTException {
		launchUrl("https://www.amazon.com/");
		windowMaximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("product");

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@DataProvider(name = "Facebook")
	private Object[][] datas() {
		return new Object[][] { { "selenium", "inmakes" }, { "framework", "junit" }, { "cucumber", "testNg" },
				{ "corejava", "API" } };
	}

	@Test(dataProvider = "Facebook")
	private void tc33(String e, String p) {
		launchUrl("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(e);
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(p);
	}

	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@AfterClass
	private void closeTheBrowser() {
		closeEntireBrowser();
	}

	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test(priority = -20)
	private void tc3() {
		System.out.println("Test Case 3");
	}

	@Test(invocationCount = 2)
	private void tc4() {
		launchUrl("https://mail.google.com/mail/u/0/#inbox");
	}

	@Test(priority = 2)
	private void tc5() {
		launchUrl("https://inmakesedu.com/");
	}

	@Test(priority = -8)
	private void tc6() {
		launchUrl("https://www.redbus.in/");
	}

	@Test(priority = 225)
	private void tc7() {
		System.out.println("Test Case 7");
	}

}

//@Parameters({"userName", "password"})
//@Test()
//private void tc1(String e, String p) {
//	launchUrl("https://www.facebook.com/");
//	WebElement email = driver.findElement(By.id("email"));
//	email.sendKeys(e);
//	WebElement password = driver.findElement(By.name("pass"));
//    password.sendKeys(p);
//}