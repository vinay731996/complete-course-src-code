package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Forgotpasspage;
import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resources.base;

public class Homepage extends base {
	
	static Logger log = LogManager.getLogger(gettitle.class);
	  public WebDriver driver;

	@BeforeMethod
	public void initialisedriver() throws IOException
	{ 
		driver = initializingdriver();
		 log.info("driver is initialized");	 
        driver.get( prop.getProperty("url"));
         log.info("land on the homepage");
	}
	

	@Test(dataProvider="getdata")
	public void basePageNavigation(String email,String pass) throws IOException {

		 
		Landingpage l = new Landingpage(driver); 
		
		l.nothanks().click();
		
		Loginpage lp=l.login();

		//Loginpage lp = new Loginpage(driver);
		
		
		
		lp.email().sendKeys(email);
		 log.debug("email keys sended");
		lp.password().sendKeys(pass);
		 log.debug("password keys is sended");
		lp.submit_login().click();
		 log.info("submit_login is clicked");
		 
		 Forgotpasspage	fp=lp.getforgotpass();
			
		 fp.email().sendKeys("vinay731996@gmail.com");
		 fp.getsendmeint().click();
		
		
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2] [2];
		
		
		data[0][0]="vinay@gmail.com";
	    data[0][1]="1234";
	    log.info("first data requriment sended sucessfully");

	    
	    		
	    data[1][0]="vijay@gmail.com";
		data[1][1]="5678";
	    log.info("second data requriment sended sucessfully");

	  

		return data;
	}
	
	@AfterMethod
	public void teadown()
	{
		driver.quit();

	}
	

	

}
