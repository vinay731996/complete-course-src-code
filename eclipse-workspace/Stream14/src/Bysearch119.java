import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Bysearch119 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");
		
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		  
		List<WebElement> filteredlist= veggies.stream().filter(veggie->veggie.getText().contains("Rice"))
				.collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filteredlist.size());
		
		//driver.quit();
 
	}

}
