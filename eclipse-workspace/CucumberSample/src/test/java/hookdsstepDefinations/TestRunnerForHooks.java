package hookdsstepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureHooks/HooksDemo.feature",


glue= {"hookdsstepDefinations"}
)
public class TestRunnerForHooks {
	
	

}
