package testRunners;

import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"},
        tags = "",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/reports.html"
        }
)

public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();
}
