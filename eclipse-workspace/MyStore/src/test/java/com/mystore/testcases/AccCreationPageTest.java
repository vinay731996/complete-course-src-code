package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccCreationPageTest extends BaseClass {


	LoginPage loginPage;
	HomePage homepage;
	AccountCreationPage accountCreationPage;

	@Parameters("browser")
	@BeforeMethod(groups={"smoke","regression","sanity"})
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod(groups={"smoke","regression","sanity"})
	public void tearDown() {
		getDriver().quit();
	}

	@Test(groups="sanity")
	public void accCreationValidate() throws Throwable {

		IndexPage indexPage = new IndexPage();

		loginPage = indexPage.clickOnSignIn();

		accountCreationPage = loginPage.createNewAccount("vinay852000@gmail.com");
		
		boolean result = accountCreationPage.validateAcountCreatePage();
		
		Assert.assertTrue(result);

	}
}
