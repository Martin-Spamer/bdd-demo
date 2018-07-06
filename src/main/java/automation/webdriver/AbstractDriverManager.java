
package automation.webdriver;

import org.openqa.selenium.WebDriver;

/**
 * An abstract manager class for WebDriver instances.
 */
public abstract class AbstractDriverManager {

    /** webDriver instance. */
    protected WebDriver driver;

    /**
     * Gets the driver.
     *
     * @return the driver
     */
    public WebDriver getDriver() {
        if (null == this.driver) {
            startService();
            createDriver();
        }
        return this.driver;
    }

    /**
     * Start service.
     */
    protected abstract void startService();

    /**
     * Stop service.
     */
    protected abstract void stopService();

    /**
     * Creates the driver.
     */
    protected abstract void createDriver();

    /**
     * Close driver.
     */
    public void closeDriver() {
        if (null != this.driver) {
            this.driver.close();
            this.driver = null;
        }
    }

    /**
     * Quit driver.
     */
    public void quitDriver() {
        if (null != this.driver) {
            this.driver.quit();
            this.driver = null;
        }
    }
}
