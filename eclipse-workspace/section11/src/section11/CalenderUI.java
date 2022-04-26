package section11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("May")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		// List<WebElement> dates = driver.findElements(By.cssSelector(".day"));

		int count = driver.findElements(By.cssSelector(".day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();

			if (text.equalsIgnoreCase("23")) {

				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
	}

}
