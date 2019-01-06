
package automation.webdriver.example;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for Landing Page.
 */
public final class LandingPage extends Navigation {

    private static final String PAGE_URL = "http://127.0.0.1:8080/example/index.html";

    /**
     * Instantiates a new home page object.
     */
    public LandingPage() {
        super();
    }

    /**
     * Instantiates a new home page object.
     *
     * @param webDriver the web driver
     */
    public LandingPage(final WebDriver webDriver) {
        super(webDriver);
    }

    /*
     * (non-Javadoc)
     * @see automation.webdriver.AbstractPageObject#pageUrl()
     */
    @Override
    protected String pageUrl() {
        return PAGE_URL;
    }

    /**
     * The page contains.
     *
     * @param text the text
     */
    public void thePageContains(final String text) {
        final String pageSource = this.webDriver.getPageSource();
        Assert.assertTrue(pageSource.contains(text));
    }

    /**
     * Navigate to about.
     */
    public void navigateToAbout() {
        this.aboutUs.click();
    }

    /**
     * Navigate to industies.
     */
    public void navigateToIndusties() {
        this.industries.click();
    }

    /**
     * Navigate to services.
     */
    public void navigateToServices() {
        this.services.click();
    }

    /**
     * Navigate to our clients.
     */
    public void navigateToOurClients() {
        this.clients.click();
    }

    /**
     * Navigate to contact us.
     */
    public void navigateToContactUs() {
        this.contactUs.click();
    }

    /**
     * Navigate to.
     *
     * @param text the text
     */
    public void navigateTo(final String text) {
        click(text);
    }

}
