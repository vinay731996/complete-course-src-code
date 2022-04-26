package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
		WebDriver driver;

	 public Loginpage(WebDriver driver) {
			
			this.driver=driver;
		}
		
		
	By email=By.cssSelector("#user_email");

	By password=By.cssSelector("#user_password");
	
	By submit_login=By.xpath("//input[@name='commit']");
	
	By alertmsg=By.cssSelector("div[role='alert']");

	





	public WebElement email() {
		
		 return driver.findElement(email);
	}

	public WebElement password() {
		
		 return driver.findElement(password);
	}
	public WebElement submit_login() {
		
		 return driver.findElement(submit_login);
		 
	}
	public WebElement alertmsg() {
		
		 return driver.findElement(alertmsg);
	}





	}


