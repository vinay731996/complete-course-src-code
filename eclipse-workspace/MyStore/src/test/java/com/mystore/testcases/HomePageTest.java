package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass{
	
	
	LoginPage  loginPage;
	HomePage homepage;
	
	
	@Parameters("browser")
	@BeforeMethod(groups={"smoke","regression","sanity"})
	public void setup(String browser) {
		launchApp(browser);
	}

	
	@AfterMethod(groups={"smoke","regression","sanity"})
    public void tearDown()
    {
		getDriver().quit();
    }
	
	@Test(groups="smoke")
	public void whisListTest() throws Throwable
	{
		 
		IndexPage indexPage=new IndexPage();

			
	     loginPage=indexPage.clickOnSignIn();
	     
	     homepage= loginPage.login(prop.getProperty("username"),prop.getProperty("password")) ;  
	    
	  boolean  result=  homepage.validateMyWishList();
	  
	  Assert.assertTrue(result);
		
	}
	@Test(groups="smoke")
	public void orderHistoryTest() throws Throwable
	{
		IndexPage indexPage=new IndexPage();

		
	     loginPage=indexPage.clickOnSignIn();
	     
	     homepage= loginPage.login(prop.getProperty("username"),prop.getProperty("password")) ;  
	    
	  boolean  result=  homepage.validateOrderHistory();
	  
	  Assert.assertTrue(result);
		
	}
	
	
	

}
