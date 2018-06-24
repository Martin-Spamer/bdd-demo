
package automation.bdd;

import static org.junit.Assume.assumeNotNull;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractTestRunner class.
 *
 * If you wish to use a common Abstract base for your TestRunner(s) Then you
 * must use 1.1.8+ of Cucumber-jvm other wise you will receive unexpected
 * DuplicateStepDefinitionException errors
 *
 * @author Martin Spamer
 *
 */
public abstract class AbstractTestRunner {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * Before test, an excellent place to :
     * test any assumptions common to the entire test suite
     * such as any required environmental configurations.
     */
    @BeforeClass
    public static void beforeTests() {
        final String targetEnvironment = System.getProperty("targetEnvironment");
        assumeNotNull(
                "Expected the target environment to be specified in a Java System property (use -DtargetEnvironment={DEV|SIT|...})",
                targetEnvironment);
    }
}
