package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testdemo1 {
	@BeforeMethod
	public void demo()
	{
		System.out.println("vinay");
	}
	@Test
	public void testcasedemo() {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
		System.out.println("hello world");
		
	}

	
	@Test(priority = 1)
	public void demo1()
	{
		System.out.println("vijay");
	}
	
	

}
