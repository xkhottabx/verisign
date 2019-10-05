package com.verisign.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber1.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        features = {"src/test/resources/features/" //to specify where are the features
        },
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"com/verisign/step_definitions"},
        tags = "@wip",
        dryRun = false

)
public class SmokeRunner {


}
