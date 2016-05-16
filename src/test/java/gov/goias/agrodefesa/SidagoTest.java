package gov.goias.agrodefesa;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",//path to the features
        format = {"pretty", "json:target/cucumber/cucumber.json"},//what formatters to use
        glue = {"gov.goias.agrodefesa"},
        tags = {"@ConcessaoDeDiarias"})//what tags to incluse(@)/exclude(@~)
public class SidagoTest {
}
