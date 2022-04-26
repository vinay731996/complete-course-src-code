package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	
	WebDriver driver;

@Given("^user is on searchengine page$")
public void user_is_on_searchengine_page() {
	
	String projectPath=System.getProperty("user.dir");
	
	//System.out.println(projectPath);
	
	
	System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe" );

     driver = new ChromeDriver();
     
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
    
}

@When("^use enter into the searchfield$")
public void use_enter_into_the_searchfield() {
	
	driver.findElement(By.name("q")).sendKeys("automation");
   
}

@When("^click on search$")
public void click_on_search() {
	
	//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys(Keys.ENTER);
  
}

@Then("^user is navigated to the search page$")
public void user_is_navigated_to_the_search_page() {
	
System.out.println(	driver.getTitle());

driver.quit();
 
}

}
