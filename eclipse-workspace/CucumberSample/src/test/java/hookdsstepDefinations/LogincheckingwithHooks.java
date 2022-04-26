package hookdsstepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogincheckingwithHooks {
	
	WebDriver driver;
	
	@Before
	public void initializedriver() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
     	driver.get("https://automationpractice.com/index.php");
		
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	
	@Given("^user navigated to login page$")
	public void user_navigated_to_login_page() {
		
		System.out.println("I m inside scenario 1");
	 
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
	   
	}

	@Then("^user navigated to Home Page$")
	public void user_navigated_to_home_page() {
	 
	}

	@Given("^user landed on the Indexpage$")
	public void user_landed_on_the_indexpage() {
		
		System.out.println("I m inside scenario 2");
	    
	}

	@When("^user naviagted to login page and enter username and paswword$")
	public void user_naviagted_to_login_page_and_enter_username_and_paswword() {
	   
	}

	@Then("^user get a erorr msg  invalid crediantiality$")
	public void user_get_a_erorr_msg_invalid_crediantiality() {
	   
	}


}
