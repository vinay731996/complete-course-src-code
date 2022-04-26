package background;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class background { 
	
@Given("^user is on searchengine page in pp$")
public void user_is_on_searchengine_page_in_pp()  {
	
	System.out.println("step1");
}

@When("^use enter into the searchfield in pp$")
public void use_enter_into_the_searchfield_in_pp()  {
}

@Then("^user is navigated to the search page in pp$")
public void user_is_navigated_to_the_search_page_in_pp()  {
}

@And("^click on search in pp$")
public void click_on_search_in_pp()  {
}

}
