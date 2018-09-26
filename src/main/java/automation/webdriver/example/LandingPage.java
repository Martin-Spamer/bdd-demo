
package automation.webdriver.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
     * @param text
     *            the text
     */
    public void thePageContains(final String text) {
        final String pageSource = webDriver.getPageSource();
        Assert.assertTrue(pageSource.contains(text));
    }

    /**
     * Click.
     *
     * @param text is the text to be clicked
     */
    @Override
    public void click(final String text) {
        final String xPath = String.format("//a[contains(text(),'%s')]", text);
        final WebElement webElement = webDriver.findElement(By.xpath(xPath));
        Assert.assertNotNull(webElement);
        webElement.click();
    }

    /**
     * Navigate to about.
     */
    public void navigateToAbout() {
        aboutUs.click();
    }

    /**
     * Navigate to industies.
     */
    public void navigateToIndusties() {
        industries.click();
    }

    /**
     * Navigate to services.
     */
    public void navigateToServices() {
        services.click();
    }

    /**
     * Navigate to our clients.
     */
    public void navigateToOurClients() {
        clients.click();
    }

    /**
     * Navigate to contact us.
     */
    public void navigateToContactUs() {
        contactUs.click();
    }

    /**
     * Navigate to.
     *
     * @param text
     *            the text
     */
    public void navigateTo(final String text) {
        click(text);
    }

}
