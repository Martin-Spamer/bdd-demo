
package automation.bdd;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeNotNull;

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
public class TestRunner extends AbstractTestRunner {

    /**
     * Executed before each test case.
     *
     */
    @Before
    private void before() {
        this.log.trace("@Before");
        final String useBrowser = System.getProperty("useBrowser");
        assumeNotNull(
                "Expected the target browser to be specified in a Java System property (use -DuseBrowser={Chrome|Firefox|IE|Phantomjs})",
                useBrowser);
    }

    /**
     * Executed after each test case.
     */
    @After
    private void after() {
        this.log.trace("@After");
    }

}
