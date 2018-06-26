
package automation.bdd.narrative;

import org.junit.runner.RunWith;

import automation.bdd.AbstractTestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * The Narrative Test Runner for Cucumber Feature File
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        glue = "automation",
        features = "classpath:features",
        monochrome = true)
public class NarrativeTestRunner extends AbstractTestRunner {
}
