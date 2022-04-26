package objectsrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageObjects {
	WebDriver driver;
	
	public LoginpageObjects(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
  By username= By.xpath("//input[@id='email']");
  By password=By.xpath("//input[@id='pass']");
  By login_submit=By.xpath("//button[text()='Log In']");
  By forgottenpass=By.xpath("//a[normalize-space()='Forgotten password?']");
  By createnewaccount=By.xpath("//*[text()='Create New Account']");
  By createpage=By.linkText("Create a Page");
  
  public WebElement username()
  {
     return driver.findElement(username);
  }
  public WebElement password()
  {
     return driver.findElement(password);
  }
  public WebElement login_submit()
  {
     return driver.findElement(login_submit);
  }
  public WebElement forgottenpass()
  {
     return driver.findElement(forgottenpass);
  }
  public WebElement createnewaccount()
  {
     return driver.findElement(createnewaccount);
  }
  public WebElement createpage()
  {
     return driver.findElement(createpage);
  }
	

}
