package pageobjects_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage_PF {

	WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signInBtn;

	public IndexPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignIn() {

		signInBtn.click();
	}

}
