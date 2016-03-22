package gov.goias.agrodefesa.controleDeBens.material;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature/controleDeBens/Material.feature",//path to the features
        //format = {"pretty", "json:target/cucumber.json"},//what formatters to use
        format = {"pretty", "html:target/cucumber-html"},//what formatters to use
        glue = {"gov.goias.agrodefesa"},
        tags = {"@Material"})//what tags to incluse(@)/exclude(@~)
public class MaterialTest {
}
