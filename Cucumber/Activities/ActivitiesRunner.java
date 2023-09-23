package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Src/test/java/Features",
        glue = {"StepDefinitions"},
        tags = "@SimpleAlert",
        plugin = {"json: test-reports/json-report.json"},
        monochrome = true

        //tags = "@SimpleAlert",
        //plugin = {"html: test-reports"},
        //monochrome = true

        //tags = "@activity5"
        //tags = "@SimpleAlert",
        //plugin = {"pretty"},
        //monochrome = true

        //tags = "@activity1"
        //tags = "@activity2"
        //tags = "@activity3"
        //tags = "@activity4"
        //tags = "@activity5"
)

public class ActivitiesRunner {

}