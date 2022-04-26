import java.io.File;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions {

	public static void main(String[] args) {
        
		//for addextentions
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File(""));
		
		//add proxies
		
		  Proxy proxy= new Proxy();
		  proxy.setHttpProxy("");
		  options.setCapability("proxy", proxy);
		  
		  //block popwindow
		  
		     //https://chromedriver.chromium.org/capabilities
		  
		  
		  //set downloaddirectory
		  
		  
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		  
		  
		  
		  
		  
	}

}
