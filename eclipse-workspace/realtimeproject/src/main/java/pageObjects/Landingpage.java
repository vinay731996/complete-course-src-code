package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	WebDriver driver;
	
	public Landingpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
By login=By.xpath("//span[normalize-space()='Login']");
By nothanks=By.xpath("//button[normalize-space()='NO THANKS']");
By title=By.className("text-center");

By navbar=By.cssSelector(".navbar-collapse.collapse"); 





public Loginpage login() {
	
	 driver.findElement(login).click(); 
	 Loginpage lp = new Loginpage(driver);
	 return lp;
}

public WebElement nothanks() {
	
	 return driver.findElement(nothanks);
}

public WebElement  title() {
	
	 return driver.findElement(title);


}
public WebElement  getnavbar() {
	
	 return driver.findElement(navbar);
}
}