package com.cukesrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html"
        },
        features = "src/test/resources/features",
        glue = "com/stepdefinition",
        dryRun = false// ,
        //tags = "@tag"
)

public class CukesRunner {

}
