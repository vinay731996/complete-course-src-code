import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise80 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

	    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/loginpagePractise//");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");

		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
      // driver.findElement(By.cssSelector("#okayBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		
		WebElement options=driver.findElement(By.cssSelector("select[class='form-control']"));
		
		Select option=new Select(options);
		
		option.selectByIndex(2);
		
		driver.findElement(By.cssSelector("input[name='terms']")).click();
		
		driver.findElement(By.cssSelector("input[name='signin']")).click();
		
	//	WebDriverWait wait1=new  WebDriverWait(driver,Duration.ofSeconds(10));
		
	//	wait1.until(ExpectedConditions.visibilityOfElementLocated(null))
		 
	}

}
