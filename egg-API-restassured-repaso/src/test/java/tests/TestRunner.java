package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue={"StepDefinitions"})
public class TestRunner extends AbstractTestNGCucumberTests {


}
