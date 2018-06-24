
package automation.webdriver.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Landing Page Object.
 */
public class LandingPage extends Navigation {

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
     *
     * @see automation.webdriver.AbstractPageObject#pageUrl()
     */
    @Override
    protected String pageUrl() {
        return "http://127.0.0.1:8080/";
    }

    /**
     * The page contains.
     *
     * @param text
     *            the text
     */
    public void thePageContains(final String text) {
        final String pageSource = this.webDriver.getPageSource();
        Assert.assertTrue(pageSource.contains(text));
    }

    /**
     * Click.
     *
     * @param text is the text to be clicked
     */
    public void click(final String text) {
        final String xPath = String.format("//a[contains(text(),'%s')]", text);
        final WebElement webElement = this.webDriver.findElement(By.xpath(xPath));
        Assert.assertNotNull(webElement);
        webElement.click();
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
     * @param text
     *            the text
     */
    public void navigateTo(final String text) {
        click(text);
    }

}
