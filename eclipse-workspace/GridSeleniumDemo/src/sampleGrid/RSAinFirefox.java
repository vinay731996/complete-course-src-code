package sampleGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver.Capability;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSAinFirefox {
	
	@Test

	public void RsA() throws MalformedURLException {

		FirefoxOptions caps = new FirefoxOptions();

		

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.10:4444"), caps); // hub and pass the
																								// desirable obj

		driver.get("https://www.rahulshettyacademy.com/#/index");

		driver.getTitle();

		

		driver.quit();

	}

}
