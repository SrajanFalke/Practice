package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\feature\\"}, 

plugin = { "pretty", "html:target/site/cucumber-pretty",
		"json:target/cucumber/cucumber.json", 
		"usage:target/usage.jsonx",
		"junit:target/cucumber.xml" }, 


glue= {"stepDefinations"},
//,
//dryRun = true,

monochrome = true
)

public class TestRunner {

}