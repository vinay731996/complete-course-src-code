import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		// no. of frames in webpage

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// frame started
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		Actions a = new Actions(driver);

		WebElement souce = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(souce, target).build().perform();

		driver.switchTo().defaultContent();

		// frame end
		
		//come to normal window

		System.out.println(driver.findElement(By.tagName("p")).getText());

	}

}
