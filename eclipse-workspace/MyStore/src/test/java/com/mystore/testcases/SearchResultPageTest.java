package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

public class SearchResultPageTest extends BaseClass{
		
	@Parameters("browser")
	@BeforeMethod(groups={"smoke","regression","sanity"})
	public void setup(String browser) {
		launchApp(browser);
	}


	@AfterMethod(groups={"smoke","regression","sanity"})
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test(groups="smoke")
	public void productAvability() throws Throwable
	{
		IndexPage indexpage=new IndexPage();
		
		SearchResultPage searchResultPage=	indexpage.searchProduct("t-shirt");
		
		boolean result=searchResultPage.isProductAvailable();
		
		Assert.assertTrue(result);
	}


}
