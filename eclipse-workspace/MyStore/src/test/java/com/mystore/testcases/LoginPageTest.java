package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class LoginPageTest extends BaseClass{
	
	IndexPage indexPage;
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
	
	
	
	@Test(groups= {"smoke","sanity"},dataProvider = "credentials", dataProviderClass = DataProviders.class)// (from excelsheet to excelclass to dataproviders to loginpageTest)
	public void Login(String uname,String pswd) throws Throwable
	{
	 indexPage=new IndexPage();
	
     loginPage=indexPage.clickOnSignIn();
     
   //  homepage= loginPage.login(prop.getProperty("username"),prop.getProperty("password")) ; 
     
      homepage= loginPage.login(uname,pswd) ;  

    
    String foundUrl= homepage.getCurrURL(); 
    String expecteUrl="http://automationpractice.com/index.php?controller=my-account";
    Assert.assertEquals(expecteUrl, foundUrl);

	
	}
	
	

}
