
package automation.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    /** The web driver. */
    protected WebDriver webDriver;

    public AbstractWebSite() {
        this.webDriver = new ChromeDriver();
    }

    public AbstractWebSite(final WebDriver webDriver) {
        assertNotNull(webDriver);
        this.webDriver = webDriver;
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
     * close browser and therefore site.
     */
    public void closeSite() {
        if (this.webDriver != null) {
            this.webDriver.close(); // use to close single window
            // this.webDriver.quit(); // use to close entire browser
        }
    }

}
