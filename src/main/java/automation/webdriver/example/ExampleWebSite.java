
package automation.webdriver.example;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertNotNull;

import automation.webdriver.AbstractPageObject;
import automation.webdriver.AbstractWebSite;

/**
 * The exampleSite.
 */
public class ExampleWebSite extends AbstractWebSite {

    /** The landing page. */
    protected AbstractPageObject page;

    /**
     * Instantiates a new google search site.
     */
    public ExampleWebSite() {
        super();
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
        this.page = new LandingPage();
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
     * Fail.
     */
    public void fail() {
        Assert.fail("Incomplete - expected fail");
    }

    public void thePageIsLoaded() {
        this.page.isLoaded();
    }

    public void theHomePageContains(final String text) {
        Assert.fail("theHomePageContains");
    }

    public void homePageIsValid() {
        Assert.fail("homePageIsValid");
    }

    public void click(final String text) {
        Assert.fail("click");
    }

    public void closeBrowser() {
        Assert.fail("closeBrowser");
    }

}
