
package automation.bdd;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeNotNull;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * A Template for a Test Runner for Cucumber feature files.
 *
 * Run all test labelled but not those marked with <code>@Ignore</code> tag.
 * <code>tags = { "not @Ignore" }</code>
 *
 * Local for the feature files.
 * <code>features = "classpath:features"</code>
 *
 * The namespace package containing the steps implementation.
 * <code>glue = "automation.bdd"</code>
 *
 * Generate step code snippets will use Java naming convention.
 * <code>snippets = SnippetType.CAMELCASE</code>
 *
 * Generate monochrome test report
 * <code>monochrome = true</code>
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        tags = { "@Nothing" },
        features = "classpath:features",
        glue = "automation.bdd",
        snippets = SnippetType.CAMELCASE,
        monochrome = true)
public class TestRunnerTemplate extends AbstractTestRunner {

    /**
     * Executed before each test case.
     *
     * Ideal place to initialise data for this test.
     */
    @Before
    private void before() {
        LOG.info("@Before test");
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
        LOG.info("@After test");
    }

}
