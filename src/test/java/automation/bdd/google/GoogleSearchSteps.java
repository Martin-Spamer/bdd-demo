
package automation.bdd.google;

import org.openqa.selenium.firefox.FirefoxDriver;

import automation.webdriver.google.GoogleSearchSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * The GoogleSearchSteps.
 */
public class GoogleSearchSteps {

    /** The google site. */
    private GoogleSearchSite googleSite;

    /**
     * The home page.
     */
    @Given("^The Google Search Page$")
    public void exampleHomePage() {
        this.googleSite = new GoogleSearchSite();
        this.googleSite.open();
    }

    /**
     * The google search page is loaded in firefox.
     */
    @Given("^The Google Search Page is loaded in Firefox$")
    public void theGoogleSearchPageIsLoadedInFirefox() {
        this.googleSite = new GoogleSearchSite(new FirefoxDriver());
        this.googleSite.open();
    }

    /**
     * The google search page is loaded in parameterised browser.
     *
     * @param browserName
     *            the browser name
     */
    @Given("^The Google Search Page is loaded in \"(.*?)\"$")
    public void theGoogleSearchPageIsLoadedIn(final String browserName) {
        this.googleSite = new GoogleSearchSite(new FirefoxDriver());
        this.googleSite.open();
    }

    /**
     * We search for the test people.
     */
    @When("^we search for Hull Digital$")
    public void weSearchForexample() {
        this.googleSite.query("Hull Digital");
    }

    /**
     * We search for.
     *
     * @param queryText
     *            the query text
     */
    @When("we search for {string}")
    public void weSearchFor(final String queryText) {
        this.googleSite.query(queryText);
    }

    /**
     * Appears in expected results.
     *
     * @param queryText
     *            the query text
     */
    @Then("We see {string} appears in the results")
    public void appearsInExpectedResults(final String queryText) {
        this.googleSite.verify(queryText);
        // in a real test suite we would close the browser!
    }

}
