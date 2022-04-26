import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseUIpractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);

		/*
		 * //one way without passing arguments
		 * 
		 * a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1")))
		 * .contextClick().build().perform();
		 */

		// second way

		WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		a.moveToElement(move).build().perform();

		a.moveToElement(driver.findElement(By.cssSelector("input[type='text']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().build().perform();

	}

}
