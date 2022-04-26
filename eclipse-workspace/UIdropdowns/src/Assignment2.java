import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("vinay kumar");
		driver.findElement(By.name("email")).sendKeys("vinay731996@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
        driver.findElement(By.id("exampleCheck1")).click();
        
       WebElement staticdropdown =  driver.findElement(By.cssSelector("#exampleFormControlSelect1")); 
       Select dropdown=new Select(staticdropdown);
       dropdown.selectByVisibleText("Male");
       
       
       driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
      
       //driver.findElement(By.cssSelector("input[type='date']")).click();
       driver.findElement(By.cssSelector("input[type='date']")).sendKeys("12121996");
       
       driver.findElement(By.cssSelector("input[value='Submit']")).click();
      System.out.print(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

       
      

       


       

       

       
       
        
        

        
		
		
		
		

	}

}
