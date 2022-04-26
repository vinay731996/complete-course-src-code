//package stepDefinations;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjectory.HomePage;
//import pageObjectory.IndexPage;
//import pageObjectory.LoginPage;
//
//public class MystoreLoginSteps2_POM {
//	
//	WebDriver driver;
//	
//	IndexPage indexPage;
//	
//	LoginPage loginPage;
//	
//	HomePage homePage;
//	
//@Given("^user is on Indexpage$")
//public void user_is_on_indexpage() {
//	
//String projectPath=System.getProperty("user.dir");
//	
//	//System.out.println(projectPath);
//	
//	
//	System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe" );
//
//     driver = new ChromeDriver();
//     
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//    
//    driver.manage().window().maximize();
//	
//	driver.get("https://automationpractice.com/index.php");
//	
//	
//   
//}
//
//@Given("^user click on sgin button navigate to login page$")
//public void user_click_on_sgin_button_navigate_to_login_page() {
//	
//	 indexPage=new IndexPage(driver);
//	 
//	 indexPage.signInBtn();
//}
//
//@When("^use enters (.*) and (.*) in mystore$")
//public void use_enters_username_and_password_in_mystore(String username,String password) {
//	
//	 loginPage=new LoginPage(driver);
//	 
//	 loginPage.userName(username);
//	 
//	 loginPage.password(password);
//	 
//	
////	driver.findElement(By.id("email")).sendKeys(username);
////	
////	driver.findElement(By.id("passwd")).sendKeys(password);
//}
//
//@When("^clicks on login button in mystore$")
//public void clicks_on_login_button_in_mystore() throws InterruptedException {
//	
//	loginPage.signInBtn();
//	
//	//driver.findElement(By.id("SubmitLogin")).click();
//	
//	Thread.sleep(3000);
//	
//
//}
//
//@Then("^user is navigated to the home page in mystore$")
//public void user_is_navigated_to_the_home_page_in_mystore() {
//	
//	HomePage homePage=new HomePage(driver);
//	
//	homePage.welcomeMsg();
//	
////	String welcomemsg=driver.findElement(By.cssSelector(".info-account")).getText();
////	
////	System.out.println(welcomemsg);
//	
//	driver.quit();
//   
//}
//
//}
