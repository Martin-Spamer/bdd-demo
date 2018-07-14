
package automation.bdd.google;

import org.junit.runner.RunWith;

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
public final class GoogleSearchTestRunner {
}
