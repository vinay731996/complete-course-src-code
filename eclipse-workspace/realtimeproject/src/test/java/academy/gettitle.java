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

public class gettitle extends base {
	
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
	@Test
	public void checktitle() throws IOException
	{
		//driver = initializingdriver();
        //driver.get( prop.getProperty("url"));
          log.info("pop is displayed"); 
		Landingpage lp = new Landingpage(driver);
		lp.nothanks().click();
		   log.info("no thanks button clicked");
		//System.out.println(lp.title().getText());
		
	Assert.assertEquals(lp.title().getText(), " COURSES");
       log.info("title is matching");       
	}
	@AfterMethod
	public void teadown()
	{
		driver.quit();
		
		log.info("driver is closed");

	}
	

		
	
	

}
