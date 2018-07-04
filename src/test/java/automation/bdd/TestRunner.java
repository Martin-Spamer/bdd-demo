
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
        glue = "automation.bdd",
        features = "classpath:features",
        monochrome = true,
        tags = { "not @Ignore" })
public class TestRunner extends AbstractTestRunner {

    /**
     * Executed before each test case.
     */
    @Before
    private void before() {
        this.log.info("@Before");
        final String useBrowser = System.getProperty("useBrowser");
        assumeNotNull(
                "Expected the target browser to be specified in a Java System property (use -DuseBrowser={Chrome|Edge|Firefox|IE|PhantomJs})",
                useBrowser);
    }

    /**
     * Executed after each test case.
     */
    @After
    private void after() {
        this.log.info("@After");
    }

}
