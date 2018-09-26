
package automation;

/**
 * TestContext class.
 */
public final class TestContext {

    private static final String SELENIUM_GRID_URL = "http://localhost:4444";
    private static final String TOMCAT_URL = "http://localhost:8080";

    /**
     * Private constructor to prevent instantiation.
     */
    private TestContext() {
        super();
    }

    /**
     * Run WebDriver Headless.
     *
     * @return true, if headless
     */
    public static boolean headless() {
        final String property = System.getProperty("headless", "TRUE");
        return Boolean.valueOf(property);
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
     * Local browser.
     *
     * @return the string
     */
    public static String localBrowser() {
        return System.getProperty("localBrowser", "Chrome");
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
        return System.getProperty("tomcatUrl", TOMCAT_URL);
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

    /**
     * Checks if is grid.
     *
     * @return true, if checks if is grid
     */
    public static boolean isGrid() {
        final String property = System.getProperty("isGrid");
        return Boolean.valueOf(property);
    }

    /**
     * Grid url.
     *
     * @return the string
     */
    public static String gridUrl() {
        return System.getProperty("seleniumUrl", SELENIUM_GRID_URL);
    }

    /**
     * Page wait in seconds, defaults to 4 seconds.
     *
     * @return the long
     */
    public static long pageWait() {
        final String property = System.getProperty("pageWait", "4");
        return Long.parseLong(property);
    }

    /**
     * Implicit wait in milliseconds, default to tenth of a second.
     *
     * @return the implicitWait as long value.
     */
    public static long implicitWait() {
        final String property = System.getProperty("implicitWait", "100");
        return Long.parseLong(property);
    }

    /**
     * Explicit wait in milliseconds, defaults to 1 second.
     *
     * @return the explicitWait as long value.
     */
    public static long explicitWait() {
        final String property = System.getProperty("explicitWait", "1000");
        return Long.parseLong(property);
    }

}
