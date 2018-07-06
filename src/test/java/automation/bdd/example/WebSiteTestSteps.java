
package automation.bdd.example;

import automation.webdriver.example.ExampleWebSite;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * The WebSiteTestSteps.
 */
public class WebSiteTestSteps {

    ExampleWebSite site = new ExampleWebSite();

    /**
     * Open the WebSite Home page.
     */
    @Given("the web site landing page")
    public void landingPage() {
        this.site.open();
    }

    /**
     * The page by URL.
     *
     * @param siteUrl the site url
     */
    @Given("the page {string} is opened")
    public void thePageIsOpened(final String siteUrl) {
        this.site.open(siteUrl);
    }

    /**
     * The page is loaded.
     *
     */
    @When("the landing page is loaded")
    public void thePageIsLoaded() {
        this.site.thePageIsLoaded();
    }

    /**
     * The page contains {string} link.
     *
     * @param text
     *            the text
     */
    @When("the page contains {string} link")
    public void thePageContains(final String text) {
        this.site.thePageContains(text);
    }

    /**
     * Home page is valid.
     */
    @When("the page has a valid navigation bar")
    public void thePageIsValid() {
        this.site.verify();
    }

    /**
     * We click.
     *
     * @param text the text
     */
    @When("we click the {string} link")
    public void weClick(final String text) {
        this.site.click(text);
    }

    /**
     * The site is closed.
     */
    @Then("the page is closed")
    public void thePageIsClosed() {
        this.site.close();
    }

    /**
     * The browser is closed.
     */
    @Then("the browser is closed")
    public void theBrowserIsClosed() {
        this.site.quit();
    }

    /**
     * After.
     */
    @After
    private void after() {
        this.site.quit();
    }

}
