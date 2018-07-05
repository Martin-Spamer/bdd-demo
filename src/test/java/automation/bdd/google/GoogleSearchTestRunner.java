
package automation.bdd.google;

import org.junit.runner.RunWith;

import automation.bdd.AbstractTestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * A Cucumber Runner for Google Search Tests.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        tags = { "not @Ignore" },
        glue = "automation.bdd",
        features = "classpath:features/GoogleSearch.feature",
        monochrome = true,
        snippets = SnippetType.CAMELCASE)
public class GoogleSearchTestRunner extends AbstractTestRunner {
}
