import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandlingHTTPcertification {

	public static void main(String[] args) {
    //for chrome
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
    //edge		
		 
		EdgeOptions options1=new  EdgeOptions();
		options1.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\USER\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver=new EdgeDriver(options1);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
   //firefox	
		
		FirefoxOptions options2=new  FirefoxOptions();
		options2.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver.exe" );
		driver=new FirefoxDriver(options2);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());	
		driver.quit();
		

	}

}
