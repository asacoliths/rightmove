package co.uk.rightmove.testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/co/uk/rightmove/features"},
        glue = {"co/uk/rightmove/stepDefinitions"},
        publish = true
)
public class TestRunner {
}
