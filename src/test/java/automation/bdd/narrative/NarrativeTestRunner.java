
package automation.bdd.narrative;

import org.junit.runner.RunWith;

import automation.bdd.AbstractTestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * The Narrative Test Runner for Cucumber Feature File.
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = { "not @Ignore" }, glue = "automation.bdd", features = "classpath:features/Narrative.feature", monochrome = true, snippets = SnippetType.CAMELCASE)
public final class NarrativeTestRunner extends AbstractTestRunner {
}
