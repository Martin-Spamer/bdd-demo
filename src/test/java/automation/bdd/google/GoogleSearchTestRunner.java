
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
        snippets = SnippetType.CAMELCASE,
        glue = "automation",
        // features = "classpath:features",
        features = "classpath:./features/GoogleSearch.feature",
        monochrome = true)
public class GoogleSearchTestRunner extends AbstractTestRunner {
}
