package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectsrepository.LoginpageObjects;

public class Loginpage {
	
	
	@Test
	public void  Login()
	{
	 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		LoginpageObjects lp= new LoginpageObjects(driver);
		
		lp.username().sendKeys("vinay73166@gmail.com");
		lp.password().sendKeys("1234");
		lp.login_submit().click();	
		
		
	}

}
