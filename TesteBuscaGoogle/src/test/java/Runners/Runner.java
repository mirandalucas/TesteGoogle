package Runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, /* Serve pra validar estrutura. Da skip nos passos pra validar quando true. Default false. */
		strict = false /*Validar mapeamento. Default false */
		)
public class Runner {

}
