package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber",glue="org.web.stepDefinition",
monochrome=true,tags = "@tc02", plugin= {"html:target/cucumber.html"})
public class ExecutionRunner extends AbstractTestNGCucumberTests {

}
