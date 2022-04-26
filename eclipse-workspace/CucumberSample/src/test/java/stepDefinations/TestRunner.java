package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/features/LoginDemo.feature",
	
	glue= {"stepDefinations"},
	
	monochrome= true,
	plugin= {"pretty", "html:target/HtmlReports/report.html",
	"pretty", "json:target/JSONReports/report.json",
	 "junit:target/JUNITReports/report.xml"}
	
	

	
	
)
	public class TestRunner {
}
