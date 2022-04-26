package section38;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFileByusingAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\gridfile\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		
		driver.findElement(By.cssSelector("a[id='pickfiles'] span")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\autoscriptfolder\\fileUpload.exe");
		
		WebDriverWait w=new WebDriverWait(driver, 10);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTaskTextBtn")));
	
	   driver.findElement(By.cssSelector("#processTaskTextBtn")).click();
	   
	   w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
		
	   driver.findElement(By.cssSelector("#pickfiles")).click();
	     
	   //hard coading if same path not another machines
	   Thread.sleep(3000);
	   
	   File f=new File("C:\\Users\\USER\\Downloads\\13H61A0517-25012018123948(9)_page-0001.jpg");
	   if(f.exists())
	   {
		   System.out.println("File is found");
		   
		   f.delete();
		   
		   System.out.println("file is deleted");
	   }
	   
	   
	   
	   

		
//		driver.quit();
		

	}

}
