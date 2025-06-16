package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/signup_login.feature",
        glue = {"stepDefinitions", "hooks"},
        plugin = {"pretty", "html:target/signup-report.html"},
        monochrome = true
)
public class SignUpRunner extends AbstractTestNGCucumberTests {}
