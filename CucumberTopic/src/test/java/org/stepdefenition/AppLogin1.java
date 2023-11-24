package org.stepdefenition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLogin1 extends BaseClass1 {

	SignInPojo s;

	@Given("To launch the browwser and maximize the window")
	public void to_launch_the_browwser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch url of myntra application")
	public void to_launch_url_of_myntra_application() {
		launchUrl("https://www.myntra.com/");
	}

	@When("To search the product")
	public void to_search_the_product() {
		s = new SignInPojo();
		pageText("books", s.getSearch());

	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

}
