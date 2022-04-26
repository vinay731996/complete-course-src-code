package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resource.base;

public class checknavigationbar extends base {
		
  public WebDriver driver;
  
	@BeforeMethod
	public void initialisedriver() throws IOException
	{
		driver = initializingdriver();
        driver.get( prop.getProperty("url"));
	}
	@Test
	public void checknavbar() throws IOException {
		//driver = initializingdriver();
        //driver.get( prop.getProperty("url"));

		Landingpage lp = new Landingpage(driver);
		lp.nothanks().click();

		
//	boolean	a=lp.getnavbar().isEnabled();
//	
//	Assert.assertEquals(a, true);
		
		Assert.assertTrue(lp.getnavbar().isEnabled());
	}
	@AfterMethod
	public void teadown()
	{
		driver.quit();

	}
	
		
	
	

}
