package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.mystore.actiondriver.Action;
import com.mystore.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Properties prop;
	//public static WebDriver driver;
	
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>(); //for parallel execution thread local 
	
	@BeforeSuite(groups={"smoke","regression","sanity"})
	public void loadConfig() throws IOException
	{
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}
	
	 
	
	public static void launchApp(String browserName1) {
	
		//String browserName1 = prop.getProperty("browser");
		
		if (browserName1.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			// driver=new ChromeDriver();
			// Set Browser to ThreadLocalMap
			 driver.set(new ChromeDriver());
			
		} else if (browserName1.equalsIgnoreCase("FireFox")) {
			
			WebDriverManager.firefoxdriver().setup();
			// driver=new FirefoxDriver();
			 driver.set(new FirefoxDriver());


		} else if (browserName1.equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			 //driver=new EdgeDriver();
			 driver.set(new EdgeDriver());

		}else if (browserName1.equalsIgnoreCase("Opera")) {
			
			WebDriverManager.operadriver().setup();
			
			 //driver=new EdgeDriver();
			 driver.set(new OperaDriver());
		}
		
		getDriver().manage().window().maximize();
		
		Action.implicitWait(getDriver(), 10);
		//Action.pageLoadTimeOut(driver, 30);
		
		getDriver().get(prop.getProperty("url"));
		
	}
	

	@AfterSuite(groups = { "Smoke", "Regression","Sanity" })
	public void afterSuite() {
		ExtentManager.endReport();
	}

	

}
