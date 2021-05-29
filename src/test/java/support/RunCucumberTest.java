package support;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:reports/cucumber.html",
                "json:reports/cucumber.json",
                "junit:reports/cucumber.xml"
        },
        dryRun = false,  // Checks that the step defs are defined
        strict = true,  // Makes the test run fail if a step is undefined
        monochrome = true,  // Makes the terminal execution better
        glue = "stepdefinitions",  // Step definitions package
        features = "src/test/resources/features"  // Features path
)
public class RunCucumberTest {
    // Necessary class to run cucumber tests
}
