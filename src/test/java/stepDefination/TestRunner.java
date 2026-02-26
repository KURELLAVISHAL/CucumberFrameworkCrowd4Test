package stepDefination;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "stepDefination",
        plugin = {"pretty","html:target/cucumberReport.html"},
        tags = "@Tc4"
)

public class TestRunner {
}
