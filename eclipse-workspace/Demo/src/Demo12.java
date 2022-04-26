import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo12 {

	public static void main(String[] args) {
		
		         System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );
		         WebDriver driver=new ChromeDriver();
		         
		         
		         driver.get("https://www.facebook.com/");
		         System.out.println(driver.getTitle());
		         System.out.println(driver.getCurrentUrl());
		         driver.quit();

		 
		        System.setProperty("webdriver.edge.driver","C:\\Users\\USER\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
				 driver=new EdgeDriver();
				driver.get("https://www.facebook.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.quit();
				
				

				System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver.exe" );
				driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				driver.quit();
				 
				 
 
		
		

	}

}
