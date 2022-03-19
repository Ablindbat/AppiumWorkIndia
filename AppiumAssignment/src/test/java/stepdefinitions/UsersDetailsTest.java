package stepdefinitions;

import baseclass.BaseTest;
import baseclass.LogReport;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.UsersDetailsPage;

public class UsersDetailsTest extends BaseTest {
	//calling logger class
	LogReport logg = new LogReport("UsersDetailsTest");
	//create reference variable of UsersDetailsTest class	
	UsersDetailsPage details;
	
	@Given("^I lunch the app$")
	public void i_lunch_the_app() throws Throwable {
		logg.log.info("start server for users details page");
		//calling setup method from base class
		setup();
		logg.log.info("Desire capabilities setup complete.");
	}

	@And("^I signup with \"([^\"]*)\" and \"([^\"]*)\" and submit$")
	public void i_signup_with_and_and_submit(String name, String phone) throws Throwable {
		//calling UsersDetailsPage constructor
		details = new UsersDetailsPage();
		//calling specific method from this page class
		details.signupSetup(name, phone);
		logg.log.info("Putting details and submit for signup");
		
	}

	@And("^I complete city choice with tap city and provide \"([^\"]*)\" and submit$")
	public void i_complete_city_choice_with_tap_city_and_provide_and_submit(String location) throws Throwable {
		//calling UsersDetailsPage constructor
		details = new UsersDetailsPage();
		//calling specific method from this page class
		details.chooseCity(location);
		//hide keyboard
		wd.hideKeyboard();
		//calling specific method from this page class
		details.tapChooseCitySubmit();
		logg.log.info("Choose city and submit");
	}

	@And("^I choose my gender$")
	public void i_choose_my_gender() throws Throwable {
		//calling UsersDetailsPage constructor
		details = new UsersDetailsPage();
		//calling specific method from this page class
		details.tapGender();
		logg.log.info("tap on a specific gender successfully");
	}

	@And("^I choose my qualification$")
	public void i_choose_my_qualification() throws Throwable {
		//calling UsersDetailsPage constructor
		details = new UsersDetailsPage();
		//calling specific method
		details.tapEducation();
		//log
		logg.log.info("tap on graduate text");
	}

	@And("^I choose my school medium$")
	public void i_choose_my_school_medium() throws Throwable {
		//calling UsersDetailsPage constructor
		details = new UsersDetailsPage();
		//calling specific method
		details.schoolMedium();
		logg.log.info("tap on school medium");
	}

	@And("^I choose my speak english$")
	public void i_choose_my_speak_english() throws Throwable {
		//calling UsersDetailsPage constructor
		details = new UsersDetailsPage();
		//calling specific method
		details.speak();
		logg.log.info("tap on speak english button");
	}

	@And("^I choose my status$")
	public void i_choose_my_status() throws Throwable {
		//calling UsersDetailsPage constructor
		details = new UsersDetailsPage();
		//calling specific method
		details.status();
		logg.log.info("Tap on choice fresher");
	}

	@And("^I choose my age$")
	public void i_choose_my_age() throws Throwable {
		//calling UsersDetailsPage constructor
		details =new UsersDetailsPage();
		//calling specific method
		details.age();
		logg.log.info("Scroll and tap on age section and select a age");
	}

	@And("^I choose my interested$")
	public void i_choose_my_interested() throws Throwable {
//		details =new UsersDetailsPage();
//		details.selectInterest();
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
//		details =new UsersDetailsPage();
//		details.submitDone();
	}

	@Then("^Open a new page\\.$")
	public void open_a_new_page() throws Throwable {
		logg.log.info("drivers close");
	}
}
