import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Usinglocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\USER\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		// by using normal locators
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vinay731996@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vinay");
	
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.findElement(By.className("_9ay7")).getText());
  
       driver.findElement(By.linkText("Forgotten password?")).click();   
       
       //using xpath
       driver.findElement(By.xpath("//a[@name='reset_action']")).click();
       
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("vinay@gmail.com");
		
		driver.findElement(By.xpath("//button[@name='did_submit']")).click();
		

		  driver.findElement(By.xpath("//button[@name='reset_action']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='n']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@name='reset_action']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='_585r _50f4']")).getText());

	
		

		
      // Css selector locators
        
      //  driver.get("https://www.facebook.com/");
	//	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vinay731996@gmail.com");
	//	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("vinay");
		
      //  driver.findElement(By.cssSelector("button[name='login']")).click();
		
	//	System.out.println(driver.findElement(By.cssSelector("._9ay7")).getText());
  
     

        
  
		
        
        
		
	    
	}

}
