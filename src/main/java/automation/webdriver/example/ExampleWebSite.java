
package automation.webdriver.example;

import automation.webdriver.AbstractPageObject;
import automation.webdriver.AbstractWebSite;

/**
 * An Example WebSite.
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
     * Open the web-site.
     */
    public void open() {
        this.page = new LandingPage(this.webDriver);
        this.page.open();
    }

    // /**
    // * The about us page is loaded.
    // */
    // public void theAboutUsPageIsLoaded() {
    // Assert.assertNotNull(this.webDriver);
    // final AboutPage aboutPage = PageFactory.initElements(this.webDriver,
    // AboutPage.class);
    // assertNotNull(aboutPage);
    // aboutPage.verify();
    // }
    //
    // /**
    // * The home page contains contact us.
    // */
    // public void theHomePageContainsContactUs() {
    // Assert.assertNotNull(this.webDriver);
    // final ContactUsPage contactUsPage =
    // PageFactory.initElements(this.webDriver, ContactUsPage.class);
    // Assert.assertNotNull(contactUsPage);
    // contactUsPage.verify();
    // }
    //
    // /**
    // * The page is loaded.
    // */
    // public void thePageIsLoaded() {
    // this.page.isLoaded();
    // }
    //
    // /**
    // * The home page contains.
    // *
    // * @param text the text
    // */
    // public void theHomePageContains(final String text) {
    // this.page.contains(text);
    // }
    //
    // /**
    // * Home page is valid.
    // */
    // public void homePageIsValid() {
    // this.page.verify();
    // }
    //
    // /**
    // * Click.
    // *
    // * @param text the text
    // */
    // public void click(final String text) {
    // this.page.click(text);
    // }
    //
    // /**
    // * Close browser.
    // */
    // public void closeBrowser() {
    // this.page.close();
    // }
    //
    // /**
    // * Fail.
    // */
    // public void fail() {
    // Assert.fail("Incomplete - expected fail");
    // }
    //
}
