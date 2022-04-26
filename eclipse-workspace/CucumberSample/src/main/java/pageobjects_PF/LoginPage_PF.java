/**
 * 
 */
package pageobjects_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	WebDriver driver;

	@FindBy(id = "email")
	private WebElement userName;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement signInBtn;

	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}

	public void getUserName(String uname) {

		userName.sendKeys(uname);

	}

	public void getPassword(String pass) {

		password.sendKeys(pass);

	}

	public void clickOnSignInBtn() {

		signInBtn.click();

	}

}
