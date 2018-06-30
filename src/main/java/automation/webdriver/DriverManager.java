
package automation.webdriver;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract void startService();

    protected abstract void stopService();

    protected abstract void createDriver();

    public void quitDriver() {
        if (null != this.driver) {
            this.driver.quit();
            this.driver = null;
        }

    }

    public WebDriver getDriver() {
        if (null == this.driver) {
            startService();
            createDriver();
        }
        return this.driver;
    }
}
