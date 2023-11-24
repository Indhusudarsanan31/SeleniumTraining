package org.samp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPractice {
	
	public static void main(String[] args) throws AWTException {
		
		        // Step 1 : Browser Configuration ===> classname.methodname(k,v);
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumInmake\\drivers\\chromedriver.exe");
				// Step 2 : Browser Launch
				WebDriver driver = new ChromeDriver();

				driver.get("https://www.snapdeal.com/");
				// to manage
				driver.manage().window().maximize();
				
				Actions a = new Actions(driver);
				
				WebElement searchBox = driver.findElement(By.name("keyword"));
				searchBox.sendKeys("hand sanitizer");
				
				WebElement submitbtn = driver.findElement(By.xpath("//span[text()='Search']"));
				submitbtn.click();
				
				WebElement product = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
				product.click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				
				WebElement cart = driver.findElement(By.xpath("(//span[@class='intialtext'])[1]"));
				js.executeScript("arguments[0].scrollIntoView(true)",cart);
				js.executeScript("arguments[0].click()",cart);

							
				
	}

}
				
				
				
				
				
				
				
				
				
//				Robot r = new Robot();
//				
//				for(int i = 0; i<2; i++) {
//					 r.keyPress(KeyEvent.VK_DOWN);
//					 r.keyRelease(KeyEvent.VK_DOWN);
//				}
//				     r.keyPress(KeyEvent.VK_ENTER);
//					 r.keyRelease(KeyEvent.VK_ENTER);
					 
						
				
	







//WebElement price = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-price'])[1]"));	
//String print = price.getText();
//System.out.println("Price of the prroduct is : " + print);	



