
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
        if (null == driver) {
            startService();
            createDriver();
        }
        return driver;
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
        if (null != driver) {
            driver.close();
            driver = null;
        }
    }

    /**
     * Quit driver.
     */
    public void quitDriver() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }
}
