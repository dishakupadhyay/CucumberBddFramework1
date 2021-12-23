package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Keyur\\IdeaProjects\\CucumberBddFramework\\src\\test\\java\\" +
                "feature\\Registration.feature",
        glue = {"stepdefinitions"},
        dryRun = false,
        format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"},
monochrome = false




)





public class TestRunner {
}
