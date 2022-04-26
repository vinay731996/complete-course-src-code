package section38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingWindowAuthenticationPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\gridfile\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();
		
	System.out.println(driver.findElement(By.cssSelector("div[class='example'] p")).getText());
		
		driver.quit();

	}

}
