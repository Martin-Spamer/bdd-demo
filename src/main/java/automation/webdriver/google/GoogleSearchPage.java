
package automation.webdriver.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automation.webdriver.AbstractPageObject;

/**
 * The GoogleSearchPage.
 */
public class GoogleSearchPage extends AbstractPageObject {

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
        this.searchBox.sendKeys(text);
        this.searchBox.submit();
    }

}
