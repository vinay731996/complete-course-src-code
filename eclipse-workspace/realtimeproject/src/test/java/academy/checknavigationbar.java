package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.base;

public class checknavigationbar extends base {
	
	static Logger log = LogManager.getLogger(gettitle.class);
	  public WebDriver driver;
	@BeforeMethod
	public void initialisedriver() throws IOException
	{
		 log.info("driver is initalising");
		driver = initializingdriver();
		 log.debug("land on the home page");
        driver.get( prop.getProperty("url")); 
	}
	@Test
	public void checknavbar() throws IOException {
		//driver = initializingdriver();
        //driver.get( prop.getProperty("url"));
         log.info("popup is displayed");
		Landingpage lp = new Landingpage(driver);
		 log.debug("nothanks button is displayed");
		lp.nothanks().click();
		 log.info("nothanks button is clicked");

		
//	boolean	a=lp.getnavbar().isEnabled();
//	
//	Assert.assertEquals(a, true);
		log.debug("checking navigationbar");
		Assert.assertTrue(lp.getnavbar().isEnabled());
		log.info("navigation is enabled");
	}
	@AfterMethod
	public void teadown()
	{
		driver.quit();
		log.debug("driver is closed");

	}
	
		
	
	

}
