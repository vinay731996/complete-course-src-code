package practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class Day2 {
	
	@AfterSuite
	public void demo1()
	{
		System.out.println("hi vinay");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
	System.out.println("i am the first");
	}

}
