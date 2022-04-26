import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserNavigations {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			
			//difference b/w get and navigate
			driver.get("https://www.google.com");
			
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
			
			
			//
			driver.navigate().back();
			driver.navigate().forward();
			}

}
