
package automation.bdd.example;

import org.junit.Before;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeNotNull;

import automation.bdd.AbstractTestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * A Cucumber Runner for WebSiteTestRunner.
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = { "not @Ignore" }, glue = "automation.bdd", features = "classpath:./features/WebSite.feature", monochrome = true, snippets = SnippetType.CAMELCASE)
public final class WebSiteTestRunner extends AbstractTestRunner {

    @Before
    private void before() {
        this.log.info("@Before test");
        final String useBrowser = System.getProperty("useBrowser");
        assumeNotNull("Expected the target browser to be specified in a Java System property (use -DuseBrowser={Chrome|Edge|Firefox|IE|PhantomJs})", useBrowser);
    }

}
