package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resource.base;

public class Homepage extends base {
	 
	public WebDriver driver;
	
	@BeforeMethod
	public void initialisedriver() throws IOException
	{
		driver = initializingdriver();
        driver.get( prop.getProperty("url"));
	}
	

	@Test(dataProvider="getdata")
	public void basePageNavigation(String email,String pass) throws IOException {

		
		Landingpage lp = new Landingpage(driver); 
		lp.nothanks().click();
		lp.login().click();

		Loginpage logpage = new Loginpage(driver);
		logpage.email().sendKeys(email);
		logpage.password().sendKeys(pass);
		logpage.submit_login().click();
		
		
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3] [2];
		
		data[0][0]="vinay@gmail.com";
	    data[0][1]="1234";

	    
	    		
	    data[1][0]="vijay@gmail.com";
		data[1][1]="5678";


	    data[2][0]="lakshmi@gmail.com";
		data[2][1]="90123";

		return data;
	}
	
	@AfterMethod
	public void teadown()
	{
		driver.quit();

	}
	

	

}
