import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// step 1 calculate no. of rows in it

		List<WebElement> rowsize = driver.findElements(By.cssSelector("table[name='courses'] tr"));

		System.out.println("No of rows =" + rowsize.size());

		// step 2 calculate no.of coloumn int it

		List<WebElement> coloumnsize = driver.findElements(By.cssSelector("table[name='courses'] th"));

		System.out.println("No of coloumns=" + coloumnsize.size());
		
		//print row2 values
		System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText());

		driver.quit();

	}

}
