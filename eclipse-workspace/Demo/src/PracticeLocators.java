import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.findElement(By.className("_8eso")).getText());
		System.out.println(driver.findElement(By.cssSelector("._8eso")).getText());
		System.out.println(driver.findElement(By.cssSelector("h2._8eso")).getText());
		System.out.println(" ");
		System.out.println("css selector started");
		System.out.println(" ");

		
		System.out.println(driver.findElement(By.cssSelector("h2[class='_8eso']")).getText());

		// not working System.out.println(driver.findElement(By.cssSelector("h2[class='_8eso']:nth-child(1)")).getText());
		System.out.println(driver.findElement(By.cssSelector("div h2")).getText());

		
		System.out.println(" ");

		
		System.out.println("css selector end");	
		System.out.println(" ");

		
		
		System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso']")).getText());
		System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso'][1]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());


		
		
		
		driver.close();
		


		
	}

}
