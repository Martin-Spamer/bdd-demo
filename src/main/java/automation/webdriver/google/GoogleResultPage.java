
package automation.webdriver.google;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automation.webdriver.AbstractPageObject;

/**
 * The GoogleResultPage.
 */
public class GoogleResultPage extends AbstractPageObject {

    @FindBy(xpath = "//a[contains(.,'Example')]")
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
        Assert.assertTrue("The found", this.results.isDisplayed());
        Assert.assertTrue("The found", this.results.getText().contains(text));
    }

}
