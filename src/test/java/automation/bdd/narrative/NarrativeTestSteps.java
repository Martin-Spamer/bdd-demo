
package automation.bdd.narrative;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * The Narrative Test Steps.
 */
public class NarrativeTestSteps {

    /**
     * An initial context.
     */
    @Given("^an initial context$")
    public void anInitialContext() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("Initial Context", true);
    }

    /**
     * An event occurs.
     */
    @When("^an event occurs$")
    public void anEventOccurs() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("the event occurs", true);
    }

    /**
     * Expected outcome is confirmed.
     */
    @Then("^expected outcome is confirmed$")
    public void expectedOutcomeIsConfirmed() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("expected outcome confirmed", true);
    }

    /**
     * Expected outcome is not confirmed.
     */
    @Then("^expected outcome is not confirmed$")
    public void expectedOutcomeIsNotConfirmed() {
        // Write code here that turns the phrase above into concrete actions
        Assert.fail("expected outcome is not confirmed");
    }

    /**
     * Expected outcome is a bug.
     */
    @SuppressWarnings("null")
    @Then("^expected outcome is a bug$")
    public void expectedOutcomeIsABug() {
        final String isNull = null;
        isNull.toString();
    }

}
