import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlickautomate {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		
//		if(true)
//		{
//		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");//broken link
//		
//		
//		//
//		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int resCode=conn.getResponseCode();
//		
//		System.out.println(resCode);
//		
//		}
//     String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int resCode=conn.getResponseCode();
//		
//		System.out.println(resCode);
//		

		//for multiple link
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert a=new SoftAssert();
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode=conn.getResponseCode();
			
			System.out.println(resCode);
			a.assertTrue(resCode<400,"The link with text "+link.getText()+"is broken withe code"+resCode);
			
			
		}
		
		a.assertAll();
		
		//driver.quit();
		


	}

}
