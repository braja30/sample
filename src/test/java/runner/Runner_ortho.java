package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	
@CucumberOptions(
features = "featurefiles/ortho.feature", 
glue = "stepdefinitions" ,
plugin =  {"html:target/Myreports/ortho1.html"},
publish = true
)

	public class Runner_ortho {
}

