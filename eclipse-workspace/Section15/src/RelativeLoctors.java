import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoctors {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// relative locator

		// syntax-driver.findElement(with (Tagname("")).above(Weblement));-first u have
		// to import relative locators pacakage

		// above
		WebElement nameEditbox = driver.findElement(By.cssSelector("input[name='name']"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());

		// below
		
		     WebElement doblabel=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		     
		     driver.findElement(with(By.tagName("input")).below(doblabel)).click();
		 //right
		     WebElement checkbox=driver.findElement(By.cssSelector("#exampleCheck1"));
		     System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(checkbox)).getText());
		     
		  //left   
		     
		     WebElement radiobutton2=driver.findElement(By.cssSelector("#inlineRadio2"));
		     System.out.println(driver.findElement(with(By.tagName("label")).toLeftOf(radiobutton2)).getText());
		     
		     
		     
		     

	}

}
