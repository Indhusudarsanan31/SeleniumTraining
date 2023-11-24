package org.stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PositiveAndNegative extends BaseClass1{
	
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@Given("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
	    launchUrl("https://www.facebook.com/");
	}

	@Given("User has to pass the data {string}in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(em);	   
	}

	@Given("User has to pass the data {string}in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys(pass);
	   
	}

	@Given("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		WebElement login = driver.findElement(By.xpath("(//font[text()='Sign in'])[1]"));
		login.click();
	   
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	closeEntireBrowser();
	}
}
