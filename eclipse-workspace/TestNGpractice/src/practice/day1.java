package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void afterTest()
	{
		System.out.println("i am the last in test folder");
	}
	@Test
	public void demo()
	{
		System.out.println("Hello world");	
	}
	@AfterClass
	public void demo2()
	{
		System.out.println("bye");	
	}


}
