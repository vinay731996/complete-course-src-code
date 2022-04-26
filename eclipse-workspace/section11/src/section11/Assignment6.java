package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();

		String opt = driver.findElement(By.cssSelector("label[for='benz']")).getText();

		System.out.println(opt);

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		Select s = new Select(dropdown);

		s.selectByVisibleText(opt);

		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String alertmsg = driver.switchTo().alert().getText();
		if (alertmsg.contains(opt)) {
			driver.switchTo().alert().accept();
		}

		System.out.println("assignmebnt 6 is completed");

	}

}
