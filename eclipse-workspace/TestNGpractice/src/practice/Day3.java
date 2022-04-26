package practice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void Homeloanweblogin()
	{
		System.out.println("Homeloanweblogin");
	}

	@Test
	public void Homeloanmobilelogin()
	{
		System.out.println("Homeloanmobilelogin");
	}
	@Test 
	public void HomeloanAPIlogin()
	{
		System.out.println("HomeloanAPIlogin");
	}
	
	@BeforeSuite
	public void  login()
	{
	System.out.println("login executed");
	}
}
