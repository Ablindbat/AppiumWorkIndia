package baseclass;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
	//initialize drivers
	public static AppiumDriver<MobileElement> wd = null;
	protected static AppiumDriverLocalService service;
	//start appium server
	public void start() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	//Desire capabilities for app
	public void setup() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "8.1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "MyAndroid");
		capabilities.setCapability("appPackage", "in.workindia.nileshdungarwal.workindiaandroid");
		capabilities.setCapability("appActivity", "in.workindia.nileshdungarwal.workindiaandroid.RegisterActivity");
		capabilities.setCapability("app", "./Testing App/in.workindia.apk");
		
		//server path
		try {
			wd = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
		
	//stop appium
	public void stopAppium() {
		wd.quit();
	}
	//stop appium service
	public void closeService() {
		service.stop();
	}
}
