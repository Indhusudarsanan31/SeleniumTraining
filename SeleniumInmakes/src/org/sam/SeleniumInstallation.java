package org.sam;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumInstallation {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		// Step 1 : Browser Configuration ===> classname.methodname(k,v);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumInmake\\drivers\\chromedriver.exe");
		// Step 2 : Browser Launch
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		// to manage
		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone X");
		
		
		
	}
	
}






















//		WebElement searchButton = driver.findElement(By.xpath("//span[text()='Search']"));
//		searchButton.click();
//		

//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File ada = ts.getScreenshotAs(OutputType.FILE);
//
//		File f1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumInmakes\\webpageScreenshot\\adactinhomepage.jpg");
//
//		FileUtils.copyFile(ada, f1);
//		

//      WebElement country = driver.findElement(By.name("country"));
//		
//		Select s = new Select(country);
//		
//		List<WebElement> options = s.getOptions();
//		
//		for (int i = 0; i < options.size(); i++) {
//			WebElement text = options.get(i);
//			String txt = text.getText();
//			System.out.println(txt);
//			
//		}

//		WebElement cre = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		cre.click();

		// JavascriptExecutor js = (JavascriptExecutor) driver;

//		WebElement password = driver.findElement(By.name("pass"));
//		js.executeScript("arguments[0].setAttribute('value','*****')", password);

//		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
//		js.executeScript("arguments[0].click()",login);
//		

//		 WebElement scrolldown = driver.findElement(By.xpath("//div[text()='Selenium
//		 Online Trainings']"));
//		 js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
//
//		 WebElement alert = driver.findElement(By.xpath("//a[text()='Alert with
//		 Textbox ']"));
//		 alert.click();
//
//		 WebElement promptalert =
//		 driver.findElement(By.xpath("//button[contains(text(),'demonstrate ')]"));
//		 promptalert.click();
//
//		 Alert a = driver.switchTo().alert();
//		 a.sendKeys("Indhu");
//		 a.dismiss();
//
//		 Actions a = new Actions(driver);
//
//		 WebElement signin = driver.findElement(By.xpath("(//span[text()='Sign
//		 in'])[1]"));
//		 signin.click();
//
//		 WebElement email = driver.findElement(By.name("email"));
//		 email.sendKeys("indhusuresh881_gmail_com");
//
//		 a.doubleClick(email).perform();
//		 a.contextClick(email).perform();
//
//		 Robot r = new Robot();
//
//		 for(int i = 0; i<2; i++) {
//		 r.keyPress(KeyEvent.VK_DOWN);
//		 r.keyRelease(KeyEvent.VK_DOWN);
//		 }
//		 r.keyPress(KeyEvent.VK_ENTER);
//		 r.keyRelease(KeyEvent.VK_ENTER);
//
//		 WebElement password = driver.findElement(By.name("pass"));
//
//		 a.contextClick(password).perform();
//
//		 for(int i = 0; i<4; i++) {
//		 r.keyPress(KeyEvent.VK_DOWN);
//		 r.keyRelease(KeyEvent.VK_DOWN);
//		 }
//
//		 r.keyPress(KeyEvent.VK_ENTER);
//		 r.keyRelease(KeyEvent.VK_ENTER);
//
//		 WebElement mobile = driver.findElement(By.xpath("//div[text()='realme 11 Pro+
//		 5G (Oasis Green, 256 GB)']"));
//		 mobile.click();
//
//		 WebElement email = driver.findElement(By.name("email"));
//		 email.sendKeys("indhusuresh881@gmail.com");
//
//		 WebElement cont = driver.findElement(By.xpath("//input[@type='submit']"));
//		 cont.click();
//
//		 WebElement password = driver.findElement(By.id("ap_password"));
//		 password.sendKeys("********");
//
//		 WebElement sign =
//		 driver.findElement(By.xpath("//input[@class='a-button-input']"));
//	     sign.click();
//
//		 WebElement homesandfur = driver.findElement(By.xpath("//span[text()='Home &
//		 Furniture']"));
//		 a.moveToElement(homesandfur).perform();
//
//		 WebElement bath = driver.findElement(By.xpath("(//a[@class='_3490ry'])[6]"));
//		 bath.click();
//
//		 WebElement towel =
//		 driver.findElement(By.xpath("(//a[contains(text(),'colors')])[1]"));
//		 towel.getText();
//
//		 Close the current page
//		 driver.close();
//		 quit the browser
//		 driver.quit();
//
//		 Current page Title
//		 String pageTitle = driver.getTitle();
//		 System.out.println("Current page Title : " + pageTitle);
//
//	     CurrentURL
//		 String pageUrl = driver.getCurrentUrl();
//		 System.out.println("Current page URL : " + pageUrl);
//
	


