package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public WebDriver driver;
	public Properties prop;


	public WebDriver initializingdriver() throws IOException {
		

				
	    prop = new Properties();
		//FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\E2E\\src\\main\\java\\resource\\driver.properties");
		
	    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resource\\driver.properties");

	    prop.load(fis);

		
	   // String	browserName1=System.getProperty("browser");//it is for jenkins parameters
		
	String browserName1 = prop.getProperty("browser");
		
		
		if (browserName1.contains("chrome"))   //if(browserName1.equal("chrome")) /because something is extract of properties files we can use == symbols
		{                                     //equal() is comparison between values

//            WebDriverManager.chromedriver().setup();
//            driver=new ChromeDriver();
//            
            
             //for headless and normal browser
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			if(browserName1.contains("headless"))
			{
			options.addArguments("headless");
			}
            driver=new ChromeDriver(options);
            
		} 
		else if (browserName1.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
             driver=new FirefoxDriver();	

		} 
		else if((browserName1.equalsIgnoreCase("ie")) )
		{
			WebDriverManager.edgedriver().setup();
             driver=new EdgeDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
    //   String url=prop.getProperty("url");	
    //  driver.get(url);
    
	 return driver;	
		}
	
	public String getScreenShot(String testcaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot	ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile=System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileUtils.copyFile(src,new File(destinationfile) );
		return destinationfile;
		}
	
	}
	
