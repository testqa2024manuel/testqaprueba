package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
              features = "src/test/resources/Features/Loguearse.feature",
        glue = {"stepDefinitions","hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoguearseRunners {

}
