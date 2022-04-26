import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingmultipleWindowsortabs {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/");
	//switch windows
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles=driver.getWindowHandles();
		
		 Iterator<String> it=handles.iterator();
		 String parentWindowId=it.next();
		 String childWindowId=it.next();
		 
		 driver.switchTo().window(childWindowId);
		 
		 driver.get("https://rahulshettyacademy.com/");
		 
		 String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
                   
		 System.out.println(courseName);
		 
		 driver.switchTo().window(parentWindowId);
		   
		 WebElement name= driver.findElement(By.cssSelector("input[name='name']"));
		 
		name.sendKeys(courseName);
		 
		 //capture weblement partial screenshot with selenium
		
		File file=name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("logo.png"));
		
		//capturing height and width of webelement for ux validation
		
	System.out.println(name.getRect().getDimension().getHeight());
	System.out.println(	name.getRect().getDimension().getWidth());
		
		driver.quit();
		 
		 
		 
	}

}
