package org.demo.project.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1Test {

	@Test
	public void  login() throws InterruptedException {
		System.out.println("login success");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
	
	
	@Test
	public void username()
	{
		System.out.println("username");
		
	}
	
	@Test
	public void password()
	{
		System.out.println("password");
	}
	@Test
	public void signUp()
	{
	System.out.println("signUP");
	}
	

}
