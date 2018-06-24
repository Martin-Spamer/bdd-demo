
package automation.webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import automation.TestContext;

/**
 * A class Factory for WebDriver instances, wrapped in an enum.
 *
 * @author Martin Spamer
 */
public enum WebDriverFactory {

    /** Use the Chrome browser. */
    CHROME("Chrome") {
        @Override
        public WebDriver create() {
            System.setProperty("webdriver.chrome.driver", "web-driver-bin/chromedriver.exe");
            return new ChromeDriver();
        }
    },

    /** Use the Edge browser. */
    EDGE("Edge") {
        @Override
        public WebDriver create() {
            System.setProperty("webdriver.edge.driver", "web-driver-bin/MicrosoftWebDriver.exe");
            return new EdgeDriver();
        }
    },

    /** Use the Firefox browser. */
    FIREFOX("Firefox") {
        @Override
        public WebDriver create() {
            System.setProperty("webdriver.firefox.driver", "web-driver-bin/geckodriver.exe");
            return new FirefoxDriver();
        }
    },

    /** Use the Internet explorer. */
    IE("InternetExplorer") {
        @Override
        public WebDriver create() {
            System.setProperty("webdriver.ie.driver", "web-driver-bin/IEDriverServer.exe");
            return new InternetExplorerDriver();
        }
    };

    /** provided logging. */
    protected final static Logger log = LoggerFactory.getLogger(WebDriverFactory.class);

    /** WebDriver name. */
    private String webDriverType;

    /**
     * Instantiates a new browser factory.
     *
     * @param webDriverClassName
     *            the webDriver Class Name for Browser
     * @return
     */
    private WebDriverFactory(final String webDriverType) {
        this.webDriverType = webDriverType;
    }

    public abstract WebDriver create();

    /**
     * WebDriver instance from name as string.
     *
     * @param candidateWebDriverType the candidate web driver name
     * @return the web driver factory
     */
    public static WebDriverFactory fromString(final String candidateWebDriverType) {
        for (final WebDriverFactory candidate : values()) {
            if (candidate.webDriverType.equals(candidateWebDriverType)) {
                return candidate;
            }
        }
        return null;
    }

    /**
     * Web driver.
     *
     * @return the web driver
     */
    public WebDriver webDriver() {
        return WebDriverFactory.CHROME.create();
    }

    /**
     * Default web driver.
     *
     * @return the web driver
     */
    public static WebDriver defaultWebDriver() {
        final String localBrowser = System.getProperty("localBrowser", "Chrome");
        final WebDriverFactory fromString = WebDriverFactory.fromString(localBrowser);
        return fromString.create();
    }

    /**
     * Configure time out.
     */
    protected void configureTimeOut(final WebDriver webDriver) {
        webDriver.manage().timeouts().pageLoadTimeout(TestContext.pageWait(), TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(TestContext.implicitWait(), TimeUnit.MILLISECONDS);
    }

    /**
     * Remote.
     *
     * @param targetBrowser the target browser
     * @return the webDriver
     */
    public static WebDriver remoteWebDriver(final String targetBrowser) {
        final DesiredCapabilities desiredCapabilities;

        switch (targetBrowser.toLowerCase()) {
        case "edge":
            desiredCapabilities = DesiredCapabilities.edge();
            break;
        case "firefox":
            desiredCapabilities = DesiredCapabilities.firefox();
            break;
        case "chrome":
            desiredCapabilities = DesiredCapabilities.chrome();
            break;
        case "ie":
            desiredCapabilities = DesiredCapabilities.internetExplorer();
            break;
        default:
            desiredCapabilities = DesiredCapabilities.htmlUnit();
            break;
        }

        URL gridUrl;
        try {
            gridUrl = new URL("http://localhost");
            return new RemoteWebDriver(gridUrl, desiredCapabilities);
        } catch (final MalformedURLException e) {
            log.error(e.toString());
        }
        return null;
    }

}
