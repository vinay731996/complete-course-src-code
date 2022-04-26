package pageObjectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
WebDriver driver;
	
	
	private	 By welcomeMsg= By.cssSelector(".info-account");
	

	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	 public void welcomeMsg()
	  {
	   String  welcometxt =  driver.findElement(welcomeMsg).getText();
	   
	   System.out.println(welcometxt);
	  }

}
