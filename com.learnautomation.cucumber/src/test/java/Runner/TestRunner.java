package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features/taggedhooks.feature",
                  glue={"StepDefinition"},
                  format={"html:target/Cucumber-html-report"})

public class TestRunner {

}
