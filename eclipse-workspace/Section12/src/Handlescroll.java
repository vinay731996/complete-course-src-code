import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handlescroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// windows scroll

		js.executeScript("window.scrollBy(0,600)");

		// particular compound scroll

		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");

		// add all
		int sum = 0;

		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getText());

			sum = sum + Integer.parseInt(values.get(i).getText());
		}

		System.out.println(sum);

		// extract total value

		int totalamt = Integer
				.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

		// DO ASSERTION

		Assert.assertEquals(sum, totalamt);

		System.out.println("test case is passed");

		driver.quit();

	}

}
