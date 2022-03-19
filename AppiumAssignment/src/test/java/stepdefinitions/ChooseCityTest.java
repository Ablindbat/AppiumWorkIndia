package stepdefinitions;

import baseclass.BaseTest;
import baseclass.LogReport;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ChooseCityPage;

public class ChooseCityTest extends BaseTest {
	//calling logger class
	LogReport logg = new LogReport("ChooseCityTest");
	//create reference variable of ChooseCityPage class
	ChooseCityPage citypage;
	
	
	@Given("^I open the app for choose city$")
	public void i_open_the_app_for_choose_city() throws Throwable {
		logg.log.info("open server in choose city page");
		//calling setup method from base class
	    setup();
	    logg.log.info("Desire capabilities set of application");
	}
	
	@And("^I entered my name \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_my_name_and(String name, String phone) throws Throwable {
		//calling ChooseCityPage constructor for page factory
		citypage = new ChooseCityPage();
		//calling specific method
		citypage.signupData(name, phone);
		logg.log.info("Enter the name and phone from feature file.");
	}

	@And("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		//calling ChooseCityPage constructor for page factory
		citypage = new ChooseCityPage();
		//calling specific method
		citypage.clickSignupButton();
		logg.log.info("click the submit button.");
	}

	@And("^I click one of city button$")
	public void i_click_one_of_city_button() throws Throwable {
		//calling ChooseCityPage constructor for page factory
		citypage = new ChooseCityPage();
		//calling specific method
		citypage.tapCity();
		logg.log.info("tap on Mumbai city");
	}

	@And("^I enter a nearest Railway station \"([^\"]*)\"$")
	public void i_enter_a_nearest_Railway_station(String location) throws Throwable {
		//calling ChooseCityPage constructor for page factory
		citypage = new ChooseCityPage();
		//calling specific method
		citypage.typeResident(location);
		logg.log.info("Type nearest railway station Thane");
	}

	@When("^I hide key board and click submit button$")
	public void i_hide_key_board_and_click_submit_button() throws Throwable {
		//calling ChooseCityPage constructor for page factory
		citypage = new ChooseCityPage();
		//for hiding keyboard
		wd.hideKeyboard();
		//calling specific method
		citypage.clickSubmit();
		logg.log.info("Hide keyboard and click on submit button");
	}
	
	@Then("^I not entered to next page successfully\\.$")
	public void i_not_entered_to_next_page_successfully() throws Throwable {
		logg.log.info("Throw error and stay on same page");
		logg.log.info("Driver close.");
	}

	@Then("^I entered to next page successfully\\.$")
	public void i_entered_to_next_page_successfully() throws Throwable {
		logg.log.info("Successfully go to the next page.");
		logg.log.info("Driver close.");
	}


}
