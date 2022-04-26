import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
    	driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
//		
      	Thread.sleep(3000);
//		
//
//		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
//		
//		System.out.println(options.size());
//		
//		for(WebElement option:options)
//		{
//
//			if(option.getText().equalsIgnoreCase("United States (USA)"))
//			{
//				option.click();
//				break;
//			}
//		}
		
		 driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
		   
      // driver.quit();
	}
}

