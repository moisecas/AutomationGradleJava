
import  io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
//            features = "src/test/resources/features,
            features = "src/test/resources/features/shopping.feature",
            glue = {"steps"},
            plugin = {"pretty", "html:target/cucumber-reports.html"},
            monochrome = true
    )
    public class RunCucumberTest {
    }



