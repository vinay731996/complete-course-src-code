import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablesorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("th[aria-label*='Veg/fruit']")).click();

		List<WebElement> itemsWebelement = driver.findElements(By.xpath("//tr/td[1]")); //tbody tr td:nth-child(1)

		List<String> itemsinText = itemsWebelement.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> actualsorted = itemsWebelement.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());
				
//
//		for (int i = 0; i < itemsinText.size(); i++) {
//			if (itemsinText.get(i).equals(actualsorted.get(i))) {
//				
//				System.out.println(" "+itemsinText.get(i)+" "+actualsorted.get(i));
//
//			}	
//			
//			}
//		System.out.println("items are in sorted");

		Assert.assertTrue(itemsinText.equals(actualsorted));
		
		//117 identify only beans in the time and print price of it
		
		List<String> price=itemsWebelement.stream().filter(s->s.getText().contains("Beans")).map(s->vegsPrices(s)).collect(Collectors.toList());
		                    
		                   price.forEach(s-> System.out.println(s));
		
		}
	   public static String vegsPrices(WebElement s)
	   {
		String pricevalue=   s.findElement(By.xpath("following-sibling::td[1]")).getText();
		   return pricevalue;
		   
	   }
	   

	}


