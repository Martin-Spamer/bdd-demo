
package automation.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * An abstract base class for Page Objects.
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
        this(WebDriverFactory.defaultWebDriver());
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
        configureTimeOut();
    }

    /**
     * Configure time out.
     */
    private void configureTimeOut() {
        final int timeOutInSeconds = 1;
        final int retryInterval = 100;
        webDriverWait = new WebDriverWait(webDriver, timeOutInSeconds, retryInterval);
    }

    /**
     * Page url.
     *
     * @return the string
     */
    protected String pageUrl() {
        // look for @PageUrl
        return null;
    }

    /**
     * Open page default page.
     *
     * @return the abstract page object
     */
    public AbstractPageObject open() {
        return open(pageUrl());
    }

    /**
     * Open page by URL.
     *
     * @param pageUrl the page url
     * @return the abstract page object
     */
    public AbstractPageObject open(final String pageUrl) {
        assertNotNull("webDriver must be defined for PageObject", webDriver);
        assertNotNull("pageUrl must be defined for PageObject", pageUrl);
        webDriver.get(pageUrl);
        PageFactory.initElements(webDriver, this);
        return this;
    }

    /**
     * Checks if this page has loaded.
     */
    public void isLoaded() {
        assertNotNull(webDriver.getCurrentUrl());
        assertNotNull(webDriver.getTitle());
    }

    /**
     * Gets the current url.
     *
     * @return the current url
     * @see org.openqa.selenium.WebDriver#getCurrentUrl()
     */
    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    /**
     * Gets the the page title.
     *
     * @return the title
     * @see org.openqa.selenium.WebDriver#getTitle()
     */
    public String getTitle() {
        return webDriver.getTitle();
    }

    /**
     * Verify the page.
     *
     * @return the abstract page object
     */
    public AbstractPageObject verify() {
        PageFactory.initElements(webDriver, this);
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
     * Click.
     *
     * @param text the text
     */
    public void click(final String text) {
        webDriver.findElement(By.linkText(text));
    }

    /**
     * Contains.
     *
     * @param text the text
     */
    public void contains(final String text) {
        assertNotNull(text);
        assertTrue(webDriver.getPageSource().contains(text));
    }

    /**
     * Close the webDriver instance.
     */
    public void close() {
        assertNotNull(webDriver);
        webDriver.close();
        webDriver = null;
    }

    /**
     * Quit.
     */
    public void quit() {
        assertNotNull(webDriver);
        webDriver.quit();
        webDriver = null;
    }

}
