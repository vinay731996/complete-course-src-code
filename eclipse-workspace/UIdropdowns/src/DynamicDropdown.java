import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//without Index
		
		//with index
				//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		//handling calender selecting the present date
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
//validing if UI Elements ard disabled or enabled with attribute
		
		
		/* System.out.println( driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());//it give false but it showing true
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); */
		
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); //to pull attribute
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); 
		 
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.print("it is enabled");
		}
		
		

		
		
		

	}

}
