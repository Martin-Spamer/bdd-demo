
package automation.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * An abstract base class for Page Objects.
 *
 * @author Martin Spamer
 */
public abstract class AbstractPageObject {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** webDriver instance. */
    protected WebDriver webDriver;

    /** webDriverWait instance. */
    protected WebDriverWait webDriverWait;

    /**
     * Instantiates a new page object.
     */
    public AbstractPageObject() {
        this.webDriver = new ChromeDriver();
        PageFactory.initElements(this.webDriver, this);
        configureTimeOut();
    }

    /**
     * Instantiates a new page object.
     *
     * @param webDriver
     *            the web driver
     */
    public AbstractPageObject(final WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this);
        configureTimeOut();
    }

    /**
     * Configure time out.
     */
    private void configureTimeOut() {
        final int timeOutInSeconds = 1;
        final int retryInterval = 100;
        this.webDriverWait = new WebDriverWait(this.webDriver, timeOutInSeconds, retryInterval);
    }

    /**
     * get the base URL for the site.
     *
     * @return the string
     */
    protected abstract String pageUrl();

    /**
     * Open page default page.
     *
     * @return the abstract page object
     */
    public AbstractPageObject open() {
        return openPage(pageUrl());
    }

    /**
     * Open page by URL.
     *
     * @param pageUrl the page url
     * @return the abstract page object
     */
    public AbstractPageObject openPage(final String pageUrl) {
        assertNotNull("webDriver must be defined for PageObject", this.webDriver);
        assertNotNull("pageUrl must be defined for PageObject", pageUrl);
        this.webDriver.get(pageUrl);
        PageFactory.initElements(this.webDriver, this);
        return this;
    }

    /**
     * Gets the current url.
     *
     * @return the current url
     * @see org.openqa.selenium.WebDriver#getCurrentUrl()
     */
    public String getCurrentUrl() {
        return this.webDriver.getCurrentUrl();
    }

    /**
     * Gets the the page title.
     *
     * @return the title
     * @see org.openqa.selenium.WebDriver#getTitle()
     */
    public String getTitle() {
        return this.webDriver.getTitle();
    }

    /**
     * Verify the page.
     *
     * @return the abstract page object
     */
    public AbstractPageObject verify() {
        PageFactory.initElements(this.webDriver, this);
        return this;
    }

    /**
     * Verify web element.
     *
     * @param webElement the web element
     * @return the abstract page object
     */
    protected AbstractPageObject verifyWebElement(final WebElement webElement) {
        assertNotNull(webElement);
        assertTrue(webElement.isDisplayed());
        assertNotNull(webElement.getText());
        return this;
    }

    /**
     * Close the webDriver instance.
     */
    protected void close() {
        assertNotNull(this.webDriver);
        this.webDriver.close();
    }

}
