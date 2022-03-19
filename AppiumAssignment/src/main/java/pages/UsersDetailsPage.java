package pages;

import org.openqa.selenium.support.PageFactory;

import baseclass.BaseTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class UsersDetailsPage extends BaseTest {
	//TouchAction  predefine method calling for several action
	TouchAction action = new TouchAction(wd);
	//constructor for page factory
	public UsersDetailsPage() {
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
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/rg_male")
	private MobileElement btn_male;
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/rg_female")
	private MobileElement btn_female;
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/rb_graduate")
	private MobileElement btn_graduate;
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/cb_english")
	private MobileElement btn_english;	
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/rg_eng_level_3")
	private MobileElement btn_good_english;
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
	private MobileElement btn_fresher;
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/tv_age_message")
	private MobileElement btn_age;	
	
//	@AndroidFindBy(xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.GridView/android.widget.FrameLayout[14]/android.widget.CheckBox")
//	private MobileElement btn_account;
	
//	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/ll_bottom_action")
//	private MobileElement btn_submit_final;
	
	//methods for several operations
	public void signupSetup(String name,String phone) {
		signup_name.sendKeys(name);
		signup_phone.sendKeys(phone);
		action.tap(ElementOption.element(btn_submit_signup)).perform().release();
	}
	
	public void chooseCity(String location) throws Throwable {
		action.tap(ElementOption.element(btn_city)).release().perform();
		Thread.sleep(1000);
		railway_station.sendKeys(location);
		Thread.sleep(5000);		
	}
	public void tapChooseCitySubmit() throws Throwable {
		wd.hideKeyboard();
		Thread.sleep(10000);
		action.tap(ElementOption.element(btn_submit_city)).perform();
	}
	
	public void tapGender() throws InterruptedException {
		action.tap(ElementOption.element(btn_male)).release().perform();
	}
	
	public void tapEducation() throws InterruptedException {
		action.tap(ElementOption.element(btn_graduate)).release().perform();
	}
	public void schoolMedium() throws InterruptedException {
		action.tap(ElementOption.element(btn_english)).release().perform();
	}
	public void speak() throws InterruptedException {
		action.tap(ElementOption.element(btn_good_english)).release().perform();
	}
	
	public void status() throws Throwable {
		action.tap(ElementOption.element(btn_fresher)).release().perform();
	}
	
	public void age() throws Throwable {
		wd.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Interested\").instance(0))"));
		Thread.sleep(1000);
		action.tap(ElementOption.element(btn_age)).release().perform();
		Thread.sleep(1000);
		wd.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"22 Years\").instance(0))")).click();
		Thread.sleep(1000);
	}
	public void selectInterest() throws Throwable {
		Thread.sleep(5000);
//		action.tap(ElementOption.element(btn_account)).release().perform();		
//		Thread.sleep(1000);
	}
	public void submitDone() throws Throwable {
//		action.tap(ElementOption.element(btn_submit_final)).release().perform();
//		Thread.sleep(5000);
	}
}
