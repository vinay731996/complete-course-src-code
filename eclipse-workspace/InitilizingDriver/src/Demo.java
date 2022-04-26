import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		
		
		
		if(true)
		{
		System.setProperty("webdriver.chrome.driver","C:\\gridfile\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.quit();
		}
		
		if(true)
		{
		System.setProperty("webdriver.gecko.driver","C:\\gridfile\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.quit();
		}
		
		if(true)
		{
		System.setProperty("webdriver.edge.driver","C:\\gridfile\\msedgedriver.exe" );
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		
		driver.quit();
		}

		
		
		
		

	}

}
