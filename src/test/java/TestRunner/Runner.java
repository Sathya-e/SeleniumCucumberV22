package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//SathyaElangovan//IdeaProjects//SeleniumCucumberV2//Features//Cucumber.Feature",
        glue = "StepDefinition", dryRun = true,
        //   tags={"@Sanity"},       //only Sanity
        //   tags={"@Sanity","@Regression"}, //Sanity and Regression
        //   tags={"@Sanity,@Regression"},  //Sanity or Regression
        //   tags={"@End2End","~@Sanity","~@Regression"},
        plugin = {"pretty", "html:test-output", "json:json-output", "junit:junit_xml_output/cucum.xml",
                "rerun:target/rerun.txt"}
)
public class Runner {

}
