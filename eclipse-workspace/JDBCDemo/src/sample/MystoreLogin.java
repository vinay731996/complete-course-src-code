package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;



public class MystoreLogin {
	


	public static void main(String[] args) throws SQLException, InterruptedException {
		
		String host="localhost";

		String port= "3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/MYStore1", "root", "731996");

		Statement s=con.createStatement();  //this road 

		ResultSet rs=s.executeQuery("select * from EmployeeInfo"); //cycle
//		
//		while(rs.next())
//		{
//		   System.out.println(rs.getString("username"));
//		   System.out.println(rs.getString("pass"));
//		}
		
		System.setProperty("webdriver.chrome.driver","C:\\gridfile\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();

		driver.get("https://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		
		while(rs.next())///important 
		{
			String userName= rs.getString("username");
			String password=rs.getString("pass");
		driver.findElement(By.id("email")).sendKeys(userName);
		
		driver.findElement(By.id("passwd")).sendKeys(password);
		}
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		Thread.sleep(3000);
		
		String welcomemsg=driver.findElement(By.cssSelector(".info-account")).getText();
		
		System.out.println(welcomemsg);
		
		driver.quit();
 
	
		
		
		
		
		
	}

}
