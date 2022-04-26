package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.Landingpage;
import resource.base;

public class gettitle extends base {
	
	  public WebDriver driver;
	public  Landingpage lp;

	@BeforeTest
	public void initialisedriver() throws IOException
	{
		driver = initializingdriver();
		
        driver.get( prop.getProperty("url"));
	}
	@Test
	public void checktitle() throws IOException
	{
		//driver = initializingdriver();
        //driver.get( prop.getProperty("url"));

		 lp = new Landingpage(driver);
		lp.nothanks().click();

		//System.out.println(lp.title().getText());
		
	Assert.assertEquals(lp.title().getText(), "COURSES");
         
	}
	
	
@Test
	
	public void validateHeader() throws IOException
	{
		

Assert.assertEquals(lp.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		}
	@AfterTest
	public void teadown()
	{
		driver.quit();

	}
	

		
	
	

}
