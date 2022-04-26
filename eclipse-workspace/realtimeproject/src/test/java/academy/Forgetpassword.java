package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Forgotpasspage;
import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resources.base;

public class Forgetpassword extends base{
	public WebDriver driver;

	
	
	@BeforeMethod
	public void initialisedriver() throws IOException
	{ 
		driver = initializingdriver();
		
        driver.get( prop.getProperty("url"));
        
	}
	
	
	
	
	@Test
	public void forgetpass()
	{
		Landingpage l=new Landingpage(driver);
		
		l.nothanks().click();
	Loginpage	lp=l.login();
	
	Forgotpasspage	fp=lp.getforgotpass();
	
	 fp.email().sendKeys("vinay731996@gmail.com");
	 fp.getsendmeint().click();
	}
	
	
	@AfterMethod
	public void teadown()
	{
		driver.quit();

	}

}
