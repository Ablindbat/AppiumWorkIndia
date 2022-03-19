package stepdefinitions;

import baseclass.BaseTest;
import baseclass.LogReport;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignUpPage;

public class SignUpTest extends BaseTest {
	//calling log report class
	LogReport logg = new LogReport("SignUpTest");
	
	@Given("^I open the app$")
	public void i_open_the_app() throws Throwable {
		//log
		logg.log.info("Start server in SignUpTest");
		//set desire capabilities 
	    setup();
	    logg.log.info("Desire capabilities setup complete");
	}

	@And("^I entered my name \"([^\"]*)\"$")
	public void i_entered_my_name(String name) throws Throwable {
		//calling specific constructor
		SignUpPage signuppage = new SignUpPage();
		//calling specific method
		signuppage.typeName(name);
		logg.log.info("Sent a name from feature file");
	}

	@And("^I entered my phone number \"([^\"]*)\"$")
	public void i_entered_my_phone_number(String phone) throws Throwable {
		//calling specific constructor
		SignUpPage signuppage = new SignUpPage();
		//calling specific method
		signuppage.typePhoneNumber(phone);
		logg.log.info("Sent a phone from feature file");
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		//calling specific constructor
		SignUpPage signuppage = new SignUpPage();
//		driver.hideKeyboard();
		//calling specific method
		signuppage.tapSubmit();	
		logg.log.info("Tap on submit button");
	}

	@Then("^Open a new page$")
	public void open_a_new_page() throws Throwable {
		logg.log.info("Open a new page");
		logg.log.info("Driver close");
	}
}
