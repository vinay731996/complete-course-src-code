package Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs2 {
	static RemoteWebDriver driver;
	 
	

	public static void main(String[] args) throws MalformedURLException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.setPlatformName("Windows 10");
		options.setBrowserVersion("latest");

		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username","oauth-vinay731996-71aae" );
		sauceOptions.put("accessKey","cbd63449-5577-4aea-8925-93e034dd5e24" );
		//sauceOptions.put("name", testInfo.getDisplayName());

		options.setCapability("sauce:options", sauceOptions);
		URL url = new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");

		driver = new RemoteWebDriver(url, options);
		
		
	}

}
