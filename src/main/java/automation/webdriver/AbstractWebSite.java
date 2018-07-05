
package automation.webdriver;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * An abstract class for a web-site that abstract a WebDriver instance.
 *
 * @author Martin Spamer
 */
public abstract class AbstractWebSite {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The webDriver. */
    protected WebDriver webDriver;

    /**
     * Default Constructor.
     */
    public AbstractWebSite() {
        this(WebDriverFactory.defaultWebDriver());
    }

    /**
     * Constructor using webDriver instance.
     *
     * @param webDriver the web driver
     */
    public AbstractWebSite(final WebDriver webDriver) {
        assertNotNull(webDriver);
        this.webDriver = webDriver;
    }

    /**
     * Constructor using site url.
     *
     * @param siteUrl the site url
     */
    public AbstractWebSite(final String siteUrl) {
        this(WebDriverFactory.defaultWebDriver());
        open(siteUrl);
    }

    /**
     * Open parameterised URL.
     *
     * @param siteUrl the site url
     */
    public void open(final String siteUrl) {
        assertNotNull(this.webDriver);
        this.log.debug("webDriver = {}", this.webDriver);

        // Navigate to the right place
        this.webDriver.get(siteUrl);
        this.log.debug("siteUrl = {}", siteUrl);
    }

    /**
     * close the page.
     */
    public void close() {
        if (this.webDriver != null) {
            this.webDriver.close();
            this.webDriver = null;
        }
    }

    /**
     * Quit the browser.
     */
    public void quit() {
        if (this.webDriver != null) {
            this.webDriver.quit();
            this.webDriver = null;
        }
    }
}
