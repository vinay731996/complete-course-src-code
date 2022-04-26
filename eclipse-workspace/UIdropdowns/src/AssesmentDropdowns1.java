import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssesmentDropdowns1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//one ways 
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		if(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		{
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		}	
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()); 
		
		// second way
		
	/*	driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()); */
		
	 //find out no.of checkbox?
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.quit();		

	}

}
