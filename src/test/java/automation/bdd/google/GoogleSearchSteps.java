
package automation.bdd.google;

import org.openqa.selenium.WebDriver;

import automation.webdriver.WebDriverFactory;
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
     * Example home page.
     */
    @Given("^[the|a] Search Page$")
    public void exampleHomePage() {
        this.googleSite = new GoogleSearchSite();
        this.googleSite.open();
    }

    /**
     * The google search page is loaded in parameterised browser.
     *
     * @param candidateWebDriverType the candidate web driver type
     */
    @Given("the Search Page is loaded in the {string} browser")
    public void theGoogleSearchPageIsLoadedIn(final String candidateWebDriverType) {
        final WebDriver webDriver = WebDriverFactory.fromString(candidateWebDriverType).webDriver();
        this.googleSite = new GoogleSearchSite(webDriver);
        this.googleSite.open();
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
    @Then("we see {string} appears in the results")
    public void appearsInExpectedResults(final String queryText) {
        this.googleSite.verify(queryText);
        this.googleSite.quit();
    }

}
