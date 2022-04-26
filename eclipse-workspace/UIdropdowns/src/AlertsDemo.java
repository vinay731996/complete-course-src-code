import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
        
		 String text ="Rahul";

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// one alert type
		
		
		/*driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept(); */
		
		driver.findElement(By.id("name")).sendKeys(text);	
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		//second alert type
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
	}

}
