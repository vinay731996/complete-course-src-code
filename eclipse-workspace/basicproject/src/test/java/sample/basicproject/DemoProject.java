package sample.basicproject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoProject {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	

		

	}

}
