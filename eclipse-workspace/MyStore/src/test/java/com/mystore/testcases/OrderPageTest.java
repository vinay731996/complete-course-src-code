package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.SearchResultPage;

public class OrderPageTest extends BaseClass {

	SearchResultPage searchResultPage;
	AddToCartPage addToCartPage;
	OrderPage orderpage;

	@Parameters("browser")
	@BeforeMethod(groups={"smoke","regression","sanity"})
	public void setup(String browser) {
		launchApp(browser);
	}


	@AfterMethod(groups={"smoke","regression","sanity"})
	public void tearDown() {
		getDriver().quit();
	}

	@Test(groups="regression")
	public void validatePrice() throws Throwable {
		IndexPage indexPage = new IndexPage();

		SearchResultPage searchResultPage = indexPage.searchProduct("t-shirt");

		addToCartPage = searchResultPage.clickOnProduct();
		addToCartPage.enterQuantity("2");
		addToCartPage.selectSize("S");
		addToCartPage.clickOnAddToCart();
		OrderPage orderPage = addToCartPage.clickOnCheckOut();
		double unitPrice = orderPage.getUnitPrice();
		double totalPrice = orderPage.getTotalPrice();

		double expectedPrice = (unitPrice * 2) + 2; //it is hardcoding change into dynamic coading

		Assert.assertEquals(totalPrice, expectedPrice);
	}

}
