package gov.goias.agrodefesa.admin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",//path to the features
        format = {"pretty", "html:target/sidago_integration"},//what formatters to use
        tags = {"@login"})//what tags to incluse(@)/exclude(@~)
public class LoginTest {
}
