package step_definitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				tags = {"@loginemailnegative"},
				features = {"classpath:Features"},
				glue = {"classpath:step_definitions"}, 
				plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"})


public class RunCukesTest {

}
