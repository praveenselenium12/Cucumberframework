package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src/test/resources/"}
        ,dryRun = false
,glue = {"Stepdefinition","Apphooks"},
        monochrome = true,
        tags = "@smoke",
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"}
)


public class Testrun extends AbstractTestNGCucumberTests {
}
