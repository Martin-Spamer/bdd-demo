
package automation.bdd.example;

import org.junit.runner.RunWith;

import automation.bdd.AbstractTestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * A Cucumber Runner for WebSiteTestRunner.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        glue = "automation.bdd",
        features = "classpath:./features/WebSite.feature",
        monochrome = true,
        tags = { "~@Ignore" })
public class WebSiteTestRunner extends AbstractTestRunner {
}
