package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin= {"html:target/cucumber_html_report005.html","pretty"},		
features="src/test/java/features",
glue="stepdefinations",
tags="@Register"

		)
public class TestNGRunner extends AbstractTestNGCucumberTests {

	
	
	
	
}
