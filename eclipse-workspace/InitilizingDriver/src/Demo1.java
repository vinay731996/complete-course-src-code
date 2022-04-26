import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	
	static String BrowserName="opera";
	static WebDriver driver ;
	
	
	public static void main(String[] args) {
		


		
		
		if(BrowserName.equalsIgnoreCase("opera"))
		{
		
		WebDriverManager.operadriver().setup();
	     driver=new OperaDriver();
		
		}
		
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
		
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
		
		WebDriverManager.firefoxdriver().setup();
	     driver=new FirefoxDriver();
		
		}
		
		else if(BrowserName.equalsIgnoreCase("edge"))
		{
		
		WebDriverManager.edgedriver().setup();
	     driver=new EdgeDriver();
		
		}
		
         driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
	System.out.println(driver.findElement(By.name("q")).isDisplayed());
	
	
		
		driver.quit();

	}

}
