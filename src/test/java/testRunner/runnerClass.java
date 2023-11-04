package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/dellFeatures"},
plugin = {"json:target/cucumber.json"},
  glue = "StepDefinition" )//tags = {""})


public class runnerClass extends AbstractTestNGCucumberTests{

}
