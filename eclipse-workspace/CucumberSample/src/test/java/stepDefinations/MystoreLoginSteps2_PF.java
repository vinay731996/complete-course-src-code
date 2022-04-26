package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects_PF.HomePage_PF;
import pageobjects_PF.IndexPage_PF;
import pageobjects_PF.LoginPage_PF;

public class MystoreLoginSteps2_PF {
	
	WebDriver driver;
	
	IndexPage_PF indexPage;
	
	LoginPage_PF loginPage;
	
	HomePage_PF homePage;

@Given("^user is on Indexpage$")
public void user_is_on_indexpage() {
	
String projectPath=System.getProperty("user.dir");
	
	//System.out.println(projectPath);
	
	
	System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe" );

     driver = new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.manage().window().maximize();
	
	driver.get("https://automationpractice.com/index.php");
	
	
   
}

@Given("^user click on sgin button navigate to login page$")
public void user_click_on_sgin_button_navigate_to_login_page() {
	
	 indexPage=new IndexPage_PF(driver);
	 
	 indexPage.clickOnSignIn();
  
}

@When("^use enters (.*) and (.*) in mystore$")
public void use_enters_username_and_password_in_mystore(String username,String password) {
	
	 loginPage=new LoginPage_PF(driver);
	 
	 loginPage.getUserName(username);
	 
	 loginPage.getPassword(password);
}

@When("^clicks on login button in mystore$")
public void clicks_on_login_button_in_mystore() throws InterruptedException {
	
   loginPage.clickOnSignInBtn();
	
	Thread.sleep(3000);
	

}

@Then("^user is navigated to the home page in mystore$")
public void user_is_navigated_to_the_home_page_in_mystore() {
	
	HomePage_PF homePage=new HomePage_PF(driver);
	
	homePage.getWelcomeMsg();
	
	driver.quit();
   
}

}
