package org.stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FbLoginClass extends BaseClass1 {

	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://www.facebook.com/");
	}

	@When("To pass valid user name in email field")
	public void to_pass_valid_user_name_in_email_field() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("indhusuresh881@gmail.com");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");

	}

	@When("To check weather navigate to the home page or not")
	public void to_check_weather_navigate_to_the_home_page_or_not() {
		System.out.println("Check your login credentials");

	}

}
