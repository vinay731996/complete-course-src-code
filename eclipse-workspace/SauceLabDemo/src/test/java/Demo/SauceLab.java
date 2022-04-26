package Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;



public class SauceLab {

	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		
		
		
	
		  ChromeOptions options = new ChromeOptions();
	        options.setPlatformName("Windows 10");
	        options.setBrowserVersion("latest");

	     WebDriver driver = new RemoteWebDriver(new URL("https://oauth-vinay731996-71aae:cbd63449-5577-4aea-8925-93e034dd5e24@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), options);
	       
	     
	       
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();

		driver.get("https://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		
	
		
			
		driver.findElement(By.id("email")).sendKeys("vinayvinay1@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("vinayvinay1");
		
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		Thread.sleep(3000);
		
		String welcomemsg=driver.findElement(By.cssSelector(".info-account")).getText();
		
		System.out.println(welcomemsg);
	      
	     driver.quit();
	      
	    
	      
	      
	      
	      

	}

}
