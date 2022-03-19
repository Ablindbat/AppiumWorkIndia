package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseTest {
	//calling every before execution
	@Before
	public void startServer() {
		start();
	}
	//Screenshot method.
	@After
	public void tearDown(Scenario scenerio) {
		if(scenerio.isFailed()) {
			//taking screenshot
			final byte[] screenhot = ((TakesScreenshot)wd).getScreenshotAs(OutputType.BYTES);
			//embed in report
			scenerio.embed(screenhot, "image/png");
		}
	}
	//calling every after execution
	@After
	public void stop() {
		stopAppium();
		closeService();
	}
}
