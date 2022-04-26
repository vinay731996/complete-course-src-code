package pageObjectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class IndexPage  {
	
	WebDriver driver;	
	
private	 By signInBtn= By.xpath("//a[@class='login']");
	 
	 
	 
	 public IndexPage(WebDriver driver)
		{
		 this.driver=driver;
		}
	 
	 public void signInBtn()
	  {
	     driver.findElement(signInBtn).click();
	  }
	
	}
	

