package uk.co.automatictester.jwebfwk.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 
@CucumberOptions(features = "src/test/resources/features/Download.feature",
        glue = "uk.co.automatictester.jwebfwk.glue",
        plugin = {"pretty", "json:target/cucumber2.json"},
        monochrome = true
//        tags = {"@skip123"}
)
public class DownloadFeatureRunner extends AbstractTestNGCucumberTests {
}