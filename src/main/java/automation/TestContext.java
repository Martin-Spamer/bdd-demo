
package automation;

/**
 * The Class TestContext.
 */
public class TestContext {

    /**
     * Checks if is local.
     *
     * @return true, if checks if is local
     */
    public static boolean isLocal() {
        String property = System.getProperty("isLocal");
        return Boolean.valueOf(property);
    }

    /**
     * Checks if is tomcat.
     *
     * @return true, if checks if is tomcat
     */
    public static boolean isTomcat() {
        String property = System.getProperty("isTomcat");
        return Boolean.valueOf(property);
    }

    /**
     * Implicit wait.
     *
     * @return the long
     */
    public static long implicitWait() {
        String property = System.getProperty("implicitWait", "100");
        return Long.parseLong(property);
    }

    /**
     * Page wait.
     *
     * @return the long
     */
    public static long pageWait() {
        String property = System.getProperty("pageWait", "4");
        return Long.parseLong(property);
    }

}
