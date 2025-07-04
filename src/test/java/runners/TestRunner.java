package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps"},
        plugin = {"pretty"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}