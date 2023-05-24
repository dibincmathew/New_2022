package Academy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserStack {

	@Test
	public void titlecheck() throws MalformedURLException {
		// TODO Auto-generated method stub
		MutableCapabilities caps=new MutableCapabilities();
WebDriver driver=new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);

driver.get("https://www.google.com/");
Assert.assertTrue(driver.getTitle().matches("Google"));

System.out.println("changes in develop branch of gitstuff_2022");



	}

}
