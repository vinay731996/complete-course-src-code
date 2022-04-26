package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

public class AddToCartTest extends BaseClass {

	@Parameters("browser")
	@BeforeMethod(groups={"smoke","regression","sanity"})
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups={"smoke","regression","sanity"})
	public void tearDown() {
		getDriver().quit();
	}

	@Test(groups= {"regression", "sanity"})
	public void validateAddToCart() throws Throwable {
		
		IndexPage indexPage = new IndexPage();

		SearchResultPage searchResultPage = indexPage.searchProduct("t-shirt");

		AddToCartPage addToCartPage = searchResultPage.clickOnProduct();

		addToCartPage.enterQuantity("2");
		addToCartPage.selectSize("S");

		addToCartPage.clickOnAddToCart();
		 
		boolean result=addToCartPage.validateAddtoCart();
		
		Assert.assertTrue(result);
	}

}
