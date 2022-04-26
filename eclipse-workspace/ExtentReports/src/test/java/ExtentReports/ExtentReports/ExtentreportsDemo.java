package ExtentReports.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExtentreportsDemo {
	
	ExtentReports extent;
	@BeforeTest
	public void config() {
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Web Automation Results");

		reporter.config().setDocumentTitle("Test Results");

		extent =new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "vinay kumar");
		
	}




@Test
public void initialDemo() {
	ExtentTest test=extent.createTest("Initial Demo");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/#/index");
	System.out.println(driver.getTitle());
	driver.quit();
	//test.fail("result do not match");
	extent.flush();
	
	
}

}