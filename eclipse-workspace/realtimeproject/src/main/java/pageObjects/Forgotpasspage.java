package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpasspage {
	 
 WebDriver driver;
	
	public  Forgotpasspage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By email=By.cssSelector("#user_email");
	By sendmeinst=By.cssSelector("input[value='Send Me Instruction']");

	
	
	public WebElement email() {
		
		 return driver.findElement(email);
	}
	
	public WebElement getsendmeint() {
		
		 return driver.findElement(sendmeinst);
	}
 
  

	

}
