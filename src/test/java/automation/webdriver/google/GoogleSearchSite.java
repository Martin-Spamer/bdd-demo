
package automation.webdriver.google;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import automation.webdriver.AbstractWebSite;

/**
 * The GoogleSearchSite class.
 */
public class GoogleSearchSite extends AbstractWebSite {

    /** The google search page. */
    private GoogleSearchPage googleSearchPage;

    /**
     * Instantiates a new google search site.
     */
    public GoogleSearchSite() {
        super();
    }

    /**
     * Instantiates a new google search site.
     *
     * @param webDriver
     *            the web driver
     */
    public GoogleSearchSite(final WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }

    /**
     * Open.
     */
    public void open() {
        Assert.assertNotNull(this.webDriver);

        // Navigate to the right place
        this.webDriver.get("http://www.google.com/");

        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        this.googleSearchPage = PageFactory.initElements(this.webDriver, GoogleSearchPage.class);

        Assert.assertNotNull(this.googleSearchPage);
    }

    /**
     * Verify.
     *
     * @param text
     *            the text
     */
    public void verify(final String text) {
        Assert.assertNotNull(this.webDriver);

        final GoogleResultPage googleResultPage = PageFactory.initElements(this.webDriver, GoogleResultPage.class);

        googleResultPage.verify(text);

        Assert.assertNotNull(googleResultPage);
    }

    /**
     * Query.
     *
     * @param text
     *            the text
     */
    public void query(final String text) {
        Assert.assertNotNull(this.webDriver);
        this.googleSearchPage.query(text);
    }

}
