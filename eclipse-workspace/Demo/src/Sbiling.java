import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbiling {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			//sibling to sibling
		
		System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());
		
		//siblling tko parent
		System.out.print(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());		
		

	}

}
