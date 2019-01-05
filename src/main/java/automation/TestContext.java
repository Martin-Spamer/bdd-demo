
package automation;

import static org.junit.Assume.assumeTrue;

/**
 * TestContext class.
 */
public final class TestContext {

    private static final String LOCAL_TOMCAT_URL = "http://localhost:8080";
    private static final String LOCAL_SELENIUM_URL = "http://localhost:4444";
    private static final String LOCAL_JENKINS_URL = "http://localhost:8080";

    /**
     * Private constructor to prevent instantiation. Contains only static helper
     * methods, suggest using static import. import static
     * automation.TestContext.*;
     */
    private TestContext() {
        super();
    }

    public static boolean assumeLocal() {
        assumeTrue(isLocal());
        return true;
    }

    public static boolean assumeJenkins() {
        assumeTrue(isJenkins());
        return true;
    }

    public static boolean assumeLocalTomcat() {
        assumeTrue(isTomcat());
        return true;
    }

    public static boolean assumeSeleniumGrid() {
        assumeTrue(isSeleniumGrid());
        return true;
    }

    public static boolean assumeHeadless() {
        assumeTrue(isHeadless());
        return true;
    }

    /**
     * Checks if is local.
     *
     * @return true, if checks if is local
     */
    public static boolean isLocal() {
        final String property = System.getProperty("isLocal");
        return Boolean.valueOf(property);
    }

    /**
     * Run WebDriver Headless.
     *
     * @return true, if headless
     */
    public static boolean isHeadless() {
        final String property = System.getProperty("isHeadless", "TRUE");
        return Boolean.valueOf(property);
    }

    /**
     * Local browser.
     *
     * @return the string
     */
    public static String localBrowser() {
        return System.getProperty("localBrowser", "Firefox");
    }

    /**
     * Checks if is tomcat.
     *
     * @return true, if checks if is tomcat
     */
    public static boolean isTomcat() {
        final String property = System.getProperty("isTomcat");
        return Boolean.valueOf(property);
    }

    /**
     * Tomcat url.
     *
     * @return the string
     */
    public static String tomcatUrl() {
        return System.getProperty("tomcatUrl", LOCAL_TOMCAT_URL);
    }

    /**
     * Checks if is jenkins.
     *
     * @return true, if checks if is jenkins
     */
    public static boolean isJenkins() {
        final String property = System.getProperty("isJenkins");
        return Boolean.valueOf(property);
    }

    public static String jenkinstUrl() {
        return System.getProperty("tomcatUrl", LOCAL_JENKINS_URL);
    }

    /**
     * Checks if is grid.
     *
     * @return true, if checks if is grid
     */
    public static boolean isSeleniumGrid() {
        final String property = System.getProperty("isSeleniumGrid");
        return Boolean.valueOf(property);
    }

    /**
     * Grid url.
     *
     * @return the string
     */
    public static String seleniumGridUrl() {
        return System.getProperty("seleniumUrl", LOCAL_SELENIUM_URL);
    }

    /**
     * Page wait in seconds, defaults to 4 seconds.
     *
     * @return the long
     */
    public static long pageWait() {
        return Long.parseLong(System.getProperty("pageWait", "4"));
    }

    /**
     * Implicit wait in milliseconds, default to tenth of a second.
     *
     * @return the implicitWait as long value.
     */
    public static long implicitWait() {
        return Long.parseLong(System.getProperty("implicitWait", "100"));
    }

    /**
     * Explicit wait in milliseconds, defaults to 1 second.
     *
     * @return the explicitWait as long value.
     */
    public static long explicitWait() {
        return Long.parseLong(System.getProperty("explicitWait", "1000"));
    }

    public static long retryInterval() {
        return Long.parseLong(System.getProperty("retryInterval", "100"));
    }

    /**
     * Target platform.
     *
     * @return the string
     */
    public static String targetPlatform() {
        return System.getProperty("targetPlatform", "dev");
    }

    /**
     * Target environment.
     *
     * @return the string
     */
    public static String targetEnvironment() {
        return System.getProperty("targetEnvironment", "local");
    }

}
