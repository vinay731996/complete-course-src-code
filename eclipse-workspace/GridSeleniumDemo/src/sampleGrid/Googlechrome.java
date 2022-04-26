package sampleGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.v85.page.Page.CaptureScreenshotFormat;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Googlechrome {

	@Test

	public void google() throws MalformedURLException {
		
		
		DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setBrowserName("Chrome");
		


		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.10:4444"), caps); // hub and pass the
																								// desirable obj

		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("input[name$='q']")).sendKeys("helloworld");

		driver.quit();

	}
}
