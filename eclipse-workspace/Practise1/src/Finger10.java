
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Finger10 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://10fastfingers.com/widgets/typingtest");

		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button[class='CybotCookiebotDialogBodyButton']")).click();

		// List<WebElement> words=driver.findElements(By.cssSelector("div[id='row1']
		// span"));

		int size = driver.findElements(By.cssSelector("div[id='row1'] span")).size();

		System.out.println(size);

		Thread.sleep(5000);

		for (int i = 0; i < size; i++) {
			String a = driver.findElement(By.cssSelector("span[class='highlight']")).getText();

			Keys key = Keys.SPACE;

			driver.findElement(By.xpath("//input[@id='inputfield']")).sendKeys(a);
			driver.findElement(By.xpath("//input[@id='inputfield']")).sendKeys(key);

		}
		driver.quit();
	}
}
