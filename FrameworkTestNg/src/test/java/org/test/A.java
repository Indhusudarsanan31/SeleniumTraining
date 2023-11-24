package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	@Test
	private void tc4() {
		System.out.println("Test Case 1 : " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

	}

	@Test
	private void tc5() {
		System.out.println("Test Case 2 : " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("indhushankar");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("shankarindhu");
	}

	@Test
	private void tc6() {
		System.out.println("Test Case 3 : " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
	}

}
