package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	
	@FindBy(xpath = "//a[@class='login']") 
	private WebElement signInBtn;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement myStoreLogo;
	
	@FindBy(id="search_query_top")
	private WebElement searchProductBox;
	
	@FindBy(name="submit_search")
	private WebElement searchButton;
	

	
	public IndexPage()
	{
	 PageFactory.initElements(getDriver(), this);
	}
	
	
	public LoginPage clickOnSignIn() throws InterruptedException
	{
		Action.click(getDriver(),signInBtn );

		signInBtn.click();
    		
		return new LoginPage();
	}
	public boolean validateLogo()
	{
	return Action.isDisplayed(getDriver(), myStoreLogo);
	}
	
	public String getMyStoreTitle()
	{
		return getDriver().getTitle();
	  
	}
	
	public SearchResultPage searchProduct(String productName)
	{
		Action.type(searchProductBox, productName);
		Action.click(getDriver(), searchButton);
		 return new SearchResultPage();
		
	}
	}
	

