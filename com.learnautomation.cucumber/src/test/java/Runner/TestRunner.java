package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
                  glue={"StepDefinition"},
                  plugin={"html:target/Cucumber-html-report"})

public class TestRunner {

}
