package pages;

import org.openqa.selenium.support.PageFactory;

import baseclass.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseCityPage extends BaseTest {
	//page factory 
	public ChooseCityPage() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}
	//locators
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_name")
	public MobileElement signup_name;

	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_number")
	public MobileElement signup_phone;

	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit")
	public MobileElement btn_submit_signup;

	@AndroidFindBy( id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_mum")
	private MobileElement btn_city;
	
	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/act_auto_complete")
	private MobileElement railway_station;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	private MobileElement btn_submit_city;
	//methods for specific operation
	public void signupData(String name,String phone) {
		signup_name.sendKeys(name);
		signup_phone.sendKeys(phone);
	}
	public void clickSignupButton() {
		btn_submit_signup.click();
	}
	
	public void tapCity() throws Throwable {
		btn_city.click();
		Thread.sleep(5000);
	}
	public void typeResident(String location) {
		railway_station.sendKeys(location);
	}
	public void clickSubmit() throws Throwable {
		wd.hideKeyboard();
		btn_submit_city.click();
		Thread.sleep(5000);
	}
}
