package org.stepdefenition;

import io.cucumber.datatable.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLogin extends BaseClass1 {

	SignInPojo s;

	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch the url of the amazon application")
	public void to_launch_the_url_of_the_amazon_application() {
		launchUrl("https://www.amazon.com/");

	}

	@When("To click the sign in button")
	public void to_click_the_sign_in_button() {
		s = new SignInPojo();
		clickBtn(s.getSignIn());

	}

	@When("To click create new account button")
	public void to_click_create_new_account_button() {
		s = new SignInPojo();
		clickBtn(s.getCreateNew());

	}

	@When("To pass the name in your name text box")
	public void to_pass_the_name_in_your_name_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		s = new SignInPojo();
		pageText(l.get(1), "indhu", s.getCusName());

	}

	@When("To pass mobile no or email in email text box")
	public void to_pass_mobile_no_or_email_in_email_text_box(DataTable d) {
		List<List<String>> l = d.asLists();
		s = new SignInPojo();
		pageText(l.get(1).get(0), "indhusuresh881@gmail.com", s.getEmail());

	}

	@When("To create the password using password text box")
	public void to_create_the_password_using_password_text_box() {
		s = new SignInPojo();
		pageText("123456789", s.getPassword());

	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		closeEntireBrowser();
	}

}
