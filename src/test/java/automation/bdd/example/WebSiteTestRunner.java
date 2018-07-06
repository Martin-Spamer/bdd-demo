
package automation.bdd.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * A Cucumber Runner for WebSiteTestRunner.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        tags = { "not @Ignore" },
        glue = "automation.bdd",
        features = "classpath:./features/WebSite.feature",
        monochrome = true,
        snippets = SnippetType.CAMELCASE)
public class WebSiteTestRunner {
}
