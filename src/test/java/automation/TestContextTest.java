
package automation;

import static automation.TestContext.assumeHeadless;
import static automation.TestContext.assumeJenkins;
import static automation.TestContext.assumeLocal;
import static automation.TestContext.assumeLocalTomcat;
import static automation.TestContext.assumeSeleniumGrid;
import static automation.TestContext.isJenkins;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;

/**
 * Unit Test the TestContext.
 */
public final class TestContextTest {

    @Test
    public void testAssumeLocal() {
        if (TestContext.isLocal()) {
            assumeLocal();
            assertTrue(assumeLocal());
        }
    }

    @Test
    public void testAssumeJenkins() {
        if (isJenkins()) {
            assumeJenkins();
            assertTrue(assumeJenkins());
        }
    }

    @Test
    public void testAssumeLocalTomcat() {
        assumeLocalTomcat();
    }

    @Test
    public void testAssumeSeleniumGrid() {
        assumeSeleniumGrid();
    }

    @Test
    public void testAssumeHeadless() {
        assumeHeadless();
    }

    @Test
    public void testIsLocal() {
        assumeTrue(TestContext.isLocal());
    }

    public void testIsHeadless() {
        assumeTrue(TestContext.isHeadless());
    }

    public void testLocalBrowser() {
        assertNotNull(TestContext.localBrowser());
    }

    /**
     * Unit test to check if Apache Tomcat is available locally. If Tomcat is
     * available, the URL must be provided.
     */
    @Test
    public void testIsTomcat() {
        assumeTrue(TestContext.isTomcat());
        assertNotNull(TestContext.tomcatUrl());
    }

    /**
     * Unit test to check if running under Jenkins. If Jenkins is available, the
     * URL must be provided.
     */
    @Test
    public void testIsJenkins() {
        assumeTrue(TestContext.isJenkins());
        assertNotNull(TestContext.jenkinstUrl());
    }

    /**
     * Unit test to check if Selenium Grid is available.
     *
     * @return true, if checks if is grid
     */
    @Test
    public void testIsSeleniumGrid() {
        assumeTrue(TestContext.isSeleniumGrid());
        assumeNotNull(TestContext.seleniumGridUrl());
    }

    /**
     * Unit test for System property override of the webDriver waits.
     */
    @Test
    public void testWebDriverWaits() {
        assumeTrue(TestContext.pageWait() > 0);
        assumeTrue(TestContext.implicitWait() > 0);
        assumeTrue(TestContext.explicitWait() > 0);
        assumeTrue(TestContext.retryInterval() > 0 && TestContext.retryInterval() < TestContext.explicitWait());
    }

    /**
     * Unit test to check if target system is local.
     *
     * @return the string
     */
    public static String targetEnvironment() {
        return System.getProperty("targetEnvironment", "local");
    }

}
