
package automation.webdriver.example;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertNotNull;

import automation.webdriver.AbstractPageObject;
import automation.webdriver.AbstractWebSite;

/**
 * An Example WebSite.
 */
public class ExampleWebSite extends AbstractWebSite {

    /** The landing page. */
    protected AbstractPageObject landingPage;

    /**
     * Instantiates a new google search site.
     */
    public ExampleWebSite() {
        super();
        this.landingPage = new LandingPage();
    }

    /**
     * Constructor to instantiate site using URL.
     *
     * @param siteUrl the site url
     */
    public ExampleWebSite(final String siteUrl) {
        super();
        this.landingPage = new LandingPage();
        this.landingPage.open(siteUrl);
    }

    /**
     * Instantiates a new google search site.
     *
     * @param webDriver
     *            the web driver
     */
    public ExampleWebSite(final WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }

    /**
     * Open the web-site.
     */
    public void open() {
        this.landingPage = new LandingPage().open();
    }

    /**
     * The about us page is loaded.
     */
    public void theAboutUsPageIsLoaded() {
        Assert.assertNotNull(this.webDriver);
        final AboutPage aboutPage = PageFactory.initElements(this.webDriver, AboutPage.class);
        assertNotNull(aboutPage);
        aboutPage.verify();

    }

    /**
     * The home page contains contact us.
     */
    public void theHomePageContainsContactUs() {
        Assert.assertNotNull(this.webDriver);
        final ContactUsPage contactUsPage = PageFactory.initElements(this.webDriver, ContactUsPage.class);
        Assert.assertNotNull(contactUsPage);
        contactUsPage.verify();
    }

    /**
     * The page is loaded.
     */
    public void thePageIsLoaded() {
        this.landingPage.isLoaded();
    }

    /**
     * The home page contains.
     *
     * @param text the text
     */
    public void theHomePageContains(final String text) {
        this.landingPage.contains(text);
    }

    /**
     * Home page is valid.
     */
    public void homePageIsValid() {
        this.landingPage.verify();
    }

    /**
     * Click.
     *
     * @param text the text
     */
    public void click(final String text) {
        this.landingPage.click(text);
    }

    /**
     * Close browser.
     */
    public void closeBrowser() {
        this.landingPage.close();
    }

    /**
     * Fail.
     */
    public void fail() {
        Assert.fail("Incomplete - expected fail");
    }

}
