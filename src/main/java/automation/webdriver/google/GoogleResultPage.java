
package automation.webdriver.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

import automation.webdriver.AbstractPageObject;

/**
 * The GoogleResultPage.
 */
public class GoogleResultPage extends AbstractPageObject {

    /** The results. */
    @FindBy(xpath = "//a[contains(.,'Hull Digital')]")
    private WebElement results;

    /**
     * Instantiates a new google result page.
     */
    public GoogleResultPage() {
        super();
    }

    /**
     * Instantiates a new google result page.
     *
     * @param webDriver
     *            the web driver
     */
    public GoogleResultPage(final WebDriver webDriver) {
        super(webDriver);
    }

    /*
     * (non-Javadoc)
     *
     * @see automation.webdriver.AbstractPageObject#pageUrl()
     */
    @Override
    protected String pageUrl() {
        return "http://www.google.co.uk";
    }

    /**
     * Verify.
     *
     * @param text
     *            the text
     */
    public void verify(final String text) {
        assertTrue("The found", this.results.isDisplayed());
        assertTrue("The found", this.results.getText().contains(text));
    }

}
