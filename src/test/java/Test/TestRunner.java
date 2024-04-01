package Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\mobile.feature",
        glue = "Test",
        tags = "@mobile_test",
        plugin = {"pretty", "html:target/reports/mobile.reports.html"}

)
public class TestRunner {
}

