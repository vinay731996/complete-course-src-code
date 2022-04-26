/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author vinay
 *
 */
public class LoginPage extends BaseClass{
	
	

	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="passwd")
	private WebElement password;

	@FindBy(id="SubmitLogin")
	private WebElement signInBtn;
	
	@FindBy(name="email_create")
	private WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	private WebElement createNewAccountBtn;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String uname, String pswd) throws Throwable   {
		Action.scrollByVisibilityOfElement(getDriver(), userName);
		Action.type(userName, uname);
		Action.type(password, pswd);
		Action.click(getDriver(), signInBtn);
		Thread.sleep(2000);
		return new HomePage();
		 
	}
	
	public AddressPage login1(String uname, String pswd) throws Throwable {
		Action.scrollByVisibilityOfElement(getDriver(), userName);
		Action.type(userName, uname);
		Action.type(password, pswd);
		Action.click(getDriver(), signInBtn);
		Thread.sleep(2000);
		return new AddressPage();
		
	}
	
	public AccountCreationPage createNewAccount(String newEmail) throws Throwable {
		
		Action.scrollByVisibilityOfElement(getDriver(), emailForNewAccount);
		Action.type(emailForNewAccount, newEmail);
		Action.click(getDriver(), createNewAccountBtn);
		Thread.sleep(3000);
		return new AccountCreationPage();
	}


		
	
	
	

	
}
