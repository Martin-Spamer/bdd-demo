
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

    /** The site. */
    ExampleWebSite exampleSite = new ExampleWebSite();

    /**
     * The home page.
     *
     */
    @Given("^the website landing page$")
    public void exampleHomePage() {
        this.exampleSite.open();
    }

    /**
     * The home page.
     *
     * @param siteUrl
     *            the site url
     */
    @Given("^the page \"(.*?)\"$")
    public void theHomePage(final String siteUrl) {
        this.exampleSite.open(siteUrl);
    }

    /**
     * The page is loaded.
     *
     */
    @When("^the landing page is loaded$")
    public void thePageIsLoaded() {
        this.exampleSite.thePageIsLoaded();
    }

    /**
     * The page contains.
     *
     * @param text
     *            the text
     */
    @When("^the page contains \"(.*?)\"$")
    public void thePageContains(final String text) {
        this.exampleSite.theHomePageContains(text);
    }

    /**
     * Home page is valid.
     */
    @When("^the page has a valid navigation bar$")
    public void homePageIsValid() {
        this.exampleSite.homePageIsValid();
    }

    /**
     * We click.
     *
     * @param text the text
     */
    @When("^we click \"(.*?)\"$")
    public void weClick(final String text) {
        this.exampleSite.click(text);
    }

    /**
     * The about us page is loaded.
     */
    @Then("^the About Us page is loaded\\.$")
    public void theAboutUsPageIsLoaded() {
        this.exampleSite.theAboutUsPageIsLoaded();
    }

    /**
     * The page is closed.
     */
    @Then("^the page is closed$")
    public void thePageIsClosed() {
        this.exampleSite.closeBrowser();
    }

    /**
     * After.
     */
    @After
    private void after() {
        this.exampleSite.closeBrowser();
    }

}
