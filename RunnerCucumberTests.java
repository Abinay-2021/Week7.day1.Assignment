package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( //dryRun = false,
                 features = {"src/test/java/ServiceFeatures/CreateIncident.feature",	"src/test/java/ServiceFeatures/CreateChange.feature","src/test/java/ServiceFeatures/CreateProposal.feature" }, 
                 glue = {"stepdefinition"}, 
                 monochrome = true)

public class RunnerCucumberTests extends AbstractTestNGCucumberTests {

}
