package sampleGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AmazonEdge {
	
	@Test

	public void amazon() throws MalformedURLException {

		EdgeOptions caps = new EdgeOptions();
		
		caps.setCapability("browser", "Edge");
	   
	   
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.10:4444"), caps); // hub and pass the
																							// desirable obj

		driver.get("https://www.amazon.in/");

		System.out.println(driver.getTitle());

		

		driver.quit();
	}

}
