package ntou.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources",
        glue = {"ntou.steps"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
