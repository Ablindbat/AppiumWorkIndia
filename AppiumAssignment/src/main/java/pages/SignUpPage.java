package pages;

import org.openqa.selenium.support.PageFactory;

import baseclass.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpPage extends BaseTest{
	//constructor for page factory	
	public SignUpPage() {
		PageFactory.initElements(new AppiumFieldDecorator(wd), this);
	}

	//locators
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_name")
	public MobileElement signup_name;

	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_number")
	public MobileElement signup_phone;

	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit")
	public MobileElement btn_submit;
	//methods for specific operations
	public void typeName(String name) {
		signup_name.sendKeys(name);
	}

	public void typePhoneNumber(String phone) {
		signup_phone.sendKeys(phone);
	}

	public void tapSubmit() throws Exception {
		btn_submit.click();
		Thread.sleep(10000);
	}
	
}
