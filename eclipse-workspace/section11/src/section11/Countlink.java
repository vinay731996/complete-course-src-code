package section11;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlink {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// total link in page

		System.out.println(driver.findElements(By.tagName("a")).size());
		


		// link in footersection

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//count link in coloumdriver
		WebElement  coloumndriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		int a=coloumndriver.findElements(By.tagName("a")).size();
			
		
		// open all links in separate tabs
		
		
		for(int i=1;i<a;i++)
		{
			
			String clickonlinttab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinttab);
		    
		    Thread.sleep(5000L);
		}			
		
		
		//get Tittle for all the tabs
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it= abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}	

		//driver.quit();
		
	}

}
