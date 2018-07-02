
package automation.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeTrue;

import automation.TestContext;

/**
 * Unit Test class for WebDriverFactory class.
 *
 * @author Martin Spamer
 */
public class WebDriverFactoryTest {

    private static final Logger LOG = LoggerFactory.getLogger(WebDriverFactoryTest.class);

    /**
     * Unit test to edge driver.
     */
    @Test
    public final void testEdgeDriver() {
        assumeTrue(TestContext.isLocal());
        final WebDriver webDriver = WebDriverFactory.EDGE.create();
        assertNotNull(webDriver);
        webDriver.get("http://127.0.0.1:8080");
        assertNotNull(webDriver.getTitle());
        webDriver.quit();
    }

    /**
     * Unit test to chrome driver.
     */
    @Test
    public final void testChromeDriver() {
        assumeTrue(TestContext.isLocal());
        final WebDriver webDriver = WebDriverFactory.CHROME.create();
        assertNotNull(webDriver);
        webDriver.get("http://127.0.0.1:8080");
        assertNotNull(webDriver.getTitle());
        webDriver.quit();
    }

    /**
     * Unit test to firefox driver.
     */
    @Test
    public final void testFirefoxDriver() {
        assumeTrue(TestContext.isLocal());
        final WebDriver webDriver = WebDriverFactory.FIREFOX.create();
        assertNotNull(webDriver);
        webDriver.get("http://127.0.0.1:8080");
        assertNotNull(webDriver.getTitle());
        webDriver.quit();
    }

}
