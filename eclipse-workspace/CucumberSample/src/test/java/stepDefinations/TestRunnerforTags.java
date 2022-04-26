package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/features/TagsDemo.feature",
	
	glue= {"stepDefinations"},
	
	//tags="(@smoke or @regresion) and not @important and not @mywish"
	tags="@regresion and @mywish"
	
		
)
	public class TestRunnerforTags {
}
