/**
 * 
 */
package pageObjectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class LoginPage  {
	
	WebDriver driver;
	
	
	private	 By userName= By.id("email");

	private	 By password= By.id("passwd");

	private	 By signInBtn= By.id("SubmitLogin");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	 public void userName(String username)
	  {
	     driver.findElement(userName).sendKeys(username);
	  }
	 public void password(String password1)
	  {
	     driver.findElement(password).sendKeys(password1);
	  }
	 public void signInBtn()
	  {
	     driver.findElement(signInBtn).click();
	  }

	
	


		
	
	
	

	
}
