package section38;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicfileuploadDownload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String  downloadPath=System.getProperty("user.dir"); //project level
		
		System.setProperty("webdriver.chrome.driver","C:\\gridfile\\chromedriver.exe" );

		
		//System.out.println(downloadPath);	

		ChromeOptions options=new ChromeOptions();
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		options.setExperimentalOption("prefs", chromePrefs);		
		

		WebDriver driver = new ChromeDriver(options);
		
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
	   //dynamic path
	   Thread.sleep(3000);
	   
	   File f=new File(downloadPath+"\\13H61A0517-25012018123948(9)_page-0001.jpg");
	   if(f.exists())
	   {
		   System.out.println("File is found");
		   
//		   f.delete();
//		   
//		   System.out.println("file is deleted");
	   }
	   
	   
	   
	  

		
		driver.quit();
		

	}

}
