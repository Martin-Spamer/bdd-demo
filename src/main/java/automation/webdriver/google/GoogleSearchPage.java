
package automation.webdriver.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automation.webdriver.AbstractPageObject;

/**
 * The GoogleSearchPage.
 */
public final class GoogleSearchPage extends AbstractPageObject {

    /** The search box. */
    @FindBy(name = "q")
    private WebElement searchBox;

    /**
     * Instantiates a new google search page.
     */
    public GoogleSearchPage() {
        super();
    }

    /**
     * Instantiates a new google search page.
     *
     * @param webDriver
     *            the web driver
     */
    public GoogleSearchPage(final WebDriver webDriver) {
        super(webDriver);
    }

    /*
     * (non-Javadoc)
     * @see automation.webdriver.AbstractPageObject#pageUrl()
     */
    @Override
    protected String pageUrl() {
        return null;
    }

    /**
     * Query.
     *
     * @param text
     *            the text
     */
    public void query(final String text) {
        // We continue using the element just as before
        searchBox.sendKeys(text);
        searchBox.submit();
    }

}
