package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin= {"html:target/cucumber_html_report01.html","pretty"},		
features="src/test/java/features",
glue="stepdefinations",
tags="@All"

		)
public class Runner {

}
