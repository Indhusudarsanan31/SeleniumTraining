package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B {

	@Test
	private void tc7() {
		System.out.println("Test Case 1 : " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

	}

	@Test
	private void tc8() {
		System.out.println("Test Case 2 : " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("indhushankar");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("shankarindhu");
	}

	@Test
	private void tc9() {
		System.out.println("Test Case 3 : " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
	}

}
