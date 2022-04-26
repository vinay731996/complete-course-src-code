package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		System.out.println("user land on the login page");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("^use enters username and password$")
	public void use_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("user entered username and password");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user cliked the login button");

	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println(" user navigated to the home page");

	}

}
