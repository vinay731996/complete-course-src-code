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

By headerTitle=By.xpath("//h3[normalize-space()='An Academy to learn Everything about Testing']");






public WebElement login() {
	
	 return driver.findElement(login);
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

public WebElement  getHeader() {
	
	 return driver.findElement(headerTitle);
}


}