
package automation;

import org.junit.Test;

import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;

/**
 * Unit Test the TestContext.
 */
public final class TestContextTest {

    /**
     * Unit test to check if running in a local environment.
     */
    @Test
    public void testIsLocal() {
        assumeTrue(TestContext.isLocal());
    }

    /**
     * Unit test to check if the WebDriver tests should be run Headless.
     *
     * @return true, if headless
     */
    public static boolean headless() {
        final String property = System.getProperty("headless", "TRUE");
        return Boolean.valueOf(property);
    }

    /**
     * Unit test to check if target system is local.
     *
     * @return the string
     */
    public static String targetEnvironment() {
        return System.getProperty("targetEnvironment", "local");
    }

    /**
     * Unit test to check if local browsers are available.
     *
     * @return true, if checks if is local
     */
    public static boolean isLocal() {
        final String property = System.getProperty("isLocal");
        return Boolean.valueOf(property);
    }

    /**
     * Unit test to check Identify the Local browser to be targeted.
     *
     * @return the string
     */
    public static String localBrowser() {
        return System.getProperty("localBrowser", "Chrome");
    }

    /**
     * Unit test to check if Apache Tomcat is available locally.
     */
    @Test
    public void testIsTomcat() {
        assumeTrue(TestContext.isTomcat());
        assumeNotNull(TestContext.tomcatUrl());
    }

    /**
     * Unit test to check if running under Jenkins.
     */
    @Test
    public void testIsJenkins() {
        assumeTrue(TestContext.isJenkins());
    }

    /**
     * Unit test to check if Selenium Grid is available.
     *
     * @return true, if checks if is grid
     */
    @Test
    public void testIsGrid() {
        assumeTrue(TestContext.isGrid());
        assumeNotNull(TestContext.gridUrl());
    }

    /**
     * Unit test for System property override of the webDriver waits.
     */
    @Test
    public void testWebDriverWaits() {
        assumeTrue(TestContext.pageWait() > 0);
        assumeTrue(TestContext.implicitWait() > 0);
        assumeTrue(TestContext.explicitWait() > 0);
    }

}
