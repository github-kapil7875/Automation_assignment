package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\Features",
		glue= {"StepDefinitions"},
		plugin = { "pretty", "html:target/cucumber-reports/index.html" },
		monochrome = true
		)
public class TestRunner {


}
