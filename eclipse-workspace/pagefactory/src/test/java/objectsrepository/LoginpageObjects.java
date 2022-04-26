package objectsrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageObjects {
	WebDriver driver;
	
	public LoginpageObjects(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Log In']")
	WebElement login_submit;
	
	@FindBy(xpath="//a[normalize-space()='Forgotten password?']")
	WebElement forgottenpass;
	
	@FindBy(xpath="//*[text()='Create New Account']")
	WebElement createnewaccount;
	
	@FindBy(linkText="Create a Page")
	WebElement createpage;
	
	
 // By username= By.xpath("//input[@id='email']");
//  By password=By.xpath("//input[@id='pass']");
//  By login_submit=By.xpath("//button[text()='Log In']");
//  By forgottenpass=By.xpath("//a[normalize-space()='Forgotten password?']");
//  By createnewaccount=By.xpath("//*[text()='Create New Account']");
//  By createpage=By.linkText("Create a Page");
//  
//  
  
  public WebElement username()
  {
     return username;
  }
  public WebElement password()
  {
     return password;
  }
  public WebElement login_submit()
  {
     return login_submit;
  }
  public WebElement forgottenpass()
  {
     return forgottenpass;
  }
  public WebElement createnewaccount()
  {
     return createnewaccount;
  }
  public WebElement createpage()
  {
     return createpage;
  }
	

}
