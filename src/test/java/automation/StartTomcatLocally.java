
package automation;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class StartTomcatLocally {

    private static final String TOMCAT_HOME = "~/apache/tomcat";

    @BeforeClass
    public static void startTomcat() {
        String catalinaHome = System.getProperty("CATALINA_HOME");
        // bootstrap = new Bootstrap();
        // bootstrap.setCatalinaHome(TOMCAT);
        // try {
        // bootstrap.start();
        // } catch (Exception e) {
        // e.printStackTrace();
        // fail("Tomcat failed");
        // }
    }

    @AfterClass
    public static void stopTomcat() {
        // try {
        // bootstrap.stop();
        // } catch (Exception e) {
        // e.printStackTrace();
        // fail("Tomcat cleanup failed");
        // }
    }
}
