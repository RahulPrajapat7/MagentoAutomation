package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = {"stepDefinitions", "hooks"},
        plugin = {"pretty", "html:target/login-report.html"},
        monochrome = true
)
public class LoginRunner extends AbstractTestNGCucumberTests {}
