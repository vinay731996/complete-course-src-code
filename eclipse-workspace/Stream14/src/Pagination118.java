import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination118 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("th[aria-label*='Veg/fruit']")).click();

		List<String> price;
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			 
			 price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getvegsPrices(s)).collect(Collectors.toList());
            
            price.forEach(s-> System.out.println(s));
            
            if(price.size()<1)  //0<1
            {
            	driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            
            }
		
		}while(price.size()<1); //0<1
		
		driver.quit();

	}

	private static String getvegsPrices(WebElement s) {
		
		String pricevalue=   s.findElement(By.xpath("following-sibling::td[1]")).getText();
		   return pricevalue;
		   
		
	}

}
