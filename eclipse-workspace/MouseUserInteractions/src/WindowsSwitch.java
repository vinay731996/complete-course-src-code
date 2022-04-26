import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSwitch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#%");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		// selenium donot how to switch directly

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentid = it.next();

		String childid = it.next();
		//
		driver.switchTo().window(childid);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		// it take 3steps

//		String[] emailId1=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at");
//         
//		String[] emailId2=emailId1[1].trim().split(" ");
//		
//		String emailId=emailId2[0];
//		
		// one line

		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];

		System.out.println(emailId);

		driver.switchTo().window(parentid);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(emailId);

	}

}
