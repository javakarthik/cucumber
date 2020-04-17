package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
    features ="src/test/java/cucumber",
    glue = "cucumber",tags="@SeleniumTest",
    //plugin = {"pretty","html:target/cucumber","json:target/cucumber.json,junit:target/cucumber.xml"},
    strict=true,monochrome = true)
public class TestRunner{

}