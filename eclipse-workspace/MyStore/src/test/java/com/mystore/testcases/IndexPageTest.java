package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.utility.Log;


public class IndexPageTest extends BaseClass {
	
	//private IndexPage indexPage;
	@Parameters("browser")
	@BeforeMethod(groups={"smoke","regression","sanity"})
	public void setup(String browserr) {
		launchApp(browserr);
	}

	@AfterMethod(groups={"smoke","regression","sanity"})
  public void tearDown()
  {
		getDriver().quit();
  }
	@Test(groups={"smoke"})
	public void verifyLogo()
	{
		 Log.startTestCase("verify logo");
		 Log.info("Land on the Index page");
		IndexPage indexPage =new IndexPage();

        boolean result=indexPage.validateLogo();
        Log.info("validating the logo");
        
        Assert.assertTrue(result);
           Log.info("Logo is successful validated");
           Log.endTestCase("verify logo");
	}
	
   @Test(groups="smoke")
	public void verifyTitle()
	
	{	
	   IndexPage indexPage =new IndexPage();

		
	   Assert.assertEquals(indexPage.getMyStoreTitle(),"My Store1");
	 
	}

}
