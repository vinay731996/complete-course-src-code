import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	 WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	 
	 Select dropdown=new Select(staticdropdown);
     System.out.println(dropdown.getFirstSelectedOption().getText());		

	 //one way
	 dropdown.selectByIndex(3);
     System.out.println(dropdown.getFirstSelectedOption().getText());		
     //second way
     dropdown.selectByVisibleText("AED");
     System.out.println(dropdown.getFirstSelectedOption().getText());	
     //thirdway
     dropdown.selectByValue("INR");
     System.out.println(dropdown.getFirstSelectedOption().getText());	


		
		
	}

}
